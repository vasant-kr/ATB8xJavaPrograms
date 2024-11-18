package super_keyword.realExample;

public class TestCase1 extends BaseClass {

    //TestCase1 is a type of BaseClass - Single Inheritance

    TestCase1() {
        super();
        this.setBrowser("edge", true);
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser, isAuth);
    }
}
