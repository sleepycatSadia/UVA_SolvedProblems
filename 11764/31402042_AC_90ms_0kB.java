import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    int k=1;
    while(k<=s){
      int n=sc.nextInt();
      int []arr=new int[n];
      for(int i=0;i<n;i++){
      	arr[i]=sc.nextInt();
      }
      int up=0;
      int down=0;
      int val=arr[0];
      for(int j=1;j<n;j++){
      	if(val<arr[j])
      	 up++;
      	else if(val>arr[j])
      	 down++;
      val=arr[j];
      }
      System.out.println("Case "+k+": "+up+" "+down);
      k++;
    }
  }
}