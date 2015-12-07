package lap2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem3 {
	
	public static void main(String[] args) {
		
List<Integer>l = new ArrayList<>();
l.add(2);
l.add(3);
l.add(4);
//l.add(1);
		
		System.out.println(powerSet(l));
		
	}
	
	public static List<List<Integer>> powerSet(List<Integer> S) {
	       List<List<Integer>> sets = new ArrayList<>();
	       
	       for (int i = 0; i < S.size(); i++) {
	            List<Integer> t1= new ArrayList();
	            List<Integer> t2 = new ArrayList<Integer>();
	            List<List<Integer>> temp = new ArrayList<List<Integer>>(); 
	            
	           for (int j = 0; j < sets.size(); j++) {
	                t2 = new ArrayList<Integer>();
	                t2.addAll(sets.get(j));
	                sets.get(j).add(S.get(i));
	                temp.add(t2);
	           }
	           
	          
	           t1.add(S.get(i));
	           sets.add(t1);
	           sets.addAll(temp);
	           
	           
	       }
	       
	       return sets;
	      /* for (int i = 0; i < sets.size(); i++) {
	            //int sum =0;
	            for (int j = 0; j < sets.get(i).size(); j++) {
	               sum+=sets.get(i).get(j);
	           }
	            //if(sum==k)return true;
	       }
	      
	      // return false;
*/	   }
}
