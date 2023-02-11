//TCS6
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int n=sc.nextInt();
        int n1=0,n2=1,n3;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                list.add(i);
            }
            else{
                if (i==4){
                    list.add(1);
                }
                else{
                    n3=n1+n2;    
                list.add(n3);
                n1=n2;    
                n2=n3;
                }
            }
        }
     System.out.println(list.get(list.size()-1));
        
    }
}



//String Palindrome
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String k=s.toLowerCase();
        String t="";
        for(int i=k.length()-1;i>=0;i--){
            t+=k.charAt(i);
        }
        if(t.equals(k)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}



//Super Reduced String Submission
class Result {
    public static String superReducedString(String s) {
    // Write your code here
        int i=0;
        while(i<s.length()-1){
            if(s.charAt(i)==(s.charAt(i+1))){
                    s=s.substring(0,i)+s.substring(i+2,s.length());
                i=0;
                }
            else{
                i++;
            }
            
        }
        if(s.length()==0){
            return "Empty String";
        }
        else {
            return s;
        }

    }

}


//Similar Char
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        int query=sc.nextInt();
        int co=0;
        for(int i=0;i<query;i++){
            co=-1;
                int p=sc.nextInt();
                for(int k=0;k<p;k++){
                if(s.charAt(p-1)==s.charAt(k))
                    co++;
                }
        System.out.println(co);
        }
        
}
}


//String reversal with same special characters
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        int j=s.length()-1;
        int i=0;
        while(j>i){
            if(!Character.isAlphabetic(ch[i])){
                i++;
            }
            if(!Character.isAlphabetic(ch[j])){
                j--;
            }
            if(Character.isAlphabetic(ch[i]) && Character.isAlphabetic(ch[j]) ){
                char temp =ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
        }
       System.out.println(ch); 
        
    }
}
