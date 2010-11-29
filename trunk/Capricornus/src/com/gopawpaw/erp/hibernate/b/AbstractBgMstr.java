package com.gopawpaw.erp.hibernate.b;

/**
 * AbstractBgMstr entity provides the base persistence definition of the BgMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBgMstr implements java.io.Serializable {

	// Fields

	private BgMstrId id;
	private String bgBudgAcc;
	private String bgBudgCc;
	private Integer bgBudgFpos;
	private String bgUser1;
	private String bgUser2;
	private String bgBudgSub;
	private String bgQadc01;
	private Double oidBgMstr;

	// Constructors

	/** default constructor */
	public AbstractBgMstr() {
	}

	/** minimal constructor */
	public AbstractBgMstr(BgMstrId id, Double oidBgMstr) {
		this.id = id;
		this.oidBgMstr = oidBgMstr;
	}

	/** full constructor */
	public AbstractBgMstr(BgMstrId id, String bgBudgAcc, String bgBudgCc,
			Integer bgBudgFpos, String bgUser1, String bgUser2,
			String bgBudgSub, String bgQadc01, Double oidBgMstr) {
		this.id = id;
		this.bgBudgAcc = bgBudgAcc;
		this.bgBudgCc = bgBudgCc;
		this.bgBudgFpos = bgBudgFpos;
		this.bgUser1 = bgUser1;
		this.bgUser2 = bgUser2;
		this.bgBudgSub = bgBudgSub;
		this.bgQadc01 = bgQadc01;
		this.oidBgMstr = oidBgMstr;
	}

	// Property accessors

	public BgMstrId getId() {
		return this.id;
	}

	public void setId(BgMstrId id) {
		this.id = id;
	}

	public String getBgBudgAcc() {
		return this.bgBudgAcc;
	}

	public void setBgBudgAcc(String bgBudgAcc) {
		this.bgBudgAcc = bgBudgAcc;
	}

	public String getBgBudgCc() {
		return this.bgBudgCc;
	}

	public void setBgBudgCc(String bgBudgCc) {
		this.bgBudgCc = bgBudgCc;
	}

	public Integer getBgBudgFpos() {
		return this.bgBudgFpos;
	}

	public void setBgBudgFpos(Integer bgBudgFpos) {
		this.bgBudgFpos = bgBudgFpos;
	}

	public String getBgUser1() {
		return this.bgUser1;
	}

	public void setBgUser1(String bgUser1) {
		this.bgUser1 = bgUser1;
	}

	public String getBgUser2() {
		return this.bgUser2;
	}

	public void setBgUser2(String bgUser2) {
		this.bgUser2 = bgUser2;
	}

	public String getBgBudgSub() {
		return this.bgBudgSub;
	}

	public void setBgBudgSub(String bgBudgSub) {
		this.bgBudgSub = bgBudgSub;
	}

	public String getBgQadc01() {
		return this.bgQadc01;
	}

	public void setBgQadc01(String bgQadc01) {
		this.bgQadc01 = bgQadc01;
	}

	public Double getOidBgMstr() {
		return this.oidBgMstr;
	}

	public void setOidBgMstr(Double oidBgMstr) {
		this.oidBgMstr = oidBgMstr;
	}

}