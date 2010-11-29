package com.jet.utils.ui;

/**
 *
 */
public interface Binder
{
   public void refreshModel() throws Exception;

   public void refreshView() throws Exception;

   public void setModel(Object obj) throws Exception;
}
