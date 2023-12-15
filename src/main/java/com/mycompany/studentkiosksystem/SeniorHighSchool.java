
package com.mycompany.studentkiosksystem;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class SeniorHighSchool
{
    int item;
    int price;
    int call;
    int total2, quantity2;
    String gege;
    ShoppingList cart = new ShoppingList();
        
    public SeniorHighSchool()
    {
        item = 0;
        price = 0;
        total2 = 0;
        call = 0;
        gege ="";
    }
    
    public SeniorHighSchool(ShoppingList cart)
    {
        this.cart = cart;
    } 
        public void senior(ShoppingList cart)
        {
            do
            {
                Scanner input = new Scanner(System.in);
                Select select = new Select();
                Sizes size = new Sizes();
                System.out.println("\n\n\t\t\t\t================  SENIOR HIGH SCHOOL  ================");
                System.out.print("\nSenior High School");
                System.out.println("\n\nAvailable Items: ");
                System.out.print("[1] Women's Blouse w Skirt ");
                System.out.print("\t[5] Men's Polo w Pants");
                System.out.print("\n[2] Women's Scarf ");
                System.out.print("\t\t[6] Men's Necktie ");
                System.out.print("\n[3] Women's Vest ");
                System.out.print("\t\t[7] PE Uniform ");
                System.out.print("\n[4] Women's Ribbon ");
                System.out.println("\t\t[8] Back/Return");
        
                System.out.print("\n\nChoose an Option: ");
        
                item = input.nextInt();
        
        switch(item)
        {        
        case 1:             
            cart = size.sizeblouseshs(cart);            
            break;            
        case 2: 
            if(cart.isExisting("Women's Scarf"))
            {
                cart.updateQuantity("Women's Scarf", 1);
            }
            else
            {
                cart.addProduct("Women's Scarf", 1, 250);
            }             
            break;      
        case 3: 
            if(cart.isExisting("Women's Vest"))
            {
                cart.updateQuantity("Women's Vest", 1);
            }
            else
            {
                cart.addProduct("Women's Vest", 1, 300);
            }            
            break;
        case 4: 
            if(cart.isExisting("Women's Ribbon"))
            {
                cart.updateQuantity("Women's Ribbon", 1);
            }
            else
            {
                cart.addProduct("Women's Ribbon", 1, 250);
            }            
            break;        
        case 5: 
            cart = size.sizepoloshs(cart);            
            break;
        case 6:
            if(cart.isExisting("Men's Necktie"))
            {
                cart.updateQuantity("Men's Necktie", 1);
            }
            else
            {
                cart.addProduct("Men's Necktie", 1, 280);
            }            
            break;
        case 7: 
            cart = size.sizepeshs(cart);            
            break;
        case 8:
            select.select();
            break;
        default:
            System.out.println("\n\t\t\tIncorrect input! Please, try again.");
            senior(cart);
            break;
        }
        
        List<Map<String, Object>> current_cart = cart.getAllProducts();
        System.out.println("\t\t--------------------------------------------------------------");
        for (int i = 0; i < current_cart.size(); i++)
        {
            Map<String, Object> product = current_cart.get(i);
            System.out.print("Name: " + product.get("pname") + "\t");
            System.out.print("Quantity: " + product.get("pqty") + "\t");
            System.out.println("Price: "+product.get("pprice"));
        }
        System.out.println("\t\t--------------------------------------------------------------");                
        System.out.println("\nTotal amount: "+ cart.getTotalPrice());
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Add another? (y/n) : ");
        gege = sc.nextLine();
        }
        while(gege.equals("y")||gege.equals("Y"));
        BasicEduc bed = new BasicEduc();
            bed.pay(cart);
        }
    
        /*
    public void pay(ShoppingList cart)
    {        
        Scanner input = new Scanner(System.in);
        Select st = new Select();
        System.out.println("\n\n\t\t===============================================================");
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
       List<Map<String, Object>> current_cart = cart.getAllProducts();
        System.out.println("----------------------------------------------");
        for (int i = 0; i < current_cart.size(); i++)
        {
            Map<String, Object> product = current_cart.get(i);
            System.out.print("Name: " + product.get("pname") + "\t");
            System.out.print("Quantity: " + product.get("pqty") + "\t");
            System.out.println("Price: "+product.get("pprice"));
        }
        
        System.out.println("----------------------------------------------");        
        System.out.println("\nTotal amount:\t      "+ cart.getTotalPrice());
        
        System.out.println("\n[1]Buy Another");
        System.out.println("[2]Exit ");

        System.out.print("\nEnter here: ");
        int items = input.nextInt();

        switch(items)
        {
            case 1:
                cart.clearCart();
                st.select();
            case 2:
                System.exit(0);
            default:
                System.out.println("\n\t\t\tIncorrect input! Please, try again.");
                break;
        }

    }*/
}
