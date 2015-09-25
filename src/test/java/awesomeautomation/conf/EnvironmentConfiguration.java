package awesomeautomation.conf;


import org.springframework.core.io.Resource;

/**
 * Created by viskyo on 24/09/2015.
 */
public class EnvironmentConfiguration {

    private String homepage;
    private String browser;
    private Resource chromeDriverLocation;
    private String domain;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public Resource getChromeDriverLocation() {
        return chromeDriverLocation;
    }

    public void setChromeDriverLocation(Resource chromeDriverLocation) {
        this.chromeDriverLocation = chromeDriverLocation;
    }
}
