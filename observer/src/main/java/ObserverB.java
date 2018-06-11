import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liufu
 */
public class ObserverB implements Observer {

    private static final Logger LOGGER = LoggerFactory.getLogger(ObserverB.class);

    @Override
    public void update(String context) {

        LOGGER.info("B update info ,[context]:{} ", context);
    }
}
