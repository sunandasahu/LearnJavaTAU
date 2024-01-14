package chapter10;

public class Zoo {

    public static void main(String[] arg){
        Dog rocky = new Dog();
        rocky.makeSound();
        rocky.fetch();
        feed(rocky);

        // here we are creating a instance of animal of type dog. So it has access to overidden method
        Animal sasha = new Dog();
        sasha.makeSound();
        ((Dog) sasha).fetch();
        feed(sasha);

        // Here we changed the type of sasha to a cat
        sasha = new Cat();
        sasha.makeSound();
        // sasha is not cat type . so it can not access to scratch method. But we can cast it to a cat type. Same for dog
        ((Cat) sasha).scratch();
        feed(sasha);
    }

    public static void feed(Animal animal){
        if(animal instanceof  Dog){
            System.out.println("Here is dog food");
        }else if(animal instanceof Cat){
            System.out.println("Here is cat food");
        }

    }
}
