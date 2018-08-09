import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liufu
 */
public class Dollar implements Money {

    private static final Logger LOGGER = LoggerFactory.getLogger(Dollar.class);

    @Override
    public void buy() {
        LOGGER.info("buy by Dollar");
    }
}
