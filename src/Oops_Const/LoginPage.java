package Oops_Const;

public class LoginPage {
    String username;
    String password;
    LoginPage(String u,String p){
        this.username=u;
        this.password=p;
    }
    void submit(){
        if (username.equals("abcd") && password.equals("123")){
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Login Failed");
        }
    }
    public static void main(String[] args){
        LoginPage admin=new LoginPage("abcd","123");
        admin.submit();
    }
}
