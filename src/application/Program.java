package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.Enum.ColorEnum;
import model.entities.Car;
import model.entities.CarRental;
import model.entities.Motorcycle;
import model.entities.MotorcycleRental;
import model.entities.Vehicle;
import model.service.CarService;
import model.service.RentalService;

public class Program {

	public static void main(String[] args) {
		// Author: Joao Vitor Souza Pioner | Date: 03/06/2021
		// Last edition:
		Scanner in = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		Vehicle veh = new Vehicle();

		System.out.println("#Rental vehicle system#");
		try {
			System.out.print("Which vehicle would you like to rent (M/C)? ");// Car or Motorcycle
			Character typeVehicle = in.next().charAt(0);
			System.out.print("Color: ");
			ColorEnum color = ColorEnum.valueOf(in.next());
			System.out.print("Model: ");
			String model = in.next();
			System.out.print("Initial date (DD/MM/YYYY HH:ss): ");
			in.nextLine();
			Date initalDate = sdf.parse(in.nextLine());
			System.out.print("End date (DD/MM/YYYY HH:ss): ");
			Date endDate = sdf.parse(in.nextLine());
			if (veh.checkType(typeVehicle) == true) {
				MotorcycleRental mr = new MotorcycleRental(initalDate, endDate, new Motorcycle(color, model));
			} else {
				CarRental cr = new CarRental(initalDate, endDate, new Car(color, model));
				
				System.out.print("Enter price per hour: ");
				Double pricePerHour = in.nextDouble();
				System.out.print("Enter price per day: "); 
				Double pricePerDay = in.nextDouble();
				
				RentalService cs = new RentalService(pricePerDay, pricePerHour, new CarService());
				
				cs.calcValueCarRent(cr);
				
				System.out.println("Car rent data:");
				System.out.println("Model: " + model);
				System.out.println("Start date: " + sdf.format(initalDate));
				System.out.println("End date: " + sdf.format(endDate));
				System.out.println("\nTotal R$ " + String.format("%.2f", cs.calcValueCarRent(cr)));
			}
		} 
		catch (ParseException e) {
			System.out.println("ERROR: " + e.getMessage());
		} 
		catch (IllegalArgumentException e) {
			System.out.println("ERROR: probably you typed a wrong value at the attribute color." + "\nBLACK, WHITE, GRAY, RED.");
		}
		in.close();
	}
}
