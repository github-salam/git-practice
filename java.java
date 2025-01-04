class A{
    String name = "Abdus salam";
    void eat(){
        System.out.println(name + " is eating");
    }
    public static void main(String[] args){
        A ob = new A();
        System.out.println(ob.name);
        ob.eat();
    }
}