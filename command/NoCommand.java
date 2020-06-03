package by.module5.task5.command;

import by.module5.task5.entity.BouquetElement;
import by.module5.task5.entity.Bouquet;

public class NoCommand implements ICommand {
	
	
	@Override
	public void execute() {
		System.out.println("No command");
	}

}
