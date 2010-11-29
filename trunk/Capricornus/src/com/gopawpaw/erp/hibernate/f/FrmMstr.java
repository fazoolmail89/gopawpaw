package com.gopawpaw.erp.hibernate.f;

/**
 * FrmMstr entity. @author MyEclipse Persistence Tools
 */
public class FrmMstr extends AbstractFrmMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FrmMstr() {
	}

	/** minimal constructor */
	public FrmMstr(FrmMstrId id, Double oidFrmMstr) {
		super(id, oidFrmMstr);
	}

	/** full constructor */
	public FrmMstr(FrmMstrId id, String frmDesc, String frmCurr, String frmUm,
			Double frmRateQty, String frmUser1, String frmUser2,
			String frmQadc01, Double oidFrmMstr) {
		super(id, frmDesc, frmCurr, frmUm, frmRateQty, frmUser1, frmUser2,
				frmQadc01, oidFrmMstr);
	}

}
