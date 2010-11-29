package com.jetools.sqlmigrate;

import java.util.*;


public class Atlas
{
   public static void main(String args[]) 
      throws Exception {
      
      ArrayList maps=new ArrayList();
      ArrayList tasks=new ArrayList();

      int rowlimit=10000000;

      //tasks.add(buildEventAuxMigrate(rowlimit));
      //tasks.add(buildEventDataMigrate(rowlimit));

//       String s=
//       "CREATE TABLE BEMO_TEMP \n"+
//       "(ID VARCHAR2(50) NOT NULL, \n"+
//       " NAME VARCHAR2(50))";
//       SQLTask sqltask=new SQLTask(s);

      //tasks.add(sqltask);

      tasks.add(buildEventDataJoin(rowlimit));
      

      DatabaseConnection source=
      new DatabaseConnection("org.gjt.mm.mysql.Driver", 
                             "jdbc:mysql://10.0.42.221:3306/nsdbp",
                             "ns", "nsl0ck");
      DatabaseConnection dest=
      new DatabaseConnection("oracle.jdbc.driver.OracleDriver",
                             "jdbc:oracle:thin:@10.0.42.151:1521:NSGUI", 
                             "nsdbp", "nsdbp");

      MigrationEngine engine=new MigrationEngine(source, dest, tasks);

      engine.execute();
   }

   private static TableTask buildEventDataMigrate(int rowlimit) {
      ColumnMap map=null;
      ArrayList maps=new ArrayList();

      maps.add(new ColumnMap("utime", "UTIME", ColumnMap.LONG));
      maps.add(new ColumnMap("utimestamp", "UTIMESTAMP", ColumnMap.LONG));
      maps.add(new ColumnMap("agent_id", "AGENT_ID", ColumnMap.LONG));
      maps.add(new ColumnMap("logd_product", "LOGD_PRODUCT", ColumnMap.INT));
      maps.add(new ColumnMap("proto", "PROTO", ColumnMap.INT));
      maps.add(new ColumnMap("srcport", "SRCPORT", ColumnMap.INT));
      maps.add(new ColumnMap("dstport", "DSTPORT", ColumnMap.INT));
      maps.add(new ColumnMap("xlatesrc", "XLATESRC", ColumnMap.LONG));
      maps.add(new ColumnMap("xlatedst", "XLATEDST", ColumnMap.LONG));
      maps.add(new ColumnMap("xlatesport", "XLATESPORT", ColumnMap.INT));
      maps.add(new ColumnMap("xlatedport", "XLATEDPORT", ColumnMap.INT));
      maps.add(new ColumnMap("priority", "PRIORITY", ColumnMap.INT));
      maps.add(new ColumnMap("class_id", "CLASS_ID", ColumnMap.LONG));

      map=new ColumnMap("type", "TYPE", ColumnMap.STRING);
      map.setTrimStrings(true);
      maps.add(map);

      maps.add(new ColumnMap("count", "COUNT", ColumnMap.INT));
      maps.add(new ColumnMap("event_id", "EVENT_ID", ColumnMap.LONG));
      maps.add(new ColumnMap("srcid", "SRCID", ColumnMap.LONG));
      maps.add(new ColumnMap("dstid", "DSTID", ColumnMap.LONG));
      maps.add(new ColumnMap("src_threat", "SRC_THREAT", ColumnMap.INT));
      maps.add(new ColumnMap("dst_threat", "DST_THREAT", ColumnMap.INT));
      
      TableTask eventTask=new TableTask("nsdbp.EVENT_DATA", maps,
                                        "EVENT_DATA", "event_id", 5000);

      eventTask.setRowLimit(rowlimit);
      eventTask.setLogInterval(1000);
      return eventTask;
   }

   /** */
   private static TableTask buildEventAuxMigrate(int rowlimit) {
      ArrayList maps=new ArrayList();
     
      maps.add(new ColumnMap("event_id",     "EVENT_ID", ColumnMap.LONG));
      maps.add(new ColumnMap("bindata_type", "BINDATA_TYPE", ColumnMap.INT));
      maps.add(new ColumnMap("bindata",      "BINDATA", ColumnMap.STRING));
      maps.add(new ColumnMap("info",         "INFO", ColumnMap.STRING));
      maps.add(new ColumnMap("notes",        "NOTES", ColumnMap.STRING));
      maps.add(new ColumnMap("username",     "USERNAME", ColumnMap.STRING));
      maps.add(new ColumnMap("usercontext",  "USERCONTEXT", ColumnMap.STRING));
      maps.add(new ColumnMap("srchostname",  "SRCHOSTNAME", ColumnMap.STRING));
      maps.add(new ColumnMap("dsthostname",  "DSTHOSTNAME", ColumnMap.STRING));
      maps.add(new ColumnMap("uri",          "URI", ColumnMap.STRING));
      maps.add(new ColumnMap("rule",         "RULE", ColumnMap.STRING));
      maps.add(new ColumnMap("srcmac",       "SRCMAC", ColumnMap.LONG));
      maps.add(new ColumnMap("dstmac",       "DSTMAC", ColumnMap.LONG));
      maps.add(new ColumnMap("direction",    "DIRECTION", ColumnMap.STRING));
      maps.add(new ColumnMap("interface",    "INTERFACE", ColumnMap.STRING));

      TableTask auxTask=new TableTask("nsdbp.EVENT_AUX_DATA", maps,
                         "EVENT_AUX_DATA", "event_id", 5000);

      auxTask.setRowLimit(rowlimit);
      auxTask.setLogInterval(1000); 
      return auxTask;
   }

   private static TableTask buildEventDataJoin(int rowlimit) {
      ColumnMap map=null;
      ArrayList maps=new ArrayList();

      maps.add(new ColumnMap("utime", "UTIME", ColumnMap.LONG));
      maps.add(new ColumnMap("utimestamp", "UTIMESTAMP", ColumnMap.LONG));
      maps.add(new ColumnMap("agent_id", "AGENT_ID", ColumnMap.LONG));
      maps.add(new ColumnMap("logd_product", "LOGD_PRODUCT", ColumnMap.INT));
      maps.add(new ColumnMap("proto", "PROTO", ColumnMap.INT));
      maps.add(new ColumnMap("srcport", "SRCPORT", ColumnMap.INT));
      maps.add(new ColumnMap("dstport", "DSTPORT", ColumnMap.INT));
      maps.add(new ColumnMap("xlatesrc", "XLATESRC", ColumnMap.LONG));
      maps.add(new ColumnMap("xlatedst", "XLATEDST", ColumnMap.LONG));
      maps.add(new ColumnMap("xlatesport", "XLATESPORT", ColumnMap.INT));
      maps.add(new ColumnMap("xlatedport", "XLATEDPORT", ColumnMap.INT));
      maps.add(new ColumnMap("priority", "PRIORITY", ColumnMap.INT));
      maps.add(new ColumnMap("class_id", "CLASS_ID", ColumnMap.LONG));

      map=new ColumnMap("type", "TYPE", ColumnMap.STRING);
      map.setTrimStrings(true);
      maps.add(map);

      maps.add(new ColumnMap("count", "COUNT", ColumnMap.INT));
      maps.add(new ColumnMap("srcid", "SRCID", ColumnMap.LONG));
      maps.add(new ColumnMap("dstid", "DSTID", ColumnMap.LONG));
      maps.add(new ColumnMap("src_threat", "SRC_THREAT", ColumnMap.INT));
      maps.add(new ColumnMap("dst_threat", "DST_THREAT", ColumnMap.INT));


      maps.add(new ColumnMap("EVENT_DATA.event_id",     "EVENT_ID", 
                             ColumnMap.LONG));

      maps.add(new ColumnMap("bindata_type", "BINDATA_TYPE", ColumnMap.INT));
      maps.add(new ColumnMap("bindata",      "BINDATA", ColumnMap.STRING));
      maps.add(new ColumnMap("info",         "INFO", ColumnMap.STRING));
      maps.add(new ColumnMap("notes",        "NOTES", ColumnMap.STRING));
      maps.add(new ColumnMap("username",     "USERNAME", ColumnMap.STRING));
      maps.add(new ColumnMap("usercontext",  "USERCONTEXT", ColumnMap.STRING));
      maps.add(new ColumnMap("srchostname",  "SRCHOSTNAME", ColumnMap.STRING));
      maps.add(new ColumnMap("dsthostname",  "DSTHOSTNAME", ColumnMap.STRING));
      maps.add(new ColumnMap("uri",          "URI", ColumnMap.STRING));
      maps.add(new ColumnMap("rule",         "RULE", ColumnMap.STRING));
      maps.add(new ColumnMap("srcmac",       "SRCMAC", ColumnMap.LONG));
      maps.add(new ColumnMap("dstmac",       "DSTMAC", ColumnMap.LONG));
      maps.add(new ColumnMap("direction",    "DIRECTION", ColumnMap.STRING));
      maps.add(new ColumnMap("interface",    "INTERFACE", ColumnMap.STRING));

      String where="where EVENT_DATA.event_id=EVENT_AUX_DATA.event_id";
      
      TableTask eventTask=
      new TableJoinTask("nsdbp.EVENT_DATA", maps,
                        "EVENT_DATA, EVENT_AUX_DATA", 
                        "EVENT_DATA.event_id", where, 5000);

      eventTask.setRowLimit(rowlimit);
      eventTask.setLogInterval(1000);
      return eventTask;
   }
}
