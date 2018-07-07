public class ConcretePrototype1 implements Prototype {
    @Override
    public Prototype clone() {
        ConcretePrototype1 prototype1 = new ConcretePrototype1();
        return prototype1;
    }

    @Override
    public void show() {
        System.out.println("ConcretePrototype1");
    }
}
