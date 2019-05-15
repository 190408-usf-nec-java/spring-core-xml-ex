package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.Hero;

public class Launcher {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Hero hero = context.getBean(Hero.class);
		System.out.println(hero);
		
		Hero otherHero = (Hero) context.getBean("dwight");
		System.out.println(otherHero);
		
		System.out.println(hero == otherHero);
	}
}
