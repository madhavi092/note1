package com.note.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {



    @GetMapping
    public List<Employee> getAllEmployees(){
    	
    	ArrayList<Employee> list= new ArrayList<Employee>();
    	Employee e1= new Employee();
    	e1.setId(1);
    	e1.setFirstName("Naga");
    	e1.setLastName("ven");
    	e1.setEmailId("vara@gmail.com");
    	list.add(e1);
    	
    	
        return list;
    }

    
}
