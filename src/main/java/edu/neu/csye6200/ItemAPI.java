package edu.neu.csye6200;

public class ItemAPI {
	
	private String Name;
    private double Price;
    private String Location;
    private int ID;

    public int getID() {
        return this.ID;
    }

    public void setID(int iD) {
        this.ID = iD;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public void setLocation(String location) {
        this.Location = location;
    }

    public String getName() {
        return this.Name;
    }

    public double getPrice() {
        return this.Price;
    }

    public String getLocation() {
        return this.Location;
    }

    public String toString() {
        return "ItemAPI [Name=" + this.Name + ", Price=" + this.Price + ", Location=" + this.Location + ", ID" + this.ID + " ]";
    }

    public ItemAPI(String Name, double Price, String Location, int ID) {
        this.Name = Name;
        this.Price = Price;
        this.Location = Location;
        this.ID = ID;
    }

}
