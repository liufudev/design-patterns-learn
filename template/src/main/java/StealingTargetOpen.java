import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liufu
 */
public class StealingTargetOpen extends StealingTarget {

    private static final Logger LOGGER = LoggerFactory.getLogger(StealingTargetOpen.class);

    @Override
    protected void pickTarget() {
        LOGGER.info("StealingTargetOpen pickTarget info ");
    }

    @Override
    protected void hitTarget() {
        LOGGER.info("StealingTargetOpen hitTarget info ");
    }

    @Override
    protected void escapeTarget() {
        LOGGER.info("StealingTargetOpen escapeTarget info ");
    }

}
