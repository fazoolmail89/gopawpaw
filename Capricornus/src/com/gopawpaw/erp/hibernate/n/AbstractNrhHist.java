package com.gopawpaw.erp.hibernate.n;

import java.util.Date;


/**
 * AbstractNrhHist entity provides the base persistence definition of the NrhHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractNrhHist  implements java.io.Serializable {


    // Fields    

     private NrhHistId id;
     private String nrhDesc;
     private String nrhUserid;
     private Date nrhDate;
     private String nrhTime;
     private String nrhUser1;
     private String nrhUser2;
     private String nrhQadc01;
     private String nrhInc;
     private String nrhNonInc;
     private Double oidNrhHist;


    // Constructors

    /** default constructor */
    public AbstractNrhHist() {
    }

	/** minimal constructor */
    public AbstractNrhHist(NrhHistId id, Double oidNrhHist) {
        this.id = id;
        this.oidNrhHist = oidNrhHist;
    }
    
    /** full constructor */
    public AbstractNrhHist(NrhHistId id, String nrhDesc, String nrhUserid, Date nrhDate, String nrhTime, String nrhUser1, String nrhUser2, String nrhQadc01, String nrhInc, String nrhNonInc, Double oidNrhHist) {
        this.id = id;
        this.nrhDesc = nrhDesc;
        this.nrhUserid = nrhUserid;
        this.nrhDate = nrhDate;
        this.nrhTime = nrhTime;
        this.nrhUser1 = nrhUser1;
        this.nrhUser2 = nrhUser2;
        this.nrhQadc01 = nrhQadc01;
        this.nrhInc = nrhInc;
        this.nrhNonInc = nrhNonInc;
        this.oidNrhHist = oidNrhHist;
    }

   
    // Property accessors

    public NrhHistId getId() {
        return this.id;
    }
    
    public void setId(NrhHistId id) {
        this.id = id;
    }

    public String getNrhDesc() {
        return this.nrhDesc;
    }
    
    public void setNrhDesc(String nrhDesc) {
        this.nrhDesc = nrhDesc;
    }

    public String getNrhUserid() {
        return this.nrhUserid;
    }
    
    public void setNrhUserid(String nrhUserid) {
        this.nrhUserid = nrhUserid;
    }

    public Date getNrhDate() {
        return this.nrhDate;
    }
    
    public void setNrhDate(Date nrhDate) {
        this.nrhDate = nrhDate;
    }

    public String getNrhTime() {
        return this.nrhTime;
    }
    
    public void setNrhTime(String nrhTime) {
        this.nrhTime = nrhTime;
    }

    public String getNrhUser1() {
        return this.nrhUser1;
    }
    
    public void setNrhUser1(String nrhUser1) {
        this.nrhUser1 = nrhUser1;
    }

    public String getNrhUser2() {
        return this.nrhUser2;
    }
    
    public void setNrhUser2(String nrhUser2) {
        this.nrhUser2 = nrhUser2;
    }

    public String getNrhQadc01() {
        return this.nrhQadc01;
    }
    
    public void setNrhQadc01(String nrhQadc01) {
        this.nrhQadc01 = nrhQadc01;
    }

    public String getNrhInc() {
        return this.nrhInc;
    }
    
    public void setNrhInc(String nrhInc) {
        this.nrhInc = nrhInc;
    }

    public String getNrhNonInc() {
        return this.nrhNonInc;
    }
    
    public void setNrhNonInc(String nrhNonInc) {
        this.nrhNonInc = nrhNonInc;
    }

    public Double getOidNrhHist() {
        return this.oidNrhHist;
    }
    
    public void setOidNrhHist(Double oidNrhHist) {
        this.oidNrhHist = oidNrhHist;
    }
   








}