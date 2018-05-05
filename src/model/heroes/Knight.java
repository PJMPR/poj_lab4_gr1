package model.heroes;

public class Knight implements ICanBeAHero {

	private int availableStatsPoints;
	
	public int getAvailableStatsPoints() {
		return availableStatsPoints;
	}

	public void levelUp(){
		availableStatsPoints+=10;
	}

	public void raiseStr(){
		if(availableStatsPoints<=0)return;
		strength=(int)((strength+1)/1.2);
		strength++;
		strength*=1.2;
		availableStatsPoints--;
	}
	public void raiseDef(){
		if(availableStatsPoints<=0)return;
		defence=(int)((defence+1)/1.1);
		defence++;
		defence*=1.1;
		availableStatsPoints--;
	}
	
	public void raiseInt(){
		if(availableStatsPoints<=0)return;
		intelligence++;
		availableStatsPoints--;
	}

	public void raiseDex(){
		if(availableStatsPoints<=0)return;
		dextrity=(int)((dextrity+1)/1.05);
		dextrity++;
		dextrity*=1.05;
		availableStatsPoints--;
	}
	
	public void raiseAgi(){
		if(availableStatsPoints<=0)return;
		agility=(int)((agility+1)/1.02);
		agility++;
		agility*=1.02;
		availableStatsPoints--;
	}
	

	public void raiseSpd(){
		if(availableStatsPoints<=0)return;
		speed=(int)((speed+1)/1.05);
		speed++;
		speed*=1.05;
		availableStatsPoints--;
	}
	
	private String name;
	
	private int strength;
	private int defence;
	private int intelligence;
	private int dextrity;
	private int agility;
	private int speed;
	public String getName() {
		return name;
	}
	public int getStrength() {
		return strength;
	}
	public int getDefence() {
		return defence;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public int getDextrity() {
		return dextrity;
	}
	public int getAgility() {
		return agility;
	}
	public int getSpeed() {
		return speed;
	}
	
	public void setName(String name){
		this.name = name;
	}
}
