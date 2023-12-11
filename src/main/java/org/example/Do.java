package org.example;
import java.util.*;
import java.util.ArrayList;

public class Do {
    public static void main(String[]args){
        int count = 10;
        do{
            System.out.println("count is"+ count);
            count++;
        }
        while(count<=10);

        System.out.println("for loop");
        for(int i = 1;i<10;i++){
            System.out.println(i);
        }
        System.out.println("while loop");
        int countt = 1;
        while(countt<10){
            System.out.println(countt);
            countt++;
        }
        System.out.println("for each loop or enhanced loop");
        int numbers[]= {1,2,3,4,5,6,7,8,9};
        for(int i : numbers){
            System.out.println(i);
        }
        System.out.println("nested for loop");

        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();

        }
        System.out.println("Arraylist");
        List<Integer> arraylist = new ArrayList<>(5);
        for(int i = 1;i<=5;i++){
            arraylist.add(i);

        }
        //printing elements
        System.out.println(arraylist);

        //remove element at index 3
        arraylist.remove(3);

        //Display the Arraylist
        //after deletion
        System.out.println(arraylist);

        //printing elements one by one
        for(int i =0;i<arraylist.size();i++){
            System.out.print(arraylist.get(i)+ " ");
        }
System.out.println("for enhanced loop");
        for(int i: arraylist){
            System.out.print(i+" ");
        }

        System.out.println("LinkedList");
        LinkedList<String> list = new LinkedList();
        list.add("A");
        list.add("B");
        System.out.println(list);

        list.addLast("C");
        System.out.println(list);

        list.addFirst("D");
        System.out.println(list);

        list.add(2,"E");
        System.out.println(list);

        list.remove("B");
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        System.out.println("Hashset");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        boolean r1 = hashSet.add("C");
        System.out.println(r1);
        boolean r2 = hashSet.add("C");
        System.out.println(r2);
        System.out.println(hashSet);

        System.out.println("list contains C or not"+hashSet.contains("C"));

        hashSet.remove("A");
        System.out.println("Set after deleting A"+ hashSet);

        for(String item : hashSet){
            System.out.println(item);
        }
        System.out.println("Treeset");
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("C");
        treeSet.add("B");
        treeSet.add("A");
        System.out.println(treeSet);

        System.out.println("Map ");
        Map<String,Integer> map = new HashMap<>();
        map.put("a",10);
        map.put("b",20);
        map.put("c",30);
        map.put("d",40);
        System.out.println("Size of map is :"+map.size());
        System.out.println(map);

        if(map.containsKey("a")){
            Integer a = map.get("a");
            System.out.println("a");
            System.out.println("value for key"+ a);
        }
        for(String key : map.keySet()){
            System.out.println("key"+ key +"value"+ map.get(key));
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
System.out.println("Treemap");
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(2,"A");
        treeMap.put(1,"B");
        treeMap.put(3,"C");
        System.out.println(treeMap);

        System.out.println("Stack");
        Stack<String> stack = new Stack<>();
        stack.push("America");
        stack.push("Germany");
        stack.push("India");
        System.out.println(stack);

        String poopedElement = stack.pop();
        System.out.println(poopedElement);
        System.out.println(stack);

        String poopedElement1 = stack.peek();
        System.out.println("Show the top most element"+poopedElement1);
        System.out.println(stack);

        System.out.print("Queue.........");
        Queue<String> queue = new PriorityQueue<>();
        queue.add("India");
        queue.add("Germany");
        queue.add("America");

        System.out.println("original queue"+ queue);

        queue.remove();
        System.out.println(queue);

        String head = queue.peek();
        System.out.println("to show head element"+head);

        head = queue.poll();
        System.out.println("to remove head element and also show removing element"+head);

        System.out.println("queue now looks like this"+ queue);
    }
}
