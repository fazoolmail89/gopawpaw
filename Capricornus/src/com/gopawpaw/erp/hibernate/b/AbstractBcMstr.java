package com.gopawpaw.erp.hibernate.b;

/**
 * AbstractBcMstr entity provides the base persistence definition of the BcMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBcMstr implements java.io.Serializable {

	// Fields

	private BcMstrId id;
	private Boolean bcPerm;
	private Integer bcPriority;
	private String bcUser1;
	private String bcUser2;
	private String bcDesc;
	private Integer bcCmtindx;
	private String bcCanrun;
	private String bcQadc01;
	private Double oidBcMstr;

	// Constructors

	/** default constructor */
	public AbstractBcMstr() {
	}

	/** minimal constructor */
	public AbstractBcMstr(BcMstrId id, Double oidBcMstr) {
		this.id = id;
		this.oidBcMstr = oidBcMstr;
	}

	/** full constructor */
	public AbstractBcMstr(BcMstrId id, Boolean bcPerm, Integer bcPriority,
			String bcUser1, String bcUser2, String bcDesc, Integer bcCmtindx,
			String bcCanrun, String bcQadc01, Double oidBcMstr) {
		this.id = id;
		this.bcPerm = bcPerm;
		this.bcPriority = bcPriority;
		this.bcUser1 = bcUser1;
		this.bcUser2 = bcUser2;
		this.bcDesc = bcDesc;
		this.bcCmtindx = bcCmtindx;
		this.bcCanrun = bcCanrun;
		this.bcQadc01 = bcQadc01;
		this.oidBcMstr = oidBcMstr;
	}

	// Property accessors

	public BcMstrId getId() {
		return this.id;
	}

	public void setId(BcMstrId id) {
		this.id = id;
	}

	public Boolean getBcPerm() {
		return this.bcPerm;
	}

	public void setBcPerm(Boolean bcPerm) {
		this.bcPerm = bcPerm;
	}

	public Integer getBcPriority() {
		return this.bcPriority;
	}

	public void setBcPriority(Integer bcPriority) {
		this.bcPriority = bcPriority;
	}

	public String getBcUser1() {
		return this.bcUser1;
	}

	public void setBcUser1(String bcUser1) {
		this.bcUser1 = bcUser1;
	}

	public String getBcUser2() {
		return this.bcUser2;
	}

	public void setBcUser2(String bcUser2) {
		this.bcUser2 = bcUser2;
	}

	public String getBcDesc() {
		return this.bcDesc;
	}

	public void setBcDesc(String bcDesc) {
		this.bcDesc = bcDesc;
	}

	public Integer getBcCmtindx() {
		return this.bcCmtindx;
	}

	public void setBcCmtindx(Integer bcCmtindx) {
		this.bcCmtindx = bcCmtindx;
	}

	public String getBcCanrun() {
		return this.bcCanrun;
	}

	public void setBcCanrun(String bcCanrun) {
		this.bcCanrun = bcCanrun;
	}

	public String getBcQadc01() {
		return this.bcQadc01;
	}

	public void setBcQadc01(String bcQadc01) {
		this.bcQadc01 = bcQadc01;
	}

	public Double getOidBcMstr() {
		return this.oidBcMstr;
	}

	public void setOidBcMstr(Double oidBcMstr) {
		this.oidBcMstr = oidBcMstr;
	}

}