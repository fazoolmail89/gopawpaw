package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * WrRoute entity. @author MyEclipse Persistence Tools
 */
public class WrRoute extends AbstractWrRoute implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public WrRoute() {
	}

	/** minimal constructor */
	public WrRoute(WrRouteId id, Double oidWrRoute) {
		super(id, oidWrRoute);
	}

	/** full constructor */
	public WrRoute(WrRouteId id, String wrDesc, String wrWkctr, Double wrMchOp,
			Double wrSetup, Double wrRun, Double wrMove, Double wrActSetup,
			Double wrActRun, Double wrQtyOrd, Double wrQtyWip,
			Double wrQtyComp, Double wrQtyRjct, Double wrQtyRwrk,
			String wrStatus, String wrTool, String wrVend, String wrPoNbr,
			Date wrStart, Date wrDue, Double wrSubAct, Double wrYieldPct,
			String wrPart, Double wrBdnStd, Double wrBdnAct, Double wrLbrStd,
			Double wrLbrAct, Double wrSubStd, Integer wrCmtindx, String wrMch,
			Boolean wrMilestone, String wrUser1, String wrUser2,
			String wrStdOp, Double wrSetupMen, Double wrMenMch,
			Integer wrTranQty, Double wrLbrOvhd, Double wrQueue, Double wrWait,
			Integer wrSubLead, Double wrQtyMove, String wrChr01,
			String wrChr02, String wrChr03, String wrChr04, String wrChr05,
			Date wrDte01, Date wrDte02, Double wrDec01, Double wrDec02,
			Boolean wrLog01, Double wrMtlTotx, Double wrLbrTotx,
			Double wrBdnTotx, Double wrSubTotx, Double wrOvhTotx,
			Double wrLvusePost, Double wrBvusePost, Double wrSvusePost,
			Double wrSubComp, Double wrLvrtePost, Double wrBvrtePost,
			Double wrSvrtePost, Double wrLvrteAccr, Double wrLvuseAccr,
			Double wrBvrteAccr, Double wrBvuseAccr, Double wrSvrteAccr,
			Double wrSvuseAccr, Double wrLvrteRval, Double wrLvuseRval,
			Double wrBvrteRval, Double wrBvuseRval, Double wrSvrteRval,
			Double wrSvuseRval, Double wrSubCost, Double wrSetupRte,
			Double wrLbrRate, Double wrBdnPct, Double wrBdnRate,
			Double wrMchBdn, Double wrSlvusePost, Double wrSbvusePost,
			Double wrQtyInque, Double wrQtyOutque, Double wrQtyRejque,
			Double wrQtyInqueb, Double wrQtyOutqueb, Double wrQtyRejqueb,
			Double wrQtyCumrjct, Double wrQtyCumoscrap, Double wrQtyCumrscrap,
			Double wrQtyCumoadj, Double wrQtyCumradj, Double wrQtyCummove,
			Double wrQtyCumproc, Double wrQtyCumrwrk, Integer wrPoLine,
			String wrWipmtlPart, Double wrMtlAct, Boolean wrMvNxtOp,
			Double wrLbrLlAct, Double wrBdnLlAct, Double wrSubLlAct,
			Double wrMtlLlAct, Double wrOvhAct, Double wrOvhLlAct,
			Double wrLbrLlTotx, Double wrBdnLlTotx, Double wrSubLlTotx,
			Double wrMtlLlTotx, Double wrOvhLlTotx, Boolean wrAutoLbr,
			String wrCaIntType, Double wrCoveredAmt, String wrCurr,
			String wrEndTime, String wrEngCode, String wrFcgCode,
			Integer wrFcgIndex, Integer wrFisColumn, String wrFisSort,
			String wrFscCode, String wrFsmType, Double wrListPr,
			Double wrPrice, String wrProdLine, Double wrFlbrStd,
			Double wrPostedRun, String wrStTime, Double wrActPosted,
			Boolean wrExpense, Double wrFlbrCstd, Double wrCoveredPost,
			String wrProject, String wrUm, Double wrQadd05, Double wrFbdnStd,
			String wrSvCode, Integer wrItmLine, String wrQadc01,
			String wrQadc02, String wrQadc03, String wrQadc04, Double wrQade01,
			Double wrQade02, Double wrQade03, Double wrQade04,
			Integer wrQadi01, Integer wrQadi02, Boolean wrQadl01,
			Boolean wrQadl02, Double wrUnprocessedAmt, Double oidWrRoute) {
		super(id, wrDesc, wrWkctr, wrMchOp, wrSetup, wrRun, wrMove, wrActSetup,
				wrActRun, wrQtyOrd, wrQtyWip, wrQtyComp, wrQtyRjct, wrQtyRwrk,
				wrStatus, wrTool, wrVend, wrPoNbr, wrStart, wrDue, wrSubAct,
				wrYieldPct, wrPart, wrBdnStd, wrBdnAct, wrLbrStd, wrLbrAct,
				wrSubStd, wrCmtindx, wrMch, wrMilestone, wrUser1, wrUser2,
				wrStdOp, wrSetupMen, wrMenMch, wrTranQty, wrLbrOvhd, wrQueue,
				wrWait, wrSubLead, wrQtyMove, wrChr01, wrChr02, wrChr03,
				wrChr04, wrChr05, wrDte01, wrDte02, wrDec01, wrDec02, wrLog01,
				wrMtlTotx, wrLbrTotx, wrBdnTotx, wrSubTotx, wrOvhTotx,
				wrLvusePost, wrBvusePost, wrSvusePost, wrSubComp, wrLvrtePost,
				wrBvrtePost, wrSvrtePost, wrLvrteAccr, wrLvuseAccr,
				wrBvrteAccr, wrBvuseAccr, wrSvrteAccr, wrSvuseAccr,
				wrLvrteRval, wrLvuseRval, wrBvrteRval, wrBvuseRval,
				wrSvrteRval, wrSvuseRval, wrSubCost, wrSetupRte, wrLbrRate,
				wrBdnPct, wrBdnRate, wrMchBdn, wrSlvusePost, wrSbvusePost,
				wrQtyInque, wrQtyOutque, wrQtyRejque, wrQtyInqueb,
				wrQtyOutqueb, wrQtyRejqueb, wrQtyCumrjct, wrQtyCumoscrap,
				wrQtyCumrscrap, wrQtyCumoadj, wrQtyCumradj, wrQtyCummove,
				wrQtyCumproc, wrQtyCumrwrk, wrPoLine, wrWipmtlPart, wrMtlAct,
				wrMvNxtOp, wrLbrLlAct, wrBdnLlAct, wrSubLlAct, wrMtlLlAct,
				wrOvhAct, wrOvhLlAct, wrLbrLlTotx, wrBdnLlTotx, wrSubLlTotx,
				wrMtlLlTotx, wrOvhLlTotx, wrAutoLbr, wrCaIntType, wrCoveredAmt,
				wrCurr, wrEndTime, wrEngCode, wrFcgCode, wrFcgIndex,
				wrFisColumn, wrFisSort, wrFscCode, wrFsmType, wrListPr,
				wrPrice, wrProdLine, wrFlbrStd, wrPostedRun, wrStTime,
				wrActPosted, wrExpense, wrFlbrCstd, wrCoveredPost, wrProject,
				wrUm, wrQadd05, wrFbdnStd, wrSvCode, wrItmLine, wrQadc01,
				wrQadc02, wrQadc03, wrQadc04, wrQade01, wrQade02, wrQade03,
				wrQade04, wrQadi01, wrQadi02, wrQadl01, wrQadl02,
				wrUnprocessedAmt, oidWrRoute);
	}

}
