/**
 * @author liufu
 */
public class DragonSlayer {

    private DragonSlayingStrategy strategy;

    public DragonSlayer(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    public void doSomething() {
        strategy.exe();
    }
}
