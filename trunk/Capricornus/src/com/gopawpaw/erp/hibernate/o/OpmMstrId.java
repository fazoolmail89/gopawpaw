package com.gopawpaw.erp.hibernate.o;



/**
 * OpmMstrId entity. @author MyEclipse Persistence Tools
 */
public class OpmMstrId extends AbstractOpmMstrId implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public OpmMstrId() {
    }

	/** minimal constructor */
    public OpmMstrId(String opmDomain) {
        super(opmDomain);        
    }
    
    /** full constructor */
    public OpmMstrId(String opmDomain, String opmStdOp) {
        super(opmDomain, opmStdOp);        
    }
   
}
