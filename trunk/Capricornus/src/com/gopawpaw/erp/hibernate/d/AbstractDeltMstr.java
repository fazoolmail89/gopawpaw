package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * AbstractDeltMstr entity provides the base persistence definition of the
 * DeltMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDeltMstr implements java.io.Serializable {

	// Fields

	private DeltMstrId id;
	private Integer deltTransit;
	private String deltUserc01;
	private String deltUserc02;
	private Double deltUserd01;
	private Date deltUsert01;
	private Integer deltUseri01;
	private Boolean deltUserl01;
	private String deltQadc01;
	private Double deltQadd01;
	private Integer deltQadi01;
	private Boolean deltQadl01;
	private Date deltQadt01;
	private Date deltModDate;
	private String deltModUserid;
	private Double oidDeltMstr;

	// Constructors

	/** default constructor */
	public AbstractDeltMstr() {
	}

	/** minimal constructor */
	public AbstractDeltMstr(DeltMstrId id, Integer deltTransit,
			String deltUserc01, String deltUserc02, Double deltUserd01,
			Integer deltUseri01, Boolean deltUserl01, String deltQadc01,
			Double deltQadd01, Integer deltQadi01, Boolean deltQadl01,
			String deltModUserid, Double oidDeltMstr) {
		this.id = id;
		this.deltTransit = deltTransit;
		this.deltUserc01 = deltUserc01;
		this.deltUserc02 = deltUserc02;
		this.deltUserd01 = deltUserd01;
		this.deltUseri01 = deltUseri01;
		this.deltUserl01 = deltUserl01;
		this.deltQadc01 = deltQadc01;
		this.deltQadd01 = deltQadd01;
		this.deltQadi01 = deltQadi01;
		this.deltQadl01 = deltQadl01;
		this.deltModUserid = deltModUserid;
		this.oidDeltMstr = oidDeltMstr;
	}

	/** full constructor */
	public AbstractDeltMstr(DeltMstrId id, Integer deltTransit,
			String deltUserc01, String deltUserc02, Double deltUserd01,
			Date deltUsert01, Integer deltUseri01, Boolean deltUserl01,
			String deltQadc01, Double deltQadd01, Integer deltQadi01,
			Boolean deltQadl01, Date deltQadt01, Date deltModDate,
			String deltModUserid, Double oidDeltMstr) {
		this.id = id;
		this.deltTransit = deltTransit;
		this.deltUserc01 = deltUserc01;
		this.deltUserc02 = deltUserc02;
		this.deltUserd01 = deltUserd01;
		this.deltUsert01 = deltUsert01;
		this.deltUseri01 = deltUseri01;
		this.deltUserl01 = deltUserl01;
		this.deltQadc01 = deltQadc01;
		this.deltQadd01 = deltQadd01;
		this.deltQadi01 = deltQadi01;
		this.deltQadl01 = deltQadl01;
		this.deltQadt01 = deltQadt01;
		this.deltModDate = deltModDate;
		this.deltModUserid = deltModUserid;
		this.oidDeltMstr = oidDeltMstr;
	}

	// Property accessors

	public DeltMstrId getId() {
		return this.id;
	}

	public void setId(DeltMstrId id) {
		this.id = id;
	}

	public Integer getDeltTransit() {
		return this.deltTransit;
	}

	public void setDeltTransit(Integer deltTransit) {
		this.deltTransit = deltTransit;
	}

	public String getDeltUserc01() {
		return this.deltUserc01;
	}

	public void setDeltUserc01(String deltUserc01) {
		this.deltUserc01 = deltUserc01;
	}

	public String getDeltUserc02() {
		return this.deltUserc02;
	}

	public void setDeltUserc02(String deltUserc02) {
		this.deltUserc02 = deltUserc02;
	}

	public Double getDeltUserd01() {
		return this.deltUserd01;
	}

	public void setDeltUserd01(Double deltUserd01) {
		this.deltUserd01 = deltUserd01;
	}

	public Date getDeltUsert01() {
		return this.deltUsert01;
	}

	public void setDeltUsert01(Date deltUsert01) {
		this.deltUsert01 = deltUsert01;
	}

	public Integer getDeltUseri01() {
		return this.deltUseri01;
	}

	public void setDeltUseri01(Integer deltUseri01) {
		this.deltUseri01 = deltUseri01;
	}

	public Boolean getDeltUserl01() {
		return this.deltUserl01;
	}

	public void setDeltUserl01(Boolean deltUserl01) {
		this.deltUserl01 = deltUserl01;
	}

	public String getDeltQadc01() {
		return this.deltQadc01;
	}

	public void setDeltQadc01(String deltQadc01) {
		this.deltQadc01 = deltQadc01;
	}

	public Double getDeltQadd01() {
		return this.deltQadd01;
	}

	public void setDeltQadd01(Double deltQadd01) {
		this.deltQadd01 = deltQadd01;
	}

	public Integer getDeltQadi01() {
		return this.deltQadi01;
	}

	public void setDeltQadi01(Integer deltQadi01) {
		this.deltQadi01 = deltQadi01;
	}

	public Boolean getDeltQadl01() {
		return this.deltQadl01;
	}

	public void setDeltQadl01(Boolean deltQadl01) {
		this.deltQadl01 = deltQadl01;
	}

	public Date getDeltQadt01() {
		return this.deltQadt01;
	}

	public void setDeltQadt01(Date deltQadt01) {
		this.deltQadt01 = deltQadt01;
	}

	public Date getDeltModDate() {
		return this.deltModDate;
	}

	public void setDeltModDate(Date deltModDate) {
		this.deltModDate = deltModDate;
	}

	public String getDeltModUserid() {
		return this.deltModUserid;
	}

	public void setDeltModUserid(String deltModUserid) {
		this.deltModUserid = deltModUserid;
	}

	public Double getOidDeltMstr() {
		return this.oidDeltMstr;
	}

	public void setOidDeltMstr(Double oidDeltMstr) {
		this.oidDeltMstr = oidDeltMstr;
	}

}