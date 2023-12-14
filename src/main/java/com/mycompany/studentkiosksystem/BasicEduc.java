package com.mycompany.studentkiosksystem;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class BasicEduc
{    
    int item;
    int total1;    
    int quantity1;
    String tara;
    ShoppingList cart = new ShoppingList();

    public BasicEduc()
    {
     item = 0;     
     total1 = 0;          
     quantity1 = 0;
     tara = "";
    }
    
    public BasicEduc(ShoppingList cart)
    {
        this.cart = cart;
    }

    public void basiced(ShoppingList cart)
    {
        Scanner input = new Scanner(System.in);
        Select st = new Select();
    
        do
        {
        System.out.println("\n\n\t\t==================== BASIC EDUCATION  ====================");
        System.out.println("\n\n\t\tAvailable Items: ");
        System.out.print("\t\t[1] Blouse w Skirt ");
        System.out.print("\t\t\t\t[6] Polo w Slacks ");
        System.out.print("\n\t\t[2] Belt ");
        System.out.print("\t\t\t\t\t[7] Scarf ");
        System.out.print("\n\t\t[3] Ribbon ");
        System.out.print("\t\t\t\t\t[8] Neck Tie ");
        System.out.print("\n\t\t[4] Women's Vest ");
        System.out.print("\t\t\t\t[9] Back/Return ");
        System.out.print("\n\t\t[5] PE Uniform ");
       
        System.out.print("\n\n\t\t\tChoose an Option: ");
        item = input.nextInt();
        Sizes size = new Sizes();
        
        switch(item)
        {        
        case 1:             
            cart = size.sizeblousebasic(cart);            
            break;
        case 2: 
            if(cart.isExisting("Belt"))
            {
                cart.updateQuantity("Belt", 1);
            }
            else
            {
                cart.addProduct("Belt", 1, 150);
            }                                   
            break;
        case 3: 
            if(cart.isExisting("Ribbon"))
            {
                cart.updateQuantity("Ribbon", 1);
            }
            else
            {
                cart.addProduct("Ribbon", 1, 200);
            }             
            break;
        case 4: 
            if(cart.isExisting("Women's Vest"))
            {
                cart.updateQuantity("Women's Vest", 1);
            }
            else
            {
                cart.addProduct("Women's Vest", 1, 300);
            }            
            break;
        case 5:             
            cart = size.sizepe(cart);            
            break;
        case 6:
            cart = size.sizepolobasic(cart);            
            break;
        case 7:             
            if(cart.isExisting("Scarf"))
            {
                cart.updateQuantity("Scarf", 1);
            }
            else
            {
                cart.addProduct("Scarf", 1, 180);
            }                                  
            break;                 
        case 8: 
            if(cart.isExisting("Necktie"))
            {
                cart.updateQuantity("Necktie", 1);
            }
            else
            {
                cart.addProduct("Necktie", 1, 280);
            }
            break;
        case 9:
            st.select();
            break;
        default:
            System.out.println("\n\t\t\tIncorrect input! Please, try again.");
            basiced(cart);
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
        System.out.println("\nTotal amount:\t      "+ cart.getTotalPrice());
        Scanner sc = new Scanner(System.in);
        System.out.print("Add another? (y/n) : ");
        tara = sc.nextLine();
        }
        while(tara.equals("y")||tara.equals("Y"));
        pay(cart);   
    }

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

    }
}
