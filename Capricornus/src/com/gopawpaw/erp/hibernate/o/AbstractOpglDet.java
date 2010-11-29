package com.gopawpaw.erp.hibernate.o;



/**
 * AbstractOpglDet entity provides the base persistence definition of the OpglDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOpglDet  implements java.io.Serializable {


    // Fields    

     private OpglDetId id;
     private String opglCrAcct;
     private String opglCrCc;
     private String opglDrAcct;
     private String opglDrCc;
     private Double opglGlAmt;
     private String opglType;
     private String opglCrProj;
     private String opglDrProj;
     private Integer opglCrLine;
     private Integer opglDrLine;
     private String opglUser1;
     private String opglUser2;
     private String opglQadc01;
     private String opglDyCode;
     private String opglDyNum;
     private String opglCrSub;
     private String opglDrSub;
     private Double oidOpglDet;


    // Constructors

    /** default constructor */
    public AbstractOpglDet() {
    }

	/** minimal constructor */
    public AbstractOpglDet(OpglDetId id, String opglDyCode, String opglDyNum, Double oidOpglDet) {
        this.id = id;
        this.opglDyCode = opglDyCode;
        this.opglDyNum = opglDyNum;
        this.oidOpglDet = oidOpglDet;
    }
    
    /** full constructor */
    public AbstractOpglDet(OpglDetId id, String opglCrAcct, String opglCrCc, String opglDrAcct, String opglDrCc, Double opglGlAmt, String opglType, String opglCrProj, String opglDrProj, Integer opglCrLine, Integer opglDrLine, String opglUser1, String opglUser2, String opglQadc01, String opglDyCode, String opglDyNum, String opglCrSub, String opglDrSub, Double oidOpglDet) {
        this.id = id;
        this.opglCrAcct = opglCrAcct;
        this.opglCrCc = opglCrCc;
        this.opglDrAcct = opglDrAcct;
        this.opglDrCc = opglDrCc;
        this.opglGlAmt = opglGlAmt;
        this.opglType = opglType;
        this.opglCrProj = opglCrProj;
        this.opglDrProj = opglDrProj;
        this.opglCrLine = opglCrLine;
        this.opglDrLine = opglDrLine;
        this.opglUser1 = opglUser1;
        this.opglUser2 = opglUser2;
        this.opglQadc01 = opglQadc01;
        this.opglDyCode = opglDyCode;
        this.opglDyNum = opglDyNum;
        this.opglCrSub = opglCrSub;
        this.opglDrSub = opglDrSub;
        this.oidOpglDet = oidOpglDet;
    }

   
    // Property accessors

    public OpglDetId getId() {
        return this.id;
    }
    
    public void setId(OpglDetId id) {
        this.id = id;
    }

    public String getOpglCrAcct() {
        return this.opglCrAcct;
    }
    
    public void setOpglCrAcct(String opglCrAcct) {
        this.opglCrAcct = opglCrAcct;
    }

    public String getOpglCrCc() {
        return this.opglCrCc;
    }
    
    public void setOpglCrCc(String opglCrCc) {
        this.opglCrCc = opglCrCc;
    }

    public String getOpglDrAcct() {
        return this.opglDrAcct;
    }
    
    public void setOpglDrAcct(String opglDrAcct) {
        this.opglDrAcct = opglDrAcct;
    }

    public String getOpglDrCc() {
        return this.opglDrCc;
    }
    
    public void setOpglDrCc(String opglDrCc) {
        this.opglDrCc = opglDrCc;
    }

    public Double getOpglGlAmt() {
        return this.opglGlAmt;
    }
    
    public void setOpglGlAmt(Double opglGlAmt) {
        this.opglGlAmt = opglGlAmt;
    }

    public String getOpglType() {
        return this.opglType;
    }
    
    public void setOpglType(String opglType) {
        this.opglType = opglType;
    }

    public String getOpglCrProj() {
        return this.opglCrProj;
    }
    
    public void setOpglCrProj(String opglCrProj) {
        this.opglCrProj = opglCrProj;
    }

    public String getOpglDrProj() {
        return this.opglDrProj;
    }
    
    public void setOpglDrProj(String opglDrProj) {
        this.opglDrProj = opglDrProj;
    }

    public Integer getOpglCrLine() {
        return this.opglCrLine;
    }
    
    public void setOpglCrLine(Integer opglCrLine) {
        this.opglCrLine = opglCrLine;
    }

    public Integer getOpglDrLine() {
        return this.opglDrLine;
    }
    
    public void setOpglDrLine(Integer opglDrLine) {
        this.opglDrLine = opglDrLine;
    }

    public String getOpglUser1() {
        return this.opglUser1;
    }
    
    public void setOpglUser1(String opglUser1) {
        this.opglUser1 = opglUser1;
    }

    public String getOpglUser2() {
        return this.opglUser2;
    }
    
    public void setOpglUser2(String opglUser2) {
        this.opglUser2 = opglUser2;
    }

    public String getOpglQadc01() {
        return this.opglQadc01;
    }
    
    public void setOpglQadc01(String opglQadc01) {
        this.opglQadc01 = opglQadc01;
    }

    public String getOpglDyCode() {
        return this.opglDyCode;
    }
    
    public void setOpglDyCode(String opglDyCode) {
        this.opglDyCode = opglDyCode;
    }

    public String getOpglDyNum() {
        return this.opglDyNum;
    }
    
    public void setOpglDyNum(String opglDyNum) {
        this.opglDyNum = opglDyNum;
    }

    public String getOpglCrSub() {
        return this.opglCrSub;
    }
    
    public void setOpglCrSub(String opglCrSub) {
        this.opglCrSub = opglCrSub;
    }

    public String getOpglDrSub() {
        return this.opglDrSub;
    }
    
    public void setOpglDrSub(String opglDrSub) {
        this.opglDrSub = opglDrSub;
    }

    public Double getOidOpglDet() {
        return this.oidOpglDet;
    }
    
    public void setOidOpglDet(Double oidOpglDet) {
        this.oidOpglDet = oidOpglDet;
    }
   








}