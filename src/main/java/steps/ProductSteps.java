package steps;

import io.appium.java_client.android.AndroidDriver;
import pageObjects.ProductPage;

public class ProductSteps extends BaseStep{
    ProductPage productPage = new ProductPage(getDriver());

    public ProductSteps(AndroidDriver driver) {
        super(driver);
    }
    public void clickAddProduct(){
        click(productPage.getBtnAddToCard());
    }
    public void clickBtnCard(){
        click(productPage.getBtnCard());
    }

    public boolean getTitle(){
        return doesElementExist(productPage.getTitlePage(), SMALL_WAIT);
    }

    public void clickBtnProceed(){
        click(productPage.getBtnProceed());
    }
}
