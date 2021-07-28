/* package codechef; // don't place package name! 
problem link: https://www.codechef.com/ICPCTR04/problems/ICPC16A
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner in = new Scanner(System.in);
		    int T = in.nextInt();
		    while(T-- > 0){
		        int x1 = in.nextInt();
		        int y1 = in.nextInt();
		        int x2 = in.nextInt();
		        int y2 = in.nextInt();
		        String result = "sad";
		        
		        if(y1 == y2){
		            if(x1 > x2){
		                result = "left";
		            }
		            else{
		                result = "right";
		            }
		        }
		        else if(x1 == x2){
		            if(y1 > y2)
		                result = "down";
		            else
		                result = "up";
		        }
		        
		        System.out.println(result);
		    }
		}catch(Exception e){
		    return;
		}
	}
}
