import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class ExampleCollection {
    public static void main(String[] args) {
        System.out.println("Set Program - Hashset,Treeset,LinkedList");
        Set<Integer> Rollno = new HashSet<>();
        Rollno.add(1);
        Rollno.add(2);
        Rollno.add(3);
        System.out.println("This is for Set");
        System.err.println("=====Hashset=====");
        HashSet<Integer> nums=new HashSet<>();
        nums.add(101);
        nums.add(102);
        nums.add(103);
        nums.add(103);
        nums.add(104);
        System.out.println("hashset is for maintaining ordered list");
        System.out.println("find the number"+nums.contains(104));
        System.out.println("remove the number"+nums.remove(101));
        System.out.println("elements of hashset"+nums);
        System.out.println("===========Linked List==========");
        LinkedList<Integer>num=new LinkedList<>();
        num.add(2000);
        num.add(2001);
        num.add(2002);
        num.add(2004);
       System.out.println("size of the student numbers:"+num.size());
       System.out.println("to check it is empty"+num.isEmpty());
       System.out.println("check for contains"+num.contains(2005));
       System.out.println("=====tree set=====");
       TreeSet <Integer> n=new TreeSet<>();
       for(Integer i:num){
        n.add(i);
       }
       System.out.println("checking contains"+n.contains(2001));
       System.out.println("checking is empty"+n.isEmpty());
    }
}
