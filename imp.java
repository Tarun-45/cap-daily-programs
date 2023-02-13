//intersection
public class Main
{
	public static void main(String[] args) {
	    int[] arr1={1,2,3,4};
	    int[] arr2={3,9,8,7};
	    HashSet<Integer> hs=new HashSet<>();
	    for(int i=0;i<arr1.length;i++){
	        hs.add(arr1[i]);
	    }
	    for(int i=0;i<arr2.length;i++){
	        if(hs.contains(arr2[i])){
	            System.out.print(arr2[i]);
	        }
	    }
	}
}

//sum of each row and col
public class Main
{
	public static void main(String[] args) {
	    public class SumofRowColumn{    
           public static void main(String[] args) {    
        int rows,cols,sumRow,sumCol;    
  
        int a[][] ={       
                        {1, 2, 3},    
                        {4, 5, 6},    
                        {7, 8, 9}    
                    };    
        rows=a.length;    
        cols=a[0].length;    
        for(int i= 0; i<rows;i++){    
            sumRow = 0;    
            for(int j 0;j<cols;j++){    
              sumRow=sumRow+a[i][j];    
            }    
            System.out.println("Sum of " + (i+1) +" row: " + sumRow);    
        }    
         
        for(int i=0;i<cols;i++){    
            sumCol = 0;    
            for(int j=0; j<rows;j++){    
              sumCol=sumCol+a[j][i];    
            }    
            System.out.println("Sum of"+(i+1)+"column:"+sumCol);    
        }    
    }    
}    
