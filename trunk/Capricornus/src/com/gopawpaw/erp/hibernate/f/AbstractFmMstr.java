package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFmMstr entity provides the base persistence definition of the FmMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFmMstr implements java.io.Serializable {

	// Fields

	private FmMstrId id;
	private String fmDesc;
	private Boolean fmDrCr;
	private Boolean fmPageBrk;
	private Boolean fmHeader;
	private Boolean fmTotal;
	private Boolean fmSkip;
	private Boolean fmUnderln;
	private String fmUser1;
	private String fmUser2;
	private Boolean fmCcSort;
	private Boolean fmSubSort;
	private String fmQadc01;
	private Double oidFmMstr;

	// Constructors

	/** default constructor */
	public AbstractFmMstr() {
	}

	/** minimal constructor */
	public AbstractFmMstr(FmMstrId id, Double oidFmMstr) {
		this.id = id;
		this.oidFmMstr = oidFmMstr;
	}

	/** full constructor */
	public AbstractFmMstr(FmMstrId id, String fmDesc, Boolean fmDrCr,
			Boolean fmPageBrk, Boolean fmHeader, Boolean fmTotal,
			Boolean fmSkip, Boolean fmUnderln, String fmUser1, String fmUser2,
			Boolean fmCcSort, Boolean fmSubSort, String fmQadc01,
			Double oidFmMstr) {
		this.id = id;
		this.fmDesc = fmDesc;
		this.fmDrCr = fmDrCr;
		this.fmPageBrk = fmPageBrk;
		this.fmHeader = fmHeader;
		this.fmTotal = fmTotal;
		this.fmSkip = fmSkip;
		this.fmUnderln = fmUnderln;
		this.fmUser1 = fmUser1;
		this.fmUser2 = fmUser2;
		this.fmCcSort = fmCcSort;
		this.fmSubSort = fmSubSort;
		this.fmQadc01 = fmQadc01;
		this.oidFmMstr = oidFmMstr;
	}

	// Property accessors

	public FmMstrId getId() {
		return this.id;
	}

	public void setId(FmMstrId id) {
		this.id = id;
	}

	public String getFmDesc() {
		return this.fmDesc;
	}

	public void setFmDesc(String fmDesc) {
		this.fmDesc = fmDesc;
	}

	public Boolean getFmDrCr() {
		return this.fmDrCr;
	}

	public void setFmDrCr(Boolean fmDrCr) {
		this.fmDrCr = fmDrCr;
	}

	public Boolean getFmPageBrk() {
		return this.fmPageBrk;
	}

	public void setFmPageBrk(Boolean fmPageBrk) {
		this.fmPageBrk = fmPageBrk;
	}

	public Boolean getFmHeader() {
		return this.fmHeader;
	}

	public void setFmHeader(Boolean fmHeader) {
		this.fmHeader = fmHeader;
	}

	public Boolean getFmTotal() {
		return this.fmTotal;
	}

	public void setFmTotal(Boolean fmTotal) {
		this.fmTotal = fmTotal;
	}

	public Boolean getFmSkip() {
		return this.fmSkip;
	}

	public void setFmSkip(Boolean fmSkip) {
		this.fmSkip = fmSkip;
	}

	public Boolean getFmUnderln() {
		return this.fmUnderln;
	}

	public void setFmUnderln(Boolean fmUnderln) {
		this.fmUnderln = fmUnderln;
	}

	public String getFmUser1() {
		return this.fmUser1;
	}

	public void setFmUser1(String fmUser1) {
		this.fmUser1 = fmUser1;
	}

	public String getFmUser2() {
		return this.fmUser2;
	}

	public void setFmUser2(String fmUser2) {
		this.fmUser2 = fmUser2;
	}

	public Boolean getFmCcSort() {
		return this.fmCcSort;
	}

	public void setFmCcSort(Boolean fmCcSort) {
		this.fmCcSort = fmCcSort;
	}

	public Boolean getFmSubSort() {
		return this.fmSubSort;
	}

	public void setFmSubSort(Boolean fmSubSort) {
		this.fmSubSort = fmSubSort;
	}

	public String getFmQadc01() {
		return this.fmQadc01;
	}

	public void setFmQadc01(String fmQadc01) {
		this.fmQadc01 = fmQadc01;
	}

	public Double getOidFmMstr() {
		return this.oidFmMstr;
	}

	public void setOidFmMstr(Double oidFmMstr) {
		this.oidFmMstr = oidFmMstr;
	}

}