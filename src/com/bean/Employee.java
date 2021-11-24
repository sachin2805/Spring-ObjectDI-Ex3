package com.bean;


public class Employee {

		private String name, designation;
		private Date joiningDate;
		private float salary;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public Date getJoiningDate() {
			return joiningDate;
		}
		public void setJoiningDate(Date joiningDate) {
			this.joiningDate = joiningDate;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		
		public void display()
		{
			System.out.println("Name : "+getName()+"\nDesignation : "+getDesignation()+"\nJoining Date : "+getJoiningDate()+"\nSalary : "+getSalary());
		}
		
}
