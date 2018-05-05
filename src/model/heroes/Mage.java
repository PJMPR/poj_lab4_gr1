package model.heroes;

public class Mage implements ICanBeAHero {

	private int availableStatsPoints;
	
	public int getAvailableStatsPoints() {
		return availableStatsPoints;
	}

	public void levelUp(){
		availableStatsPoints+=10;
	}

	public void raiseStr(){
		if(availableStatsPoints<=0)return;
		strength++;
		availableStatsPoints--;
	}
	public void raiseDef(){
		if(availableStatsPoints<=0)return;
		defence++;
		availableStatsPoints--;
	}
	
	public void raiseInt(){
		if(availableStatsPoints<=0)return;
		intelligence=(int)((intelligence+1)/1.2);
		intelligence++;
		intelligence*=1.2;
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
		speed++;
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
	
	
	
	@Override
	public int getStrength() {
		return strength;
	}
	@Override
	public int getDefence() {
		return defence;
	}
	@Override
	public int getIntelligence() {
		return intelligence;
	}
	@Override
	public int getDextrity() {
		return dextrity;
	}
	@Override
	public int getAgility() {
		return agility;
	}
	@Override
	public int getSpeed() {
		return speed;
	}
	
	@Override
	public void setName(String name){
		this.name = name;
	}
	
}
