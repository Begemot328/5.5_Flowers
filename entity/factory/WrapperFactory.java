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
import by.module5.task5.entity.wrapper.Film;
import by.module5.task5.entity.wrapper.Net;
import by.module5.task5.entity.wrapper.Paper;
import by.module5.task5.entity.wrapper.Ribbon;
import by.module5.task5.entity.wrapper.WrapperType;

public class WrapperFactory extends ElementFactory {

	@Override
	public BouquetElement getElement(BouquetElementType type, double price, String comment) {
		if (!(type instanceof WrapperType)) {
			return null;
		}
		switch ((WrapperType)type) {
		case FILM:
			return new Film(price, comment);
		case NET:
			return new Net(price, comment);
		case RIBBON:
			return new Ribbon(price, comment);
		case PAPER:
			return new Paper(price, comment);
		}
		return null;
	}
	
	public BouquetElement getElement(BouquetElementType type, double price) {
		return getElement(type, price, new String());
	}

}
