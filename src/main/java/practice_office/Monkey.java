package practice_office;

import java.util.Scanner;

public class Monkey {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       int X =sc.nextInt();
       int Y=sc.nextInt();
       int N=sc.nextInt();
       int arr[]=new int[N];
       
       for(int i=0;i<N;i++){
    	   arr[i]=sc.nextInt();
       }
       System.out.println(jump(X, Y, arr));
       
       
	}
	
	public static int jump(int X,int Y,int []arr){
		double diff=X-Y;
	       int sum=0;
	       for(int i=0;i<arr.length;i++){
	    	   if(arr[i]>0){
	    		   sum++;
	    	   }
	    	   double t=arr[i]-X;
	    	   if(t>0){
	    		   int nt=(int) Math.ceil(t/diff);
	    		   sum+=nt;
	    	   }
	       }
	       
	       return sum;
	}

}
