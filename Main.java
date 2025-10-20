public class Main {
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            greet(args[0]);
        } else {
            greet("Farhan");
        }
    }
}