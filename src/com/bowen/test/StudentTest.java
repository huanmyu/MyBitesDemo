package com.bowen.test;
import java.util.Date;
import java.util.List;

import com.bowen.bean.Student;
import com.bowen.dao.StudentDao;

public class StudentTest {

	public static void main(String[] args) {
		StudentDao dao=new StudentDao();
		Student s1=dao.selectById(2);
		System.out.println("查询到的对象的信息是："+s1);
		System.out.println("-----------------------------------------------------------------");
		List<Student> list=dao.selectAll();
		System.out.println("查询到的所有对象信息");
		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println("-----------------------------------------------------------------");
		List<Student> names=dao.selectByName("aa");
		System.out.println("通过名称查询到的用户信息：");
		for (Student student : names) {
			System.out.println(student);
			
		}
		System.out.println("-----------------------------------------------------------------");
		Student s=new Student(12,"ff",new Date(),86);
		dao.insertStudent(s);
		System.out.println("-----------------------------------------------------------------");
		dao.deleteStudent(s1.getId());
		System.out.println("-----------------------------------------------------------------");
		s1.setName("bb1");
		s1.setBirthday(new Date());
		s1.setScore(85);
		dao.updateStudent(s1);

	}

}
