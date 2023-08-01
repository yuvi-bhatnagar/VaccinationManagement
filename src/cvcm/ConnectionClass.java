/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvcm;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author yuvraj
 */
public class ConnectionClass {
    public Connection con;
    public void connect()
    {
        try
        {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=dbCVCM;encrypt=true;trustServerCertificate=true;integratedSecurity=true");
           System.out.println("connect");
                   
        }
        catch(Exception ex)
        {
         System.out.println("error in connection"+ex);
        }
    }
        public void disconnect()
        {
            try
            {
                con.close();
                System.out.print("disconect");
            }
            catch(Exception ex)
            {
                System.out.print("Error in disconnect"+ex);
            }
        }
            public static void main(String a[])
            {
                ConnectionClass cobj=new ConnectionClass();
                cobj.connect();
                cobj.disconnect();
            }
                 
    
}
