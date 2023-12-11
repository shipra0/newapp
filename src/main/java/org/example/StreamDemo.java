package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class StreamDemo {
    public static void main(String args[]){
        List<Integer> abc = new ArrayList<>();
        abc.add(10);
        abc.add(20);
        abc.add(30);

        List<Integer> itr = new ArrayList<>();
        for(Integer i : abc){
            itr.add(i*i);

        }
        System.out.println(itr);

//        List<Integer> new = abc.stream().map(x-> x*x).collect(Collectors.toList());
//        System.out.println(new);

        System.out.println("set streams");
        Set<Integer> ac = new HashSet<>();
        ac.add(20);
        ac.add(30);
        ac.add(40);

        Set<Integer> ab = new HashSet<>();
        for(Integer i : ac){
            ab.add(i*i);


        }
        System.out.print(ab);

        System.out.println("with streams");
//        Set<Integer> a = ac.stream().map(x-> x*x).collect(Collectors.toSet());
//        System.out.println(a);

        System.out.println("filter method of stream and without stream");
        List<String> filter = new ArrayList<>();
        filter.add("shipra");
        filter.add("jhia");
        filter.add("Ss");
//
//        List<String> ne = new ArrayList<>();
//        for(String i : filter){
//            if(i.startsWith("j")){
//                ne.add(i);
//            }
//
//
//        }
//        System.out.println(ne);


       // List<String> str = filter.stream().filter(x-> x.startsWith("j")).collect(Collectors.toList());

       // List<String> sort = filter.stream().sorted().collect(Collectors.toList());

        System.out.println("to iterate in stream");

        //List<Integer> b = filter.stream().forEach(i->System.out.println(i));

        //whenever you have to change the representation of collection into a single result
        //you can use reduce method

      //  int sum = filter.stream().reduce(0,(ans,i)->ans+i);
    }


}
