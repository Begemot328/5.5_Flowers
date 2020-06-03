package by.module5.task5.entity;

import java.util.ArrayList;

public class Bouquet {
	public static final String BOQUET = "Bouquet:"; 
	public static final String TOTAL_PRICE = "Total price= "; 
	public static final String INDENTION = "\n"; 
	private ArrayList<BouquetElement> list;
	
	public Bouquet() {
		list = new ArrayList<>();
	}
	
	public void add(BouquetElement element) {
		if(element != null) {
			list.add(element);
		}
	}

	public void remove(BouquetElement element) {
		if(element != null && list.contains(element)) {
			list.remove(element);
		}
	}
	
	public double getPrice() {
		double price = 0;
		for (BouquetElement e: list) {
			price += e.getPrice();
		}
		return price;
	}

	@Override
	public String toString() {
		String result = BOQUET;
		for (BouquetElement e: list) {
			result += INDENTION + e;
		}
		result += INDENTION + TOTAL_PRICE + getPrice();
		return result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bouquet other = (Bouquet) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		return true;
	}
}
