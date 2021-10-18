package virtualPet;

import java.util.Random;

public class Pet {
	private String name;
	private int hungerLevel;
	private int boredomLevel;
	
	public Pet(String _name){
		name = _name;
		boredomLevel = (int) (Math.random() * 6);
		hungerLevel = (int) (Math.random() * 6);
	}
	public String feed() {
		passTime();
		
		if(hungerLevel >= 0) {
			return "I'm not hungry!";
		}
		else {
			hungerLevel -= 2;
			
			return "Yum!";
		}	
	}
	public String walk() {
		passTime();
		
		if(boredomLevel <= 0) {
			return "Nope, don't wanna.";
		}
		else {
			boredomLevel -= 2;
			
			return "leggo";
		}	
	}
	public String talk() {
		int mood = getMood();
		
		if(mood <= 1) {
			return "I'm Happy";
		}
		else if(mood <= 3 && mood > 1) {
			return "I'm content";
		}
		else {
			return "You Suck!";
		}
	}
	private int getMood() {
		return boredomLevel + hungerLevel;
	}
	private void passTime() {
		boredomLevel++;
		hungerLevel++;
	}
	public  void setName (String _name) {
		name = _name;
	}
}