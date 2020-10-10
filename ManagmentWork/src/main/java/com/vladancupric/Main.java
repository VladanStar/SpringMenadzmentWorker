package com.vladancupric;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
		Firma firma = (Firma)context.getBean("firma");
		firma.napraviPlan();
		firma.sprovediPlan();
		((FileSystemXmlApplicationContext)context).close();

	}

}
