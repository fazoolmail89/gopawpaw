package com.gopawpaw.erp.hibernate.f;

/**
 * FrmMstrId entity. @author MyEclipse Persistence Tools
 */
public class FrmMstrId extends AbstractFrmMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FrmMstrId() {
	}

	/** minimal constructor */
	public FrmMstrId(String frmDomain) {
		super(frmDomain);
	}

	/** full constructor */
	public FrmMstrId(String frmDomain, String frmCode) {
		super(frmDomain, frmCode);
	}

}
