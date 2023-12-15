package com.mycompany.studentkiosksystem;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
public class HigherEd 
{
    public int item;    
    String  gesige;
    ShoppingList cart = new ShoppingList();
    
    public HigherEd()
    {
        item = 0;        
        gesige = "";
        
    }
    
    public HigherEd(ShoppingList cart)
    {
        this.cart = cart;
    }
    
    public void higher(ShoppingList cart)
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
                 scmcs(cart);
                 break;
             case 2:
                 snashs(cart);
                 break;
             case 3:
                 sihtm(cart);
                 break;
             case 4:
                 st.select();
                 break;
             default:
                 System.out.println("\n\t\t\tIncorrect input! Please, try again.");
                 higher(cart);
                 break;             
         }
         
    }
    
    public void snashs(ShoppingList cart)
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
            cart = size.sizesnashsscrub(cart);
            break;            
        case 2: 
            /*System.out.println("Item                  Green Nursing Uniform Coat");    
            call = 1;*/
            cart = size.sizesnashsgreen(cart);
            break;           
        case 3:             
            cart = size.sizesnashslab(cart);
            break;
        case 4: 
            if (cart.isExisting("Nurse's Cap")) 
            {
                cart.updateQuantity("Nurse's Cap", 1);
            } 
            else 
            {
                cart.addProduct("Nurse's Cap", 1, 250);
            }           
            break;       
        case 5: 
            /*System.out.println("Item                  SDCA Red Shirt");
            call = 1;*/
            cart = size.sizescmcssdcared(cart);            
            break;
        case 6:
            /*System.out.println("Item                  PE Uniform");
            call = 1;*/
            cart= size.sizepescmcs(cart);
            break;
        case 7: 
            higher(cart);
            break;
        default: 
            snashs(cart);
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
        System.out.println("Add another? (y/n) : ");
        gesige = sc.nextLine();
        }
        while(gesige.equals("y")||gesige.equals("Y"));
           BasicEduc bed = new BasicEduc(cart);
           bed.pay(cart);
    }
    
    

    public void scmcs(ShoppingList cart)
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
            cart = size.sizescmcsblouse(cart);
            break;
        case 2: 
            if (cart.isExisting("Women's Scarf")) 
            {
            cart.updateQuantity("Women's Scarf", 1);
            } else {
    cart.addProduct("Women's Scarf", 1, 250); // Include optional description
}

            break;
        case 3: 
            if (cart.isExisting("Belt")) {
    cart.updateQuantity("Belt", 1); // Consider using a gender-neutral term like "Belt" instead of "Women's Belt"
} else {
    cart.addProduct("Belt", 1, 200); // Include optional description and size information
}
      
            break;
        case 4: 
            
            System.out.println("Item                  Men's Polo w Slacks");
            cart = size.sizescmcspolo(cart);
            break;        
        case 5: 
            if (cart.isExisting("Men's Necktie")) {
    cart.updateQuantity("Men's Necktie", 1);
} else {
    cart.addProduct("Necktie", 1, 280); // Consider using a gender-neutral term like "Necktie" and include optional description and information about variety
}

            break;
        case 6:
            System.out.println("Item                  SDCA Red Shirt");
            cart = size.sizescmcssdcared(cart);            
            break;
        case 7: 
            System.out.println("Item                  PE Uniform");
            cart = size.sizepescmcs(cart);
            break;
        case 8: 
            higher(cart);
            break;
        default: 
            scmcs(cart);
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
        System.out.println("Add another? (y/n) : ");
        gesige = sc.nextLine();
        }
        while(gesige.equals("y")||gesige.equals("Y"));
           BasicEduc bed = new BasicEduc(cart);
           bed.pay(cart);
    }
    
    
    
    public void sihtm(ShoppingList cart) 
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
        
        switch (item) {
    case 1:
        // Instead of directly calling size function, offer options for size selection.
        //System.out.println("Choose your size for the Corporate Bluish Top and Skirt:");
        cart = size.sizeshitmbluish(cart); // Provide size options
        break;

    case 2:
        // Eliminate gendered terms and focus on product features.
        System.out.println("Complete your look with a stylish Blazer!");
        if (cart.isExisting("Blazer")) {
            cart.updateQuantity("Blazer", 1);
        } else {
            cart.addProduct("Blazer", 1, 350); 
        }
        break;

    case 3:
        // Instead of assuming gender, offer generic terms.
        System.out.println("Choose your size for the Corporate Bluish Top and Pants:");
        cart = size.sizeshitmmenbluish(cart); // Provide size options
        break;

    case 4:
        // Eliminate gendered terms and focus on product features.
        System.out.println("Add a touch of style with a Vest!");
        if (cart.isExisting("Vest")) {
            cart.updateQuantity("Vest", 1);
        } else {
            cart.addProduct("Vest", 1, 300); 
        }
        break;

    case 5:
        // Maintain current functionality for PE uniform size selection.
        System.out.println("Choose your size for the PE Uniform:");
        cart = size.sizepescmcs(cart);
        break;

    case 6:
        // Maintain current functionality for SDCA Red Shirt size selection.
        cart = size.sizescmcssdcared(cart);
        break;

    case 7:
        // Maintain current functionality for higher menu options.
        higher(cart);
        break;

    default:
        // Maintain current functionality for invalid input handling.
        sihtm(cart);
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
        System.out.println("Add another? (y/n) : ");
        gesige = sc.nextLine();
        }
        while(gesige.equals("y")||gesige.equals("Y"));
           BasicEduc bed = new BasicEduc(cart);
           bed.pay(cart);
    }
    
         
}