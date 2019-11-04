public class Mouse extends Animal {


    public Mouse() {
        super();
        System.out.println("Now I am a Mouse!");
    }

    @Override
    public String sleep() {
        return "A cat sleeps...";
    }

    @Override
    public String eat() {
        return "A cat eats...";
    }

    public String purr() {
        return "mouaaaaaa...";
    }
}
