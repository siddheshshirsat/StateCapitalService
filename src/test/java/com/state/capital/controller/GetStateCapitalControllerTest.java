package com.state.capital.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.state.capital.handler.GetStateCapitalHandler;
import com.state.capital.models.GetStateCapitalRequest;
import com.state.capital.models.GetStateCapitalResponse;

@RunWith(SpringJUnit4ClassRunner.class)
public class GetStateCapitalControllerTest {
	@Mock
	private GetStateCapitalHandler getStateCapitalHandler;

	@InjectMocks
	private GetStateCapitalController getStateCapitalController;

	@Test
	public void testGetStateCapital(){
		// Arrange
		Mockito.when(getStateCapitalHandler.handleGetStateCapital(Mockito.anyString())).thenReturn("testCapital");
		String state = "testState";
		GetStateCapitalRequest request = new GetStateCapitalRequest(state);

		// Act
		GetStateCapitalResponse result = getStateCapitalController.getStateCapital(request);
		
		// Assert
		Assert.assertEquals(new GetStateCapitalResponse(state, "testCapital"), result);
		Mockito.verify(getStateCapitalHandler, Mockito.times(1)).handleGetStateCapital(state);
	}
}

