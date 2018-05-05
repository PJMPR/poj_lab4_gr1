package model.heroes;

public class Main {

	public static void main(String[] args) {

		

	}
	
	static void printoutHero(Mage hero){
		System.out.println("----------------------------");
		System.out.println(hero.getName()+"\t|"
				+ "str: "+hero.getStrength() +"\t|"
				+ "def: "+hero.getDefence() +"\t|"
				+ "dex: "+hero.getDextrity() +"\t|"
				+ "int: "+hero.getIntelligence() +"\t|"
				+ "agi: "+hero.getAgility() +"\t|"
				+ "spd: "+hero.getSpeed() +"\t|");
		System.out.println("----------------------------");
	}

}
