package com.gopawpaw.erp.hibernate.o;



/**
 * AbstractOpsCtrl entity provides the base persistence definition of the OpsCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOpsCtrl  implements java.io.Serializable {


    // Fields    

     private String opsDomain;
     private Double opsCover;
     private Boolean opsPlan;
     private Boolean opsMove;
     private Integer opsQadi01;
     private String opsUser1;
     private String opsUser2;
     private Boolean opsRound;
     private String opsQadc01;
     private Double oidOpsCtrl;


    // Constructors

    /** default constructor */
    public AbstractOpsCtrl() {
    }

	/** minimal constructor */
    public AbstractOpsCtrl(Double oidOpsCtrl) {
        this.oidOpsCtrl = oidOpsCtrl;
    }
    
    /** full constructor */
    public AbstractOpsCtrl(Double opsCover, Boolean opsPlan, Boolean opsMove, Integer opsQadi01, String opsUser1, String opsUser2, Boolean opsRound, String opsQadc01, Double oidOpsCtrl) {
        this.opsCover = opsCover;
        this.opsPlan = opsPlan;
        this.opsMove = opsMove;
        this.opsQadi01 = opsQadi01;
        this.opsUser1 = opsUser1;
        this.opsUser2 = opsUser2;
        this.opsRound = opsRound;
        this.opsQadc01 = opsQadc01;
        this.oidOpsCtrl = oidOpsCtrl;
    }

   
    // Property accessors

    public String getOpsDomain() {
        return this.opsDomain;
    }
    
    public void setOpsDomain(String opsDomain) {
        this.opsDomain = opsDomain;
    }

    public Double getOpsCover() {
        return this.opsCover;
    }
    
    public void setOpsCover(Double opsCover) {
        this.opsCover = opsCover;
    }

    public Boolean getOpsPlan() {
        return this.opsPlan;
    }
    
    public void setOpsPlan(Boolean opsPlan) {
        this.opsPlan = opsPlan;
    }

    public Boolean getOpsMove() {
        return this.opsMove;
    }
    
    public void setOpsMove(Boolean opsMove) {
        this.opsMove = opsMove;
    }

    public Integer getOpsQadi01() {
        return this.opsQadi01;
    }
    
    public void setOpsQadi01(Integer opsQadi01) {
        this.opsQadi01 = opsQadi01;
    }

    public String getOpsUser1() {
        return this.opsUser1;
    }
    
    public void setOpsUser1(String opsUser1) {
        this.opsUser1 = opsUser1;
    }

    public String getOpsUser2() {
        return this.opsUser2;
    }
    
    public void setOpsUser2(String opsUser2) {
        this.opsUser2 = opsUser2;
    }

    public Boolean getOpsRound() {
        return this.opsRound;
    }
    
    public void setOpsRound(Boolean opsRound) {
        this.opsRound = opsRound;
    }

    public String getOpsQadc01() {
        return this.opsQadc01;
    }
    
    public void setOpsQadc01(String opsQadc01) {
        this.opsQadc01 = opsQadc01;
    }

    public Double getOidOpsCtrl() {
        return this.oidOpsCtrl;
    }
    
    public void setOidOpsCtrl(Double oidOpsCtrl) {
        this.oidOpsCtrl = oidOpsCtrl;
    }
   








}