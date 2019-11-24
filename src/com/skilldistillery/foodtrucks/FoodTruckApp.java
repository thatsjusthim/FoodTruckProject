package com.skilldistillery.foodtrucks;

import java.util.Arrays;
import java.util.Scanner;

public class FoodTruckApp {
	// Fields

	Scanner scanner = new Scanner(System.in);

	static FoodTruck[] foodTrucks = new FoodTruck[5]; // This stays outside for access to all methods;
	
	public static void main(String[] args) {
		
		FoodTruckApp fta = new FoodTruckApp();

		fta.run();

	}

	public void run() {

		for (int i = 0; i < foodTrucks.length; i++) {
			System.out.print("Welcome, please tell me the name of the food truck you'd like to rate. ");
			String foodTruckName = scanner.next();
			System.out.print("What type of food does this truck serve? ");
			String typeOfFood = scanner.next();
			System.out.print("How would you rate this truck overall? ");
			double rating = scanner.nextDouble();
//			FoodTruck foodTruck = new FoodTruck(); //scanner input inputs this data into variables
//			foodTruck.setName(foodTruckName);
//			foodTruck.setTypeOfFood(typeOfFood);
//			foodTruck.setRating(rating);
			FoodTruck foodTruck = new FoodTruck(foodTruckName, typeOfFood, rating);
			System.out.println(foodTruck);
		}
		Arrays.fill(foodTrucks, foodTrucks);
			System.out.println("");
			System.out.println("Welcome to the Food Truck Directory!");
			System.out.println("Press 1 to show all food trucks listed.");
			System.out.println("Press 2 to get the average rating for all food trucks.");
			System.out.println("Press 3 to show the highest rated food truck with more information.");
			System.out.println("Press 4 to quit input and continue. ");	
		
			
		System.out.print("Enter a choice: ");
		int choice = scanner.nextInt();

		// 1. Comment out the break; statements for case "A" and "B".
		//    Run the program. What output do you notice?
		// 2. Move the entire default case before case "A":
		//    Run the program. What output do you notice?
		switch (choice) {
		default:
			System.out.println("That's not a grade");
		case 1:
			System.out.println(Arrays.toString(foodTrucks));
			break;
		case 2:
			System.out.println("Good job");
			break;
		case 3:
			System.out.println("Doing alright");
			break;
		case 4:
			System.out.println("Thank you for stopping by! Terminating program.");
			break;
		}
		
		scanner.close();
	}
	
	public String toString() {
		return "FoodTruckApp [scanner=" + scanner + ", foodTrucks=" + Arrays.toString(foodTrucks) + "]";
	}

	



		{
		}
		}