package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractChgMstr entity provides the base persistence definition of the
 * ChgMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractChgMstr implements java.io.Serializable {

	// Fields

	private ChgMstrId id;
	private Double chgTime;
	private Double chgStart;
	private String chgUser1;
	private String chgChr01;
	private String chgChr02;
	private String chgChr03;
	private String chgChr04;
	private String chgChr05;
	private Double chgDec01;
	private String chgUser2;
	private Double oidChgMstr;

	// Constructors

	/** default constructor */
	public AbstractChgMstr() {
	}

	/** minimal constructor */
	public AbstractChgMstr(ChgMstrId id, Double oidChgMstr) {
		this.id = id;
		this.oidChgMstr = oidChgMstr;
	}

	/** full constructor */
	public AbstractChgMstr(ChgMstrId id, Double chgTime, Double chgStart,
			String chgUser1, String chgChr01, String chgChr02, String chgChr03,
			String chgChr04, String chgChr05, Double chgDec01, String chgUser2,
			Double oidChgMstr) {
		this.id = id;
		this.chgTime = chgTime;
		this.chgStart = chgStart;
		this.chgUser1 = chgUser1;
		this.chgChr01 = chgChr01;
		this.chgChr02 = chgChr02;
		this.chgChr03 = chgChr03;
		this.chgChr04 = chgChr04;
		this.chgChr05 = chgChr05;
		this.chgDec01 = chgDec01;
		this.chgUser2 = chgUser2;
		this.oidChgMstr = oidChgMstr;
	}

	// Property accessors

	public ChgMstrId getId() {
		return this.id;
	}

	public void setId(ChgMstrId id) {
		this.id = id;
	}

	public Double getChgTime() {
		return this.chgTime;
	}

	public void setChgTime(Double chgTime) {
		this.chgTime = chgTime;
	}

	public Double getChgStart() {
		return this.chgStart;
	}

	public void setChgStart(Double chgStart) {
		this.chgStart = chgStart;
	}

	public String getChgUser1() {
		return this.chgUser1;
	}

	public void setChgUser1(String chgUser1) {
		this.chgUser1 = chgUser1;
	}

	public String getChgChr01() {
		return this.chgChr01;
	}

	public void setChgChr01(String chgChr01) {
		this.chgChr01 = chgChr01;
	}

	public String getChgChr02() {
		return this.chgChr02;
	}

	public void setChgChr02(String chgChr02) {
		this.chgChr02 = chgChr02;
	}

	public String getChgChr03() {
		return this.chgChr03;
	}

	public void setChgChr03(String chgChr03) {
		this.chgChr03 = chgChr03;
	}

	public String getChgChr04() {
		return this.chgChr04;
	}

	public void setChgChr04(String chgChr04) {
		this.chgChr04 = chgChr04;
	}

	public String getChgChr05() {
		return this.chgChr05;
	}

	public void setChgChr05(String chgChr05) {
		this.chgChr05 = chgChr05;
	}

	public Double getChgDec01() {
		return this.chgDec01;
	}

	public void setChgDec01(Double chgDec01) {
		this.chgDec01 = chgDec01;
	}

	public String getChgUser2() {
		return this.chgUser2;
	}

	public void setChgUser2(String chgUser2) {
		this.chgUser2 = chgUser2;
	}

	public Double getOidChgMstr() {
		return this.oidChgMstr;
	}

	public void setOidChgMstr(Double oidChgMstr) {
		this.oidChgMstr = oidChgMstr;
	}

}