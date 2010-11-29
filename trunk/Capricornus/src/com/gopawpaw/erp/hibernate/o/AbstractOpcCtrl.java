package com.gopawpaw.erp.hibernate.o;



/**
 * AbstractOpcCtrl entity provides the base persistence definition of the OpcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOpcCtrl  implements java.io.Serializable {


    // Fields    

     private String opcDomain;
     private Integer opcQadi02;
     private Boolean opcPayroll;
     private Boolean opcMove;
     private String opcTimeInd;
     private Double opcStdHrs;
     private String opcStdPer;
     private Boolean opcCloseGl;
     private Integer opcQad01;
     private String opcUser1;
     private String opcUser2;
     private Integer opcQadi01;
     private Double oidOpcCtrl;


    // Constructors

    /** default constructor */
    public AbstractOpcCtrl() {
    }

	/** minimal constructor */
    public AbstractOpcCtrl(Double oidOpcCtrl) {
        this.oidOpcCtrl = oidOpcCtrl;
    }
    
    /** full constructor */
    public AbstractOpcCtrl(Integer opcQadi02, Boolean opcPayroll, Boolean opcMove, String opcTimeInd, Double opcStdHrs, String opcStdPer, Boolean opcCloseGl, Integer opcQad01, String opcUser1, String opcUser2, Integer opcQadi01, Double oidOpcCtrl) {
        this.opcQadi02 = opcQadi02;
        this.opcPayroll = opcPayroll;
        this.opcMove = opcMove;
        this.opcTimeInd = opcTimeInd;
        this.opcStdHrs = opcStdHrs;
        this.opcStdPer = opcStdPer;
        this.opcCloseGl = opcCloseGl;
        this.opcQad01 = opcQad01;
        this.opcUser1 = opcUser1;
        this.opcUser2 = opcUser2;
        this.opcQadi01 = opcQadi01;
        this.oidOpcCtrl = oidOpcCtrl;
    }

   
    // Property accessors

    public String getOpcDomain() {
        return this.opcDomain;
    }
    
    public void setOpcDomain(String opcDomain) {
        this.opcDomain = opcDomain;
    }

    public Integer getOpcQadi02() {
        return this.opcQadi02;
    }
    
    public void setOpcQadi02(Integer opcQadi02) {
        this.opcQadi02 = opcQadi02;
    }

    public Boolean getOpcPayroll() {
        return this.opcPayroll;
    }
    
    public void setOpcPayroll(Boolean opcPayroll) {
        this.opcPayroll = opcPayroll;
    }

    public Boolean getOpcMove() {
        return this.opcMove;
    }
    
    public void setOpcMove(Boolean opcMove) {
        this.opcMove = opcMove;
    }

    public String getOpcTimeInd() {
        return this.opcTimeInd;
    }
    
    public void setOpcTimeInd(String opcTimeInd) {
        this.opcTimeInd = opcTimeInd;
    }

    public Double getOpcStdHrs() {
        return this.opcStdHrs;
    }
    
    public void setOpcStdHrs(Double opcStdHrs) {
        this.opcStdHrs = opcStdHrs;
    }

    public String getOpcStdPer() {
        return this.opcStdPer;
    }
    
    public void setOpcStdPer(String opcStdPer) {
        this.opcStdPer = opcStdPer;
    }

    public Boolean getOpcCloseGl() {
        return this.opcCloseGl;
    }
    
    public void setOpcCloseGl(Boolean opcCloseGl) {
        this.opcCloseGl = opcCloseGl;
    }

    public Integer getOpcQad01() {
        return this.opcQad01;
    }
    
    public void setOpcQad01(Integer opcQad01) {
        this.opcQad01 = opcQad01;
    }

    public String getOpcUser1() {
        return this.opcUser1;
    }
    
    public void setOpcUser1(String opcUser1) {
        this.opcUser1 = opcUser1;
    }

    public String getOpcUser2() {
        return this.opcUser2;
    }
    
    public void setOpcUser2(String opcUser2) {
        this.opcUser2 = opcUser2;
    }

    public Integer getOpcQadi01() {
        return this.opcQadi01;
    }
    
    public void setOpcQadi01(Integer opcQadi01) {
        this.opcQadi01 = opcQadi01;
    }

    public Double getOidOpcCtrl() {
        return this.oidOpcCtrl;
    }
    
    public void setOidOpcCtrl(Double oidOpcCtrl) {
        this.oidOpcCtrl = oidOpcCtrl;
    }
   








}