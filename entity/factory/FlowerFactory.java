package by.module5.task5.entity.factory;

import by.module5.task5.entity.BouquetElement;
import by.module5.task5.entity.BouquetElementType;
import by.module5.task5.entity.flower.Daffodil;
import by.module5.task5.entity.flower.Flower;
import by.module5.task5.entity.flower.FlowerType;
import by.module5.task5.entity.flower.Orchid;
import by.module5.task5.entity.flower.Rose;
import by.module5.task5.entity.flower.Tulip;
import by.module5.task5.entity.flower.Violet;

public class FlowerFactory extends ElementFactory {

	@Override
	public BouquetElement getElement(BouquetElementType type, double price, String comment) {
		if (!(type instanceof FlowerType)) {
			return null;
		}
		switch ((FlowerType)type) {
		case TULIP:
			return new Tulip(price, comment);
		case ROSE:
			return new Rose(price, comment);
		case ORCHID:
			return new Orchid(price, comment);
		case DAFFODIL:
			return new Daffodil(price, comment);
		case VIOLET:
			return new Violet(price, comment);
		}
		return null;
	}
	
	public BouquetElement getElement(BouquetElementType type, double price) {
		return getElement(type, price, new String());
	}

}
