import java.util.*;
import java.util.Comparator;

public class MyComparator implements Comparator{
	public int compare(Object o1, Object o2){
		
		Book bco1=(Book)o1;
		Book bco2=(Book)o2;
		if(bco1.getPrice()<bco2.getPrice()){
			
			return (-1);
		} else return (1);
	}
}