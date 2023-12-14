package com.mycompany.studentkiosksystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.time.LocalDate;

import java.sql.Date;
import java.util.Scanner;

public class Database implements AccountInterface
{
    public Connection conn = null;

    public void connect(String database_name) {
        String database_url = "jdbc:sqlite:C:\\Users\\Winmri\\Documents\\NetBeansProjects\\StudentKioskSystem\\src\\main\\java\\com\\mycompany\\studentkiosksystem\\" + database_name;

        try {
            this.conn = DriverManager.getConnection(database_url);

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void executeStatement(String sql) {
        try {
            Statement stmt = this.conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public ResultSet executeSearch(String sql) {
        try {
            Statement stmt = this.conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            return result;

        } catch (SQLException e) {
            System.out.println(e);
            ResultSet result = null;
            return result;
        }
    }

    public void loopThroughResultSet(ResultSet resultSet) {
        try {
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (resultSet.next()) {
                System.out.println("Row:");

                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    Object columnValue = resultSet.getObject(i);

                    System.out.println("  " + columnName + ": " + columnValue);
                }

                System.out.println(); // Separate rows with an empty line
            }
        } catch (SQLException e) {
            System.out.println("Error while looping through ResultSet: " + e.getMessage());
        }
    }

    public String replaceWildcards(String query, String... keyValues) {
        if (keyValues.length % 2 != 0) {
            throw new IllegalArgumentException("Number of key-value pairs must be even.");
        }

        for (int i = 0; i < keyValues.length; i += 2) {
            String wildcard = keyValues[i];
            String replacement = keyValues[i + 1];
            query = query.replace(wildcard, replacement);
        }
        return query;
    }
    
    public boolean isExisting(String sql) throws SQLException{
  ResultSet result = executeSearch(sql);

  if(!result.isBeforeFirst())
  {
    return false;
  }
 
  else
  {
    return true; 
  }
  
}
    
    
    
    @Override
    public boolean logIn(String SN, String pass) throws SQLException
    {
       Scanner input = new Scanner(System.in);
     
        String sql = "SELECT * FROM studentInfo WHERE SN = '{SN}' AND Pass = '{pass}'";
        
        //System.out.println("\n\n================ STUDENT INFORMATION ================");
        String command = replaceWildcards(sql, "{SN}", SN, "{pass}", pass);
        
        boolean loginSuccess = isExisting(command);
        
        
        if(loginSuccess)
        {
            System.out.println("\n\t\t\t\tWELCOME TO OUR SYSTEM! ");
            return true;
        }
        
        else
        {
            System.out.println("\n\t\t\t   Incorrect SN or Password!");            
            return false;
        }
        
    
        
    }
   
    
    @Override
    public void createAccount()throws SQLException
    {
        //String sql = "";
        String sql = "INSERT INTO studentInfo (Fname, Lname, SN, Pass, levelofeduc) VALUES ('{fname}', '{lname}', '{SN}', '{pass}', '{levelofeduc}')";
        
        String fname, lname, levelofeduc, pass;
        String SN;
        
        Scanner sc= new Scanner (System.in);
        
        System.out.println("\n\n\t\t==================== REGISTRATION =====================");
        System.out.print("\n\t\t\t   Enter First Name: ");
        fname = sc.nextLine();
        
        System.out.print("\t\t\t   Enter Last Name: ");
        lname = sc.nextLine();
        
        System.out.print("\t\t\t   Enter Student Number: ");
        SN = sc.nextLine();
        
        System.out.print("\t\t\t   Enter Password: ");
        pass = sc.nextLine();
        
        System.out.print("\t\t\t   Enter Level of Education: ");
        levelofeduc = sc.nextLine();
        
        //replacewildcards para nakadefault yung studentInfo
        String command = replaceWildcards(sql, "{fname}", fname, "{lname}", lname, "{SN}", SN, "{pass}", pass, "{levelofeduc}", levelofeduc);
        
        System.out.println(command);
        
        executeStatement(command);
        
        Log login = new Log();
        login.loginna();
       }
    }
    
