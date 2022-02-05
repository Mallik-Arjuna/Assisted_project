package collection.framework;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


import java.util.Map.Entry;


public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String>map=new HashMap<>();
map.put(1,"Ruchi");
map.put(2,"Komal");
map.put(3,"Romal");
map.put(4,"Suchita");
map.put(5,"Ruchita");
map.put(6,"Suchi");
Set<Entry<Integer,String>>data=map.entrySet();
Iterator<Entry<Integer,String >>itr=data.iterator();
while(itr.hasNext()) {
	Map.Entry<Integer,String>entry=itr.next();
	System.out.println(entry.getKey()+""+entry.getValue());
}
	}

}
