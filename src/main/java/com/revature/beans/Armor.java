package com.revature.beans;

public class Armor {
	private int durability;
	private int weight;
	private String material;

	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + durability;
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + weight;
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
		Armor other = (Armor) obj;
		if (durability != other.durability)
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Armor [durability=" + durability + ", weight=" + weight + ", material=" + material + "]";
	}

	public Armor(int durability, int weight, String material) {
		super();
		this.durability = durability;
		this.weight = weight;
		this.material = material;
		System.out.println("Armor constructed using fields");
	}

	public Armor() {
		super();
		System.out.println("Armor constructed using super");
	}

}
