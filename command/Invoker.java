package by.module5.task5.command;

import java.util.ArrayList;

public class Invoker {
	private ICommand command;
	private ArrayList<ICommand> list;
	
	public Invoker() {
		list = new ArrayList<>();
	}
	public void setCommand(ICommand command) {
		list.add(command);
	}
	
	public void run() {
		for (ICommand command: list) {
			command.execute();
		}
		list.clear();
	}
	
}
