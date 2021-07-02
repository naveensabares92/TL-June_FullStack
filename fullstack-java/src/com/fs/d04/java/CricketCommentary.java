package com.fs.d04.java;

public class CricketCommentary {
	public void displayDeliveryDetails(String bowler, String batsman) {
		System.out.println("Bowler : " + bowler.split(" ")[1] + " Batsman : " + batsman.split(" ")[1]);
	}

	public void displayDeliveryDetails(Long runs) {
		if (runs == 4) {
			System.out.println("Number of runs scored in the delivery : "+runs + " It is a boundary.");
		} else if (runs == 6) {
			System.out.println("Number of runs scored in the delivery : "+runs + " It is a Sixer.");
		} else {
			System.out.println("Number of runs scored in the delivery : " + runs);
		}
	}
}
