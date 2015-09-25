package tools;

import awesomeautomation.conf.EnvironmentConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ThreadGuard;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static awesomeautomation.conf.Constants.*;

/**
 * Created by viskyo on 24/09/2015.
 */
public class BrowserManager {
    private static Logger LOG = LoggerFactory.getLogger(BrowserManager.class);

    private WebDriver driver;
    private WebDriverWait wait;
    private EnvironmentConfiguration configuration;

    /**
     * constructor used to instantiate corresponding Web drivers based on the
     * configuration received
     *
     * @param config - the configuration to be used for running webDriver
     * @throws IOException
     */
    public BrowserManager(EnvironmentConfiguration config) throws IOException {
        this.configuration = config;
        initWebDriver();
    }

    /**
     * based on the property value read from the properties file, the
     * corresponding web driver type is instantiated
     *
     * @throws IOException
     */
    private void initWebDriver() throws IOException {

        String browserType = this.configuration.getBrowser();

        if (browserType.equalsIgnoreCase(FIREFOX)) {
            this.driver = new FirefoxDriver();
        } else {

            final File targetFolder = new File("target");
            final String logFilePath = targetFolder.getAbsolutePath() + "\\chromedriver_" + new Date().getTime() + "_" + Thread.currentThread().getId() + ".log";
            final String chromeDriverPath = configuration.getChromeDriverLocation().getFile().getAbsolutePath();

            System.setProperty("webdriver.chrome.logfile", logFilePath);
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);

            LOG.info("Creating local ChromeDriver instance...");
            final ChromeDriverService service = new ChromeDriverService.Builder().usingAnyFreePort()
                    .usingDriverExecutable(new File(configuration.getChromeDriverLocation().getFile().getAbsolutePath()))
                    .withVerbose(true)
                    .withLogFile(new File(logFilePath))
                    .build();
            this.driver = new ChromeDriver(service);

        }

        try {
            driver.manage().window().maximize();
        } catch (Exception e) {
            System.out.println("Maximization of window unsuccessful.");
        }
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(45, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

        wait = new WebDriverWait(this.driver, 90);
    }

    public static BrowserManager createInstance(EnvironmentConfiguration configuration) throws IOException {
        return new BrowserManager(configuration);
    }

    /**
     * stops the server
     *
     * @throws Exception
     */
    public void close() {
        LOG.debug("closing driver...");
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }
}
