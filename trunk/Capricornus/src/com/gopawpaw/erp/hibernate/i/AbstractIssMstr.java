package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractIssMstr entity provides the base persistence definition of the
 * IssMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIssMstr implements java.io.Serializable {

	// Fields

	private IssMstrId id;
	private String issChr01;
	private String issChr02;
	private String issChr03;
	private Double issDec01;
	private Double issDec02;
	private Date issDte01;
	private Date issDte02;
	private Boolean issLog01;
	private Boolean issLog02;
	private String issUser1;
	private String issUser2;
	private Double oidIssMstr;

	// Constructors

	/** default constructor */
	public AbstractIssMstr() {
	}

	/** minimal constructor */
	public AbstractIssMstr(IssMstrId id, Double oidIssMstr) {
		this.id = id;
		this.oidIssMstr = oidIssMstr;
	}

	/** full constructor */
	public AbstractIssMstr(IssMstrId id, String issChr01, String issChr02,
			String issChr03, Double issDec01, Double issDec02, Date issDte01,
			Date issDte02, Boolean issLog01, Boolean issLog02, String issUser1,
			String issUser2, Double oidIssMstr) {
		this.id = id;
		this.issChr01 = issChr01;
		this.issChr02 = issChr02;
		this.issChr03 = issChr03;
		this.issDec01 = issDec01;
		this.issDec02 = issDec02;
		this.issDte01 = issDte01;
		this.issDte02 = issDte02;
		this.issLog01 = issLog01;
		this.issLog02 = issLog02;
		this.issUser1 = issUser1;
		this.issUser2 = issUser2;
		this.oidIssMstr = oidIssMstr;
	}

	// Property accessors

	public IssMstrId getId() {
		return this.id;
	}

	public void setId(IssMstrId id) {
		this.id = id;
	}

	public String getIssChr01() {
		return this.issChr01;
	}

	public void setIssChr01(String issChr01) {
		this.issChr01 = issChr01;
	}

	public String getIssChr02() {
		return this.issChr02;
	}

	public void setIssChr02(String issChr02) {
		this.issChr02 = issChr02;
	}

	public String getIssChr03() {
		return this.issChr03;
	}

	public void setIssChr03(String issChr03) {
		this.issChr03 = issChr03;
	}

	public Double getIssDec01() {
		return this.issDec01;
	}

	public void setIssDec01(Double issDec01) {
		this.issDec01 = issDec01;
	}

	public Double getIssDec02() {
		return this.issDec02;
	}

	public void setIssDec02(Double issDec02) {
		this.issDec02 = issDec02;
	}

	public Date getIssDte01() {
		return this.issDte01;
	}

	public void setIssDte01(Date issDte01) {
		this.issDte01 = issDte01;
	}

	public Date getIssDte02() {
		return this.issDte02;
	}

	public void setIssDte02(Date issDte02) {
		this.issDte02 = issDte02;
	}

	public Boolean getIssLog01() {
		return this.issLog01;
	}

	public void setIssLog01(Boolean issLog01) {
		this.issLog01 = issLog01;
	}

	public Boolean getIssLog02() {
		return this.issLog02;
	}

	public void setIssLog02(Boolean issLog02) {
		this.issLog02 = issLog02;
	}

	public String getIssUser1() {
		return this.issUser1;
	}

	public void setIssUser1(String issUser1) {
		this.issUser1 = issUser1;
	}

	public String getIssUser2() {
		return this.issUser2;
	}

	public void setIssUser2(String issUser2) {
		this.issUser2 = issUser2;
	}

	public Double getOidIssMstr() {
		return this.oidIssMstr;
	}

	public void setOidIssMstr(Double oidIssMstr) {
		this.oidIssMstr = oidIssMstr;
	}

}