package com.bilgeadam.boost.week5.lesson1.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {
	
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		
		users.add(new User(56,"Samet"));
        users.add(new User(2,"Ahmet"));
        users.add(new User(3,"Zehra"));
        users.add(new User(4,"Murat"));
        users.add(new User(5,"Yildiz"));
        users.add(new User(6,"Levent"));
        users.add(new User(7,"Elvan"));
        
        for (User user : users) {
        	System.out.println(user);
		}
        
        System.out.println("\n************");
        
        users.stream().forEach(user -> System.out.println(user));
		
        System.out.println("\n************");
        
        users.stream().forEach(user -> {
        	System.out.println(user);
        });
        
        System.out.println("\n************");
        
        users.stream().forEach(user -> user.talk());
        
        System.out.println("\n************");
        
        //lambda
        users.stream().forEach(User::talk);
        System.out.println("\n************");
        
        //id si 5ten büyük
        int count = (int) users.stream()
        		.filter(user -> user.getKey()>5)
        		.count();
        
        System.out.println(count);
        
        List <User> filtredList = users.stream()
        		.filter(user -> user.getKey()>5)
        		.collect(Collectors.toList());
        
        filtredList.stream().forEach(user -> user.talk());
        
        //map methot
        
        System.out.println();
        
        List <User> mapList = users.stream().map(user -> new User(user.getKey()+100,user.getName()))
        	.collect(Collectors.toList());
        
        mapList.stream().forEach(user -> System.out.println(user));
        
        //toMap list
        System.out.println();
        Map<Integer,String> userMap = users.stream()
        		.collect(Collectors.toMap(user -> user.getKey(), user -> user.getName()));
        userMap.forEach((key,value) -> System.out.println(key+" "+value));
	}

}
