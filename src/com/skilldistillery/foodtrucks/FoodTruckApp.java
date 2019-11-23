package com.skilldistillery.foodtrucks;

public class FoodTruckApp {
		//Fields
	
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	
		FoodTruck[] foodTrucks = new FoodTruck[5]; //This stays outside for access to all methods;
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
//			FoodTruck foodTruck = new FoodTruck(); //scanner input inputs data into variables, 
//			foodTruck.setName(foodTruckName);
//			foodTruck.setTypeOfFood(typeOfFood);
//			foodTruck.setRating(rating);
			FoodTruck foodTruck = new FoodTruck(foodTruckName, typeOfFood, rating);
			System.out.println(foodTruck);
		}
		

		}
		

}
