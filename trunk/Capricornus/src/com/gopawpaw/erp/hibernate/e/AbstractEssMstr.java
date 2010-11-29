package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEssMstr entity provides the base persistence definition of the
 * EssMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEssMstr implements java.io.Serializable {

	// Fields

	private EssMstrId id;
	private String essDesc;
	private Boolean essAvailable;
	private String essUser1;
	private String essUser2;
	private Date essModDate;
	private String essModUserid;
	private String essChr01;
	private Boolean essLog01;
	private String essQadc01;
	private Boolean essQadl01;
	private Double oidEssMstr;

	// Constructors

	/** default constructor */
	public AbstractEssMstr() {
	}

	/** minimal constructor */
	public AbstractEssMstr(EssMstrId id, Double oidEssMstr) {
		this.id = id;
		this.oidEssMstr = oidEssMstr;
	}

	/** full constructor */
	public AbstractEssMstr(EssMstrId id, String essDesc, Boolean essAvailable,
			String essUser1, String essUser2, Date essModDate,
			String essModUserid, String essChr01, Boolean essLog01,
			String essQadc01, Boolean essQadl01, Double oidEssMstr) {
		this.id = id;
		this.essDesc = essDesc;
		this.essAvailable = essAvailable;
		this.essUser1 = essUser1;
		this.essUser2 = essUser2;
		this.essModDate = essModDate;
		this.essModUserid = essModUserid;
		this.essChr01 = essChr01;
		this.essLog01 = essLog01;
		this.essQadc01 = essQadc01;
		this.essQadl01 = essQadl01;
		this.oidEssMstr = oidEssMstr;
	}

	// Property accessors

	public EssMstrId getId() {
		return this.id;
	}

	public void setId(EssMstrId id) {
		this.id = id;
	}

	public String getEssDesc() {
		return this.essDesc;
	}

	public void setEssDesc(String essDesc) {
		this.essDesc = essDesc;
	}

	public Boolean getEssAvailable() {
		return this.essAvailable;
	}

	public void setEssAvailable(Boolean essAvailable) {
		this.essAvailable = essAvailable;
	}

	public String getEssUser1() {
		return this.essUser1;
	}

	public void setEssUser1(String essUser1) {
		this.essUser1 = essUser1;
	}

	public String getEssUser2() {
		return this.essUser2;
	}

	public void setEssUser2(String essUser2) {
		this.essUser2 = essUser2;
	}

	public Date getEssModDate() {
		return this.essModDate;
	}

	public void setEssModDate(Date essModDate) {
		this.essModDate = essModDate;
	}

	public String getEssModUserid() {
		return this.essModUserid;
	}

	public void setEssModUserid(String essModUserid) {
		this.essModUserid = essModUserid;
	}

	public String getEssChr01() {
		return this.essChr01;
	}

	public void setEssChr01(String essChr01) {
		this.essChr01 = essChr01;
	}

	public Boolean getEssLog01() {
		return this.essLog01;
	}

	public void setEssLog01(Boolean essLog01) {
		this.essLog01 = essLog01;
	}

	public String getEssQadc01() {
		return this.essQadc01;
	}

	public void setEssQadc01(String essQadc01) {
		this.essQadc01 = essQadc01;
	}

	public Boolean getEssQadl01() {
		return this.essQadl01;
	}

	public void setEssQadl01(Boolean essQadl01) {
		this.essQadl01 = essQadl01;
	}

	public Double getOidEssMstr() {
		return this.oidEssMstr;
	}

	public void setOidEssMstr(Double oidEssMstr) {
		this.oidEssMstr = oidEssMstr;
	}

}