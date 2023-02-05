//Jesse and Cookies
class Result {
    public static int cookies(int k, List<Integer> A) {
    // Write your code here
        Collections.sort(A);
        int co=0;
        while(A.get(0)<k){
             int a=A.get(0);
             int b=A.get(1);
             int res=a+(2*b);
                A.remove(a);
                A.remove(b);
                A.add(res);
                co++;
            Collections.sort(A);
        }
        return co;

    }

}




//java Hashset
 HashSet<String> set=new HashSet<>();
       for (int i=0;i<t;i++){
           set.add(pair_left[i]+" "+pair_right[i]);
           System.out.println(set.size());
           
       }




//remove duplicates
public class Solution {

    public static void main(String[] args) {
    
       Scanner in=new Scanner(System.in);
      String str=in.next();
      LinkedHashSet<Character> set =new LinkedHashSet<>();
      char ch;
      for(int i=0;i<str.length();i++){
          ch=str.charAt(i);
          if(!(set.contains(ch))){
              set.add(ch);
          }
      }
      for(Character i:set){
          System.out.print(i);
      }
}
}



//java map
class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            map.put(name,phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(map.containsKey(s)){
                System.out.println(s+"="+map.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
	}
}


//Sales By match
class Result {

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
        int sum=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<ar.size();i++){
            if(!set.contains(ar.get(i))){
                set.add(ar.get(i));
            }
            else{
                set.remove(ar.get(i));
                sum++;
            }
        }
        return sum;

    }


