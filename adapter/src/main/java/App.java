/**
 * @author liufu
 */
public class App {

    public static void main(String[] args) {
        Counterfeit counterfeit = new Counterfeit();
        Money dollar = new Dollar();
        dollar.buy();
        Money adapter = new MoneyAdapter(counterfeit);
        adapter.buy();
    }
}
