import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pl.testeroprogramowania.FileReader;

import java.io.IOException;
import java.time.Duration;
import java.util.*;

public class ToolsQA {
    @Test
    public void textBox() throws IOException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        int repeat = 25;
        for (int i = 0; i <= repeat; i++) {
            String fullNames = FileReader.getNextFullName();
            String email = FileReader.getNextEmail();
            String currentAddress = FileReader.getNextCurrentAddress();
            String permanentAddress = FileReader.getNextPermanentAddress();


            driver.get("https://demoqa.com/text-box");
            WebElement userFullName = driver.findElement(By.xpath("//input[@id='userName']"));
            WebElement userEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
            WebElement userCurrentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
            WebElement userPermanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
            WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
            jse.executeScript("scroll(0,300)");
            userFullName.sendKeys(fullNames);
            userEmail.sendKeys(email);
            userCurrentAddress.sendKeys(currentAddress);
            userPermanentAddress.sendKeys(permanentAddress);
            submit.click();


        }
    }

    @Test
    public void checkbox() throws IOException, InterruptedException {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        int repeat = 15;
        for (int i = 0; i <= repeat; i++) {
            Random random = new Random();
            int y = random.nextInt(15);
            System.out.println("Numer zmiennej: " + y);
            driver.get("https://demoqa.com/checkbox");
            WebElement rozwin = driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']"));
            rozwin.click();

            List<WebElement> buttons = driver.findElements(By.cssSelector("button.rct-collapse-btn"));
            buttons.get(1).click();
            buttons.get(2).click();
            buttons.get(3).click();
            List<WebElement> buttonsDocuments = driver.findElements(By.cssSelector("button.rct-collapse-btn"));
            buttonsDocuments.get(3).click();
            buttonsDocuments.get(4).click();

            WebElement home = driver.findElement(By.xpath("//span[text()='Home']"));
            WebElement desktop = driver.findElement(By.xpath("//span[text()='Desktop']"));
            WebElement notes = driver.findElement(By.xpath("//span[text()='Notes']"));
            WebElement commands = driver.findElement(By.xpath("//span[text()='Commands']"));
            WebElement documents = driver.findElement(By.xpath("//span[text()='Documents']"));
            WebElement workspace = driver.findElement(By.xpath("//span[text()='WorkSpace']"));
            WebElement react = driver.findElement(By.xpath("//span[text()='React']"));
            WebElement angular = driver.findElement(By.xpath("//span[text()='Angular']"));
            WebElement veu = driver.findElement(By.xpath("//span[text()='Veu']"));
            WebElement office = driver.findElement(By.xpath("//span[text()='Office']"));
            WebElement publicc = driver.findElement(By.xpath("//span[text()='Public']"));
            WebElement privatee = driver.findElement(By.xpath("//span[text()='Private']"));
            WebElement classified = driver.findElement(By.xpath("//span[text()='Classified']"));
            WebElement general = driver.findElement(By.xpath("//span[text()='General']"));
            WebElement downloads = driver.findElement(By.xpath("//span[text()='Downloads']"));

            jse.executeScript("scroll(0,300)");
            switch (y) {
                case 0:
                    home.click();
                    break;
                case 1:
                    home.click();
                    desktop.click();
                    break;
                case 2:
                    home.click();
                    desktop.click();
                    notes.click();
                    break;

                case 3:
                    home.click();
                    desktop.click();
                    notes.click();
                    commands.click();
                    break;
                case 4:
                    home.click();
                    desktop.click();
                    notes.click();
                    commands.click();
                    documents.click();
                    break;
                case 5:
                    home.click();
                    desktop.click();
                    notes.click();
                    commands.click();
                    documents.click();
                    workspace.click();
                    break;
                case 6:
                    home.click();
                    desktop.click();
                    notes.click();
                    commands.click();
                    documents.click();
                    workspace.click();
                    react.click();
                    break;
                case 7:
                    home.click();
                    desktop.click();
                    notes.click();
                    commands.click();
                    documents.click();
                    workspace.click();
                    react.click();
                    angular.click();
                    break;
                case 8:
                    home.click();
                    desktop.click();
                    notes.click();
                    commands.click();
                    documents.click();
                    workspace.click();
                    react.click();
                    angular.click();
                    veu.click();
                    break;
                case 9:
                    home.click();
                    desktop.click();
                    notes.click();
                    commands.click();
                    documents.click();
                    workspace.click();
                    react.click();
                    angular.click();
                    veu.click();
                    office.click();
                    break;
                case 10:
                    home.click();
                    desktop.click();
                    notes.click();
                    commands.click();
                    documents.click();
                    workspace.click();
                    react.click();
                    angular.click();
                    veu.click();
                    office.click();
                    publicc.click();
                    break;
                case 11:
                    home.click();
                    desktop.click();
                    notes.click();
                    commands.click();
                    documents.click();
                    workspace.click();
                    react.click();
                    angular.click();
                    veu.click();
                    office.click();
                    publicc.click();
                    privatee.click();
                    break;
                case 12:
                    home.click();
                    desktop.click();
                    notes.click();
                    commands.click();
                    documents.click();
                    workspace.click();
                    react.click();
                    angular.click();
                    veu.click();
                    office.click();
                    publicc.click();
                    privatee.click();
                    classified.click();
                    break;
                case 13:
                    home.click();
                    desktop.click();
                    notes.click();
                    commands.click();
                    documents.click();
                    workspace.click();
                    react.click();
                    angular.click();
                    veu.click();
                    office.click();
                    publicc.click();
                    privatee.click();
                    classified.click();
                    general.click();
                    break;
                case 14:
                    home.click();
                    desktop.click();
                    notes.click();
                    commands.click();
                    documents.click();
                    workspace.click();
                    react.click();
                    angular.click();
                    veu.click();
                    office.click();
                    publicc.click();
                    privatee.click();
                    classified.click();
                    general.click();
                    downloads.click();
                    break;
            }

            String Result = driver.findElement(By.xpath("//div[@id='result']")).getText();
            System.out.printf("Repeat num: " + i + "\n");
            System.out.printf(Result + "\n");


        }
        driver.quit();
    }

    @Test
    public void radioButton() throws IOException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        int repeat = 25;
        for (int i = 0; i <= repeat; i++) {
            System.out.println("Repeat number:" + i + "\n");
            driver.get("https://demoqa.com/radio-button");
            WebElement yes = driver.findElement(By.xpath("//label[text()='Yes']"));
            WebElement impressive = driver.findElement(By.xpath("//label[text()='Impressive']"));
            yes.click();
            impressive.click();
        }
    }

    @Test
    public void webTables() throws IOException, InterruptedException {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/webtables");


        int repeat = 25;
        for (int i = 0; i <= repeat; i++) {
            WebElement addButton = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
            addButton.click();
            WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
            WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
            WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
            WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
            WebElement salary = driver.findElement(By.xpath("//input[@id='salary']"));
            WebElement department = driver.findElement(By.xpath("//input[@id='department']"));


            String FirstName = FileReader.getNextFirstName();
            String LastName = FileReader.getNextLastName();
            String Email = FileReader.getNextEmail();
            String Age = FileReader.getNextAge();
            String Salary = FileReader.getNextSalary();
            String Department = FileReader.getNextDepartment();

            firstName.sendKeys(FirstName);
            lastName.sendKeys(LastName);
            email.sendKeys(Email);
            age.sendKeys(Age);
            salary.sendKeys(Salary);
            department.sendKeys(Department);

            driver.findElement(By.xpath("//button[@id='submit']")).click();
        }
        Thread.sleep(1500);
        WebElement rows = driver.findElement(By.xpath("//option[text()='10 rows']"));
        rows.click();
        WebElement option5 = driver.findElement(By.xpath("//option[text()='5 rows']"));
        WebElement option10 = driver.findElement(By.xpath("//option[text()='10 rows']"));
        WebElement option20 = driver.findElement(By.xpath("//option[text()='20 rows']"));
        WebElement option25 = driver.findElement(By.xpath("//option[text()='25 rows']"));
        WebElement option50 = driver.findElement(By.xpath("//option[text()='50 rows']"));
        WebElement option100 = driver.findElement(By.xpath("//option[text()='100 rows']"));
        Random random = new Random();
        int pages = random.nextInt(6) + 1;
        switch (pages) {
            case 1:
                option5.click();
                break;
            case 2:
                option10.click();
                break;
            case 3:
                option20.click();
                break;
            case 4:
                option25.click();
                break;
            case 5:
                option50.click();
                break;
            case 6:
                option100.click();
                break;

        }
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//span[@title='Delete']"));
        int numberOfButtons = deleteButtons.size();
        System.out.println("Liczba przycisków usuwania: " + numberOfButtons);

        for (int i = 1; i < numberOfButtons && i <= 8; i++) {
            deleteButtons.get(i).click();
        /*
        WebElement searchBar = driver.findElement(By.xpath("//input[@id='searchBox']"));
        String FirstNames = FileReader.getNextFirstName();
        searchBar.sendKeys(FirstNames);
        WebElement edit = driver.findElement(By.xpath("//span[@title='Edit']"));
        edit.click();
        WebElement department = driver.findElement(By.xpath("//input[@id='department']"));
        department.clear();
        department.sendKeys("fdgsfsfg");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        searchBar.click();
        Thread.sleep(2000);
        searchBar.clear();
        Thread.sleep(2000);

        // List<WebElement> buttons = driver.findElements(By.cssSelector("button.rct-collapse-btn"));
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//span[@title='Delete']"));
        int numberOfButtons = deleteButtons.size();
        System.out.println("Liczba przycisków usuwania: " + numberOfButtons);

        for (int i = 1; i < numberOfButtons && i <= 8; i++) {
            deleteButtons.get(i).click();
            /*
        }

         */

        }

    }


    @Test
    public void buttons() {

        // Opcje Chrome

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        try {
            // Otwórz stronę
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/buttons");

            // Utworzenie obiektu WebDriverWait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            Actions actions = new Actions(driver);

            // Double Click
            WebElement doubleClickButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("doubleClickBtn")));
            actions.doubleClick(doubleClickButton).perform();
            WebElement doubleClickMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("doubleClickMessage")));
            System.out.println("Double Click Message: " + doubleClickMessage.getText());

            // Right Click
            WebElement rightClickButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("rightClickBtn")));
            actions.contextClick(rightClickButton).perform();
            WebElement rightClickMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("rightClickMessage")));
            System.out.println("Right Click Message: " + rightClickMessage.getText());

            // Single Click
            WebElement singleClickButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Click Me']")));
            singleClickButton.click();
            WebElement singleClickMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicClickMessage")));
            System.out.println("Single Click Message: " + singleClickMessage.getText());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test
    public void Links() throws IOException {
        WebDriverWait wait;
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://demoqa.com/links");
            WebElement homeLink = driver.findElement(By.linkText("Home"));
            WebElement homeQeoBRLink = driver.findElement(By.xpath("//a[@id='dynamicLink']"));
            WebElement createdLink = driver.findElement(By.linkText("Created"));
            WebElement noContentLink = driver.findElement(By.linkText("No Content"));
            WebElement movedLink = driver.findElement(By.linkText("Moved"));
            WebElement badRequestLink = driver.findElement(By.linkText("Bad Request"));
            WebElement unauthorizedLink = driver.findElement(By.linkText("Unauthorized"));
            WebElement forbiddenLink = driver.findElement(By.linkText("Forbidden"));
            WebElement notFoundLink = driver.findElement(By.linkText("Not Found"));
            createdLink.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("linkResponse")));
            WebElement linkResponse = driver.findElement(By.cssSelector("#linkResponse"));
            String responseText = linkResponse.getText();

            ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
            homeLink.click();
            driver.switchTo().window(tabs.get(0));
            homeQeoBRLink.click();
            driver.switchTo().window(tabs.get(0));
            createdLink.click();
            System.out.printf(responseText);
            driver.switchTo().window(tabs.get(0));
            noContentLink.click();
            System.out.printf(responseText);
            driver.switchTo().window(tabs.get(0));
            movedLink.click();
            System.out.printf(responseText);
            driver.switchTo().window(tabs.get(0));
            badRequestLink.click();
            System.out.printf(responseText);
            driver.switchTo().window(tabs.get(0));
            unauthorizedLink.click();
            System.out.printf(responseText);
            driver.switchTo().window(tabs.get(0));
            forbiddenLink.click();
            System.out.printf(responseText);
            driver.switchTo().window(tabs.get(0));
            notFoundLink.click();
            System.out.printf(responseText);
            driver.switchTo().window(tabs.get(0));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void Links2() throws IOException {
        WebDriverWait wait;
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://demoqa.com/links");

            // Lista WebElementów zawierająca wszystkie linki
            List<WebElement> links = Arrays.asList(
                    driver.findElement(By.linkText("Created")),
                    driver.findElement(By.linkText("No Content")),
                    driver.findElement(By.linkText("Moved")),
                    driver.findElement(By.linkText("Bad Request")),
                    driver.findElement(By.linkText("Unauthorized")),
                    driver.findElement(By.linkText("Forbidden")),
                    driver.findElement(By.linkText("Not Found"))
            );

            // Klikanie na każdy link i drukowanie odpowiedzi
            for (WebElement link : links) {
                link.click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("linkResponse")));
                WebElement linkResponse = driver.findElement(By.cssSelector("#linkResponse"));
                String responseText = linkResponse.getText();
                System.out.println(responseText);

                // Przełączanie się z powrotem do głównego okna (jeśli wymaga tego sytuacja)
                driver.switchTo().window(driver.getWindowHandles().iterator().next());
            }

            // Klikanie na linki Home na końcu
            WebElement homeLink = driver.findElement(By.linkText("Home"));
            WebElement homeQeoBRLink = driver.findElement(By.xpath("//a[@id='dynamicLink']"));

            ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
            homeLink.click();
            driver.switchTo().window(tabs.get(0));
            homeQeoBRLink.click();
            driver.switchTo().window(tabs.get(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void brokenLinks() {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        WebDriverWait wait;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {

            driver.get("https://demoqa.com/broken");
            List<WebElement> links = Arrays.asList(
                    driver.findElement(By.linkText("Click Here for Valid Link")),
                    driver.findElement(By.linkText("Click Here for Broken Link"))
            );

            for (WebElement link : links) {

                link.click();
                driver.navigate().back();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void uploadDownload() throws IOException {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        WebDriverWait wait;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demoqa.com/upload-download");
        List<WebElement> elements = Collections.singletonList(
                driver.findElement(By.xpath("//input[@id='uploadFile']"))
        );


        try {
            elements.get(0).sendKeys("C:\\Users\\brykd.DESKTOP-EHLBJ6D\\Documents\\sampleFile.jpeg");


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

    }

    @Test
    public void dynamicProperties() throws IOException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        WebDriverWait wait;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demoqa.com/dynamic-properties");
        try {

            List<WebElement> dynamicButtons = Arrays.asList(
                    driver.findElement(By.xpath("//button[@id='enableAfter']")),
                    driver.findElement(By.xpath("//p[text()='This text has random Id']")),
                    driver.findElement(By.xpath("//button[@id='colorChange']")),
                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='visibleAfter']")))

            );
            WebElement randomTextElement = driver.findElement(By.xpath("//p[contains(text(), 'This text has random Id')]"));
            String randomId = randomTextElement.getAttribute("id");

            WebElement colorChangeButton = driver.findElement(By.xpath("//button[@id='colorChange']"));
            String buttonColor = colorChangeButton.getCssValue("color");

            for (WebElement dynamicButton : dynamicButtons) {
                dynamicButton.click();
                System.out.println("Color of 'Color Change' button: " + buttonColor);
                System.out.println(randomId);
                dynamicButton.getText();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        try {
            driver1.get("https://demoqa.com/dynamic-properties");
            wait.until(ExpectedConditions.elementToBeClickable(driver1.findElement(By.xpath("//button[@id='enableAfter']")))).click();
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            driver1.quit();
        }
    }

    @Test
    public void dynamicProperties2() throws IOException, InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        try {
            driver.get("https://demoqa.com/dynamic-properties");

            WebElement randomIDText = driver.findElement(By.xpath("//p[text()='This text has random Id']"));
            WebElement enableAfter = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='enableAfter']"))));
            WebElement colorChange = driver.findElement(By.xpath("//button[@id='colorChange']"));
            WebElement visibleAfter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='visibleAfter']")));

            String textID = randomIDText.getAttribute("id");
            randomIDText.click();
            System.out.printf("Text ID: " + textID + "\n");

            enableAfter.click();
            String changedColor = colorChange.getCssValue("color");
            colorChange.click();
            System.out.printf("Changed Color: " + changedColor + "\n");

            visibleAfter.click();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test
    public void studentRegistrationForm() throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        try {

            driver.get("https://demoqa.com/automation-practice-form");
            jse.executeScript("window.scroll(0,900)");


            String firstName = FileReader.getNextFirstName();
            String lastName = FileReader.getNextLastName();
            String email = FileReader.getNextEmail();
            String phoneNumber = FileReader.getNextPhoneNumber();
            String subject = "Maths";
            String uploadPath = "C:\\Users\\brykd.DESKTOP-EHLBJ6D\\Documents\\sampleFile.png";
            String address = FileReader.getNextCurrentAddress();

            WebElement firstNameField = driver.findElement(By.id("firstName"));
            firstNameField.sendKeys(firstName);
            Thread.sleep(1000);

            WebElement lastNameField = driver.findElement(By.id("lastName"));
            lastNameField.sendKeys(lastName);
            Thread.sleep(1000);

            WebElement emailField = driver.findElement(By.id("userEmail"));
            emailField.sendKeys(email);
            Thread.sleep(1000);


            List<WebElement> radioButtons = Arrays.asList(
                    driver.findElement(By.xpath("//label[@for='gender-radio-1']")),
                    driver.findElement(By.xpath("//label[@for='gender-radio-2']")),
                    driver.findElement(By.xpath("//label[@for='gender-radio-3']"))
            );
            radioButtons.get(new Random().nextInt(radioButtons.size())).click();
            Thread.sleep(1000);

            WebElement mobileNumberField = driver.findElement(By.id("userNumber"));
            mobileNumberField.sendKeys(phoneNumber);
            Thread.sleep(1000);
            jse.executeScript("window.scroll(0,900)");

            WebElement datePicker = driver.findElement(By.id("dateOfBirthInput"));
            datePicker.clear();
            WebElement selectYear = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
            selectYear.click();
            driver.findElement(By.xpath("//option[text()='2002']")).click();
            WebElement selectMonth = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
            selectMonth.click();
            driver.findElement(By.xpath("//option[text()='April']")).click();
            driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--005']")).click();


            WebElement subjectContainer = wait.until(ExpectedConditions.elementToBeClickable(By.id("subjectsContainer")));
            WebElement subjectInput = subjectContainer.findElement(By.xpath("//input[@id='subjectsInput']"));
            Actions actions = new Actions(driver);
            actions.moveToElement(subjectInput).click().sendKeys(subject).build().perform();
            WebElement firstOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'subjects-auto-complete__option')]")));
            firstOption.click();
            Thread.sleep(1000);


            List<WebElement> hobbyButtons = Arrays.asList(
                    driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")),
                    driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")),
                    driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"))
            );
            hobbyButtons.get(new Random().nextInt(hobbyButtons.size())).click();
            Thread.sleep(1000);

            WebElement uploadImage = driver.findElement(By.id("uploadPicture"));
            uploadImage.sendKeys(uploadPath);
            Thread.sleep(1000);

            WebElement currentAddressField = driver.findElement(By.id("currentAddress"));
            currentAddressField.sendKeys(address);
            Thread.sleep(1000);
            jse.executeScript("window.scroll(0,900)");

            WebElement selectState = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("state"))));
            selectState.click();
            Thread.sleep(1000);

            List<WebElement> stateSelect = Arrays.asList(
                    driver.findElement(By.xpath("//div[text()='NCR']")),
                    driver.findElement(By.xpath("//div[text()='Uttar Pradesh']")),
                    driver.findElement(By.xpath("//div[text()='Haryana']")),
                    driver.findElement(By.xpath("//div[text()='Rajasthan']"))
            );

            int randomState = new Random().nextInt(stateSelect.size());
            stateSelect.get(randomState).click();
            Thread.sleep(1000);


            WebElement citySelect = wait.until(ExpectedConditions.elementToBeClickable(By.id("city")));
            citySelect.click();
            Thread.sleep(1000);

            List<WebElement> cityOptions;

            switch (randomState) {
                case 0:
                    cityOptions = Arrays.asList(
                            driver.findElement(By.xpath("//div[text()='Delhi']")),
                            driver.findElement(By.xpath("//div[text()='Gurgaon']")),
                            driver.findElement(By.xpath("//div[text()='Noida']"))
                    );
                    break;
                case 1:
                    cityOptions = Arrays.asList(
                            driver.findElement(By.xpath("//div[text()='Agra']")),
                            driver.findElement(By.xpath("//div[text()='Lucknow']")),
                            driver.findElement(By.xpath("//div[text()='Merrut']"))
                    );
                    break;
                case 2:
                    cityOptions = Arrays.asList(
                            driver.findElement(By.xpath("//div[text()='Karnal']")),
                            driver.findElement(By.xpath("//div[text()='Panipat']"))
                    );
                    break;
                case 3:
                    cityOptions = Arrays.asList(
                            driver.findElement(By.xpath("//div[text()='Jaipur']")),
                            driver.findElement(By.xpath("//div[text()='Jaiselmer']"))
                    );
                    break;
                default:
                    throw new IllegalStateException("Unexpected state: " + randomState);
            }

            int randomCity = new Random().nextInt(cityOptions.size());
            cityOptions.get(randomCity).click();
            Thread.sleep(1000);

            WebElement submitButton = driver.findElement(By.id("submit"));
            submitButton.click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test
    public void browser() throws IOException {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        try {
            driver.get("https://demoqa.com/browser-windows");

            List<WebElement> buttons = Arrays.asList(
                    driver.findElement(By.id("tabButton")),
                    driver.findElement(By.id("windowButton")),
                    driver.findElement(By.id("messageWindowButton"))

            );
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            buttons.get(0).click();
            driver.switchTo().window(tabs.get(0));
            ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
            buttons.get(1).click();
            buttons.get(2).click();
            driver.switchTo().window(windows.get(1));
            driver.switchTo().window(windows.get(1));
            driver.switchTo().window(windows.get(1));
            driver.switchTo().window(windows.get(1));
            int iloscZmiennych = windows.size();
            System.out.println(iloscZmiennych);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void windowsTabsButtons() throws IOException {
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);


        driver.get("https://demoqa.com/browser-windows");


        WebElement button = driver.findElement(By.id("windowButton"));
        button.click();

        String originalWindow = driver.getWindowHandle();


        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.numberOfWindowsToBe(2));


        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {

                driver.switchTo().window(windowHandle);
                break;
            }
        }


        System.out.println("New window title: " + driver.getTitle());
        driver.close();

        driver.switchTo().window(originalWindow);


        System.out.println("Original window title: " + driver.getTitle());
    }

    @Test
    public void tabAndWindowsManagement() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://demoqa.com/browser-windows");

            String originalWindow = driver.getWindowHandle();

            List<WebElement> buttons = Arrays.asList(
                    driver.findElement(By.id("tabButton")),
                    driver.findElement(By.id("windowButton")),
                    driver.findElement(By.id("messageWindowButton"))
            );

            buttons.get(0).click();
            buttons.get(1).click();
            buttons.get(2).click();

            ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
            System.out.printf((windows.size() + "\n"));

            driver.switchTo().window(windows.get(3)).close();


        } catch (Exception e) {
            System.out.print("FAIL");
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test
    public void alerts() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            Random random = new Random();
            int acceptdissmiss = random.nextInt(2) + 1;
            driver.get("https://demoqa.com/alerts");

            List<WebElement> buttons = Arrays.asList(
                    driver.findElement(By.id("alertButton")),
                    driver.findElement(By.id("timerAlertButton")),
                    driver.findElement(By.id("confirmButton")),
                    driver.findElement(By.id("promtButton"))

            );

            buttons.get(0).click();
            Alert alertButton = driver.switchTo().alert();
            alertButton.accept();

            buttons.get(1).click();
            Alert timerButton = wait.until(ExpectedConditions.alertIsPresent());
            timerButton.accept();

            switch (acceptdissmiss) {
                case 1:
                    buttons.get(2).click();
                    Alert confirmButton = driver.switchTo().alert();
                    confirmButton.accept();
                    break;
                case 2:
                    buttons.get(2).click();
                    Alert dismissButton = driver.switchTo().alert();
                    dismissButton.dismiss();
                    break;
            }
            buttons.get(3).click();
            Alert inputButton = driver.switchTo().alert();
            inputButton.sendKeys("Dawid");
            inputButton.accept();


        } catch (Exception e) {
            System.out.print("FAIL");
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test
    public void frames() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        try {
            driver.get("https://demoqa.com/frames");

            WebElement firstFrame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
            WebElement scndFrame = driver.findElement(By.xpath("//iframe[@id='frame2']"));
            JavascriptExecutor jseScndFrame = (JavascriptExecutor) driver;

            driver.switchTo().frame(firstFrame);
            WebElement text1stFrame = driver.findElement(By.id("sampleHeading"));
            String text = text1stFrame.getText();
            System.out.printf(text + "\n");


        } catch (Exception e) {
            System.out.print("FAIL");
            e.printStackTrace(
            );
        } finally {
            driver.quit();
        }
    }

    @Test
    public void nestedFrames() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://demoqa.com/nestedframes");

            WebElement parentFrame = driver.findElement(By.id("frame1"));
            WebElement childFrame = driver.findElement(By.xpath("//iframe"));

            driver.switchTo().frame(parentFrame);


        } catch (Exception e) {
            System.out.println("FAIL");
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test
    public void modalDialogs() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        for (int i = 0; i <= 10; i++) {
            try {
                driver.get("https://demoqa.com/modal-dialogs");
                WebElement smallModal = driver.findElement(By.id("showSmallModal"));
                WebElement largeModal = driver.findElement(By.id("showLargeModal"));

                Random rand = new Random();
                int modal = (rand.nextInt(2) + 1);
                switch (modal) {
                    case 1:
                        System.out.print("Small Modal Button \n");
                        smallModal.click();
                        List<WebElement> smallModalContent = Collections.singletonList(
                                driver.findElement(By.xpath("//div[@class='modal-content']"))
                        );
                        WebElement smallModalBody = driver.findElement(By.xpath("//div[@class='modal-body']"));
                        String textSmall = smallModalBody.getText();
                        System.out.printf(textSmall + "\n");
                        WebElement smallCLose = driver.findElement(By.id("closeSmallModal"));
                        smallCLose.click();
                        break;
                    case 2:
                        System.out.print("Large Modal Button \n");
                        largeModal.click();
                        List<WebElement> largeModalContent = Collections.singletonList(
                                driver.findElement(By.xpath("//div[@class='modal-content']"))
                        );
                        WebElement largeModalBody = driver.findElement(By.xpath("//div[@class='modal-body']"));
                        String textLarge = largeModalBody.getText();
                        System.out.printf(textLarge + "\n");
                        WebElement largeCLose = driver.findElement(By.id("closeLargeModal"));
                        largeCLose.click();
                        break;
                }


            } catch (Exception e) {
                System.out.printf("FAIL, próba nr:" + i);
                e.printStackTrace();

            }

        }
        driver.quit();
    }

    @Test
    public void Accordian() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        try {
            driver.get("https://demoqa.com/accordian");

            List<WebElement> sections = Arrays.asList(
                    driver.findElement(By.id("section1Heading")),
                    driver.findElement(By.id("section2Heading")),
                    driver.findElement(By.id("section3Heading"))
            );

            WebElement section1Content = driver.findElement(By.id("section1Content"));
            String textSection1 = section1Content.getText();
            System.out.printf(textSection1 + "\n");
            jse.executeScript("scroll(0,300)");


            sections.get(1).click();
            Thread.sleep(1000);
            WebElement section2Content = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("section2Content")));
            String textSection2 = section2Content.getText();
            System.out.printf(textSection2 + "\n");

            sections.get(2).click();
            Thread.sleep(1000);
            WebElement section3Content = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("section3Content")));
            String textSection3 = section3Content.getText();
            System.out.printf(textSection3 + "\n");


        } catch (Exception e) {
            System.out.print("FAIL");
            e.printStackTrace();
        }
    }

    @Test
    public void autoComplete() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        ArrayList<String> colors = new ArrayList<>(List.of(
                "Red",
                "White",
                "Yellow",
                "Black",
                "Indigo",
                "Aqua",
                "Green"
        ));

        for (int i = 0; i <= 5; i++) {
            try {

                driver.get("https://demoqa.com/auto-complete");
                WebElement multipleColorButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='autoCompleteMultipleInput']")));
                WebElement singleColorButton = driver.findElement(By.xpath("//input[@id='autoCompleteSingleInput']"));

                ArrayList<String> colorsCopy = new ArrayList<>(colors);
                Random rand = new Random();
                for (int y = 0; y <= 3; y++) {

                    int randomColor = rand.nextInt(colorsCopy.size());
                    String color = colorsCopy.get(randomColor);

                    multipleColorButton.sendKeys(color);
                    multipleColorButton.sendKeys(Keys.ENTER);
                    colorsCopy.remove(randomColor);
                    Thread.sleep(1000);
                }
                List<WebElement> removeButtons = driver.findElements(By.cssSelector(".auto-complete__multi-value .auto-complete__multi-value__remove"));
                int randomRemove = rand.nextInt(3);
                removeButtons.get(randomRemove).click();
                Thread.sleep(2000);


                int randomColor = rand.nextInt(colors.size());

                singleColorButton.sendKeys(colors.get(randomColor));
                singleColorButton.sendKeys(Keys.ENTER);

            } catch (Exception e) {
                System.out.print("FAIL");
                e.printStackTrace();
            }

        }
        driver.quit();
    }

    @Test
    public void datePicker() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        for (int i = 0; i <= 30; i++) {
            try {
                driver.get("https://demoqa.com/date-picker");

                WebElement selectDate = driver.findElement(By.id("datePickerMonthYearInput"));
                WebElement selectdateAndTime = driver.findElement(By.id("dateAndTimePickerInput"));

                Random rand = new Random();
                int year = rand.nextInt(124) + 1900;
                int month = rand.nextInt(12) + 1;
                int hrs = rand.nextInt(23) + 1;
                int mins = rand.nextInt(59) + 1;
                if (month % 2 == 1) {
                    int day = rand.nextInt(31) + 1;
                    String date = (month + "/" + day + "/" + year);
                    System.out.printf(date + "\n");
                    selectDate.sendKeys(Keys.chord(Keys.CONTROL + "a"));
                    selectDate.sendKeys(Keys.BACK_SPACE);
                    selectDate.sendKeys(date + Keys.ENTER);

                    String dateAndTime = (date + " " + hrs + ":" + mins);
                    System.out.printf(dateAndTime + "\n");
                    selectdateAndTime.sendKeys(Keys.chord(Keys.CONTROL + "a"));
                    selectdateAndTime.sendKeys(Keys.BACK_SPACE);
                    selectdateAndTime.sendKeys(dateAndTime);

                }
                if (month % 2 == 0 && !(month == 2)) {
                    int day = rand.nextInt(30) + 1;
                    String date = (month + "/" + day + "/" + year);
                    System.out.printf(date + "\n");
                    selectDate.sendKeys(Keys.chord(Keys.CONTROL + "a"));
                    selectDate.sendKeys(Keys.BACK_SPACE);
                    selectDate.sendKeys(date + Keys.ENTER);

                    String dateAndTime = (date + " " + hrs + ":" + mins);
                    System.out.printf(dateAndTime + "\n");
                    selectdateAndTime.sendKeys(Keys.chord(Keys.CONTROL + "a"));
                    selectdateAndTime.sendKeys(Keys.BACK_SPACE);
                    selectdateAndTime.sendKeys(dateAndTime);
                }
                if (month == 2) {
                    int day = rand.nextInt(28) + 1;
                    String date = (month + "/" + day + "/" + year);
                    System.out.printf(date + "\n");
                    selectDate.sendKeys(Keys.chord(Keys.CONTROL + "a"));
                    selectDate.sendKeys(Keys.BACK_SPACE);
                    selectDate.sendKeys(date + Keys.ENTER);

                    String dateAndTime = (date + " " + hrs + ":" + mins);
                    System.out.printf(dateAndTime + "\n");
                    selectdateAndTime.sendKeys(Keys.chord(Keys.CONTROL + "a"));
                    selectdateAndTime.sendKeys(Keys.BACK_SPACE);
                    selectdateAndTime.sendKeys(dateAndTime);
                }


            } catch (Exception e) {
                System.out.print("FAIL");
                e.printStackTrace();
            }
        }
        driver.quit();
    }

    @Test
    public void slider() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://demoqa.com/slider");

            WebElement slider = driver.findElement(By.className("range-slider"));

            Actions actions = new Actions(driver);
            actions.dragAndDropBy(slider, 50, 0).perform();

            WebElement sliderValue = driver.findElement(By.id("sliderValue"));
            System.out.printf("Slider Value: " + sliderValue.getAttribute("value"));

        } catch (Exception e) {
            System.out.println("FAIL");
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    public void progressBar() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            Random rand = new Random();
            String valueStop = String.valueOf(rand.nextInt(100) + 1);
            System.out.printf(valueStop);
            driver.get("https://demoqa.com/progress-bar");
            WebElement startstop = driver.findElement(By.id("startStopButton"));

            startstop.click();
            int stoppedAtValueStop = 1;

            while (true) {

                WebElement progressBar = driver.findElement(By.className("progress-bar"));
                String progressValue = progressBar.getAttribute("aria-valuenow");
                System.out.println("Current progress value: " + progressValue);

                if (stoppedAtValueStop == 1 && progressValue.equals(valueStop)) {
                    startstop.click();
                    System.out.printf("Value reached Stop Point! - " + valueStop + "\n");
                    stoppedAtValueStop++;
                    Thread.sleep(2000);

                }
                if ((stoppedAtValueStop == 2) && progressValue.equals(valueStop)) {
                    System.out.print("Resuming progress bar \n");
                    startstop.click();
                    stoppedAtValueStop++;
                }


                if (progressValue.equals("100")) {
                    System.out.println("Progress bar reached 100%");
                    break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    @Test
    public void tabs() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://demoqa.com/tabs");

            List<WebElement> tabs = Arrays.asList(
                    driver.findElement(By.id("demo-tab-what")),
                    driver.findElement(By.id("demo-tab-origin")),
                    driver.findElement(By.id("demo-tab-use")),
                    driver.findElement(By.id("demo-tab-more"))

            );
            if (tabs.get(0).isSelected()) {
                WebElement whatText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demo-tabpane-what")));
                String text = whatText.getText();
                System.out.printf(text);

            }
            if (!tabs.get(0).isSelected()) {
                tabs.get(0).click();
                WebElement whatText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demo-tabpane-what")));
                String text = whatText.getText();
                System.out.printf(text + "\n");
            }
            tabs.get(1).click();
            //Thread.sleep(600);
            WebElement originText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demo-tabpane-origin")));
            String textOrigin = originText.getText();
            System.out.printf(textOrigin + "\n");

            tabs.get(2).click();
            WebElement useText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demo-tabpane-use")));
            String textUse = useText.getText();
            System.out.printf(textUse + "\n");


        } catch (Exception e) {
            System.out.print("FAIL");
            e.printStackTrace();

        }
        driver.quit();
    }

    @Test
    public void toolTips() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        try {
            driver.get("https://demoqa.com/tool-tips");

            WebElement title = driver.findElement(By.id("buttonToolTopContainer"));
            WebElement button = driver.findElement(By.id("toolTipButton"));
            WebElement textField = driver.findElement(By.id("toolTipTextField"));
            WebElement textContainer = driver.findElement(By.id("texToolTopContainer"));

            System.out.printf(title.getText());
            System.out.print("\n");

            actions.clickAndHold(button).perform();
            Thread.sleep(2000);
            textField.sendKeys("BLABLABLABLA");
            actions.clickAndHold(textField).perform();
            Thread.sleep(2000);


            System.out.printf(textContainer.getText());

        } catch (Exception e) {
            System.out.println("FAIL");
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    public void menu() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Actions action = new Actions(driver);

        try {
            driver.get("https://demoqa.com/menu");

            List<WebElement> mainItemMenu = Arrays.asList(
                    driver.findElement(By.linkText("Main Item 1")),
                    driver.findElement(By.linkText("Main Item 2")),
                    driver.findElement(By.linkText("Main Item 3"))

            );

            mainItemMenu.get(0).click();

            action.moveToElement(mainItemMenu.get(1)).perform();
            List<WebElement> subItemMenu = Arrays.asList(
                    driver.findElement(By.linkText("Sub Item")),
                    driver.findElement(By.linkText("Sub Item")),
                    driver.findElement(By.linkText("SUB SUB LIST »"))

            );
            Thread.sleep(1500);
            action.moveToElement(subItemMenu.get(2)).perform();
            List<WebElement> subsubItemMenu = Arrays.asList(
                    driver.findElement(By.linkText("Sub Sub Item 1")),
                    driver.findElement(By.linkText("Sub Sub Item 2"))
            );
            Thread.sleep(1500);
            subsubItemMenu.get(0).click();


        } catch (Exception e) {
            System.out.print("FAIL");
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test
    public void selectMenu() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        try {
            Random rand = new Random();
            int randomTitle = rand.nextInt(6);
            int randomSelectValue = rand.nextInt(6);
            int randomOldOption = rand.nextInt(11);
            int randomMultipleselectMenu = rand.nextInt(4);
            int randomStandardMultiSelect = rand.nextInt(4);

            driver.get("https://demoqa.com/select-menu");

            List<WebElement> selectMenus = Arrays.asList(
                    driver.findElement(By.id("withOptGroup")),
                    driver.findElement(By.id("selectOne")),
                    driver.findElement(By.id("oldSelectMenu")),
                    driver.findElement(By.xpath("//div[text()='Select...']")),
                    driver.findElement(By.id("cars"))
            );
            selectMenus.get(0).click();
            List<WebElement> selectValueMenu = Arrays.asList(
                    driver.findElement(By.id("react-select-2-option-0-0")),
                    driver.findElement(By.id("react-select-2-option-0-1")),
                    driver.findElement(By.id("react-select-2-option-1-0")),
                    driver.findElement(By.id("react-select-2-option-1-1")),
                    driver.findElement(By.id("react-select-2-option-2")),
                    driver.findElement(By.id("react-select-2-option-3"))

            );
            selectValueMenu.get(randomSelectValue).click();

            selectMenus.get(1).click();
            List<WebElement> titleMenu = Arrays.asList(
                    driver.findElement(By.id("react-select-3-option-0-0")),
                    driver.findElement(By.id("react-select-3-option-0-1")),
                    driver.findElement(By.id("react-select-3-option-0-2")),
                    driver.findElement(By.id("react-select-3-option-0-3")),
                    driver.findElement(By.id("react-select-3-option-0-4")),
                    driver.findElement(By.id("react-select-3-option-0-5"))

            );
            titleMenu.get(randomTitle).click();

            selectMenus.get(2).click();
            List<WebElement> colorsOptions = selectMenus.get(2).findElements(By.tagName("option"));
            colorsOptions.get(randomOldOption).click();

            selectMenus.get(3).click();
            List<WebElement> multipleselectDropDown = Arrays.asList(
                    driver.findElement(By.id("react-select-4-option-0")),
                    driver.findElement(By.id("react-select-4-option-1")),
                    driver.findElement(By.id("react-select-4-option-2")),
                    driver.findElement(By.id("react-select-4-option-3"))

            );
            jse.executeScript("scroll(0,500)");
            multipleselectDropDown.get(randomMultipleselectMenu).click();
            selectMenus.get(3).sendKeys(Keys.ESCAPE);


        } catch (Exception e) {
            System.out.print("FAIL");
            e.printStackTrace();
        }
    }

    @Test
    public void sortable() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Actions action = new Actions(driver);

        try {
            driver.get("https://demoqa.com/sortable");

            List<WebElement> tabs = Arrays.asList(
                    driver.findElement(By.id("demo-tab-list")),
                    driver.findElement(By.id("demo-tab-grid"))
            );
            if (!tabs.get(0).isDisplayed()) {
                tabs.get(0).click();
            }

            List<WebElement> items = tabs.get(0).findElements(By.xpath("//div[@class='vertical-list-container mt-4'] //div[@class='list-group-item list-group-item-action']"));
            System.out.printf(String.valueOf(items.size()));
            for (int i = 0; i <= 50; i++) {
                Random rand = new Random();
                int randomItem;
                int randomPlace;

                do {
                    randomItem = rand.nextInt(6);
                    randomPlace = rand.nextInt(6);

                } while (randomItem == randomPlace);
                action.dragAndDrop(items.get(randomItem), items.get(randomPlace)).perform();

            }
            tabs.get(1).click();
            List<WebElement> gridItems = tabs.get(1).findElements(By.xpath("//div[@class='create-grid'] //div[@class='list-group-item list-group-item-action']"));
            for (int i = 0; i <= 50; i++) {
                Random rand = new Random();
                int randomItem;
                int randomPlace;

                do {
                    randomItem = rand.nextInt(9);
                    randomPlace = rand.nextInt(9);
                } while (randomItem == randomPlace);
                action.dragAndDrop(gridItems.get(randomItem), gridItems.get(randomPlace)).perform();
            }
        } catch (Exception e) {
            System.out.print("FAIL");
            e.printStackTrace();
        } finally {
            driver.close();
        }
    }

    @Test
    public void selectable() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        for (int z = 0; z <= 5; z++) {
            try {
                driver.get("https://demoqa.com/selectable");
                List<WebElement> tabs = Arrays.asList(
                        driver.findElement(By.id("demo-tab-list")),
                        driver.findElement(By.id("demo-tab-grid"))
                );

                List<WebElement> listItems = tabs.get(0).findElements(By.xpath("//li[@class='mt-2 list-group-item list-group-item-action']"));
                for (int i = 0; i <= 1; i++) {
                    Random random = new Random();
                    int randomItem;
                    int randomAmount = random.nextInt(1) + 4;
                    for (int y = 0; y <= randomAmount; y++) {
                        do {
                            randomItem = random.nextInt(4);
                        } while (randomItem == randomAmount);
                        listItems.get(randomItem).click();
                    }
                }
                tabs.get(1).click();
                List<WebElement> gridItems = tabs.get(1).findElements(By.xpath("//li[@class='list-group-item list-group-item-action']"));
                for (int i = 0; i <= 1; i++) {
                    Random random = new Random();
                    int randomItem;
                    int randomAmount = random.nextInt(1) + 9;
                    for (int y = 0; y <= randomAmount; y++) {
                        do {
                            randomItem = random.nextInt(9);
                        } while (randomItem == randomAmount);
                        gridItems.get(randomItem).click();
                    }
                }


            } catch (Exception e) {
                System.out.print("FAIL");
                e.printStackTrace();
            }

        }
        driver.quit();
    }

    @Test
    public void resizable() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Actions action = new Actions(driver);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        try {
            driver.get("https://demoqa.com/resizable");

            WebElement box1 = driver.findElement(By.id("resizableBoxWithRestriction"));
            WebElement box1Handle = box1.findElement(By.xpath("//span[@class='react-resizable-handle react-resizable-handle-se']"));
            action.dragAndDropBy(box1Handle, 350, 150).perform();
            action.dragAndDropBy(box1Handle, -350, -350).perform();

            WebElement box2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resizable")));
            WebElement box2Handle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='resizable']//span[@class='react-resizable-handle react-resizable-handle-se']")));
            jse.executeScript("scroll(0,300)");
            action.dragAndDropBy(box2Handle, 1000, 200).perform();

        } catch (Exception e) {
            System.out.println("FAIL");
            e.printStackTrace();
        }
    }

    @Test
    public void droppable() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Actions action = new Actions(driver);

        try {
            driver.get("https://demoqa.com/droppable");

            List<WebElement> tabs = driver.findElements(By.xpath("//a[@role='tab']"));
            System.out.printf(String.valueOf(tabs.size()));

            WebElement dragMe1 = driver.findElement(By.id("draggable"));
            WebElement dropBox1 = driver.findElement(By.id("droppable"));

            action.dragAndDrop(dragMe1, dropBox1).perform();

            tabs.get(1).click();
            WebElement acceptable = driver.findElement(By.id("acceptable"));
            WebElement notAcceptable = driver.findElement(By.id("notAcceptable"));
            //WebElement dropBox2 = driver.findElement(By.xpath("//div[@class='drop-box ui-droppable ui-state-highlight']"));

            action.dragAndDropBy(acceptable, 350, 0).perform();
            action.dragAndDropBy(notAcceptable, 350, 0).perform();

            tabs.get(2).click();
            WebElement dragBox2 = driver.findElement(By.id("dragBox"));
            WebElement outerDroppable = driver.findElement(By.id("notGreedyDropBox"));
            WebElement innerDroppable = outerDroppable.findElement(By.id("notGreedyInnerDropBox"));

            action.dragAndDropBy(dragBox2, 350, 0).perform();
            Thread.sleep(1500);
            action.dragAndDrop(dragBox2, innerDroppable).perform();

            WebElement greedyDropBox = driver.findElement(By.id("greedyDropBox"));
            WebElement innerDroppableGreedy = greedyDropBox.findElement(By.id("greedyDropBoxInner"));
            action.dragAndDrop(dragBox2, innerDroppableGreedy).perform();
            action.dragAndDropBy(dragBox2, 0, -100).perform();

            tabs.get(3).click();
            WebElement revertable = driver.findElement(By.id("revertable"));
            WebElement notRevertable = driver.findElement(By.id("notRevertable"));
            WebElement dropBox3 = driver.findElement(By.id("droppable"));

            action.dragAndDropBy(revertable, 350, 0).perform();
            action.dragAndDropBy(notRevertable, 350, 0).perform();
        } catch (Exception e) {
            System.out.print("FAIL");
            e.printStackTrace();
        }

    }

    @Test
    public void draggable() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Actions action = new Actions(driver);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            driver.get("https://demoqa.com/dragabble");

            List<WebElement> tabs = driver.findElements(By.xpath("//a[@role='tab']"));
            System.out.printf(String.valueOf(tabs.size()));

            WebElement dragBox = driver.findElement(By.id("dragBox"));
            action.dragAndDropBy(dragBox, 500, 423).perform();

            tabs.get(1).click();
            WebElement dragX = driver.findElement(By.id("restrictedX"));
            WebElement dragY = driver.findElement(By.id("restrictedY"));

            action.dragAndDropBy(dragX, 100, 100).perform();
            action.dragAndDropBy(dragY, 100, 100).perform();

            tabs.get(2).click();
            WebElement containmentWrapper = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("containmentWrapper")));
            WebElement containedWithinBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='containmentWrapper'] //div[contains(@class,'ui-draggable-handle')]")));
//            WebElement parentContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='draggable ui-widget-content m-3']")));
//            WebElement draggableText = parentContainer.findElement(By.xpath("//div[contains(@class,'ui-draggable-handle')]"));
            action.dragAndDropBy(containedWithinBox, 50, 50).build().perform();
//            action.dragAndDropBy(draggableText, 0, 20).build().perform();

            tabs.get(3).click();
            List<WebElement> cursorStyle = Arrays.asList(
                    driver.findElement(By.id("cursorCenter")),
                    driver.findElement(By.id("cursorTopLeft")),
                    driver.findElement(By.id("cursorBottom"))
            );
            action.dragAndDropBy(cursorStyle.get(0), 150, 150).perform();
            action.dragAndDropBy(cursorStyle.get(1), 150, 150).perform();
            action.dragAndDropBy(cursorStyle.get(2), 150, 150).perform();


        } catch (Exception e) {
            System.out.print("FAIL");
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    public void login() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        for (int i = 0; i <= 15; i++) {
            try {
                Random random = new Random();
                int scenario = random.nextInt(7) + 1;

                driver.get("https://demoqa.com/login");
                String FirstName = FileReader.getNextFirstName();
                String LastName = FileReader.getNextLastName();
                String UserName = (FirstName + LastName);
                String Password = FileReader.getNextPassword();
                Thread.sleep(2000);

                driver.findElement(By.id("newUser")).click();

                WebElement firstName = driver.findElement(By.id("firstname"));
                firstName.sendKeys(FirstName);
                WebElement lastname = driver.findElement(By.id("lastname"));
                lastname.sendKeys(LastName);
                WebElement userName = driver.findElement(By.id("userName"));
                userName.sendKeys(UserName);
                WebElement password = driver.findElement(By.id("password"));
                password.sendKeys(Password);

                WebElement recaptchaFrame = driver.findElement(By.cssSelector("iframe[title='reCAPTCHA']"));
                driver.switchTo().frame(recaptchaFrame);
                WebElement recaptchaCheckbox = driver.findElement(By.cssSelector(".recaptcha-checkbox"));
                recaptchaCheckbox.click();
                wait.until(ExpectedConditions.invisibilityOf(recaptchaFrame));
                Thread.sleep(8000);
                if (driver.findElement(By.xpath("//input[@id='recaptcha-token']")).isDisplayed()) {
                    WebElement recaptcha = driver.findElement(By.xpath("//input[@id='recaptcha-token']"));
                    driver.switchTo().frame(recaptcha);
                    wait.until(ExpectedConditions.invisibilityOf(recaptcha));
                }
                //Thread.sleep(5500);
                driver.switchTo().defaultContent();


                WebElement register = driver.findElement(By.id("register"));
                register.click();
                Thread.sleep(2000);

                driver.switchTo().alert().accept();
                Thread.sleep(2000);
                WebElement backToLogin = driver.findElement(By.id("gotologin"));
                backToLogin.click();
                Thread.sleep(2000);

                WebElement userNameLogin = driver.findElement(By.id("userName"));
                userNameLogin.sendKeys(UserName);
                Thread.sleep(2000);
                WebElement passowordLogin = driver.findElement(By.id("password"));
                passowordLogin.sendKeys(Password);
                Thread.sleep(2000);
                driver.findElement(By.id("login")).click();
                Thread.sleep(2000);
                System.out.println(scenario);
                switch (scenario) {
                    // Delete Acc + Alert Yes
                    case 1:
                        driver.findElement(By.xpath("//button[text()='Delete Account']")).click();
                        Thread.sleep(1000);
                        WebElement OK = driver.findElement(By.id("closeSmallModal-ok"));
                        OK.click();
                        Thread.sleep(1500);
                        driver.switchTo().alert().accept();
                        break;

                    // Delete Acc + Alert Cancel
                    case 2:
                        driver.findElement(By.xpath("//button[text()='Delete Account']")).click();
                        Thread.sleep(1000);
                        WebElement Cancel = driver.findElement(By.id("closeSmallModal-ok"));
                        Cancel.click();
                        driver.findElement(By.xpath("//button[text()='Log out']"));
                        break;

                    // Go to Book Store + Find Book + Log Out
                    case 3:
                        int randomOption = random.nextInt(6);
                        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Go To Book Store']"))).click();
                        Thread.sleep(1000);
                        jse.executeScript("scroll(0, 900)");
                        WebElement selectRows = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@aria-label='rows per page']")));
                        selectRows.click();
                        Thread.sleep(1000);
                        List<WebElement> options = selectRows.findElements(By.tagName("option"));
                        options.get(randomOption).click();
                        Thread.sleep(1000);
                        jse.executeScript("scroll(0, -900)");
                        Thread.sleep(1000);
                        wait.until(ExpectedConditions.elementToBeClickable(By.id("searchBox"))).sendKeys("GIT");
                        Thread.sleep(1000);
                        driver.findElement(By.xpath("//button[text()='Log out']")).click();
                        break;

                    // Delete All Books + Alert Yes
                    case 4:
                        driver.findElement(By.xpath("//button[text()='Delete All Books']")).click();
                        Thread.sleep(1000);
                        WebElement OK2 = driver.findElement(By.id("closeSmallModal-ok"));
                        OK2.click();
                        Thread.sleep(1500);
                        driver.switchTo().alert().accept();
                        Thread.sleep(1000);
                        driver.findElement(By.xpath("//button[text()='Log out']")).click();
                        break;

                    // Delete All Books + Alert No
                    case 5:
                        driver.findElement(By.xpath("//button[text()='Delete All Books']")).click();
                        Thread.sleep(1000);
                        WebElement Cancel2 = driver.findElement(By.id("closeSmallModal-ok"));
                        Cancel2.click();
                        driver.switchTo().alert().accept();
                        driver.findElement(By.xpath("//button[text()='Log out']")).click();
                        break;

                    // Search Bar + Rows Per Page + Log Out
                    case 6:
                        int randomPerPageOption = random.nextInt(6);
                        WebElement searchBox = driver.findElement(By.id("searchBox"));
                        searchBox.sendKeys("GIT HUB");
                        WebElement rowsPerPage = driver.findElement(By.xpath("//select[@aria-label='rows per page']"));
                        rowsPerPage.click();
                        List<WebElement> perPageOptions = rowsPerPage.findElements(By.tagName("option"));
                        perPageOptions.get(randomPerPageOption).click();
                        driver.findElement(By.xpath("//button[text()='Log out']")).click();
                        break;

                    // Log out
                    case 7:
                        driver.findElement(By.xpath("//button[text()='Log out']")).click();
                        break;


                }


            } catch (Exception e) {
                System.out.print("FAIL");
                e.printStackTrace();
            }
        }
        driver.quit();
    }
}
















