import java.util.*;
import java.util.LinkedHashMap;
import java.util.Set;
public class Main{ 
  public static void main(String[] args){ 
    Scanner sc=new Scanner(System.in);
     LinkedHashMap<Integer,Integer> h = new  LinkedHashMap<Integer,Integer>();
    while(sc.hasNext()){
      int n=sc.nextInt();
      if(h.containsKey(n)){
        h.put(n,h.get(n)+1);
      }else{
        h.put(n,1);
      }
    }
 
    for (Map.Entry<Integer,Integer> entry : h.entrySet())  
      System.out.println(entry.getKey()+" " + entry.getValue());
  }
}