package com.cloudtogo.devops;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestExecutionListeners(listeners = {DependencyInjectionTestExecutionListener.class})
public class ControllerTest {
	
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext wac;
	
	@Before
	public void before() {
		mockMvc=MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void test() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/hello/test")).andExpect(MockMvcResultMatchers.status().isOk());
	}

}
