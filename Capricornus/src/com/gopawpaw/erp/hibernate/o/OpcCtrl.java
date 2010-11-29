package com.gopawpaw.erp.hibernate.o;



/**
 * OpcCtrl entity. @author MyEclipse Persistence Tools
 */
public class OpcCtrl extends AbstractOpcCtrl implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public OpcCtrl() {
    }

	/** minimal constructor */
    public OpcCtrl(Double oidOpcCtrl) {
        super(oidOpcCtrl);        
    }
    
    /** full constructor */
    public OpcCtrl(Integer opcQadi02, Boolean opcPayroll, Boolean opcMove, String opcTimeInd, Double opcStdHrs, String opcStdPer, Boolean opcCloseGl, Integer opcQad01, String opcUser1, String opcUser2, Integer opcQadi01, Double oidOpcCtrl) {
        super(opcQadi02, opcPayroll, opcMove, opcTimeInd, opcStdHrs, opcStdPer, opcCloseGl, opcQad01, opcUser1, opcUser2, opcQadi01, oidOpcCtrl);        
    }
   
}
