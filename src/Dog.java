public class Dog extends Animal {
    public Dog() {
        //super();
        System.out.println("A dog is born...");
    }


    @Override
    public String sleep() {
        return "A dog does not sleeps soundly...";
    }

    @Override
    public String eat() {
        return "A dog eats...";
    }


    public String protect() {
        //Birds can fly but other animals can't so this method
        //is unique to the Bird class
        return "A dog guards your house...";
    }
}

