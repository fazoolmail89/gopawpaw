package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * AbstractKbmdMstr entity provides the base persistence definition of the
 * KbmdMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKbmdMstr implements java.io.Serializable {

	// Fields

	private KbmdMstrId id;
	private String kbmdPeriod;
	private Integer kbmdDemand;
	private String kbmdModUserid;
	private Date kbmdModDate;
	private String kbmdUser1;
	private String kbmdUser2;
	private String kbmdChr01;
	private Double kbmdDec01;
	private Date kbmdDte01;
	private Boolean kbmdLog01;
	private Integer kbmdInt01;
	private String kbmdQadc01;
	private Integer kbmdQadi01;
	private Double kbmdQadd01;
	private Boolean kbmdQadl01;
	private Date kbmdQadt01;
	private Double oidKbmdMstr;

	// Constructors

	/** default constructor */
	public AbstractKbmdMstr() {
	}

	/** minimal constructor */
	public AbstractKbmdMstr(KbmdMstrId id, String kbmdPeriod,
			Integer kbmdDemand, String kbmdModUserid, Date kbmdModDate,
			String kbmdUser1, String kbmdUser2, String kbmdChr01,
			Double kbmdDec01, Boolean kbmdLog01, Integer kbmdInt01,
			String kbmdQadc01, Integer kbmdQadi01, Double kbmdQadd01,
			Boolean kbmdQadl01, Double oidKbmdMstr) {
		this.id = id;
		this.kbmdPeriod = kbmdPeriod;
		this.kbmdDemand = kbmdDemand;
		this.kbmdModUserid = kbmdModUserid;
		this.kbmdModDate = kbmdModDate;
		this.kbmdUser1 = kbmdUser1;
		this.kbmdUser2 = kbmdUser2;
		this.kbmdChr01 = kbmdChr01;
		this.kbmdDec01 = kbmdDec01;
		this.kbmdLog01 = kbmdLog01;
		this.kbmdInt01 = kbmdInt01;
		this.kbmdQadc01 = kbmdQadc01;
		this.kbmdQadi01 = kbmdQadi01;
		this.kbmdQadd01 = kbmdQadd01;
		this.kbmdQadl01 = kbmdQadl01;
		this.oidKbmdMstr = oidKbmdMstr;
	}

	/** full constructor */
	public AbstractKbmdMstr(KbmdMstrId id, String kbmdPeriod,
			Integer kbmdDemand, String kbmdModUserid, Date kbmdModDate,
			String kbmdUser1, String kbmdUser2, String kbmdChr01,
			Double kbmdDec01, Date kbmdDte01, Boolean kbmdLog01,
			Integer kbmdInt01, String kbmdQadc01, Integer kbmdQadi01,
			Double kbmdQadd01, Boolean kbmdQadl01, Date kbmdQadt01,
			Double oidKbmdMstr) {
		this.id = id;
		this.kbmdPeriod = kbmdPeriod;
		this.kbmdDemand = kbmdDemand;
		this.kbmdModUserid = kbmdModUserid;
		this.kbmdModDate = kbmdModDate;
		this.kbmdUser1 = kbmdUser1;
		this.kbmdUser2 = kbmdUser2;
		this.kbmdChr01 = kbmdChr01;
		this.kbmdDec01 = kbmdDec01;
		this.kbmdDte01 = kbmdDte01;
		this.kbmdLog01 = kbmdLog01;
		this.kbmdInt01 = kbmdInt01;
		this.kbmdQadc01 = kbmdQadc01;
		this.kbmdQadi01 = kbmdQadi01;
		this.kbmdQadd01 = kbmdQadd01;
		this.kbmdQadl01 = kbmdQadl01;
		this.kbmdQadt01 = kbmdQadt01;
		this.oidKbmdMstr = oidKbmdMstr;
	}

	// Property accessors

	public KbmdMstrId getId() {
		return this.id;
	}

	public void setId(KbmdMstrId id) {
		this.id = id;
	}

	public String getKbmdPeriod() {
		return this.kbmdPeriod;
	}

	public void setKbmdPeriod(String kbmdPeriod) {
		this.kbmdPeriod = kbmdPeriod;
	}

	public Integer getKbmdDemand() {
		return this.kbmdDemand;
	}

	public void setKbmdDemand(Integer kbmdDemand) {
		this.kbmdDemand = kbmdDemand;
	}

	public String getKbmdModUserid() {
		return this.kbmdModUserid;
	}

	public void setKbmdModUserid(String kbmdModUserid) {
		this.kbmdModUserid = kbmdModUserid;
	}

	public Date getKbmdModDate() {
		return this.kbmdModDate;
	}

	public void setKbmdModDate(Date kbmdModDate) {
		this.kbmdModDate = kbmdModDate;
	}

	public String getKbmdUser1() {
		return this.kbmdUser1;
	}

	public void setKbmdUser1(String kbmdUser1) {
		this.kbmdUser1 = kbmdUser1;
	}

	public String getKbmdUser2() {
		return this.kbmdUser2;
	}

	public void setKbmdUser2(String kbmdUser2) {
		this.kbmdUser2 = kbmdUser2;
	}

	public String getKbmdChr01() {
		return this.kbmdChr01;
	}

	public void setKbmdChr01(String kbmdChr01) {
		this.kbmdChr01 = kbmdChr01;
	}

	public Double getKbmdDec01() {
		return this.kbmdDec01;
	}

	public void setKbmdDec01(Double kbmdDec01) {
		this.kbmdDec01 = kbmdDec01;
	}

	public Date getKbmdDte01() {
		return this.kbmdDte01;
	}

	public void setKbmdDte01(Date kbmdDte01) {
		this.kbmdDte01 = kbmdDte01;
	}

	public Boolean getKbmdLog01() {
		return this.kbmdLog01;
	}

	public void setKbmdLog01(Boolean kbmdLog01) {
		this.kbmdLog01 = kbmdLog01;
	}

	public Integer getKbmdInt01() {
		return this.kbmdInt01;
	}

	public void setKbmdInt01(Integer kbmdInt01) {
		this.kbmdInt01 = kbmdInt01;
	}

	public String getKbmdQadc01() {
		return this.kbmdQadc01;
	}

	public void setKbmdQadc01(String kbmdQadc01) {
		this.kbmdQadc01 = kbmdQadc01;
	}

	public Integer getKbmdQadi01() {
		return this.kbmdQadi01;
	}

	public void setKbmdQadi01(Integer kbmdQadi01) {
		this.kbmdQadi01 = kbmdQadi01;
	}

	public Double getKbmdQadd01() {
		return this.kbmdQadd01;
	}

	public void setKbmdQadd01(Double kbmdQadd01) {
		this.kbmdQadd01 = kbmdQadd01;
	}

	public Boolean getKbmdQadl01() {
		return this.kbmdQadl01;
	}

	public void setKbmdQadl01(Boolean kbmdQadl01) {
		this.kbmdQadl01 = kbmdQadl01;
	}

	public Date getKbmdQadt01() {
		return this.kbmdQadt01;
	}

	public void setKbmdQadt01(Date kbmdQadt01) {
		this.kbmdQadt01 = kbmdQadt01;
	}

	public Double getOidKbmdMstr() {
		return this.oidKbmdMstr;
	}

	public void setOidKbmdMstr(Double oidKbmdMstr) {
		this.oidKbmdMstr = oidKbmdMstr;
	}

}