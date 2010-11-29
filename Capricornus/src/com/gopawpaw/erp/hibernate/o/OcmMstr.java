package com.gopawpaw.erp.hibernate.o;

import java.util.Date;


/**
 * OcmMstr entity. @author MyEclipse Persistence Tools
 */
public class OcmMstr extends AbstractOcmMstr implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public OcmMstr() {
    }

	/** minimal constructor */
    public OcmMstr(OcmMstrId id, Double oidOcmMstr) {
        super(id, oidOcmMstr);        
    }
    
    /** full constructor */
    public OcmMstr(OcmMstrId id, Boolean ocmPage, Date ocmEndEff, String ocmUser1, String ocmUser2, Date ocmModDate, String ocmModUserid, String ocmChr01, Date ocmDte01, Boolean ocmLog01, String ocmQadc01, Date ocmQadt01, Boolean ocmQadl01, String ocmSchedule, Double oidOcmMstr) {
        super(id, ocmPage, ocmEndEff, ocmUser1, ocmUser2, ocmModDate, ocmModUserid, ocmChr01, ocmDte01, ocmLog01, ocmQadc01, ocmQadt01, ocmQadl01, ocmSchedule, oidOcmMstr);        
    }
   
}
