package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> map = new HashMap();
		
		// 1.put --> (Insert key and values)
		map.put(101, "Priyanka");
		map.put(102, "Nana");
		map.put(103, "Onkar");
		map.put(104, "Avishkar");
//		map.put(104,"Ravi");
//		map.put(105,null);
		System.out.println(map);
		System.out.println("=====================================================");
		
		// 2.clear()
//		map.clear();
//		System.out.println("Clear: "+map);
		
		// 3.containesKey()
		System.out.println("containsKey(): "+map.containsKey(102));
		
		// 4.containesValue()
		System.out.println("containsValue(): "+map.containsValue("Nana"));
		
		// 5.entrySet() -- > (Return the Set)
		System.out.println("SET(): "+map.entrySet());
		
		// 6.get() --> (According to KEY)
		System.out.println("get(): "+map.get(103));
		
		// 7.isEmpty()
		System.out.println("isEmpty(): "+map.isEmpty());
		
		// 8.keySet() ---> (Return All Key)
		System.out.println("keySet(): "+map.keySet());
		
		System.out.println("=====================================================");
		// 9.putAll() ---->(Copy all entries in new HashMap)
		Map newMap = new HashMap();
		newMap.putAll(map);
		System.out.println("newMap: "+newMap);
		
		// 10.remove()
		newMap.remove(104);
		System.out.println("remove(): "+newMap);
		
		// 11.replace()
		newMap.replace(101, "Ravi");
		System.out.println("replace(): "+newMap);
		
		// 12.size()
		System.out.println("size: "+newMap.size());
		
		// Retrieve HashMap
		// **Using Set and Iterator Interface**
		Set set = newMap.entrySet();
		Iterator itr = set.iterator();
		System.out.println(set);
		System.out.println();
		while(itr.hasNext())
		{
//			System.out.println(itr.next());
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println("KEY: "+entry.getKey()+", VALUE: "+entry.getValue());
		}
		
		// **Using for each Loop**
//		for(Map.Entry en : map.entrySet())
//		{
//			System.out.println("Key:"+en.getKey()+" "+"Value:"+en.getValue());
//		}
	}
}
