package by.module5.task5.entity.factory;

import by.module5.task5.entity.BouquetElement;
import by.module5.task5.entity.BouquetElementType;

public abstract class ElementFactory {
	public abstract BouquetElement getElement(BouquetElementType type,double price, String comment); 
	public abstract BouquetElement getElement(BouquetElementType type,double price); 
}
