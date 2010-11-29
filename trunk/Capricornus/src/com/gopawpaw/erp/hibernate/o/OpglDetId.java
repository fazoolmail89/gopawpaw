package com.gopawpaw.erp.hibernate.o;



/**
 * OpglDetId entity. @author MyEclipse Persistence Tools
 */
public class OpglDetId extends AbstractOpglDetId implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public OpglDetId() {
    }

	/** minimal constructor */
    public OpglDetId(String opglDomain) {
        super(opglDomain);        
    }
    
    /** full constructor */
    public OpglDetId(String opglDomain, Integer opglTrnbr, String opglGlRef, Integer opglSequence) {
        super(opglDomain, opglTrnbr, opglGlRef, opglSequence);        
    }
   
}
