package repository.System.DataAccess.MySql;

import java.io.IOException;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.BitSet;
import java.util.List;
import org.sql2o.Sql2o;
import domain.System.BusinessEntity.Base.Clothingline;
import domain.System.BusinessEntity.Base.Imagen;
import infrastructure.System.Adapters.EntityDBConnection;
import infrastructure.System.Adapters.MySqlAdapter;

public class ImagenDa {

    public  static List<Imagen> list() 
    {
   	 List<Imagen> result= null;
    	try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} 
    	try {
			EntityDBConnection conne= MySqlAdapter.getConnectionString();
			 Sql2o sql2o = new Sql2o(conne.getUrl(), conne.getUser(), conne.getPassword());
	          String sql ="select * from gamachicas.Imagen  where idimagen = :idimagen;";
	          try (org.sql2o.Connection con =  sql2o.open()){
	        	     result = con
	        	            .createQuery(sql)
	        	            .addParameter("idimagen", 21)
	        	            .executeAndFetch(Imagen.class);
	        	  
	          }
			return result;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return result;
    }
}
