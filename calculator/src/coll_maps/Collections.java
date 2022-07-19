package coll_maps;

import java.util.*; 

public class Collections {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();//Creating arraylist 
		
		list.add(1);//Adding object in arraylist  
		list.add(2);  
		list.add(3);  
		list.add(4);  
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(200);
		
		list.addAll(l);//to add another list
		
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  // creating iretator object to iterate over a list
		while(itr.hasNext()){  
		System.out.println(itr.next()); }
		
		 LinkedList<String> ll = new LinkedList<String>();
		 
		 ll.add("a"); //Add elements to linked list
	        ll.add("B");
	        ll.addLast("f");
	        ll.addFirst("D");
	        ll.add(2, "t");
	  
	        System.out.println(ll);
	        
	        ll.remove("B"); // remove elemets by value
	        ll.remove(3); // remove elements by index
	       
	  
	        System.out.println(ll);
		}  

	}


