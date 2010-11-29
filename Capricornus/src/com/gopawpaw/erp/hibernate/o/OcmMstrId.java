package com.gopawpaw.erp.hibernate.o;

import java.util.Date;


/**
 * OcmMstrId entity. @author MyEclipse Persistence Tools
 */
public class OcmMstrId extends AbstractOcmMstrId implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public OcmMstrId() {
    }

	/** minimal constructor */
    public OcmMstrId(String ocmDomain) {
        super(ocmDomain);        
    }
    
    /** full constructor */
    public OcmMstrId(String ocmDomain, String ocmArea, String ocmEngCode, Date ocmStartEff) {
        super(ocmDomain, ocmArea, ocmEngCode, ocmStartEff);        
    }
   
}
