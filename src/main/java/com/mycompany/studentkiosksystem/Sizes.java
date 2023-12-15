package com.mycompany.studentkiosksystem;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Sizes 
{
    int item, price, total, quantity;
    int call;
    ShoppingList cart;
    public Sizes()
    {
        item = 0;
        price = 0;
        call = 0;
        total = 0;
        quantity = 0;
    }
    
      public ShoppingList sizeblouseshs(ShoppingList cart)
      {
        //SHS SIZES FOR GIRLS
        SeniorHighSchool shs = new SeniorHighSchool();
        Scanner input = new Scanner(System.in);
        
        System.out.print("\n[1]Extra Small");
        System.out.print("\t\t[6]2xl");
        System.out.print("\n[2]Small");
        System.out.print("\t\t[7]3xl");
        System.out.print("\n[3]Medium");
        System.out.print("\t\t[8]4xl");
        System.out.print("\n[4]Large");
        System.out.print("\t\t[9]5xl");
        System.out.print("\n[5]Extra Large");
        System.out.print("\t\t[10]Back/Return");
        System.out.print("\n\nEnter Size: ");
        item = input.nextInt();
        
        switch(item)
        {        
            case 1: 
                if(cart.isExisting("Blouse w/ Skirt Set (X-SMALL)"))
                {
                    cart.updateQuantity("Blouse w/ Skirt Set (X-SMALL)", 1);
                }
                else
                {
                    cart.addProduct("Blouse w/ Skirt Set (X-SMALL)", 1, 1200);
                }
                return cart;                            
            case 2:
                if(cart.isExisting("Blouse w/ Skirt Set (SMALL)"))
                {
                    cart.updateQuantity("Blouse w/ Skirt Set (SMALL)", 1);
                }
                else
                {
                    cart.addProduct("Blouse w/ Skirt Set (SMALL)", 1, 1200);
                }
                return cart;                 
            case 3: 
                if(cart.isExisting("Blouse w/ Skirt Set (MEDIUM)"))
                {
                    cart.updateQuantity("Blouse w/ Skirt Set (MEDIUM)", 1);
                }
                else
                {
                    cart.addProduct("Blouse w/ Skirt Set (MEDIUM)", 1, 1200);
                }
                return cart;                 
            case 4:
                if(cart.isExisting("Blouse w/ Skirt Set (LARGE)"))
                {
                    cart.updateQuantity("Blouse w/ Skirt Set (LARGE)", 1);
                }
                else
                {
                    cart.addProduct("Blouse w/ Skirt Set (LARGE)", 1, 1200);
                }
                return cart;                
            case 5:
                if(cart.isExisting("Blouse w/ Skirt Set (XL)"))
                {
                    cart.updateQuantity("Blouse w/ Skirt Set (XL)", 1);
                }
                else
                {
                    cart.addProduct("Blouse w/ Skirt Set (XL)", 1, 1200);
                }
                return cart;                
            case 6: 
                if(cart.isExisting("Blouse w/ Skirt Set (2XL)"))
                {
                    cart.updateQuantity("Blouse w/ Skirt Set (2XL)", 1);
                }
                else
                {
                    cart.addProduct("Blouse w/ Skirt Set (2XL)", 1, 1200);
                }
                return cart;                
            case 7:
                if(cart.isExisting("Blouse w/ Skirt Set (3XL)"))
                {
                    cart.updateQuantity("Blouse w/ Skirt Set (3XL)", 1);
                }
                else
                {
                    cart.addProduct("Blouse w/ Skirt Set (3XL)", 1, 1260);
                }
                return cart;                
            case 8:                
                if (cart.isExisting("Blouse w/ Skirt Set (4XL)")) 
                {
                    cart.updateQuantity("Blouse w/ Skirt Set (4XL)", 1);
                } 
                else 
                {
                    cart.addProduct("Blouse w/ Skirt Set (4XL)", 1, 1260);
                }
                return cart;
            case 9:
                if (cart.isExisting("Blouse w/ Skirt Set (5XL)")) 
                {
                    cart.updateQuantity("Blouse w/ Skirt Set (5XL)", 1);
                } 
                else 
                {
                    cart.addProduct("Blouse w/ Skirt Set (5XL)", 1, 1260);
                }
                return cart;
            case 10:
                shs.senior(cart);
                break;
            default:
                sizeblousebasic(cart);
                break;
        }                
        return cart;
      }
      
      public ShoppingList sizeblousebasic(ShoppingList cart){ //instead of void dapat int ang return type
        //BASIC ED SIZES FOR GIRLS
        BasicEduc bed = new BasicEduc();
        Scanner input = new Scanner(System.in);
        
        System.out.print("\n[1]Extra Small");
        System.out.print("\t\t[6]2xl");
        System.out.print("\n[2]Small");
        System.out.print("\t\t[7]3xl");
        System.out.print("\n[3]Medium");
        System.out.print("\t\t[8]4xl");
        System.out.print("\n[4]Large");
        System.out.print("\t\t[9]5xl");
        System.out.print("\n[5]Extra Large");
        System.out.print("\t\t[10]Back/Return");
        System.out.print("\n\nEnter Size: ");
        item = input.nextInt();
        
        switch(item)
        {        
            case 1:                  
                if(cart.isExisting("Blouse w/ Skirt Set (X-SMALL)"))
                {
                    cart.updateQuantity("Blouse w/ Skirt Set (X-SMALL)", 1);
                }
                else
                {
                    cart.addProduct("Blouse w/ Skirt Set (X-SMALL)", 1, 1200);
                }
                return cart;                
            case 2:
                if(cart.isExisting("Blouse w/ Skirt Set (SMALL)"))
                {
                    cart.updateQuantity("Blouse w/ Skirt Set (SMALL)", 1);
                }
                else
                {
                cart.addProduct("Blouse w/ Skirt Set (SMALL)", 1, 1200);
                }
                return cart;                
            case 3: 
                if(cart.isExisting("Blouse w/ Skirt Set (MEDIUM)"))
                {
                    cart.updateQuantity("Blouse w/ Skirt Set (MEDIUM)", 1);
                }
                else
                {
                    cart.addProduct("Blouse w/ Skirt Set (MEDIUM)", 1, 1200);
                }
                return cart;                
            case 4:
                if(cart.isExisting("Blouse w/ Skirt Set (LARGE)"))
                {
                    cart.updateQuantity("Blouse w/ Skirt Set (LARGE)", 1);
                }
                else
                {
                    cart.addProduct("Blouse w/ Skirt Set (LARGE)", 1, 1200);
                }
                return cart;                
            case 5:
                if(cart.isExisting("Blouse w/ Skirt Set (XL)"))
                {
                    cart.updateQuantity("Blouse w/ Skirt Set (XL)", 1);
                }
                else
                {
                    cart.addProduct("Blouse w/ Skirt Set (XL)", 1, 1200);
                }
                return cart;                
            case 6: 
                if(cart.isExisting("Blouse w/ Skirt Set (2XL)"))
                {
                    cart.updateQuantity("Blouse w/ Skirt Set (2XL)", 1);
                }
                else
                {
                    cart.addProduct("Blouse w/ Skirt Set (2XL)", 1, 1200);
                }
                return cart;                
            case 7:
                if(cart.isExisting("Blouse w/ Skirt Set (3XL)"))
                {
                    cart.updateQuantity("Blouse w/ Skirt Set (3XL)", 1);
                }
                else
                {
                    cart.addProduct("Blouse w/ Skirt Set (3XL)", 1, 1260);
                }
                return cart;                
            case 8:
                if(cart.isExisting("Blouse w/ Skirt Set (4XL)"))
                {
                    cart.updateQuantity("Blouse w/ Skirt Set (4XL)", 1);
                }
                else
                {
                    cart.addProduct("Blouse w/ Skirt Set (4XL)", 1, 1260);
                }
                return cart;                
            case 9:
                if(cart.isExisting("Blouse w/ Skirt Set (5XL)"))
                {
                    cart.updateQuantity("Blouse w/ Skirt Set (5XL)", 1);
                }
                else
                {
                    cart.addProduct("Blouse w/ Skirt Set (5XL)", 1, 1300);
                }
                return cart;                
            case 10:
                bed.basiced(cart);
                break;
            default:
                System.out.println("\n\t\t\tIncorrect input! Please, try again.");
                sizeblousebasic(cart);                
        }                
        return cart;
      }
      
      public ShoppingList sizepolobasic(ShoppingList cart)
      {
        BasicEduc bed = new BasicEduc();
        Scanner input = new Scanner(System.in);
        System.out.print("\n[1]Extra Small");
        System.out.print("\t\t[6]2XL");
        System.out.print("\n[2]Small");
        System.out.print("\t\t[7]3XL");
        System.out.print("\n[3]Medium");
        System.out.print("\t\t[8]4XL");
        System.out.print("\n[4]Large");
        System.out.print("\t\t[9]5XL");
        System.out.print("\n[5]Extra Large");
        System.out.print("\t\t[10]Back/Return");
        System.out.print("\nEnter Size: ");
        item = input.nextInt();
        
        switch(item)
        {        
            case 1: 
                if(cart.isExisting("Polo w/ Slacks (X-SMALL)"))
                {
                    cart.updateQuantity("Polo w/ Slacks (X-SMALL)", 1);
                }
                else
                {
                    cart.addProduct("Polo w/ Slacks (X-SMALL)", 1, 1500);
                }
                return cart;                
            case 2:
                if(cart.isExisting("Polo w/ Slacks (SMALL)"))
                {
                    cart.updateQuantity("Polo w/ Slacks (SMALL)", 1);
                }
            else
                {
                    cart.addProduct("Polo w/ Slacks (SMALL)", 1, 1500);
                }
                return cart;               
            case 3: 
                if(cart.isExisting("Polo w/ Slacks (MEDIUM)"))
                {
                    cart.updateQuantity("Polo w/ Slacks (MEDIUM)", 1);
                }
                else
                {
                    cart.addProduct("Polo w/ Slacks (MEDIUM)", 1, 1500);
                }
                return cart;                
            case 4:
                if(cart.isExisting("Polo w/ Slacks (LARGE)"))
                {
                    cart.updateQuantity("Polo w/ Slacks (LARGE)", 1);
                }
                else
                {
                    cart.addProduct("Polo w/ Slacks (LARGE)", 1, 1500);
                }
                return cart;                
            case 5:
                if(cart.isExisting("Polo w/ Slacks (XL)"))
                {
                    cart.updateQuantity("Polo w/ Slacks (XL)", 1);
                }
                else
                {
                    cart.addProduct("Polo w/ Slacks (XL)", 1, 1500);
                }
                return cart;               
            case 6: 
                if(cart.isExisting("Polo w/ Slacks (2XL)"))
                {
                    cart.updateQuantity("Polo w/ Slacks (2XL)", 1);
                }
                else
                {
                    cart.addProduct("Polo w/ Slacks (2XL)", 1, 1700);
                }
                return cart;                
            case 7:
                if(cart.isExisting("Polo w/ Slacks (3XL)"))
                {
                    cart.updateQuantity("Polo w/ Slacks (3XL)", 1);
                }
                else
                {
                    cart.addProduct("Polo w/ Slacks (3XL)", 1, 1700);
                }
                return cart;                
            case 8:
                if(cart.isExisting("Polo w/ Slacks (4XL)"))
                {
                    cart.updateQuantity("Polo w/ Slacks (4XL)", 1);
                }
                else
                {
                    cart.addProduct("Polo w/ Slacks (4XL)", 1, 1700);
                }
                return cart;                
            case 9:
                if(cart.isExisting("Polo w/ Slacks (5XL)"))
                {
                    cart.updateQuantity("Polo w/ Slacks (5XL)", 1);
                }
                else
                {
                    cart.addProduct("Polo w/ Slacks (5XL)", 1, 1800);
                }
                return cart;                
            case 10:
                bed.basiced(cart);
                return cart;        
            default:
                System.out.println("\n\t\t\tIncorrect input! Please, try again.");
                sizepolobasic(cart);
                break;
        }        
        return cart;
     } 
      
      public ShoppingList sizepoloshs(ShoppingList cart)
      {
        SeniorHighSchool shs = new SeniorHighSchool();
        Scanner input = new Scanner(System.in);
        System.out.print("\n[1]Extra Small");
        System.out.print("\t\t[6]2XL");
        System.out.print("\n[2]Small");
        System.out.print("\t\t[7]3XL");
        System.out.print("\n[3]Medium");
        System.out.print("\t\t[8]4XL");
        System.out.print("\n[4]Large");
        System.out.print("\t\t[9]5XL");
        System.out.print("\n[5]Extra Large");
        System.out.print("\t\t[10]Back/Return");
        System.out.print("\nEnter Size: ");
        item = input.nextInt();
        
        switch (item) 
        {
        case 1:
            if (cart.isExisting("Polo w/ Pants set (X-SMALL)")) 
            {
                cart.updateQuantity("Polo w/ Pants set (X-SMALL)", 1);
            } else 
            {
                cart.addProduct("Polo w/ Pants set (X-SMALL)", 1, 1500);
            }
            return cart;
        case 2:
            if (cart.isExisting("Polo w/ Pants set (SMALL)")) 
            {
                cart.updateQuantity("Polo w/ Pants set (SMALL)", 1);
            } 
            else 
            {
                cart.addProduct("Polo w/ Pants set (SMALL)", 1, 1500);
            }
            return cart;
        case 3:
            if (cart.isExisting("Polo w/ Pants set (MEDIUM)")) 
            {
                cart.updateQuantity("Polo w/ Pants set (MEDIUM)", 1);
            } 
            else 
            {
                cart.addProduct("Polo w/ Pants set (MEDIUM)", 1, 1500);
            }
            return cart;
        case 4:
            if (cart.isExisting("Polo w/ Pants set (LARGE)")) 
            {
                cart.updateQuantity("Polo w/ Pants set (LARGE)", 1);
            } else 
            {
                cart.addProduct("Polo w/ Pants set (LARGE)", 1, 1500);
            }
            return cart;
        case 5:
            if (cart.isExisting("Polo w/ Pants set (XL)")) 
            {
                cart.updateQuantity("Polo w/ Pants set (XL)", 1);
            } 
            else 
            {
                cart.addProduct("Polo w/ Pants set (XL)", 1, 1500);
            }
            return cart;
        case 6:
            if (cart.isExisting("Polo w/ Pants set (2XL)")) 
            {
                cart.updateQuantity("Polo w/ Pants set (2XL)", 1);
            } 
            else 
            {
                cart.addProduct("Polo w/ Pants set (2XL)", 1, 1700);
            }
            return cart;
        case 7:
            if (cart.isExisting("Polo w/ Pants set (3XL)")) 
            {
                cart.updateQuantity("Polo w/ Pants set (3XL)", 1);
            } 
            else 
            {
                cart.addProduct("Polo w/ Pants set (3XL)", 1, 1700);
            }
            return cart;
        case 8:
            if (cart.isExisting("Polo w/ Pants set (4XL)")) 
            {
                cart.updateQuantity("Polo w/ Pants set (4XL)", 1);
            } 
            else 
            {
                cart.addProduct("Polo w/ Pants set (4XL)", 1, 1700);
            }
            return cart;
        case 9:
            if (cart.isExisting("Polo w/ Pants set (5XL)")) 
            {
                cart.updateQuantity("Polo w/ Pants set (5XL)", 1);
            } 
            else 
            {
                cart.addProduct("Polo w/ Pants set (5XL)", 1, 1700);
            }
            return cart;
        case 10:
            shs.senior(cart);
            break;
        default:
            System.out.println("\n\t\t\t\tIncorrect input! Please, try again.");
            sizepoloshs(cart);
            
        }

        return cart;
        } 
      public ShoppingList sizepe(ShoppingList cart){
          //FOR BASIC ED
          Scanner input = new Scanner(System.in);
          BasicEduc bed = new BasicEduc();
          Select st = new Select();
          
          System.out.print("\n[1]Extra Small");
          System.out.print("\t\t[4]Large");

          System.out.print("\n[2]Small");
          System.out.print("\t\t[5]Extra Large");

          System.out.print("\n[3]Medium");
          System.out.print("\t\t[6]2XL");
          System.out.print("\n[7]Back/Return");
          
          System.out.print("\n\nEnter size:");
          item = input.nextInt();
          
          switch(item)
          {
              case 1:
                  if(cart.isExisting("PE Uniform (X-SMALL)"))
            {
                cart.updateQuantity("PE Uniform (X-SMALL)", 1);
            }
            else
            {
                cart.addProduct("PE Uniform (X-SMALL)", 1, 1105);
            }
            return cart;
                  /*
                  System.out.println("Item                   Extra Small PE Uniform");
                  price = 1105;
                call = 1;
                  return price;*/
              case 2: 
                  if(cart.isExisting("PE Uniform (SMALL)"))
            {
                cart.updateQuantity("PE Uniform (SMALL)", 1);
            }
            else
            {
                cart.addProduct("PE Uniform (SMALL)", 1, 1105);
            }
                  return cart;
                  /*System.out.println("Item                   Small PE Uniform");
                call = 1;
                  price = 1105;
                  return price;*/
              case 3: 
                  if(cart.isExisting("PE Uniform (MEDIUM)"))
            {
                cart.updateQuantity("PE Uniform (MEDIUM)", 1);
            }
            else
            {
                cart.addProduct("PE Uniform (MEDIUM)", 1, 1105);
            }
                  return cart;
                  /*System.out.println("Item                   Medium PE Uniform");
                call = 1;
                  price = 1105;
                  return price;*/
              case 4: 
                  if(cart.isExisting("PE Uniform (LARGE)"))
            {
                cart.updateQuantity("PE Uniform (LARGE)", 1);
            }
            else
            {
                cart.addProduct("PE Uniform (LARGE)", 1, 1130);
            }
                  return cart;
                  /*System.out.println("Item                   Large PE Uniform");
                call = 1;
                  price = 1130;
                  return price;*/
              case 5:
                  if(cart.isExisting("PE Uniform (XL)"))
            {
                cart.updateQuantity("PE Uniform (XL)", 1);
            }
            else
            {
                cart.addProduct("PE Uniform (XL)", 1, 1150);
            }
                  return cart;
                  /*System.out.println("Item                   Extra Large PE Uniform");
                  price = 1150;
                call = 1;
                  return price;*/
              case 6: 
                  if(cart.isExisting("PE Uniform (2XL)"))
            {
                cart.updateQuantity("PE Uniform (2XL)", 1);
            }
            else
            {
                cart.addProduct("PE Uniform (2XL)", 1, 1250);
            }
                  return cart;
                  /*System.out.println("Item                   2XL PE Uniform");
                  price = 1250;
                call = 1;
                  return price;*/
              case 7: 
                    st.select();
                  break;
              default:
                  System.out.println("\n\t\t\t\tIncorrect input! Please, try again.");
                  sizepe(cart);                  
                  break;
          }          
        System.out.println("Price                  "+price);
        System.out.println("--------------------------------");
        total = total + price;
        quantity = quantity + call;
        System.out.println("Total amount: "+total);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Add another? (y/n) : ");
        String gsige = sc.nextLine();
        if(gsige.equals("y")||gsige.equals("Y")){
            bed.total1 = total;
            bed.quantity1 = quantity;
            bed.basiced(cart);
        }
        else{
            bed.pay(cart);
          
        }
        return cart;
          }
      
      public ShoppingList sizepeshs(ShoppingList cart)
      {
          //for shs
          Scanner input = new Scanner(System.in);
          SeniorHighSchool shs = new SeniorHighSchool();
          Select st = new Select();
          
          System.out.print("\n[1]Extra Small");
          System.out.print("\t\t[4]Large");

          System.out.print("\n[2]Small");
          System.out.print("\t\t[5]Extra Large");

          System.out.print("\n[3]Medium");
          System.out.print("\t\t[6]2XL");
          System.out.print("\n[7]Back/Return");
          
          System.out.println("\n\nEnter here");
          item = input.nextInt();
          
          switch (item) 
          {
              case 1:
                  if (cart.isExisting("PE Uniform (X-SMALL)")) 
                  {
                      cart.updateQuantity("PE Uniform (X-SMALL)", 1);
                  } 
                  else 
                  {
                      cart.addProduct("PE Uniform (X-SMALL)", 1, 1105);
                  }
                  return cart;
              case 2:
                  if (cart.isExisting("PE Uniform (SMALL)")) 
                  {
                      cart.updateQuantity("PE Uniform (SMALL)", 1);
                  } 
                  else 
                  {
                      cart.addProduct("PE Uniform (SMALL)", 1, 1105);
                  }
                  return cart;
              case 3:
                  if (cart.isExisting("PE Uniform (MEDIUM)")) 
                  {
                      cart.updateQuantity("PE Uniform (MEDIUM)", 1);
                  } 
                  else 
                  {
                      cart.addProduct("PE Uniform (MEDIUM)", 1, 1105);
                  }
                  return cart;
              case 4:
                  if (cart.isExisting("PE Uniform (LARGE)")) 
                  {
                      cart.updateQuantity("PE Uniform (LARGE)", 1);
                  } 
                  else 
                  {
                      cart.addProduct("PE Uniform (LARGE)", 1, 1130);
                  }
                  return cart;
              case 5:
                  if (cart.isExisting("PE Uniform (XL)")) 
                  {
                      cart.updateQuantity("PE Uniform (XL)", 1);
                  } 
                  else 
                  {
                      cart.addProduct("PE Uniform (XL)", 1, 1150);
                  }
                  return cart;
              case 6:
                  if (cart.isExisting("PE Uniform (2XL)")) 
                  {
                      cart.updateQuantity("PE Uniform (2XL)", 1);
                  } 
                  else 
                  {
                      cart.addProduct("PE Uniform (2XL)", 1, 1250);
                  }
                  return cart;
              case 7:
                  shs.senior(cart);
                  break; 
              default:
                  System.out.println("\n\t\t\tIncorrect input! Please, try again.");
                  sizepe(cart);                 
          }
                 
        return cart;
    }
      

      public ShoppingList sizepescmcs(ShoppingList cart){
          //for snashs
          Scanner input = new Scanner(System.in);
          HigherEd hed = new HigherEd();
          Select st = new Select();
          
          System.out.print("\n[1]Extra Small");
          System.out.print("\t\t[4]Large");

          System.out.print("\n[2]Small");
          System.out.print("\t\t[5]Extra Large");

          System.out.print("\n[3]Medium");
          System.out.print("\t\t[6]2XL");
          System.out.print("\n[7]Back/Return");
          
          System.out.println("\n\nEnter here");
          item = input.nextInt();
          switch (item) {
    case 1:
        if (cart.isExisting("SDCA Official Red Shirt (X-SMALL)")) {
            cart.updateQuantity("SDCA Official Red Shirt (X-SMALL)", 1);
        } else {
            cart.addProduct("SDCA Official Red Shirt (X-SMALL)", 1, 500);
        }
        return cart;

    case 2:
        if (cart.isExisting("SDCA Official Red Shirt (SMALL)")) {
            cart.updateQuantity("SDCA Official Red Shirt (SMALL)", 1);
        } else {
            cart.addProduct("SDCA Official Red Shirt (SMALL)", 1, 500);
        }
        return cart;

    case 3:
        if (cart.isExisting("SDCA Official Red Shirt (MEDIUM)")) {
            cart.updateQuantity("SDCA Official Red Shirt (MEDIUM)", 1);
        } else {
            cart.addProduct("SDCA Official Red Shirt (MEDIUM)", 1, 500);
        }
        return cart;

    case 4:
        if (cart.isExisting("SDCA Official Red Shirt (LARGE)")) {
            cart.updateQuantity("SDCA Official Red Shirt (LARGE)", 1);
        } else {
            cart.addProduct("SDCA Official Red Shirt (LARGE)", 1, 550);
        }
        return cart;

    case 5:
        if (cart.isExisting("SDCA Official Red Shirt (XL)")) {
            cart.updateQuantity("SDCA Official Red Shirt (XL)", 1);
        } else {
            cart.addProduct("SDCA Official Red Shirt (XL)", 1, 550);
        }
        return cart;

    case 6:
        if (cart.isExisting("SDCA Official Red Shirt (2XL)")) {
            cart.updateQuantity("SDCA Official Red Shirt (2XL)", 1);
        } else {
            cart.addProduct("SDCA Official Red Shirt (2XL)", 1, 600);
        }
        return cart;

    case 7:
        if (cart.isExisting("SDCA Official Red Shirt (3XL)")) {
            cart.updateQuantity("SDCA Official Red Shirt (3XL)", 1);
        } else {
            cart.addProduct("SDCA Official Red Shirt (3XL)", 1, 600);
        }
        return cart;

    case 8:
        if (cart.isExisting("SDCA Official Red Shirt (4XL)")) {
            cart.updateQuantity("SDCA Official Red Shirt (4XL)", 1);
        } else {
            cart.addProduct("SDCA Official Red Shirt (4XL)", 1, 700);
        }
        return cart;

    case 9:
        if (cart.isExisting("SDCA Official Red Shirt (5XL)")) {
            cart.updateQuantity("SDCA Official Red Shirt (5XL)", 1);
        } else {
            cart.addProduct("SDCA Official Red Shirt (5XL)", 1, 750);
        }
        return cart;

    case 10:
        hed.higher(cart);
        break;

    default:
        sizepescmcs(cart);
        break;
}

            
        return cart;
     }
      
      public ShoppingList sizesnashsscrub(ShoppingList cart){
        Scanner input = new Scanner(System.in);
        HigherEd hed = new HigherEd();
        
        System.out.print("\n[1]Extra Small");
        System.out.print("\t\t[6]2XL");
        System.out.print("\n[2]Small");
        System.out.print("\t\t[7]3XL");
        System.out.print("\n[3]Medium");
        System.out.print("\t\t[8]4XL");
        System.out.print("\n[4]Large");
        System.out.print("\t\t[9]5XL");
        System.out.print("\n[5]Extra Large");
        System.out.print("\t\t[10]Back/Return");
        
        System.out.print("\nEnter Size: ");
        item = input.nextInt();
        
        switch(item)
        {        
            case 1: 
                if (cart.isExisting("Scrub Top w Pants (X-SMALL)")) {
            cart.updateQuantity("Scrub Top w Pants (X-SMALL)", 1);
        } else {
            cart.addProduct("Scrub Top w Pants (X-SMALL)", 1, 1370);
        }
        return cart;
                
              
            case 2:
                if (cart.isExisting("Scrub Top w Pants (SMALL)")) {
            cart.updateQuantity("Scrub Top w Pants (SMALL)", 1);
        } else {
            cart.addProduct("Scrub Top w Pants (SMALL)", 1, 1370);
        }
        return cart;
                
            case 3: 
                if (cart.isExisting("Scrub Top w Pants (MEDIUM)")) {
            cart.updateQuantity("Scrub Top w Pants (MEDIUM)", 1);
        } else {
            cart.addProduct("Scrub Top w Pants (MEDIUM)", 1, 1370);
        }
        return cart;
                
            case 4:
                if (cart.isExisting("Scrub Top w Pants (LARGE)")) {
            cart.updateQuantity("Scrub Top w Pants (LARGE)", 1);
        } else {
            cart.addProduct("Scrub Top w Pants (LARGE)", 1, 1370);
        }
        return cart;
                
            case 5:
                if (cart.isExisting("Scrub Top w Pants (XL)")) {
            cart.updateQuantity("Scrub Top w Pants (XL)", 1);
        } else {
            cart.addProduct("Scrub Top w Pants (XL)", 1, 1370);
        }
        return cart;
                
            case 6: 
                if (cart.isExisting("Scrub Top w Pants (2XL)")) {
            cart.updateQuantity("Scrub Top w Pants (2XL)", 1);
        } else {
            cart.addProduct("Scrub Top w Pants (2XL)", 1, 1560);
        }
        return cart;
                
            case 7:
                if (cart.isExisting("Scrub Top w Pants (3XL)")) {
            cart.updateQuantity("Scrub Top w Pants (3XL)", 1);
        } else {
            cart.addProduct("Scrub Top w Pants (3XL)", 1, 1560);
        }
        return cart;                
            case 8:
                if (cart.isExisting("Scrub Top w Pants (4XL)")) {
            cart.updateQuantity("Scrub Top w Pants (4XL)", 1);
        } else {
            cart.addProduct("Scrub Top w Pants (4XL)", 1, 1560);
        }
        return cart;                
            case 9:
                if (cart.isExisting("Scrub Top w Pants (5XL)")) {
            cart.updateQuantity("Scrub Top w Pants (5XL)", 1);
        } else {
            cart.addProduct("Scrub Top w Pants (5XL)", 1, 1560);
        }
        return cart;                
            case 10:                
                hed.snashs(cart);
                break;
            default:                
                sizesnashsscrub(cart);
                break;
        }
        
        return cart;
      } 
      public ShoppingList sizesnashsgreen(ShoppingList cart)
      {
        Scanner input = new Scanner(System.in);
        HigherEd hed = new HigherEd();
        
        System.out.print("\n[1]Small");
        System.out.print("\t\t[3]Large");
        System.out.print("\n[2]Medium");
        System.out.print("\t\t[4]Extra Large");
        System.out.print("\n[5]Back/Return");
        
        System.out.print("\n\nEnter Size: ");
        item = input.nextInt();
        
        switch(item){
        
            case 1: 
                if (cart.isExisting("Green Nursing Uniform Coat (SMALL)")) {
            cart.updateQuantity("Green Nursing Uniform Coat (SMALL)", 1);
        } else {
            cart.addProduct("Green Nursing Uniform Coat (SMALL)", 1, 1500);
        }
        return cart;                
              
            case 2:
                if (cart.isExisting("Green Nursing Uniform Coat (MEDIUM)")) {
            cart.updateQuantity("Green Nursing Uniform Coat (MEDIUM)", 1);
        } else {
            cart.addProduct("Green Nursing Uniform Coat (MEDIUM)", 1, 1500);
        }
        return cart;                 
            case 3:
                if (cart.isExisting("Green Nursing Uniform Coat (LARGE)")) {
            cart.updateQuantity("Green Nursing Uniform Coat (LARGE)", 1);
        } else {
            cart.addProduct("Green Nursing Uniform Coat (LARGE)", 1, 1560);
        }
        return cart;                
            case 4:
                if (cart.isExisting("Green Nursing Uniform Coat (XL)")) {
            cart.updateQuantity("Green Nursing Uniform Coat (XL)", 1);
        } else {
            cart.addProduct("Green Nursing Uniform Coat (XL)", 1, 1600);
        }
        return cart;                            
            case 5:
                hed.snashs(cart);
                break;
                
            default:
                sizesnashsgreen(cart);
                break;
        }
       
        return cart;
} 
      public ShoppingList sizesnashslab(ShoppingList cart){
        Scanner input = new Scanner(System.in);
        HigherEd hed = new HigherEd();
        
        System.out.print("\n\n[1]Small");
        System.out.print("\t\t[3]Large");
        System.out.print("\n[2]Medium");
        System.out.print("\t\t[4]Extra Large");
        System.out.print("\n[5]Back/Return");
        
        System.out.print("\n\nEnter Size: ");
        item = input.nextInt();
        
        switch(item){
        
            case 1: 
                if (cart.isExisting("Laboratory White Coat (SMALL)")) 
                {
                    cart.updateQuantity("Laboratory White Coat (SMALL)", 1);
                } 
                else 
                {
                    cart.addProduct("Laboratory White Coat (Small)", 1, 1500);
                }
                return cart;                              
            case 2:
                if (cart.isExisting("Laboratory White Coat (MEDIUM)")) 
                {
                    cart.updateQuantity("Laboratory White Coat (MEDIUM)", 1);
                } 
                else 
                {
                    cart.addProduct("Laboratory White Coat (MEDIUM)", 1, 1500);
                }
                return cart;                
            case 3: 
                if (cart.isExisting("Laboratory White Coat (LARGE)")) 
                {
                    cart.updateQuantity("Laboratory White Coat (LARGE)", 1);
                } 
                else 
                {
                    cart.addProduct("Laboratory White Coat (LARGE)", 1, 1560);
                }
                return cart;                
            case 4:
                if (cart.isExisting("Laboratory White Coat (XL)")) 
                {
                    cart.updateQuantity("Laboratory White Coat (XL)", 1);
                } 
                else 
                {
                    cart.addProduct("Laboratory White Coat (XL)", 1, 1600);
                }
                return cart;                
            case 5:
                hed.snashs(cart);
                break;
                
            default:
                sizesnashslab(cart);
                break;
        }        
    return cart;    
} 

      public ShoppingList sizescmcssdcared(ShoppingList cart){
        Scanner input = new Scanner(System.in);
        HigherEd hed = new HigherEd();
        Select st = new Select();
        
        System.out.print("\n[1]Small");
        System.out.print("\t\t[6]2XL");
        System.out.print("\n[2]Extra Small");
        System.out.print("\t\t[7]3XL");
        System.out.print("\n[3]Medium");
        System.out.print("\t\t[8]4XL");
        System.out.print("\n[4]Large");
        System.out.print("\t\t[9]5XL");
        System.out.print("\n[5]Extra Large");
        System.out.print("\t\t[10]Back/Return");
        
        System.out.print("\nEnter Size: ");
        item = input.nextInt();
        
        switch(item){
        
            case 1:
        if (cart.isExisting("Small SDCA Official Red Shirt w Slacks")) {
            cart.updateQuantity("Small SDCA Official Red Shirt w Slacks", 1);
        } else {
            cart.addProduct("Small SDCA Official Red Shirt w Slacks", 1, 500);
        }
        return cart;

    case 2:
        if (cart.isExisting("Extra Small SDCA Official Red Shirt w Slacks")) {
            cart.updateQuantity("Extra Small SDCA Official Red Shirt w Slacks", 1);
        } else {
            cart.addProduct("Extra Small SDCA Official Red Shirt w Slacks", 1, 500);
        }
        return cart;

    case 3:
        if (cart.isExisting("Medium SDCA Official Red Shirt w Slacks")) {
            cart.updateQuantity("Medium SDCA Official Red Shirt w Slacks", 1);
        } else {
            cart.addProduct("Medium SDCA Official Red Shirt w Slacks", 1, 500);
        }
        return cart;

    case 4:
        if (cart.isExisting("Large SDCA Official Red Shirt w Slacks")) {
            cart.updateQuantity("Large SDCA Official Red Shirt w Slacks", 1);
        } else {
            cart.addProduct("Large SDCA Official Red Shirt w Slacks", 1, 550);
        }
        return cart;

    case 5:
        if (cart.isExisting("Extra Large SDCA Official Red Shirt w Slacks")) {
            cart.updateQuantity("Extra Large SDCA Official Red Shirt w Slacks", 1);
        } else {
            cart.addProduct("Extra Large SDCA Official Red Shirt w Slacks", 1, 550);
        }
        return cart;

    case 6:
        if (cart.isExisting("2XL SDCA Official Red Shirt w Slacks")) {
            cart.updateQuantity("2XL SDCA Official Red Shirt w Slacks", 1);
        } else {
            cart.addProduct("2XL SDCA Official Red Shirt w Slacks", 1, 600);
        }
        return cart;

    case 7:
        if (cart.isExisting("3XL SDCA Official Red Shirt w Slacks")) {
            cart.updateQuantity("3XL SDCA Official Red Shirt w Slacks", 1);
        } else {
            cart.addProduct("3XL SDCA Official Red Shirt w Slacks", 1, 600);
        }
        return cart;

    case 8:
        if (cart.isExisting("4XL SDCA Official Red Shirt w Slacks")) {
            cart.updateQuantity("4XL SDCA Official Red Shirt w Slacks", 1);
        } else {
            cart.addProduct("4XL SDCA Official Red Shirt w Slacks", 1, 700);
        }
        return cart;

    case 9:
        if (cart.isExisting("5XL SDCA Official Red Shirt w Slacks")) {
            cart.updateQuantity("5XL SDCA Official Red Shirt w Slacks", 1);
        } else {
            cart.addProduct("5XL SDCA Official Red Shirt w Slacks", 1, 750);
        }
        return cart;

    case 10:
        hed.higher(cart);
        break;
            default:
                sizescmcssdcared(cart);
                break;
        }
                
        return cart;
      }
                 
      public ShoppingList sizescmcsblouse(ShoppingList cart) {
    // For Women's Blouse w Slacks
    Scanner input = new Scanner(System.in);
    HigherEd hed = new HigherEd();
    Select st = new Select();

    // Display menu options
    System.out.println("\n[1] Small");
    System.out.println("[2] Medium");
    System.out.println("[3] Large");
    System.out.println("[4] Extra Large");
    System.out.println("[5] Back/Return");

    // Get user input for size
    System.out.print("\n\nEnter Size: ");
    int item = input.nextInt();

    switch (item) {
        case 1:
            // Check if item exists and add or update quantity
            if (cart.isExisting("Small Women's Blouse w Slacks")) {
                cart.updateQuantity("Small Women's Blouse w Slacks", 1);
            } else {
                cart.addProduct("Small Women's Blouse w Slacks", 1, 1600);
            }
            return cart;

        case 2:
            if (cart.isExisting("Medium Women's Blouse w Slacks")) {
                cart.updateQuantity("Medium Women's Blouse w Slacks", 1);
            } else {
                cart.addProduct("Medium Women's Blouse w Slacks", 1, 1630);
            }
            return cart;

        case 3:
            if (cart.isExisting("Large Women's Blouse w Slacks")) {
                cart.updateQuantity("Large Women's Blouse w Slacks", 1);
            } else {
                cart.addProduct("Large Women's Blouse w Slacks", 1, 1670);
            }
            return cart;

        case 4:
            if (cart.isExisting("Extra Large Women's Blouse w Slacks")) {
                cart.updateQuantity("Extra Large Women's Blouse w Slacks", 1);
            } else {
                cart.addProduct("Extra Large Women's Blouse w Slacks", 1, 1690);
            }
            return cart;

        case 5:
            hed.scmcs(cart); // Handle back/return case
            break;

        default:
            sizescmcsblouse(cart); // Handle invalid input
            break;
    }

    return cart; // Return the updated cart
}

      public ShoppingList sizescmcspolo(ShoppingList cart) {
    // For Men's Polo w Slacks
    Scanner input = new Scanner(System.in);
    HigherEd hed = new HigherEd();
    Select st = new Select();

    // Display menu options
    System.out.println("\n[1] Small");
    System.out.println("[2] Medium");
    System.out.println("[3] Large");
    System.out.println("[4] Extra Large");
    System.out.println("[5] Back/Return");

    // Get user input for size
    System.out.print("\n\nEnter Size: ");
    int item = input.nextInt();

    switch (item) {
        case 1:
            // Check if item exists and add or update quantity
            if (cart.isExisting("Small Men's Polo w Slacks")) {
                cart.updateQuantity("Small Men's Polo w Slacks", 1);
            } else {
                cart.addProduct("Small Men's Polo w Slacks", 1, 1500);
            }
            return cart;

        case 2:
            if (cart.isExisting("Medium Men's Polo w Slacks")) {
                cart.updateQuantity("Medium Men's Polo w Slacks", 1);
            } else {
                cart.addProduct("Medium Men's Polo w Slacks", 1, 1500);
            }
            return cart;

        case 3:
            if (cart.isExisting("Large Men's Polo w Slacks")) {
                cart.updateQuantity("Large Men's Polo w Slacks", 1);
            } else {
                cart.addProduct("Large Men's Polo w Slacks", 1, 1560);
            }
            return cart;

        case 4:
            if (cart.isExisting("Extra Large Men's Polo w Slacks")) {
                cart.updateQuantity("Extra Large Men's Polo w Slacks", 1);
            } else {
                cart.addProduct("Extra Large Men's Polo w Slacks", 1, 1600);
            }
            return cart;

        case 5:
            hed.scmcs(cart); // Handle back/return case
            break;

        default:
            sizescmcspolo(cart); // Handle invalid input
            break;
    }

    return cart; // Return the updated cart
}

      public ShoppingList sizeshitmbluish(ShoppingList cart){
        Scanner input = new Scanner(System.in);
        HigherEd hed = new HigherEd();
        Select st = new Select();
        
        System.out.print("\n[1]Small");
        System.out.print("\t\t[3]Large");
        System.out.print("\n[2]Medium");
        System.out.print("\t\t[4]Extra Large");
        System.out.print("\n[5]Back/Return");
        
        System.out.print("\n\nEnter Size: ");
        item = input.nextInt();
        
        switch (item) {
    case 1:
        if (cart.isExisting("Small Women's Corporate Bluish Top and Skirt")) {
            cart.updateQuantity("Small Women's Corporate Bluish Top and Skirt", 1);
        } else {
            cart.addProduct("Small Women's Corporate Bluish Top and Skirt", 1, 2200); // Add optional description here
        }
        return cart;

    case 2:
        if (cart.isExisting("Medium Women's Corporate Bluish Top and Skirt")) {
            cart.updateQuantity("Medium Women's Corporate Bluish Top and Skirt", 1);
        } else {
            cart.addProduct("Medium Women's Corporate Bluish Top and Skirt", 1, 2500); // Add optional description here
        }
        return cart;

    case 3:
        if (cart.isExisting("Large Women's Corporate Bluish Top and Skirt")) {
            cart.updateQuantity("Large Women's Corporate Bluish Top and Skirt", 1);
        } else {
            cart.addProduct("Large Women's Corporate Bluish Top and Skirt", 1, 2650); // Add optional description here
        }
        return cart;

    case 4:
        if (cart.isExisting("Extra Large Women's Corporate Bluish Top and Skirt")) {
            cart.updateQuantity("Extra Large Women's Corporate Bluish Top and Skirt", 1);
        } else {
            cart.addProduct("Extra Large Women's Corporate Bluish Top and Skirt", 1, 2950); // Add optional description here
        }
        return cart;
   

    case 5:
        hed.higher(cart); // Handle higher functionality for checkout or menu
        break;

    default:
        sizeshitmbluish(cart); // Handle invalid input or redirect
        break;
}

        
     return cart;  
    }
      public ShoppingList sizeshitmmenbluish(ShoppingList cart){
        Scanner input = new Scanner(System.in);
        HigherEd hed = new HigherEd();
        Select st = new Select();
        
        System.out.print("\n[1]Small");
        System.out.print("\t\t[3]Large");
        System.out.print("\n[2]Medium");
        System.out.print("\t\t[4]Extra Large");
        System.out.print("\n[5]Back/Return");
        
        System.out.print("\n\nEnter Size: ");
        item = input.nextInt();
        
        switch (item) {
    case 1:
        if (cart.isExisting("Small Men's Corporate Bluish Top and Bluish Pants")) {
            cart.updateQuantity("Small Men's Corporate Bluish Top and Bluish Pants", 1);
        } else {
            cart.addProduct("Small Men's Corporate Bluish Top and Bluish Pants", 1, 2200); // Optional description
        }
        return cart;

    case 2:
        if (cart.isExisting("Medium Men's Corporate Bluish Top and Bluish Pants")) {
            cart.updateQuantity("Medium Men's Corporate Bluish Top and Bluish Pants", 1);
        } else {
            cart.addProduct("Medium Men's Corporate Bluish Top and Bluish Pants", 1, 2500); // Optional description
        }
        return cart;

    case 3:
        if (cart.isExisting("Large Men's Corporate Bluish Top and Bluish Pants")) {
            cart.updateQuantity("Large Men's Corporate Bluish Top and Bluish Pants", 1);
        } else {
            cart.addProduct("Large Men's Corporate Bluish Top and Bluish Pants", 1, 2650); // Optional description
        }
        return cart;

    case 4:
        if (cart.isExisting("Extra Large Men's Corporate Bluish Top and Bluish Pants")) {
            cart.updateQuantity("Extra Large Men's Corporate Bluish Top and Bluish Pants", 1);
        } else {
            cart.addProduct("Extra Large Men's Corporate Bluish Top and Bluish Pants", 1, 2950); // Optional description
        }
        return cart;

    // Add remaining cases for sizes (5-8) following the same format

    case 5:
        hed.higher(cart);
        break;

    default:
        sizeshitmmenbluish(cart);
        break;
}

        return cart;
    }
    
}












