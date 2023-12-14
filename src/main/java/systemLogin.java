
import com.mycompany.studentkiosksystem.Log_in;
import com.mycompany.studentkiosksystem.Log_in.Registration;
import java.util.Scanner;

public class systemLogin 

{
    public static void main(String[] args) 
    {
        Scanner scanner= new Scanner(System.in);
        
        Log_in currentUser = null;
        
        
        while(true){
            System.out.println("[1] Login");
            System.out.println("[2] Register");
            System.out.println("[3] Exit");
            
            System.out.println("Your Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter your username: ");
                    String loginUsername = scanner.nextLine();
                    
                    System.out.println("Enter your Password: ");
                    String loginPassword = scanner.nextLine();
                    
                    if(currentUser != null && loginUsername.equals(currentUser.getUsername())&& loginPassword.equals(currentUser.getPassword()))
                            {
                                System.out.println("Login Successful! Welcome to the Business Center, "+currentUser.getUsername()+"!");
                            }
                    else{
                        System.out.println("Invalid Username or Password. Please try again later.");
                    }
                    break;
                    
                case 2:
                    currentUser = Registration.registerUser();
                    System.out.println("Registration Successful!" +currentUser.getUsername()+"!");
                    break;
                    
                case 3:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid Choice.Please enter a valid option again.");
                    break;
                    
                
            }
        }
    }
}
