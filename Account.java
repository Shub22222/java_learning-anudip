public class Account {
    int acc_no;
    String name;
    int balance;

    void getdata(int a,String b,int c){
        acc_no= a;
        name=b;
        balance=c;
    }
    void putdata(){
        System.out.println("account no "+acc_no);
        System.out.println("name "+name);
        System.out.println("balance "+balance);
    }

    public static void main(String[] args) {
        Account a=new Account();
        a.getdata(1,"sam" ,5445 );
        a.putdata();
    }
}
