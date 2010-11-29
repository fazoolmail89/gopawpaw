package com.gopawpaw.erp.hibernate.o;

import java.util.Date;


/**
 * AbstractOcmMstr entity provides the base persistence definition of the OcmMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOcmMstr  implements java.io.Serializable {


    // Fields    

     private OcmMstrId id;
     private Boolean ocmPage;
     private Date ocmEndEff;
     private String ocmUser1;
     private String ocmUser2;
     private Date ocmModDate;
     private String ocmModUserid;
     private String ocmChr01;
     private Date ocmDte01;
     private Boolean ocmLog01;
     private String ocmQadc01;
     private Date ocmQadt01;
     private Boolean ocmQadl01;
     private String ocmSchedule;
     private Double oidOcmMstr;


    // Constructors

    /** default constructor */
    public AbstractOcmMstr() {
    }

	/** minimal constructor */
    public AbstractOcmMstr(OcmMstrId id, Double oidOcmMstr) {
        this.id = id;
        this.oidOcmMstr = oidOcmMstr;
    }
    
    /** full constructor */
    public AbstractOcmMstr(OcmMstrId id, Boolean ocmPage, Date ocmEndEff, String ocmUser1, String ocmUser2, Date ocmModDate, String ocmModUserid, String ocmChr01, Date ocmDte01, Boolean ocmLog01, String ocmQadc01, Date ocmQadt01, Boolean ocmQadl01, String ocmSchedule, Double oidOcmMstr) {
        this.id = id;
        this.ocmPage = ocmPage;
        this.ocmEndEff = ocmEndEff;
        this.ocmUser1 = ocmUser1;
        this.ocmUser2 = ocmUser2;
        this.ocmModDate = ocmModDate;
        this.ocmModUserid = ocmModUserid;
        this.ocmChr01 = ocmChr01;
        this.ocmDte01 = ocmDte01;
        this.ocmLog01 = ocmLog01;
        this.ocmQadc01 = ocmQadc01;
        this.ocmQadt01 = ocmQadt01;
        this.ocmQadl01 = ocmQadl01;
        this.ocmSchedule = ocmSchedule;
        this.oidOcmMstr = oidOcmMstr;
    }

   
    // Property accessors

    public OcmMstrId getId() {
        return this.id;
    }
    
    public void setId(OcmMstrId id) {
        this.id = id;
    }

    public Boolean getOcmPage() {
        return this.ocmPage;
    }
    
    public void setOcmPage(Boolean ocmPage) {
        this.ocmPage = ocmPage;
    }

    public Date getOcmEndEff() {
        return this.ocmEndEff;
    }
    
    public void setOcmEndEff(Date ocmEndEff) {
        this.ocmEndEff = ocmEndEff;
    }

    public String getOcmUser1() {
        return this.ocmUser1;
    }
    
    public void setOcmUser1(String ocmUser1) {
        this.ocmUser1 = ocmUser1;
    }

    public String getOcmUser2() {
        return this.ocmUser2;
    }
    
    public void setOcmUser2(String ocmUser2) {
        this.ocmUser2 = ocmUser2;
    }

    public Date getOcmModDate() {
        return this.ocmModDate;
    }
    
    public void setOcmModDate(Date ocmModDate) {
        this.ocmModDate = ocmModDate;
    }

    public String getOcmModUserid() {
        return this.ocmModUserid;
    }
    
    public void setOcmModUserid(String ocmModUserid) {
        this.ocmModUserid = ocmModUserid;
    }

    public String getOcmChr01() {
        return this.ocmChr01;
    }
    
    public void setOcmChr01(String ocmChr01) {
        this.ocmChr01 = ocmChr01;
    }

    public Date getOcmDte01() {
        return this.ocmDte01;
    }
    
    public void setOcmDte01(Date ocmDte01) {
        this.ocmDte01 = ocmDte01;
    }

    public Boolean getOcmLog01() {
        return this.ocmLog01;
    }
    
    public void setOcmLog01(Boolean ocmLog01) {
        this.ocmLog01 = ocmLog01;
    }

    public String getOcmQadc01() {
        return this.ocmQadc01;
    }
    
    public void setOcmQadc01(String ocmQadc01) {
        this.ocmQadc01 = ocmQadc01;
    }

    public Date getOcmQadt01() {
        return this.ocmQadt01;
    }
    
    public void setOcmQadt01(Date ocmQadt01) {
        this.ocmQadt01 = ocmQadt01;
    }

    public Boolean getOcmQadl01() {
        return this.ocmQadl01;
    }
    
    public void setOcmQadl01(Boolean ocmQadl01) {
        this.ocmQadl01 = ocmQadl01;
    }

    public String getOcmSchedule() {
        return this.ocmSchedule;
    }
    
    public void setOcmSchedule(String ocmSchedule) {
        this.ocmSchedule = ocmSchedule;
    }

    public Double getOidOcmMstr() {
        return this.oidOcmMstr;
    }
    
    public void setOidOcmMstr(Double oidOcmMstr) {
        this.oidOcmMstr = oidOcmMstr;
    }
   








}