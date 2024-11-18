package super_keyword.realExample;

public class BaseClass {

    private String browser;

    public BaseClass() {
        System.out.println("DC - BASE CLASS");
    }

    public BaseClass(String b) {
        System.out.println("PC - BASE CLASS");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        } else {
            System.out.println("Not Allowed");
        }
    }

    void openBrowser() {
        System.out.println("Open Browser");
    }

    void openBrowser(String browsername) {
        System.out.println("Open Browser ->" + browsername);
    }

    void closeBrowser() {
        System.out.println("Close Browser");
    }


}
