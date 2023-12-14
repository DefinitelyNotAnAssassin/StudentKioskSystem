
package com.mycompany.studentkiosksystem;

import java.sql.SQLException;


public interface AccountInterface 
{
    public void createAccount() throws SQLException;
    public abstract boolean logIn(String SN, String pass)throws SQLException; 
    
}
