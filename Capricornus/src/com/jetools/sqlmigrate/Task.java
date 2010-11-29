package com.jetools.sqlmigrate;

import java.sql.*;

public interface Task {
   public abstract void execute(DatabaseConnection source, 
                                DatabaseConnection dest)
      throws SQLException;
}
