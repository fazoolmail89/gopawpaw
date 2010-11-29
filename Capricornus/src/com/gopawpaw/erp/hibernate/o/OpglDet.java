package com.gopawpaw.erp.hibernate.o;



/**
 * OpglDet entity. @author MyEclipse Persistence Tools
 */
public class OpglDet extends AbstractOpglDet implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public OpglDet() {
    }

	/** minimal constructor */
    public OpglDet(OpglDetId id, String opglDyCode, String opglDyNum, Double oidOpglDet) {
        super(id, opglDyCode, opglDyNum, oidOpglDet);        
    }
    
    /** full constructor */
    public OpglDet(OpglDetId id, String opglCrAcct, String opglCrCc, String opglDrAcct, String opglDrCc, Double opglGlAmt, String opglType, String opglCrProj, String opglDrProj, Integer opglCrLine, Integer opglDrLine, String opglUser1, String opglUser2, String opglQadc01, String opglDyCode, String opglDyNum, String opglCrSub, String opglDrSub, Double oidOpglDet) {
        super(id, opglCrAcct, opglCrCc, opglDrAcct, opglDrCc, opglGlAmt, opglType, opglCrProj, opglDrProj, opglCrLine, opglDrLine, opglUser1, opglUser2, opglQadc01, opglDyCode, opglDyNum, opglCrSub, opglDrSub, oidOpglDet);        
    }
   
}
