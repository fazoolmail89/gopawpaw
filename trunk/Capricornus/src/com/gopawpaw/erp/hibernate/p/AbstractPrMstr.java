package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPrMstr entity provides the base persistence definition of the PrMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPrMstr implements java.io.Serializable {

	// Fields

	private String prType;
	private String prDesc;
	private String prSt80;
	private String prReset;
	private String prSt132;
	private String prStBc;
	private String prEndBc;
	private String prNegLine;
	private Integer prLength;
	private Integer prBlank;
	private String prPage;
	private String prInit;
	private String prUser1;
	private String prUser2;
	private String prQadc01;
	private Double oidPrMstr;

	// Constructors

	/** default constructor */
	public AbstractPrMstr() {
	}

	/** minimal constructor */
	public AbstractPrMstr(Double oidPrMstr) {
		this.oidPrMstr = oidPrMstr;
	}

	/** full constructor */
	public AbstractPrMstr(String prDesc, String prSt80, String prReset,
			String prSt132, String prStBc, String prEndBc, String prNegLine,
			Integer prLength, Integer prBlank, String prPage, String prInit,
			String prUser1, String prUser2, String prQadc01, Double oidPrMstr) {
		this.prDesc = prDesc;
		this.prSt80 = prSt80;
		this.prReset = prReset;
		this.prSt132 = prSt132;
		this.prStBc = prStBc;
		this.prEndBc = prEndBc;
		this.prNegLine = prNegLine;
		this.prLength = prLength;
		this.prBlank = prBlank;
		this.prPage = prPage;
		this.prInit = prInit;
		this.prUser1 = prUser1;
		this.prUser2 = prUser2;
		this.prQadc01 = prQadc01;
		this.oidPrMstr = oidPrMstr;
	}

	// Property accessors

	public String getPrType() {
		return this.prType;
	}

	public void setPrType(String prType) {
		this.prType = prType;
	}

	public String getPrDesc() {
		return this.prDesc;
	}

	public void setPrDesc(String prDesc) {
		this.prDesc = prDesc;
	}

	public String getPrSt80() {
		return this.prSt80;
	}

	public void setPrSt80(String prSt80) {
		this.prSt80 = prSt80;
	}

	public String getPrReset() {
		return this.prReset;
	}

	public void setPrReset(String prReset) {
		this.prReset = prReset;
	}

	public String getPrSt132() {
		return this.prSt132;
	}

	public void setPrSt132(String prSt132) {
		this.prSt132 = prSt132;
	}

	public String getPrStBc() {
		return this.prStBc;
	}

	public void setPrStBc(String prStBc) {
		this.prStBc = prStBc;
	}

	public String getPrEndBc() {
		return this.prEndBc;
	}

	public void setPrEndBc(String prEndBc) {
		this.prEndBc = prEndBc;
	}

	public String getPrNegLine() {
		return this.prNegLine;
	}

	public void setPrNegLine(String prNegLine) {
		this.prNegLine = prNegLine;
	}

	public Integer getPrLength() {
		return this.prLength;
	}

	public void setPrLength(Integer prLength) {
		this.prLength = prLength;
	}

	public Integer getPrBlank() {
		return this.prBlank;
	}

	public void setPrBlank(Integer prBlank) {
		this.prBlank = prBlank;
	}

	public String getPrPage() {
		return this.prPage;
	}

	public void setPrPage(String prPage) {
		this.prPage = prPage;
	}

	public String getPrInit() {
		return this.prInit;
	}

	public void setPrInit(String prInit) {
		this.prInit = prInit;
	}

	public String getPrUser1() {
		return this.prUser1;
	}

	public void setPrUser1(String prUser1) {
		this.prUser1 = prUser1;
	}

	public String getPrUser2() {
		return this.prUser2;
	}

	public void setPrUser2(String prUser2) {
		this.prUser2 = prUser2;
	}

	public String getPrQadc01() {
		return this.prQadc01;
	}

	public void setPrQadc01(String prQadc01) {
		this.prQadc01 = prQadc01;
	}

	public Double getOidPrMstr() {
		return this.oidPrMstr;
	}

	public void setOidPrMstr(Double oidPrMstr) {
		this.oidPrMstr = oidPrMstr;
	}

}