package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * AbstractKbdtMstr entity provides the base persistence definition of the
 * KbdtMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKbdtMstr implements java.io.Serializable {

	// Fields

	private KbdtMstrId id;
	private String kbdtDesc;
	private String kbdtHistorySource;
	private Integer kbdtHistoryDays;
	private String kbdtFutureSource;
	private Integer kbdtFutureDays;
	private Date kbdtModDate;
	private String kbdtModUserid;
	private String kbdtUser1;
	private String kbdtUser2;
	private String kbdtQadc01;
	private String kbdtQadc02;
	private Double oidKbdtMstr;

	// Constructors

	/** default constructor */
	public AbstractKbdtMstr() {
	}

	/** full constructor */
	public AbstractKbdtMstr(KbdtMstrId id, String kbdtDesc,
			String kbdtHistorySource, Integer kbdtHistoryDays,
			String kbdtFutureSource, Integer kbdtFutureDays, Date kbdtModDate,
			String kbdtModUserid, String kbdtUser1, String kbdtUser2,
			String kbdtQadc01, String kbdtQadc02, Double oidKbdtMstr) {
		this.id = id;
		this.kbdtDesc = kbdtDesc;
		this.kbdtHistorySource = kbdtHistorySource;
		this.kbdtHistoryDays = kbdtHistoryDays;
		this.kbdtFutureSource = kbdtFutureSource;
		this.kbdtFutureDays = kbdtFutureDays;
		this.kbdtModDate = kbdtModDate;
		this.kbdtModUserid = kbdtModUserid;
		this.kbdtUser1 = kbdtUser1;
		this.kbdtUser2 = kbdtUser2;
		this.kbdtQadc01 = kbdtQadc01;
		this.kbdtQadc02 = kbdtQadc02;
		this.oidKbdtMstr = oidKbdtMstr;
	}

	// Property accessors

	public KbdtMstrId getId() {
		return this.id;
	}

	public void setId(KbdtMstrId id) {
		this.id = id;
	}

	public String getKbdtDesc() {
		return this.kbdtDesc;
	}

	public void setKbdtDesc(String kbdtDesc) {
		this.kbdtDesc = kbdtDesc;
	}

	public String getKbdtHistorySource() {
		return this.kbdtHistorySource;
	}

	public void setKbdtHistorySource(String kbdtHistorySource) {
		this.kbdtHistorySource = kbdtHistorySource;
	}

	public Integer getKbdtHistoryDays() {
		return this.kbdtHistoryDays;
	}

	public void setKbdtHistoryDays(Integer kbdtHistoryDays) {
		this.kbdtHistoryDays = kbdtHistoryDays;
	}

	public String getKbdtFutureSource() {
		return this.kbdtFutureSource;
	}

	public void setKbdtFutureSource(String kbdtFutureSource) {
		this.kbdtFutureSource = kbdtFutureSource;
	}

	public Integer getKbdtFutureDays() {
		return this.kbdtFutureDays;
	}

	public void setKbdtFutureDays(Integer kbdtFutureDays) {
		this.kbdtFutureDays = kbdtFutureDays;
	}

	public Date getKbdtModDate() {
		return this.kbdtModDate;
	}

	public void setKbdtModDate(Date kbdtModDate) {
		this.kbdtModDate = kbdtModDate;
	}

	public String getKbdtModUserid() {
		return this.kbdtModUserid;
	}

	public void setKbdtModUserid(String kbdtModUserid) {
		this.kbdtModUserid = kbdtModUserid;
	}

	public String getKbdtUser1() {
		return this.kbdtUser1;
	}

	public void setKbdtUser1(String kbdtUser1) {
		this.kbdtUser1 = kbdtUser1;
	}

	public String getKbdtUser2() {
		return this.kbdtUser2;
	}

	public void setKbdtUser2(String kbdtUser2) {
		this.kbdtUser2 = kbdtUser2;
	}

	public String getKbdtQadc01() {
		return this.kbdtQadc01;
	}

	public void setKbdtQadc01(String kbdtQadc01) {
		this.kbdtQadc01 = kbdtQadc01;
	}

	public String getKbdtQadc02() {
		return this.kbdtQadc02;
	}

	public void setKbdtQadc02(String kbdtQadc02) {
		this.kbdtQadc02 = kbdtQadc02;
	}

	public Double getOidKbdtMstr() {
		return this.oidKbdtMstr;
	}

	public void setOidKbdtMstr(Double oidKbdtMstr) {
		this.oidKbdtMstr = oidKbdtMstr;
	}

}