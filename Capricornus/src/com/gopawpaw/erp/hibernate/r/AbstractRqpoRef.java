package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRqpoRef entity provides the base persistence definition of the
 * RqpoRef entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqpoRef implements java.io.Serializable {

	// Fields

	private RqpoRefId id;
	private Double rqpoQtyOrd;
	private String rqpoChr01;
	private String rqpoChr02;
	private String rqpoChr03;
	private String rqpoChr04;
	private String rqpoQadc01;
	private String rqpoQadc02;
	private String rqpoQadc03;
	private String rqpoQadc04;
	private Double oidRqpoRef;

	// Constructors

	/** default constructor */
	public AbstractRqpoRef() {
	}

	/** minimal constructor */
	public AbstractRqpoRef(RqpoRefId id, Double oidRqpoRef) {
		this.id = id;
		this.oidRqpoRef = oidRqpoRef;
	}

	/** full constructor */
	public AbstractRqpoRef(RqpoRefId id, Double rqpoQtyOrd, String rqpoChr01,
			String rqpoChr02, String rqpoChr03, String rqpoChr04,
			String rqpoQadc01, String rqpoQadc02, String rqpoQadc03,
			String rqpoQadc04, Double oidRqpoRef) {
		this.id = id;
		this.rqpoQtyOrd = rqpoQtyOrd;
		this.rqpoChr01 = rqpoChr01;
		this.rqpoChr02 = rqpoChr02;
		this.rqpoChr03 = rqpoChr03;
		this.rqpoChr04 = rqpoChr04;
		this.rqpoQadc01 = rqpoQadc01;
		this.rqpoQadc02 = rqpoQadc02;
		this.rqpoQadc03 = rqpoQadc03;
		this.rqpoQadc04 = rqpoQadc04;
		this.oidRqpoRef = oidRqpoRef;
	}

	// Property accessors

	public RqpoRefId getId() {
		return this.id;
	}

	public void setId(RqpoRefId id) {
		this.id = id;
	}

	public Double getRqpoQtyOrd() {
		return this.rqpoQtyOrd;
	}

	public void setRqpoQtyOrd(Double rqpoQtyOrd) {
		this.rqpoQtyOrd = rqpoQtyOrd;
	}

	public String getRqpoChr01() {
		return this.rqpoChr01;
	}

	public void setRqpoChr01(String rqpoChr01) {
		this.rqpoChr01 = rqpoChr01;
	}

	public String getRqpoChr02() {
		return this.rqpoChr02;
	}

	public void setRqpoChr02(String rqpoChr02) {
		this.rqpoChr02 = rqpoChr02;
	}

	public String getRqpoChr03() {
		return this.rqpoChr03;
	}

	public void setRqpoChr03(String rqpoChr03) {
		this.rqpoChr03 = rqpoChr03;
	}

	public String getRqpoChr04() {
		return this.rqpoChr04;
	}

	public void setRqpoChr04(String rqpoChr04) {
		this.rqpoChr04 = rqpoChr04;
	}

	public String getRqpoQadc01() {
		return this.rqpoQadc01;
	}

	public void setRqpoQadc01(String rqpoQadc01) {
		this.rqpoQadc01 = rqpoQadc01;
	}

	public String getRqpoQadc02() {
		return this.rqpoQadc02;
	}

	public void setRqpoQadc02(String rqpoQadc02) {
		this.rqpoQadc02 = rqpoQadc02;
	}

	public String getRqpoQadc03() {
		return this.rqpoQadc03;
	}

	public void setRqpoQadc03(String rqpoQadc03) {
		this.rqpoQadc03 = rqpoQadc03;
	}

	public String getRqpoQadc04() {
		return this.rqpoQadc04;
	}

	public void setRqpoQadc04(String rqpoQadc04) {
		this.rqpoQadc04 = rqpoQadc04;
	}

	public Double getOidRqpoRef() {
		return this.oidRqpoRef;
	}

	public void setOidRqpoRef(Double oidRqpoRef) {
		this.oidRqpoRef = oidRqpoRef;
	}

}