package com.gopawpaw.erp.hibernate.o;

import java.math.BigDecimal;
import java.util.Date;


/**
 * OpmMstr entity. @author MyEclipse Persistence Tools
 */
public class OpmMstr extends AbstractOpmMstr implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public OpmMstr() {
    }

	/** minimal constructor */
    public OpmMstr(OpmMstrId id, Double oidOpmMstr) {
        super(id, oidOpmMstr);        
    }
    
    /** full constructor */
    public OpmMstr(OpmMstrId id, String opmDesc, String opmWkctr, String opmMch, Double opmSetup, Double opmRun, Double opmMove, Double opmYldPct, String opmTool, String opmVend, Double opmSubCost, Integer opmTranQty, Double opmInvVal, Integer opmBatch, Integer opmCmtindx, Boolean opmMile, Double opmLbrOvhd, String opmUser1, String opmUser2, Integer opmSubLead, BigDecimal opmCycUnit, Double opmCycRate, String opmChr01, String opmChr02, String opmChr03, String opmChr04, String opmChr05, Date opmDte01, Date opmDte02, Double opmDec01, Double opmDec02, Boolean opmLog01, String opmFscCode, String opmFsmType, String opmQadc01, String opmQadc02, String opmQadc03, Date opmQadt01, Double opmQade01, Boolean opmQadl01, Boolean opmQadl02, String opmBomCode, Double oidOpmMstr) {
        super(id, opmDesc, opmWkctr, opmMch, opmSetup, opmRun, opmMove, opmYldPct, opmTool, opmVend, opmSubCost, opmTranQty, opmInvVal, opmBatch, opmCmtindx, opmMile, opmLbrOvhd, opmUser1, opmUser2, opmSubLead, opmCycUnit, opmCycRate, opmChr01, opmChr02, opmChr03, opmChr04, opmChr05, opmDte01, opmDte02, opmDec01, opmDec02, opmLog01, opmFscCode, opmFsmType, opmQadc01, opmQadc02, opmQadc03, opmQadt01, opmQade01, opmQadl01, opmQadl02, opmBomCode, oidOpmMstr);        
    }
   
}
