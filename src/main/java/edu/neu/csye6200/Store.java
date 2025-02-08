package edu.neu.csye6200;

import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Store extends AbstractStore{
	
	public Store() {
    }

    public void sortItemsById() {
        Collections.sort(this.items, Comparator.comparing(ItemAPI::getID));
    }

    public void sortItemsByName() {
        Collections.sort(this.items, Comparator.comparing(ItemAPI::getName));
    }

    public void sortItemsByPrice() {
        Collections.sort(this.items, Comparator.comparingDouble(ItemAPI::getPrice));
    }

    public void demo() {
        System.out.println("Store Information: " + toString());
        Store inventory = new Store();
        Path filename = Paths.get("FoodItem.txt");
        List<String> foodCSV = FileUtil.readfile(filename); //to create and read file
        FoodItemFactory foodFactory = new FoodItemFactory();
        Iterator var5 = foodCSV.iterator();

        while(var5.hasNext()) {
            String csvLine = (String)var5.next();
            FoodItem item = foodFactory.createFromCSV(csvLine);
            inventory.addItem(item);
        }

        Path filename1 = Paths.get("ElectronicItem.txt");
        List<String> electronicCSV = FileUtil.readfile(filename1); //to create and read file
        ElectronicItemFactory electronicFactory = ElectronicItemFactory.getInstance();
        Iterator var8 = electronicCSV.iterator();

        while(var8.hasNext()) {
            String csvLine = (String)var8.next();
            ElectronicItem item = electronicFactory.createFromCSV(csvLine);
            inventory.addItem(item);
        }

        Path filename2 = Paths.get("ServiceItem.txt");
        List<String> serviceCSV = FileUtil.readfile(filename2); // to create and read file
        ServiceItemFactory serviceFactory = ServiceItemFactory.getInstance();
        Iterator var11 = serviceCSV.iterator();

        while(var11.hasNext()) {
            String csvLine = (String)var11.next();
            ServiceItem item = serviceFactory.createFromCSV(csvLine);
            inventory.addItem(item);
        }

        List<ItemAPI> itemsToDisplay = new ArrayList(inventory.items);
        System.out.println("\n====================Store Information Before Sorting:========================\n");
        PrintStream var10001 = System.out;
        Objects.requireNonNull(var10001);
        itemsToDisplay.forEach(var10001::println);
        System.out.println("\nStore Information After Sorting by ID:");
        inventory.sortItemsById();
        List<ItemAPI> itemsSortedById = new ArrayList(inventory.items);
        Iterator var25 = itemsSortedById.iterator();

        while(var25.hasNext()) {
            ItemAPI item = (ItemAPI)var25.next();
            System.out.println(item);
        }

        System.out.println("\nStore Information After Sorting by Name:");
        inventory.sortItemsByName();
        List<ItemAPI> itemsSortedByName = new ArrayList(inventory.items);
        Iterator var27 = itemsSortedByName.iterator();

        ItemAPI item;
        while(var27.hasNext()) {
            item = (ItemAPI)var27.next();
            System.out.println(item);
        }

        System.out.println("\nStore Information After Sorting by Price:");
        inventory.sortItemsByPrice();
        List<ItemAPI> itemsSortedByPrice = new ArrayList<>(inventory.items);

        for (ItemAPI sortedItem : itemsSortedByPrice) {
            System.out.println(sortedItem);
        }
    }

}
