package by.module5.task5.command;

import by.module5.task5.entity.BouquetElement;
import by.module5.task5.entity.Bouquet;

public class AddElementCommand implements ICommand {
	private Bouquet boquet;
	private BouquetElement element;
	
	public AddElementCommand(Bouquet boquet, BouquetElement element) {
		this.boquet = boquet;
		this.element = element;
	}
	
	@Override
	public void execute() {
		boquet.add(element);
	}

}
