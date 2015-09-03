package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DatabaseInterface {
	
	private final String dataBaseName= "westshore.db";
	private final String boatTable="BOAT";
	private final String[] boatField={"ID","CUSTOMER","LOCATION","LENGTH", "BEAM","ISBILLED","DESCRIPTION","NAME","MAKE","HULL"};
	private final String dockTable="DOCK";
	private final String[] dockField={"ID","SPACES"};
	private final String fingerTable="FINGER";
	private final String[] fingerField={"ID","SIGNS","LENGTH", "SPACES"};
	private final String hydroTable="HYDRO";
	private final String[] hydroField={"ID","LOCATION","CONNECTIONS"};
	
	
	public void initialize(){
		setUp();
		String[] btypes={"INT","TEXT","TEXT","INT","INT","BOOLEAN","TEXT","TEXT","TEXT","TEXT"};
		createTable(this.boatTable,this.boatField,btypes);
		String[] dtypes={"INT","INT"};
		createTable(this.dockTable,this.dockField,dtypes);
		String[] ftypes={"INT","TEXT","INT","INT"};
		createTable(this.fingerTable,this.fingerField,ftypes);
		String[] htypes={"INT","TEXT","TEXT"};
		createTable(this.hydroTable,this.hydroField,htypes);
	}
	
	public void setUp(){
	  {
	    Connection c = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:"+this.dataBaseName);
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Opened database successfully");
	  }
	}
	
	
	public void createTable(String table, String[] fields, String[] types){
	Connection c = null;
    Statement stmt = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:"+this.dataBaseName);
      System.out.println("Opened database successfully");

      stmt = c.createStatement();
      String sql = "CREATE TABLE "+table;
      sql=sql+"("+fields[0]+" "+types[0]+" PRIMARY KEY NOT NULL";
      for(int i=1;i<fields.length;i++){
    	  sql=sql+", "+fields[i]+" "+types[i];
      }
      sql=sql+")";
      stmt.executeUpdate(sql);
      stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Table created successfully");
  }
	
	public void insert(Boat b){
	    Connection c = null;
	    Statement stmt = null;
	   
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:"+this.dataBaseName);
	      c.setAutoCommit(false);
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
	      String sql = "INSERT INTO "+this.boatTable+"VALUES (";
	      
	      sql=sql+b.getId().toString()+", "+b.getCustomer()+", "+b.locate()+", ";
	      sql=sql+Integer.toString(b.getLength())+", "+Integer.toString(b.getBeam())+", ";
	      sql=sql+Boolean.toString(b.isBilled())+", "+b.getDescription()+", "+b.getName()+","+b.getMake()+","+b.getHull()+");";
	      
	      stmt.executeUpdate(sql);

	      stmt.close();
	      c.commit();
	      c.close();
	      
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Records created successfully");
	  }
	
	public void insert(Dock d){
	    Connection c = null;
	    Statement stmt = null;
	   
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:"+this.dataBaseName);
	      c.setAutoCommit(false);
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
	      String sql = "INSERT INTO "+this.dockTable+"VALUES (";
	      
	      sql=sql+d.getId()+d.getSpaces();
	      stmt.executeUpdate(sql);

	      stmt.close();
	      c.commit();
	      c.close();
	      
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Records created successfully");
	  }
	
	public void insert(Finger f){
		//TODO
	}
	
	public void insert(HydroBox h){
		//TODO
	}
	
	public void insert(Trailer t){
		//TODO
		
	}
	
	
}
