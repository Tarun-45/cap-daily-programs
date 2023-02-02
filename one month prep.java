//plus minus
public static void plusMinus(List<Integer> arr) {
        float p=0;
        float n=0;
        float z=0;
        for  (int i=0;i<arr.size();i++){
            if(arr.get(i)<0){
                n++;
            }
            else if(arr.get(i)>0){
                p++;
            }
            else{
                z++;
            }
        }
        System.out.println((p/arr.size()));
        System.out.println((n/arr.size()));
        System.out.println((z/arr.size()));
    }

}



//Min Max
class Result{

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    Collections.sort(arr);
    long s1=0;
    long s2=0;
    for (int i=0;i<arr.size()-1;i++){
        s1+=arr.get(i);
    }
    for (int i=1;i<arr.size();i++){
        s2+=arr.get(i);
    }
    System.out.print(s1);
    System.out.print(" ");
    System.out.print(s2);
    }

}



//Lonely integer
class Result {
    public static int lonelyinteger(List<Integer> a) {
        int t=0;
        for(int i=0;i<a.size();i++){
            int co=0;
            for(int j=0;j<a.size();j++){
                if(a.get(i)==a.get(j)){
                    co++;
                }
                
            }
            if(co==1){
                t=a.get(i);
            }
            
        }
        return t;
    
    }
    
}




//Diagonal Difference
class Result {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int l=0;
        int r=0;
        int n=arr.size();
        for (int i=0;i<n;i++){
            l+=arr.get(i).get(i);
            r+=arr.get(i).get(n-(i+1));
        }
        return Math.abs(l-r);
    }

}

//XOR Strings 2
public class Solution {

    public static String stringsXOR(String s, String t) {
        String res = new String("");
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(i))
                res += "0";
            else
                res += "1";
        }

        return res;
    }



//pangrams
class Result {
    public static String pangrams(String s) {
         HashSet<String> set=new HashSet<String>();  
         s=s.toLowerCase();
         s=s.replace(" ", "");
         for(int i=0;i<s.length();i++){
             if(Character.toString(s.charAt(i))!=""){ 
                 set.add(Character.toString(s.charAt(i)));}
             
         }
         if(set.size()==26){
             return "pangram";
         }
         else{
             return "not pangram";
         }
    }

}
