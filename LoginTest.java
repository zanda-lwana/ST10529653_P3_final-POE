/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class LoginTest {
    Login login = new Login();
    
    //Username test-Valid
    public void testValidUsername(){
        boolean result = login.checkUsername(" kyl_l");
        
        
    }
    //usrename test- INVALID
    public void testInvalidUsername(){
        boolean results = login.checkUsername("kyle!!!!");
        //" Username is correctly fornamtted; please ensure that your username contains an underscore and is no longer than 5 characters 
    }
    // password test- Valid
    public void testValidpassword(){
        boolean results = login.checkPasswordComplexity("Ch&&sec@ke99!");
    }
     // password test- invalid
    public void testInvalidpassword(){
        boolean results = login.checkPasswordComplexity("Password");
    }
     // phone number test- Valid
    public void testValidphone(){
        boolean results = login.CheckphoneNumber("+2798968975");
    }
     // phone number test- invalid
    public void testinvalidphone(){
        boolean results = login.CheckphoneNumber("8968975");
    }
    
    //register user test
    public void TestRegisterUser();{
    String result = login.RegisterUser(" kyl_l"," Ch&&sec@2kee99!"," +2783968976");  
    
}
    
//login sucess test
    public void testLoginSuccess(){
    login.registerUser(" kyl_l","Ch&&sec@ke99!","+2783968976");
    boolean results = login.loginUser(" kyl_l","Ch&&sec@ke99!");
    
    }
// login faliure test
    public void testLoginFaliure(){
        login.registerUser(" kyl_l"," password","99544425");
        boolean result = login.loginUser(" kyl_l","Ch&&sec@ke99!");
        
    }
    }
            
            

    
