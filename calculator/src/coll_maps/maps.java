package coll_maps;

import java.util.*;


public class maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map m=new HashMap();// creating the map class object
		System.out.println("Map Example");
		m.put(1,6);  // to add elements to map object 
	    m.put(5,3);  
	    m.put(2,2);  
	    m.put(6,1);
	    
	    //converting map object to set type to travese 
	    Set set=m.entrySet();
	    
	    Iterator itr=set.iterator(); 
	    
	    while(itr.hasNext()){  
	          
	        Map.Entry entry=(Map.Entry)itr.next();  //Converting to Map.Entry so that we can get key and value separately
	        System.out.println(entry.getKey()+" "+entry.getValue()); 
	        //getKey() -- to get the key value
	        //getValue() -- to get the associated value to the key
	    } 
	    

	}

}
