class superclass{
    int num=56;
}
class subclass extends superclass{
    int num=79;
    void printnum(){
        System.out.println(num);
        System.out.println(super.num);
    }
}
class Super{
    public static void main(String[] args){
        subclass s= new subclass();
        s.printnum();
    }
}

