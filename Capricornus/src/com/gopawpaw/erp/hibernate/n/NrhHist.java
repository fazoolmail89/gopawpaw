package com.gopawpaw.erp.hibernate.n;

import java.util.Date;


/**
 * NrhHist entity. @author MyEclipse Persistence Tools
 */
public class NrhHist extends AbstractNrhHist implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public NrhHist() {
    }

	/** minimal constructor */
    public NrhHist(NrhHistId id, Double oidNrhHist) {
        super(id, oidNrhHist);        
    }
    
    /** full constructor */
    public NrhHist(NrhHistId id, String nrhDesc, String nrhUserid, Date nrhDate, String nrhTime, String nrhUser1, String nrhUser2, String nrhQadc01, String nrhInc, String nrhNonInc, Double oidNrhHist) {
        super(id, nrhDesc, nrhUserid, nrhDate, nrhTime, nrhUser1, nrhUser2, nrhQadc01, nrhInc, nrhNonInc, oidNrhHist);        
    }
   
}
