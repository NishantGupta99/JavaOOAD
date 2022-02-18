package com.nishant.final1.keyword;

public class Ticket {
 private final String movieName = "Spiderman no way home";
 private float price;
  public final void sell() {
	  System.out.println("this ticket has been sold ");
  }
 
}
class Movie extends Ticket {	
	
}
