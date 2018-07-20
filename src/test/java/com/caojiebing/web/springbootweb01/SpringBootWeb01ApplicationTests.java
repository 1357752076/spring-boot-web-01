package com.caojiebing.web.springbootweb01;

import com.fasterxml.jackson.annotation.JacksonInject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootWeb01ApplicationTests {


	@Autowired
	ApplicationArguments applicationArguments;


	@Test
	public void contextLoads() {

		System.out.println(applicationArguments.getOptionNames());
	}

}
