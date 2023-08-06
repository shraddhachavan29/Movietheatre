package com.jsp.movietheatre;

import java.util.Scanner;

public class Bookoffice {
	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in);
		Theatre theatre = new Theatre ("PVR",500);
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("\n Enter\n 1.Show Seat Availability\n2.Book Ticket\n3.To Check Ticket Details\n4.Cancel Ticket\n5.Exit");
			int n = sc.nextInt();
			switch(n) {
			case 1 :{
				theatre.showSeatAvailability();
			}break;
			
			case 2 :{
				System.out.println("Enter the movie name ");
				String name = sc.next();
				System.out.println("Enter the nmuber of seats ");
				int num = sc.nextInt();
				theatre.setTiceket(new Ticket(name,num));
				int booked = theatre.bookticket();
				if(booked == -1) {
					System.out.println("Sorry the seats are not available");
				}else {
						System.out.println("Hurray! Tickets are booked Successfully");
					}
				}break;
				case 3 :{
					theatre.showTicketDetails();
				}break;
				case 4 :{
					System.out.println("Enter the no of tickets to be cancelled");
					int cancel = sc.nextInt();
					theatre.cancelTickets(cancel);
				}break;
				default :{
					System.out.println("Wrong Input");
				}
					
				}
		}	
			}

}