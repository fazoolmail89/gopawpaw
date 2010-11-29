package com.gopawpaw.erp.hibernate.o;

import java.util.Date;


/**
 * OaDetId entity. @author MyEclipse Persistence Tools
 */
public class OaDetId extends AbstractOaDetId implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public OaDetId() {
    }

	/** minimal constructor */
    public OaDetId(String oaDomain, String oaPart) {
        super(oaDomain, oaPart);        
    }
    
    /** full constructor */
    public OaDetId(String oaDomain, String oaPart, String oaSite, Integer oaCode, String oaNbr, String oaLine, Date oaToDate) {
        super(oaDomain, oaPart, oaSite, oaCode, oaNbr, oaLine, oaToDate);        
    }
   
}
