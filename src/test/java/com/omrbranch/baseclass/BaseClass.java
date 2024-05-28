package com.omrbranch.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	 public static WebDriver driver;
	Select select;
	
	public void clearCart(String cart, String product) throws InterruptedException {
		WebElement cartIcon = findLocatorbyXpath(cart);
		elementClick(cartIcon);
		List<WebElement> productList = driver.findElements(By.xpath(product));
		for (WebElement webElement : productList) {
			webElement.click();
			sleep();
			WebElement cartIcon2 = findLocatorbyXpath(cart);
			elementClick(cartIcon2);
			sleep();
			
		}

	}
	//Check IN
	public void checkIndate(WebElement element,String chooseDate) {
		 element = driver.findElement(By.name("check_in"));
		 element.click();
		 implicitwait();
		WebElement calTable = driver.findElement(By.id("ui-datepicker-div"));
		List<WebElement> dates = calTable.findElements(By.tagName("td"));
		for (WebElement date : dates) {
			String dat = date.getText();
			if(dat.equalsIgnoreCase(chooseDate)) {
				date.click();
				break;
			}}

	}
	
	//Check Out
		public void checkOutdate(WebElement element,String chooseDate) {
			 element = driver.findElement(By.name("check_out"));
			 element.click();
			 implicitwait();
			WebElement calTable = driver.findElement(By.id("ui-datepicker-div"));
			List<WebElement> dates = calTable.findElements(By.tagName("td"));
			for (WebElement date : dates) {
				String dat = date.getText();
				if(dat.equalsIgnoreCase(chooseDate)) {
					date.click();
					break;
				}}

		}
		
	
	//Alert accept
	public void alertAccept() {
		Alert al=driver.switchTo().alert();
		al.accept();

	}
	//Getting Hotel price
	public List getHotelPrice(List<WebElement> hotelPrice) throws InterruptedException  {
		sleepSec(3000);
		List<Integer> dev=new ArrayList<>();
		for (WebElement price : hotelPrice) {
			String pri = price.getText();
			 pri = pri.replaceAll("[^a-zA-Z0-9]","");
			 pri = pri.replaceAll("\\s", "");
			 int p =Integer.parseInt(pri);
			 dev.add(p);
				}
           return dev;
	}
	//Getting Hotel name
		public List getHotelName(List<WebElement> hotelname) throws InterruptedException  {
			sleepSec(3000);
			List<String> dev=new ArrayList<>();
			for (WebElement name : hotelname) {
				String HotelName = name.getText();
				dev.add(HotelName);
					}
	           return dev;
		}
		
		//Alert method
		public void acceptAlert() {
			Alert al=driver.switchTo().alert();
			implicitwait();
            al.accept();
		}
		
		public void dismissAlert() {
			Alert al=driver.switchTo().alert();
			implicitwait();
            al.dismiss();
		}
		
	public void switchFrameID(String id) {
		driver.switchTo().frame(id);

	}
	public void switchToParentFrame() {
		driver.switchTo().parentFrame();

	}
		
	public void pressEnterKey() throws AWTException {
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void elementMouseActionClick(WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).perform();
	}
	
	public void dropDownSelectByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void dropDownSelectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}
	public  void sleepSec(int sec) throws InterruptedException {
		
      Thread.sleep(sec);
	}
	
	public static void sleepSecs(int secs) throws InterruptedException {
		
	      Thread.sleep(secs);
		}
	public String getCellData(String sheetName, int rownum, int cellnum) throws IOException {
		String res = null;
		File file = new File("C:\\Users\\deepa\\eclipse-workspace\\org.sample.grocery\\Excel\\Grocery.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			res=cell.getStringCellValue();
			
			break;
		case NUMERIC:
			if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
				res = dateFormat.format(dateCellValue);
			}else {
				double numericCellValue = cell.getNumericCellValue();
				long round = Math.round(numericCellValue);
				if(numericCellValue==round) {
					res=String.valueOf(round);
				}else {
				   
					res=String.valueOf(numericCellValue);
				}
			}
			break;
		default:
			break;
		}
		return res;
	}
	
	// update Data into the Excel Cell
		public void updateCellData(String sheetName,int rowNum,int cellNum,String OldData,String NewData) throws IOException {
			String res=null;
			File file=new File("C:\\Users\\deepa\\eclipse-workspace\\org.sample.grocery\\Excel\\Grocery.xlsx");
			FileInputStream fis=new FileInputStream(file);
			Workbook workbook=new XSSFWorkbook(fis);
		    Sheet sheet = workbook.getSheet("Sheet1");
		    Row row = sheet.getRow(rowNum);
		    Cell cell = row.getCell(cellNum);
		    String value = cell.getStringCellValue();
		    if (value.equals(OldData)) {
				cell.setCellValue(NewData);
			}
		    FileOutputStream out=new FileOutputStream(file);
		    workbook.write(out);

		}
		
		// Create Cell and Set date into the Sheet
		public void CreateCellAndSetData(String sheetName,int rowNum,int cellNum,String Data) throws IOException {
			String res=null;
			File file=new File("C:\\Users\\deepa\\eclipse-workspace\\org.sample.grocery\\Excel\\Grocery.xlsx");
			FileInputStream fis=new FileInputStream(file);
			Workbook workbook=new XSSFWorkbook(fis);
		    Sheet sheet = workbook.getSheet("Sheet1");
		    Row row = sheet.getRow(rowNum);
		    Cell cell = row.createCell(cellNum);
		    cell.setCellValue(Data);
		    FileOutputStream out=new FileOutputStream(file);
		    workbook.write(out);

		}


	public List<String> getAllOptionsText(WebElement element) {
		List<String> allOptionsText = new ArrayList<String>();
		select = new Select(element);
		List<WebElement> options = select.getOptions();

		for (WebElement webElement : options) {
			String text = webElement.getText();
			allOptionsText.add(text);

		}
		return allOptionsText;
	}

	public void elementSendKeysJs(WebElement element, String data) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','" + data + "')", element);
	}

	public boolean isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public boolean isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

	public void visibilityOfElement(WebElement element, int secs) {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(secs));
		driverWait.until(ExpectedConditions.visibilityOf(element));

	}

	public void visibilityOfElement(WebElement element) {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driverWait.until(ExpectedConditions.visibilityOf(element));

	}

	public void implicitwait(int secs) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secs));
	}

	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void selectOptionByText(WebElement element, String text) {
		select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void selectOptionByValue(WebElement element, String value) {
		select = new Select(element);
		select.selectByValue(value);
	}

	public void selectOptionByIndex(WebElement element, int index) {
		select = new Select(element);
		select.selectByIndex(index);
	}

	// 1%-?
	public String elementGetAttributeValue(WebElement element, String attributeName) {
		String attribute = null;
		visibilityOfElement(element);
		boolean displayed = isDisplayed(element);
		if (displayed) {
			attribute = element.getAttribute(attributeName);
		}
		return attribute;
	}

	// value fixed 99%
	public String elementGetAttributeValue(WebElement element) {
		visibilityOfElement(element);
		String attribute = null;

		boolean displayed = isDisplayed(element);
		if (displayed) {
			attribute = element.getAttribute("value");
		}
		return attribute;
	}

	public String elementGetText(WebElement element) {
		visibilityOfElement(element);
		String text = element.getText();
		System.out.println(text);
		return text;
	}
	
	public byte [] screenshot() {
	  TakesScreenshot screenShot=(TakesScreenshot)driver;
	 byte [] b= screenShot.getScreenshotAs(OutputType.BYTES);
   return b;
	}

	public static void browserLaunch(String browserType) {
		switch(browserType) {
		case "chrome":
		driver = new ChromeDriver();
		break;
		case "ie":
		driver = new InternetExplorerDriver();
		break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
	}
		}

	public static void enterApplnUrl(String url) {
		driver.get(url);
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public static void browserQuit() {
		driver.quit();
	}
	

	public void elementSendKeys(WebElement element, String data) {
		visibilityOfElement(element);
		boolean enabled = isEnabled(element);
		boolean displayed = isDisplayed(element);

		if (enabled && displayed) {
			element.sendKeys(data);
		}

	}

	public void elementClick(WebElement element) {
		visibilityOfElement(element);
		boolean enabled = isEnabled(element);
		boolean displayed = isDisplayed(element);

		if (enabled && displayed) {
			element.click();
		}
	}
	
	

	public String getApplnTitle() {
		String title = driver.getTitle();
		return title;
	}
	public void findLocatorsByClassName(String locator) {
		List<WebElement> elements = driver.findElements(By.className(locator));

}
	public WebElement findLocatorById(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}

	public WebElement findLocatorByName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}

	public WebElement findLocatorbyXpath(String data) {
		WebElement element = driver.findElement(By.xpath(data));
		return element;
	}
	
	public static String  getProjectPath() {
		return System.getProperty("user.dir");

	}
	
	public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		Properties properties=new Properties();
		properties.load(new FileInputStream(getProjectPath()+"\\config\\config.properties"));
		Object object = properties.get(key);
		String value=(String)object;
		return value;

	}
	


}
