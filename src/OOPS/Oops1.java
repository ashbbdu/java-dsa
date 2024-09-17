package OOPS;
class  Student {
    int age ;
    String name ;
    float marks ;
//    adding a constructor

    Student () {
        this.age = 10;
        this.name = "Random";
        this.marks = 30;
    }

    Student (int age , String name , float marks) {
        this.age = age;
        this.name = name;
        this.marks = marks;
    }
}

public class Oops1 {
    public static void main(String[] args) {
        Student ashish = new Student(21 , "Ashish" , 86);
        Student maddy = new Student(21 ,  "Madhur" , 84);

        Student random = new Student();
        System.out.println(random.marks);
        System.out.println(random.name);
        System.out.println(random.age);
//        ashish.marks = 10;
//        ashish.name = "Ashish";
//        ashish.age = 25;
//        ashish.name = "AshishSrivastava";
        System.out.println(ashish.marks);
        System.out.println(ashish.name);
//        ashish.age = 25;
        System.out.println(ashish.age);
        System.out.println(maddy.marks);
        System.out.println(maddy.name);
        System.out.println(maddy.age);
    }
}


