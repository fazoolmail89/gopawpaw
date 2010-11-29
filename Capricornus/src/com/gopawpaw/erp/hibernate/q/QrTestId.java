package com.gopawpaw.erp.hibernate.q;

/**
 * QrTestId entity. @author MyEclipse Persistence Tools
 */
public class QrTestId extends AbstractQrTestId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public QrTestId() {
	}

	/** minimal constructor */
	public QrTestId(String qrDomain, String qrNbr, Integer qrOp) {
		super(qrDomain, qrNbr, qrOp);
	}

	/** full constructor */
	public QrTestId(String qrDomain, String qrNbr, String qrLot, Integer qrOp) {
		super(qrDomain, qrNbr, qrLot, qrOp);
	}

}
