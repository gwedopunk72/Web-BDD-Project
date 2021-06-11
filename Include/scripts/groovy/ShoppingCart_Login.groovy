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



class ShoppingCart_Login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Membuka website")
	def Membuka_website() {
		WebUI.openBrowser('https://duniakeris.com/')
		WebUI.maximizeWindow()
	}

	@When("Klik menu Login")
	def Klik_menu_Login() {
		WebUI.click(findTestObject('Page_Home/Button_LoginRegister'))
	}

	@And("Input username")
	def Input_username() {
		WebUI.setText(findTestObject('Page_Login/input__username'), 'tosanaji')
	}

	@And("Input password")
	def Input_password() {
		WebUI.setEncryptedText(findTestObject('Page_Login/input__password'), 'aRtA9wam/Yv4OwufeOB3fA==')
	}

	@Then("Klik menu login")
	def Klik_menu_login() {
		WebUI.click(findTestObject('Page_Login/Button__login'))
		WebUI.delay(5)
		WebUI.verifyElementText(findTestObject('Page_Home/Button_MyAccount'), 'MY ACCOUNT')
	}
}