package com.gopawpaw.erp.hibernate.q;

import java.util.Date;

/**
 * QobDet entity. @author MyEclipse Persistence Tools
 */
public class QobDet extends AbstractQobDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public QobDet() {
	}

	/** minimal constructor */
	public QobDet(QobDetId id, String qobParent, Double oidQobDet) {
		super(id, qobParent, oidQobDet);
	}

	/** full constructor */
	public QobDet(QobDetId id, Date qobIssDate, Double qobQtyReq,
			Double qobQtyAll, Double qobQtyPick, Double qobQtyIss,
			Double qobTotStd, Double qobQtyChg, Double qobBoChg,
			Double qobPrice, String qobLoc, String qobSerial,
			Integer qobCmtindx, String qobUser1, String qobUser2,
			String qobSite, String qobParent, String qobQadc01,
			String qobCfgType, Double oidQobDet) {
		super(id, qobIssDate, qobQtyReq, qobQtyAll, qobQtyPick, qobQtyIss,
				qobTotStd, qobQtyChg, qobBoChg, qobPrice, qobLoc, qobSerial,
				qobCmtindx, qobUser1, qobUser2, qobSite, qobParent, qobQadc01,
				qobCfgType, oidQobDet);
	}

}
