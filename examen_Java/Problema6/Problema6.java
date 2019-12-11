import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Problema6 {
	public static List<City> ciudades = new ArrayList<>();
	public static void main(String[] args) throws SQLException, IOException{
		Connection connection = Problema6Connector.getConnection();		
		FileWriter fw=new FileWriter("C:\\Users\\javo_\\Downloads\\OneDrive_2019-12-11\\Java Advanced with Examples\\AdvancedJava-master\\jdbc\\src\\City.txt");
	    BufferedWriter bw=new BufferedWriter(fw);
		String sql = "Select * from city";
		
		Statement stm = null;
		
		stm = connection.createStatement();
		
		ResultSet rs = stm.executeQuery(sql);
		int ban = 1;
		
		while(rs.next()) {
			City ct = new City();
			ct.setCity_id(rs.getString("city_id"));
			ct.setDescription(rs.getString("description"));
			ct.setState_id(rs.getString("state_id"));

			
			System.out.println("city_id"+ban + " = "+rs.getString("city_id"));
			System.out.println("description"+ban + " = "+rs.getString("description"));
			System.out.println("state_id"+ban + " = "+rs.getString("state_id"));
			
			ciudades.add(ct);
			ban++;
			
		       bw.write(rs.getString("city_id") + " "+ rs.getString("description") + " " + rs.getString("state_id"));
		       bw.newLine();
			

        }
		//System.out.println(Arrays.toString(ciudades.toArray()));
        //System.out.println(ciudades.size());       
       
		bw.flush();
       connection.close();
       

	}
	
}