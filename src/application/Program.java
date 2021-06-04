package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Vehicle;

public class Program {
	
	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 03/06/2021
		//Last edition: 
		Scanner in = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Vehicle veh = new Vehicle();
		
		System.out.println("#Rental vehicle system#");
		try {
			System.out.print("Which vehicle would you like to rent (M/C)? ");//Car or Motorcycle
			Character typeVehicle = in.next().charAt(0);
			if (veh.processInfo(typeVehicle) == true) {
				
			} else {
				
			}
			System.out.print("Initial date (DD/MM/YYYY HH:MM): ");
			Date initalDate = sdf.parse(in.next());
		} 
		catch(ParseException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		in.close();
	}
}
