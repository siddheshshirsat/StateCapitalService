package com.state.capital.handler;

import org.springframework.stereotype.Component;

@Component
public class GetStateCapitalHandler {
	public String handleGetStateCapital(String state) {
		return "Olympia";
	}
}
