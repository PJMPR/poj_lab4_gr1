package model.heroes;

public class Archer extends Hero implements ICanBeAHero {

	public void raiseStr(){
		if(availableStatsPoints<=0)return;
		strength=(int)((strength+1)/1.05);
		strength++;
		strength*=1.05;
		availableStatsPoints--;
	}
	public void raiseDef(){
		if(availableStatsPoints<=0)return;
		defence=(int)((defence+1)/1.05);
		defence++;
		defence*=1.05;
		availableStatsPoints--;
	}
	
	public void raiseInt(){
		if(availableStatsPoints<=0)return;
		intelligence++;
		availableStatsPoints--;
	}

	public void raiseDex(){
		if(availableStatsPoints<=0)return;
		dextrity=(int)((dextrity+1)/1.2);
		dextrity++;
		dextrity*=1.2;
		availableStatsPoints--;
	}
	
	public void raiseAgi(){
		if(availableStatsPoints<=0)return;
		agility=(int)((agility+1)/1.1);
		agility++;
		agility*=1.1;
		availableStatsPoints--;
	}

	public void raiseSpd(){
		if(availableStatsPoints<=0)return;
		speed=(int)((speed+1)/1.05);
		speed++;
		speed*=1.05;
		availableStatsPoints--;
	}
	
}
