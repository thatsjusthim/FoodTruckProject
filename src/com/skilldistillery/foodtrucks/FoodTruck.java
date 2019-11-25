package com.skilldistillery.foodtrucks;

public class FoodTruck {
	
	//F i e l d s 
	private String name;
	private String typeOfFood;
	private int numericId;
	private int rating;
	static int nextId = 1; 	//Having only one static method does not mean you can't use static fields
	FoodTruck[] foodTrucks = new FoodTruck[5];
	
	//M e t h o d s
	//get data, call constructor, store an array. The data is (create variables, receive data for variables, 
	//then call constructor. create variables inside the for loop get the data for those variables, 
	//call the for loop for the data.
	//need non static and a static id field, this is the hard part of the assignment, the numericId.
	//First create the food truck, then try to print out all of the information for one food truck. Once created,
	//truck.numericId = numericId
	//toString takes the data from the food truck and turns it into string representation;
	//private static int nextfoodtruckId, this one wants to be started with the value 1,
	//once the value of 1 is changed its changed for all following nextfoodtruckIds.

	
	//C o n s t r u c t o r s
	
	public FoodTruck(String name, String typeOfFood, int rating) {
		this.name = name;
		this.typeOfFood = typeOfFood;
		this.rating = rating;
		this.numericId = nextId;
		nextId++;
	}
	
	public FoodTruck() {
		this.numericId = nextId;
		nextId++;
	}
	

	@Override
	public String toString() {
		return "FoodTruck name=" + name + ", typeOfFood=" + typeOfFood + ", numericId=" + numericId + ", rating="
				+ rating;
	}
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeOfFood() {
		return typeOfFood;
	}

	public void setTypeOfFood(String typeOfFood) {
		this.typeOfFood = typeOfFood;
	}

	public int getNumericId() {
		return numericId;
	}

	public void setNumericId(int numericId) {
		this.numericId = numericId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
