package Springcoffin;

public class Statement{
	
	private static boolean UnlockC1 = true;
	private static boolean UnlockC2 = false;
	private static boolean UnlockC3 = false;
	private static boolean UnlockC4 = false;
	private static boolean UnlockC5 = false;
	private static boolean UnlockC6 = false;
	private static boolean UnlockC7 = false;
	
	private static boolean UnlockB1 = true;
	private static boolean UnlockB2 = false;
	private static boolean UnlockB3 = false;
	private static boolean UnlockB4 = false;
	private static boolean UnlockB5 = false;
	private static boolean UnlockB6 = false;
	private static boolean UnlockB7 = false;
	
	protected void setCaptainUnlock(int type) {
		switch(type) {
		case 0: this.UnlockC1 = true; break;
		case 1: this.UnlockC2 = true; break;
		case 2: this.UnlockC3 = true; break;
		case 3: this.UnlockC4 = true; break;
		case 4: this.UnlockC5 = true; break;
		case 5: this.UnlockC6 = true; break;
		case 6: this.UnlockC7 = true; break;
		}
	}
	
	protected void setButtonUnlock(int type) {
		switch(type) {
		case 0: this.UnlockB1 = true; break;
		case 1: this.UnlockB2 = true; break;
		case 2: this.UnlockB3 = true; break;
		case 3: this.UnlockB4 = true; break;
		case 4: this.UnlockB5 = true; break;
		case 5: this.UnlockB6 = true; break;
		case 6: this.UnlockB7 = true; break;
		}
	}
	
	protected boolean getCaptainUnlock(int type) {
		boolean UnlockC = false;
		switch(type) {
		case 0: UnlockC = this.UnlockC1; break;
		case 1: UnlockC = this.UnlockC2; break;
		case 2: UnlockC = this.UnlockC3; break;
		case 3: UnlockC = this.UnlockC4; break;
		case 4: UnlockC = this.UnlockC5; break;
		case 5: UnlockC = this.UnlockC6; break;
		case 6: UnlockC = this.UnlockC7; break;
		}
		return UnlockC;
	}
	
	protected boolean getButtonUnlock(int type) {
		boolean UnlockB = false;
		switch(type) {
		case 0: UnlockB = this.UnlockB1; break;
		case 1: UnlockB = this.UnlockB2; break;
		case 2: UnlockB = this.UnlockB3; break;
		case 3: UnlockB = this.UnlockB4; break;
		case 4: UnlockB = this.UnlockB5; break;
		case 5: UnlockB = this.UnlockB6; break;
		case 6: UnlockB = this.UnlockB7; break;
		}
		return UnlockB;
	}

}
