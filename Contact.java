package com.blz.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact {
	// VARIABLES
	private String firstName, lastName, address, city, state, emailID;
	private long zipCode, phoneNumber;
	Scanner input = new Scanner(System.in);
	ArrayList<Contact> book = new ArrayList<Contact>();

	// ADDRESS BOOK MENU
	public void contactMenu() {
		int choice = 0;
		do {
			boolean valid = false;
			while (!valid) {
				try {
					System.out.println("\nAddress-Book Menu:\n(Select any one operation from the menu below)"
							+ "\n1.Add a new contact" + "\n2.Edit first name of existing contact"
							+ "\n3.Edit last name of existing contact"
							+ "\n4.Edit residence address of existing contact"
							+ "\n5.Edit residing city of existing contact"
							+ "\n6.Edit residing state of existing contact"
							+ "\n7.Edit zip/pin code of existing contact" + "\n8.Edit phone number of existing contact"
							+ "\n9.Edit email-ID of existing contact" + "\n10.Delete existing contact"
							+ "\n11.Print all contacts in this address book"
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
				addContact();
				break;
			}
			case 2: {
				editFirstName();
				emptyBookCheck();
				if (!book.isEmpty())
					editFirstName();
				break;
			}
			case 3: {
				editLastName();
				emptyBookCheck();
				if (!book.isEmpty())
					editLastName();
				break;
			}
			case 4: {
				editAddress();
				emptyBookCheck();
				if (!book.isEmpty())
					editAddress();
				break;
			}
			case 5: {
				editCity();
				emptyBookCheck();
				if (!book.isEmpty())
					editCity();
				break;
			}
			case 6: {
				editState();
				emptyBookCheck();
				if (!book.isEmpty())
					editState();
				break;
			}
			case 7: {
				editZipCode();
				emptyBookCheck();
				if (!book.isEmpty())
					editZipCode();
				break;
			}
			case 8: {
				editPhoneNo();
				emptyBookCheck();
				if (!book.isEmpty())
					editPhoneNo();
				break;
			}
			case 9: {
				editEmailID();
				emptyBookCheck();
				if (!book.isEmpty())
					editEmailID();
				break;
			}
			case 10: {
				emptyBookCheck();
				if (!book.isEmpty())
					deleteContact();
				break;
			}
			case 11: {
				emptyBookCheck();
				if (!book.isEmpty())
					printContacts();
				break;
			}
			default: {
				input.close();
				System.out.println("Closing Address Book.");
				return;
			}
			}
		} while (choice > 0 && choice <= 11);
	}

	// 1. ADD NEW CONTACT INTO ADDRESS BOOK
	public void addContact() {
		Contact person = new Contact();
		System.out.println("\nCreating a new contact.\nEnter your contact details:");
		System.out.print("First Name: ");
		person.firstName = input.nextLine();
		System.out.print("Last Name: ");
		person.lastName = input.nextLine();
		System.out.print("Address: ");
		person.address = input.nextLine();
		System.out.print("City: ");
		person.city = input.nextLine();
		System.out.print("State: ");
		person.state = input.nextLine();
		System.out.print("Zip Code: ");
		person.zipCode = input.nextLong();
		System.out.print("Phone Number: ");
		person.phoneNumber = input.nextLong();
		System.out.print("E-mail ID: ");
		person.emailID = input.next();
		book.add(person);
		System.out.println("\nContact details: " + person.toString());
	}

	private Contact getContact() {
		System.out.println("\nPlease enter your first name(as previously stored in the address book): ");
		String name = input.nextLine();
		boolean validName = false;
		for (Contact item : book) {
			if (item.firstName.equals(name)) {
				validName = true;
				return item;
			}
		}
		if (!validName)
			System.out.println("\nNo such first name exists in the address book.");
		return null;
	}

	// 2. UPDATE FIRST NAME IN ADDRESS BOOK
	private void editFirstName() {
		Contact person = getContact();
		if (person != null) {
			System.out.println("Enter new first name:");
			person.firstName = input.nextLine();
			System.out.println("\nContact details: " + person.toString());
		}
	}

	// 3. UPDATE LAST NAME IN ADDRESS BOOK
	private void editLastName() {
		Contact person = getContact();
		if (person != null) {
			System.out.println("Enter new last name:");
			person.lastName = input.nextLine();
			System.out.println("\nContact details: " + person.toString());
		}
	}

	// 4. UPDATE RESIDENCE ADDRESS IN ADDRESS BOOK
	private void editAddress() {
		Contact person = getContact();
		if (person != null) {
			System.out.println("Enter new address:");
			person.address = input.nextLine();
			System.out.println("\nContact details: " + person.toString());
		}
	}

	// 5. UPDATE RESIDING CITY IN ADDRESS BOOK
	private void editCity() {
		Contact person = getContact();
		if (person != null) {
			System.out.println("Enter new city:");
			person.city = input.nextLine();
			System.out.println("\nContact details: " + person.toString());
		}
	}

	// 6. UPDATE RESIDING STATE IN ADDRESS BOOK
	private void editState() {
		Contact person = getContact();
		if (person != null) {
			System.out.println("Enter new state:");
			person.state = input.nextLine();
			System.out.println("\nContact details: " + person.toString());
		}
	}

	// 7. UPDATE ZIP CODE IN ADDRESS BOOK
	private void editZipCode() {
		Contact person = getContact();
		if (person != null) {
			System.out.println("Enter new zip-code:");
			person.zipCode = input.nextLong();
			System.out.println("\nContact details: " + person.toString());
		}
	}

	// 8. UPDATE PHONE NUMBER IN ADDRESS BOOK
	private void editPhoneNo() {
		Contact person = getContact();
		if (person != null) {
			System.out.println("Enter new phone number:");
			person.phoneNumber = input.nextLong();
			System.out.println("\nContact details: " + person.toString());
		}
	}

	// 9. UPDATE RESIDING STATE IN ADDRESS BOOK
	private void editEmailID() {
		Contact person = getContact();
		if (person != null) {
			System.out.println("Enter new email-ID:");
			person.emailID = input.next();
			System.out.println("\nContact details: " + person.toString());
		}
	}

	// 10. DELETE EXISTING CONTACT DETAILS
	private void deleteContact() {
		Contact person = getContact();
		if (person != null) {
			System.out.println("Deleting contact.");
			book.remove(person);
		}
		printContacts();
	}

	// 11. DISPLAY THIS ADDRESS BOOK
	private void printContacts() {
		emptyBookCheck();
		if (!book.isEmpty()) {
			System.out.println("\nThis address book has stored the following:");
			for (Contact contact : book) {
				System.out.println(contact.toString());
			}
		}
	}

	// TO PRINT CONTACT DETAILS
	@Override
	public String toString() {
		return "\nFirst Name: " + this.firstName + "\nLast Name: " + this.lastName + "\nAddress: " + this.address
				+ "\nCity: " + this.city + "\nState: " + this.state + "\nZip-code: " + this.zipCode + "\nPhone number: "
				+ this.phoneNumber + "\nEmail-ID: " + this.emailID;
	}

	// CHECK IF ADDRESS BOOK IS EMPTY
	public void emptyBookCheck() {
		if (book.isEmpty())
			System.out.println("\n========== EMPTY book! ==========");
	}
}