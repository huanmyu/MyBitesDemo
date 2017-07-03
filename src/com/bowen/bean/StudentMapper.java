package com.bowen.bean;

import java.util.List;

//访问数据库表的接口
public interface StudentMapper {
	//通过ID查找对象
	public Student selectById(int id);
	//查找所有的对象信息
	public List<Student> selectAll();
	//通过姓名查找对象
	public List<Student> selectByName(String name);
	//插入对象
	public void insertStudent(Student student);
	//删除对象
	public void deleteStudent(int id);
	//修改对象
	public void updateStudent(Student student);
	

}
