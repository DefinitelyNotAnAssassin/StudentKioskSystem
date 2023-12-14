
package com.mycompany.studentkiosksystem;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentKioskSystem 
{
     
    public static void main(String[] args) throws SQLException
    {
        Database db = new Database();
        db.connect("Database.db");
        
        String SN = null, pass = null;
        int option;
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n\n\t\t================ STUDENT KIOSK SYSTEM  ================");
        System.out.println("\n\t\t\t\t[1] Login");
        System.out.println("\t\t\t\t[2] Create Account");
        
        System.out.print("\n\t\t\t\tSelect option: ");        
        option = input.nextInt();
        System.out.println("\n\t\t=======================================================");
        //input.close();
        
        switch(option)
        {
           case 1:
                input.nextLine();
                System.out.println("\n\n\t\t================ STUDENT INFORMATION ================");
                System.out.print("\n\t\t\tStudent Number: ");
                SN= input.nextLine();
                System.out.print("\t\t\t\tPassword: ");
                pass= input.nextLine();                
                boolean isLogin =  db.logIn(SN, pass);
                                
                int attempt = 1;
                
                while (attempt <= 2 && isLogin == false)
                {
                System.out.println("\n\n\t\t================ STUDENT INFORMATION ================");
                System.out.print("\n\t\t\t\tStudent Number: ");
                SN= input.nextLine();
                System.out.print("\t\t\t\tPassword: ");
                pass= input.nextLine();
                                
                    if(db.logIn(SN, pass))
                    {
                        break;
                    }
                    else
                    {
                    attempt++;
                    }                                                  
                }
                
                if (attempt > 2)
                {                    
                    System.out.println("\n\t\t\t\tAttempt Limit Reached");
                    System.out.println("\n\n\t\t=====================================================");
                    Log login = new Log();
                    login.loginna();                    
                }
                break;
            case 2:
                db.createAccount();                
                break;           
            default:
                System.out.println("\n\t\t\tIncorrect input! Please, try again.");
                Log log = new Log();
                log.loginna();           
                break;        
        }            
        Select st = new Select();
        st.select();       
    }
}
