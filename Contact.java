package com.blz.addressbooksystem;

public class Contact {
	// VARIABLES
	private String firstName, lastName, address, city, state, emailID;
	private long zipCode, phoneNumber;

	public Contact() {
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