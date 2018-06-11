/**
 * @author liufu
 */
public interface Observerable {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyAllObserver(String context);
}
