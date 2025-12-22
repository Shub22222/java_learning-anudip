public class Book {
    String title;
    String author;
    int price;

    void getdata(String a,String b, int c){
        title =a;
        author =b;
        price =c;

    }
    void putdata(){
        System.out.println("title "+ title);
        System.out.println("author "+ author);
        System.out.println("price "+price);

    }

    public static void main(String[] args) {
        Book obj=new Book();
        obj.getdata("JAVA","SAM",20);
        obj.putdata();
    }

}

// title, author, price get put!!
