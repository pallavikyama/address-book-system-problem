package com.blz.addressbooksystem;

import java.util.Scanner;

public class Contact {
	// VARIABLES
	private String firstName, lastName, address, city, state, emailID;
	private long zipCode, phoneNumber;
	Scanner input = new Scanner(System.in);

	public Contact() {
		addContact();
	}

	// ADD NEW CONTACT INTO ADDRESS BOOK
	public void addContact() {
		System.out.println("\nCreating a new contact.\nEnter your contact details:");
		System.out.println("First Name: ");
		this.firstName = input.nextLine();
		System.out.println("Last Name: ");
		this.lastName = input.nextLine();
		System.out.println("Address: ");
		this.address = input.nextLine();
		System.out.println("City: ");
		this.city = input.nextLine();
		System.out.println("State: ");
		this.state = input.nextLine();
		System.out.println("Zip Code: ");
		this.zipCode = input.nextLong();
		System.out.println("Phone Number: ");
		this.phoneNumber = input.nextLong();
		System.out.println("E-mail ID: ");
		this.emailID = input.next();
		printContacts();
	}

	public void printContacts() {
		System.out.println("\nThis address book has stored the following:" + toString());
	}

	// TO PRINT CONTACT DETAILS
	@Override
	public String toString() {
		return "\nFirst Name: " + this.firstName + "\nLast Name: " + this.lastName + "\nAddress: " + this.address
				+ "\nCity: " + this.city + "\nState: " + this.state + "\nZip-code: " + this.zipCode + "\nPhone number: "
				+ this.phoneNumber + "\nEmail-ID: " + this.emailID;
	}
}