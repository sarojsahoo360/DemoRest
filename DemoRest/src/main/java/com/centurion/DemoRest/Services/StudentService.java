package com.centurion.DemoRest.Services;

import org.springframework.stereotype.Service;

import com.centurion.DemoRest.Dao.StudentDao;
import com.centurion.DemoRest.Entity.Student;

@Service
public class StudentService {
	public Student getStudentName(int id)
	{
		Student ob=new StudentDao().getStudentById(id);
		return ob;
	}

}
