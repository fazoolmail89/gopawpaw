package com.gopawpaw.erp.hibernate.n;

import java.util.Date;


/**
 * AbstractNrMstr entity provides the base persistence definition of the NrMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractNrMstr  implements java.io.Serializable {


    // Fields    

     private NrMstrId id;
     private String nrDesc;
     private String nrDataset;
     private Boolean nrAllowDiscard;
     private Boolean nrAllowVoid;
     private Boolean nrNextSet;
     private String nrSegType;
     private String nrSegNbr;
     private Integer nrSegcount;
     private String nrSegRank;
     private String nrSegIni;
     private String nrSegMin;
     private String nrSegMax;
     private String nrSegReset;
     private String nrSegValue;
     private String nrSegFormat;
     private Boolean nrArchived;
     private Boolean nrInternal;
     private Date nrEffdate;
     private Date nrExpDate;
     private String nrUser1;
     private String nrUser2;
     private String nrQadc01;
     private Date nrCurrEffdate;
     private String nrValuemask;
     private Double oidNrMstr;


    // Constructors

    /** default constructor */
    public AbstractNrMstr() {
    }

	/** minimal constructor */
    public AbstractNrMstr(NrMstrId id, Double oidNrMstr) {
        this.id = id;
        this.oidNrMstr = oidNrMstr;
    }
    
    /** full constructor */
    public AbstractNrMstr(NrMstrId id, String nrDesc, String nrDataset, Boolean nrAllowDiscard, Boolean nrAllowVoid, Boolean nrNextSet, String nrSegType, String nrSegNbr, Integer nrSegcount, String nrSegRank, String nrSegIni, String nrSegMin, String nrSegMax, String nrSegReset, String nrSegValue, String nrSegFormat, Boolean nrArchived, Boolean nrInternal, Date nrEffdate, Date nrExpDate, String nrUser1, String nrUser2, String nrQadc01, Date nrCurrEffdate, String nrValuemask, Double oidNrMstr) {
        this.id = id;
        this.nrDesc = nrDesc;
        this.nrDataset = nrDataset;
        this.nrAllowDiscard = nrAllowDiscard;
        this.nrAllowVoid = nrAllowVoid;
        this.nrNextSet = nrNextSet;
        this.nrSegType = nrSegType;
        this.nrSegNbr = nrSegNbr;
        this.nrSegcount = nrSegcount;
        this.nrSegRank = nrSegRank;
        this.nrSegIni = nrSegIni;
        this.nrSegMin = nrSegMin;
        this.nrSegMax = nrSegMax;
        this.nrSegReset = nrSegReset;
        this.nrSegValue = nrSegValue;
        this.nrSegFormat = nrSegFormat;
        this.nrArchived = nrArchived;
        this.nrInternal = nrInternal;
        this.nrEffdate = nrEffdate;
        this.nrExpDate = nrExpDate;
        this.nrUser1 = nrUser1;
        this.nrUser2 = nrUser2;
        this.nrQadc01 = nrQadc01;
        this.nrCurrEffdate = nrCurrEffdate;
        this.nrValuemask = nrValuemask;
        this.oidNrMstr = oidNrMstr;
    }

   
    // Property accessors

    public NrMstrId getId() {
        return this.id;
    }
    
    public void setId(NrMstrId id) {
        this.id = id;
    }

    public String getNrDesc() {
        return this.nrDesc;
    }
    
    public void setNrDesc(String nrDesc) {
        this.nrDesc = nrDesc;
    }

    public String getNrDataset() {
        return this.nrDataset;
    }
    
    public void setNrDataset(String nrDataset) {
        this.nrDataset = nrDataset;
    }

    public Boolean getNrAllowDiscard() {
        return this.nrAllowDiscard;
    }
    
    public void setNrAllowDiscard(Boolean nrAllowDiscard) {
        this.nrAllowDiscard = nrAllowDiscard;
    }

    public Boolean getNrAllowVoid() {
        return this.nrAllowVoid;
    }
    
    public void setNrAllowVoid(Boolean nrAllowVoid) {
        this.nrAllowVoid = nrAllowVoid;
    }

    public Boolean getNrNextSet() {
        return this.nrNextSet;
    }
    
    public void setNrNextSet(Boolean nrNextSet) {
        this.nrNextSet = nrNextSet;
    }

    public String getNrSegType() {
        return this.nrSegType;
    }
    
    public void setNrSegType(String nrSegType) {
        this.nrSegType = nrSegType;
    }

    public String getNrSegNbr() {
        return this.nrSegNbr;
    }
    
    public void setNrSegNbr(String nrSegNbr) {
        this.nrSegNbr = nrSegNbr;
    }

    public Integer getNrSegcount() {
        return this.nrSegcount;
    }
    
    public void setNrSegcount(Integer nrSegcount) {
        this.nrSegcount = nrSegcount;
    }

    public String getNrSegRank() {
        return this.nrSegRank;
    }
    
    public void setNrSegRank(String nrSegRank) {
        this.nrSegRank = nrSegRank;
    }

    public String getNrSegIni() {
        return this.nrSegIni;
    }
    
    public void setNrSegIni(String nrSegIni) {
        this.nrSegIni = nrSegIni;
    }

    public String getNrSegMin() {
        return this.nrSegMin;
    }
    
    public void setNrSegMin(String nrSegMin) {
        this.nrSegMin = nrSegMin;
    }

    public String getNrSegMax() {
        return this.nrSegMax;
    }
    
    public void setNrSegMax(String nrSegMax) {
        this.nrSegMax = nrSegMax;
    }

    public String getNrSegReset() {
        return this.nrSegReset;
    }
    
    public void setNrSegReset(String nrSegReset) {
        this.nrSegReset = nrSegReset;
    }

    public String getNrSegValue() {
        return this.nrSegValue;
    }
    
    public void setNrSegValue(String nrSegValue) {
        this.nrSegValue = nrSegValue;
    }

    public String getNrSegFormat() {
        return this.nrSegFormat;
    }
    
    public void setNrSegFormat(String nrSegFormat) {
        this.nrSegFormat = nrSegFormat;
    }

    public Boolean getNrArchived() {
        return this.nrArchived;
    }
    
    public void setNrArchived(Boolean nrArchived) {
        this.nrArchived = nrArchived;
    }

    public Boolean getNrInternal() {
        return this.nrInternal;
    }
    
    public void setNrInternal(Boolean nrInternal) {
        this.nrInternal = nrInternal;
    }

    public Date getNrEffdate() {
        return this.nrEffdate;
    }
    
    public void setNrEffdate(Date nrEffdate) {
        this.nrEffdate = nrEffdate;
    }

    public Date getNrExpDate() {
        return this.nrExpDate;
    }
    
    public void setNrExpDate(Date nrExpDate) {
        this.nrExpDate = nrExpDate;
    }

    public String getNrUser1() {
        return this.nrUser1;
    }
    
    public void setNrUser1(String nrUser1) {
        this.nrUser1 = nrUser1;
    }

    public String getNrUser2() {
        return this.nrUser2;
    }
    
    public void setNrUser2(String nrUser2) {
        this.nrUser2 = nrUser2;
    }

    public String getNrQadc01() {
        return this.nrQadc01;
    }
    
    public void setNrQadc01(String nrQadc01) {
        this.nrQadc01 = nrQadc01;
    }

    public Date getNrCurrEffdate() {
        return this.nrCurrEffdate;
    }
    
    public void setNrCurrEffdate(Date nrCurrEffdate) {
        this.nrCurrEffdate = nrCurrEffdate;
    }

    public String getNrValuemask() {
        return this.nrValuemask;
    }
    
    public void setNrValuemask(String nrValuemask) {
        this.nrValuemask = nrValuemask;
    }

    public Double getOidNrMstr() {
        return this.oidNrMstr;
    }
    
    public void setOidNrMstr(Double oidNrMstr) {
        this.oidNrMstr = oidNrMstr;
    }
   








}