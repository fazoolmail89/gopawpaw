package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTrlMstr entity provides the base persistence definition of the
 * TrlMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTrlMstr implements java.io.Serializable {

	// Fields

	private TrlMstrId id;
	private String trlDesc;
	private String trlAcct;
	private String trlCc;
	private String trlProject;
	private Boolean trlTaxable;
	private String trlTaxc;
	private Boolean trlFst;
	private Boolean trlPst;
	private String trlUser1;
	private String trlUser2;
	private String trlQadc01;
	private String trlSub;
	private Double oidTrlMstr;

	// Constructors

	/** default constructor */
	public AbstractTrlMstr() {
	}

	/** minimal constructor */
	public AbstractTrlMstr(TrlMstrId id, Double oidTrlMstr) {
		this.id = id;
		this.oidTrlMstr = oidTrlMstr;
	}

	/** full constructor */
	public AbstractTrlMstr(TrlMstrId id, String trlDesc, String trlAcct,
			String trlCc, String trlProject, Boolean trlTaxable,
			String trlTaxc, Boolean trlFst, Boolean trlPst, String trlUser1,
			String trlUser2, String trlQadc01, String trlSub, Double oidTrlMstr) {
		this.id = id;
		this.trlDesc = trlDesc;
		this.trlAcct = trlAcct;
		this.trlCc = trlCc;
		this.trlProject = trlProject;
		this.trlTaxable = trlTaxable;
		this.trlTaxc = trlTaxc;
		this.trlFst = trlFst;
		this.trlPst = trlPst;
		this.trlUser1 = trlUser1;
		this.trlUser2 = trlUser2;
		this.trlQadc01 = trlQadc01;
		this.trlSub = trlSub;
		this.oidTrlMstr = oidTrlMstr;
	}

	// Property accessors

	public TrlMstrId getId() {
		return this.id;
	}

	public void setId(TrlMstrId id) {
		this.id = id;
	}

	public String getTrlDesc() {
		return this.trlDesc;
	}

	public void setTrlDesc(String trlDesc) {
		this.trlDesc = trlDesc;
	}

	public String getTrlAcct() {
		return this.trlAcct;
	}

	public void setTrlAcct(String trlAcct) {
		this.trlAcct = trlAcct;
	}

	public String getTrlCc() {
		return this.trlCc;
	}

	public void setTrlCc(String trlCc) {
		this.trlCc = trlCc;
	}

	public String getTrlProject() {
		return this.trlProject;
	}

	public void setTrlProject(String trlProject) {
		this.trlProject = trlProject;
	}

	public Boolean getTrlTaxable() {
		return this.trlTaxable;
	}

	public void setTrlTaxable(Boolean trlTaxable) {
		this.trlTaxable = trlTaxable;
	}

	public String getTrlTaxc() {
		return this.trlTaxc;
	}

	public void setTrlTaxc(String trlTaxc) {
		this.trlTaxc = trlTaxc;
	}

	public Boolean getTrlFst() {
		return this.trlFst;
	}

	public void setTrlFst(Boolean trlFst) {
		this.trlFst = trlFst;
	}

	public Boolean getTrlPst() {
		return this.trlPst;
	}

	public void setTrlPst(Boolean trlPst) {
		this.trlPst = trlPst;
	}

	public String getTrlUser1() {
		return this.trlUser1;
	}

	public void setTrlUser1(String trlUser1) {
		this.trlUser1 = trlUser1;
	}

	public String getTrlUser2() {
		return this.trlUser2;
	}

	public void setTrlUser2(String trlUser2) {
		this.trlUser2 = trlUser2;
	}

	public String getTrlQadc01() {
		return this.trlQadc01;
	}

	public void setTrlQadc01(String trlQadc01) {
		this.trlQadc01 = trlQadc01;
	}

	public String getTrlSub() {
		return this.trlSub;
	}

	public void setTrlSub(String trlSub) {
		this.trlSub = trlSub;
	}

	public Double getOidTrlMstr() {
		return this.oidTrlMstr;
	}

	public void setOidTrlMstr(Double oidTrlMstr) {
		this.oidTrlMstr = oidTrlMstr;
	}

}