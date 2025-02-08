package edu.neu.csye6200;

public class FoodItem extends ItemAPI{
	
	private String Type;

    public String toString() {
        String var10000 = this.getName();
        return "FoodItem [Name=" + var10000 + ", Price=" + this.getPrice() + ", Location=" + this.getLocation() + ", Type=" + this.Type + ", ID=" + this.getID() + "]";
    }

    public FoodItem(String csvLine) {
        super((String)null, 0.0, (String)null, 0);
        String[] parts = csvLine.split(",");
        if (parts.length != 5) {
            throw new IllegalArgumentException("Invalid CSV line for Item: " + csvLine);
        } else {
            this.setName(parts[0]);
            this.setPrice(Double.parseDouble(parts[1]));
            this.setLocation(parts[2]);
            this.Type = parts[3];
            this.setID(Integer.parseInt(parts[4]));
        }
    }

}
