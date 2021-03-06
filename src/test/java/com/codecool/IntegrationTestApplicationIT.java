package com.codecool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
public class IntegrationTestApplicationIT {

	@Autowired
	private Controller controller;

	@Test
	public void testHello(){
		assertEquals(controller.hello(), "hello");
	}
}
