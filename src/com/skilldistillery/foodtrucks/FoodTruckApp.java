package com.skilldistillery.foodtrucks;

public class FoodTruckApp {

	java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		FoodTruckApp fta = new FoodTruckApp();

		fta.run();

	}

	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.print("Welcome, please tell me the name of the food truck you'd like to rate. ");
			String foodTruckName = scanner.next();
			System.out.print("What type of food does this truck serve? ");
			String typeOfFood = scanner.next();
			System.out.print("How would you rate this truck overall? ");
			double rating = scanner.nextDouble();
			FoodTruck foodTruck = new FoodTruck();
			foodTruck.setName(foodTruckName);
			foodTruck.setTypeOfFood(typeOfFood);
			foodTruck.setRating(rating);
			System.out.println(foodTruck);
			if(foodTruckName == "quit"); {
				break;
			}
			
			}
		FoodTruck[] foodTruckArr = new FoodTruck[5];
		FoodTruck firstFoodTruck = foodTruckArr[0];
		FoodTruck secFoodTruck = foodTruckArr[1];
		FoodTruck thirdFoodTruck = foodTruckArr[2];
		FoodTruck fourthFoodTruck = foodTruckArr[3];
		FoodTruck fifthFoodTruck = foodTruckArr[4];
		
		}
	}


