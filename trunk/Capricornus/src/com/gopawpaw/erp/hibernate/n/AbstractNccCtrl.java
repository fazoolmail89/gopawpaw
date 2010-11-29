package com.gopawpaw.erp.hibernate.n;

import java.math.BigDecimal;
import java.util.Date;


/**
 * AbstractNccCtrl entity provides the base persistence definition of the NccCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractNccCtrl  implements java.io.Serializable {


    // Fields    

     private String nccDomain;
     private String nccChannel;
     private String nccPrList;
     private Boolean nccLnPricing;
     private Boolean nccDispWeight;
     private Boolean nccLnFmt;
     private String nccCrInit;
     private String nccShipvia;
     private String nccType;
     private String nccRegion;
     private String nccCounty;
     private String nccSite;
     private String nccClass;
     private String nccLang;
     private String nccSlspsn;
     private String nccRmks;
     private Boolean nccFixPr;
     private String nccArAcct;
     private String nccArSub;
     private String nccArCc;
     private Boolean nccPartial;
     private Boolean nccTaxable;
     private String nccTaxUsage;
     private String nccTaxc;
     private String nccCrRating;
     private BigDecimal nccCrLimit;
     private String nccCrTerms;
     private Double nccDiscPct;
     private Boolean nccPoReqd;
     private String nccFrList;
     private BigDecimal nccFrMinWt;
     private String nccFrTerms;
     private String nccConfirmed;
     private Boolean nccShowInv;
     private Boolean nccTaxIn;
     private Boolean nccTxInCity;
     private String nccStat;
     private String nccNcAppId;
     private Integer nccQadi02;
     private String nccModUserid;
     private Date nccModDate;
     private String nccUser1;
     private String nccUser2;
     private String nccQadc01;
     private Integer nccQadi01;
     private Double nccQadd01;
     private Boolean nccQadl01;
     private Date nccQadt01;
     private Double oidNccCtrl;


    // Constructors

    /** default constructor */
    public AbstractNccCtrl() {
    }

	/** minimal constructor */
    public AbstractNccCtrl(String nccChannel, String nccPrList, Boolean nccLnPricing, Boolean nccDispWeight, Boolean nccLnFmt, String nccCrInit, String nccShipvia, String nccType, String nccRegion, String nccCounty, String nccSite, String nccClass, String nccLang, String nccSlspsn, String nccRmks, Boolean nccFixPr, String nccArAcct, String nccArSub, String nccArCc, Boolean nccPartial, Boolean nccTaxable, String nccTaxUsage, String nccTaxc, String nccCrRating, BigDecimal nccCrLimit, String nccCrTerms, Double nccDiscPct, Boolean nccPoReqd, String nccFrList, BigDecimal nccFrMinWt, String nccFrTerms, String nccConfirmed, Boolean nccShowInv, Boolean nccTaxIn, Boolean nccTxInCity, String nccStat, String nccNcAppId, Integer nccQadi02, String nccModUserid, Date nccModDate, Double oidNccCtrl) {
        this.nccChannel = nccChannel;
        this.nccPrList = nccPrList;
        this.nccLnPricing = nccLnPricing;
        this.nccDispWeight = nccDispWeight;
        this.nccLnFmt = nccLnFmt;
        this.nccCrInit = nccCrInit;
        this.nccShipvia = nccShipvia;
        this.nccType = nccType;
        this.nccRegion = nccRegion;
        this.nccCounty = nccCounty;
        this.nccSite = nccSite;
        this.nccClass = nccClass;
        this.nccLang = nccLang;
        this.nccSlspsn = nccSlspsn;
        this.nccRmks = nccRmks;
        this.nccFixPr = nccFixPr;
        this.nccArAcct = nccArAcct;
        this.nccArSub = nccArSub;
        this.nccArCc = nccArCc;
        this.nccPartial = nccPartial;
        this.nccTaxable = nccTaxable;
        this.nccTaxUsage = nccTaxUsage;
        this.nccTaxc = nccTaxc;
        this.nccCrRating = nccCrRating;
        this.nccCrLimit = nccCrLimit;
        this.nccCrTerms = nccCrTerms;
        this.nccDiscPct = nccDiscPct;
        this.nccPoReqd = nccPoReqd;
        this.nccFrList = nccFrList;
        this.nccFrMinWt = nccFrMinWt;
        this.nccFrTerms = nccFrTerms;
        this.nccConfirmed = nccConfirmed;
        this.nccShowInv = nccShowInv;
        this.nccTaxIn = nccTaxIn;
        this.nccTxInCity = nccTxInCity;
        this.nccStat = nccStat;
        this.nccNcAppId = nccNcAppId;
        this.nccQadi02 = nccQadi02;
        this.nccModUserid = nccModUserid;
        this.nccModDate = nccModDate;
        this.oidNccCtrl = oidNccCtrl;
    }
    
    /** full constructor */
    public AbstractNccCtrl(String nccChannel, String nccPrList, Boolean nccLnPricing, Boolean nccDispWeight, Boolean nccLnFmt, String nccCrInit, String nccShipvia, String nccType, String nccRegion, String nccCounty, String nccSite, String nccClass, String nccLang, String nccSlspsn, String nccRmks, Boolean nccFixPr, String nccArAcct, String nccArSub, String nccArCc, Boolean nccPartial, Boolean nccTaxable, String nccTaxUsage, String nccTaxc, String nccCrRating, BigDecimal nccCrLimit, String nccCrTerms, Double nccDiscPct, Boolean nccPoReqd, String nccFrList, BigDecimal nccFrMinWt, String nccFrTerms, String nccConfirmed, Boolean nccShowInv, Boolean nccTaxIn, Boolean nccTxInCity, String nccStat, String nccNcAppId, Integer nccQadi02, String nccModUserid, Date nccModDate, String nccUser1, String nccUser2, String nccQadc01, Integer nccQadi01, Double nccQadd01, Boolean nccQadl01, Date nccQadt01, Double oidNccCtrl) {
        this.nccChannel = nccChannel;
        this.nccPrList = nccPrList;
        this.nccLnPricing = nccLnPricing;
        this.nccDispWeight = nccDispWeight;
        this.nccLnFmt = nccLnFmt;
        this.nccCrInit = nccCrInit;
        this.nccShipvia = nccShipvia;
        this.nccType = nccType;
        this.nccRegion = nccRegion;
        this.nccCounty = nccCounty;
        this.nccSite = nccSite;
        this.nccClass = nccClass;
        this.nccLang = nccLang;
        this.nccSlspsn = nccSlspsn;
        this.nccRmks = nccRmks;
        this.nccFixPr = nccFixPr;
        this.nccArAcct = nccArAcct;
        this.nccArSub = nccArSub;
        this.nccArCc = nccArCc;
        this.nccPartial = nccPartial;
        this.nccTaxable = nccTaxable;
        this.nccTaxUsage = nccTaxUsage;
        this.nccTaxc = nccTaxc;
        this.nccCrRating = nccCrRating;
        this.nccCrLimit = nccCrLimit;
        this.nccCrTerms = nccCrTerms;
        this.nccDiscPct = nccDiscPct;
        this.nccPoReqd = nccPoReqd;
        this.nccFrList = nccFrList;
        this.nccFrMinWt = nccFrMinWt;
        this.nccFrTerms = nccFrTerms;
        this.nccConfirmed = nccConfirmed;
        this.nccShowInv = nccShowInv;
        this.nccTaxIn = nccTaxIn;
        this.nccTxInCity = nccTxInCity;
        this.nccStat = nccStat;
        this.nccNcAppId = nccNcAppId;
        this.nccQadi02 = nccQadi02;
        this.nccModUserid = nccModUserid;
        this.nccModDate = nccModDate;
        this.nccUser1 = nccUser1;
        this.nccUser2 = nccUser2;
        this.nccQadc01 = nccQadc01;
        this.nccQadi01 = nccQadi01;
        this.nccQadd01 = nccQadd01;
        this.nccQadl01 = nccQadl01;
        this.nccQadt01 = nccQadt01;
        this.oidNccCtrl = oidNccCtrl;
    }

   
    // Property accessors

    public String getNccDomain() {
        return this.nccDomain;
    }
    
    public void setNccDomain(String nccDomain) {
        this.nccDomain = nccDomain;
    }

    public String getNccChannel() {
        return this.nccChannel;
    }
    
    public void setNccChannel(String nccChannel) {
        this.nccChannel = nccChannel;
    }

    public String getNccPrList() {
        return this.nccPrList;
    }
    
    public void setNccPrList(String nccPrList) {
        this.nccPrList = nccPrList;
    }

    public Boolean getNccLnPricing() {
        return this.nccLnPricing;
    }
    
    public void setNccLnPricing(Boolean nccLnPricing) {
        this.nccLnPricing = nccLnPricing;
    }

    public Boolean getNccDispWeight() {
        return this.nccDispWeight;
    }
    
    public void setNccDispWeight(Boolean nccDispWeight) {
        this.nccDispWeight = nccDispWeight;
    }

    public Boolean getNccLnFmt() {
        return this.nccLnFmt;
    }
    
    public void setNccLnFmt(Boolean nccLnFmt) {
        this.nccLnFmt = nccLnFmt;
    }

    public String getNccCrInit() {
        return this.nccCrInit;
    }
    
    public void setNccCrInit(String nccCrInit) {
        this.nccCrInit = nccCrInit;
    }

    public String getNccShipvia() {
        return this.nccShipvia;
    }
    
    public void setNccShipvia(String nccShipvia) {
        this.nccShipvia = nccShipvia;
    }

    public String getNccType() {
        return this.nccType;
    }
    
    public void setNccType(String nccType) {
        this.nccType = nccType;
    }

    public String getNccRegion() {
        return this.nccRegion;
    }
    
    public void setNccRegion(String nccRegion) {
        this.nccRegion = nccRegion;
    }

    public String getNccCounty() {
        return this.nccCounty;
    }
    
    public void setNccCounty(String nccCounty) {
        this.nccCounty = nccCounty;
    }

    public String getNccSite() {
        return this.nccSite;
    }
    
    public void setNccSite(String nccSite) {
        this.nccSite = nccSite;
    }

    public String getNccClass() {
        return this.nccClass;
    }
    
    public void setNccClass(String nccClass) {
        this.nccClass = nccClass;
    }

    public String getNccLang() {
        return this.nccLang;
    }
    
    public void setNccLang(String nccLang) {
        this.nccLang = nccLang;
    }

    public String getNccSlspsn() {
        return this.nccSlspsn;
    }
    
    public void setNccSlspsn(String nccSlspsn) {
        this.nccSlspsn = nccSlspsn;
    }

    public String getNccRmks() {
        return this.nccRmks;
    }
    
    public void setNccRmks(String nccRmks) {
        this.nccRmks = nccRmks;
    }

    public Boolean getNccFixPr() {
        return this.nccFixPr;
    }
    
    public void setNccFixPr(Boolean nccFixPr) {
        this.nccFixPr = nccFixPr;
    }

    public String getNccArAcct() {
        return this.nccArAcct;
    }
    
    public void setNccArAcct(String nccArAcct) {
        this.nccArAcct = nccArAcct;
    }

    public String getNccArSub() {
        return this.nccArSub;
    }
    
    public void setNccArSub(String nccArSub) {
        this.nccArSub = nccArSub;
    }

    public String getNccArCc() {
        return this.nccArCc;
    }
    
    public void setNccArCc(String nccArCc) {
        this.nccArCc = nccArCc;
    }

    public Boolean getNccPartial() {
        return this.nccPartial;
    }
    
    public void setNccPartial(Boolean nccPartial) {
        this.nccPartial = nccPartial;
    }

    public Boolean getNccTaxable() {
        return this.nccTaxable;
    }
    
    public void setNccTaxable(Boolean nccTaxable) {
        this.nccTaxable = nccTaxable;
    }

    public String getNccTaxUsage() {
        return this.nccTaxUsage;
    }
    
    public void setNccTaxUsage(String nccTaxUsage) {
        this.nccTaxUsage = nccTaxUsage;
    }

    public String getNccTaxc() {
        return this.nccTaxc;
    }
    
    public void setNccTaxc(String nccTaxc) {
        this.nccTaxc = nccTaxc;
    }

    public String getNccCrRating() {
        return this.nccCrRating;
    }
    
    public void setNccCrRating(String nccCrRating) {
        this.nccCrRating = nccCrRating;
    }

    public BigDecimal getNccCrLimit() {
        return this.nccCrLimit;
    }
    
    public void setNccCrLimit(BigDecimal nccCrLimit) {
        this.nccCrLimit = nccCrLimit;
    }

    public String getNccCrTerms() {
        return this.nccCrTerms;
    }
    
    public void setNccCrTerms(String nccCrTerms) {
        this.nccCrTerms = nccCrTerms;
    }

    public Double getNccDiscPct() {
        return this.nccDiscPct;
    }
    
    public void setNccDiscPct(Double nccDiscPct) {
        this.nccDiscPct = nccDiscPct;
    }

    public Boolean getNccPoReqd() {
        return this.nccPoReqd;
    }
    
    public void setNccPoReqd(Boolean nccPoReqd) {
        this.nccPoReqd = nccPoReqd;
    }

    public String getNccFrList() {
        return this.nccFrList;
    }
    
    public void setNccFrList(String nccFrList) {
        this.nccFrList = nccFrList;
    }

    public BigDecimal getNccFrMinWt() {
        return this.nccFrMinWt;
    }
    
    public void setNccFrMinWt(BigDecimal nccFrMinWt) {
        this.nccFrMinWt = nccFrMinWt;
    }

    public String getNccFrTerms() {
        return this.nccFrTerms;
    }
    
    public void setNccFrTerms(String nccFrTerms) {
        this.nccFrTerms = nccFrTerms;
    }

    public String getNccConfirmed() {
        return this.nccConfirmed;
    }
    
    public void setNccConfirmed(String nccConfirmed) {
        this.nccConfirmed = nccConfirmed;
    }

    public Boolean getNccShowInv() {
        return this.nccShowInv;
    }
    
    public void setNccShowInv(Boolean nccShowInv) {
        this.nccShowInv = nccShowInv;
    }

    public Boolean getNccTaxIn() {
        return this.nccTaxIn;
    }
    
    public void setNccTaxIn(Boolean nccTaxIn) {
        this.nccTaxIn = nccTaxIn;
    }

    public Boolean getNccTxInCity() {
        return this.nccTxInCity;
    }
    
    public void setNccTxInCity(Boolean nccTxInCity) {
        this.nccTxInCity = nccTxInCity;
    }

    public String getNccStat() {
        return this.nccStat;
    }
    
    public void setNccStat(String nccStat) {
        this.nccStat = nccStat;
    }

    public String getNccNcAppId() {
        return this.nccNcAppId;
    }
    
    public void setNccNcAppId(String nccNcAppId) {
        this.nccNcAppId = nccNcAppId;
    }

    public Integer getNccQadi02() {
        return this.nccQadi02;
    }
    
    public void setNccQadi02(Integer nccQadi02) {
        this.nccQadi02 = nccQadi02;
    }

    public String getNccModUserid() {
        return this.nccModUserid;
    }
    
    public void setNccModUserid(String nccModUserid) {
        this.nccModUserid = nccModUserid;
    }

    public Date getNccModDate() {
        return this.nccModDate;
    }
    
    public void setNccModDate(Date nccModDate) {
        this.nccModDate = nccModDate;
    }

    public String getNccUser1() {
        return this.nccUser1;
    }
    
    public void setNccUser1(String nccUser1) {
        this.nccUser1 = nccUser1;
    }

    public String getNccUser2() {
        return this.nccUser2;
    }
    
    public void setNccUser2(String nccUser2) {
        this.nccUser2 = nccUser2;
    }

    public String getNccQadc01() {
        return this.nccQadc01;
    }
    
    public void setNccQadc01(String nccQadc01) {
        this.nccQadc01 = nccQadc01;
    }

    public Integer getNccQadi01() {
        return this.nccQadi01;
    }
    
    public void setNccQadi01(Integer nccQadi01) {
        this.nccQadi01 = nccQadi01;
    }

    public Double getNccQadd01() {
        return this.nccQadd01;
    }
    
    public void setNccQadd01(Double nccQadd01) {
        this.nccQadd01 = nccQadd01;
    }

    public Boolean getNccQadl01() {
        return this.nccQadl01;
    }
    
    public void setNccQadl01(Boolean nccQadl01) {
        this.nccQadl01 = nccQadl01;
    }

    public Date getNccQadt01() {
        return this.nccQadt01;
    }
    
    public void setNccQadt01(Date nccQadt01) {
        this.nccQadt01 = nccQadt01;
    }

    public Double getOidNccCtrl() {
        return this.oidNccCtrl;
    }
    
    public void setOidNccCtrl(Double oidNccCtrl) {
        this.oidNccCtrl = oidNccCtrl;
    }
   








}