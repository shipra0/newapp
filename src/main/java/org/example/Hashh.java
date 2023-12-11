package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Hashh {
    public static void main(String[] args){
      List<Integer> list1 = new ArrayList<>();
      list1.add(1);
      list1.add(2);
      list1.add(3);
      list1.add(3);
      list1.add(1);

       List<Integer> list2 = new ArrayList<>();
       list2.add(1);
       list2.add(2);
       list2.add(1);
       list2.add(1);
       list2.add(3);
       list2.add(4);

       List<Integer> list3= new ArrayList<>();
        HashSet<Integer> set = new HashSet<>(list1);

        for(Integer in : list2){
            if(set.contains(in)){
                list3.add(in);
                set.remove(in);
            }
        }
        System.out.println(list3);




    }
}
