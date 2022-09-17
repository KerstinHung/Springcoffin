package Springcoffin;

public class Saving {
	private static int saving = 100;
	
	Saving(){};
	
	protected void setSaving(int income) {
		this.saving += income;
	}
	
	protected int getSaving() {
		return this.saving;
	}

}
