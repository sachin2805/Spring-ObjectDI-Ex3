package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		try{
			ApplicationContext c= 
					new ClassPathXmlApplicationContext("parentBean.xml");
			Employee emp=(Employee) c.getBean("e1");
			emp.display();
		
			Employee emp2=(Employee) c.getBean("e3");
			emp2.display();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}

/*OUTPUT :
Name : Dev Powar
Designation : Trainer
Joining Date : 28/5/2021
Salary : 80000.0
Name : Aksa
Designation : Teacher
Joining Date : 28/5/2021
Salary : 50000.0
*/