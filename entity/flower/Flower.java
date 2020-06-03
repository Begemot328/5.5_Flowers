package by.module5.task5.entity.flower;

import by.module5.task5.entity.BouquetElement;

public abstract class Flower implements BouquetElement {
	public static final String FLOWER = "Flower";
	private double price;
	private String comment;
	
	public Flower(double price) {
		this.price = price;
		if (price < 0) {
			this.price = 0;
		}
	}
	
	public Flower(double price, String ccomment) {
		this.price = price;
		this.comment = ccomment;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String toString() {
		String result;
		result = FLOWER + " " + " " + getPrice();
		return result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Flower other = (Flower) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	
}
