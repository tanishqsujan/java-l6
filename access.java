class parent{
    protected void protect(){
        System.out.println("Protected method");
    }
}
class child extends parent{
    private void privatemethod(){
        System.out.println("Private method");
    }
}

class access{
    public static void main(String[] args){
        child c= new child();
        c.privatemethod();

        System.out.println("Hello World");
    }
}