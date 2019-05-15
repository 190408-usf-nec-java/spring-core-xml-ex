package com.revature.beans;

public class Hero {
	private String name;
	private int health;
	private int attack;
	private Armor armor;

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Setting hero name to " + name);
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + attack;
		result = prime * result + health;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Hero other = (Hero) obj;
		if (attack != other.attack)
			return false;
		if (health != other.health)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", health=" + health + ", attack=" + attack + ", armor=" + armor + "]";
	}

	public Hero(String name, int health, int attack, Armor clothArmor) {
		super();
		this.name = name;
		this.health = health;
		this.attack = attack;
		this.armor = clothArmor;
	}

	public Hero() {
		super();
		System.out.println("A hero is being constructed");
	}

}
