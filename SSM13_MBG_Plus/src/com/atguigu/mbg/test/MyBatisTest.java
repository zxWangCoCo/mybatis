package com.atguigu.mbg.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import com.atguigu.mbg.entities.Employee;
import com.atguigu.mbg.entities.EmployeeExample;
import com.atguigu.mbg.entities.EmployeeExample.Criteria;
import com.atguigu.mbg.mapper.EmployeeMapper;

class MyBatisTest {

	// 创建SqlSessionFactory的方法
	public SqlSessionFactory getSqlSessionFactory() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}


	// 测试MBG中的方法
	@Test
	void testGetEmployee() throws IOException {
		// 1.获取SqlSessionFactory对象
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		// 2.获取SqlSession，相当于JDBC中的Connection
		SqlSession session = sqlSessionFactory.openSession();
		try {
//			// 3.获取Mapper对象
			EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
//			// 4.调用employeeMapper中获取一个对象的方法
			//需求：获取lastName中包含y字母并且工资大于等于10000元或者邮箱中包含dxj字母的所有员工
			EmployeeExample example = new EmployeeExample();
			//获取lastName中包含y字母并且工资大于等于10000元
			Criteria criteria = example.createCriteria();
			criteria.andLastNameLike("%y%").andSalaryGreaterThanOrEqualTo(10000.00);
			//邮箱中包含dxj字母的
			Criteria criteria2 = example.createCriteria();
			criteria2.andEmailLike("%dxj%");
			example.or(criteria2);
			//获取满足条件的员工
			List<Employee> selectByExample = mapper.selectByExample(example);
			for (Employee employee : selectByExample) {
				System.out.println(employee);
			}
		} finally {
			// 5.关闭sqlSession
			session.close();
		}
	}

}
