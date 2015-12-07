package lap2;

import java.util.*;

import lap12.Vertex;


public class PowerSet {
	
	public PowerSet(LinkedList<Vertex> vertices){
		//PowerSet p = new PowerSet();
		powerSet(vertices);
	}
	public static void main(String[] args) {
		 
		/*List<Integer>l = Arrays.asList(1,2,5,7,4);
		
		System.out.println(powerSet(l));
		*/
		
		
List<Integer>l = new ArrayList<>();
l.add(2);
l.add(3);
l.add(4);
l.add(5);
//l.add(1);
		
		System.out.println(powerSet(l));
		
	}
	
	public static <T> List<Set<T>> powerSet(List<T> X) {
		List<Set<T>> P = new ArrayList<Set<T>>();
		Set<T> S = new HashSet<T>();
		P.add(S);
		if(X.isEmpty()) {
			return P;
		}
		else {
			while(!X.isEmpty()) {
				T f = X.remove(0);
				List<Set<T>> temp = new ArrayList<Set<T>>();
				for(Set<T> x : P) {			
					temp.add(x);
				}
				for(Set<T> x : temp) {
					S = new HashSet<T>();
					S.add(f);
					S.addAll(x);
					P.add(S);					
				}					
			}			
		}
		
		/*for(Set<T> x : P) {			
			//temp.add(x);
			if(x.size()==2)
				return P;
		}*/
	return P;	
		//return null;
	}
}
