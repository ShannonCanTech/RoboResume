package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		Experience workHistory;
		Education schooling;
		String design = "************************************" + '\n'; //for formatting purposes

		//Contact Information (store in an array list?)
		System.out.println('\n' + design + '\n');
		System.out.println("Use this section to insert your contact information.");
		Contact newContact = new Contact();
		System.out.print("What is your first name? ");
		newContact.setFirstName(sc.nextLine());
		System.out.print("What is your last name? ");
		newContact.setLastName(sc.nextLine());
		System.out.print("What is your phone number? ");
		newContact.setPhoneNumber(sc.nextLine());
		System.out.print("What is your email address? ");
		newContact.setEmailAddress(sc.nextLine());
//		System.out.print(newContact.contactInfo());
		System.out.println('\n' + design + '\n');

		//Work Experience
		System.out.println('\n' + design + '\n');
		System.out.println("Use this section to input your professional work experience.");
		ArrayList<Experience> experience = new ArrayList<>();


		System.out.print("Do you have any professional work experience? (Y/N) ");
		input = sc.nextLine();
		if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("Yes")) {

			for (int x = 1; x < 5; x++) {
				workHistory = new Experience();
				System.out.print("Name of the first company: ");
				workHistory.setCompany(sc.nextLine());
				System.out.print("Your job title: ");
				workHistory.setRole(sc.nextLine());
				System.out.print("Starting month: ");
				workHistory.setStartingMonth(sc.nextLine());
				System.out.print("Starting year: ");
				workHistory.setStartingYear(sc.nextLine());
				System.out.print("Ending Month: ");
				workHistory.setEndingMonth(sc.nextLine());
				System.out.print("Ending year: ");
				workHistory.setEndingYear(sc.nextLine());

				experience.add(workHistory);

				//Ask user if they want to input any more experience before looping again
				System.out.print("Do you have any more work experience? (Y/N)");
				input = sc.nextLine();
				if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("Yes")) {
					continue;
				} else if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("No")) {
					break;
				}

			}

		}
		System.out.println('\n' + design + '\n');

		//School/Education History
		System.out.println('\n' + design + '\n');
		System.out.print("Use this section to input your educational history." + '\n');
		ArrayList<Education> education = new ArrayList<>();

		System.out.print("Have you attended any educational institutes? (Y/N) ");
		input = sc.nextLine();
		if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("Yes")) {

			for (int x = 1; x <= 5; x++) {
				schooling = new Education();
				System.out.print("What is the name of the institute you attended? ");
				schooling.setSchool(sc.nextLine());
				System.out.print("What degree did you obtain? ");
				schooling.setDegree(sc.nextLine());
				System.out.print("What was your major? ");
				schooling.setMajor(sc.nextLine());
				System.out.print("What month did you start? ");
				schooling.setStartMonth(sc.nextLine());
				System.out.print("What year did you start? ");
				schooling.setStartYear(sc.nextLine());
				System.out.print("What was/is your anticipated graduation month? ");
				schooling.setGradMonth(sc.nextLine());
				System.out.print("What was/is your anticipated graduation year? ");
				schooling.setGradYear(sc.nextLine());

				education.add(schooling);

				//Before loop continues, ask user if they have any additional educational experience
				System.out.print("Do you any additional educational history? (Y/N) ");
				input = sc.nextLine();
				if(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("Yes")) {
					continue;
				} else if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("No")) {
					break;
				}
			}
		}
		System.out.println('\n' + design + '\n');


		//The Resume
		System.out.println('\n'+ design + '\n');
		System.out.print(newContact.contactInfo());
		System.out.print("\n");
		for(Experience eachExperience: experience ) {
			System.out.print(eachExperience.experienceInfo());
		}
		for (Education eachEducation: education) {
			System.out.print(eachEducation.educationInfo());
		}

/*		System.out.print("What is your full name? ");
		String fullName = sc.nextLine();
		System.out.print("What is your phone number? ");
		String phoneNumber = sc.nextLine();
		System.out.print("What is your email Address? ");
		String emailAddress = sc.nextLine();*/

		//Work Experience (Create an array list that collects the user's work experience.)
/*		System.out.print("Do you have any professional work experience? ");
		String experience = sc.nextLine();*/
/*		System.out.print("Do you have any more work experience? (Y/N) ");
		input = sc.next();
		if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("Yes")) {
			System.out.print("List work experience:");
		}*/

/*		System.out.print(contactInfo());
		System.out.print('\n'+'\n'+experience);*/



		/*String design = "*";
		for(int x = 1; x <15; x++){
			System.out.println(design);
		}*/

    }
}
