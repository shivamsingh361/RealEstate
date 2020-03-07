package com.cg.Presentation;

import java.util.Scanner;

import com.cg.DTO.User;
import com.cg.Service.ServiceImpl;

public class Main {

	public static void main(String[] args) {
		ServiceImpl obj = new ServiceImpl();
		do{
			Scanner sc = new Scanner(System.in);
			Integer option = 1;
			try {
				System.out.println("Choose:\n1. Login"
						+ "\n2. Register"
						+ "\n3. About Us"
						+ "\n4. Feedback"
						+ "\n5. Exit");
				option = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Please input INTEGER only.");
			}
			switch(option){
			case 1:
				System.out.println("\n**Login Here**");
				Integer optionLogin = 1;
				try {
					System.out.println("Choose Again:\n1. Enter LogIn Details"
							+ "\n2. Forgot Pass"
							+ "\n3. Back"
							+ "\n4. Home");
					optionLogin = sc.nextInt();
				} catch (Exception e) {
					System.out.println("Please input INTEGER only.");
				}
				switch(optionLogin){
				case 1:
					System.out.println("\nEnter Registered Email/Phone: ");
					String id = sc.nextLine();
					System.out.println("\nEnter Registered Password: ");
					String pass = sc.nextLine();
					obj.login(id, pass);
					break;
				case 2:
					System.out.println("\nEnter Registered Email/Phone: ");
					String id1 = sc.nextLine();
					Integer otpentered, otp =  obj.verifyOTP(id1);
					System.out.println("\nEnter OTP Sent, again: "+otp);
					otpentered = sc.nextInt();
					if(otp == otpentered){
						System.out.println("\nEnter Password: ");
						String pass1 = sc.nextLine();
						System.out.println("\nEnter Password Again: ");
						String pass2 = sc.nextLine();
						if(pass1 == pass2)
							obj.updatePassword(id1, pass1);
						else
							System.out.println("\nPassword not Match");								
					}else{
						System.out.println("\nInvalid OTP");
					}
					break;
				case 3:
					//Back to main menu.
					break;
				case 4:
					//Back to main menu/ Home.
					break;
				default:
					System.out.println("\n**Default Block(in Login Option)**\n\t\t<<Invalid Input>>\n\n");
				}
				break;
/* ******************************** Case 1 ends here ******************************************** */
			case 2:
				
				System.out.println("\n**Register Here**");
				System.out.println("Name:\t");
				String name = sc.next();
				System.out.println("Email:\t");
				String email = sc.next();
				System.out.println("Name:");
				String pass1 = sc.next();
				System.out.println("Name:");
				String pass2 = sc.next();
				if(pass1==pass2)
					//obj.Register(new User());	//pass all parameters.
				break;
/* ******************************** Case 2 ends here ******************************************** */
			case 3:
				System.out.println("\n**AboutUs**");
				break;
/* ******************************** Case 3 ends here ******************************************** */
			case 4:
				System.out.println("\n**Feedback**");
				break;
/* ******************************** Case 4 ends here ******************************************** */
			case 5:
				sc.close();
				System.out.println("Exit-ing");
				System.exit(1);
/* ******************************** Case 5 ends here ******************************************** */
			default:
				System.out.println("\n**Default Block**\n\t\t<<++Invalid Input++>>\n\n");
			}
		}while(true);

	}
//hi;

}
