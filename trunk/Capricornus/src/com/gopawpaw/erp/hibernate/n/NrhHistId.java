package com.gopawpaw.erp.hibernate.n;



/**
 * NrhHistId entity. @author MyEclipse Persistence Tools
 */
public class NrhHistId extends AbstractNrhHistId implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public NrhHistId() {
    }

	/** minimal constructor */
    public NrhHistId(String nrhDomain) {
        super(nrhDomain);        
    }
    
    /** full constructor */
    public NrhHistId(String nrhDomain, String nrhSeqid, String nrhNumber, String nrhAction, Integer nrhLine) {
        super(nrhDomain, nrhSeqid, nrhNumber, nrhAction, nrhLine);        
    }
   
}
