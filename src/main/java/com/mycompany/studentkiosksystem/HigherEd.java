
package com.mycompany.studentkiosksystem;
import java.util.Random;
import java.util.Scanner;
public class HigherEd 
{
    public int item;
    int price;
    int call, quantity3, total3, total4, total5, total6;
    int quantity4, quantity5, quantity6;
    String gegeg, gesige, lezgo;
    
    public HigherEd()
    {
        item = 0;
        total3 = 0;
        gegeg = "";
        quantity3 = 0;
        quantity4 = 0;
        quantity5 = 0;
        quantity6 = 0;
        call = 0;
        total4 = 0;
        total5 = 0;
        gesige = "";
        lezgo = "";
    }
    
    public void higher()
    {
         Select st = new Select();
         Scanner input = new Scanner(System.in);
         System.out.println("\n\n\t\t================ STUDENT KIOSK SYSTEM  ================");
         System.out.print("\n\n\t\t\t[1]SCMCS");
         System.out.print("\t\t[3]SIHTM");
         System.out.print("\n\t\t\t[2]SNASHS");
         System.out.print("\t\t[4]Back/Return");         
         System.out.print("\n\n\t\t\tEnter here: ");
         item = input.nextInt();
         
         switch(item)
         {
             case 1:
                 scmcs();
                 break;
             case 2:
                 snashs();
                 break;
             case 3:
                 sihtm();
                 break;
             case 4:
                 st.select();
                 break;
             default:
                 higher();
                 break;             
         }
         
    }
    
    public void snashs()
    {
        Scanner input = new Scanner(System.in);
        Sizes size = new Sizes();
        
        do
        {
        System.out.print("\n[1]Scrub Top w Pants");
        System.out.print("\t\t\t[5]SDCA Red Shirt ");
        System.out.print("\n[2]Green Nursing Uniform Coat");
        System.out.print("\t\t[6]PE Uniform ");
        System.out.print("\n[3]Laboratory Coat ");
        System.out.print("\t\t\t[7]Back/Return");
        System.out.print("\n[4]Nurse's Cap");
               
        System.out.print("\n\nEnter: ");
        item = input.nextInt();
        
        switch(item)
        {        
        case 1: 
            System.out.println("Item                  Scrub Top w Pants");          
            call = 1;
            size.sizesnashsscrub();
            break;
        case 2: 
            System.out.println("Item                  Green Nursing Uniform Coat");    
            call = 1;
            size.sizesnashsgreen();
            break;           
        case 3: 
            System.out.println("Item                  Laboratory White Coat");
            call = 1;
            size.sizesnashslab();
            break;
        case 4: 
            System.out.println("Item                  Nurse's Cap");
            call = 1;
            price = 250;
            break;       
        case 5: 
            System.out.println("Item                  SDCA Red Shirt");
            call = 1;
            size.sizesnashsdcared();            
            break;
        case 6:
            System.out.println("Item                  PE Uniform");
            call = 1;
            size.sizepesnashs();
            break;
        case 7: 
            higher();
            break;
        default: 
            snashs();
            break;
        }
        
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total3 = total3 + price;
        quantity3 = quantity3 + call;
        System.out.println("Total amount: "+total3);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        gegeg = sc.nextLine();
        }
        while(gegeg.equals("y")||gegeg.equals("Y"));
        snashpay();
    }
    
    public void snashpay()
    {
        Scanner input = new Scanner(System.in);
        Select st = new Select();
        System.out.println("\nCongratulations!");
        System.out.println("\nYour Transaction is Pre-Ordered.");
        System.out.println("Please Proceed to Cashier at Lobby Ground Floor");
        Random random = new Random();
        int num1;
        
       for(int i = 0; i<1; i++)
       {
           num1 = random.nextInt(999999);
           System.out.println("and Continue by Paying with given code: "+num1);
       }
       
       Sizes size = new Sizes();
       quantity3 = quantity3 + size.quantity;
       System.out.println("\nQuantity \t\t\tPrice");
       System.out.print("\n"+quantity3);
       System.out.print("\t\t\t\t"+total3);

       System.out.println("");

       System.out.println("\n[1]Buy Another");
       System.out.println("[2]Exit ");

       System.out.print("\nEnter here: ");
       int items = input.nextInt();

        switch(items)
        {
            case 1:
                total3 = 0;
                st.select();
            case 2:
                //logout
            default: 
                System.exit(0);
        }
    }

    public void scmcs()
    {
        Scanner input = new Scanner(System.in);
        Sizes size = new Sizes();
        
        do
        {
        System.out.print("\n[1]Women's Blouse w Slacks");
        System.out.print("\t\t[5]Men's Necktie ");
        System.out.print("\n[2]Women's Scarf");
        System.out.print("\t\t\t[6]SDCA Red Shirt ");
        System.out.print("\n[3]Women's Belt ");
        System.out.print("\t\t\t[7]PE Uniform");
        System.out.print("\n[4]Men's Polo w Slacks");
        System.out.print("\t\t\t[8]Back/Return");
        System.out.print("\n\nEnter: ");
        item = input.nextInt();
        
        switch(item)
        {
        case 1: 
            System.out.println("Item                  Women's Blouse w Slacks");
            size.sizescmcsblouse();
            break;
        case 2: 
            System.out.println("Item                  Women's Scarf");
            call = 1;
            price = 250;
            break;
        case 3: 
            System.out.println("Item                  Women's Belt");
            call = 1;
            price = 200;      
            break;
        case 4: 
            System.out.println("Item                  Men's Polo w Slacks");
            size.sizescmcspolo();
            break;        
        case 5: 
            System.out.println("Item                  Men's Necktie");
            call = 1;
            price = 280;
            break;
        case 6:
            System.out.println("Item                  SDCA Red Shirt");
            size.sizescmcssdcared();            
            break;
        case 7: 
            System.out.println("Item                  PE Uniform");
            size.sizepescmcs();
            break;
        case 8: 
            higher();
            break;
        default: 
            scmcs();
            break;
        }
        
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total4 = total4 + price;
        quantity4 = quantity4 + call;
        System.out.println("Total amount: "+total4);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        gesige = sc.nextLine();
        }
        while(gesige.equals("y")||gesige.equals("Y"));
           scmcspay();
    }
    
    public void scmcspay()
    {        
        Scanner input = new Scanner(System.in);
        Select st = new Select();
        System.out.println("\nCongratulations!");
        System.out.println("\nYour Transaction is Pre-Ordered.");
        System.out.println("Please Proceed to Cashier at Lobby Ground Floor");
        Random random = new Random();
        int num1;        
        
        for(int i = 0; i<1; i++)
        {
           num1 = random.nextInt(999999);
           System.out.println("and Continue by Paying with given code: "+num1);
        }
        
        Sizes size = new Sizes();
        quantity4 = quantity4 + size.quantity;
        System.out.println("\nQuantity \t\t\tPrice");
        System.out.print("\n"+quantity4);
        System.out.print("\t\t\t\t"+total4);
        System.out.println("");

        System.out.println("\n[1]Buy Another");
        System.out.println("[2]Exit ");

        System.out.print("\nEnter here: ");
        int items = input.nextInt();

        switch(items)
        {
            case 1:
                total4 = 0;
                st.select();
            case 2:
                //logout
            default: 
                System.exit(0);
        }
    }
    
    public void sihtm()
    {
        Scanner input = new Scanner(System.in);
        Sizes size = new Sizes();
        
        do
        {
        System.out.print("\n\n[1] Women's Corporate Bluish Top and Skirt");
        System.out.print("\t\t[5] PE Uniform");
        System.out.print("\n[2] Women's Blazer");
        System.out.print("\t\t\t\t\t[6] SDCA Red Shirt");
        System.out.print("\n[3] Men's Corporate Bluish Top and Pants");
        System.out.print("\t\t[7] Back/Return");
        System.out.print("\n[4] Men's Vest");
                     
        System.out.print("\n\nEnter here: ");
        item  = input.nextInt();
        
        switch(item)
        {
            case 1: 
                System.out.println("Women's Corporate Bluish Top and Skirt");
                size.sizeshitmbluish();
                break;
            case 2:
                System.out.println("Women's Blazer");
            call = 1;
                price = 350;
                break;
            case 3:
                System.out.println("Men's Corporate Bluish Top and Pants");
                size.sizeshitmmenbluish();
                break;
            case 4: 
                System.out.println("Men's Vest");
                call = 1;
                price = 300;
                break;
            case 5: 
                System.out.println("PE Uniform");
                size.sizepesihtm();
                break;
            case 6:
                size.sizesihtmsdcared();
                break;
            case 7:
                higher();
            default: 
                sihtm();
                break;
        }
        
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total5 = total5 + price;
        quantity5 = quantity5 + call;
        System.out.println("Total amount: "+total5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        lezgo = sc.nextLine();
        }
        while(lezgo.equals("y")||lezgo.equals("Y"));
        sihtmpay();
    }
    
      public void sihtmpay()
      {        
        Scanner input = new Scanner(System.in);
        Select st = new Select();
        System.out.println("\nCongratulations!");
        System.out.println("\nYour Transaction is Pre-Ordered.");
        System.out.println("Please Proceed to Cashier at Lobby Ground Floor");
        Random random = new Random();
        int num1;
        
        for(int i = 0; i<1; i++)
        {
           num1 = random.nextInt(999999);
           System.out.println("and Continue by Paying with given code: "+num1);
        }
        
        Sizes size = new Sizes();
        quantity5 = quantity5 + size.quantity;
        System.out.println("\nQuantity \t\t\tPrice");
        System.out.print("\n"+quantity5);
        System.out.print("\t\t\t\t"+total5);
        System.out.println("");

        System.out.println("\n[1]Buy Another");
        System.out.println("[2]Exit ");

        System.out.print("\nEnter here: ");
        int items = input.nextInt();

        switch(items)
        {
            case 1:
                total5 = 0;
                st.select();
            case 2:              
                default: 
            System.exit(0);
        }

     }    
}