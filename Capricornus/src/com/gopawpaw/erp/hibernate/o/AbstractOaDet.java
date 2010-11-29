package com.gopawpaw.erp.hibernate.o;

import java.util.Date;


/**
 * AbstractOaDet entity provides the base persistence definition of the OaDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOaDet  implements java.io.Serializable {


    // Fields    

     private OaDetId id;
     private Double oaQty;
     private Date oaFrDate;
     private String oaDetail;
     private String oaReview;
     private String oaUser1;
     private String oaUser2;
     private String oaQadc01;
     private Double oidOaDet;


    // Constructors

    /** default constructor */
    public AbstractOaDet() {
    }

	/** minimal constructor */
    public AbstractOaDet(OaDetId id, Double oidOaDet) {
        this.id = id;
        this.oidOaDet = oidOaDet;
    }
    
    /** full constructor */
    public AbstractOaDet(OaDetId id, Double oaQty, Date oaFrDate, String oaDetail, String oaReview, String oaUser1, String oaUser2, String oaQadc01, Double oidOaDet) {
        this.id = id;
        this.oaQty = oaQty;
        this.oaFrDate = oaFrDate;
        this.oaDetail = oaDetail;
        this.oaReview = oaReview;
        this.oaUser1 = oaUser1;
        this.oaUser2 = oaUser2;
        this.oaQadc01 = oaQadc01;
        this.oidOaDet = oidOaDet;
    }

   
    // Property accessors

    public OaDetId getId() {
        return this.id;
    }
    
    public void setId(OaDetId id) {
        this.id = id;
    }

    public Double getOaQty() {
        return this.oaQty;
    }
    
    public void setOaQty(Double oaQty) {
        this.oaQty = oaQty;
    }

    public Date getOaFrDate() {
        return this.oaFrDate;
    }
    
    public void setOaFrDate(Date oaFrDate) {
        this.oaFrDate = oaFrDate;
    }

    public String getOaDetail() {
        return this.oaDetail;
    }
    
    public void setOaDetail(String oaDetail) {
        this.oaDetail = oaDetail;
    }

    public String getOaReview() {
        return this.oaReview;
    }
    
    public void setOaReview(String oaReview) {
        this.oaReview = oaReview;
    }

    public String getOaUser1() {
        return this.oaUser1;
    }
    
    public void setOaUser1(String oaUser1) {
        this.oaUser1 = oaUser1;
    }

    public String getOaUser2() {
        return this.oaUser2;
    }
    
    public void setOaUser2(String oaUser2) {
        this.oaUser2 = oaUser2;
    }

    public String getOaQadc01() {
        return this.oaQadc01;
    }
    
    public void setOaQadc01(String oaQadc01) {
        this.oaQadc01 = oaQadc01;
    }

    public Double getOidOaDet() {
        return this.oidOaDet;
    }
    
    public void setOidOaDet(Double oidOaDet) {
        this.oidOaDet = oidOaDet;
    }
   








}