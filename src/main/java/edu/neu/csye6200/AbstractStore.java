package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractStore {
	
	protected List<ItemAPI> items = new ArrayList();

    public AbstractStore() {
    }

    public void addItem(ItemAPI item) {
        this.items.add(item);
    }

    public abstract void sortItemsById();

    public abstract void sortItemsByName();

    public abstract void sortItemsByPrice();


}
