package powermockito;

import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.Mockito.validateMockitoUsage;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.testng.Assert.assertEquals;

@PrepareForTest(Class4ByteCodeManipulation.class)
public class Test2 extends PowerMockTestCase {

    @BeforeMethod
    public void before() {
        mockStatic(Class4ByteCodeManipulation.class);
        when(Class4ByteCodeManipulation.staticMethod()).thenReturn("123");
    }
    @Test
    public void test() {
        assertEquals(Class4ByteCodeManipulation.staticMethod(), "123");
    }

    @Test
    public void wait0() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test
    public void test2() {
        assertEquals(Class4ByteCodeManipulation.staticMethod(), "123");
    }
}
