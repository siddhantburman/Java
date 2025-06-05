class Student{
    int age;
    Student(int age){
        this.age=age;
    }
    void print(){
        System.out.println(age);
    }
}



public class instant{
    public static void main(String[] args){
        Student obj=new Student(18);
        obj.print();

    }
    
}