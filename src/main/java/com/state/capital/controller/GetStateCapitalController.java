package com.state.capital.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.state.capital.handler.GetStateCapitalHandler;
import com.state.capital.models.GetStateCapitalRequest;
import com.state.capital.models.GetStateCapitalResponse;

@RestController
public class GetStateCapitalController {
	@Inject
	private GetStateCapitalHandler getStateCapitalHandler;

	@RequestMapping("/getStateCapital")
	public @ResponseBody GetStateCapitalResponse getStateCapital(@RequestBody GetStateCapitalRequest getStateCapitalRequest) {
		String state = getStateCapitalRequest.getState();
		String capital = getStateCapitalHandler.handleGetStateCapital(state);
		return new GetStateCapitalResponse(state, capital);
	}
}
