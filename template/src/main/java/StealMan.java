/**
 * @author liufu
 */
public class StealMan {

    private StealingTarget stealingTarget;

    public StealMan(StealingTarget stealingTarget) {
        this.stealingTarget = stealingTarget;
    }

    public void exe() {
        stealingTarget.sethasFind(true);
        stealingTarget.stealingMthod();
    }


}
