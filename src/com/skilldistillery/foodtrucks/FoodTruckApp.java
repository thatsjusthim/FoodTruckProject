package com.skilldistillery.foodtrucks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FoodTruckApp {
	// Fields

	Scanner scanner = new Scanner(System.in);

	FoodTruck[] foodTrucks = new FoodTruck[5]; // This stays outside for access to all methods;

	public static void main(String[] args) {

		FoodTruckApp fta = new FoodTruckApp();

		fta.run();

	}

	public void run() {
		int counter = 0;
		int avgRating = 0;
		FoodTruck bestFoodTruck = new FoodTruck();
		for (int i = 0; i < foodTrucks.length; i++) {
			System.out.print("Welcome, please tell me the name of the food truck you'd like to rate. ");
			String foodTruckName = scanner.next();
			if (foodTruckName.equalsIgnoreCase("quit")) {
				break;
			}
			counter++;
			System.out.print("What type of food does this truck serve? ");
			String typeOfFood = scanner.next();
			System.out.print("How would you rate this truck overall? ");
			int rating = scanner.nextInt();
//			FoodTruck foodTruck = new FoodTruck(); //scanner input inputs this data into variables
//			foodTruck.setName(foodTruckName);
//			foodTruck.setTypeOfFood(typeOfFood);
//			foodTruck.setRating(rating);
			// could use null statements as blocks

			FoodTruck foodTruck = new FoodTruck(foodTruckName, typeOfFood, rating);
			foodTrucks[i] = foodTruck; // Needed to be input in order to fill the array.
			System.out.println(foodTruck);
		}

		System.out.println("");
		System.out.println("Welcome to the Food Truck Directory!");
		System.out.println("Press 1 to show all food trucks listed.");
		System.out.println("Press 2 to get the average rating for all food trucks.");
		System.out.println("Press 3 to show the highest rated food truck with more information.");
		System.out.println("Press 4 to quit input and continue. ");

		System.out.print("Enter a choice: ");
		int choice = scanner.nextInt();

		// 1. Comment out the break; statements for case "A" and "B".
		// Run the program. What output do you notice?
		// 2. Move the entire default case before case "A":
		// Run the program. What output do you notice?

		switch (choice) {
			case 1:
				System.out.println(Arrays.toString(foodTrucks));
				break;
			case 2:
				for (int i = 0; i < counter; i++) {
					avgRating += foodTrucks[i].getRating();
				}
				avgRating = avgRating / counter;
				System.out.println(avgRating);
				avgRating = 0;
				break;
			case 3:
				bestFoodTruck = foodTrucks[0];
				for (int i = 0; i < counter; i++) {
					if (foodTrucks[i].getRating() > bestFoodTruck.getRating()) {
						bestFoodTruck = foodTrucks[i];
					}
				}
				break;
			case 4:
				System.out.println("Thank you for stopping by! Terminating program.");
				break;
			default:
				System.out.println("Please choose options 1 - 4.");
		}
		scanner.close();
	}

	public String toString() {
		return "FoodTruckApp [scanner=" + scanner + ", foodTrucks=" + Arrays.toString(foodTrucks) + "]";
	}

	{
	}
}