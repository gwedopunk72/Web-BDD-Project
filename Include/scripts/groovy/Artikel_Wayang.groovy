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



class Artikel_Wayang {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Klik SubMenu Artikel Wayang")
	def Klik_SubMenu_Artikel_Wayang() {
		WebUI.mouseOver(findTestObject('Page_Home/Menu_Artikel'))
		WebUI.click(findTestObject('Artikel/SubMenu_Wayang'))
		WebUI.verifyElementText(findTestObject('Artikel/Verifikasi/Title_ArchivesWayang'), 'CATEGORY ARCHIVES: WAYANG')
	}	
	
	@When("Klik artikel RadenHanoman")
	def Klik_artikel_RadenHanoman() {
		WebUI.scrollToElement(findTestObject('Artikel/Artikel_RadenHanoman'), 0)
		WebUI.click(findTestObject('Artikel/Artikel_RadenHanoman'))
		WebUI.verifyElementText(findTestObject('Artikel/Verifikasi/Title_RadenHanoman'), 'Raden Hanoman')
		WebUI.back()
	}

	@And("Klik artikel ResiSubali")
	def Klik_artikel_ResiSubali() {
		WebUI.click(findTestObject('Artikel/Artikel_ResiSubali'))
		WebUI.verifyElementText(findTestObject('Artikel/Verifikasi/Title_ResiSubali'), 'Resi Subali')
		WebUI.back()
	}
	
	@And("Klik artikel Ramaparasu")
	def Klik_artikel_Ramaparasu() {
		WebUI.click(findTestObject('Artikel/Artikel_Ramaparasu'))
		WebUI.verifyElementText(findTestObject('Artikel/Verifikasi/Title_Ramaparasu'), 'Ramaparasu')
		WebUI.back()
	}
	
	@And("Klik artikel BambangSumantri")
	def Klik_artikel_BambangSumantri() {
		WebUI.click(findTestObject('Artikel/Artikel_BambangSumantri'))
		WebUI.verifyElementText(findTestObject('Artikel/Verifikasi/Title_BambangSumantri'), 'Bambang Sumantri')
	}

	@Then("Kembali ke menu utama3")
	def Kembali_ke_menu_utama3() {
		WebUI.click(findTestObject('Page_Home/Button_Home'))
		WebUI.delay(2)
		WebUI.verifyElementText(findTestObject('Page_Home/Verifikasi/HomeTitle_ProdukTerbaru'), 'PRODUK TERBARU')
		WebUI.closeBrowser()
	}
}