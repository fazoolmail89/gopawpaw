package com.gopawpaw.erp.hibernate.o;

import java.math.BigDecimal;
import java.util.Date;


/**
 * OpHist entity. @author MyEclipse Persistence Tools
 */
public class OpHist extends AbstractOpHist implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public OpHist() {
    }

	/** minimal constructor */
    public OpHist(OpHistId id, String opWoNbr, Double opExRate2, String opExRatetype, Integer opExruSeq, String opUserc03, Integer opUseri01, Double opUserd01, Boolean opUserl01, Double oidOpHist) {
        super(id, opWoNbr, opExRate2, opExRatetype, opExruSeq, opUserc03, opUseri01, opUserd01, opUserl01, oidOpHist);        
    }
    
    /** full constructor */
    public OpHist(OpHistId id, String opType, Date opDate, String opEmp, String opWoNbr, Integer opWoOp, Double opActSetup, Double opActRun, Double opQtyWip, Double opQtyComp, Double opQtyRjct, Double opQtyRwrk, Double opSubCost, String opWkctr, String opWoLot, Double opLbrCost, String opRsn, String opRsnRjct, String opRsnRwrk, String opPart, Double opBdnCost, String opQad01, String opQad04, String opProject, Double opLbrStd, Double opBdnStd, Double opStdRun, Double opStdSetup, String opWoSerial, String opShift, Double opSubStd, String opPoNbr, String opDept, String opEarn, String opComment, String opMch, Boolean opMilestone, Date opTranDate, Boolean opPayCalc, Double opLbrOvhd, Double opActRate, BigDecimal opActUnits, Double opStdRate, BigDecimal opStdUnits, Integer opCmtindx, String opTool, Double opProPct, String opUser1, String opUser2, String opQad05, String opQad06, String opQad07, String opQad08, String opQad02, String opQad03, String opChr01, String opChr02, String opChr03, String opChr04, String opChr05, Date opDte01, Date opDte02, Double opDec01, Double opDec02, Boolean opLog01, String opSite, String opProgram, Integer opTime, String opUserid, String opSaNbr, String opFsmType, String opLine, String opRsnDown, Integer opFromOp, Integer opToOp, Double opQtyScrap, Double opQtyAdjust, String opRsnAdjust, String opFscCode, String opFcgCode, String opEngArea, String opCaIntType, Double opPrice, Double opCoveredAmt, String opCurr, Double opExRate, Double opFlbrStd, Double opFlvrteAccr, Double opFlvrtePost, String opSvcType, String opSvCode, Integer opItmLine, Date opCaOpnDate, Double opFlbrCstd, String opEngCode, Integer opSadLine, Double opExRate2, String opExRatetype, Integer opExruSeq, String opWipLotser, String opWipRef, String opRsnScrap, String opUserc03, Integer opUseri01, Double opUserd01, Boolean opUserl01, Date opUsert01, Double oidOpHist) {
        super(id, opType, opDate, opEmp, opWoNbr, opWoOp, opActSetup, opActRun, opQtyWip, opQtyComp, opQtyRjct, opQtyRwrk, opSubCost, opWkctr, opWoLot, opLbrCost, opRsn, opRsnRjct, opRsnRwrk, opPart, opBdnCost, opQad01, opQad04, opProject, opLbrStd, opBdnStd, opStdRun, opStdSetup, opWoSerial, opShift, opSubStd, opPoNbr, opDept, opEarn, opComment, opMch, opMilestone, opTranDate, opPayCalc, opLbrOvhd, opActRate, opActUnits, opStdRate, opStdUnits, opCmtindx, opTool, opProPct, opUser1, opUser2, opQad05, opQad06, opQad07, opQad08, opQad02, opQad03, opChr01, opChr02, opChr03, opChr04, opChr05, opDte01, opDte02, opDec01, opDec02, opLog01, opSite, opProgram, opTime, opUserid, opSaNbr, opFsmType, opLine, opRsnDown, opFromOp, opToOp, opQtyScrap, opQtyAdjust, opRsnAdjust, opFscCode, opFcgCode, opEngArea, opCaIntType, opPrice, opCoveredAmt, opCurr, opExRate, opFlbrStd, opFlvrteAccr, opFlvrtePost, opSvcType, opSvCode, opItmLine, opCaOpnDate, opFlbrCstd, opEngCode, opSadLine, opExRate2, opExRatetype, opExruSeq, opWipLotser, opWipRef, opRsnScrap, opUserc03, opUseri01, opUserd01, opUserl01, opUsert01, oidOpHist);        
    }
   
}
