package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFrmMstr entity provides the base persistence definition of the
 * FrmMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFrmMstr implements java.io.Serializable {

	// Fields

	private FrmMstrId id;
	private String frmDesc;
	private String frmCurr;
	private String frmUm;
	private Double frmRateQty;
	private String frmUser1;
	private String frmUser2;
	private String frmQadc01;
	private Double oidFrmMstr;

	// Constructors

	/** default constructor */
	public AbstractFrmMstr() {
	}

	/** minimal constructor */
	public AbstractFrmMstr(FrmMstrId id, Double oidFrmMstr) {
		this.id = id;
		this.oidFrmMstr = oidFrmMstr;
	}

	/** full constructor */
	public AbstractFrmMstr(FrmMstrId id, String frmDesc, String frmCurr,
			String frmUm, Double frmRateQty, String frmUser1, String frmUser2,
			String frmQadc01, Double oidFrmMstr) {
		this.id = id;
		this.frmDesc = frmDesc;
		this.frmCurr = frmCurr;
		this.frmUm = frmUm;
		this.frmRateQty = frmRateQty;
		this.frmUser1 = frmUser1;
		this.frmUser2 = frmUser2;
		this.frmQadc01 = frmQadc01;
		this.oidFrmMstr = oidFrmMstr;
	}

	// Property accessors

	public FrmMstrId getId() {
		return this.id;
	}

	public void setId(FrmMstrId id) {
		this.id = id;
	}

	public String getFrmDesc() {
		return this.frmDesc;
	}

	public void setFrmDesc(String frmDesc) {
		this.frmDesc = frmDesc;
	}

	public String getFrmCurr() {
		return this.frmCurr;
	}

	public void setFrmCurr(String frmCurr) {
		this.frmCurr = frmCurr;
	}

	public String getFrmUm() {
		return this.frmUm;
	}

	public void setFrmUm(String frmUm) {
		this.frmUm = frmUm;
	}

	public Double getFrmRateQty() {
		return this.frmRateQty;
	}

	public void setFrmRateQty(Double frmRateQty) {
		this.frmRateQty = frmRateQty;
	}

	public String getFrmUser1() {
		return this.frmUser1;
	}

	public void setFrmUser1(String frmUser1) {
		this.frmUser1 = frmUser1;
	}

	public String getFrmUser2() {
		return this.frmUser2;
	}

	public void setFrmUser2(String frmUser2) {
		this.frmUser2 = frmUser2;
	}

	public String getFrmQadc01() {
		return this.frmQadc01;
	}

	public void setFrmQadc01(String frmQadc01) {
		this.frmQadc01 = frmQadc01;
	}

	public Double getOidFrmMstr() {
		return this.oidFrmMstr;
	}

	public void setOidFrmMstr(Double oidFrmMstr) {
		this.oidFrmMstr = oidFrmMstr;
	}

}