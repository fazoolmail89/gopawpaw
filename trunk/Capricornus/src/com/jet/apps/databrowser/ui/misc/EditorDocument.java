package com.jet.apps.databrowser.ui.misc;

import javax.swing.text.*;

public interface EditorDocument extends Document {
   public String getSelectedText();
   public void setCursorPosition(int i); 
}
