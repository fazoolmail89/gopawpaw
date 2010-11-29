package com.gopawpaw.erp.hibernate.i;



/**
 * IccCtrl entity. @author MyEclipse Persistence Tools
 */
public class IccCtrl extends AbstractIccCtrl implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public IccCtrl() {
    }

	/** minimal constructor */
    public IccCtrl(String iccCurCost, String iccGlSet, String iccCurSet, Double oidIccCtrl) {
        super(iccCurCost, iccGlSet, iccCurSet, oidIccCtrl);        
    }
    
    /** full constructor */
    public IccCtrl(String iccCurCost, Integer iccQadi04, Integer iccJrnl, Boolean iccGlSum, Boolean iccTolFlag, Double iccTolAper100, Double iccTolBper100, Double iccTolCper100, Double iccTolOper100, Double iccTolA, Double iccTolB, Double iccTolC, Double iccTolO, Boolean iccCurAp, Integer iccIssDays, Integer iccQad03, Integer iccQad02, Boolean iccGlTran, Integer iccQad01, Integer iccPkOrd, Boolean iccAscend, String iccUser1, String iccUser2, Integer iccQadi02, String iccGlSet, Boolean iccCogs, String iccQadc01, String iccCurSet, String iccQadc03, String iccXclrAcct, String iccXclrCc, Boolean iccMirror, String iccSite, String iccQadc02, String iccXclrSub, Double oidIccCtrl) {
        super(iccCurCost, iccQadi04, iccJrnl, iccGlSum, iccTolFlag, iccTolAper100, iccTolBper100, iccTolCper100, iccTolOper100, iccTolA, iccTolB, iccTolC, iccTolO, iccCurAp, iccIssDays, iccQad03, iccQad02, iccGlTran, iccQad01, iccPkOrd, iccAscend, iccUser1, iccUser2, iccQadi02, iccGlSet, iccCogs, iccQadc01, iccCurSet, iccQadc03, iccXclrAcct, iccXclrCc, iccMirror, iccSite, iccQadc02, iccXclrSub, oidIccCtrl);        
    }
   
}
