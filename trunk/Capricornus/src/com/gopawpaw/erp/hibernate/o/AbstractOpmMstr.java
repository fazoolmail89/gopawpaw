package com.gopawpaw.erp.hibernate.o;

import java.math.BigDecimal;
import java.util.Date;


/**
 * AbstractOpmMstr entity provides the base persistence definition of the OpmMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOpmMstr  implements java.io.Serializable {


    // Fields    

     private OpmMstrId id;
     private String opmDesc;
     private String opmWkctr;
     private String opmMch;
     private Double opmSetup;
     private Double opmRun;
     private Double opmMove;
     private Double opmYldPct;
     private String opmTool;
     private String opmVend;
     private Double opmSubCost;
     private Integer opmTranQty;
     private Double opmInvVal;
     private Integer opmBatch;
     private Integer opmCmtindx;
     private Boolean opmMile;
     private Double opmLbrOvhd;
     private String opmUser1;
     private String opmUser2;
     private Integer opmSubLead;
     private BigDecimal opmCycUnit;
     private Double opmCycRate;
     private String opmChr01;
     private String opmChr02;
     private String opmChr03;
     private String opmChr04;
     private String opmChr05;
     private Date opmDte01;
     private Date opmDte02;
     private Double opmDec01;
     private Double opmDec02;
     private Boolean opmLog01;
     private String opmFscCode;
     private String opmFsmType;
     private String opmQadc01;
     private String opmQadc02;
     private String opmQadc03;
     private Date opmQadt01;
     private Double opmQade01;
     private Boolean opmQadl01;
     private Boolean opmQadl02;
     private String opmBomCode;
     private Double oidOpmMstr;


    // Constructors

    /** default constructor */
    public AbstractOpmMstr() {
    }

	/** minimal constructor */
    public AbstractOpmMstr(OpmMstrId id, Double oidOpmMstr) {
        this.id = id;
        this.oidOpmMstr = oidOpmMstr;
    }
    
    /** full constructor */
    public AbstractOpmMstr(OpmMstrId id, String opmDesc, String opmWkctr, String opmMch, Double opmSetup, Double opmRun, Double opmMove, Double opmYldPct, String opmTool, String opmVend, Double opmSubCost, Integer opmTranQty, Double opmInvVal, Integer opmBatch, Integer opmCmtindx, Boolean opmMile, Double opmLbrOvhd, String opmUser1, String opmUser2, Integer opmSubLead, BigDecimal opmCycUnit, Double opmCycRate, String opmChr01, String opmChr02, String opmChr03, String opmChr04, String opmChr05, Date opmDte01, Date opmDte02, Double opmDec01, Double opmDec02, Boolean opmLog01, String opmFscCode, String opmFsmType, String opmQadc01, String opmQadc02, String opmQadc03, Date opmQadt01, Double opmQade01, Boolean opmQadl01, Boolean opmQadl02, String opmBomCode, Double oidOpmMstr) {
        this.id = id;
        this.opmDesc = opmDesc;
        this.opmWkctr = opmWkctr;
        this.opmMch = opmMch;
        this.opmSetup = opmSetup;
        this.opmRun = opmRun;
        this.opmMove = opmMove;
        this.opmYldPct = opmYldPct;
        this.opmTool = opmTool;
        this.opmVend = opmVend;
        this.opmSubCost = opmSubCost;
        this.opmTranQty = opmTranQty;
        this.opmInvVal = opmInvVal;
        this.opmBatch = opmBatch;
        this.opmCmtindx = opmCmtindx;
        this.opmMile = opmMile;
        this.opmLbrOvhd = opmLbrOvhd;
        this.opmUser1 = opmUser1;
        this.opmUser2 = opmUser2;
        this.opmSubLead = opmSubLead;
        this.opmCycUnit = opmCycUnit;
        this.opmCycRate = opmCycRate;
        this.opmChr01 = opmChr01;
        this.opmChr02 = opmChr02;
        this.opmChr03 = opmChr03;
        this.opmChr04 = opmChr04;
        this.opmChr05 = opmChr05;
        this.opmDte01 = opmDte01;
        this.opmDte02 = opmDte02;
        this.opmDec01 = opmDec01;
        this.opmDec02 = opmDec02;
        this.opmLog01 = opmLog01;
        this.opmFscCode = opmFscCode;
        this.opmFsmType = opmFsmType;
        this.opmQadc01 = opmQadc01;
        this.opmQadc02 = opmQadc02;
        this.opmQadc03 = opmQadc03;
        this.opmQadt01 = opmQadt01;
        this.opmQade01 = opmQade01;
        this.opmQadl01 = opmQadl01;
        this.opmQadl02 = opmQadl02;
        this.opmBomCode = opmBomCode;
        this.oidOpmMstr = oidOpmMstr;
    }

   
    // Property accessors

    public OpmMstrId getId() {
        return this.id;
    }
    
    public void setId(OpmMstrId id) {
        this.id = id;
    }

    public String getOpmDesc() {
        return this.opmDesc;
    }
    
    public void setOpmDesc(String opmDesc) {
        this.opmDesc = opmDesc;
    }

    public String getOpmWkctr() {
        return this.opmWkctr;
    }
    
    public void setOpmWkctr(String opmWkctr) {
        this.opmWkctr = opmWkctr;
    }

    public String getOpmMch() {
        return this.opmMch;
    }
    
    public void setOpmMch(String opmMch) {
        this.opmMch = opmMch;
    }

    public Double getOpmSetup() {
        return this.opmSetup;
    }
    
    public void setOpmSetup(Double opmSetup) {
        this.opmSetup = opmSetup;
    }

    public Double getOpmRun() {
        return this.opmRun;
    }
    
    public void setOpmRun(Double opmRun) {
        this.opmRun = opmRun;
    }

    public Double getOpmMove() {
        return this.opmMove;
    }
    
    public void setOpmMove(Double opmMove) {
        this.opmMove = opmMove;
    }

    public Double getOpmYldPct() {
        return this.opmYldPct;
    }
    
    public void setOpmYldPct(Double opmYldPct) {
        this.opmYldPct = opmYldPct;
    }

    public String getOpmTool() {
        return this.opmTool;
    }
    
    public void setOpmTool(String opmTool) {
        this.opmTool = opmTool;
    }

    public String getOpmVend() {
        return this.opmVend;
    }
    
    public void setOpmVend(String opmVend) {
        this.opmVend = opmVend;
    }

    public Double getOpmSubCost() {
        return this.opmSubCost;
    }
    
    public void setOpmSubCost(Double opmSubCost) {
        this.opmSubCost = opmSubCost;
    }

    public Integer getOpmTranQty() {
        return this.opmTranQty;
    }
    
    public void setOpmTranQty(Integer opmTranQty) {
        this.opmTranQty = opmTranQty;
    }

    public Double getOpmInvVal() {
        return this.opmInvVal;
    }
    
    public void setOpmInvVal(Double opmInvVal) {
        this.opmInvVal = opmInvVal;
    }

    public Integer getOpmBatch() {
        return this.opmBatch;
    }
    
    public void setOpmBatch(Integer opmBatch) {
        this.opmBatch = opmBatch;
    }

    public Integer getOpmCmtindx() {
        return this.opmCmtindx;
    }
    
    public void setOpmCmtindx(Integer opmCmtindx) {
        this.opmCmtindx = opmCmtindx;
    }

    public Boolean getOpmMile() {
        return this.opmMile;
    }
    
    public void setOpmMile(Boolean opmMile) {
        this.opmMile = opmMile;
    }

    public Double getOpmLbrOvhd() {
        return this.opmLbrOvhd;
    }
    
    public void setOpmLbrOvhd(Double opmLbrOvhd) {
        this.opmLbrOvhd = opmLbrOvhd;
    }

    public String getOpmUser1() {
        return this.opmUser1;
    }
    
    public void setOpmUser1(String opmUser1) {
        this.opmUser1 = opmUser1;
    }

    public String getOpmUser2() {
        return this.opmUser2;
    }
    
    public void setOpmUser2(String opmUser2) {
        this.opmUser2 = opmUser2;
    }

    public Integer getOpmSubLead() {
        return this.opmSubLead;
    }
    
    public void setOpmSubLead(Integer opmSubLead) {
        this.opmSubLead = opmSubLead;
    }

    public BigDecimal getOpmCycUnit() {
        return this.opmCycUnit;
    }
    
    public void setOpmCycUnit(BigDecimal opmCycUnit) {
        this.opmCycUnit = opmCycUnit;
    }

    public Double getOpmCycRate() {
        return this.opmCycRate;
    }
    
    public void setOpmCycRate(Double opmCycRate) {
        this.opmCycRate = opmCycRate;
    }

    public String getOpmChr01() {
        return this.opmChr01;
    }
    
    public void setOpmChr01(String opmChr01) {
        this.opmChr01 = opmChr01;
    }

    public String getOpmChr02() {
        return this.opmChr02;
    }
    
    public void setOpmChr02(String opmChr02) {
        this.opmChr02 = opmChr02;
    }

    public String getOpmChr03() {
        return this.opmChr03;
    }
    
    public void setOpmChr03(String opmChr03) {
        this.opmChr03 = opmChr03;
    }

    public String getOpmChr04() {
        return this.opmChr04;
    }
    
    public void setOpmChr04(String opmChr04) {
        this.opmChr04 = opmChr04;
    }

    public String getOpmChr05() {
        return this.opmChr05;
    }
    
    public void setOpmChr05(String opmChr05) {
        this.opmChr05 = opmChr05;
    }

    public Date getOpmDte01() {
        return this.opmDte01;
    }
    
    public void setOpmDte01(Date opmDte01) {
        this.opmDte01 = opmDte01;
    }

    public Date getOpmDte02() {
        return this.opmDte02;
    }
    
    public void setOpmDte02(Date opmDte02) {
        this.opmDte02 = opmDte02;
    }

    public Double getOpmDec01() {
        return this.opmDec01;
    }
    
    public void setOpmDec01(Double opmDec01) {
        this.opmDec01 = opmDec01;
    }

    public Double getOpmDec02() {
        return this.opmDec02;
    }
    
    public void setOpmDec02(Double opmDec02) {
        this.opmDec02 = opmDec02;
    }

    public Boolean getOpmLog01() {
        return this.opmLog01;
    }
    
    public void setOpmLog01(Boolean opmLog01) {
        this.opmLog01 = opmLog01;
    }

    public String getOpmFscCode() {
        return this.opmFscCode;
    }
    
    public void setOpmFscCode(String opmFscCode) {
        this.opmFscCode = opmFscCode;
    }

    public String getOpmFsmType() {
        return this.opmFsmType;
    }
    
    public void setOpmFsmType(String opmFsmType) {
        this.opmFsmType = opmFsmType;
    }

    public String getOpmQadc01() {
        return this.opmQadc01;
    }
    
    public void setOpmQadc01(String opmQadc01) {
        this.opmQadc01 = opmQadc01;
    }

    public String getOpmQadc02() {
        return this.opmQadc02;
    }
    
    public void setOpmQadc02(String opmQadc02) {
        this.opmQadc02 = opmQadc02;
    }

    public String getOpmQadc03() {
        return this.opmQadc03;
    }
    
    public void setOpmQadc03(String opmQadc03) {
        this.opmQadc03 = opmQadc03;
    }

    public Date getOpmQadt01() {
        return this.opmQadt01;
    }
    
    public void setOpmQadt01(Date opmQadt01) {
        this.opmQadt01 = opmQadt01;
    }

    public Double getOpmQade01() {
        return this.opmQade01;
    }
    
    public void setOpmQade01(Double opmQade01) {
        this.opmQade01 = opmQade01;
    }

    public Boolean getOpmQadl01() {
        return this.opmQadl01;
    }
    
    public void setOpmQadl01(Boolean opmQadl01) {
        this.opmQadl01 = opmQadl01;
    }

    public Boolean getOpmQadl02() {
        return this.opmQadl02;
    }
    
    public void setOpmQadl02(Boolean opmQadl02) {
        this.opmQadl02 = opmQadl02;
    }

    public String getOpmBomCode() {
        return this.opmBomCode;
    }
    
    public void setOpmBomCode(String opmBomCode) {
        this.opmBomCode = opmBomCode;
    }

    public Double getOidOpmMstr() {
        return this.oidOpmMstr;
    }
    
    public void setOidOpmMstr(Double oidOpmMstr) {
        this.oidOpmMstr = oidOpmMstr;
    }
   








}