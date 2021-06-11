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



class LogOut_Account {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Klik menu My Account")
	def Klik_menu_My_Account() {
		WebUI.click(findTestObject('Page_Home/Button_MyAccount'))
	}

	@When("Klik side menu Logout")
	def Klik_side_menu_Logout() {
		WebUI.click(findTestObject('MyAccount/LogOut/SideMenu_Logout'))
	}

	@And("Klik konfirmasi logout")
	def Klik_konfirmasi_logout() {
		WebUI.click(findTestObject('MyAccount/LogOut/Confirmation_Logout'))
	}
	
	@Then("Account berhasil logout")
	def Account_berhasil_logout() {
		WebUI.verifyElementText(findTestObject('MyAccount/Verifikasi/VerifikasiLogOut_MyAccount'), 'MY ACCOUNT')
		WebUI.closeBrowser()
	}
}