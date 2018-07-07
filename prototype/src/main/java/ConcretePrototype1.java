public class ConcretePrototype1 implements Prototype {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        ConcretePrototype1 prototype1 = new ConcretePrototype1();
        return prototype1;
    }

    @Override
    public void show() {
        System.out.println("ConcretePrototype1 name is " + name);
    }
}
