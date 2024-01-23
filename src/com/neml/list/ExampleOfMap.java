package com.neml.list;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ExampleOfMap {

	public static void main(String[] args) {
		
		Map<Object,String> mapOf = new HashMap<>();
		
		Map DupMap = new HashMap<>();
		mapOf.put(2501,"U2501");
		mapOf.put(2405,"U2405");
		System.out.println(mapOf.values());

		List<Object> listBy = mapOf.entrySet().stream().map(Map.Entry::getKey).collect(Collectors.toList());
		
		System.out.println(listBy);
		
//		boolean result = mapOf.containsKey(2501);
//		System.out.println(result);
//		System.out.println(mapOf);
//		Object valueOf = mapOf.get(2501);
//		System.out.println(valueOf);
//		mapOf.keySet();
//		System.out.println(DupMap);
//		System.out.println(mapOf.get(2501));
//		
//		Set setMap = mapOf.keySet();
//		System.out.println(setMap);
//		Set setMap1 = mapOf.entrySet();
//		System.out.println(setMap1);
//		
//		Object value2 = mapOf.getOrDefault(2344, "U2344");
//		System.out.println(value2);
//		
//		System.out.println(mapOf.entrySet());
//		
		
		
	}

}
