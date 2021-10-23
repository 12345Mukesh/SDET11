package com.Vtiger.Generic;

public interface IAutoConst
{

	public static String DirPath=System.getProperty("user.dir");
	
	String CHROME_KEY="webdriver.chrome.driver";
	String CHROME_VALUE=DirPath+"\\SDET_11\\chromedriver.exe";

	String GECKO_KEY="webdriver.gecko.driver";
	String GECKO_VALUE=DirPath+"/geckodriver.exe";

	String PROP_PATH=DirPath+"/src/test/resources/data/config1.properties";
	String EXCEL_PATH=DirPath+"/src/test/resources/data/Input Data.xlsx";

	int timeforimplicitwait=10;
	int timeforexplicitwait=10;
	
}
