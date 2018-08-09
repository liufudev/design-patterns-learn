/**
 * @author liufu
 */
public class MoneyAdapter implements Money {

    private Counterfeit counterfeit;

    public MoneyAdapter(Counterfeit counterfeit) {
        this.counterfeit = counterfeit;
    }

    @Override
    public void buy() {
        counterfeit.consumer();
    }
}
