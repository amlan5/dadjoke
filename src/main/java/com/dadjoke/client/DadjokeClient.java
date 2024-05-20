package com.dadjoke.client;

import org.springframework.web.service.annotation.GetExchange;

import com.dadjoke.model.DadjokeResponse;

public interface DadjokeClient {

	@GetExchange("/")
	DadjokeResponse random();
}
