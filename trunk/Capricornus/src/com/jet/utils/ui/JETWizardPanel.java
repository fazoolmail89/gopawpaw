package com.jet.utils.ui;

import java.awt.*;
import com.jet.utils.exception.ValidationException;

import javax.swing.*;

/**
 * Superclass for all wizard interfaes.  Provides wizard style navigation
 * etc.
 *
 */
public abstract class JETWizardPanel extends JPanel
{
   public JETWizardPanel(LayoutManager lm) {super(lm);}
      
   public JETWizardPanel() {super();}

   public abstract void next() throws ValidationException;
   public abstract void onEnter();
}

