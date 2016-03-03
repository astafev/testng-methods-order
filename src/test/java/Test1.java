import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.annotations.Test;

@PrepareForTest(Test2.class)
public class Test1 extends PowerMockTestCase {

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test(dependsOnMethods = "test1")
    public void test2() {
        System.out.println("test2");
    }
}
