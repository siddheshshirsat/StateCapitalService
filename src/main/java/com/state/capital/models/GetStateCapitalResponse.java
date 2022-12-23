package com.state.capital.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetStateCapitalResponse {
	private String state;
	private String capital;
}
