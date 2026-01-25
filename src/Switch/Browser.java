package Switch;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser name ");
        String browser = sc.nextLine();
        browser = browser.toLowerCase(); // this line is for..
        // when we wrote lower case letter and we will enter the name with upper case letter
        // it will show the error.. if we write 10 line code... no error will come

        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                // Further code to start the Firefox
                // Webdriver driver = new Firefox(); // Selenium Code
                break;
            case "edge":
                System.out.println("Execute the Edge Code");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;

        }


    }
}
