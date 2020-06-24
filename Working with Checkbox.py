from selenium import webdriver

driver=webdriver.Chrome(executable_path="C://Selenium//driver//chromedriver_win32//chromedriver.exe")
URL = "http://localhost:5000/easytesting"
driver.get(URL)

try:
    driver.maximize_window()
    driver.find_element_by_id("exampleInputEmail1").send_keys("Alan_Alford63@hotmail.com")
    driver.find_element_by_id("exampleInputPassword1").send_keys("Alan_Alford63")

    # To simply click on checkbox regardless of the status
    driver.find_element_by_id("privacypolicy").click()

    # driver.find_element_by_id("btnk").click()

    print("Test Case Passed : ")




except Exception as e:
    print("Test Case Failed : ")