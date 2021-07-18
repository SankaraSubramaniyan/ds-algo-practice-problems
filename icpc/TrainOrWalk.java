// contest link: https://www.codechef.com/ICPCTR05/problems/WALKFAST

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner in = new Scanner(System.in);
		    int T = in.nextInt();
		    while(T-- > 0){
		        int N=in.nextInt(), A=in.nextInt(), B=in.nextInt(), C=in.nextInt(), D=in.nextInt(), P=in.nextInt(), Q=in.nextInt(), Y=in.nextInt();
		        int[] cities = new int[N+1];
		        cities[0] = 0;
		        for(int ctr=1; ctr<=N; ctr++)
		            cities[ctr] = in.nextInt();
		        
		        int walkTime = (Math.abs(cities[B] - cities[A]) )* P;
		        
		        int rem = (Math.abs(cities[C]-cities[A])) * P;
		        
		        if(rem <= Y){
		            int trainTime = 0;
		            trainTime += Y;
		            trainTime += (Math.abs(cities[D] - cities[C])) * Q; // train time
		            trainTime += (Math.abs(cities[B] - cities[D])) * P; //walk time
		            if(walkTime < trainTime)
		                System.out.println(walkTime);
		            else
		                System.out.println(trainTime);
		        }
		        else{
		            System.out.println(walkTime);
		        }
		        
		    }
		}catch(Exception e){
		    return;
		}
	}
}
