public class App {
    public static void main(String[] args) {
        Client client = new Client(new ConcretePrototype1());
        client.operation();
    }
}
