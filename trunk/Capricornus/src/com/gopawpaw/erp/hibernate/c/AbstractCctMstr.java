package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCctMstr entity provides the base persistence definition of the
 * CctMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCctMstr implements java.io.Serializable {

	// Fields

	private CctMstrId id;
	private Boolean cctContainerType;
	private String cctDesc1;
	private String cctDesc2;
	private String cctDesc3;
	private String cctDesc4;
	private String cctPrgm;
	private String cctModUserid;
	private Date cctModDate;
	private String cctUserc01;
	private String cctUserc02;
	private String cctQadc01;
	private String cctQadc02;
	private Double oidCctMstr;

	// Constructors

	/** default constructor */
	public AbstractCctMstr() {
	}

	/** minimal constructor */
	public AbstractCctMstr(CctMstrId id, Boolean cctContainerType,
			String cctDesc1, String cctDesc2, String cctDesc3, String cctDesc4,
			String cctPrgm, String cctModUserid, String cctUserc01,
			String cctUserc02, String cctQadc01, String cctQadc02,
			Double oidCctMstr) {
		this.id = id;
		this.cctContainerType = cctContainerType;
		this.cctDesc1 = cctDesc1;
		this.cctDesc2 = cctDesc2;
		this.cctDesc3 = cctDesc3;
		this.cctDesc4 = cctDesc4;
		this.cctPrgm = cctPrgm;
		this.cctModUserid = cctModUserid;
		this.cctUserc01 = cctUserc01;
		this.cctUserc02 = cctUserc02;
		this.cctQadc01 = cctQadc01;
		this.cctQadc02 = cctQadc02;
		this.oidCctMstr = oidCctMstr;
	}

	/** full constructor */
	public AbstractCctMstr(CctMstrId id, Boolean cctContainerType,
			String cctDesc1, String cctDesc2, String cctDesc3, String cctDesc4,
			String cctPrgm, String cctModUserid, Date cctModDate,
			String cctUserc01, String cctUserc02, String cctQadc01,
			String cctQadc02, Double oidCctMstr) {
		this.id = id;
		this.cctContainerType = cctContainerType;
		this.cctDesc1 = cctDesc1;
		this.cctDesc2 = cctDesc2;
		this.cctDesc3 = cctDesc3;
		this.cctDesc4 = cctDesc4;
		this.cctPrgm = cctPrgm;
		this.cctModUserid = cctModUserid;
		this.cctModDate = cctModDate;
		this.cctUserc01 = cctUserc01;
		this.cctUserc02 = cctUserc02;
		this.cctQadc01 = cctQadc01;
		this.cctQadc02 = cctQadc02;
		this.oidCctMstr = oidCctMstr;
	}

	// Property accessors

	public CctMstrId getId() {
		return this.id;
	}

	public void setId(CctMstrId id) {
		this.id = id;
	}

	public Boolean getCctContainerType() {
		return this.cctContainerType;
	}

	public void setCctContainerType(Boolean cctContainerType) {
		this.cctContainerType = cctContainerType;
	}

	public String getCctDesc1() {
		return this.cctDesc1;
	}

	public void setCctDesc1(String cctDesc1) {
		this.cctDesc1 = cctDesc1;
	}

	public String getCctDesc2() {
		return this.cctDesc2;
	}

	public void setCctDesc2(String cctDesc2) {
		this.cctDesc2 = cctDesc2;
	}

	public String getCctDesc3() {
		return this.cctDesc3;
	}

	public void setCctDesc3(String cctDesc3) {
		this.cctDesc3 = cctDesc3;
	}

	public String getCctDesc4() {
		return this.cctDesc4;
	}

	public void setCctDesc4(String cctDesc4) {
		this.cctDesc4 = cctDesc4;
	}

	public String getCctPrgm() {
		return this.cctPrgm;
	}

	public void setCctPrgm(String cctPrgm) {
		this.cctPrgm = cctPrgm;
	}

	public String getCctModUserid() {
		return this.cctModUserid;
	}

	public void setCctModUserid(String cctModUserid) {
		this.cctModUserid = cctModUserid;
	}

	public Date getCctModDate() {
		return this.cctModDate;
	}

	public void setCctModDate(Date cctModDate) {
		this.cctModDate = cctModDate;
	}

	public String getCctUserc01() {
		return this.cctUserc01;
	}

	public void setCctUserc01(String cctUserc01) {
		this.cctUserc01 = cctUserc01;
	}

	public String getCctUserc02() {
		return this.cctUserc02;
	}

	public void setCctUserc02(String cctUserc02) {
		this.cctUserc02 = cctUserc02;
	}

	public String getCctQadc01() {
		return this.cctQadc01;
	}

	public void setCctQadc01(String cctQadc01) {
		this.cctQadc01 = cctQadc01;
	}

	public String getCctQadc02() {
		return this.cctQadc02;
	}

	public void setCctQadc02(String cctQadc02) {
		this.cctQadc02 = cctQadc02;
	}

	public Double getOidCctMstr() {
		return this.oidCctMstr;
	}

	public void setOidCctMstr(Double oidCctMstr) {
		this.oidCctMstr = oidCctMstr;
	}

}