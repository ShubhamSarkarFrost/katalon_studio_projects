import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.automationpractice.pl/index.php')

WebUI.click(findTestObject('Object Repository/Page_My Shop/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Shop/input_Email address_email_create'), 'autotest2@test.com')

WebUI.click(findTestObject('Object Repository/Page_Login - My Shop/span_Create an account'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Shop/input__customer_firstname'), 'Auto')

WebUI.click(findTestObject('Object Repository/Page_Login - My Shop/input_Mr_id_gender'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Shop/input__customer_lastname'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Shop/input__email'), 'autotest2@test.com')

WebUI.click(findTestObject('Object Repository/Page_Login - My Shop/input__email'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Shop/input__passwd'), 'qpymYoQV0Sxhfq/iHdiH3Q==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Shop/select_-12345678910111213141516171819202122_51e29d'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Shop/select_-JanuaryFebruaryMarchAprilMayJuneJul_702766'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Shop/select_-20242023202220212020201920182017201_3973b5'), 
    '1959', true)

WebUI.click(findTestObject('Object Repository/Page_Login - My Shop/input_August_newsletter'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Shop/span_Register'))

WebUI.click(findTestObject('Object Repository/Page_My account - My Shop/a_Sign out'))

WebUI.click(findTestObject('Object Repository/Page_My Shop/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Shop/input__email'), 'autotest2@test.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Shop/input_Password_passwd'), 'qpymYoQV0Sxhfq/iHdiH3Q==')

WebUI.click(findTestObject('Object Repository/Page_Login - My Shop/span_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_My account - My Shop/h1_My account'))

WebUI.closeBrowser()

