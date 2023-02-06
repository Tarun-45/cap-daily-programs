//Student Grading
class Result {
    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        List<Integer> res=new ArrayList<>();
        for(Integer marks:grades){
            if (marks<38){
                res.add(marks);
            }
            else if(marks%5<3){
                res.add(marks);
                
            }
            else{
                res.add(marks+(5)-(marks%5));
            }
        }return res;

    }

//breakingd the records
class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
        int max=0;
        int min=0;
        int maval=scores.get(0);
        int mival=scores.get(0);
        for(int i=1;i<scores.size();i++){
            int val=scores.get(i);
            if(val>maval){
                maval=val;
                max++;
            }
        }
        for(int i=1;i<scores.size();i++){
            int val=scores.get(i);
            if(val<mival){
                mival=val;
                min++;
            }
        }
        ArrayList<Integer> l = new ArrayList<>();
        l.add(max);
        l.add(min);
        return l;
        

    }

}





//Student Normal
class Student {
    private String name;
    private int rollNo;
    private String branch;
    private int year;
    private List<Integer> marks;
    private static int noOfStudents;
    public Student(String n, int rollNo, String branch, int year){
        this.name = n;
        this.rollNo = rollNo;
        this.branch = branch;
        this.year = year;
        marks = new ArrayList<>();
        noOfStudents++;
    }
    public String getName(){
        return name; 
    }
    public int getRollNo(){
        return rollNo; 
    }
    public String getBranch(){
        return branch; 
    }
    public int getYear(){
        return year; 
    }
    public List<Integer> getMarks(){
        return marks; 
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMarks(int obtainedMark){
        marks.add(obtainedMark);
    }
    public void display(){
        System.out.println(rollNo+" "+name+" "+branch+" "+year);
    }
    public double computePercentage(){
        double sum = 0;
        for(Integer mark:marks){
            sum = sum + mark;
        }
        if(marks.size()==0)
            return 0;
        return sum/marks.size();
    }
    public static void displayNoStuds(){
        System.out.println("NoOfStudents="+noOfStudents);
    }
}


//