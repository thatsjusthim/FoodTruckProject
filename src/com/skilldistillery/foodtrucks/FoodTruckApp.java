package com.skilldistillery.foodtrucks;

import java.util.Arrays;

public class FoodTruckApp {
	// Fields

	java.util.Scanner scanner = new java.util.Scanner(System.in);

	FoodTruck[] foodTrucks = new FoodTruck[5]; // This stays outside for access to all methods;

	public static void main(String[] args) {

		FoodTruckApp fta = new FoodTruckApp();

		fta.run();

	}

	public void run() {
		String stopInput = "quit";
		String foodTruckName = null;
		for (int i = 0; i < foodTrucks.length; i++); 
		do{
			System.out.print("Welcome, please tell me the name of the food truck you'd like to rate. ");
			foodTruckName = scanner.next();
			System.out.print("What type of food does this truck serve? ");
			String typeOfFood = scanner.next();
			System.out.print("How would you rate this truck overall? ");
			double rating = scanner.nextDouble();

			FoodTruck foodTruck = new FoodTruck(foodTruckName, typeOfFood, rating);
			System.out.println(foodTruck);
		}while(stopInput != foodTruckName);
		
			
			System.out.println("");
			System.out.println("Welcome to the Food Truck Directory!");
			System.out.println("Press 1 to show all food trucks listed.");
			System.out.println("Press 2 to get the average rating for all food trucks.");
			System.out.println("Press 3 to show the highest rated food truck with more information.");
			System.out.println("Press 4 to quit input and continue. ");
		
		}
	

//
//	}
	
	public String toString() {
		return "FoodTruckApp [scanner=" + scanner + ", foodTrucks=" + Arrays.toString(foodTrucks) + "]";
	}


		{
		}
		}