package com.mycompany.studentkiosksystem;
 import java.util.Scanner;

  


public class Log_in {

   
    private String username;
    private String password;
    
    
    public Log_in(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
public class Registration
     {
        public static Log_in registerUser()
        {
            Scanner scanner = new Scanner(System.in);
             
            
            System.out.println("Registration");
            System.out.println("Enter Username: ");
            String username = scanner.nextLine();
            
            System.out.println("Enter Password: ");
            String password = scanner.nextLine();
            
            return new Log_in(username, password);
            
            
        }
     }
    
}
