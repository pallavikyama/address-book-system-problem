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

	// ADDRESS BOOK MENU
	public void contactMenu() {
		int choice = 0;
		do {
			boolean valid = false;
			while (!valid) {
				try {
					System.out.println("\nAddress-Book Menu:\n(Select any one operation from the menu below)"
							+ "\n1.Edit first name of existing contact" + "\n2.Edit last name of existing contact"
							+ "\n3.Edit residence address of existing contact"
							+ "\n4.Edit residing city of existing contact"
							+ "\n5.Edit residing state of existing contact"
							+ "\n6.Edit zip/pin code of existing contact" + "\n7.Edit phone number of existing contact"
							+ "\n8.Edit email-ID of existing contact"
							+ "\nPress any other integer to exit address book");
					choice = input.nextInt();
					if (choice >= 0)
						valid = true;
				} catch (Exception e) {
					System.out.println("Enter an integer only (Invalid User Input choice). Try again.");
					input.nextLine(); // CLEAR THE INPUT
				}
			}
			input.nextLine(); // CLEAR THE INPUT
			switch (choice) {
			case 1: {
				editFirstName();
				break;
			}
			case 2: {
				editLastName();
				break;
			}
			case 3: {
				editAddress();
				break;
			}
			case 4: {
				editCity();
				break;
			}
			case 5: {
				editState();
				break;
			}
			case 6: {
				editZipCode();
				break;
			}
			case 7: {
				editPhoneNo();
				break;
			}
			case 8: {
				editEmailID();
				break;
			}
			default:{
				System.out.println("Closing Address Book. ");
				return;
			}
			}
		} while (choice > 0 && choice < 9);
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
		contactMenu();
	}

	public boolean getContactName() {
		System.out.println("\nPlease enter your first name(as previously stored in the address book): ");
		String name = input.nextLine();
		if (this.firstName.equals(name))
			return true;
		else
			System.out.println("No such first name exists in the address book.");
		return false;
	}

	// 1. UPDATE FIRST NAME IN ADDRESS BOOK
	public void editFirstName() {
		if (getContactName()) {
			System.out.println("Enter new first name:");
			this.firstName = input.nextLine();
			printContacts();
		}
	}

	// 2. UPDATE LAST NAME IN ADDRESS BOOK
	public void editLastName() {
		if (getContactName()) {
			System.out.println("Enter new last name:");
			this.lastName = input.nextLine();
			printContacts();
		}
	}

	// 3. UPDATE RESIDENCE ADDRESS IN ADDRESS BOOK
	public void editAddress() {
		if (getContactName()) {
			System.out.println("Enter new address:");
			this.address = input.nextLine();
			printContacts();
		}
	}

	// 4. UPDATE RESIDING CITY IN ADDRESS BOOK
	private void editCity() {
		if (getContactName()) {
			System.out.println("Enter new city:");
			this.city = input.nextLine();
			printContacts();
		}
	}

	// 5. UPDATE RESIDING STATE IN ADDRESS BOOK
	public void editState() {
		if (getContactName()) {
			System.out.println("Enter new state:");
			this.state = input.nextLine();
			printContacts();
		}
	}

	// 6. UPDATE ZIP CODE IN ADDRESS BOOK
	public void editZipCode() {
		if (getContactName()) {
			System.out.println("Enter new zip-code:");
			this.zipCode = input.nextLong();
			printContacts();
		}
	}

	// 7. UPDATE PHONE NUMBER IN ADDRESS BOOK
	public void editPhoneNo() {
		if (getContactName()) {
			System.out.println("Enter new phone number:");
			this.phoneNumber = input.nextLong();
			printContacts();
		}
	}

	// 8. UPDATE RESIDING STATE IN ADDRESS BOOK
	public void editEmailID() {
		if (getContactName()) {
			System.out.println("Enter new email-ID:");
			this.emailID = input.next();
			printContacts();
		}
	}

	// DISPLAY THIS ADDRESS BOOK
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