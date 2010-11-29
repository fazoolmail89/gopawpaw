package com.jet.apps.databrowser.connector;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.jet.apps.databrowser.database.ConnectionInfo;
import com.jet.log.Logger;
import com.jet.utils.ui.PopupTextField;
import com.jet.utils.ui.WinUtil;

/**
 * Include support for the <a href="http://hsqldb.org">HSQLDB database</a>.
 * 
 * @author Richard Barnes-Webb (barney)
 * @see GNUMysqlConnectFrame
 * @since 3.3.5
 */
/*
 * 
 * $Log: HsqldbConnectFrame.java,v $
 * Revision 1.3  2006/08/15 08:32:16  barney
 * commented out unused vars, to stop compile warnings.  we may need them in the future...
 *
 * Revision 1.2  2006/08/14 17:49:45  barney
 * added some more javadoc
 *
 * Revision 1.1  2006/08/14 17:28:56  barney
 * Added support for HSQLDB
 *
 * 
 */
public class HsqldbConnectFrame extends ConnectDialog implements
        ActionListener, Logger, Connector {

    private static final long serialVersionUID = 1L;
    /** Driver class name. */
    private static final String DRIVER_CLASS = "org.hsqldb.jdbcDriver";
    /** HSQLDB url prefix. */
    private static final String URL_BASE = "jdbc:hsqldb:";
    /** Default HSQLDB port. */
    private static final String DEFAULT_PORT = "9001"; 					//i _think_ this is the default (!?)
    /** List of protocols supported by HSQLDB, and whether it needs network info. */
    private static final String [][] PROTOCOL_ID = {
    // Type:       has_host_info? 0=no,1=yes
        {"mem:",     "0"},
        {"file:",    "0"},
        {"res:",     "0"},
        {"hsql:",    "1"},
        {"http:",    "1"},
        {"hsqls:",   "1"},
        {"https:",   "1"}
    }
    ;
    /** Default protocol i.e.: "hsql:". */
    private static final int DEFAULT_PROTOCOL_INDEX = 3; //i.e.: "hsql:"
   
    
    private PopupTextField 
        db_server       = new PopupTextField(40), 
        db_port         = new PopupTextField(40), 
        database_name   = new PopupTextField(40); 
        //db_user         = new PopupTextField(40);
    //private JPasswordField db_password = new JPasswordField(40);
    
    private JLabel
        protocolLbl     = new JLabel("Connection Protocol: "),
        db_serverLbl    = new JLabel("Server (ip/dns): "),
        db_portLbl      = new JLabel("Port: "),
        databaseLbl     = new JLabel("Database(/path, params): ");
    
    JComboBox protocolBox;

    //private EProperties mProperties = new EProperties();
    private ConnectionInfo connInfo=null;    
    private static ConnectionInfo lastConnInfo=null;
    
    
    
    public static void main(String [] argv){
        HsqldbConnectFrame frame = new HsqldbConnectFrame(null);
        frame.show();
    }
    
    /**
     * Construct the frame, and the GUI furniture.
     * @param p - parent
     */
    public HsqldbConnectFrame(Frame p) {
        super(p);

        setSize(320, 165);
        setLocation(WinUtil.alignCenter(this));
        setTitle("HSQLDB Connector");
        getContentPane().setLayout(new BorderLayout());

        JPanel mainPanel=new JPanel(new BorderLayout()); 
        int rows = 4;
        //labels
        JPanel labels=new JPanel(new GridLayout(rows, 1));
        labels.add(protocolLbl); 
        labels.add(db_serverLbl); 
        labels.add(db_portLbl ); 
        labels.add(databaseLbl); 
        mainPanel.add(labels, BorderLayout.WEST);
        //fields
        JPanel fields=new JPanel(new GridLayout(rows, 1)); 
        String [] tmpProtArr = new String[PROTOCOL_ID.length];
        for (int i = 0; i < PROTOCOL_ID.length; i++) {tmpProtArr[i]=PROTOCOL_ID[i][0];} //this'd be _so_ much tidier in python :-}
        protocolBox = new JComboBox(tmpProtArr);
        protocolBox.setSelectedIndex(DEFAULT_PROTOCOL_INDEX);
        protocolBox.addActionListener(this);
        fields.add(protocolBox  );
        fields.add(db_server    );
        fields.add(db_port      );
        fields.add(database_name);
        mainPanel.add(fields, BorderLayout.CENTER);
                
        //buttons at the bottom of the frame:                
        JPanel btnPanel=new JPanel (new FlowLayout(FlowLayout.LEFT));
        //|OK
        JButton okButton=new JButton("Ok");
        okButton.addActionListener(this);
        btnPanel.add (okButton);
        //|Cancel
        JButton cancelButton=new JButton("Cancel");
        cancelButton.addActionListener(this);              
        btnPanel.add (cancelButton);
        //|
        JPanel southPanel=new JPanel(new BorderLayout());      
        southPanel.add(btnPanel, BorderLayout.EAST);
        

        getContentPane().add(mainPanel, BorderLayout.CENTER);
        getContentPane().add(southPanel, BorderLayout.SOUTH);
        
        // is this needed?:
        //mProperties.put("user", "");
        //mProperties.put("password", "");
        

        db_server.requestDefaultFocus(); //TODO: sort out focus             
        
        db_port.setText(DEFAULT_PORT);
        if (lastConnInfo != null)
        {
           if (lastConnInfo.getProperty("databrowser_server") != null)
              db_server.setText(lastConnInfo.getProperty("databrowser_server"));
           if (lastConnInfo.getProperty("databrowser_port") != null)
              db_port.setText(lastConnInfo.getProperty("databrowser_port"));
           if (lastConnInfo.getProperty("databrowser_database") != null)
              database_name.setText(lastConnInfo.getProperty("databrowser_database"));
           //if (lastConnInfo.getProperty("user") != null)
           //   db_user.setText(lastConnInfo.getProperty("user"));
        }

    }
    
  
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action.equals("Cancel"))                dispose();
        else if (action.equals("Ok"))               okButtonHndlr(protocolBox.getSelectedIndex());
        else if (action.equals("comboBoxChanged"))  comboBoxChangedHndlr(((JComboBox)e.getSource()).getSelectedIndex());
    }


    /**
     * Handle changes to the protocol combobox.  In effect, grey-out options if no 
     * network support is needed. 
     * @param index - currently selected protocol
     */
    private void comboBoxChangedHndlr(int index) {
        boolean isEnabled = !PROTOCOL_ID[index][1].equals("0");
        db_server.setEnabled(isEnabled);
        db_serverLbl.setEnabled(isEnabled);
        db_port.setEnabled(isEnabled);
        db_portLbl.setEnabled(isEnabled);       
    }

    /**
     * Set, and save database connection details when Okay button is pressed.
     * @param index
     */
    private void okButtonHndlr(int index) {
        String portNum      = db_port.getText().trim();
        String serverName   = db_server.getText().trim();
        String dbName       = database_name.getText().trim();

        String url = URL_BASE+PROTOCOL_ID[index][0] + 
            (PROTOCOL_ID[index][1].equals("0")
            ? dbName
            : "//"+serverName+':'+portNum+'/'+dbName
        );
        log.writeDebug("HSQLDB url:  "+url);
        connInfo = new ConnectionInfo(DRIVER_CLASS, url);
        connInfo.setProperty("databrowser_port",        portNum);
        connInfo.setProperty("databrowser_server",      serverName);
        
        if ( dbName.length() > 0) {
        	connInfo.setProperty("databrowser_database", dbName);
		}
        
        connInfo.setName(""+url);
    
        ok=true;
        dispose();

    }

    /**
     * Show this dialog, and return details.
     */
    public ConnectionInfo getConnectionInfo() {
        show();
        lastConnInfo=connInfo;
        return ok? connInfo : null;
    }

    /**
     * Get driver for menu
     * @see com.jet.apps.databrowser.ui.menu.ConnectorMenuItem 
     */
    public static String getDriver() {return DRIVER_CLASS;}

}
