package com.gopawpaw.erp.hibernate.q;

import java.util.Date;

/**
 * QrTest entity. @author MyEclipse Persistence Tools
 */
public class QrTest extends AbstractQrTest implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public QrTest() {
	}

	/** minimal constructor */
	public QrTest(QrTestId id, Double oidQrTest) {
		super(id, oidQrTest);
	}

	/** full constructor */
	public QrTest(QrTestId id, Double qrOpTime, Double qrActOp,
			Integer qrCmtindx, String qrDesc, Date qrDue, String qrPart,
			Double qrQtyAccpt, Double qrQtyOrd, Double qrQtyRjct, Date qrStart,
			String qrStatus, String qrTool, String qrUser1, String qrUser2,
			String qrWkctr, String qrChr01, String qrChr02, String qrChr03,
			String qrChr04, String qrChr05, Double qrDec01, Double qrDec02,
			Date qrDte01, Date qrDte02, Boolean qrLog01, String qrMch,
			Double oidQrTest) {
		super(id, qrOpTime, qrActOp, qrCmtindx, qrDesc, qrDue, qrPart,
				qrQtyAccpt, qrQtyOrd, qrQtyRjct, qrStart, qrStatus, qrTool,
				qrUser1, qrUser2, qrWkctr, qrChr01, qrChr02, qrChr03, qrChr04,
				qrChr05, qrDec01, qrDec02, qrDte01, qrDte02, qrLog01, qrMch,
				oidQrTest);
	}

}
