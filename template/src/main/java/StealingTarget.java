/**
 * @author liufu
 */
public abstract class StealingTarget {

    private volatile boolean hasFind;

    protected abstract void pickTarget();

    protected abstract void hitTarget();

    protected abstract void escapeTarget();

    protected void sethasFind(boolean hasFind) {
        this.hasFind = hasFind;
    }


    public void stealingMthod() {
        pickTarget();
        hitTarget();
        if (hasFind) {
            escapeTarget();
        }
    }
}
