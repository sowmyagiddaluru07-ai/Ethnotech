import java.util.*;
class QueueExample{
    public static void main(String[] args){
        Queue<String> std=new LinkedList<>();
        std.add("sharmila");
        std.add("pandu");
        std.add("sandeep");
        System.out.println(std);
        std.add("usha"); 
        System.out.println(std.peek());
        System.out.println(std);
        System.out.println("deleting first entry:"+std.remove());
    }
}