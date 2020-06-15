package com.mars.telecom.test;



import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mars.telecom.controller.PersonController;
import com.mars.telecom.entity.Person;
import com.mars.telecom.model.Response;
import com.mars.telecom.service.PersonService;
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class MarsTelecomCodingAssignmentTestApplicationTests {

	@Test
	void contextLoads() {
	}
	
	ObjectMapper objectMapper = new ObjectMapper();
	
	public MockMvc mockMvc;
	@Autowired
	public WebApplicationContext webApplicationContext;
	@Autowired
	private PersonController personController;
	@Before
	public void setUp() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(personController).build();
				//MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void createNewPersonTest() throws Exception {
		Person person = new Person();
		person.setFirstName("Stive");
		person.setLastName("Jobs");
		String jsonRequest = objectMapper.writeValueAsString(person);
		MvcResult result = mockMvc.perform(post("/api/createNewPerson").content(jsonRequest)
				.contentType(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isOk()).andReturn();
		String resultContent = result.getResponse().getContentAsString();
		Response response = objectMapper.readValue(resultContent, Response.class);
		Assert.assertTrue(response.isStatus() == Boolean.TRUE);
	}
	
	@MockBean 
	private PersonService personServiceMock;
	
	

}
