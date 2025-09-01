package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub {
		    Class.forName("com.mysql.jdbc.Driver");
		    
				Scanner sc=new Scanner(System.in);
				String user_name="root";
				String password="Sinchana@26";
				String url="jdbc:mysql://localhost:3306/SCEM_DB";
				
				Connection con=DriverManager.getConnection(url,user_name,password);
                Statement st=con.createStatement();
				System.out.println("Data Before Transaction:");
                System.out.println("................");
                ResultSet rs=st.executeQuery("select * from Student");
                while(rs.next())
                {
                	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
                }
                System.out.println("Transaction Begins:");
                con.setAutoCommit(false);
                st.executeUpdate("update Student set amount=amount-500 where id=111");
                st.executeUpdate("update Student set amount=amount+500 where id=222");
                
                System.out.println("Can yoou please confirm your transaction: yes/no");
                String choice=sc.next();
                if(choice.equalsIgnoreCase("yes"))
                {
                	con.commit();
                	System.out.println("Transactionsuccessfull");
                }
                else {
                	con.rollback();
                	System.out.println("Transaction ffailed");
                }
                System.out.println("Data after transaction");
                System.out.println("-------------------");
                ResultSet rs2=st.executeQuery("select * from Student");
                while(rs2.next())
                {
                	System.out.println(rs2.getInt(1)+" "+rs2.getString(2)+" "+rs2.getInt(3));
                }
                	
                
	}

}
