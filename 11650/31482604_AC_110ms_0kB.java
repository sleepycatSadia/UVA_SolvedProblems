/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int c=1;
        while(c<= t) {
            String s=sc.next();
            String []ar=s.split(":");
            
            int h=Integer.parseInt(ar[0]);
            int m=Integer.parseInt(ar[1]);
            if(m!=0){
                m=60-m;
                h=11-h;
            }else{
                if(h!=12)
                    h=(12-h);
            }
            if(h==0)
             h=12;
            if(h<0)
             h=12+h;
            String hh=Integer.toString(h);
            String mm=Integer.toString(m);
            if(hh.length()==1)
                hh="0"+hh;
            if(mm.length()==1)
                mm="0"+mm;
            System.out.println(hh+":"+mm);
            c++;
        }
	}
}