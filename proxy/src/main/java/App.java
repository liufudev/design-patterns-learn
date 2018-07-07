public class App {
    //代理对象与被代理对象实现相同的接口
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
