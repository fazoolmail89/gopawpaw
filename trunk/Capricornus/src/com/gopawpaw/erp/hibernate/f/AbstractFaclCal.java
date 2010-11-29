package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFaclCal entity provides the base persistence definition of the
 * FaclCal entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFaclCal implements java.io.Serializable {

	// Fields

	private FaclCalId id;
	private String faclModUserid;
	private Date faclModDate;
	private String faclUser1;
	private String faclUser2;
	private String faclChr01;
	private Double faclDec01;
	private Boolean faclLog01;
	private Date faclDte01;
	private Integer faclInt01;
	private String faclQadc01;
	private Double faclQadd01;
	private Boolean faclQadl01;
	private Integer faclQadi01;
	private Date faclQadt01;
	private Double oidFaclCal;

	// Constructors

	/** default constructor */
	public AbstractFaclCal() {
	}

	/** minimal constructor */
	public AbstractFaclCal(FaclCalId id, String faclModUserid,
			Date faclModDate, String faclUser1, String faclUser2,
			String faclChr01, Double faclDec01, Boolean faclLog01,
			Integer faclInt01, String faclQadc01, Double faclQadd01,
			Boolean faclQadl01, Integer faclQadi01, Double oidFaclCal) {
		this.id = id;
		this.faclModUserid = faclModUserid;
		this.faclModDate = faclModDate;
		this.faclUser1 = faclUser1;
		this.faclUser2 = faclUser2;
		this.faclChr01 = faclChr01;
		this.faclDec01 = faclDec01;
		this.faclLog01 = faclLog01;
		this.faclInt01 = faclInt01;
		this.faclQadc01 = faclQadc01;
		this.faclQadd01 = faclQadd01;
		this.faclQadl01 = faclQadl01;
		this.faclQadi01 = faclQadi01;
		this.oidFaclCal = oidFaclCal;
	}

	/** full constructor */
	public AbstractFaclCal(FaclCalId id, String faclModUserid,
			Date faclModDate, String faclUser1, String faclUser2,
			String faclChr01, Double faclDec01, Boolean faclLog01,
			Date faclDte01, Integer faclInt01, String faclQadc01,
			Double faclQadd01, Boolean faclQadl01, Integer faclQadi01,
			Date faclQadt01, Double oidFaclCal) {
		this.id = id;
		this.faclModUserid = faclModUserid;
		this.faclModDate = faclModDate;
		this.faclUser1 = faclUser1;
		this.faclUser2 = faclUser2;
		this.faclChr01 = faclChr01;
		this.faclDec01 = faclDec01;
		this.faclLog01 = faclLog01;
		this.faclDte01 = faclDte01;
		this.faclInt01 = faclInt01;
		this.faclQadc01 = faclQadc01;
		this.faclQadd01 = faclQadd01;
		this.faclQadl01 = faclQadl01;
		this.faclQadi01 = faclQadi01;
		this.faclQadt01 = faclQadt01;
		this.oidFaclCal = oidFaclCal;
	}

	// Property accessors

	public FaclCalId getId() {
		return this.id;
	}

	public void setId(FaclCalId id) {
		this.id = id;
	}

	public String getFaclModUserid() {
		return this.faclModUserid;
	}

	public void setFaclModUserid(String faclModUserid) {
		this.faclModUserid = faclModUserid;
	}

	public Date getFaclModDate() {
		return this.faclModDate;
	}

	public void setFaclModDate(Date faclModDate) {
		this.faclModDate = faclModDate;
	}

	public String getFaclUser1() {
		return this.faclUser1;
	}

	public void setFaclUser1(String faclUser1) {
		this.faclUser1 = faclUser1;
	}

	public String getFaclUser2() {
		return this.faclUser2;
	}

	public void setFaclUser2(String faclUser2) {
		this.faclUser2 = faclUser2;
	}

	public String getFaclChr01() {
		return this.faclChr01;
	}

	public void setFaclChr01(String faclChr01) {
		this.faclChr01 = faclChr01;
	}

	public Double getFaclDec01() {
		return this.faclDec01;
	}

	public void setFaclDec01(Double faclDec01) {
		this.faclDec01 = faclDec01;
	}

	public Boolean getFaclLog01() {
		return this.faclLog01;
	}

	public void setFaclLog01(Boolean faclLog01) {
		this.faclLog01 = faclLog01;
	}

	public Date getFaclDte01() {
		return this.faclDte01;
	}

	public void setFaclDte01(Date faclDte01) {
		this.faclDte01 = faclDte01;
	}

	public Integer getFaclInt01() {
		return this.faclInt01;
	}

	public void setFaclInt01(Integer faclInt01) {
		this.faclInt01 = faclInt01;
	}

	public String getFaclQadc01() {
		return this.faclQadc01;
	}

	public void setFaclQadc01(String faclQadc01) {
		this.faclQadc01 = faclQadc01;
	}

	public Double getFaclQadd01() {
		return this.faclQadd01;
	}

	public void setFaclQadd01(Double faclQadd01) {
		this.faclQadd01 = faclQadd01;
	}

	public Boolean getFaclQadl01() {
		return this.faclQadl01;
	}

	public void setFaclQadl01(Boolean faclQadl01) {
		this.faclQadl01 = faclQadl01;
	}

	public Integer getFaclQadi01() {
		return this.faclQadi01;
	}

	public void setFaclQadi01(Integer faclQadi01) {
		this.faclQadi01 = faclQadi01;
	}

	public Date getFaclQadt01() {
		return this.faclQadt01;
	}

	public void setFaclQadt01(Date faclQadt01) {
		this.faclQadt01 = faclQadt01;
	}

	public Double getOidFaclCal() {
		return this.oidFaclCal;
	}

	public void setOidFaclCal(Double oidFaclCal) {
		this.oidFaclCal = oidFaclCal;
	}

}