package RinkuSirPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class EnteryInterace {

	public static void main(String[] args) {
		HashMap hs=new HashMap();
		hs.put(1, "A");
		hs.put(2,"B");
		hs.put(3, "C");
		hs.put(4, "D");
		hs.put(5, "E");
		Set st=hs.entrySet();
		Iterator itr=st.iterator();	
		boolean hn=itr.hasNext();
	    System.out.println();
	}
	

}
