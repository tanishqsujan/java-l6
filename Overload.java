class Student{
    int id;
    String name;
    float stipend;

    Student(){}

    Student(int id, String name){
        this.id=id;
        this.name=name;
    }

    Student(int id, String name, float stipend){
        this.id=id;
        this.name=name;
        this.stipend=stipend;
    }

    void display(){
        System.out.println(this.id+ "|" +this.name+ "|" +this.stipend);
    }
}

class Overload{
    public static void main(String[] args){
        Student s1= new Student();
        Student s2 = new Student(290, "Aarish");
        Student s3 = new Student(333, "Stephen", 540000);

        s1.display();
        s2.display();
        s3.display();
    }
}