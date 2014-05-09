package library;


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


public class DealerInput {

  private WebDriver driver;

  private String baseUrl;

  private boolean acceptNextAlert = true;

  private StringBuffer verificationErrors = new StringBuffer();

  static String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());


  @Before

  public void setUp() throws Exception {

    driver = new FirefoxDriver();

    baseUrl = "http://dev.trihonda.pubmodev.com";

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    

  }


  @Test

  public void testTriHondaMapInput() throws Exception {

    driver.get(baseUrl + "/honda-dealer-results?zip=10466&all=1");

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("APPLE HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile1, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Apple-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("ATLANTIC HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.findElement(By.name("zip")).clear();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile2, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Atlantic-Honda.png"));

    

    driver.findElement(By.name("zip")).sendKeys("BABYLON HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile3, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Babylon-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("BARON HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile4, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Baron-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("BAY RIDGE HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile5, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Bay-Ridge-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("BREWSTER HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile6, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Brewster-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("BRONX HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile7 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile7, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Bronx-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("CURRY HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile8 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile8, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Curry-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("FRIENDLY HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile9 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile9, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Apple-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("HILLSIDE HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile10 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile10, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Hillside-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("HONDA CITY");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile11, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Honda-City.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("HONDA MANHASSET");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile12, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Honda-Manhasset.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("HONDA OF KINGSTON");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile13 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile13, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Honda-of-Kingston.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("HONDA OF MANHATTAN");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile14 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile14, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Honda-of-Manhattan.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("HONDA OF NANUET");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile15 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile15, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Honda-of_Nanuet.png"));

    

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("HONDA OF NEW ROCHELLE");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile16 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile16, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Honda-of-NewRochelle.png"));

    

    driver.findElement(By.name("zip")).clear();    

    driver.findElement(By.name("zip")).sendKeys("HONDA OF STATEN ISLAND");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile17 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile17, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Honda-of-Staten_Island.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("HUNTINGTON HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile18 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile18, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Huntington-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("MIDDLETOWN HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile19 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile19, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Middleton-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("MILLENNIUM HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile20 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile20, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Milennium-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("MOREHEAD HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile21 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile21, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Morehead-Honda.png"));

    

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("MT. KISCO HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile22 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile22, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Mt-Kisco-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("NARDY HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile23 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile23, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Nardy-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("NORTH SHORE HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile24 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile24, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-North-Shore-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("PARAGON HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile25 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile25, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Parago-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("PLAZA HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile26 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile26, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Plaza-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("SOUTH SHORE HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile27 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile27, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-SouthShore-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("TARRYTOWN HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile28 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile28, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Tarrytown-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("WHITE PLAINS HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile29 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile29, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-White-Plains-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("YONKERS HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile30 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile30, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Yonkers-Honda.png"));

    

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("AUTOSPORT HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile31 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile31, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-AutoSport-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("CAUSEWAY HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile32 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile32, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Causeway-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("CLINTON HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile33 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile33, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Clinton-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("COAST HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile34 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile34, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Coast-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("DCH ACADEMY HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile35 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile35, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-DCH-Academy-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("DCH KAY HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile36 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile36, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-DCH-Kay-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("DCH PARAMUS HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile37 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile37, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-DCH-Paramus-Honda.png"));

    

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("GARDEN STATE HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile38 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile38, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Garden-State-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("HACKETTSTOWN HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile39 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile39, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Hackettstown-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("HONDA OF FREEHOLD");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile40 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile40, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Honda-of-Freehold.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("HONDA OF PRINCETON");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile41 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile41, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Honda-of-Princeton.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("HONDA OF TENAFLY");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile42 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile42, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Honda-of-Tenafly.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("HONDA OF TOMS RIVER");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile43 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile43, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Honda-of-TomsRiver.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("HONDA UNIVERSE");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile44 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile44, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Honda-Universe.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("HUDSON HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile45 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile45, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Hudson-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("JOYCE HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile46 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile46, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Joyce-Honda.png"));

    

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("MADISON HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile47 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile47, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Madison-Honda.png"));

    

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("MAHWAH HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile48 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile48, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Mahwah-Honda.png"));

    

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("METRO HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile49 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile49, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Metro-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("OPEN ROAD HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile50 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile50, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Open-Road-Honda.png"));

    

  

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("PAUL MILLER HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile51 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile51, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Paul-Miller-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("PHILLIPSBURG-EASTON");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile52 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile52, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Phillipsburg-Easton.png"));

    

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("PLANET HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile53 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile53, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Planet-Honda.png"));

    

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("ROUTE 22 HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile54 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile54, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Route22-Honda.png"));

    

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("ROUTE 23 HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile55 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile55, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Route23-Honda.png"));

    

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("SUSSEX HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile56 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile56, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Sussex-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("V.I.P. HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile57 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile57, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "-Garden-State-Honda.png"));

    

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("CURTISS RYAN HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile58 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile58, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "Curtiss-Ryan-Honda.png"));

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("GREENWICH HONDA");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile59 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile59, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "Greenwich-Honda.png"));

    

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("HONDA OF DANBURY");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile60 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile60, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "Honda-of=Danbury.png"));

    

    

    driver.findElement(By.name("zip")).clear();

    driver.findElement(By.name("zip")).sendKeys("HONDA OF WESTPORT");

    driver.findElement(By.linkText("GO")).click();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    File scrFile61 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(scrFile61, new File("Y://Screenshots/MapNav/" + timeStamp + "/" + "x" + timeStamp + "Honda-of-Westport.png"));

    

  }


  @After

  public void tearDown() throws Exception {

    driver.quit();

    String verificationErrorString = verificationErrors.toString();

   

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

