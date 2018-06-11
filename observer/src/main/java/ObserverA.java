import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liufu
 */
public class ObserverA implements Observer {

    private static final Logger LOGGER = LoggerFactory.getLogger(ObserverA.class);

    @Override
    public void update(String context) {
        LOGGER.info("A update info ,[context]:{} ", context);
    }
}
