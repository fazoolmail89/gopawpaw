package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * AbstractBdlMstr entity provides the base persistence definition of the
 * BdlMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBdlMstr implements java.io.Serializable {

	// Fields

	private BdlMstrId id;
	private String bdlExec;
	private Integer bdlPgmErrs;
	private Integer bdlProErrs;
	private Date bdlDateEnt;
	private String bdlTimeEnt;
	private Date bdlDatePro;
	private String bdlTimePro;
	private String bdlUser1;
	private String bdlUser2;
	private String bdlQadc01;
	private Double oidBdlMstr;

	// Constructors

	/** default constructor */
	public AbstractBdlMstr() {
	}

	/** minimal constructor */
	public AbstractBdlMstr(BdlMstrId id, Double oidBdlMstr) {
		this.id = id;
		this.oidBdlMstr = oidBdlMstr;
	}

	/** full constructor */
	public AbstractBdlMstr(BdlMstrId id, String bdlExec, Integer bdlPgmErrs,
			Integer bdlProErrs, Date bdlDateEnt, String bdlTimeEnt,
			Date bdlDatePro, String bdlTimePro, String bdlUser1,
			String bdlUser2, String bdlQadc01, Double oidBdlMstr) {
		this.id = id;
		this.bdlExec = bdlExec;
		this.bdlPgmErrs = bdlPgmErrs;
		this.bdlProErrs = bdlProErrs;
		this.bdlDateEnt = bdlDateEnt;
		this.bdlTimeEnt = bdlTimeEnt;
		this.bdlDatePro = bdlDatePro;
		this.bdlTimePro = bdlTimePro;
		this.bdlUser1 = bdlUser1;
		this.bdlUser2 = bdlUser2;
		this.bdlQadc01 = bdlQadc01;
		this.oidBdlMstr = oidBdlMstr;
	}

	// Property accessors

	public BdlMstrId getId() {
		return this.id;
	}

	public void setId(BdlMstrId id) {
		this.id = id;
	}

	public String getBdlExec() {
		return this.bdlExec;
	}

	public void setBdlExec(String bdlExec) {
		this.bdlExec = bdlExec;
	}

	public Integer getBdlPgmErrs() {
		return this.bdlPgmErrs;
	}

	public void setBdlPgmErrs(Integer bdlPgmErrs) {
		this.bdlPgmErrs = bdlPgmErrs;
	}

	public Integer getBdlProErrs() {
		return this.bdlProErrs;
	}

	public void setBdlProErrs(Integer bdlProErrs) {
		this.bdlProErrs = bdlProErrs;
	}

	public Date getBdlDateEnt() {
		return this.bdlDateEnt;
	}

	public void setBdlDateEnt(Date bdlDateEnt) {
		this.bdlDateEnt = bdlDateEnt;
	}

	public String getBdlTimeEnt() {
		return this.bdlTimeEnt;
	}

	public void setBdlTimeEnt(String bdlTimeEnt) {
		this.bdlTimeEnt = bdlTimeEnt;
	}

	public Date getBdlDatePro() {
		return this.bdlDatePro;
	}

	public void setBdlDatePro(Date bdlDatePro) {
		this.bdlDatePro = bdlDatePro;
	}

	public String getBdlTimePro() {
		return this.bdlTimePro;
	}

	public void setBdlTimePro(String bdlTimePro) {
		this.bdlTimePro = bdlTimePro;
	}

	public String getBdlUser1() {
		return this.bdlUser1;
	}

	public void setBdlUser1(String bdlUser1) {
		this.bdlUser1 = bdlUser1;
	}

	public String getBdlUser2() {
		return this.bdlUser2;
	}

	public void setBdlUser2(String bdlUser2) {
		this.bdlUser2 = bdlUser2;
	}

	public String getBdlQadc01() {
		return this.bdlQadc01;
	}

	public void setBdlQadc01(String bdlQadc01) {
		this.bdlQadc01 = bdlQadc01;
	}

	public Double getOidBdlMstr() {
		return this.oidBdlMstr;
	}

	public void setOidBdlMstr(Double oidBdlMstr) {
		this.oidBdlMstr = oidBdlMstr;
	}

}