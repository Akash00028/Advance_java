package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		System.out.println("my first project.....");
	}
	@GetMapping("s1")
	public Student test1()
	{
		Student s1 = new Student();
		s1.setFirstName("akash");
		s1.setLastName("gupta");
		String email[] = {"abc@gmail.com", "bcd@gmail.com"};
		s1.setEmailIds(email);
		long mobile[] = {7667805295l, 7667805295l};
		s1.setMobileNo(mobile);
		s1.setAddress(test2());
		return s1;
	}
	@GetMapping("s2")
	public Address test2()
	{
		Address a1 = new Address();
		a1.setStateName("chandni chowk");
		a1.setHouseNo(29);
		a1.setCityName("Sheikhpura");
		a1.setStateName("Bihar");
		a1.setPinCode(81105);
		return a1;
	}
}
