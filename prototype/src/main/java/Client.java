public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public void operation() {
        //需要创建原型接口的对象
        Prototype copyPrototype = prototype.clone();
        copyPrototype.show();
    }
}
