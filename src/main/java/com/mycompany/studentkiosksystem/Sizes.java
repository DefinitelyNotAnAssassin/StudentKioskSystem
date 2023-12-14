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
                    cart.addProduct("Blouse w/ Skirt Set (XL)", 1, 1260);
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

      public void sizepesnashs(){
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
          switch(item){
              case 1:
                  System.out.println("Item                   Extra Small PE Uniform");
                  price = 1105;
                call = 1;
                  break;
              case 2: 
                  System.out.println("Item                   Small PE Uniform");
                call = 1;
                  price = 1105;
                  break;
              case 3: 
                  System.out.println("Item                   Medium PE Uniform");
                call = 1;
                  price = 1105;
                  break;
              case 4: 
                  System.out.println("Item                   Large PE Uniform");
                call = 1;
                  price = 1130;
                  break;
              case 5:
                  System.out.println("Item                   Extra Large PE Uniform");
                  price = 1150;
                call = 1;
                  break;
              case 6: 
                  System.out.println("Item                   2XL PE Uniform");
                  price = 1250;
                call = 1;
                  break;
              case 7: 
                    st.select();
                  break;
              default:
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
            hed.total3 = total;
            hed.quantity3 = quantity;
            hed.snashs();
        }
        else{
            hed.snashpay();
          
        }
          }
      public void sizepescmcs(){
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
          switch(item){
              case 1:
                  System.out.println("Item                   Extra Small PE Uniform");
                  price = 1105;
                call = 1;
                  break;
              case 2: 
                  System.out.println("Item                   Small PE Uniform");
                call = 1;
                  price = 1105;
                  break;
              case 3: 
                  System.out.println("Item                   Medium PE Uniform");
                call = 1;
                  price = 1105;
                  break;
              case 4: 
                  System.out.println("Item                   Large PE Uniform");
                call = 1;
                  price = 1130;
                  break;
              case 5:
                  System.out.println("Item                   Extra Large PE Uniform");
                  price = 1150;
                call = 1;
                  break;
              case 6: 
                  System.out.println("Item                   2XL PE Uniform");
                  price = 1250;
                call = 1;
                  break;
              case 7: 
                    st.select();
                  break;
              default:
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
            hed.total4 = total;
            hed.quantity4 = quantity;
            hed.scmcs();
        }
        else{
            hed.snashpay();
          
        }
          }
      public void sizepesihtm(){
          //for sihtm
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
          switch(item){
              case 1:
                  System.out.println("Item                   Extra Small PE Uniform");
                  price = 1105;
                call = 1;
                  break;
              case 2: 
                  System.out.println("Item                   Small PE Uniform");
                call = 1;
                  price = 1105;
                  break;
              case 3: 
                  System.out.println("Item                   Medium PE Uniform");
                call = 1;
                  price = 1105;
                  break;
              case 4: 
                  System.out.println("Item                   Large PE Uniform");
                call = 1;
                  price = 1130;
                  break;
              case 5:
                  System.out.println("Item                   Extra Large PE Uniform");
                  price = 1150;
                call = 1;
                  break;
              case 6: 
                  System.out.println("Item                   2XL PE Uniform");
                  price = 1250;
                call = 1;
                  break;
              case 7: 
                   hed.sihtm();
                  break;
              default:
                  sizepesihtm();
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
            hed.total5 = total;
            hed.quantity5 = quantity;
            hed.sihtm();
        }
        else{
            hed.sihtmpay();
          
        }
          }
      public void sizesnashsscrub(){
        Scanner input = new Scanner(System.in);
        HigherEd hed = new HigherEd();
        
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
                System.out.println("Item                         Small Scrub Top w Pants");
                call = 1;
                price = 1370;
                break;
              
            case 2:
                System.out.println("Item                         Extra Small Scrub Top w Pants");
                call = 1;
                price = 1370;
                break;
            case 3: 
                System.out.println("Item                         Medium Scrub Top w Pants ");
                call = 1;
                price = 1370;
                break;
            case 4:
                System.out.println("Item                         Large Scrub Top w Pants");
                call = 1;
                price = 1370;
                break;
            case 5:
                System.out.println("Item                         Extra Large Scrub Top w Pants");
                call = 1;
                price = 1370;
                break;
            case 6: 
                System.out.println("Item                         2XL Scrub Top w Pants ");
                call = 1;
                price = 1560;
                
               break;
            case 7:
                System.out.println("Item                         3XL Scrub Top w Pants");
                call = 1;
                price = 1560;
                break;
            case 8:
                System.out.println("Item                         4XL Scrub Top w Pants");
                call = 1;
                price = 1560;
                break;
            case 9:
                System.out.println("Item                         5XL Scrub Top w Pants");
                call = 1;
                price = 1560;
                break;
            case 10:
                
                hed.snashs();
                break;
            default:
                sizesnashsscrub();
                break;
        }
                
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        quantity = quantity + call;
        System.out.println("Total amount: "+total);
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String gesig = sc.nextLine();
        if(gesig.equals("y")||gesig.equals("Y")){
            hed.total3 = total;
            hed.quantity3 = quantity;
            hed.snashs();
        }
        else{
            hed.snashpay();
        }
      }
      public void sizesnashsgreen(){
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
                System.out.println("Item                  Small Green Nursing Uniform Coat");
                call = 1;
                price = 1500;
                
                break;
              
            case 2:
                System.out.println("Item                  Medium Green Nursing Uniform Coat");
                call = 1;
                price = 1500;
                
                break;
            case 3: 
                System.out.println("Item                  Large Green Nursing Uniform Coat");
                call = 1;
                price = 1560;
                break;
            case 4:
                System.out.println("Item                  Extra Large Green Nursing Uniform Coat");
                call = 1;
                price = 1600;
                break;
           
            case 5:
                hed.snashs();
                break;
                
            default:
                sizesnashsgreen();
                break;
        }
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        quantity = quantity + call;
        System.out.println("Total amount: "+total);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String letgo = sc.nextLine();
        if(letgo.equals("y")||letgo.equals("Y")){
            hed.total3 = total;
            hed.quantity3 = quantity;
            hed.snashs();
        }
        else{
            hed.snashpay();
        }
}
      public void sizesnashslab(){
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
                System.out.println("Item                  Small Laboratory White Coat");
                call = 1;
                price = 1500;
                
                break;
              
            case 2:
                System.out.println("Item                  Medium Laboratory White Coat");
                call = 1;
                price = 1500;
                
                break;
            case 3: 
                System.out.println("Item                  Large Laboratory White Coat");
                call = 1;
                price = 1560;
                
                break;
            case 4:
                System.out.println("Item                  Extra Large Laboratory White Coat");
                call = 1;
                price = 1600;
                break;
           
            case 5:
                hed.snashs();
                break;
                
            default:
                sizesnashslab();
                break;
        }
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        quantity = quantity + call;
        System.out.println("Total amount: "+total);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String letsgo = sc.nextLine();
        if(letsgo.equals("y")||letsgo.equals("Y")){
            hed.total3 = total;
            hed.quantity3 = quantity;
            hed.snashs();
        }
        else{
           hed.snashpay();
        }
        
}
      public void sizesnashsdcared(){
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
                System.out.println("Item                         Small SDCA Official Red Shirt");
                call = 1;
                price = 500;
                break;
              
            case 2:
                System.out.println("Item                         Extra Small SDCA Official Red Shirt");
                call = 1;
                price = 500;
                break;
            case 3: 
                System.out.println("Item                         Medium SDCA Official Red Shirt");
                call = 1;
                price = 500;
                break;
            case 4:
                System.out.println("Item                         Large SDCA Official Red Shirt");
                call = 1;
                price = 550;
                
                break;
            case 5:
                System.out.println("Item                         Extra Large SDCA Official Red Shirt");
                call = 1;
                price = 550;
                
                break;
            case 6: 
                System.out.println("Item                         2XL SDCA Official Red Shirt ");
                call = 1;
                price = 600;
                
               break;
            case 7:
                System.out.println("Item                         3XL SDCA Official Red Shirt");
                call = 1;
                price = 600;
                break;
            case 8:
                System.out.println("Item                         4XL SDCA Official Red Shirt");
                call = 1;
                price = 700;
                break;
            case 9:
                System.out.println("Item                         5XL SDCA Official Red Shirt");
                call = 1;
                price = 750;
                break;
            case 10:
                hed.higher();
                break;
            default:
                sizesnashsdcared();
                break;
        }
                
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        quantity = quantity + call;
        System.out.println("Total amount: "+total);
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String redsige = sc.nextLine();
        if(redsige.equals("y")||redsige.equals("Y")){
            hed.quantity3 = quantity;
            hed.total3 = total;
            hed.snashs();
        }
        else{
            hed.snashpay();
      }
         
     }
      public void sizescmcssdcared(){
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
                System.out.println("Item                         Small SDCA Official Red Shirt");
                call = 1;
                price = 500;
                break;
              
            case 2:
                System.out.println("Item                         Extra Small SDCA Official Red Shirt");
                call = 1;
                price = 500;
                break;
            case 3: 
                System.out.println("Item                         Medium SDCA Official Red Shirt");
                call = 1;
                price = 500;
                break;
            case 4:
                System.out.println("Item                         Large SDCA Official Red Shirt");
                call = 1;
                price = 550;
                
                break;
            case 5:
                System.out.println("Item                         Extra Large SDCA Official Red Shirt");
                call = 1;
                price = 550;
                
                break;
            case 6: 
                System.out.println("Item                         2XL SDCA Official Red Shirt ");
                call = 1;
                price = 600;
                
               break;
            case 7:
                System.out.println("Item                         3XL SDCA Official Red Shirt");
                call = 1;
                price = 600;
                break;
            case 8:
                System.out.println("Item                         4XL SDCA Official Red Shirt");
                call = 1;
                price = 700;
                break;
            case 9:
                System.out.println("Item                         5XL SDCA Official Red Shirt");
                call = 1;
                price = 750;
                break;
            case 10:
                hed.higher();
                break;
            default:
                sizesnashsdcared();
                break;
        }
                
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        quantity = quantity + call;
        System.out.println("Total amount: "+total);
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String redsige = sc.nextLine();
        if(redsige.equals("y")||redsige.equals("Y")){
            hed.quantity4 = quantity;
            hed.total4 = total;
            hed.scmcs();
        }
        else{
            hed.scmcspay();
      }
         
     }
      public void sizesihtmsdcared(){
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
                System.out.println("Item                         Small SDCA Official Red Shirt");
                call = 1;
                price = 500;
                break;
              
            case 2:
                System.out.println("Item                         Extra Small SDCA Official Red Shirt");
                call = 1;
                price = 500;
                break;
            case 3: 
                System.out.println("Item                         Medium SDCA Official Red Shirt");
                call = 1;
                price = 500;
                break;
            case 4:
                System.out.println("Item                         Large SDCA Official Red Shirt");
                call = 1;
                price = 550;
                
                break;
            case 5:
                System.out.println("Item                         Extra Large SDCA Official Red Shirt");
                call = 1;
                price = 550;
                
                break;
            case 6: 
                System.out.println("Item                         2XL SDCA Official Red Shirt ");
                call = 1;
                price = 600;
                
               break;
            case 7:
                System.out.println("Item                         3XL SDCA Official Red Shirt");
                call = 1;
                price = 600;
                break;
            case 8:
                System.out.println("Item                         4XL SDCA Official Red Shirt");
                call = 1;
                price = 700;
                break;
            case 9:
                System.out.println("Item                         5XL SDCA Official Red Shirt");
                call = 1;
                price = 750;
                break;
            case 10:
                hed.higher();
                break;
            default:
                sizesnashsdcared();
                break;
        }
                
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        quantity = quantity + call;
        System.out.println("Total amount: "+total);
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String redsige = sc.nextLine();
        if(redsige.equals("y")||redsige.equals("Y")){
            hed.quantity5 = quantity;
            hed.total5 = total;
            hed.sihtm();
        }
        else{
            hed.sihtmpay();
      }
         
     }
      public void sizescmcsblouse(){
        //women's blouse w slacks
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
        
        switch(item){
        
            case 1: 
                System.out.println("Item                  Small Women's Blouse w Slacks");
                call = 1;
                price = 1600;
                break;
            case 2:
                System.out.println("Item                  Medium Women's Blouse w Slacks");
                call = 1;
                price = 1630;
                break;
            case 3: 
                System.out.println("Item                  Large Women's Blouse w Slacks");
                call = 1;
                price = 1670;
                break;
            case 4:
                System.out.println("Item                  Extra Large Women's Blouse w Slacks");
                call = 1;
                price = 1690;
                break;
           
            case 5:
                hed.scmcs();
                break;
                
            default:
                sizescmcsblouse();
                break;
        }
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        quantity = quantity + call;
        System.out.println("Total amount: "+total);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String ge = sc.nextLine();
        if(ge.equals("y")||ge.equals("Y")){
            hed.total4 = total;
            hed.quantity4 = quantity;
            hed.scmcs();
        }
        else{
            hed.scmcspay();
        }
        
    }
      public void sizescmcspolo(){
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
        
        switch(item){
        
            case 1: 
                System.out.println("Item                  Small Men's Polo w Slacks");
                call = 1;
                price = 1500;
                break;
              
            case 2:
                System.out.println("Item                  Medium Men's Polo w Slacks");
                call = 1;
                price = 1500;
                break;
            case 3: 
                System.out.println("Item                  Large Men's Polo w Slacks");
                call = 1;
                price = 1560;
                break;
            case 4:
                System.out.println("Item                  Extra Large Men's Polo w Slacks");
                call = 1;
                price = 1600;
                break;
           
            case 5:
                hed.scmcs();
                break;
                
            default:
                sizescmcspolo();
                break;
        }
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        quantity = quantity + call;
        System.out.println("Total amount: "+total);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String gesi = sc.nextLine();
        if(gesi.equals("y")||gesi.equals("Y")){
            hed.total4 = total;
            hed.quantity4 = quantity;
            hed.scmcs();
        }
        else{
            hed.scmcspay();
        }
        
    }
      public void sizeshitmbluish(){
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
        
        switch(item){                       
        
            case 1: 
                System.out.println("Item                  Small Women's Corporate Bluish Top and Bluish Skirt");
                call = 1;
                price = 2200;
                
                break;
              
            case 2:
                System.out.println("Item                  Medium Women's Corporate Bluish Top and Bluish Skirt");
                call = 1;
                price = 2500;
                break;
            case 3: 
                System.out.println("Item                  Large Women's Corporate Bluish Top and Bluish Skirt");
                call = 1;
                price = 2650;
                break;
            case 4:
                System.out.println("Item                  Extra Large Women's Corporate Bluish Top and Bluish Skirt");
                call = 1;
                price = 2950;
                break;
           
            case 5:
                hed.higher();
                break;
                
            default:
                sizeshitmbluish();
                break;
        }
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        quantity = quantity + call;
        total = total + price;
        System.out.println("Total amount: "+total);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String ge = sc.nextLine();
        if(ge.equals("y")||ge.equals("Y")){
            hed.quantity5 = quantity;
            hed.total5 = total;
            hed.sihtm();
        }
        else{
            hed.sihtmpay();
        }
        
    }
      public void sizeshitmmenbluish(){
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
        
        switch(item){
        
            case 1: 
                System.out.println("Item                  Small Men's Corporate Bluish Top and Bluish Pants");
                call = 1;
                price = 2200;
                break;
            case 2:
                System.out.println("Item                  Medium Men's Corporate Bluish Top and Bluish Pants");
                call = 1;
                price = 2500;
                break;
            case 3: 
                System.out.println("Item                  Large Men's Corporate Bluish Top and Bluish Pants");
                call = 1;
                price = 2650;
                break;
            case 4:
                System.out.println("Item                  Extra Large Men's Corporate Bluish Top and Bluish Pants");
                call = 1;
                price = 2950;
                break;
           
            case 5:
                hed.higher();
                break;
                
            default:
                sizeshitmmenbluish();
                break;
        }
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        quantity = quantity + call;
        System.out.println("Total amount: "+total);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String gelang = sc.nextLine();
        if(gelang.equals("y")||gelang.equals("Y")){
            hed.total5 = total;
            hed.quantity5 = quantity;
            hed.sihtm();
        }
        else{
            hed.sihtmpay();
        }
    }
    
}












