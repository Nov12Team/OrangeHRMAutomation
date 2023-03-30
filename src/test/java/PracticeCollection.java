
import java.util.*;

public class PracticeCollection {
	
	public static void main(String[] args) {
		System.out.println("--------------Arraylist---------------");
	
		//List 
		ArrayList al = new ArrayList();   // 10
		al.add(111);
		al.add("test");
		al.add(true);
		al.add('a');
		al.add(111);
		al.add(null);
		al.add(null);
		al.add(1, 222);
		System.out.println(al);
	//	System.out.println(al.get(1));
	Iterator itr = al.iterator();
	
	while(itr.hasNext())   //0-->1-->2-----6-->false
	{
		System.out.println(itr.next());
		
	}
		
		System.out.println("-----------------LinkedList------------");
	
		LinkedList ll = new LinkedList();
		ll.add(111);  // (0,1)
		//222  (1,2)
		ll.add("test"); // (2,3)  
		ll.add(true);
		ll.add('a');
		ll.add(111);
		ll.add(null);
		ll.add(null);
		ll.add(1, 222);
		System.out.println(ll);
		
		System.out.println("-----------------Vector------------");
		
		Vector v = new Vector();
		v.add(111);
		v.add("test");
		v.add(true);
		v.add('a');
		v.add(111);
		v.add(null);
		v.add(null);
		v.add(1, 222);
		System.out.println(v);
	//add();	 to add the data in collection object
	// remove(); to delete specific data from collection 	
	// get();   to get/retrieve the data from collection	
System.out.println("-----------------------------");
	//set	
	HashSet hs = new HashSet();
	hs.add(111);
	hs.add("test");
	hs.add(true);
	hs.add('a');
	hs.add(111);
	hs.add(null);
	hs.add(null);
	hs.add(null);
	System.out.println(hs);

System.out.println("----------------HashSet-------------");
	
	HashSet hs2 = new HashSet();
	hs2.addAll(al);             // adding one collection into another 
	System.out.println(hs2);

System.out.println("-----------------LinkedHashSet------------");

	
	LinkedHashSet linkedHS = new LinkedHashSet();
	linkedHS.add(111);
	linkedHS.add("test");
	linkedHS.add(true);
	linkedHS.add('a');
	linkedHS.add(111);
	linkedHS.add(null);
	linkedHS.add(null);
	linkedHS.add(null);
	System.out.println(linkedHS);
	
	HashSet hs3 = new HashSet();
	hs3.add("aa");
	hs3.add("cc");
	hs3.add("bb");
	hs3.add("abc");
	System.out.println(hs3);
	
System.out.println("-----------------TreesSet------------");
	
	TreeSet ts = new TreeSet();
	ts.add(11);
	ts.add(33);
	ts.add(22);
	ts.add(10);
	ts.add(11);
	System.out.println(ts);
	
	ArrayList al2 = new ArrayList();
	al2.addAll(ts);
	System.out.println(al2.get(2));
	
	}

}
