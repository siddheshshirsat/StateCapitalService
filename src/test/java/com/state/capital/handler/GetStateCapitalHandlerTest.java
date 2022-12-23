package com.state.capital.handler;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class GetStateCapitalHandlerTest {
	@InjectMocks
	private GetStateCapitalHandler getStateCapitalHandler;

	@Test
	public void testHandleGetStateCapital(){
		// Arrange
		String state = "Washington";

		// Act
		String result = getStateCapitalHandler.handleGetStateCapital(state);
		
		// Assert
		Assert.assertEquals("Olympia1", result);
	}
}
