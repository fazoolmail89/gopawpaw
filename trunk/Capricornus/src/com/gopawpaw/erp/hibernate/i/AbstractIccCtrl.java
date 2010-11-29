package com.gopawpaw.erp.hibernate.i;



/**
 * AbstractIccCtrl entity provides the base persistence definition of the IccCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIccCtrl  implements java.io.Serializable {


    // Fields    

     private String iccDomain;
     private String iccCurCost;
     private Integer iccQadi04;
     private Integer iccJrnl;
     private Boolean iccGlSum;
     private Boolean iccTolFlag;
     private Double iccTolAper100;
     private Double iccTolBper100;
     private Double iccTolCper100;
     private Double iccTolOper100;
     private Double iccTolA;
     private Double iccTolB;
     private Double iccTolC;
     private Double iccTolO;
     private Boolean iccCurAp;
     private Integer iccIssDays;
     private Integer iccQad03;
     private Integer iccQad02;
     private Boolean iccGlTran;
     private Integer iccQad01;
     private Integer iccPkOrd;
     private Boolean iccAscend;
     private String iccUser1;
     private String iccUser2;
     private Integer iccQadi02;
     private String iccGlSet;
     private Boolean iccCogs;
     private String iccQadc01;
     private String iccCurSet;
     private String iccQadc03;
     private String iccXclrAcct;
     private String iccXclrCc;
     private Boolean iccMirror;
     private String iccSite;
     private String iccQadc02;
     private String iccXclrSub;
     private Double oidIccCtrl;


    // Constructors

    /** default constructor */
    public AbstractIccCtrl() {
    }

	/** minimal constructor */
    public AbstractIccCtrl(String iccCurCost, String iccGlSet, String iccCurSet, Double oidIccCtrl) {
        this.iccCurCost = iccCurCost;
        this.iccGlSet = iccGlSet;
        this.iccCurSet = iccCurSet;
        this.oidIccCtrl = oidIccCtrl;
    }
    
    /** full constructor */
    public AbstractIccCtrl(String iccCurCost, Integer iccQadi04, Integer iccJrnl, Boolean iccGlSum, Boolean iccTolFlag, Double iccTolAper100, Double iccTolBper100, Double iccTolCper100, Double iccTolOper100, Double iccTolA, Double iccTolB, Double iccTolC, Double iccTolO, Boolean iccCurAp, Integer iccIssDays, Integer iccQad03, Integer iccQad02, Boolean iccGlTran, Integer iccQad01, Integer iccPkOrd, Boolean iccAscend, String iccUser1, String iccUser2, Integer iccQadi02, String iccGlSet, Boolean iccCogs, String iccQadc01, String iccCurSet, String iccQadc03, String iccXclrAcct, String iccXclrCc, Boolean iccMirror, String iccSite, String iccQadc02, String iccXclrSub, Double oidIccCtrl) {
        this.iccCurCost = iccCurCost;
        this.iccQadi04 = iccQadi04;
        this.iccJrnl = iccJrnl;
        this.iccGlSum = iccGlSum;
        this.iccTolFlag = iccTolFlag;
        this.iccTolAper100 = iccTolAper100;
        this.iccTolBper100 = iccTolBper100;
        this.iccTolCper100 = iccTolCper100;
        this.iccTolOper100 = iccTolOper100;
        this.iccTolA = iccTolA;
        this.iccTolB = iccTolB;
        this.iccTolC = iccTolC;
        this.iccTolO = iccTolO;
        this.iccCurAp = iccCurAp;
        this.iccIssDays = iccIssDays;
        this.iccQad03 = iccQad03;
        this.iccQad02 = iccQad02;
        this.iccGlTran = iccGlTran;
        this.iccQad01 = iccQad01;
        this.iccPkOrd = iccPkOrd;
        this.iccAscend = iccAscend;
        this.iccUser1 = iccUser1;
        this.iccUser2 = iccUser2;
        this.iccQadi02 = iccQadi02;
        this.iccGlSet = iccGlSet;
        this.iccCogs = iccCogs;
        this.iccQadc01 = iccQadc01;
        this.iccCurSet = iccCurSet;
        this.iccQadc03 = iccQadc03;
        this.iccXclrAcct = iccXclrAcct;
        this.iccXclrCc = iccXclrCc;
        this.iccMirror = iccMirror;
        this.iccSite = iccSite;
        this.iccQadc02 = iccQadc02;
        this.iccXclrSub = iccXclrSub;
        this.oidIccCtrl = oidIccCtrl;
    }

   
    // Property accessors

    public String getIccDomain() {
        return this.iccDomain;
    }
    
    public void setIccDomain(String iccDomain) {
        this.iccDomain = iccDomain;
    }

    public String getIccCurCost() {
        return this.iccCurCost;
    }
    
    public void setIccCurCost(String iccCurCost) {
        this.iccCurCost = iccCurCost;
    }

    public Integer getIccQadi04() {
        return this.iccQadi04;
    }
    
    public void setIccQadi04(Integer iccQadi04) {
        this.iccQadi04 = iccQadi04;
    }

    public Integer getIccJrnl() {
        return this.iccJrnl;
    }
    
    public void setIccJrnl(Integer iccJrnl) {
        this.iccJrnl = iccJrnl;
    }

    public Boolean getIccGlSum() {
        return this.iccGlSum;
    }
    
    public void setIccGlSum(Boolean iccGlSum) {
        this.iccGlSum = iccGlSum;
    }

    public Boolean getIccTolFlag() {
        return this.iccTolFlag;
    }
    
    public void setIccTolFlag(Boolean iccTolFlag) {
        this.iccTolFlag = iccTolFlag;
    }

    public Double getIccTolAper100() {
        return this.iccTolAper100;
    }
    
    public void setIccTolAper100(Double iccTolAper100) {
        this.iccTolAper100 = iccTolAper100;
    }

    public Double getIccTolBper100() {
        return this.iccTolBper100;
    }
    
    public void setIccTolBper100(Double iccTolBper100) {
        this.iccTolBper100 = iccTolBper100;
    }

    public Double getIccTolCper100() {
        return this.iccTolCper100;
    }
    
    public void setIccTolCper100(Double iccTolCper100) {
        this.iccTolCper100 = iccTolCper100;
    }

    public Double getIccTolOper100() {
        return this.iccTolOper100;
    }
    
    public void setIccTolOper100(Double iccTolOper100) {
        this.iccTolOper100 = iccTolOper100;
    }

    public Double getIccTolA() {
        return this.iccTolA;
    }
    
    public void setIccTolA(Double iccTolA) {
        this.iccTolA = iccTolA;
    }

    public Double getIccTolB() {
        return this.iccTolB;
    }
    
    public void setIccTolB(Double iccTolB) {
        this.iccTolB = iccTolB;
    }

    public Double getIccTolC() {
        return this.iccTolC;
    }
    
    public void setIccTolC(Double iccTolC) {
        this.iccTolC = iccTolC;
    }

    public Double getIccTolO() {
        return this.iccTolO;
    }
    
    public void setIccTolO(Double iccTolO) {
        this.iccTolO = iccTolO;
    }

    public Boolean getIccCurAp() {
        return this.iccCurAp;
    }
    
    public void setIccCurAp(Boolean iccCurAp) {
        this.iccCurAp = iccCurAp;
    }

    public Integer getIccIssDays() {
        return this.iccIssDays;
    }
    
    public void setIccIssDays(Integer iccIssDays) {
        this.iccIssDays = iccIssDays;
    }

    public Integer getIccQad03() {
        return this.iccQad03;
    }
    
    public void setIccQad03(Integer iccQad03) {
        this.iccQad03 = iccQad03;
    }

    public Integer getIccQad02() {
        return this.iccQad02;
    }
    
    public void setIccQad02(Integer iccQad02) {
        this.iccQad02 = iccQad02;
    }

    public Boolean getIccGlTran() {
        return this.iccGlTran;
    }
    
    public void setIccGlTran(Boolean iccGlTran) {
        this.iccGlTran = iccGlTran;
    }

    public Integer getIccQad01() {
        return this.iccQad01;
    }
    
    public void setIccQad01(Integer iccQad01) {
        this.iccQad01 = iccQad01;
    }

    public Integer getIccPkOrd() {
        return this.iccPkOrd;
    }
    
    public void setIccPkOrd(Integer iccPkOrd) {
        this.iccPkOrd = iccPkOrd;
    }

    public Boolean getIccAscend() {
        return this.iccAscend;
    }
    
    public void setIccAscend(Boolean iccAscend) {
        this.iccAscend = iccAscend;
    }

    public String getIccUser1() {
        return this.iccUser1;
    }
    
    public void setIccUser1(String iccUser1) {
        this.iccUser1 = iccUser1;
    }

    public String getIccUser2() {
        return this.iccUser2;
    }
    
    public void setIccUser2(String iccUser2) {
        this.iccUser2 = iccUser2;
    }

    public Integer getIccQadi02() {
        return this.iccQadi02;
    }
    
    public void setIccQadi02(Integer iccQadi02) {
        this.iccQadi02 = iccQadi02;
    }

    public String getIccGlSet() {
        return this.iccGlSet;
    }
    
    public void setIccGlSet(String iccGlSet) {
        this.iccGlSet = iccGlSet;
    }

    public Boolean getIccCogs() {
        return this.iccCogs;
    }
    
    public void setIccCogs(Boolean iccCogs) {
        this.iccCogs = iccCogs;
    }

    public String getIccQadc01() {
        return this.iccQadc01;
    }
    
    public void setIccQadc01(String iccQadc01) {
        this.iccQadc01 = iccQadc01;
    }

    public String getIccCurSet() {
        return this.iccCurSet;
    }
    
    public void setIccCurSet(String iccCurSet) {
        this.iccCurSet = iccCurSet;
    }

    public String getIccQadc03() {
        return this.iccQadc03;
    }
    
    public void setIccQadc03(String iccQadc03) {
        this.iccQadc03 = iccQadc03;
    }

    public String getIccXclrAcct() {
        return this.iccXclrAcct;
    }
    
    public void setIccXclrAcct(String iccXclrAcct) {
        this.iccXclrAcct = iccXclrAcct;
    }

    public String getIccXclrCc() {
        return this.iccXclrCc;
    }
    
    public void setIccXclrCc(String iccXclrCc) {
        this.iccXclrCc = iccXclrCc;
    }

    public Boolean getIccMirror() {
        return this.iccMirror;
    }
    
    public void setIccMirror(Boolean iccMirror) {
        this.iccMirror = iccMirror;
    }

    public String getIccSite() {
        return this.iccSite;
    }
    
    public void setIccSite(String iccSite) {
        this.iccSite = iccSite;
    }

    public String getIccQadc02() {
        return this.iccQadc02;
    }
    
    public void setIccQadc02(String iccQadc02) {
        this.iccQadc02 = iccQadc02;
    }

    public String getIccXclrSub() {
        return this.iccXclrSub;
    }
    
    public void setIccXclrSub(String iccXclrSub) {
        this.iccXclrSub = iccXclrSub;
    }

    public Double getOidIccCtrl() {
        return this.oidIccCtrl;
    }
    
    public void setOidIccCtrl(Double oidIccCtrl) {
        this.oidIccCtrl = oidIccCtrl;
    }
   








}