package utils;

import org.apache.commons.lang3.RandomUtils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    private  String baseUrl = "https://api.github.com";
    protected static PropertiesReader propertiesReader = new PropertiesReader();

    @BeforeTest
    public void setUp() {
        System.out.println("This test is started");
    }

    @AfterTest
    public void tearDown() {
        System.out.println("This test is completed");
    }

    protected int get3DigitRandomInt() {
        return RandomUtils.nextInt(100, 999);
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
}

