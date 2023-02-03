//Subarray division 1
class Result {

    public static int birthday(List<Integer> s, int d, int m) {
        int co=0;
        for (int i=0;i<s.size()-m;i++){
            int sum=0;
            for (int j=i;j<i+m;j++){
                sum+=s.get(j);
            }
            if(sum==d){
                co++;
            }
        }
        return co;

    }

}

//Sparse ARRay
class Result {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    ArrayList<Integer> ne = new ArrayList<Integer>();
    int co=0; 
    for (int i=0;i<queries.size();i++)
    {
        for(int j=0;j<strings.size();j++)
        {   
            if(queries.get(i).equals(strings.get(j)))
            {
                co++;
            }
        }
        System.out.println(co);
        ne.add(co);
        co=0;
        
    }
    return ne;

    }

}

//Sales by match

class Result {

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
    int count=0;
    int d=0;
    List<Integer> k = new ArrayList<>();
    Set<Integer>set=new HashSet<>();
    for(Integer i:ar){
        set.add(i);
    }
    List<Integer> y = new ArrayList<>(set);
    for(int i=0;i<y.size();i++){
        int co=0;
        for(int j=0;j<ar.size();j++){
            if(y.get(i)==ar.get(j)){
                co++;   
                
            }
            
        }
        k.add(co);
        
        
    }
    System.out.println(k);
    for(int i=0;i<k.size();i++){
        d=k.get(i)/2;
        count+=d;
        
    }
     return count;     
    }
}

// Sherlock and Array 
class Result {
    public static String balancedSums(List<Integer> arr) {
    // Write your code hereint tot=0;
    int lsum=0;
    int rsum=0;
    int tot=0;
    for(int i=0;i<arr.size();i++){
        tot+=arr.get(i);
    }
    for(int i=0;i<arr.size();i++){
        rsum=tot-arr.get(i)-lsum;
        if(rsum==lsum){
            return "YES";
        }
        lsum+=arr.get(i);
    }
    return "NO";

    }

}