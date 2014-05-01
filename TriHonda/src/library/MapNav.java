package library;


import static org.junit.Assert.*;


import java.awt.AWTException;

import java.awt.Robot;

import java.io.File;

import java.io.FileInputStream;


import org.openqa.selenium.Capabilities;

import org.openqa.selenium.remote.RemoteWebDriver;


import java.text.SimpleDateFormat;

import java.util.Calendar;

import java.util.NoSuchElementException;

import java.util.concurrent.TimeUnit;


import jxl.Sheet;

import jxl.Workbook;


import org.apache.commons.io.FileUtils;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.NoAlertPresentException;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.Rotatable;

import org.openqa.selenium.ScreenOrientation;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.android.AndroidDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class MapNav {

  private WebDriver driver;

  private String baseUrl;

  private boolean acceptNextAlert = true;

  private StringBuffer verificationErrors = new StringBuffer();

  static String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());


  @Before

  public void setUp() throws Exception {

    driver = new FirefoxDriver();

    baseUrl = "http://dev.trihonda.pubmodev.com/honda-dealer-results?zip=10466&all=1";

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    

  }


  @Test

  public void testTriHondaMapClick() throws Exception {

    driver.get(baseUrl);

    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div/ul/li[3]")).click();

    File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile1, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "1-" + timeStamp + ".png"));

 	

 	

 	

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[2]/ul/li[3]")).click();

    File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile2, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "2-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[3]/ul/li[2]")).click();

    File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile3, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "3-" + timeStamp + ".png"));

    driver.findElement(By.linkText("NEXT >")).click();

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[4]/ul/li[3]")).click();

    File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile4, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "4-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[5]/ul/li[3]")).click();

    File scrFile5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile5, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "5-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[6]/ul/li[3]")).click();

    File scrFile6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile6, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "6-" + timeStamp + ".png"));

    driver.findElement(By.linkText("NEXT >")).click();

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[7]/ul/li[2]")).click();

    File scrFile7 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile7, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "7-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[8]/ul/li[3]")).click();

    File scrFile8 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile8, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "8-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[9]/ul/li[2]")).click();

    File scrFile9 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile9, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "9-" + timeStamp + ".png"));

    driver.findElement(By.linkText("NEXT >")).click();

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[10]/ul/li[3]")).click();

    File scrFile10 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile10, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "10-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[11]/ul/li[3]")).click();

    File scrFile11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile11, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "11-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[12]/ul/li[2]")).click();

    File scrFile12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile12, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "12-" + timeStamp + ".png"));

    driver.findElement(By.linkText("NEXT >")).click();

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[13]/ul/li")).click();

    File scrFile13 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile13, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "13-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[14]/ul/li[3]")).click();

    File scrFile14 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile14, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "14-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[15]/ul/li[2]")).click();

    File scrFile15 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile15, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "15-" + timeStamp + ".png"));

    driver.findElement(By.linkText("NEXT >")).click();

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[16]/ul/li[4]")).click();

    File scrFile16 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile16, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "16-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[17]/ul/li[4]")).click();

    File scrFile17 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile17, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "17-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[18]/ul/li[2]")).click();

    File scrFile18 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile18, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "18-" + timeStamp + ".png"));

    driver.findElement(By.linkText("NEXT >")).click();

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[19]/ul/li[2]")).click();

    File scrFile19 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile19, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "19-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[20]/ul/li[3]")).click();

    File scrFile20 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile20, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "20-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[21]/ul/li")).click();

    File scrFile21 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile21, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "21-" + timeStamp + ".png"));

    driver.findElement(By.linkText("NEXT >")).click();

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[22]/ul/li")).click();

    File scrFile22 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile22, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "22-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[23]/ul/li[2]")).click();

    File scrFile23 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile23, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "23-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[24]/ul/li[2]")).click();

    File scrFile24 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile24, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "24-" + timeStamp + ".png"));

    driver.findElement(By.linkText("NEXT >")).click();

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[25]/ul/li[4]")).click();

    File scrFile25 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile25, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "25-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[26]/ul/li[3]")).click();

    File scrFile26 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile26, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "26-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[27]/ul/li[3]")).click();

    File scrFile27 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile27, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "27-" + timeStamp + ".png"));

    driver.findElement(By.linkText("NEXT >")).click();

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[28]/ul/li[4]")).click();

    File scrFile28 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile28, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "28-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[29]/ul/li[2]")).click();

    File scrFile29 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile29, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "29-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[30]/ul/li[2]")).click();

    File scrFile30 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile30, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "30-" + timeStamp + ".png"));

    driver.findElement(By.linkText("NEXT >")).click();

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[31]/ul/li[4]")).click();

    File scrFile31 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile31, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "31-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[32]/ul/li[3]")).click();

    File scrFile32 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile32, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "32-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[33]/ul/li[3]")).click();

    File scrFile33 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile33, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "33-" + timeStamp + ".png"));

    driver.findElement(By.linkText("NEXT >")).click();

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[34]/ul/li[3]")).click();

    File scrFile34 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile34, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "34-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[35]/ul/li[3]")).click();  

    

    File scrFile61 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile61, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "35-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[36]/ul/li[3]")).click();

    File scrFile35 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile35, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "36-" + timeStamp + ".png"));

    driver.findElement(By.linkText("NEXT >")).click();

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[37]/ul/li")).click();

    File scrFile36 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile36, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "37-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[38]/ul/li[2]")).click();

    File scrFile37 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile37, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "38-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[39]/ul/li")).click();

    File scrFile38 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile38, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "39-" + timeStamp + ".png"));

    driver.findElement(By.linkText("NEXT >")).click();

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[40]/ul/li[3]")).click();

    File scrFile39 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile39, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "40-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[41]/ul/li[2]")).click();

    File scrFile40 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile40, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "41-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[42]/ul/li[3]")).click();

    File scrFile41 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile41, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "42-" + timeStamp + ".png"));

    driver.findElement(By.linkText("NEXT >")).click();

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[43]/ul/li[2]")).click();

    File scrFile42 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile42, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "43-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[44]/ul/li[4]")).click();

    File scrFile43 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile43, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "44-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[45]/ul/li[4]")).click();

    File scrFile44 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile44, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "45-" + timeStamp + ".png"));

    driver.findElement(By.linkText("NEXT >")).click();

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[46]/ul/li[3]")).click();

    File scrFile45 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile45, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "46-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[47]/ul/li[3]")).click();

    File scrFile46 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile46, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "47-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[48]/ul/li[3]")).click();

    File scrFile47 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile47, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "481-" + timeStamp + ".png"));

    driver.findElement(By.linkText("NEXT >")).click();

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[49]/ul/li[2]")).click();

    File scrFile48 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile48, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "49-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[50]/ul/li[2]")).click();

    File scrFile49 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile49, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "50-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[51]/ul/li[3]")).click();

    File scrFile50 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile50, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "51-" + timeStamp + ".png"));

    driver.findElement(By.linkText("NEXT >")).click();

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[52]/ul/li[4]")).click();

    File scrFile51 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile51, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "52-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[53]/ul/li[4]")).click();

    File scrFile52 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile52, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "53-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[54]/ul/li[2]")).click();

    File scrFile53 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile53, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "54-" + timeStamp + ".png"));

    driver.findElement(By.linkText("NEXT >")).click();

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[55]/ul/li[4]")).click();

    File scrFile54 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile54, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "55-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[56]/ul/li[3]")).click();

    File scrFile55 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile55, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "56-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[57]/ul/li[3]")).click();

    File scrFile56 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile56, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "57-" + timeStamp + ".png"));

    driver.findElement(By.linkText("NEXT >")).click();

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[58]/ul/li[4]")).click();

    File scrFile57 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile57, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "58-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[59]/ul/li[2]")).click();

    File scrFile58 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile58, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "59-" + timeStamp + ".png"));

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[60]/ul/li[3]")).click();

    File scrFile59 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile59, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "60-" + timeStamp + ".png"));

    driver.findElement(By.linkText("NEXT >")).click();

    driver.findElement(By.xpath("//div[@id='map_overlay']/div/div[2]/div/div/div[61]/ul/li[2]")).click();

    File scrFile60 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 	FileUtils.copyFile(scrFile60, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "-" + "61-" + timeStamp + ".png"));

  }


  @After

  public void tearDown() throws Exception {

    driver.quit();

    String verificationErrorString = verificationErrors.toString();

    if (!"".equals(verificationErrorString)) {

      fail(verificationErrorString);

    }

  }


  private boolean isElementPresent(By by) {

    try {

      driver.findElement(by);

      return true;

    } catch (NoSuchElementException e) {

      return false;

    }

  }


  private boolean isAlertPresent() {

    try {

      driver.switchTo().alert();

      return true;

    } catch (NoAlertPresentException e) {

      return false;

    }

  }


  private String closeAlertAndGetItsText() {

    try {

      Alert alert = driver.switchTo().alert();

      String alertText = alert.getText();

      if (acceptNextAlert) {

        alert.accept();

      } else {

        alert.dismiss();

      }

      return alertText;

    } finally {

      acceptNextAlert = true;

    }

  }

}