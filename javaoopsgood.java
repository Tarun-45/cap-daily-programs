//Dog inheritance
class Dog{
    private String name;
    public Dog(String name){
       this.name = name;
    }
    public String getName(){
        return name;
    }
}
class Greyhound extends Dog{
    private String color;
    private int weight;
    public Greyhound(String name,String color,int weight){
      super(name);
      this.color=color;
      this.weight=weight;
    }
    public String getColor(){
        return color;
    }
    public int getWeight(){
        return weight;
    }
    
}
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String color = in.nextLine();
        int weight = in.nextInt();
        Greyhound pup = new Greyhound(name, color, weight);
        System.out.println(pup.getName());
        System.out.println(pup.getColor());
        System.out.println(pup.getWeight());
        System.out.println(pup.getName()+" "+"is"+" "+pup.getColor()+" "+"in color"+" "+"and his weight is"+" "+pup.getWeight()+"Kg");
        System.out.println("Superclass:"+pup.getClass().getSuperclass().getName());
    }
}


//Bank account

class Bank{
    String name;
    int balance;
    int accountno;
    public Bank(String name){
        this.name=name;
        this.balance=0;
    }
    public void deposit(int amount){
        balance+=amount;
    }
    public void withdraw(int money){
        if(balance>money){
            balance-=money;}
        else{
            System.out.println("Negative Balance Transaction Cancelled");}
    }
    public void display(){
        System.out.println(accountno+" "+name+" "+balance);
    }
    public void setAccno(int num){
        this.accountno=num;
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        String name=in.nextLine();
        int a=Integer.parseInt(in.nextLine());
        Bank b=new Bank(name);
        b.setAccno(n);
        for(int i=0;i<a;i++){
            String[] arr=in.nextLine().split(" ");
            if(arr[0].equals("Deposit"))
                b.deposit(Integer.parseInt(arr[1]));
            else if(arr[0].equals("Withdraw"))
                b.withdraw(Integer.parseInt(arr[1]));
            else if(arr[0].equals("Display"))
                b.display();
        }
    }  
}


//class and obj
class Person{
    int age;
    Person(int age){
        this.age=age;
    }
    public void yearPasses(){
        age+=1;
    }
    public void amIOld(){
        if(age<0){
            System.out.println("Age is not valid, setting age to 0.");
            System.out.println("You are young.");
            System.out.println("You are young.");
       
        }
        else if(age>=0&&age<10){
            System.out.println("You are young.");
            System.out.println("You are young.");
        }
        else if(age>=10&&age<15){
            System.out.println("You are young.");
            System.out.println("You are a teenager.");
        }
        else if(age>=15&&age<18){
            System.out.println("You are a teenager.");
            System.out.println("You are old.");
        }
        else{
            System.out.println("You are old.");
            System.out.println("You are old.");
        }
            
    }
}


public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
        
            System.out.println();
        }
        sc.close();
}
}


//customInteger list
class IntegerList{
        private int[] list;
    private int count =0;
     public IntegerList(int size){
        list=new int[size];
    }
    public void add(int value){
        
        if(count>=list.length){
            System.out.println("can't add, list is full");
        }
        else if(count<list.length){
            list[count]=value;
        }
        count++;
    }
    public int getValue(int i){
        return list[i];
    }

}
public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int capacity = Integer.parseInt(in.nextLine());
        IntegerList nums = new IntegerList(capacity);
        while(in.hasNextLine()){
            int num = Integer.parseInt(in.nextLine());
            nums.add(num);
        }
        for(int j=0;j<capacity;j++){
            System.out.println(j+" : "+nums.getValue(j));
        }

    }
}