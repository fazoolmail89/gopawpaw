package com.gopawpaw.erp.hibernate.l;

/**
 * AbstractLnMstr entity provides the base persistence definition of the LnMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLnMstr implements java.io.Serializable {

	// Fields

	private LnMstrId id;
	private String lnDesc;
	private String lnUser1;
	private String lnUser2;
	private Double lnRate;
	private Boolean lnRateBase;
	private Double lnShift1;
	private Double lnShift2;
	private Double lnShift3;
	private String lnChr01;
	private String lnChr03;
	private String lnChr04;
	private String lnChr05;
	private Double lnDec01;
	private Double lnDec02;
	private Double lnDec03;
	private Boolean lnLog01;
	private Double lnShift4;
	private String lnScheduleCode;
	private String lnRateCode;
	private Integer lnFreezePeriod;
	private Boolean lnKanbanReceipts;
	private Double oidLnMstr;

	// Constructors

	/** default constructor */
	public AbstractLnMstr() {
	}

	/** minimal constructor */
	public AbstractLnMstr(LnMstrId id, String lnScheduleCode,
			String lnRateCode, Integer lnFreezePeriod,
			Boolean lnKanbanReceipts, Double oidLnMstr) {
		this.id = id;
		this.lnScheduleCode = lnScheduleCode;
		this.lnRateCode = lnRateCode;
		this.lnFreezePeriod = lnFreezePeriod;
		this.lnKanbanReceipts = lnKanbanReceipts;
		this.oidLnMstr = oidLnMstr;
	}

	/** full constructor */
	public AbstractLnMstr(LnMstrId id, String lnDesc, String lnUser1,
			String lnUser2, Double lnRate, Boolean lnRateBase, Double lnShift1,
			Double lnShift2, Double lnShift3, String lnChr01, String lnChr03,
			String lnChr04, String lnChr05, Double lnDec01, Double lnDec02,
			Double lnDec03, Boolean lnLog01, Double lnShift4,
			String lnScheduleCode, String lnRateCode, Integer lnFreezePeriod,
			Boolean lnKanbanReceipts, Double oidLnMstr) {
		this.id = id;
		this.lnDesc = lnDesc;
		this.lnUser1 = lnUser1;
		this.lnUser2 = lnUser2;
		this.lnRate = lnRate;
		this.lnRateBase = lnRateBase;
		this.lnShift1 = lnShift1;
		this.lnShift2 = lnShift2;
		this.lnShift3 = lnShift3;
		this.lnChr01 = lnChr01;
		this.lnChr03 = lnChr03;
		this.lnChr04 = lnChr04;
		this.lnChr05 = lnChr05;
		this.lnDec01 = lnDec01;
		this.lnDec02 = lnDec02;
		this.lnDec03 = lnDec03;
		this.lnLog01 = lnLog01;
		this.lnShift4 = lnShift4;
		this.lnScheduleCode = lnScheduleCode;
		this.lnRateCode = lnRateCode;
		this.lnFreezePeriod = lnFreezePeriod;
		this.lnKanbanReceipts = lnKanbanReceipts;
		this.oidLnMstr = oidLnMstr;
	}

	// Property accessors

	public LnMstrId getId() {
		return this.id;
	}

	public void setId(LnMstrId id) {
		this.id = id;
	}

	public String getLnDesc() {
		return this.lnDesc;
	}

	public void setLnDesc(String lnDesc) {
		this.lnDesc = lnDesc;
	}

	public String getLnUser1() {
		return this.lnUser1;
	}

	public void setLnUser1(String lnUser1) {
		this.lnUser1 = lnUser1;
	}

	public String getLnUser2() {
		return this.lnUser2;
	}

	public void setLnUser2(String lnUser2) {
		this.lnUser2 = lnUser2;
	}

	public Double getLnRate() {
		return this.lnRate;
	}

	public void setLnRate(Double lnRate) {
		this.lnRate = lnRate;
	}

	public Boolean getLnRateBase() {
		return this.lnRateBase;
	}

	public void setLnRateBase(Boolean lnRateBase) {
		this.lnRateBase = lnRateBase;
	}

	public Double getLnShift1() {
		return this.lnShift1;
	}

	public void setLnShift1(Double lnShift1) {
		this.lnShift1 = lnShift1;
	}

	public Double getLnShift2() {
		return this.lnShift2;
	}

	public void setLnShift2(Double lnShift2) {
		this.lnShift2 = lnShift2;
	}

	public Double getLnShift3() {
		return this.lnShift3;
	}

	public void setLnShift3(Double lnShift3) {
		this.lnShift3 = lnShift3;
	}

	public String getLnChr01() {
		return this.lnChr01;
	}

	public void setLnChr01(String lnChr01) {
		this.lnChr01 = lnChr01;
	}

	public String getLnChr03() {
		return this.lnChr03;
	}

	public void setLnChr03(String lnChr03) {
		this.lnChr03 = lnChr03;
	}

	public String getLnChr04() {
		return this.lnChr04;
	}

	public void setLnChr04(String lnChr04) {
		this.lnChr04 = lnChr04;
	}

	public String getLnChr05() {
		return this.lnChr05;
	}

	public void setLnChr05(String lnChr05) {
		this.lnChr05 = lnChr05;
	}

	public Double getLnDec01() {
		return this.lnDec01;
	}

	public void setLnDec01(Double lnDec01) {
		this.lnDec01 = lnDec01;
	}

	public Double getLnDec02() {
		return this.lnDec02;
	}

	public void setLnDec02(Double lnDec02) {
		this.lnDec02 = lnDec02;
	}

	public Double getLnDec03() {
		return this.lnDec03;
	}

	public void setLnDec03(Double lnDec03) {
		this.lnDec03 = lnDec03;
	}

	public Boolean getLnLog01() {
		return this.lnLog01;
	}

	public void setLnLog01(Boolean lnLog01) {
		this.lnLog01 = lnLog01;
	}

	public Double getLnShift4() {
		return this.lnShift4;
	}

	public void setLnShift4(Double lnShift4) {
		this.lnShift4 = lnShift4;
	}

	public String getLnScheduleCode() {
		return this.lnScheduleCode;
	}

	public void setLnScheduleCode(String lnScheduleCode) {
		this.lnScheduleCode = lnScheduleCode;
	}

	public String getLnRateCode() {
		return this.lnRateCode;
	}

	public void setLnRateCode(String lnRateCode) {
		this.lnRateCode = lnRateCode;
	}

	public Integer getLnFreezePeriod() {
		return this.lnFreezePeriod;
	}

	public void setLnFreezePeriod(Integer lnFreezePeriod) {
		this.lnFreezePeriod = lnFreezePeriod;
	}

	public Boolean getLnKanbanReceipts() {
		return this.lnKanbanReceipts;
	}

	public void setLnKanbanReceipts(Boolean lnKanbanReceipts) {
		this.lnKanbanReceipts = lnKanbanReceipts;
	}

	public Double getOidLnMstr() {
		return this.oidLnMstr;
	}

	public void setOidLnMstr(Double oidLnMstr) {
		this.oidLnMstr = oidLnMstr;
	}

}