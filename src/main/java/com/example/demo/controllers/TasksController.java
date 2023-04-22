package com.example.demo.controllers;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Task;

@RestController
@RequestMapping("/tasks")
public class TasksController {
	
	
	ArrayList<Task> list;

	
	public TasksController()
	{
		list=new ArrayList();
		this.list.add(new Task("title 1",new Date(),false));
		this.list.add(new Task("title 2",new Date(),true));
	}
	
	
	@GetMapping("")
	public ArrayList<Task> getAllTasks()
	{
		return list;
	}
	
	@GetMapping("/{id}")
	public Task getTaskbyid(@PathVariable("id") Integer id)
	{
		return this.list.get(id);
	}
	
	@GetMapping("/hello")
	
    public String tasks2()
    {
    	return "<h1>hello World</h1>";
    }
}

