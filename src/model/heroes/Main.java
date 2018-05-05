package model.heroes;

public class Main {

	public static void main(String[] args) {

		Hero mage = new Mage();
		mage.setName("Gandalf");
		Hero knight = new Knight();
		knight.setName("Aragorn");
		Hero archer = new Archer();
		archer.setName("Legolas");
		
		for(int i=0;i<100;i++){
			mage.levelUp();
			mage.raiseAgi();
			mage.raiseDef();
			mage.raiseDex();
			mage.raiseInt();
			mage.raiseSpd();
			mage.raiseStr();
			

			knight.levelUp();
			knight.raiseAgi();
			knight.raiseDef();
			knight.raiseDex();
			knight.raiseInt();
			knight.raiseSpd();
			knight.raiseStr();
			

			archer.levelUp();
			archer.raiseAgi();
			archer.raiseDef();
			archer.raiseDex();
			archer.raiseInt();
			archer.raiseSpd();
			archer.raiseStr();
			
		}

		printoutHero(mage);
		printoutHero(knight);
		printoutHero(archer);
		
	}

	static void printoutHero(Hero hero){
		System.out.println("--------------------------------------------------------");
		System.out.println(hero.getName()+"\t|"
				+ "str: "+hero.getStrength() +"\t|"
				+ "def: "+hero.getDefence() +"\t|"
				+ "dex: "+hero.getDextrity() +"\t|"
				+ "int: "+hero.getIntelligence() +"\t|"
				+ "agi: "+hero.getAgility() +"\t|"
				+ "spd: "+hero.getSpeed() +"\t|");
		System.out.println("--------------------------------------------------------");		
	}

}
