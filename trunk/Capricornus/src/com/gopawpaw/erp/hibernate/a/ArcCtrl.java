package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * ArcCtrl entity. @author MyEclipse Persistence Tools
 */
public class ArcCtrl extends AbstractArcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ArcCtrl() {
	}

	/** minimal constructor */
	public ArcCtrl(String arcNxtPmt, String arcNxtDrft, String arcCollMthd,
			Boolean arcExtDrftRef, Double arcDrftMin, Double arcDrftMax,
			String arcQadc01, String arcQadc02, String arcExRatetype,
			Double oidArcCtrl) {
		super(arcNxtPmt, arcNxtDrft, arcCollMthd, arcExtDrftRef, arcDrftMin,
				arcDrftMax, arcQadc01, arcQadc02, arcExRatetype, oidArcCtrl);
	}

	/** full constructor */
	public ArcCtrl(Integer arcMemo, Integer arcBatch, Integer arcJrnl,
			Boolean arcGlSum, Integer arcQad01, String arcUser1,
			String arcUser2, String arcQad03, Date arcQad02, Integer arcQadi01,
			String arcQadc03, String arcQadc05, Double arcExTol,
			String arcMemoPre, String arcDrftAcc, String arcDrftCc,
			Boolean arcUseDrft, Boolean arcAutoDrft, Boolean arcAutoLateInt,
			String arcNxtPmt, String arcNxtDrft, String arcCollMthd,
			Boolean arcExtDrftRef, Double arcDrftMin, Double arcDrftMax,
			String arcQadc01, String arcQadc02, String arcExRatetype,
			Integer arcSumLvl, String arcDrftSub, String arcQadc04,
			Double oidArcCtrl) {
		super(arcMemo, arcBatch, arcJrnl, arcGlSum, arcQad01, arcUser1,
				arcUser2, arcQad03, arcQad02, arcQadi01, arcQadc03, arcQadc05,
				arcExTol, arcMemoPre, arcDrftAcc, arcDrftCc, arcUseDrft,
				arcAutoDrft, arcAutoLateInt, arcNxtPmt, arcNxtDrft,
				arcCollMthd, arcExtDrftRef, arcDrftMin, arcDrftMax, arcQadc01,
				arcQadc02, arcExRatetype, arcSumLvl, arcDrftSub, arcQadc04,
				oidArcCtrl);
	}

}
