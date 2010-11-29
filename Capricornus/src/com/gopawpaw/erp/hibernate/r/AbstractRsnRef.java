package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRsnRef entity provides the base persistence definition of the RsnRef
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRsnRef implements java.io.Serializable {

	// Fields

	private RsnRefId id;
	private String rsnDesc;
	private String rsnUser1;
	private String rsnUser2;
	private String rsnQadc01;
	private Double oidRsnRef;

	// Constructors

	/** default constructor */
	public AbstractRsnRef() {
	}

	/** minimal constructor */
	public AbstractRsnRef(RsnRefId id, Double oidRsnRef) {
		this.id = id;
		this.oidRsnRef = oidRsnRef;
	}

	/** full constructor */
	public AbstractRsnRef(RsnRefId id, String rsnDesc, String rsnUser1,
			String rsnUser2, String rsnQadc01, Double oidRsnRef) {
		this.id = id;
		this.rsnDesc = rsnDesc;
		this.rsnUser1 = rsnUser1;
		this.rsnUser2 = rsnUser2;
		this.rsnQadc01 = rsnQadc01;
		this.oidRsnRef = oidRsnRef;
	}

	// Property accessors

	public RsnRefId getId() {
		return this.id;
	}

	public void setId(RsnRefId id) {
		this.id = id;
	}

	public String getRsnDesc() {
		return this.rsnDesc;
	}

	public void setRsnDesc(String rsnDesc) {
		this.rsnDesc = rsnDesc;
	}

	public String getRsnUser1() {
		return this.rsnUser1;
	}

	public void setRsnUser1(String rsnUser1) {
		this.rsnUser1 = rsnUser1;
	}

	public String getRsnUser2() {
		return this.rsnUser2;
	}

	public void setRsnUser2(String rsnUser2) {
		this.rsnUser2 = rsnUser2;
	}

	public String getRsnQadc01() {
		return this.rsnQadc01;
	}

	public void setRsnQadc01(String rsnQadc01) {
		this.rsnQadc01 = rsnQadc01;
	}

	public Double getOidRsnRef() {
		return this.oidRsnRef;
	}

	public void setOidRsnRef(Double oidRsnRef) {
		this.oidRsnRef = oidRsnRef;
	}

}