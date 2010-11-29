package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCsilMstr entity provides the base persistence definition of the
 * CsilMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCsilMstr implements java.io.Serializable {

	// Fields

	private CsilMstrId id;
	private Date csilStart;
	private Date csilEnd;
	private String csilAddr1;
	private String csilAddr2;
	private String csilAddr3;
	private Integer csilCmtindx;
	private String csilAddr4;
	private String csilUser1;
	private String csilUser2;
	private String csilQadc01;
	private Double oidCsilMstr;

	// Constructors

	/** default constructor */
	public AbstractCsilMstr() {
	}

	/** minimal constructor */
	public AbstractCsilMstr(CsilMstrId id, Double oidCsilMstr) {
		this.id = id;
		this.oidCsilMstr = oidCsilMstr;
	}

	/** full constructor */
	public AbstractCsilMstr(CsilMstrId id, Date csilStart, Date csilEnd,
			String csilAddr1, String csilAddr2, String csilAddr3,
			Integer csilCmtindx, String csilAddr4, String csilUser1,
			String csilUser2, String csilQadc01, Double oidCsilMstr) {
		this.id = id;
		this.csilStart = csilStart;
		this.csilEnd = csilEnd;
		this.csilAddr1 = csilAddr1;
		this.csilAddr2 = csilAddr2;
		this.csilAddr3 = csilAddr3;
		this.csilCmtindx = csilCmtindx;
		this.csilAddr4 = csilAddr4;
		this.csilUser1 = csilUser1;
		this.csilUser2 = csilUser2;
		this.csilQadc01 = csilQadc01;
		this.oidCsilMstr = oidCsilMstr;
	}

	// Property accessors

	public CsilMstrId getId() {
		return this.id;
	}

	public void setId(CsilMstrId id) {
		this.id = id;
	}

	public Date getCsilStart() {
		return this.csilStart;
	}

	public void setCsilStart(Date csilStart) {
		this.csilStart = csilStart;
	}

	public Date getCsilEnd() {
		return this.csilEnd;
	}

	public void setCsilEnd(Date csilEnd) {
		this.csilEnd = csilEnd;
	}

	public String getCsilAddr1() {
		return this.csilAddr1;
	}

	public void setCsilAddr1(String csilAddr1) {
		this.csilAddr1 = csilAddr1;
	}

	public String getCsilAddr2() {
		return this.csilAddr2;
	}

	public void setCsilAddr2(String csilAddr2) {
		this.csilAddr2 = csilAddr2;
	}

	public String getCsilAddr3() {
		return this.csilAddr3;
	}

	public void setCsilAddr3(String csilAddr3) {
		this.csilAddr3 = csilAddr3;
	}

	public Integer getCsilCmtindx() {
		return this.csilCmtindx;
	}

	public void setCsilCmtindx(Integer csilCmtindx) {
		this.csilCmtindx = csilCmtindx;
	}

	public String getCsilAddr4() {
		return this.csilAddr4;
	}

	public void setCsilAddr4(String csilAddr4) {
		this.csilAddr4 = csilAddr4;
	}

	public String getCsilUser1() {
		return this.csilUser1;
	}

	public void setCsilUser1(String csilUser1) {
		this.csilUser1 = csilUser1;
	}

	public String getCsilUser2() {
		return this.csilUser2;
	}

	public void setCsilUser2(String csilUser2) {
		this.csilUser2 = csilUser2;
	}

	public String getCsilQadc01() {
		return this.csilQadc01;
	}

	public void setCsilQadc01(String csilQadc01) {
		this.csilQadc01 = csilQadc01;
	}

	public Double getOidCsilMstr() {
		return this.oidCsilMstr;
	}

	public void setOidCsilMstr(Double oidCsilMstr) {
		this.oidCsilMstr = oidCsilMstr;
	}

}