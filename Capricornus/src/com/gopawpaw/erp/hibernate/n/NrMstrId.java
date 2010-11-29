package com.gopawpaw.erp.hibernate.n;



/**
 * NrMstrId entity. @author MyEclipse Persistence Tools
 */
public class NrMstrId extends AbstractNrMstrId implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public NrMstrId() {
    }

	/** minimal constructor */
    public NrMstrId(String nrDomain) {
        super(nrDomain);        
    }
    
    /** full constructor */
    public NrMstrId(String nrDomain, String nrSeqid) {
        super(nrDomain, nrSeqid);        
    }
   
}
