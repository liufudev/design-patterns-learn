public class ConcretePrototype2 implements Prototype {
    @Override
    public Prototype clone() {
        ConcretePrototype2 concretePrototype2 = new ConcretePrototype2();
        return concretePrototype2;
    }

    @Override
    public void show() {
        System.out.println("ConcretePrototype2");
    }
}
