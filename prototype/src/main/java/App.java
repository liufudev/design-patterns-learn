public class App {
    public static void main(String[] args) {
        ConcretePrototype1 prototype1 = new ConcretePrototype1();
        prototype1.setName("lf");
        Client client = new Client(prototype1);
        client.operation();
    }
}
