package com.jetools.sqlmigrate;

import java.sql.*;
import java.util.*;

/**
 *
 *
 */
public class MigrationEngine implements com.jet.log.Logger
{
   
   DatabaseConnection source=null;
   DatabaseConnection dest=null;
   List tasks=null;
   
   public MigrationEngine(DatabaseConnection s, 
                          DatabaseConnection d, 
                          List t) {
      source=s; dest=d; tasks=t;      
   }
   
   public void execute() 
      throws SQLException {
      for (int i=0; i<tasks.size(); i++) {
         Task task=(Task)tasks.get(i);
         task.execute(source, dest);
      }
   }


   public static void main(String args[]) 
      throws Exception {
      
      ArrayList maps=new ArrayList();
      ArrayList tasks=new ArrayList();

      ColumnMap map=null;

//       maps.add(new ColumnMap("cust_id", "user_id", "String"));
//       maps.add(new ColumnMap("email", "email", "String"));

//       map=new ColumnMap("login_id", "name", "String");
//       map.setOnNull(map.NULL_ALTERNATE);
//       map.setNullAlternateColumn("email");

//       maps.add(map);
//       maps.add(new ColumnMap("password", "password", "String"));
      
//       TableTask task=new TableTask("select * from customer", "user", maps);
//       tasks.add(task);

//       maps=new ArrayList();
//       map=new ColumnMap("quote_id", "id", "String");
//       maps.add(map);
//       map=new ColumnMap("user_id", "user_id", "String");
//       maps.add(map);
//       map=new ColumnMap("author", "author", "String");
//       maps.add(map);
//       map=new ColumnMap("category", "category", "String");
//       maps.add(map);
//       map=new ColumnMap("quote", "quote", "String");
//       maps.add(map);
//       map=new ColumnMap("insert_date", "insert_date", "DateTime");
//       maps.add(map);
      
//       task=new TableTask("select * from quote", "quote", maps);

//       tasks.add(task);
      
      DatabaseConnection source=
      new DatabaseConnection("org.gjt.mm.mysql.Driver", 
                             "jdbc:mysql://10.0.42.221:3306/nsdbp",
                             "ns", "nsl0ck");
      DatabaseConnection dest=
      new DatabaseConnection("oracle.jdbc.driver.OracleDriver",
                             "jdbc:oracle:thin:@10.0.42.151:1521:NSGUI", 
                             "nsbemo", "nsbemo");

      MigrationEngine engine=new MigrationEngine(source, dest, tasks);

      engine.execute();
   }
}
