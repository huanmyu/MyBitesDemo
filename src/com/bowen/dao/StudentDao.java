package com.bowen.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.bowen.bean.Student;
import com.bowen.bean.StudentMapper;
import com.bowen.util.SessionFactory;

public class StudentDao implements StudentMapper {
	//获取sessionFactory对象
	private SqlSessionFactory sessionFactory=SessionFactory.getInstance().getSqlSessionFactory();

	@Override
	public Student selectById(int id) {
		Student s=new Student();
		//获取sqlSession
		SqlSession session=sessionFactory.openSession();
	    s=session.selectOne("com.bowen.bean.StudentMapper.selectById", id);
	  //关闭session
	    session.close();
		return  s;
		
		
	}

	@Override
	public List<Student> selectAll() {
		List<Student> list=new ArrayList<Student>();
		//获取sqlSession
		SqlSession session=sessionFactory.openSession();
		list=session.selectList("com.bowen.bean.StudentMapper.selectAll");
		//关闭资源
		session.close();
		return  list;
	}

	@Override
	public List<Student> selectByName(String name) {
		List<Student> list=new ArrayList<Student>();
		Student s=new Student();
		//获取sqlSession
	    SqlSession session=sessionFactory.openSession();
	    list=session.selectList("com.bowen.bean.StudentMapper.selectByName", "%"+name+"%");
	    //关闭资源
	    session.close();
		return list;
	}

	@Override
	public void insertStudent(Student student) {
		//获取sqlSession
	    SqlSession session=sessionFactory.openSession();
	    session.insert("com.bowen.bean.StudentMapper.insertStudent", student);
	    //提交
	    session.commit();
	    //关闭session
	    session.close();
	}

	@Override
	public void deleteStudent(int id) {
		//获取sqlSession
	    SqlSession session=sessionFactory.openSession();
	    session.delete("com.bowen.bean.StudentMapper.deleteStudent",id);
	    //提交
	    session.commit();
	    //关闭session
	    session.close();
	    
	}

	@Override
	public void updateStudent(Student student) {
		//获取sqlSession
	    SqlSession session=sessionFactory.openSession();
	    session.delete("com.bowen.bean.StudentMapper.updateStudent",student);
	    //提交
	    session.commit();
	    //关闭session
	    session.close();
	    
	}

}
