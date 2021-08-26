package spring.testmysql;
import java.sql.*;

public class connection 
{
	public static void main(String[] args)
	{
		Connection con = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://ip";
			
			con = DriverManager.getConnection(url, "user", "password");
			System.out.println("연결 성공");
		}
		
		catch(ClassNotFoundException e)
		{
			System.out.println("드라이버 로딩 실패");
	    }
		
	    catch(SQLException e)
		{
	    	System.out.println("에러: " + e);
	    }
		
	    finally
	    {
	    	try
	    	{
	    		if( con != null && !con.isClosed())
	    		{
	    			con.close();
	            }
	         }
	    	
	         catch( SQLException e)
	    	{
	        	 e.printStackTrace();
	        }
	    }
		
		System.out.println("test finish");
	}
}
