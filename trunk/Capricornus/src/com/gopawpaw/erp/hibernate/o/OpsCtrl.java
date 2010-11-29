package com.gopawpaw.erp.hibernate.o;



/**
 * OpsCtrl entity. @author MyEclipse Persistence Tools
 */
public class OpsCtrl extends AbstractOpsCtrl implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public OpsCtrl() {
    }

	/** minimal constructor */
    public OpsCtrl(Double oidOpsCtrl) {
        super(oidOpsCtrl);        
    }
    
    /** full constructor */
    public OpsCtrl(Double opsCover, Boolean opsPlan, Boolean opsMove, Integer opsQadi01, String opsUser1, String opsUser2, Boolean opsRound, String opsQadc01, Double oidOpsCtrl) {
        super(opsCover, opsPlan, opsMove, opsQadi01, opsUser1, opsUser2, opsRound, opsQadc01, oidOpsCtrl);        
    }
   
}
