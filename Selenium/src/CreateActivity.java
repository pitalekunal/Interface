import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateActivity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Softwares/chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.get("http://207.20.41.72/STAR-Polaris-QA/Login.aspx");
		dr.manage().window().maximize();
        dr.findElementById("cntMain_txtusername").sendKeys("admin");
        dr.findElementById("cntMain_txtpassword").sendKeys("Polaris123!");
        dr.findElementById("cntMain_btnLogin").click();
        dr.findElementById("cntleft_lnkActivityOverview").click();
        dr.findElementById("ddlEventType_chosen").click();
        dr.findElementByXPath("//*[@id='ddlEventType_chosen']/div/ul/li[2]").click();
        
        dr.findElementById("txtEventName").sendKeys("Activity");
        dr.findElementById("txtStartDate").sendKeys("21 FEB 2017");
        dr.findElementById("txtEndDate").sendKeys("21 FEB 2017");
        dr.findElementById("ddlPaymentEntity_chosen").click();//*[@id="ddlPaymentEntity_chosen"]/div/ul/li[4]
        dr.findElementByXPath("//*[@id='ddlPaymentEntity_chosen']/div/ul/li[4]").click();
        dr.findElementById("ddlCountry_chosen").click();//*[@id="ddlCountry_chosen"]/div/ul/li[62]
        dr.findElementByXPath("//*[@id='ddlCountry_chosen']/div/ul/li[62]").click();
        dr.findElementById("ProdusSelect_chosen").click();//*[@id="ProdusSelect_chosen"]/div/ul/li[2]
        dr.findElementByXPath("//*[@id='ProdusSelect_chosen']/div/ul/li[2]").click();
        dr.findElementById("ProdusSelect_chosen").click();
        dr.findElementByXPath("//*[@id='ProdusSelect_chosen']/div/ul/li[3]").click();
        dr.findElementById("btn_Save_Advance_AddRecipients").click();
        dr.findElementById("cntMain_btnSearch").click();
        Thread.sleep(4000);
        dr.findElementById("cntMain_txtFirstname_Search").sendKeys("a");
        dr.findElementById("cntMain_btnSearchIndividualRslt").click();
        Thread.sleep(4000);
        dr.findElementById("cntMain_GridView1_chIndividual_0").click();
        dr.findElementById("cntMain_btnAddToActivity").click();
        dr.findElementById("cntMain_drpSearchForIndividual_chosen").click();
        dr.findElementByXPath("//*[@id='cntMain_drpSearchForIndividual_chosen']/div/ul/li[2]").click();
        dr.findElementById("cntMain_btnAdd").click();
       // dr.findElementById("cntMain_SelectValuesforOrg_chosen").click();
        Thread.sleep(2000);
        //dr.findElementByXPath("//*[@id='cntMain_SelectValuesforOrg_chosen']/div/ul/li[2]").click();
        //dr.findElementById("cntMain_btnAddOrg").click();
        dr.findElementById("btn_Save_Continue_Add_Expenses").click();
        Thread.sleep(4000);
        dr.findElementById("cntMain_ddlCurrencyType_chosen").click();
        dr.findElementByXPath("//*[@id='cntMain_ddlCurrencyType_chosen']/div/ul/li[11]").click();
        Thread.sleep(1000);
        try{
        	Select element = new Select(dr.findElementById("cntMain_gvExpenseItems_ddlSpendItem_0"));
            element.selectByValue("1");
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
        	Select element = new Select(dr.findElementById("cntMain_gvExpenseItems_ddlSpendItem_0"));
            element.selectByValue("1");
        }
        Thread.sleep(1000);
        try{
        	dr.findElementById("cntMain_gvExpenseItems_txtAmount_0").sendKeys("134.6");
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
        	dr.findElementById("cntMain_gvExpenseItems_txtAmount_0").sendKeys("124.6");
        }
        try{
        	dr.findElementById("cntMain_gvExpenseItems_txtVATFromRecipientView_0").click();
            
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
        	dr.findElementById("cntMain_gvExpenseItems_txtVATFromRecipientView_0").click();
            
        }
        Thread.sleep(2000);
        try{
        	
            dr.findElementById("cntMain_gvExpenseItems_txtVATFromRecipientView_0").sendKeys("34");
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
        	
            dr.findElementById("cntMain_gvExpenseItems_txtVATFromRecipientView_0").sendKeys("34");
        }
        Thread.sleep(2000);
        /*try{
        	
            dr.findElementById("cntMain_gvExpenseItems_txtPaymentDate_0").click();
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
        	
            dr.findElementById("cntMain_gvExpenseItems_txtPaymentDate_0").click();
        }*/
        try{
        	dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        	dr.findElementById("cntMain_gvExpenseItems_txtPaymentDate_0").click();
        	dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        	dr.findElementById("cntMain_gvExpenseItems_txtPaymentDate_0").sendKeys("22 FEB 2017");
        	dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        	dr.findElementById("cntMain_gvExpenseItems_txtPaymentDate_0").sendKeys(Keys.TAB);
        	
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
        	dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        	dr.findElementById("cntMain_gvExpenseItems_txtPaymentDate_0").click();
        	dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        	dr.findElementById("cntMain_gvExpenseItems_txtPaymentDate_0").sendKeys("22 FEB 2017");
        	dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        	dr.findElementById("cntMain_gvExpenseItems_txtPaymentDate_0").sendKeys(Keys.TAB);
        	
        }
        Thread.sleep(3000);
        try{
        	dr.findElementById("ctl00_cntMain_gvExpenseItems_ctl02_lbtnCopyExpenseToAll").click();
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
        	dr.findElementById("ctl00_cntMain_gvExpenseItems_ctl02_lbtnCopyExpenseToAll").click();
        }
        Thread.sleep(1500);
        try{
        	dr.findElementByXPath("//*[@class='rwDialogPopup radconfirm']/div[2]/a[2]").click();
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
        	dr.findElementByXPath("//*[@class='rwDialogPopup radconfirm']/div[2]/a[2]").click();
        }
        Thread.sleep(3000);
        try{
        	dr.findElementById("ctl00_cntMain_gvExpenseItems_ctl02_lbtnCopyExpenseToAll").click();
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
        	dr.findElementById("ctl00_cntMain_gvExpenseItems_ctl02_lbtnCopyExpenseToAll").click();
        }
        Thread.sleep(1500);
        try{
        	dr.findElementByXPath("//*[@class='rwDialogPopup radconfirm']/div[2]/a[1]").click();
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
        	dr.findElementByXPath("//*[@class='rwDialogPopup radconfirm']/div[2]/a[1]").click();
        }
        dr.findElementById("cntMain_lbtnSaveAndPreview").click();
        dr.findElementById("cntleft_btnmarkascomplete").click();
        dr.findElementById("cntActionLinks_lblusername").click();
        dr.findElementById("cntActionLinks_btnLogout").click();
        dr.quit();
        
	}

}
