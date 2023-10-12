package com.example.demo;

import com.example.demo.dao.StaffDAO;
import com.example.demo.dao.StaffDAOImpl;
import com.example.demo.entity.Staff;
import org.hibernate.engine.spi.SessionDelegatorBaseImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClassApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassApplication.class, args);
	}
    @Bean
	public CommandLineRunner CommandLineRunner (StaffDAO staffDAO){
		return runner -> {
			createStaff( staffDAO);
		};
	}
	private void createStaff(StaffDAO staffDAO){
		Staff tempStaff=new Staff("saurabh ","kamane","kamane@gmail.com","2023-1-23",100);
		staffDAO.save(tempStaff);
		System.out.println("user is created");
		int theid=tempStaff.getId();
		System.out.println("the student is ="+staffDAO.findById(theid));

	}
}
