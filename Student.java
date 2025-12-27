

public class Student {

        private int studentId;
    private String stdName;
    private String courseName;
    private char grades;


    public int getstudentId(){
        return studentId;
    }
    public String getstdName(){
        return stdName;
    }

    public void setstudentId(int studentId){
        this.studentId=studentId;
    }
        public void setstName(int studentId){
        this.studentId=studentId;
    }
    
    public void dispayinfo(){
        System.out.println("Student ID "+studentId);
    }

    public static void main(String args[]){

        Student s1=new Student();
        s1.setstudentId(101);
        s1.dispayinfo();
    }

    }













    // int x=5;
    // public static void main(String args []){
    //     Student obj=new Student();
    //     System.out.print(obj.x);
    // }






    // static void add(int a,int b){
    // int num=a+b;
    // System.out.print(num);
    // }
    // public static void main(String args[]){
    //     add(2,5);

    // }

// }

//     static void add(int a, int b){
//         int num=a+b;
//         System.out.println(num);

//     }
// w3    public static void main(String args[]){
//         add(2,2);
//         add(2,4);
//     }
    // static void mymethod(String fname){
    //     System.out.println(fname +"refsence");

    // }

    // public static void main(String args[]){
    //     mymethod("sam ");
    // }

    // static void mymethod(){
    // System.out.println("vovov");
    // }

    // public static void main(String args[]){
    //     mymethod();
    //     mymethod();
    //     mymethod();
    // }



