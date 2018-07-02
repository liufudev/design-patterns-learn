import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liufu
 */
public class StealingTargetSecret extends StealingTarget {

    private static final Logger LOGGER = LoggerFactory.getLogger(StealingTargetSecret.class);

    @Override
    protected void pickTarget() {
        LOGGER.info("StealingTargetSecret pickTarget info ");
    }

    @Override
    protected void hitTarget() {
        LOGGER.info("StealingTargetSecret hitTarget info ,[]:{} ");
    }

    @Override
    protected void escapeTarget() {
        LOGGER.info("StealingTargetSecret escapeTarget info  ");
    }
}
