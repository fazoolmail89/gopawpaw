package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFcsSum entity provides the base persistence definition of the FcsSum
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFcsSum implements java.io.Serializable {

	// Fields

	private FcsSumId id;
	private String fcsFcstQty;
	private String fcsSoldQty;
	private String fcsPrFcst;
	private String fcsAbnormal;
	private String fcsUser1;
	private String fcsUser2;
	private String fcsQadc01;
	private Double oidFcsSum;

	// Constructors

	/** default constructor */
	public AbstractFcsSum() {
	}

	/** minimal constructor */
	public AbstractFcsSum(FcsSumId id, Double oidFcsSum) {
		this.id = id;
		this.oidFcsSum = oidFcsSum;
	}

	/** full constructor */
	public AbstractFcsSum(FcsSumId id, String fcsFcstQty, String fcsSoldQty,
			String fcsPrFcst, String fcsAbnormal, String fcsUser1,
			String fcsUser2, String fcsQadc01, Double oidFcsSum) {
		this.id = id;
		this.fcsFcstQty = fcsFcstQty;
		this.fcsSoldQty = fcsSoldQty;
		this.fcsPrFcst = fcsPrFcst;
		this.fcsAbnormal = fcsAbnormal;
		this.fcsUser1 = fcsUser1;
		this.fcsUser2 = fcsUser2;
		this.fcsQadc01 = fcsQadc01;
		this.oidFcsSum = oidFcsSum;
	}

	// Property accessors

	public FcsSumId getId() {
		return this.id;
	}

	public void setId(FcsSumId id) {
		this.id = id;
	}

	public String getFcsFcstQty() {
		return this.fcsFcstQty;
	}

	public void setFcsFcstQty(String fcsFcstQty) {
		this.fcsFcstQty = fcsFcstQty;
	}

	public String getFcsSoldQty() {
		return this.fcsSoldQty;
	}

	public void setFcsSoldQty(String fcsSoldQty) {
		this.fcsSoldQty = fcsSoldQty;
	}

	public String getFcsPrFcst() {
		return this.fcsPrFcst;
	}

	public void setFcsPrFcst(String fcsPrFcst) {
		this.fcsPrFcst = fcsPrFcst;
	}

	public String getFcsAbnormal() {
		return this.fcsAbnormal;
	}

	public void setFcsAbnormal(String fcsAbnormal) {
		this.fcsAbnormal = fcsAbnormal;
	}

	public String getFcsUser1() {
		return this.fcsUser1;
	}

	public void setFcsUser1(String fcsUser1) {
		this.fcsUser1 = fcsUser1;
	}

	public String getFcsUser2() {
		return this.fcsUser2;
	}

	public void setFcsUser2(String fcsUser2) {
		this.fcsUser2 = fcsUser2;
	}

	public String getFcsQadc01() {
		return this.fcsQadc01;
	}

	public void setFcsQadc01(String fcsQadc01) {
		this.fcsQadc01 = fcsQadc01;
	}

	public Double getOidFcsSum() {
		return this.oidFcsSum;
	}

	public void setOidFcsSum(Double oidFcsSum) {
		this.oidFcsSum = oidFcsSum;
	}

}