package com.gopawpaw.erp.hibernate.o;



/**
 * OpHistId entity. @author MyEclipse Persistence Tools
 */
public class OpHistId extends AbstractOpHistId implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public OpHistId() {
    }

    
    /** full constructor */
    public OpHistId(String opDomain, Integer opTrnbr) {
        super(opDomain, opTrnbr);        
    }
   
}
