package kr.green.boot.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import kr.green.boot.config.AppConfig;
import kr.green.boot.service.FileService;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
										   // = new AnnotationConfigApplicationContext(AppConfig.class);
		
		FileService fileService = context.getBean("fileService",FileService.class);
		fileService.readValues();
		// System.out.println(fileService);
		
		DriverManagerDataSource dataSource1 = context.getBean("dataSource1", DriverManagerDataSource.class);
		DriverManagerDataSource dataSource2 = context.getBean("dataSource2", DriverManagerDataSource.class);
		
		System.out.println(dataSource1);
		System.out.println(dataSource2);
		context.close();
	}
}
