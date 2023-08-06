package com.jsp.movietheatre;

public class Ticket {
	private String moviename;
	private int no_of_tickets;
	
public Ticket ( String m , int n) {
	this.moviename = m ;
	this.no_of_tickets = n ;
}

public String getmoviename() {
	return moviename ;
}

public void setno_of_tickets( int no_of_tickets) {
	this.no_of_tickets = no_of_tickets;
}
public int getno_of_tickets() {
	return no_of_tickets;
}

	public void printTicketdetails(){
		System.out.println("===Ticket===");
		System.out.println("moviename"+moviename);
		System.out.println("no_of_tickets"+no_of_tickets);
		

	}

}
