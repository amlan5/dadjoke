package com.dadjoke.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import com.dadjoke.client.DadjokeClient;
import com.dadjoke.model.DadjokeResponse;

@ShellComponent
public class DadjokeCommands {
	
	private final DadjokeClient dadjokeClient;
	

	public DadjokeCommands(DadjokeClient dadjokeClient) {
		this.dadjokeClient = dadjokeClient;
	}


	@ShellMethod(key = "random", value = "I will generate a dadjoke")
	public String getRandomDadjoke(@ShellOption(defaultValue = "world") String arg) {
		DadjokeResponse resp = dadjokeClient.random();
		return resp.joke();
	}
}
