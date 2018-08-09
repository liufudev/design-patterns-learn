import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liufu
 */
public class RMB implements Money {

    private static final Logger LOGGER = LoggerFactory.getLogger(RMB.class);

    @Override
    public void buy() {
        LOGGER.info(" buy by RMB ");
    }
}
