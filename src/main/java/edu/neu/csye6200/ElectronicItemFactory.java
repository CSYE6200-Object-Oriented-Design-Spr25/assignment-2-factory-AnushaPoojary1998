package edu.neu.csye6200;

public class ElectronicItemFactory {
	
	private static ElectronicItemFactory instance;
//  ElectronicItemFactory is a Lazy Singleton, which means the instance is created only when it is needed

  private ElectronicItemFactory() {
  }
//  getInstance method ensures that only one instance of the factory is created

  public static ElectronicItemFactory getInstance() {
      if (instance == null) {
          instance = new ElectronicItemFactory();
      }

      return instance;
  }

  public ElectronicItem createFromCSV(String csv) {
      return new ElectronicItem(csv);
  }
	

}
