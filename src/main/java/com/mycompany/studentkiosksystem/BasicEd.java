//mga kulang nalang
//alignment
//smls higher ed
//price sa snashs
//design

package com.mycompany.studentkiosksystem;
import java.util.Scanner;
import java.util.Random;

public class BasicEd {
   public  String tara;
   public int item;
   public int price;
   public int total;
   public String call;
    
   
    public BasicEd(){
    tara = "";
    item = 0;
    price = 0;
    total = 0;
    
    
}
    
    Scanner input = new Scanner(System.in);
    public void Select()
    {
    System.out.println("Student Kiosk: Business Center");
    System.out.println("\n[1] Basic Education ");
    System.out.println("[2] Senior High School ");
    System.out.println("[3] Higher Education ");
    System.out.println("[4] Logout");
    System.out.print("\nEnter here: ");
    item = input.nextInt();
    
    
    switch(item){
        //basic education
        case 1: 
            BasicEducation();
               
            //senior high school
       case 2: 
            Senior();
            
            //higher education
       case 3: 
          HigherEducation();
       case 4:
           break;
    }
   }
    public void BasicEducation(){
       
       
        System.out.print("\nBasic Education");
        System.out.println("\n\nAvailable Items: ");
        System.out.print("[1] Blouse w Skirt ");
        System.out.print("\t[6] Polo w Slacks ");
        System.out.print("\n[2] Belt ");
        System.out.print("\t\t[7] Scarf ");
        System.out.print("\n[3] Ribbon ");
        System.out.print("\t\t[8] Neck Tie ");
        System.out.print("\n[4] Women's Vest ");
        System.out.print("\t[9] Back/Return ");
        System.out.print("\n[5] PE Uniform ");
       
        System.out.print("\n\nChoose an Option: ");
        item = input.nextInt();
        
        switch(item){
        
        case 1:
            System.out.println("\nItem                  Blouse w Skirt Set");
            
            size1();
        case 2: 
            System.out.println("\nItem                  Belt");
            call = "Belt";

            price = 150;
            break;
        
        
        case 3: 
            System.out.println("\nItem                  Ribbon");
            call = "Ribbon";
            price = 200;
            
            break;
        case 4: 
            System.out.println("\nItem                  Women's Vest");
            call = "Women's Vest";
            price = 300;
            
            break;
        
        case 5: 
            System.out.println("\nItem                  PE Uniform");
            pesize();
            break;
        case 6:
            System.out.println("\nItem                  Polo w Slacks");
            size1();
            break;
        case 7: 
            System.out.println("\nItem                  Scarf");
            call = "Scarf";
            price = 180;
            break;                 
        case 8: 
            System.out.println("\nItem                  Necktie");
            call = "Necktie";
            price = 280; 
            break;
        case 9:
            Select();
            break;
        default:
            BasicEducation();
            break;
        }
        
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        System.out.println("Total amount:\t      "+total);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        tara = sc.nextLine();
        if(tara.equals("y")||tara.equals("Y"))
        {
            BasicEducation();
        }
        else
        {
            //price = total;
            payment();
        }
       
    
    }
  public void Senior(){
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
        
        switch(item){
        
        case 1: 
            
            System.out.println("Item                  Women's Blouse w Skirt");
            size2f();
        case 2: 
            System.out.println("Item                  Women's Scarf");
            price = 250;
            call = "Women's Scarf";
            break;      
        case 3: 
            System.out.println("Item                  Women's Vest");
            price = 300;       
            call = "Women's Vest";
            break;
        case 4: 
            System.out.println("Item                  Women's Ribbon");
            price = 250;
            call = "Women's Ribbon";
            break;
        
        case 5: 
            System.out.println("Item                  Men's Polo Top w Pants");
            size2m();
            break;
        case 6:
            System.out.println("Item                  Men's Necktie");
            price = 280;
            call = "Men's Necktie";
            break;
        case 7: 
            System.out.println("PE Uniform");
            pesize();
            break;
        case 8:
            Select();
            break;
        default: 
            Senior();
            break;
        }
        
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        System.out.println("Total amount: "+total);
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String gege = sc.nextLine();
        if(gege.equals("y")||gege.equals("Y")){
            Senior();
        }
        else{
            payment();
        }
       
    
  }
     public void sase(){
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
        switch(item){
        
        case 1: 
            System.out.println("Item                  Women's Blouse w Slacks");
            scmcssize();
            break;
        case 2: 
            System.out.println("Item                  Women's Scarf");
            call = "Women's Scarf";
            price = 250;
            break;
            
        case 3: 
            System.out.println("Item                  Women's Belt");
            call = "Women's Belt";
            price = 200;
      
            break;
        case 4: 
            System.out.println("Item                  Men's Polo w Slacks");
            scmcssizem();
            break;
        
        case 5: 
            System.out.println("Item                  Men's Necktie");
            call = "Men's Necktie";
            price = 280;
            break;
        case 6:
            System.out.println("Item                  SDCA Red Shirt");
            sdcared();
            
            break;
        case 7: 
            System.out.println("Item                  PE Uniform");
            pesize();
            break;
        case 8: 
            HigherEducation();
            break;
        default: 
            sase();
            break;
     }
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        System.out.println("Total amount: "+total);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String gg = sc.nextLine();
        if(gg.equals("y")||gg.equals("Y")){
            sase();
        }
        else{
            payment();
        }
    }
    public void sihtm(){
        System.out.print("\n\n[1] Women's Corporate Bluish Top and Skirt");
        System.out.print("\t\t[5] PE Uniform");
        System.out.print("\n[2] Women's Blazer");
        System.out.print("\t\t\t\t\t[6] SDCA Red Shirt");
        System.out.print("\n[3] Men's Corporate Bluish Top and Pants");
        System.out.print("\t\t[7] Back/Return");
        System.out.print("\n[4] Men's Vest");
        
      
        
        System.out.print("\n\nEnter here: ");
        item  = input.nextInt();
        switch(item){
            case 1: 
                System.out.println("Women's Corporate Bluish Top and Skirt");
                sizeshitm();
                break;
            case 2:
                System.out.println("Women's Blazer");
                call ="Women's Blazer";
                price = 350;
                break;
            case 3:
                System.out.println("Men's Corporate Bluish Top and Pants");
                sihtmM();
                break;
            case 4: 
                System.out.println("Men's Vest");
                call = "Men's Vest";
                price = 300;
                break;
            case 5: 
                System.out.println("PE Uniform");
                pesize();
                break;
            case 6:
                sdcared();
                break;
            case 7:
                HigherEducation();
            default: 
                sihtm();
                break;
        }
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        System.out.println("Total amount: "+total);
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String lezgo = sc.nextLine();
        if(lezgo.equals("y")||lezgo.equals("Y"))
        {
            sihtm();
        }
        else
        {
            payment();
        }
    }
    
    public void sizeshitm(){
        //size for bluish
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
                call = "Small Women's Corporate Bluish Top and Bluish Skirt";
                price = 2200;
                
                break;
              
            case 2:
                System.out.println("Item                  Medium Women's Corporate Bluish Top and Bluish Skirt");
                call = "Medium Women's Corporate Bluish Top and Bluish Skirt";
                price = 2500;
                break;
            case 3: 
                System.out.println("Item                  Large Women's Corporate Bluish Top and Bluish Skirt");
                call = "Large Women's Corporate Bluish Top and Bluish Skirt";
                price = 2650;
                break;
            case 4:
                System.out.println("Item                  Extra Large Women's Corporate Bluish Top and Bluish Skirt");
                call = "Extra Large Women's Corporate Bluish Top and Bluish Skirt";
                price = 2950;
                break;
           
            case 5:
                HigherEducation();
                break;
                
            default:
                sihtm();
                break;
        }
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        System.out.println("Total amount: "+total);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String ge = sc.nextLine();
        if(ge.equals("y")||ge.equals("Y")){
            HigherEducation();
        }
        else{
            payment();
        }
        
    }
    public void sihtmM(){
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
                call = "Extra Large Men's Corporate Bluish Top and Bluish Pants";
                price = 2200;
                break;
            case 2:
                System.out.println("Item                  Medium Men's Corporate Bluish Top and Bluish Pants");
                call = "Medium Men's Corporate Bluish Top and Bluish Pants";
                price = 2500;
                break;
            case 3: 
                System.out.println("Item                  Large Men's Corporate Bluish Top and Bluish Pants");
                call = "Large Men's Corporate Bluish Top and Bluish Pants";
                price = 2650;
                break;
            case 4:
                System.out.println("Item                  Extra Large Men's Corporate Bluish Top and Bluish Pants");
                call = "Extra Large Men's Corporate Bluish Top and Bluish Pants";
                price = 2950;
                break;
           
            case 5:
                HigherEducation();
                break;
                
            default:
                sihtm();
                break;
        }
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        System.out.println("Total amount: "+total);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String gelang = sc.nextLine();
        if(gelang.equals("y")||gelang.equals("Y")){
            HigherEducation();
        }
        else{
            payment();
        }
    }
    public void scmcs(){
        
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
        switch(item){
        case 1: 
            System.out.println("Item                  Women's Blouse w Slacks");
            scmcssize();
            break;
        case 2: 
            System.out.println("Item                  Women's Scarf");
            call = "Women's Scarf";
            price = 250;
            break;
        case 3: 
            System.out.println("Item                  Women's Belt");
            call = "Women's Belt";
            price = 200;
      
            break;
        case 4: 
            System.out.println("Item                  Men's Polo w Slacks");
            scmcssizem();
            break;
        
        case 5: 
            System.out.println("Item                  Men's Necktie");
            call = "Men's Necktie";
            price = 280;
            break;
        case 6:
            System.out.println("Item                  SDCA Red Shirt");
            sdcared();
            
            break;
        case 7: 
            System.out.println("Item                  PE Uniform");
            pesize();
            break;
        case 8: 
            HigherEducation();
            break;
        default: 
            scmcs();
            break;
     }
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        System.out.println("Total amount: "+total);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String gesige = sc.nextLine();
        if(gesige.equals("y")||gesige.equals("Y")){
            scmcs();
        }
        else{
            payment();
        }
    }
    public void scmcssize(){
        //women's blouse w slacks
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
                call = "Small Women's Blouse w Slacks";
                price = 1600;
                break;
            case 2:
                System.out.println("Item                  Medium Women's Blouse w Slacks");
                call = "Medium Women's Blouse w Slacks";
                price = 1630;
                break;
            case 3: 
                System.out.println("Item                  Large Women's Blouse w Slacks");
                call = "Large Women's Blouse w Slacks";
                price = 1670;
                break;
            case 4:
                System.out.println("Item                  Extra Large Women's Blouse w Slacks");
                call = "Extra Large Women's Blouse w Slacks";
                price = 1690;
                break;
           
            case 5:
                scmcs();
                break;
                
            default:
                scmcssize();
                break;
        }
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        System.out.println("Total amount: "+total);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String ge = sc.nextLine();
        if(ge.equals("y")||ge.equals("Y")){
            HigherEducation();
        }
        else{
            payment();
        }
        
    }
    public void scmcssizem(){
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
                call = "Small Men's Polo w Slacks";
                price = 1500;
                break;
              
            case 2:
                System.out.println("Item                  Medium Men's Polo w Slacks");
                call = "Medium Men's Polo w Slacks";
                price = 1500;
                break;
            case 3: 
                System.out.println("Item                  Large Men's Polo w Slacks");
                call = "Large Men's Polo w Slacks";
                price = 1560;
                break;
            case 4:
                System.out.println("Item                  Extra Large Men's Polo w Slacks");
                call = "Extra Large Men's Polo w Slacks";
                price = 1600;
                break;
           
            case 5:
                scmcs();
                break;
                
            default:
                scmcssizem();
                break;
        }
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        System.out.println("Total amount: "+total);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String gesi = sc.nextLine();
        if(gesi.equals("y")||gesi.equals("Y")){
            scmcs();
        }
        else{
            payment();
        }
        
    }
    public void snashs(){
        System.out.print("\n[1]Scrub Top w Pants");
        System.out.print("\t\t\t[5]SDCA Red Shirt ");
        System.out.print("\n[2]Green Nursing Uniform Coat");
        System.out.print("\t\t[6]PE Uniform ");

        System.out.print("\n[3]Laboratory Coat ");
        System.out.print("\t\t\t[7]Back/Return");

        System.out.print("\n[4]Nurse's Cap");
        
       
        
         System.out.print("\n\nEnter: ");
         item = input.nextInt();
        switch(item){
        
        case 1: 
            System.out.println("Item                  Scrub Top w Pants");          
            snashsscrub();
            break;
        case 2: 
            System.out.println("Item                  Green Nursing Uniform Coat");           
            snashsgreen();
            break;           
        case 3: 
            System.out.println("Item                  Laboratory White Coat");
            snashslab();
            break;
        case 4: 
            System.out.println("Item                  Nurse's Cap");
            call = "Nurse's Cap";
            price = 250;
            break;       
        case 5: 
            System.out.println("Item                  SDCA Red Shirt");
            sdcared();
            
            break;
        case 6:
            System.out.println("Item                  PE Uniform");
            pesize();
            break;
        case 7: 
            HigherEducation();
            break;
        default: 
            snashs();
            break;
     }
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        System.out.println("Total amount: "+total);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String gegeg = sc.nextLine();
        if(gegeg.equals("y")||gegeg.equals("Y")){
            snashs();
        }
        else{
            payment();
        }
    }
    public void snashsscrub(){
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
                call = "Small Scrub Top w Pants";
                price = 1370;
                break;
              
            case 2:
                System.out.println("Item                         Extra Small Scrub Top w Pants");
                call = "Extra Small Scrub Top w Pants";
                price = 1370;
                break;
            case 3: 
                System.out.println("Item                         Medium Scrub Top w Pants ");
                call = "Medium Scrub Top w Pants";
                price = 1370;
                break;
            case 4:
                System.out.println("Item                         Large Scrub Top w Pants");
                call = "Large Scrub Top w Pants";
                price = 1370;
                break;
            case 5:
                System.out.println("Item                         Extra Large Scrub Top w Pants");
                call = "XL Scrub Top w Pants";
                price = 1370;
                break;
            case 6: 
                System.out.println("Item                         2XL Scrub Top w Pants ");
                call = "2XL Scrub Top w Pants";
                price = 1560;
                
               break;
            case 7:
                System.out.println("Item                         3XL Scrub Top w Pants");
                call = "3XL Scrub Top w Pants";
                price = 1560;
                break;
            case 8:
                System.out.println("Item                         4XL Scrub Top w Pants");
                call = "4XL Scrub Top w Pants";
                price = 1560;
                break;
            case 9:
                System.out.println("Item                         5XL Scrub Top w Pants");
                call = "5XL Scrub Top w Pants";
                price = 1560;
                break;
            case 10:
                
                Senior();
                break;
            default:
                size2f();
                break;
        }
                
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        System.out.println("Total amount: "+total);
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String gesig = sc.nextLine();
        if(gesig.equals("y")||gesig.equals("Y")){
            snashs();
        }
        else{
            payment();
      }
      }
    public void snashsgreen(){
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
                call = "Small Green Nursing Uniform Set";
                price = 1500;
                
                break;
              
            case 2:
                System.out.println("Item                  Medium Green Nursing Uniform Coat");
                call = "Medium Green Nursing Uniform Set";
                price = 1500;
                
                break;
            case 3: 
                System.out.println("Item                  Large Green Nursing Uniform Coat");
                call = "Large Green Nursing Uniform Set";
                price = 1560;
                break;
            case 4:
                System.out.println("Item                  Extra Large Green Nursing Uniform Coat");
                call = "Extra Large Green Nursing Uniform Set";
                price = 1600;
                break;
           
            case 5:
                snashs();
                break;
                
            default:
                snashsgreen();
                break;
        }
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        System.out.println("Total amount: "+total);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String letgo = sc.nextLine();
        if(letgo.equals("y")||letgo.equals("Y")){
            snashs();
        }
        else{
            payment();
        }
        
}
    public void snashslab(){
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
                call = "Small Laboratory White Coat";
                price = 1500;
                
                break;
              
            case 2:
                System.out.println("Item                  Medium Laboratory White Coat");
                call = "Medium Laboratory White Coat";
                price = 1500;
                
                break;
            case 3: 
                System.out.println("Item                  Large Laboratory White Coat");
                call = "Large Laboratory White Coat";
                price = 1560;
                
                break;
            case 4:
                System.out.println("Item                  Extra Large Laboratory White Coat");
                call = "Extra Large Laboratory White Coat";
                price = 1600;
                break;
           
            case 5:
                snashs();
                break;
                
            default:
                snashslab();
                break;
        }
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        System.out.println("Total amount: "+total);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String letsgo = sc.nextLine();
        if(letsgo.equals("y")||letsgo.equals("Y")){
            scmcs();
        }
        else{
            payment();
        }
        
}
     public void sdcared(){
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
                call = "Small SDCA Official Red Shirt";
                price = 500;
                break;
              
            case 2:
                System.out.println("Item                         Extra Small SDCA Official Red Shirt");
                call = "Extra Small SDCA Official Red Shirt";
                price = 500;
                break;
            case 3: 
                System.out.println("Item                         Medium SDCA Official Red Shirt");
                call = "Medium SDCA Official Red Shirt";
                price = 500;
                break;
            case 4:
                System.out.println("Item                         Large SDCA Official Red Shirt");
                call = "Large SDCA Official Red Shirt";
                price = 550;
                
                break;
            case 5:
                System.out.println("Item                         Extra Large SDCA Official Red Shirt");
                call = "XL SDCA Official Red Shirt";
                price = 550;
                
                break;
            case 6: 
                System.out.println("Item                         2XL SDCA Official Red Shirt ");
                call = "3XL SDCA Official Red Shirt";
                price = 600;
                
               break;
            case 7:
                System.out.println("Item                         3XL SDCA Official Red Shirt");
                call = "3XL SDCA Official Red Shirt";
                price = 600;
                break;
            case 8:
                System.out.println("Item                         4XL SDCA Official Red Shirt");
                call = "4XL SDCA Official Red Shirt";
                price = 700;
                break;
            case 9:
                System.out.println("Item                         5XL SDCA Official Red Shirt");
                call = "5XL SDCA Official Red Shirt";
                price = 750;
                break;
            case 10:
                Senior();
                break;
            default:
                size2f();
                break;
        }
                
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        System.out.println("Total amount: "+total);
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String redsige = sc.nextLine();
        if(redsige.equals("y")||redsige.equals("Y")){
            Select();
        }
        else{
            payment();
      }
         
     }
    
      public void pesize(){
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
                  call = "Extra Small PE Uniform";
                  break;
              case 2: 
                  System.out.println("Item                   Small PE Uniform");
                  call = "Small PE Uniform";
                  price = 1105;
                  break;
              case 3: 
                  System.out.println("Item                   Medium PE Uniform");
                  call = "Medium PE Uniform";
                  price = 1105;
                  break;
              case 4: 
                  System.out.println("Item                   Large PE Uniform");
                  call = "Large PE Uniform";
                  price = 1130;
                  break;
              case 5:
                  System.out.println("Item                   Extra Large PE Uniform");
                  price = 1150;
                  call = "Extra Large PE Uniform";
                  break;
              case 6: 
                  System.out.println("Item                   2XL PE Uniform");
                  price = 1250;
                  call = "2XL PE Uniform";
                  break;
              case 7: 
                  Select();
                  break;
              default:
                  pesize();
                  break;
          }          
        System.out.println("Price                  "+price);
        System.out.println("--------------------------------");
        total = total + price;
        System.out.println("Total amount: "+total);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String gsige = sc.nextLine();
        if(gsige.equals("y")||gsige.equals("Y")){
            Select();
        }
        else{
            payment();
          
        }
          }
      
      public void size2f(){
        //shs size blouse
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
        System.out.print("\n\nEnter Size: ");
        item = input.nextInt();
        
        switch(item){
        
            case 1: 
                System.out.println("Item                         Small Women's Blouse w Skirt Set Small");
                call ="Small Women's Blouse w Skirt Set ";
                price = 1370;
                break;
              
            case 2:
                System.out.println("Item                         Extra Small Women's Blouse w Skirt Set");
                call ="Extra Small Women's Blouse w Skirt Set ";
                price = 1370;
                payment();
                break;
            case 3: 
                System.out.println("Item                         Medium Women's Blouse w Skirt Set");
                call ="Medium Women's Blouse w Skirt Set ";
                price = 1370;
                break;
            case 4:
                System.out.println("Item                         Large Women's Blouse w Skirt Set");
                call ="Large Women's Blouse w Skirt Set ";
                price = 1370;
                
                break;
            case 5:
                System.out.println("Item                         Extra Large Women's Blouse w Skirt Set");
                call ="XL Women's Blouse w Skirt Set ";
                price = 1370;
                
                break;
            case 6: 
                System.out.println("Item                         2XL Women's Blouse w Skirt Set");
                call ="2XL Women's Blouse w Skirt Set ";
                price = 1560;
                
               break;
            case 7:
                System.out.println("Item                         3XL Women's Blouse w Skirt Set");
                call ="3XL Women's Blouse w Skirt Set ";
                price = 1560;
                break;
            case 8:
                System.out.println("Item                         4XL Women's Blouse w Skirt Set");
                call ="4XL Women's Blouse w Skirt Set";
                price = 1560;
                break;
            case 9:
                System.out.println("Item                         5XL Women's Blouse w Skirt Set");
                call ="5XL Women's Blouse w Skirt Set ";
                price = 1560;
                break;
            case 10:
                
                Senior();
                break;
            default:
                size2f();
                break;
        }
                
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        System.out.println("Total amount: "+total);
        Scanner sc = new Scanner(System.in);
        System.out.println("Add another? (y/n) : ");
        String sige = sc.nextLine();
        if(sige.equals("y")){
            Senior();
        }
        else{
            payment();
      }
      }
      
      public void size2m(){
          //senior high male polo w pants
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
                System.out.println("Item                   Small  Polo w Pants set");
                call ="Small Polo w Pants set ";
                price = 1500;
                payment();
                break;
              
            case 2:
                System.out.println("Item                    Extra Small Polo w Pants set");
                call ="Extra Small Polo w Pants set ";
                price = 1500;
                break;
            case 3: 
                System.out.println("Item                    Polo w Pants set Medium ");
                call ="Medium Polo w Pants set";
                price = 1500;
                break;
            case 4:
                System.out.println("Item                    Large Polo w Pants set");
                call ="Large Polo w Pants set ";
                price = 1500;
                break;
            case 5:
                System.out.println("Item                    Large Polo w Pants set");
                call ="Large Polo w Pants set ";
                price = 1500;
                break;
            case 6: 
                System.out.println("Item                    2XL Polo w Pants set");
                call ="2XL Polo w Pants set ";
                price = 1700;
               break;
            case 7:
                System.out.println("Item                    3XL Polo w Pants set");
                call = "3XL Polo w Pants set";
                price = 1700;
                break;
                
            case 8:
                System.out.println("Item                    4XL Polo w Pants set");
                call = "4XL Polo w Pants set";
                price = 1700;
                break;
            case 9:
                System.out.println("Item                    5XL Polo w Pants set");
                call = "5XL Polo w Pants set";
                price = 1700;
                break;
            case 10:
                Senior();
                break;
            default:
                size2m();
                break;
        } 
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        System.out.println("Total amount: "+total);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Another? (y/n) : ");
        String rsige = sc.nextLine();
        if(rsige.equals("y")||rsige.equals("Y")){
            Senior();
        }
        else{
            payment();
        
      }
                
        }
        public void size1(){
          //size for basic education
          //blouse
        System.out.print("\n[1]Small");
        System.out.print("\t\t[6]2xl");
        System.out.print("\n[2]Extra Small");
        System.out.print("\t\t[7]3xl");
        System.out.print("\n[3]Medium");
        System.out.print("\t\t[8]4xl");
        System.out.print("\n[4]Large");
        System.out.print("\t\t[9]5xl");
        System.out.print("\n[5]Extra Large");
        System.out.print("\t\t[10]Back/Return");
        System.out.print("\n\nEnter Size: ");
        item = input.nextInt();
        
        switch(item){
        
            case 1: 
                System.out.println("Item\t\t\tSmall Blouse w Skirt Set");
                call = "Small Blouse w Skirt Set";
                price = 1200;
                
                break;
              
            case 2:
                System.out.println("Item\t\t\tExtra Small Blouse w Skirt Set");
                call = "XS Blouse w Skirt Set";
                price = 1200;
                
                break;
            case 3: 
                System.out.println("Item\t\t\tMedium Blouse w Skirt Set");
                call = "Medium Blouse w Skirt Set";
                price = 1200;
                
                break;
            case 4:
                System.out.println("Item\t\t\tLarge Blouse w Skirt Set");
                call = "Large Blouse w Skirt Set";
                price = 1200;
                
                break;
            case 5:
                System.out.println("Item\t\t\tExtra Large Blouse w Skirt Set");
                call = "XL Blouse w Skirt Set";
                price = 1200;
                break;
            case 6: 
                System.out.println("Item\t\t\t2XL Blouse w Skirt Set");
                call = "2XL Blouse w Skirt Set";
                price = 1200;
               break;
            case 7:
                System.out.println("3Item\t\t\tXL Blouse w Skirt Set");
                call = "3XL Blouse w Skirt Set";
                price = 1260;
                break;
            case 8:
                System.out.println("Item\t\t\t4XL Blouse w Skirt Set");
                call = "4XL Blouse w Skirt Set";
                price = 1260;
              
                break;
            case 9:
                System.out.println("Item\t\t\t5XL Blouse w Skirt Set");
                call = "5XL Blouse w Skirt Set";
                price = 1260;
                
                break;
            case 10:
                BasicEducation();
                break;
            default:
                size1();
                break;
        }
        //case 
        System.out.println("Price                 "+price);
        System.out.println("--------------------------------");
        total = total + price;
        System.out.println("Total amount: "+total);
        Scanner sc = new Scanner(System.in);
        System.out.println("Continue? (y/n) : ");
        String g = sc.nextLine();
        if(g.equals("y")||g.equals("Y")){
            BasicEducation();
        }
        else{
            payment();
        }
      }
 public void payment(){
    
    
     
     
     System.out.println("\nCongratulations!");
     System.out.println("\nYour Transaction is Pre-Ordered.");
     System.out.println("Please Proceed to Cashier at Lobby Ground Floor");
     Random random = new Random();
     int num1;
    
    for(int i = 0; i<1; i++){
        num1 = random.nextInt(999999);
        
        System.out.println("and Continue by Paying with given code: "+num1);
        
    }
     System.out.println("\nItem \t\t\t\tPrice");
     System.out.print("\n"+call);
     System.out.print("\t\t\t\t"+total);
     
     
     
     System.out.println("");
     
     System.out.println("\n[1]Buy Another");
     System.out.println("[2]Exit ");
     
     System.out.print("\nEnter here: ");
     int items = input.nextInt();
     
     switch(items){
         case 1:
             total = 0;
             Select();
     
         case 2:
             System.exit(0);
             
     default: 
     System.exit(0);
 }

}
     public void HigherEducation(){
         System.out.print("\n[1]SASE");
         System.out.print("\t\t[4]SMLS");
         
         System.out.print("\n[2]SIHTM");
         System.out.print("\t[5]SNASHS");
         System.out.print("\n[3]SCMCS");
         
         
         System.out.print("\t[6]Back/Return");
         
         System.out.print("\n\nEnter here: ");
         item = input.nextInt();
         switch(item){
             case 1:
                 sase();
                 break;
             case 2:
                 sihtm();
                 break;
             case 3:
                 scmcs();
                 break;
             case 4:
                 snashs();
                 break;
             case 5:
                 Select();
                 break;             
     }
         
     }
     
}




