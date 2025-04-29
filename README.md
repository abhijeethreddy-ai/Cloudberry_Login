TC02_Login - Selenium Test Automation
This project contains an automated test script using Java and Selenium WebDriver to validate the login functionality of the website: cloudberrystore.services.

📄 Test Case Description
Test Case ID: TC02_Login
Purpose: Verify that a user can log in successfully using valid credentials.

✅ Steps Performed:
Launch the Chrome browser.

Navigate to: https://cloudberrystore.services/

Click on the 'My Account' dropdown.

Select the 'Login' option.

Enter a valid Email and Password.

Click the 'Login' button.

Verify that the 'My Account' page is displayed after login.

Close the browser.

🧪 Technologies Used
Java

Selenium WebDriver

Maven (if applicable)

ChromeDriver

🔧 Prerequisites
Java JDK 8 or higher installed

Maven installed (optional)

Chrome browser installed

ChromeDriver added to your system's PATH

🚀 How to Run the Test
Clone or download this repository.

Open the project in your preferred IDE (e.g., IntelliJ, Eclipse).

Ensure Selenium libraries are added to the classpath.

Run the TC02_Login class.

📌 Notes
Email used for login: abhijeethwes@gmail.com

Password used: Test@123

The script uses XPath locators and waits implicitly for 10 seconds.

Test outcome is printed in the console as "Test Passed" or "Test Failed" based on login success.
