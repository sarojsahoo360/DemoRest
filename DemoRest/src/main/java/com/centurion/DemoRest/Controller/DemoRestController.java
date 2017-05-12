package com.centurion.DemoRest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.centurion.DemoRest.Entity.Student;
import com.centurion.DemoRest.Services.StudentService;

@RestController
@RequestMapping("studentName")
public class DemoRestController {

	@Autowired
	StudentService ss;

	@RequestMapping(value="{id}")
	public Student studentName(@PathVariable int id) {

		return ss.getStudentName(id);
	}

}
