package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractScxRef entity provides the base persistence definition of the ScxRef
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractScxRef implements java.io.Serializable {

	// Fields

	private ScxRefId id;
	private String scxOrder;
	private Integer scxLine;
	private String scxQkey;
	private String scxUser1;
	private String scxUser2;
	private String scxQadc01;
	private Double oidScxRef;

	// Constructors

	/** default constructor */
	public AbstractScxRef() {
	}

	/** minimal constructor */
	public AbstractScxRef(ScxRefId id, String scxOrder, String scxQkey,
			Double oidScxRef) {
		this.id = id;
		this.scxOrder = scxOrder;
		this.scxQkey = scxQkey;
		this.oidScxRef = oidScxRef;
	}

	/** full constructor */
	public AbstractScxRef(ScxRefId id, String scxOrder, Integer scxLine,
			String scxQkey, String scxUser1, String scxUser2, String scxQadc01,
			Double oidScxRef) {
		this.id = id;
		this.scxOrder = scxOrder;
		this.scxLine = scxLine;
		this.scxQkey = scxQkey;
		this.scxUser1 = scxUser1;
		this.scxUser2 = scxUser2;
		this.scxQadc01 = scxQadc01;
		this.oidScxRef = oidScxRef;
	}

	// Property accessors

	public ScxRefId getId() {
		return this.id;
	}

	public void setId(ScxRefId id) {
		this.id = id;
	}

	public String getScxOrder() {
		return this.scxOrder;
	}

	public void setScxOrder(String scxOrder) {
		this.scxOrder = scxOrder;
	}

	public Integer getScxLine() {
		return this.scxLine;
	}

	public void setScxLine(Integer scxLine) {
		this.scxLine = scxLine;
	}

	public String getScxQkey() {
		return this.scxQkey;
	}

	public void setScxQkey(String scxQkey) {
		this.scxQkey = scxQkey;
	}

	public String getScxUser1() {
		return this.scxUser1;
	}

	public void setScxUser1(String scxUser1) {
		this.scxUser1 = scxUser1;
	}

	public String getScxUser2() {
		return this.scxUser2;
	}

	public void setScxUser2(String scxUser2) {
		this.scxUser2 = scxUser2;
	}

	public String getScxQadc01() {
		return this.scxQadc01;
	}

	public void setScxQadc01(String scxQadc01) {
		this.scxQadc01 = scxQadc01;
	}

	public Double getOidScxRef() {
		return this.oidScxRef;
	}

	public void setOidScxRef(Double oidScxRef) {
		this.oidScxRef = oidScxRef;
	}

}