import org.testng.annotations.Test;

public class Test2 {
    @Test
    public void test2() {
        System.out.println("\n\n===========" + Thread.currentThread().getContextClassLoader() + "\n\n");
    }
}
