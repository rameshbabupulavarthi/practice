package com.java.designpattern.behavioral.command;

//invoker
public class Switch {

	public void storeAndExecute(Command command) {
		command.execute();
	}
}
