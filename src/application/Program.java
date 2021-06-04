package application;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 03/06/2021
		//Last edition: 
		Scanner in = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.println("#Rental vehicle system#");
		System.out.println("Which vehicle would you like to rent (M/C)?");//Car or Motorcycle
		Character typeVehicle = in.next().charAt(0);
		in.close();
	}
}
