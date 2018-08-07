import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liufu
 */
public class PersonCoupon implements Coupon {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonCoupon.class);

    @Override
    public void use() {
        LOGGER.info("use PersonCoupon");
    }
}
