package com.gopawpaw.erp.hibernate.n;

import java.util.Date;


/**
 * NrMstr entity. @author MyEclipse Persistence Tools
 */
public class NrMstr extends AbstractNrMstr implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public NrMstr() {
    }

	/** minimal constructor */
    public NrMstr(NrMstrId id, Double oidNrMstr) {
        super(id, oidNrMstr);        
    }
    
    /** full constructor */
    public NrMstr(NrMstrId id, String nrDesc, String nrDataset, Boolean nrAllowDiscard, Boolean nrAllowVoid, Boolean nrNextSet, String nrSegType, String nrSegNbr, Integer nrSegcount, String nrSegRank, String nrSegIni, String nrSegMin, String nrSegMax, String nrSegReset, String nrSegValue, String nrSegFormat, Boolean nrArchived, Boolean nrInternal, Date nrEffdate, Date nrExpDate, String nrUser1, String nrUser2, String nrQadc01, Date nrCurrEffdate, String nrValuemask, Double oidNrMstr) {
        super(id, nrDesc, nrDataset, nrAllowDiscard, nrAllowVoid, nrNextSet, nrSegType, nrSegNbr, nrSegcount, nrSegRank, nrSegIni, nrSegMin, nrSegMax, nrSegReset, nrSegValue, nrSegFormat, nrArchived, nrInternal, nrEffdate, nrExpDate, nrUser1, nrUser2, nrQadc01, nrCurrEffdate, nrValuemask, oidNrMstr);        
    }
   
}
