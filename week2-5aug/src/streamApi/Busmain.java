package streamApi;
import java.util.*;

public class Busmain {
	public static void main(String[] args)
	{

	List<Bus> busList = new ArrayList<>();

    busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
    busList.add(new Bus(101, "Abc Travels", 100.22, 2.4f));
    busList.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
    busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
    busList.add(new Bus(104, "Java Travels", 900.22, 4.3f));
    busList.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));
    
    Collections.sort(busList,(Bus b1,Bus b2)->{
    	Float f1=b1.getRating();
    	Float f2=b2.getRating();
    	int x=f1.compareTo(f2);
    	if(x==0)
    	{
    		Double d1=b1.getCost();
    		Double d2=b1.getCost();
    		x=d1.compareTo(d2);
    		}
    	return x;
    });
    //public static void printBusList(List<>) {
    	
  //  }
   // System.out.print(bus);
   // System.out.println();
    double minPrice = busList.stream().filter(e -> e.getProviderName().equals("Abc Travels")).map(e -> e.getCost()).reduce(Double.MAX_VALUE, (min, price) -> Math.min(min, price));
    //double minPrice2 = busList.stream().filter(e -> e.getProviderName().equals("Xyz Travels")).map(e -> e.getCost()).min(Double::compare).get();

    System.out.println("Minimum price : " + minPrice);

}
}

