package com.dadjoke.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class HelloCommand {

	@ShellMethod(key = "hello", value = "I will say hello")
	public String hello(@ShellOption(defaultValue = "world") String arg) {
		return "hello " +arg+",";
	}
}
