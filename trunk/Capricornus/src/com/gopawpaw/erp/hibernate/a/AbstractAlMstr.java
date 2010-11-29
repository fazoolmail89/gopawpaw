package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAlMstr entity provides the base persistence definition of the AlMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAlMstr implements java.io.Serializable {

	// Fields

	private AlMstrId id;
	private String alDesc;
	private String alUser1;
	private String alUser2;
	private String alUserid;
	private Date alQad01;
	private Double oidAlMstr;

	// Constructors

	/** default constructor */
	public AbstractAlMstr() {
	}

	/** minimal constructor */
	public AbstractAlMstr(AlMstrId id, Double oidAlMstr) {
		this.id = id;
		this.oidAlMstr = oidAlMstr;
	}

	/** full constructor */
	public AbstractAlMstr(AlMstrId id, String alDesc, String alUser1,
			String alUser2, String alUserid, Date alQad01, Double oidAlMstr) {
		this.id = id;
		this.alDesc = alDesc;
		this.alUser1 = alUser1;
		this.alUser2 = alUser2;
		this.alUserid = alUserid;
		this.alQad01 = alQad01;
		this.oidAlMstr = oidAlMstr;
	}

	// Property accessors

	public AlMstrId getId() {
		return this.id;
	}

	public void setId(AlMstrId id) {
		this.id = id;
	}

	public String getAlDesc() {
		return this.alDesc;
	}

	public void setAlDesc(String alDesc) {
		this.alDesc = alDesc;
	}

	public String getAlUser1() {
		return this.alUser1;
	}

	public void setAlUser1(String alUser1) {
		this.alUser1 = alUser1;
	}

	public String getAlUser2() {
		return this.alUser2;
	}

	public void setAlUser2(String alUser2) {
		this.alUser2 = alUser2;
	}

	public String getAlUserid() {
		return this.alUserid;
	}

	public void setAlUserid(String alUserid) {
		this.alUserid = alUserid;
	}

	public Date getAlQad01() {
		return this.alQad01;
	}

	public void setAlQad01(Date alQad01) {
		this.alQad01 = alQad01;
	}

	public Double getOidAlMstr() {
		return this.oidAlMstr;
	}

	public void setOidAlMstr(Double oidAlMstr) {
		this.oidAlMstr = oidAlMstr;
	}

}