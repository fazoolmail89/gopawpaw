package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFctMstr entity provides the base persistence definition of the
 * FctMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFctMstr implements java.io.Serializable {

	// Fields

	private FctMstrId id;
	private String fctDesc;
	private Integer fctSchedType;
	private String fctUser1;
	private String fctUser2;
	private String fctChr01;
	private String fctChr02;
	private Integer fctInt01;
	private Integer fctInt02;
	private Boolean fctLog01;
	private Boolean fctLog02;
	private String fctQadc01;
	private String fctQadc02;
	private Integer fctQadi01;
	private Integer fctQadi02;
	private Boolean fctQadl01;
	private Boolean fctQadl02;
	private String fctModUserid;
	private Date fctModDate;
	private Double oidFctMstr;

	// Constructors

	/** default constructor */
	public AbstractFctMstr() {
	}

	/** minimal constructor */
	public AbstractFctMstr(FctMstrId id, Double oidFctMstr) {
		this.id = id;
		this.oidFctMstr = oidFctMstr;
	}

	/** full constructor */
	public AbstractFctMstr(FctMstrId id, String fctDesc, Integer fctSchedType,
			String fctUser1, String fctUser2, String fctChr01, String fctChr02,
			Integer fctInt01, Integer fctInt02, Boolean fctLog01,
			Boolean fctLog02, String fctQadc01, String fctQadc02,
			Integer fctQadi01, Integer fctQadi02, Boolean fctQadl01,
			Boolean fctQadl02, String fctModUserid, Date fctModDate,
			Double oidFctMstr) {
		this.id = id;
		this.fctDesc = fctDesc;
		this.fctSchedType = fctSchedType;
		this.fctUser1 = fctUser1;
		this.fctUser2 = fctUser2;
		this.fctChr01 = fctChr01;
		this.fctChr02 = fctChr02;
		this.fctInt01 = fctInt01;
		this.fctInt02 = fctInt02;
		this.fctLog01 = fctLog01;
		this.fctLog02 = fctLog02;
		this.fctQadc01 = fctQadc01;
		this.fctQadc02 = fctQadc02;
		this.fctQadi01 = fctQadi01;
		this.fctQadi02 = fctQadi02;
		this.fctQadl01 = fctQadl01;
		this.fctQadl02 = fctQadl02;
		this.fctModUserid = fctModUserid;
		this.fctModDate = fctModDate;
		this.oidFctMstr = oidFctMstr;
	}

	// Property accessors

	public FctMstrId getId() {
		return this.id;
	}

	public void setId(FctMstrId id) {
		this.id = id;
	}

	public String getFctDesc() {
		return this.fctDesc;
	}

	public void setFctDesc(String fctDesc) {
		this.fctDesc = fctDesc;
	}

	public Integer getFctSchedType() {
		return this.fctSchedType;
	}

	public void setFctSchedType(Integer fctSchedType) {
		this.fctSchedType = fctSchedType;
	}

	public String getFctUser1() {
		return this.fctUser1;
	}

	public void setFctUser1(String fctUser1) {
		this.fctUser1 = fctUser1;
	}

	public String getFctUser2() {
		return this.fctUser2;
	}

	public void setFctUser2(String fctUser2) {
		this.fctUser2 = fctUser2;
	}

	public String getFctChr01() {
		return this.fctChr01;
	}

	public void setFctChr01(String fctChr01) {
		this.fctChr01 = fctChr01;
	}

	public String getFctChr02() {
		return this.fctChr02;
	}

	public void setFctChr02(String fctChr02) {
		this.fctChr02 = fctChr02;
	}

	public Integer getFctInt01() {
		return this.fctInt01;
	}

	public void setFctInt01(Integer fctInt01) {
		this.fctInt01 = fctInt01;
	}

	public Integer getFctInt02() {
		return this.fctInt02;
	}

	public void setFctInt02(Integer fctInt02) {
		this.fctInt02 = fctInt02;
	}

	public Boolean getFctLog01() {
		return this.fctLog01;
	}

	public void setFctLog01(Boolean fctLog01) {
		this.fctLog01 = fctLog01;
	}

	public Boolean getFctLog02() {
		return this.fctLog02;
	}

	public void setFctLog02(Boolean fctLog02) {
		this.fctLog02 = fctLog02;
	}

	public String getFctQadc01() {
		return this.fctQadc01;
	}

	public void setFctQadc01(String fctQadc01) {
		this.fctQadc01 = fctQadc01;
	}

	public String getFctQadc02() {
		return this.fctQadc02;
	}

	public void setFctQadc02(String fctQadc02) {
		this.fctQadc02 = fctQadc02;
	}

	public Integer getFctQadi01() {
		return this.fctQadi01;
	}

	public void setFctQadi01(Integer fctQadi01) {
		this.fctQadi01 = fctQadi01;
	}

	public Integer getFctQadi02() {
		return this.fctQadi02;
	}

	public void setFctQadi02(Integer fctQadi02) {
		this.fctQadi02 = fctQadi02;
	}

	public Boolean getFctQadl01() {
		return this.fctQadl01;
	}

	public void setFctQadl01(Boolean fctQadl01) {
		this.fctQadl01 = fctQadl01;
	}

	public Boolean getFctQadl02() {
		return this.fctQadl02;
	}

	public void setFctQadl02(Boolean fctQadl02) {
		this.fctQadl02 = fctQadl02;
	}

	public String getFctModUserid() {
		return this.fctModUserid;
	}

	public void setFctModUserid(String fctModUserid) {
		this.fctModUserid = fctModUserid;
	}

	public Date getFctModDate() {
		return this.fctModDate;
	}

	public void setFctModDate(Date fctModDate) {
		this.fctModDate = fctModDate;
	}

	public Double getOidFctMstr() {
		return this.oidFctMstr;
	}

	public void setOidFctMstr(Double oidFctMstr) {
		this.oidFctMstr = oidFctMstr;
	}

}