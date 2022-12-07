import java.util.Scanner;

public class Main {
	static Scanner cin = new Scanner(System.in);
	static boolean isExit = false;
	static int courseMarks = 100;
	static StudentOperation operation;

	public static void main(String[] args) {
		operation = new StudentOperation();

		System.out.println("\n\n**********************************************************************************");
		System.out.println("**********************************************************************************\n");
		System.out.println("\t\t\tSTUDENT INFORMATION SYSTEM\n");
		System.out.println("**********************************************************************************");
		System.out.println("**********************************************************************************");

		do {
			System.out
					.println("\n\n##################################################################################");
			System.out.println("\n\t\tPlease select the action you want to perform\n");
			System.out.println("Press 1 for: Register Student");
			System.out.println("Press 2 for: View all student");
			System.out.println("Press 3 for: find an student");
			System.out.println("Press 4 for: delete an student");
			System.out.println("Press 5 for: To Check And Calculate Result");
			System.out.println("Press 6 for: Exit");
			System.out.println(
					"\n##################################################################################\n\n");

			int choosenCase = cin.nextInt();

			switch (choosenCase) {
			case 1:

				addStudentData();
				break;

			case 2:

				operation.viewStudent();
				StudentOperation.counter();

				break;

			case 3:

				System.out.println("\nPlease enter student roll number");
				int rollNumber = cin.nextInt();
				operation.search(rollNumber);
				break;

			case 4:

				System.out.println("\nPlease enter student roll number: ");
				rollNumber = cin.nextInt();
				operation.deleteStudent(operation.search(rollNumber));
				break;

			case 5:

				operation.getResult();
				operation.getResultInfo();
				break;

			case 6:

				isExit = true;
				System.out.println("THANK YOU!!");
				break;

			default:
			}

		} while (!isExit);

	}

	public static void addStudentData() {

		System.out.println("\n**********************************************************************************");
		System.out.println("\t\t\tEnter Student information");
		System.out.println("**********************************************************************************\n");
		System.out.println("First Name: ");
		String fname = cin.next();
		System.out.println("Last Name: ");
		String lname = cin.next();
		cin.nextLine();
		System.out.println("Roll Number: ");
		int rollNum = cin.nextInt();
		cin.nextLine();
		System.out.println("Department(Like CE,BE,EE): ");
		String depart = cin.nextLine();
		System.out.println("Enrollment Year: ");
		int enrollmentYear = cin.nextInt();
		System.out.println("Age: ");
		int age = cin.nextInt();
		cin.nextLine();
		System.out.println("Address: ");
		String Address = cin.nextLine();
		System.out.println("Email Address: ");
		String email = cin.nextLine();
		System.out.println("Contact Number: ");
		String number = cin.nextLine();
		System.out.println("\n**********************************************************************************");
		System.out.printf("\t\t\tCOURSE SELETION\n");
		System.out.println("**********************************************************************************\n");

		System.out.println("Please Select five of your courses from given list:\n");

		System.out.println("\n1.\tENGLISH\n2.\tMATH.\n3.\tJAVA.\n4.\tURDU.\n5.\tDATA STRUCTURES.\n6.\tLOGIC GATES.\n7."
				+ "\tCIRCUIT ANALYSIS.\n8.\tOBJECT ORIENTED.\n9.\tC++.\n10.\tADVANCE ENGINEERING.\n");
		System.out.println("Course:01");
		String courseName1 = cin.nextLine();
		System.out.println("Course marks: " + courseMarks);
		System.out.println("Course:02");
		String courseName2 = cin.nextLine();
		System.out.println("Course marks: " + courseMarks);
		System.out.println("Course:03");
		String courseName3 = cin.nextLine();
		System.out.println("Course marks: " + courseMarks);
		System.out.println("Course:04");
		String courseName4 = cin.nextLine();
		System.out.println("Course marks: " + courseMarks);
		System.out.println("Course:05");
		String courseName5 = cin.nextLine();
		System.out.println("Course marks: " + courseMarks);

		System.out.println("\n**********************************************************************************");
		System.out.println("\t\t\tFEES PROCESS");
		System.out.println("**********************************************************************************\n");
		System.out.println("Your Total Fees is Rs: " + StudentOperation.STUDENT_FEE);
		System.out.println("Enter your payemnt Rs:");
		int payment = cin.nextInt();
		int remainingBalance = 0;
		if (payment == StudentOperation.STUDENT_FEE) {
			System.out.println("\nThank you for your payemnt!!");
		} else if (payment < StudentOperation.STUDENT_FEE) {
			remainingBalance = StudentOperation.STUDENT_FEE - payment;
			System.out.println("\nYour Balance Amount is Rs: " + remainingBalance);
		} else if (payment > StudentOperation.STUDENT_FEE) {
			remainingBalance = payment - StudentOperation.STUDENT_FEE;
			System.out.println("You remaining amount is Rs: " + remainingBalance);
		} else {
			System.out.println("Invalid Number\nSubmit your fees again. ");
			payment = cin.nextInt();
			if (payment == StudentOperation.STUDENT_FEE) {
				System.out.println("\nThank you for your payemnt!!");
			} else if (payment < StudentOperation.STUDENT_FEE) {
				remainingBalance = StudentOperation.STUDENT_FEE - payment;
				System.out.println("\nYour Balance Amount is Rs: " + remainingBalance);
			}

		}

		System.out.println("\n**********************************************************************************");
		System.out.println("\t\t\tFEES STATUS");
		System.out.println("**********************************************************************************\n");
		if (remainingBalance == 0) {
			System.out.println("\tFees paid!!\nFees Submitted.\nTHANK YOU!!");
		} else {
			System.out.println("\tFees unpaid!!\nPlease submit your Fees.\nTHANK YOU!!");
		}

		operation.addStudent(fname, lname, age, rollNum, depart, Address, enrollmentYear, number, email, courseName1,
				courseName2, courseName3, courseName4, courseName5, remainingBalance);

	}
}
