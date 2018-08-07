import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liufu
 */
public class LevelCoupon implements Coupon {

    private static final Logger LOGGER = LoggerFactory.getLogger(LevelCoupon.class);

    @Override
    public void use() {
        LOGGER.info("use LevelCoupon ");
    }
}
