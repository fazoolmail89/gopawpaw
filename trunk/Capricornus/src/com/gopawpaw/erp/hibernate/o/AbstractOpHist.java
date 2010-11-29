package com.gopawpaw.erp.hibernate.o;

import java.math.BigDecimal;
import java.util.Date;


/**
 * AbstractOpHist entity provides the base persistence definition of the OpHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOpHist  implements java.io.Serializable {


    // Fields    

     private OpHistId id;
     private String opType;
     private Date opDate;
     private String opEmp;
     private String opWoNbr;
     private Integer opWoOp;
     private Double opActSetup;
     private Double opActRun;
     private Double opQtyWip;
     private Double opQtyComp;
     private Double opQtyRjct;
     private Double opQtyRwrk;
     private Double opSubCost;
     private String opWkctr;
     private String opWoLot;
     private Double opLbrCost;
     private String opRsn;
     private String opRsnRjct;
     private String opRsnRwrk;
     private String opPart;
     private Double opBdnCost;
     private String opQad01;
     private String opQad04;
     private String opProject;
     private Double opLbrStd;
     private Double opBdnStd;
     private Double opStdRun;
     private Double opStdSetup;
     private String opWoSerial;
     private String opShift;
     private Double opSubStd;
     private String opPoNbr;
     private String opDept;
     private String opEarn;
     private String opComment;
     private String opMch;
     private Boolean opMilestone;
     private Date opTranDate;
     private Boolean opPayCalc;
     private Double opLbrOvhd;
     private Double opActRate;
     private BigDecimal opActUnits;
     private Double opStdRate;
     private BigDecimal opStdUnits;
     private Integer opCmtindx;
     private String opTool;
     private Double opProPct;
     private String opUser1;
     private String opUser2;
     private String opQad05;
     private String opQad06;
     private String opQad07;
     private String opQad08;
     private String opQad02;
     private String opQad03;
     private String opChr01;
     private String opChr02;
     private String opChr03;
     private String opChr04;
     private String opChr05;
     private Date opDte01;
     private Date opDte02;
     private Double opDec01;
     private Double opDec02;
     private Boolean opLog01;
     private String opSite;
     private String opProgram;
     private Integer opTime;
     private String opUserid;
     private String opSaNbr;
     private String opFsmType;
     private String opLine;
     private String opRsnDown;
     private Integer opFromOp;
     private Integer opToOp;
     private Double opQtyScrap;
     private Double opQtyAdjust;
     private String opRsnAdjust;
     private String opFscCode;
     private String opFcgCode;
     private String opEngArea;
     private String opCaIntType;
     private Double opPrice;
     private Double opCoveredAmt;
     private String opCurr;
     private Double opExRate;
     private Double opFlbrStd;
     private Double opFlvrteAccr;
     private Double opFlvrtePost;
     private String opSvcType;
     private String opSvCode;
     private Integer opItmLine;
     private Date opCaOpnDate;
     private Double opFlbrCstd;
     private String opEngCode;
     private Integer opSadLine;
     private Double opExRate2;
     private String opExRatetype;
     private Integer opExruSeq;
     private String opWipLotser;
     private String opWipRef;
     private String opRsnScrap;
     private String opUserc03;
     private Integer opUseri01;
     private Double opUserd01;
     private Boolean opUserl01;
     private Date opUsert01;
     private Double oidOpHist;


    // Constructors

    /** default constructor */
    public AbstractOpHist() {
    }

	/** minimal constructor */
    public AbstractOpHist(OpHistId id, String opWoNbr, Double opExRate2, String opExRatetype, Integer opExruSeq, String opUserc03, Integer opUseri01, Double opUserd01, Boolean opUserl01, Double oidOpHist) {
        this.id = id;
        this.opWoNbr = opWoNbr;
        this.opExRate2 = opExRate2;
        this.opExRatetype = opExRatetype;
        this.opExruSeq = opExruSeq;
        this.opUserc03 = opUserc03;
        this.opUseri01 = opUseri01;
        this.opUserd01 = opUserd01;
        this.opUserl01 = opUserl01;
        this.oidOpHist = oidOpHist;
    }
    
    /** full constructor */
    public AbstractOpHist(OpHistId id, String opType, Date opDate, String opEmp, String opWoNbr, Integer opWoOp, Double opActSetup, Double opActRun, Double opQtyWip, Double opQtyComp, Double opQtyRjct, Double opQtyRwrk, Double opSubCost, String opWkctr, String opWoLot, Double opLbrCost, String opRsn, String opRsnRjct, String opRsnRwrk, String opPart, Double opBdnCost, String opQad01, String opQad04, String opProject, Double opLbrStd, Double opBdnStd, Double opStdRun, Double opStdSetup, String opWoSerial, String opShift, Double opSubStd, String opPoNbr, String opDept, String opEarn, String opComment, String opMch, Boolean opMilestone, Date opTranDate, Boolean opPayCalc, Double opLbrOvhd, Double opActRate, BigDecimal opActUnits, Double opStdRate, BigDecimal opStdUnits, Integer opCmtindx, String opTool, Double opProPct, String opUser1, String opUser2, String opQad05, String opQad06, String opQad07, String opQad08, String opQad02, String opQad03, String opChr01, String opChr02, String opChr03, String opChr04, String opChr05, Date opDte01, Date opDte02, Double opDec01, Double opDec02, Boolean opLog01, String opSite, String opProgram, Integer opTime, String opUserid, String opSaNbr, String opFsmType, String opLine, String opRsnDown, Integer opFromOp, Integer opToOp, Double opQtyScrap, Double opQtyAdjust, String opRsnAdjust, String opFscCode, String opFcgCode, String opEngArea, String opCaIntType, Double opPrice, Double opCoveredAmt, String opCurr, Double opExRate, Double opFlbrStd, Double opFlvrteAccr, Double opFlvrtePost, String opSvcType, String opSvCode, Integer opItmLine, Date opCaOpnDate, Double opFlbrCstd, String opEngCode, Integer opSadLine, Double opExRate2, String opExRatetype, Integer opExruSeq, String opWipLotser, String opWipRef, String opRsnScrap, String opUserc03, Integer opUseri01, Double opUserd01, Boolean opUserl01, Date opUsert01, Double oidOpHist) {
        this.id = id;
        this.opType = opType;
        this.opDate = opDate;
        this.opEmp = opEmp;
        this.opWoNbr = opWoNbr;
        this.opWoOp = opWoOp;
        this.opActSetup = opActSetup;
        this.opActRun = opActRun;
        this.opQtyWip = opQtyWip;
        this.opQtyComp = opQtyComp;
        this.opQtyRjct = opQtyRjct;
        this.opQtyRwrk = opQtyRwrk;
        this.opSubCost = opSubCost;
        this.opWkctr = opWkctr;
        this.opWoLot = opWoLot;
        this.opLbrCost = opLbrCost;
        this.opRsn = opRsn;
        this.opRsnRjct = opRsnRjct;
        this.opRsnRwrk = opRsnRwrk;
        this.opPart = opPart;
        this.opBdnCost = opBdnCost;
        this.opQad01 = opQad01;
        this.opQad04 = opQad04;
        this.opProject = opProject;
        this.opLbrStd = opLbrStd;
        this.opBdnStd = opBdnStd;
        this.opStdRun = opStdRun;
        this.opStdSetup = opStdSetup;
        this.opWoSerial = opWoSerial;
        this.opShift = opShift;
        this.opSubStd = opSubStd;
        this.opPoNbr = opPoNbr;
        this.opDept = opDept;
        this.opEarn = opEarn;
        this.opComment = opComment;
        this.opMch = opMch;
        this.opMilestone = opMilestone;
        this.opTranDate = opTranDate;
        this.opPayCalc = opPayCalc;
        this.opLbrOvhd = opLbrOvhd;
        this.opActRate = opActRate;
        this.opActUnits = opActUnits;
        this.opStdRate = opStdRate;
        this.opStdUnits = opStdUnits;
        this.opCmtindx = opCmtindx;
        this.opTool = opTool;
        this.opProPct = opProPct;
        this.opUser1 = opUser1;
        this.opUser2 = opUser2;
        this.opQad05 = opQad05;
        this.opQad06 = opQad06;
        this.opQad07 = opQad07;
        this.opQad08 = opQad08;
        this.opQad02 = opQad02;
        this.opQad03 = opQad03;
        this.opChr01 = opChr01;
        this.opChr02 = opChr02;
        this.opChr03 = opChr03;
        this.opChr04 = opChr04;
        this.opChr05 = opChr05;
        this.opDte01 = opDte01;
        this.opDte02 = opDte02;
        this.opDec01 = opDec01;
        this.opDec02 = opDec02;
        this.opLog01 = opLog01;
        this.opSite = opSite;
        this.opProgram = opProgram;
        this.opTime = opTime;
        this.opUserid = opUserid;
        this.opSaNbr = opSaNbr;
        this.opFsmType = opFsmType;
        this.opLine = opLine;
        this.opRsnDown = opRsnDown;
        this.opFromOp = opFromOp;
        this.opToOp = opToOp;
        this.opQtyScrap = opQtyScrap;
        this.opQtyAdjust = opQtyAdjust;
        this.opRsnAdjust = opRsnAdjust;
        this.opFscCode = opFscCode;
        this.opFcgCode = opFcgCode;
        this.opEngArea = opEngArea;
        this.opCaIntType = opCaIntType;
        this.opPrice = opPrice;
        this.opCoveredAmt = opCoveredAmt;
        this.opCurr = opCurr;
        this.opExRate = opExRate;
        this.opFlbrStd = opFlbrStd;
        this.opFlvrteAccr = opFlvrteAccr;
        this.opFlvrtePost = opFlvrtePost;
        this.opSvcType = opSvcType;
        this.opSvCode = opSvCode;
        this.opItmLine = opItmLine;
        this.opCaOpnDate = opCaOpnDate;
        this.opFlbrCstd = opFlbrCstd;
        this.opEngCode = opEngCode;
        this.opSadLine = opSadLine;
        this.opExRate2 = opExRate2;
        this.opExRatetype = opExRatetype;
        this.opExruSeq = opExruSeq;
        this.opWipLotser = opWipLotser;
        this.opWipRef = opWipRef;
        this.opRsnScrap = opRsnScrap;
        this.opUserc03 = opUserc03;
        this.opUseri01 = opUseri01;
        this.opUserd01 = opUserd01;
        this.opUserl01 = opUserl01;
        this.opUsert01 = opUsert01;
        this.oidOpHist = oidOpHist;
    }

   
    // Property accessors

    public OpHistId getId() {
        return this.id;
    }
    
    public void setId(OpHistId id) {
        this.id = id;
    }

    public String getOpType() {
        return this.opType;
    }
    
    public void setOpType(String opType) {
        this.opType = opType;
    }

    public Date getOpDate() {
        return this.opDate;
    }
    
    public void setOpDate(Date opDate) {
        this.opDate = opDate;
    }

    public String getOpEmp() {
        return this.opEmp;
    }
    
    public void setOpEmp(String opEmp) {
        this.opEmp = opEmp;
    }

    public String getOpWoNbr() {
        return this.opWoNbr;
    }
    
    public void setOpWoNbr(String opWoNbr) {
        this.opWoNbr = opWoNbr;
    }

    public Integer getOpWoOp() {
        return this.opWoOp;
    }
    
    public void setOpWoOp(Integer opWoOp) {
        this.opWoOp = opWoOp;
    }

    public Double getOpActSetup() {
        return this.opActSetup;
    }
    
    public void setOpActSetup(Double opActSetup) {
        this.opActSetup = opActSetup;
    }

    public Double getOpActRun() {
        return this.opActRun;
    }
    
    public void setOpActRun(Double opActRun) {
        this.opActRun = opActRun;
    }

    public Double getOpQtyWip() {
        return this.opQtyWip;
    }
    
    public void setOpQtyWip(Double opQtyWip) {
        this.opQtyWip = opQtyWip;
    }

    public Double getOpQtyComp() {
        return this.opQtyComp;
    }
    
    public void setOpQtyComp(Double opQtyComp) {
        this.opQtyComp = opQtyComp;
    }

    public Double getOpQtyRjct() {
        return this.opQtyRjct;
    }
    
    public void setOpQtyRjct(Double opQtyRjct) {
        this.opQtyRjct = opQtyRjct;
    }

    public Double getOpQtyRwrk() {
        return this.opQtyRwrk;
    }
    
    public void setOpQtyRwrk(Double opQtyRwrk) {
        this.opQtyRwrk = opQtyRwrk;
    }

    public Double getOpSubCost() {
        return this.opSubCost;
    }
    
    public void setOpSubCost(Double opSubCost) {
        this.opSubCost = opSubCost;
    }

    public String getOpWkctr() {
        return this.opWkctr;
    }
    
    public void setOpWkctr(String opWkctr) {
        this.opWkctr = opWkctr;
    }

    public String getOpWoLot() {
        return this.opWoLot;
    }
    
    public void setOpWoLot(String opWoLot) {
        this.opWoLot = opWoLot;
    }

    public Double getOpLbrCost() {
        return this.opLbrCost;
    }
    
    public void setOpLbrCost(Double opLbrCost) {
        this.opLbrCost = opLbrCost;
    }

    public String getOpRsn() {
        return this.opRsn;
    }
    
    public void setOpRsn(String opRsn) {
        this.opRsn = opRsn;
    }

    public String getOpRsnRjct() {
        return this.opRsnRjct;
    }
    
    public void setOpRsnRjct(String opRsnRjct) {
        this.opRsnRjct = opRsnRjct;
    }

    public String getOpRsnRwrk() {
        return this.opRsnRwrk;
    }
    
    public void setOpRsnRwrk(String opRsnRwrk) {
        this.opRsnRwrk = opRsnRwrk;
    }

    public String getOpPart() {
        return this.opPart;
    }
    
    public void setOpPart(String opPart) {
        this.opPart = opPart;
    }

    public Double getOpBdnCost() {
        return this.opBdnCost;
    }
    
    public void setOpBdnCost(Double opBdnCost) {
        this.opBdnCost = opBdnCost;
    }

    public String getOpQad01() {
        return this.opQad01;
    }
    
    public void setOpQad01(String opQad01) {
        this.opQad01 = opQad01;
    }

    public String getOpQad04() {
        return this.opQad04;
    }
    
    public void setOpQad04(String opQad04) {
        this.opQad04 = opQad04;
    }

    public String getOpProject() {
        return this.opProject;
    }
    
    public void setOpProject(String opProject) {
        this.opProject = opProject;
    }

    public Double getOpLbrStd() {
        return this.opLbrStd;
    }
    
    public void setOpLbrStd(Double opLbrStd) {
        this.opLbrStd = opLbrStd;
    }

    public Double getOpBdnStd() {
        return this.opBdnStd;
    }
    
    public void setOpBdnStd(Double opBdnStd) {
        this.opBdnStd = opBdnStd;
    }

    public Double getOpStdRun() {
        return this.opStdRun;
    }
    
    public void setOpStdRun(Double opStdRun) {
        this.opStdRun = opStdRun;
    }

    public Double getOpStdSetup() {
        return this.opStdSetup;
    }
    
    public void setOpStdSetup(Double opStdSetup) {
        this.opStdSetup = opStdSetup;
    }

    public String getOpWoSerial() {
        return this.opWoSerial;
    }
    
    public void setOpWoSerial(String opWoSerial) {
        this.opWoSerial = opWoSerial;
    }

    public String getOpShift() {
        return this.opShift;
    }
    
    public void setOpShift(String opShift) {
        this.opShift = opShift;
    }

    public Double getOpSubStd() {
        return this.opSubStd;
    }
    
    public void setOpSubStd(Double opSubStd) {
        this.opSubStd = opSubStd;
    }

    public String getOpPoNbr() {
        return this.opPoNbr;
    }
    
    public void setOpPoNbr(String opPoNbr) {
        this.opPoNbr = opPoNbr;
    }

    public String getOpDept() {
        return this.opDept;
    }
    
    public void setOpDept(String opDept) {
        this.opDept = opDept;
    }

    public String getOpEarn() {
        return this.opEarn;
    }
    
    public void setOpEarn(String opEarn) {
        this.opEarn = opEarn;
    }

    public String getOpComment() {
        return this.opComment;
    }
    
    public void setOpComment(String opComment) {
        this.opComment = opComment;
    }

    public String getOpMch() {
        return this.opMch;
    }
    
    public void setOpMch(String opMch) {
        this.opMch = opMch;
    }

    public Boolean getOpMilestone() {
        return this.opMilestone;
    }
    
    public void setOpMilestone(Boolean opMilestone) {
        this.opMilestone = opMilestone;
    }

    public Date getOpTranDate() {
        return this.opTranDate;
    }
    
    public void setOpTranDate(Date opTranDate) {
        this.opTranDate = opTranDate;
    }

    public Boolean getOpPayCalc() {
        return this.opPayCalc;
    }
    
    public void setOpPayCalc(Boolean opPayCalc) {
        this.opPayCalc = opPayCalc;
    }

    public Double getOpLbrOvhd() {
        return this.opLbrOvhd;
    }
    
    public void setOpLbrOvhd(Double opLbrOvhd) {
        this.opLbrOvhd = opLbrOvhd;
    }

    public Double getOpActRate() {
        return this.opActRate;
    }
    
    public void setOpActRate(Double opActRate) {
        this.opActRate = opActRate;
    }

    public BigDecimal getOpActUnits() {
        return this.opActUnits;
    }
    
    public void setOpActUnits(BigDecimal opActUnits) {
        this.opActUnits = opActUnits;
    }

    public Double getOpStdRate() {
        return this.opStdRate;
    }
    
    public void setOpStdRate(Double opStdRate) {
        this.opStdRate = opStdRate;
    }

    public BigDecimal getOpStdUnits() {
        return this.opStdUnits;
    }
    
    public void setOpStdUnits(BigDecimal opStdUnits) {
        this.opStdUnits = opStdUnits;
    }

    public Integer getOpCmtindx() {
        return this.opCmtindx;
    }
    
    public void setOpCmtindx(Integer opCmtindx) {
        this.opCmtindx = opCmtindx;
    }

    public String getOpTool() {
        return this.opTool;
    }
    
    public void setOpTool(String opTool) {
        this.opTool = opTool;
    }

    public Double getOpProPct() {
        return this.opProPct;
    }
    
    public void setOpProPct(Double opProPct) {
        this.opProPct = opProPct;
    }

    public String getOpUser1() {
        return this.opUser1;
    }
    
    public void setOpUser1(String opUser1) {
        this.opUser1 = opUser1;
    }

    public String getOpUser2() {
        return this.opUser2;
    }
    
    public void setOpUser2(String opUser2) {
        this.opUser2 = opUser2;
    }

    public String getOpQad05() {
        return this.opQad05;
    }
    
    public void setOpQad05(String opQad05) {
        this.opQad05 = opQad05;
    }

    public String getOpQad06() {
        return this.opQad06;
    }
    
    public void setOpQad06(String opQad06) {
        this.opQad06 = opQad06;
    }

    public String getOpQad07() {
        return this.opQad07;
    }
    
    public void setOpQad07(String opQad07) {
        this.opQad07 = opQad07;
    }

    public String getOpQad08() {
        return this.opQad08;
    }
    
    public void setOpQad08(String opQad08) {
        this.opQad08 = opQad08;
    }

    public String getOpQad02() {
        return this.opQad02;
    }
    
    public void setOpQad02(String opQad02) {
        this.opQad02 = opQad02;
    }

    public String getOpQad03() {
        return this.opQad03;
    }
    
    public void setOpQad03(String opQad03) {
        this.opQad03 = opQad03;
    }

    public String getOpChr01() {
        return this.opChr01;
    }
    
    public void setOpChr01(String opChr01) {
        this.opChr01 = opChr01;
    }

    public String getOpChr02() {
        return this.opChr02;
    }
    
    public void setOpChr02(String opChr02) {
        this.opChr02 = opChr02;
    }

    public String getOpChr03() {
        return this.opChr03;
    }
    
    public void setOpChr03(String opChr03) {
        this.opChr03 = opChr03;
    }

    public String getOpChr04() {
        return this.opChr04;
    }
    
    public void setOpChr04(String opChr04) {
        this.opChr04 = opChr04;
    }

    public String getOpChr05() {
        return this.opChr05;
    }
    
    public void setOpChr05(String opChr05) {
        this.opChr05 = opChr05;
    }

    public Date getOpDte01() {
        return this.opDte01;
    }
    
    public void setOpDte01(Date opDte01) {
        this.opDte01 = opDte01;
    }

    public Date getOpDte02() {
        return this.opDte02;
    }
    
    public void setOpDte02(Date opDte02) {
        this.opDte02 = opDte02;
    }

    public Double getOpDec01() {
        return this.opDec01;
    }
    
    public void setOpDec01(Double opDec01) {
        this.opDec01 = opDec01;
    }

    public Double getOpDec02() {
        return this.opDec02;
    }
    
    public void setOpDec02(Double opDec02) {
        this.opDec02 = opDec02;
    }

    public Boolean getOpLog01() {
        return this.opLog01;
    }
    
    public void setOpLog01(Boolean opLog01) {
        this.opLog01 = opLog01;
    }

    public String getOpSite() {
        return this.opSite;
    }
    
    public void setOpSite(String opSite) {
        this.opSite = opSite;
    }

    public String getOpProgram() {
        return this.opProgram;
    }
    
    public void setOpProgram(String opProgram) {
        this.opProgram = opProgram;
    }

    public Integer getOpTime() {
        return this.opTime;
    }
    
    public void setOpTime(Integer opTime) {
        this.opTime = opTime;
    }

    public String getOpUserid() {
        return this.opUserid;
    }
    
    public void setOpUserid(String opUserid) {
        this.opUserid = opUserid;
    }

    public String getOpSaNbr() {
        return this.opSaNbr;
    }
    
    public void setOpSaNbr(String opSaNbr) {
        this.opSaNbr = opSaNbr;
    }

    public String getOpFsmType() {
        return this.opFsmType;
    }
    
    public void setOpFsmType(String opFsmType) {
        this.opFsmType = opFsmType;
    }

    public String getOpLine() {
        return this.opLine;
    }
    
    public void setOpLine(String opLine) {
        this.opLine = opLine;
    }

    public String getOpRsnDown() {
        return this.opRsnDown;
    }
    
    public void setOpRsnDown(String opRsnDown) {
        this.opRsnDown = opRsnDown;
    }

    public Integer getOpFromOp() {
        return this.opFromOp;
    }
    
    public void setOpFromOp(Integer opFromOp) {
        this.opFromOp = opFromOp;
    }

    public Integer getOpToOp() {
        return this.opToOp;
    }
    
    public void setOpToOp(Integer opToOp) {
        this.opToOp = opToOp;
    }

    public Double getOpQtyScrap() {
        return this.opQtyScrap;
    }
    
    public void setOpQtyScrap(Double opQtyScrap) {
        this.opQtyScrap = opQtyScrap;
    }

    public Double getOpQtyAdjust() {
        return this.opQtyAdjust;
    }
    
    public void setOpQtyAdjust(Double opQtyAdjust) {
        this.opQtyAdjust = opQtyAdjust;
    }

    public String getOpRsnAdjust() {
        return this.opRsnAdjust;
    }
    
    public void setOpRsnAdjust(String opRsnAdjust) {
        this.opRsnAdjust = opRsnAdjust;
    }

    public String getOpFscCode() {
        return this.opFscCode;
    }
    
    public void setOpFscCode(String opFscCode) {
        this.opFscCode = opFscCode;
    }

    public String getOpFcgCode() {
        return this.opFcgCode;
    }
    
    public void setOpFcgCode(String opFcgCode) {
        this.opFcgCode = opFcgCode;
    }

    public String getOpEngArea() {
        return this.opEngArea;
    }
    
    public void setOpEngArea(String opEngArea) {
        this.opEngArea = opEngArea;
    }

    public String getOpCaIntType() {
        return this.opCaIntType;
    }
    
    public void setOpCaIntType(String opCaIntType) {
        this.opCaIntType = opCaIntType;
    }

    public Double getOpPrice() {
        return this.opPrice;
    }
    
    public void setOpPrice(Double opPrice) {
        this.opPrice = opPrice;
    }

    public Double getOpCoveredAmt() {
        return this.opCoveredAmt;
    }
    
    public void setOpCoveredAmt(Double opCoveredAmt) {
        this.opCoveredAmt = opCoveredAmt;
    }

    public String getOpCurr() {
        return this.opCurr;
    }
    
    public void setOpCurr(String opCurr) {
        this.opCurr = opCurr;
    }

    public Double getOpExRate() {
        return this.opExRate;
    }
    
    public void setOpExRate(Double opExRate) {
        this.opExRate = opExRate;
    }

    public Double getOpFlbrStd() {
        return this.opFlbrStd;
    }
    
    public void setOpFlbrStd(Double opFlbrStd) {
        this.opFlbrStd = opFlbrStd;
    }

    public Double getOpFlvrteAccr() {
        return this.opFlvrteAccr;
    }
    
    public void setOpFlvrteAccr(Double opFlvrteAccr) {
        this.opFlvrteAccr = opFlvrteAccr;
    }

    public Double getOpFlvrtePost() {
        return this.opFlvrtePost;
    }
    
    public void setOpFlvrtePost(Double opFlvrtePost) {
        this.opFlvrtePost = opFlvrtePost;
    }

    public String getOpSvcType() {
        return this.opSvcType;
    }
    
    public void setOpSvcType(String opSvcType) {
        this.opSvcType = opSvcType;
    }

    public String getOpSvCode() {
        return this.opSvCode;
    }
    
    public void setOpSvCode(String opSvCode) {
        this.opSvCode = opSvCode;
    }

    public Integer getOpItmLine() {
        return this.opItmLine;
    }
    
    public void setOpItmLine(Integer opItmLine) {
        this.opItmLine = opItmLine;
    }

    public Date getOpCaOpnDate() {
        return this.opCaOpnDate;
    }
    
    public void setOpCaOpnDate(Date opCaOpnDate) {
        this.opCaOpnDate = opCaOpnDate;
    }

    public Double getOpFlbrCstd() {
        return this.opFlbrCstd;
    }
    
    public void setOpFlbrCstd(Double opFlbrCstd) {
        this.opFlbrCstd = opFlbrCstd;
    }

    public String getOpEngCode() {
        return this.opEngCode;
    }
    
    public void setOpEngCode(String opEngCode) {
        this.opEngCode = opEngCode;
    }

    public Integer getOpSadLine() {
        return this.opSadLine;
    }
    
    public void setOpSadLine(Integer opSadLine) {
        this.opSadLine = opSadLine;
    }

    public Double getOpExRate2() {
        return this.opExRate2;
    }
    
    public void setOpExRate2(Double opExRate2) {
        this.opExRate2 = opExRate2;
    }

    public String getOpExRatetype() {
        return this.opExRatetype;
    }
    
    public void setOpExRatetype(String opExRatetype) {
        this.opExRatetype = opExRatetype;
    }

    public Integer getOpExruSeq() {
        return this.opExruSeq;
    }
    
    public void setOpExruSeq(Integer opExruSeq) {
        this.opExruSeq = opExruSeq;
    }

    public String getOpWipLotser() {
        return this.opWipLotser;
    }
    
    public void setOpWipLotser(String opWipLotser) {
        this.opWipLotser = opWipLotser;
    }

    public String getOpWipRef() {
        return this.opWipRef;
    }
    
    public void setOpWipRef(String opWipRef) {
        this.opWipRef = opWipRef;
    }

    public String getOpRsnScrap() {
        return this.opRsnScrap;
    }
    
    public void setOpRsnScrap(String opRsnScrap) {
        this.opRsnScrap = opRsnScrap;
    }

    public String getOpUserc03() {
        return this.opUserc03;
    }
    
    public void setOpUserc03(String opUserc03) {
        this.opUserc03 = opUserc03;
    }

    public Integer getOpUseri01() {
        return this.opUseri01;
    }
    
    public void setOpUseri01(Integer opUseri01) {
        this.opUseri01 = opUseri01;
    }

    public Double getOpUserd01() {
        return this.opUserd01;
    }
    
    public void setOpUserd01(Double opUserd01) {
        this.opUserd01 = opUserd01;
    }

    public Boolean getOpUserl01() {
        return this.opUserl01;
    }
    
    public void setOpUserl01(Boolean opUserl01) {
        this.opUserl01 = opUserl01;
    }

    public Date getOpUsert01() {
        return this.opUsert01;
    }
    
    public void setOpUsert01(Date opUsert01) {
        this.opUsert01 = opUsert01;
    }

    public Double getOidOpHist() {
        return this.oidOpHist;
    }
    
    public void setOidOpHist(Double oidOpHist) {
        this.oidOpHist = oidOpHist;
    }
   








}