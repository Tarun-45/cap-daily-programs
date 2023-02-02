//merge two sorted arrays
public class Main
{
	public static void main(String[] args) {
	     int arr1[]={1,4,7,8,10};
	     int arr2[]={2,3,9};
	     int arr3[]=new int[n+m]; 
	     int o[]=new int[arr3];
	     int n=5;
	     int m=3;
	     int co=0;
	     for (int i=0;i<arr1.length;i++){
	         arr3[co]=arr1[i];
	         co++;
	     }
	     for (int i=0;i<arr2.length;i++){
	         arr3[co]=arr2[i];
	         co++;
	     }
	     Arrays.sort(arr3);
	     for (int i=0;i<arr3.length-m;i++){
	         o[i]=arr3[i];
	     }
	     for (int i=n+1;i<arr3.length;i++){
	         o[i]=arr3[i];
	     }
	     for (int i =0;i<o.length;i++){
	         System.out.println(o[i]);
	     }
	           
	     
	}
}


// repeating  and missing

import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    int[] k={4,3,6,2,1,1};
	    int r=0;
	    int m=0;
	    Arrays.sort(k);
	    for (int i=1;i<k.length;i++){
	        if(k[i]==k[i-1]){
	            r=k[i];
	        }
	        else if(k[i]-k[i-1]!=1){
	            m=i;
	        }
	        
	    }
	    System.out.println(r);
	    System.out.println(m);
	}
}

//Stock buy and sell

import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    int[] k={7,1,5,3,6,4};
	    int m=0;
	    for(int i=0;i<k.length;i++){
	        for (int j=i+1;j<k.length;j++){
	            int d=k[j]-k[i];
	            if(d>m){
	                m=d;
	            }
	        }
	    }
	    System.out.println(m);
	    
	}
}









