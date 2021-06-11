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



class SignUp_EmptyPassword {
	@Given("Click register button2")
	def Click_register_button2() {
		WebUI.click(findTestObject('Page_Home/Button_LoginRegister'))
		WebUI.maximizeWindow()
	}

	@When("Enter username2")
	def Enter_username2() {
		WebUI.setText(findTestObject('Page_Register/input__username'), 'tosanaji2011')
	}

	@And("Enter Email2")
	def Enter_Email2() {
		WebUI.setText(findTestObject('Page_Register/input__email'), 'Tosanaji2011@yahoo.com')
	}

	@And("Enter empty password2")
	def Enter_empty_password2() {
		WebUI.setEncryptedText(findTestObject('Page_Register/input__password'), '')
	}

	@Then("Tap register button2")
	def Tap_register_button2() {
		WebUI.click(findTestObject('Page_Register/Button__register'))
		WebUI.delay(5)
		WebUI.verifyElementText(findTestObject('Verification/Signup_ErrorPleaseEnterAccountPassword'), 'Error: Please enter an account password.')
	}
}