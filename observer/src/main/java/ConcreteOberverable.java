import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author liufu
 */
public class ConcreteOberverable implements Observerable {

    private List<Observer> observerList = Lists.newArrayList();

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObserver(String context) {
        observerList.stream().forEach(observer -> observer.update(context));
    }
}
