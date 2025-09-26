package FileHandling;

import java.io.Serializable;

class Cricketer implements Serializable{
	String name;
	String country;
	int matches;
	transient int catches;
	int wickets;
	transient int runs;
	public Cricketer(String name, String country, int matches, int catches, int wickets, int runs) {
		super();
		this.name = name;
		this.country = country;
		this.matches = matches;
		this.catches = catches;
		this.wickets = wickets;
		this.runs = runs;
	}
	
	@Override
	public String toString() {	
		return name+"---"+country+"---"+matches+"---"+catches+"---"+wickets+"---"+runs;
	}
}
