package edu.neu.csye6200;

public class ServiceItemFactory {
	
	private static final ServiceItemFactory instance = new ServiceItemFactory();

//  ServiceItemFactory is an Eager Singleton, which means the instance is created at the time of class loading.

  private ServiceItemFactory() {
  }

  public static ServiceItemFactory getInstance() {
      return instance;
  }

  public ServiceItem createFromCSV(String csv) {
      return new ServiceItem(csv);
  }

}
