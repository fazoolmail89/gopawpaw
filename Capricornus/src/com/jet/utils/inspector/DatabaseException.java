package com.jet.utils.inspector;

import java.sql.*;
import java.lang.Exception;

/**
 * DatabaseException
 *
 */

public class DatabaseException extends NestedException
{
   /** Ident Headers. **/
   public static final String RCS_HEADER = "$Header: /data/cvsrep/modules/jet_util/src/com/jet/utils/inspector/DatabaseException.java,v 1.2 2003/04/18 00:21:36 bemocvs Exp $";
   public static final String RCS_REVISION = "$Revision: 1.2 $";
   
   /** Debug Flag for this class---might set to a parent class? **/
   public static final boolean DEBUG = false;    //Application.DEBUG(?)
   
   private String mSql;
   
   public DatabaseException(Throwable e,String sql,String detail)
   {
      super(detail,e);
      mSql=sql;
   }
   
   public String getSql()
   {
      return mSql;
   }
   
   
} // DatabaseException

