import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liufu
 */
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        DragonSlayer slayer = new DragonSlayer(() -> LOGGER.info("main info ,[args]:{} "));
        slayer.doSomething();
    }
}
