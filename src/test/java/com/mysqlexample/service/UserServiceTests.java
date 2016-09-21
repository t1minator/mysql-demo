package com.mysqlexample.service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import com.mysqlexample.entity.User;
import com.mysqlexample.repository.UserRepository;

public class UserServiceTests {

	@InjectMocks
	UserService userService;
	@Mock
	UserRepository userRepository;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		when(userRepository.save(any(User.class)))
        .thenReturn(new User());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void updateUserTest() {

		String result = userService.createUser("test@test.com", "name");
		assertTrue(result != null);
		
	}

}
