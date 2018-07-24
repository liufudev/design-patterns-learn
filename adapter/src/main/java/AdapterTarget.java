/**
 * @author liufu
 */
public class AdapterTarget implements Target {

    private NeedAdapter needAdapter;

    public AdapterTarget(NeedAdapter needAdapter) {
        this.needAdapter = needAdapter;
    }

    @Override
    public void request() {
        needAdapter.doSomething();
    }
}
