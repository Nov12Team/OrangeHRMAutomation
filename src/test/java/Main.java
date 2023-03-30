import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
	
		HashMap hs = new HashMap();
		hs.put("Name", "Ram");
		hs.put("ID", 1234);
		hs.put("Address", "ABCD");
		hs.put("Designation", "QA");
		hs.put(true, null);
		hs.put(11, "This is the number");
		hs.put(null, "this value is null");
		hs.put(null, "this is second null value");
		hs.put(12, null);
		
		System.out.println(hs.get("Name"));
		System.out.println(hs.get("Designation"));
		System.out.println(hs);
		
		Hashtable ht = new Hashtable();
		ht.put("Name", "Ram");
		ht.put("ID", 1234);
		ht.put("Address", "ABCD");
		ht.put("Designation", "QA");
		ht.put(true, "Yes");
		ht.put(11, "This is the number");		
		ht.put(11, "This is the second number");
		
		
		System.out.println(ht);
		System.out.println("Just for git test");
	}

}
