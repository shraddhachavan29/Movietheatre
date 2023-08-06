package com.jsp.movietheatre;

public class Theatre {
	private String theatrename;
	private int no_of_seats;
	
private Ticket ticket ;

public Theatre(String tn , int tm) {
	this.theatrename = tn ;
	this.no_of_seats = tm ;
}

public void setTheatrename (String Theatrename) {
	this.theatrename = theatrename ;
}
public String getTheatrename() {
	return theatrename;
}
public void setno_of_seats (int no_of_seats) {
	this.no_of_seats = no_of_seats;
}
public int getno_of_seats() {
	return no_of_seats;
}
public void setTiceket(Ticket ticket) {
	this.ticket = ticket ;
}
public Ticket getticket() {
	return ticket ; 
}
public int bookticket() {
if(ticket.getno_of_tickets() <= no_of_seats) {
	no_of_seats = no_of_seats - ticket.getno_of_tickets();
	return ticket.getno_of_tickets();
} else {
	return -1 ; 
}
}
public void showSeatAvailability(){
	if ( no_of_seats > 0 ) {
		System.out.println(no_of_seats +"seats are available");
		}else {
			System.out.println("seats are full. All the tickets are been booked");
		}
}
public void cancelTickets(int cancel_tickets) {
	if(ticket==null) {
		System.out.println("Kindly book the ticket first");
	}
	else {
		if(cancel_tickets <= ticket.getno_of_tickets()) {
			no_of_seats = no_of_seats + cancel_tickets;
			ticket.setno_of_tickets(ticket.getno_of_tickets()-cancel_tickets);
			System.out.println("Ticket cancelled successfully");
		}else {
			System.out.println("Error:The number of tickets to be cancelled exceeds the number of ticket to be booked.");
		}
	
		}
	}
public void showTicketDetails() {
	if (ticket == null) {
		System.out.println("Please book tickets first");
	}else {
		ticket.printTicketdetails();
	}
}
}
