//subarray division

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

 
//ZigZag Sequence

  public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid = n/2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;
    
        int st = mid + 1;
        int ed = n - 2;
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}

