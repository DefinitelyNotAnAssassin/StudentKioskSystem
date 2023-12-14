
package com.mycompany.studentkiosksystem;
import java.sql.SQLException;
import java.util.Scanner;

public class Log
{
    public void loginna() throws SQLException
    {
        Scanner input = new Scanner(System.in);
        int options = 0;
        String SN =null;
        String pass =null;
        Database db = new Database();
        db.connect("Database.db");
        
        System.out.println("\n\n\t\t================ STUDENT KIOSK SYSTEM  ================");
        System.out.println("\n\t\t\t\t[1] Login");
        System.out.println("\t\t\t\t[2] Create Account");
        
        System.out.print("\n\t\t\t\tSelect option: ");
        options = input.nextInt();
        //input.close();
        
        switch(options)
        {
           case 1:
                input.nextLine();
                System.out.println("\n\n\t\t================ STUDENT INFORMATION ================");
                System.out.print("\n\t\t\t\tStudent Number: ");
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
                    loginna();
                }                                                              
                break;
            case 2:
                db.createAccount();                
                break;           
            default:
                System.out.println("\n\t\t\tIncorrect input! Please, try again.");
                loginna();
                break;        
        }
        
        Select st = new Select();
        st.select();        
    }
}