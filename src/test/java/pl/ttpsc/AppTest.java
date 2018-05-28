package pl.ttpsc;

import org.junit.Test;
import pl.ttpsc.singleton.Config;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class AppTest {

    static Config config1, config2;

    @org.junit.Before
    public void setUp() throws Exception {
        config1 = config2 = null;
    }

    @Test
    public void shouldBeOneInstanceInMultipleThreads() throws InterruptedException {
        Runnable test1 = () -> config1 = Config.getInstance();
        Runnable test2 = () -> config2 = Config.getInstance();

        int success = 0;
        int fail = 0;
        for(int i = 0; i < 1000; i ++) {
            ExecutorService service = Executors.newFixedThreadPool(2);
            service.submit(test1);
            service.submit(test2);
            service.shutdown();
            service.awaitTermination(1, TimeUnit.SECONDS);
            if(config1.equals(config2)) {
                success++;
            }
            else {
                fail++;
            }
        }
        assertEquals(fail, 0);
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
}