class Parent{
    void hello()
    {
        System.out.println("Hello from parent");
    }
}
class Child extends Parent{
    void hello(){
        System.out.println("Hello from child");
    }
}
class Overide{
    public static void main(String[] args){
        //Parent p= new Child();
        Parent p= new Parent(); //will print Hello from parent
        p.hello();
    }
}
