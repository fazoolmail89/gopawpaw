package com.gopawpaw.erp.hibernate.o;

import java.util.Date;


/**
 * OaDet entity. @author MyEclipse Persistence Tools
 */
public class OaDet extends AbstractOaDet implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public OaDet() {
    }

	/** minimal constructor */
    public OaDet(OaDetId id, Double oidOaDet) {
        super(id, oidOaDet);        
    }
    
    /** full constructor */
    public OaDet(OaDetId id, Double oaQty, Date oaFrDate, String oaDetail, String oaReview, String oaUser1, String oaUser2, String oaQadc01, Double oidOaDet) {
        super(id, oaQty, oaFrDate, oaDetail, oaReview, oaUser1, oaUser2, oaQadc01, oidOaDet);        
    }
   
}
