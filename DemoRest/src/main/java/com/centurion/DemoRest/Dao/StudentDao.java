package com.centurion.DemoRest.Dao;

import com.centurion.DemoRest.Entity.Student;

public class StudentDao {
	public Student getStudentById(int id)
	{
		Student obj=new Student();
		obj.setId(id);
		obj.setName("Saroj");
		return obj;
	}

}
