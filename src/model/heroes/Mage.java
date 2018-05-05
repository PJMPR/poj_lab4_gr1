package model.heroes;

public class Mage extends Hero {

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
	

	
	
	
}
