/**
 * @author liufu
 */
public class App {

    public static void main(String[] args) {
        Observerable observerable = new ConcreteOberverable();
        observerable.addObserver(new ObserverA());
        observerable.addObserver(new ObserverB());
        observerable.notifyAllObserver("hello word");
    }
}
