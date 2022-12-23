package com.state.capital.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetStateCapitalRequest {
	private String state;
}
