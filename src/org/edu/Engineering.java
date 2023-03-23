package org.edu;

public class Engineering extends Medicine {
	public void bE() {
		System.out.println("bE");
	}public void bTech() {
		System.out.println("bTech");
	}
	public static void main (String args[]) {
		 Engineering c = new Engineering();
		 c.bE();
		 c.bTech();
		 c.physiyo();
		 c.dentist();
		 c.mbbs();
	}
}
