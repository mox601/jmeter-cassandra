import java.net.InetSocketAddress;

import org.testng.annotations.Test;

/**
 * Created by mmoci (mmoci at expedia dot com).
 */
public class InetSocketAddressTest {

    @Test
    public void testName() throws Exception {

        InetSocketAddress inetSocketAddress = new InetSocketAddress("10.187.93.116", 9542);

    }
}
