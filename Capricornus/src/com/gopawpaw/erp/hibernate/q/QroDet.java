package com.gopawpaw.erp.hibernate.q;

import java.util.Date;

/**
 * QroDet entity. @author MyEclipse Persistence Tools
 */
public class QroDet extends AbstractQroDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public QroDet() {
	}

	/** minimal constructor */
	public QroDet(QroDetId id, Double oidQroDet) {
		super(id, oidQroDet);
	}

	/** full constructor */
	public QroDet(QroDetId id, Integer qroCmtindx, String qroDesc,
			String qroMch, Integer qroMchOp, Double qroQueue, String qroTool,
			String qroUser1, String qroUser2, String qroWkctr, String qroChr01,
			String qroChr02, String qroChr03, String qroChr04, String qroChr05,
			Double qroDec01, Double qroDec02, Date qroDte01, Date qroDte02,
			Boolean qroLog01, Double oidQroDet) {
		super(id, qroCmtindx, qroDesc, qroMch, qroMchOp, qroQueue, qroTool,
				qroUser1, qroUser2, qroWkctr, qroChr01, qroChr02, qroChr03,
				qroChr04, qroChr05, qroDec01, qroDec02, qroDte01, qroDte02,
				qroLog01, oidQroDet);
	}

}
