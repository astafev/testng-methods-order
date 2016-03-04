# testng-methods-order

If run in parallel few tests and if these tests use mockStatic, it can cause problems like in this example:
some of tests in powermockito.Test1 and powermockito.Test2 fails.


~~Thread.currentThread().getContextClassLoader() in Test2 returns MockClassLoader because of issue #261 in testng~~
