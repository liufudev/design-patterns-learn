import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Proxy implements Subject {

    private static final Logger LOGGER = LoggerFactory.getLogger(Proxy.class);

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        this.subject.request();
        before();
        after();
    }

    private void before() {
        LOGGER.info("before info ");
    }

    private void after() {
        LOGGER.info("after info ");
    }
}
