package tests.searchapartments;

import org.testng.annotations.Test;

public class TestSOUT {

    @Test(dataProvider = "dataProviderMethod", dataProviderClass = DataProviderClass.class)
    public  void testSOUT(String number, String string) {
        System.out.println("TEST SOUT !!! " + number + string);
    }
}
