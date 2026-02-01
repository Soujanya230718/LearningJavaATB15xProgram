package OOps_Inheritance;

class LoginPage{
    void login(){
        System.out.println("Login Page");
    }
}

class Dashboard extends LoginPage {
    void showDashboard() {
        System.out.println("Dashboard Page");
    }
}
class ProfilePage extends LoginPage{           // this is not multi-level this is hierarchical Inheritance
    void showProfile(){
        System.out.println("Profile Page");
    }
}
public class Employee {
    public static void main(String[] args) {
        ProfilePage p= new ProfilePage();
        p.login();
        p.showProfile();
    Dashboard d= new Dashboard();
    d.login();
    d.showDashboard();

    }
}
