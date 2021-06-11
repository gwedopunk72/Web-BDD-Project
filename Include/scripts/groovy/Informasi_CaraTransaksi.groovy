import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Informasi_CaraTransaksi {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Open browser dunia keris")
	def Open_browser_dunia_keris() {
		WebUI.openBrowser('https://duniakeris.com/')
		WebUI.maximizeWindow()
	}

	@When("Click sub menu cara transaksi")
	def Click_sub_menu_cara_transaksi() {
		WebUI.mouseOver(findTestObject('Page_Home/Menu_Informasi'))
		WebUI.click(findTestObject('Informasi/SubMenu_CaraTransaksi'))
	}

	@Then("Kembali ke menu awal")
	def Kembali_ke_menu_awal() {
		WebUI.click(findTestObject('Page_Home/Button_Home'))
		WebUI.delay(2)
		WebUI.verifyElementText(findTestObject('Page_Home/Verifikasi/HomeTitle_ProdukTerbaru'), 'PRODUK TERBARU')
	}
}