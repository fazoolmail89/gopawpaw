package com.gopawpaw.erp.hibernate.h;

/**
 * AbstractHdMstr entity provides the base persistence definition of the HdMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHdMstr implements java.io.Serializable {

	// Fields

	private HdMstrId id;
	private String hdDesc;
	private String hdUser1;
	private String hdUser2;
	private String hdQadc01;
	private Double oidHdMstr;

	// Constructors

	/** default constructor */
	public AbstractHdMstr() {
	}

	/** minimal constructor */
	public AbstractHdMstr(HdMstrId id, Double oidHdMstr) {
		this.id = id;
		this.oidHdMstr = oidHdMstr;
	}

	/** full constructor */
	public AbstractHdMstr(HdMstrId id, String hdDesc, String hdUser1,
			String hdUser2, String hdQadc01, Double oidHdMstr) {
		this.id = id;
		this.hdDesc = hdDesc;
		this.hdUser1 = hdUser1;
		this.hdUser2 = hdUser2;
		this.hdQadc01 = hdQadc01;
		this.oidHdMstr = oidHdMstr;
	}

	// Property accessors

	public HdMstrId getId() {
		return this.id;
	}

	public void setId(HdMstrId id) {
		this.id = id;
	}

	public String getHdDesc() {
		return this.hdDesc;
	}

	public void setHdDesc(String hdDesc) {
		this.hdDesc = hdDesc;
	}

	public String getHdUser1() {
		return this.hdUser1;
	}

	public void setHdUser1(String hdUser1) {
		this.hdUser1 = hdUser1;
	}

	public String getHdUser2() {
		return this.hdUser2;
	}

	public void setHdUser2(String hdUser2) {
		this.hdUser2 = hdUser2;
	}

	public String getHdQadc01() {
		return this.hdQadc01;
	}

	public void setHdQadc01(String hdQadc01) {
		this.hdQadc01 = hdQadc01;
	}

	public Double getOidHdMstr() {
		return this.oidHdMstr;
	}

	public void setOidHdMstr(Double oidHdMstr) {
		this.oidHdMstr = oidHdMstr;
	}

}