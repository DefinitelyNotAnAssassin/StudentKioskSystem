package com.mycompany.studentkiosksystem;
import java.sql.SQLException;
import java.util.Scanner;

public class Select 
{
    int item;
    public Select()
    {
        item = 0;
    }
    
    public void select() 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n\t\t================ STUDENT KIOSK SYSTEM  ================");

        System.out.print("\n\t\t[1]Basic Education ");
        System.out.print("\t\t\t[3]Higher Education ");
        System.out.print("\n\t\t[2]Senior High School ");
        System.out.print("\t\t\t[4]Logout");
        System.out.print("\n\n\t\t\tEnter here: ");
        item = input.nextInt();
                
        BasicEduc be = new BasicEduc();
        SeniorHighSchool sh = new SeniorHighSchool();
        HigherEd hed = new HigherEd();
        
        switch(item)
        {
        case 1: 
            be.basiced(new ShoppingList());
            break;
        case 2: 
            sh.senior(new ShoppingList());
            break;
        case 3: 
            hed.higher(new ShoppingList());
            break;
        case 4:
            System.exit(0);
            break;
        default:
            System.out.println("\n\t\t\tIncorrect input! Please, try again.");
            select();
            break;       
        }
    }
}