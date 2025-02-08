package edu.neu.csye6200;

public class FoodItemFactory {
	
	public FoodItemFactory() {
    }

    public FoodItem createFromCSV(String csv) {
        return new FoodItem(csv);
    }

}
