public class Cat {
    public String name;

    public Cat(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Cat myCat = new Cat("Luna");


        System.out.println(myCat.name);
    }
}
