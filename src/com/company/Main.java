package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		boolean educationDone = false;
		boolean experienceDone = false;
		boolean skillsDone = false;
		Contact newContact;
		Experience workHistory;
		Education schooling;
		Skills expertise;
		int i;
		Rating myRating = new Rating();
		String[] skillRatings = {"Still Learning", "Beginner Knowledge", "Exceptional Knowledge", "Intermediate Knowledge", "Advance Knowledge", "Expert Knowledge"};


		//Contact Information (store in an array list?)
		newContact = new Contact();
		System.out.println("Use this section to insert your contact information.");

		System.out.print("Enter your first name: ");
		newContact.setFirstName(sc.nextLine());
		System.out.print("Enter your last name: ");
		newContact.setLastName(sc.nextLine());
		System.out.print("Enter your phone number: ");
		newContact.setPhoneNumber(sc.nextLine());
		System.out.print("Enter your email address: ");
		newContact.setEmailAddress(sc.nextLine());


		//Work Experience
		System.out.println('\n' + "Use this section to input your professional work experience." + '\n');
		ArrayList<Experience> experience = new ArrayList<>();


		System.out.print("Do you have any professional work experience? (Y/N) ");
		input = sc.nextLine();
		if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("Yes")) {

			do {
				workHistory = new Experience();
				System.out.print("Company Name: ");
				workHistory.setCompany(sc.nextLine());
				System.out.print("Job title: ");
				workHistory.setRole(sc.nextLine());
				System.out.print("Start Month: ");
				workHistory.setStartingMonth(sc.nextLine());
				System.out.print("Start Year: ");
				workHistory.setStartingYear(sc.nextLine());
				System.out.print("Ending Month: ");
				workHistory.setEndingMonth(sc.nextLine());
				System.out.print("Ending year: ");
				workHistory.setEndingYear(sc.nextLine());
				experience.add(workHistory);

				//Ask user if they want to input any more experience before looping again
				System.out.print("Do you have any more work experience? (Y/N)");
				input = sc.nextLine();
				if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("No")) {
					experienceDone = true;
				}

			} while (!experienceDone);

		}

		//School/Education History
		System.out.println('\n' + "Use this section to input your educational history." + '\n');
		ArrayList<Education> education = new ArrayList<>();

		System.out.print("Have you attended any educational institutes? (Y/N) ");
		input = sc.nextLine();
		if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("Yes")) {

			do {
				schooling = new Education();
				System.out.print("Institution Name: ");
				schooling.setSchool(sc.nextLine());
				System.out.print("Degree Obtained: ");
				schooling.setDegree(sc.nextLine());
				System.out.print("Major: ");
				schooling.setMajor(sc.nextLine());
				System.out.print("Start Month: ");
				schooling.setStartMonth(sc.nextLine());
				System.out.print("Start Year: ");
				schooling.setStartYear(sc.nextLine());
				System.out.print("Anticipated Graduation Month: ");
				schooling.setGradMonth(sc.nextLine());
				System.out.print("Anticipated Graduation Year: ");
				schooling.setGradYear(sc.nextLine());

				education.add(schooling);

				//Before loop continues, ask user if they have any additional educational experience
				System.out.print("Do you any additional educational history? (Y/N) ");
				input = sc.nextLine();
				if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("No")) {
					educationDone = true;
				}
			} while (!educationDone);
		}

		//Skills
		ArrayList<Skills> skills = new ArrayList<>();
		/*ArrayList<Rating> rating = new ArrayList<>();*/

		System.out.print("Any skills? (Y/N) ");
		switch (input = sc.nextLine()) {
		}

		if ("Y".equalsIgnoreCase(input) || input.equalsIgnoreCase("Yes")) {

			do {
				expertise = new Skills();
				myRating = new Rating();
				i = Integer.parseInt(input);
				System.out.print("Enter skills: ");
				expertise.setGeneral(sc.nextLine());
				System.out.print("How would you rate these skills from 1 to 5? ");
/*				myRating.setRate(sc.nextLine());
				myRating.setRate(skillRatings[i]);*/

				input = sc.nextLine();
				i = Integer.parseInt(input);
				myRating.setRate(skillRatings[i]);
				skills.add(expertise);
				/*rating.add(myRating);//added*/

				//Before loop continues, ask user if they have any additional skills
				System.out.print("Do you any additional skills? (Y/N) ");
				input = sc.nextLine();
				if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("No")) {
					skillsDone = true;
				}
			} while (!skillsDone);
		}


		//The Resume
		System.out.println('\n' + "*******************************************");
		System.out.println("Contact");
		System.out.println("*******************************************");
		System.out.println(newContact.contactInfo());
		System.out.println("*******************************************");
		System.out.println("Experience");
		System.out.println("*******************************************");
		for(Experience eachExperience: experience ) {
			System.out.print(eachExperience.experienceInfo());
		}
		System.out.println("*******************************************");
		System.out.println("Education");
		System.out.println("*******************************************");
		for (Education eachEducation: education) {
			System.out.println(eachEducation.educationInfo());
		}
		System.out.println("*******************************************");
		System.out.println("Skills");
		System.out.println("*******************************************");
		for (Skills eachSkills: skills) {
			System.out.println(eachSkills.getGeneral()+ '\n' + "Level: " + myRating.getRate() + '\n');
		}

    }
}
