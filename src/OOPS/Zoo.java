package  OOPS;
class Animal{
        int noOfLegs;
        String color;
        Animal(int noOfLegs,String color)
        {
            this.noOfLegs=noOfLegs;
            this.color=color;
        }
        void walk(){
            System.out.println("Animal Walking");
        }
}

class Dog extends Animal{
    String name;
    Dog(String name,int noOfLegs,String color){

        super(noOfLegs,color);
        this.name=name;
    }

    void eat(){
        System.out.println("Dog Eating");
    }

}
//class Lion extends Animal{
//    Lion()
//    {
//
//    }
//    void eat(){
//        System.out.println("Lion Eating");
//    }
//}
public class Zoo {
    public static void main(String[] args) {
        Dog d1 = new Dog("D1",4,"Black");
        System.out.println(d1.name);
        System.out.println(d1.color);
        System.out.println(d1.noOfLegs);
        d1.eat();
        d1.walk();

//        Lion l1 = new Lion();
//        l1.eat();
    }
}

