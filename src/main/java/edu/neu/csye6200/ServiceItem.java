package edu.neu.csye6200;

public class ServiceItem extends ItemAPI{
	
	private int SID;

    public ServiceItem(String csvLine) {
        super((String)null, 0.0, (String)null, 0);
        String[] parts = csvLine.split(",");
        if (parts.length != 5) {
            throw new IllegalArgumentException("Invalid CSV line for Item: " + csvLine);
        } else {
            this.setName(parts[0]);
            this.setPrice(Double.parseDouble(parts[1]));
            this.setLocation(parts[2]);
            this.SID = Integer.parseInt(parts[3]);
            this.setID(Integer.parseInt(parts[4]));
        }
    }

    public String toString() {
        String var10000 = this.getName();
        return "ServiceItem [Name=" + var10000 + ", Price=" + this.getPrice() + ", Location=" + this.getLocation() + ", Service ID=" + this.SID + ", ID=" + this.getID() + "]";
    }

}
