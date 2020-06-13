from selenium import webdriver

driver=webdriver.Chrome(executable_path="C://Selenium//driver//chromedriver_win32//chromedriver.exe")

try:
    # username:password@
    URL = "https://admin:admin@the-internet.herokuapp.com/basic_auth"
    driver.get(URL)
    Message=driver.find_element_by_css_selector("p").text
    print(Message)

except Exception as e:
    print("ERROR : ")