package gm.sql;
import java.sql.*;
import java.util.Scanner;

public class Manipulation 
{

	public static void main(String[] args) 
	{
		Connection connection = null;
		Statement stSelect = null;
		Statement stResult = null;
		PreparedStatement psInsert = null;
		PreparedStatement psUpdate = null;
		PreparedStatement psDelete = null;
		PreparedStatement psSelect = null;
		PreparedStatement psCreate = null;
		
		ResultSet result = null;
		Scanner sc= new Scanner(System.in);
		

		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdatabase", "root", "admin");
			psInsert=connection.prepareStatement("insert into employee values(?,?)");
			psSelect=connection.prepareStatement("Select * from employee");
			psUpdate=connection.prepareStatement("update employee set name=? where registration_number=?");
			psCreate=connection.prepareStatement("create table ? (? (?) ?, ? ?)");
			/*
			 * stSelect=connection.createStatement();
			 * System.out.println("Enter the name :"); String name= sc.next();
			 * System.out.println("Enter the registration number"); int registration_number=
			 * sc.nextInt(); String sql =
			 * "insert into employee values('"+name+"','"+registration_number+"')";
			 * System.out.println(sql); stSelect.executeUpdate(sql);
			 */
			
			/*
			 * System.out.println("Enter the name :"); String name= sc.next();
			 * System.out.println("Enter the registration number"); int
			 * registration_number=sc.nextInt();
			 * 
			 * 
			 * 
			 * psInsert.clearParameters(); psInsert.setString(1, name); psInsert.setInt(2,
			 * registration_number); psInsert.executeUpdate();
			 */
			
			
			/*
			 * System.out.println("Enter the new name :"); String newName= sc.next();
			 * System.out.println("Enter the new registration number"); int
			 * new_registration_number=sc.nextInt();
			 * psUpdate.setInt(2,new_registration_number); psUpdate.setString(1,newName);
			 * psUpdate.executeUpdate();
			 */
			
			
			/*
			 * System.out.println("Enter the tablename"); String tablename=sc.next();
			 * psCreate.setString(1, tablename);
			 * 
			 * System.out.println("Enter the column name 1"); String teachername=sc.next();
			 * psCreate.setString(2, teachername);
			 * 
			 * System.out.println("Enter the teacher name datatype"); String
			 * teachernametype=sc.next(); psCreate.setString(3, teachernametype);
			 * 
			 * System.out.println("Enter the column name2"); String teacherid=sc.next();
			 * psCreate.setString(4, teacherid);
			 * 
			 * System.out.println("Enter the column size"); String teacheridsize=sc.next();
			 * psCreate.setString(5, teacheridsize);
			 * 
			 * psCreate.executeUpdate();
			 */
			
			
			result = psSelect.executeQuery();
				while(result.next())
				{
					System.out.println(result.getString("name"));
					System.out.println(result.getString("registration_number"));
				}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
