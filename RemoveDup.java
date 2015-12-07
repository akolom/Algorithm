package lap2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class RemoveDup {
	
	public static void main(String[] args) {
		
		
		List<Integer>l = Arrays.asList(2,4,3,4);
		
		System.out.println(removeDup(l));
	}

	private static List<Integer> removeDup(List<Integer> l) {
		
	List<Integer>	m = new ArrayList<>();
	
	for(int i = 0; i<l.size(); i ++){
		if(!m.contains(l.get(i))){
			m.add(l.get(i));
		}
	}
	
	return m;
		
	}

}
