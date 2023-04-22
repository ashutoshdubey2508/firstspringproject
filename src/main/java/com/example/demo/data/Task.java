package com.example.demo.data;

import java.util.Date;

public class Task {
   String title;
   Date duedate;
   Boolean completed;
   
   public Task(String title,Date duedate,Boolean completed)
   {
	   this.title=title;
	   this.duedate=duedate;
	   this.completed = completed;
   }
   
   public String getTitle()
   {
	   return title;
   }
   
   public Date getDueDate()
   {
	   return duedate;
   }
   
   public Boolean getCompleted()
   {
	   return completed;
   }
   
   public void setTitle(String title)
   {
	   this.title=title;
   }
   
   public void setDueDate(Date duedate)
   {
	   this.duedate=duedate;
   }
   
   public void setCompleted(Boolean Completed)
   {
	   this.completed = completed;
   }
}
