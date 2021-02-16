import java.util.*;

public class Example {
	
	public static void main(String []args){
		
		Book b1=new Book("Novels", 500);
		Book b2=new Book("Technicals", 600);
		Book b3=new Book("medecine", 10000);
		
		TreeSet t=new TreeSet(new MyComparator());
		
		t.add(b1);
		t.add(b2);
	    t.add(b3);
		
		Iterator it=t.iterator();
		Book b;
		while(it.hasNext()){
			b=(Book)it.next();
			System.out.println(b.getPrice() +"     "+b.getTitle());
		}
	}
	
}