package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * AbstractKnbMstr entity provides the base persistence definition of the
 * KnbMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnbMstr implements java.io.Serializable {

	// Fields

	private KnbMstrId id;
	private Double knbKnbiKeyid;
	private Double knbKnbsKeyid;
	private Double knbKnbsmKeyid;
	private String knbLoopType;
	private Date knbModDate;
	private String knbModUserid;
	private String knbUser1;
	private String knbUser2;
	private String knbQadc01;
	private String knbQadc02;
	private Double oidKnbMstr;

	// Constructors

	/** default constructor */
	public AbstractKnbMstr() {
	}

	/** full constructor */
	public AbstractKnbMstr(KnbMstrId id, Double knbKnbiKeyid,
			Double knbKnbsKeyid, Double knbKnbsmKeyid, String knbLoopType,
			Date knbModDate, String knbModUserid, String knbUser1,
			String knbUser2, String knbQadc01, String knbQadc02,
			Double oidKnbMstr) {
		this.id = id;
		this.knbKnbiKeyid = knbKnbiKeyid;
		this.knbKnbsKeyid = knbKnbsKeyid;
		this.knbKnbsmKeyid = knbKnbsmKeyid;
		this.knbLoopType = knbLoopType;
		this.knbModDate = knbModDate;
		this.knbModUserid = knbModUserid;
		this.knbUser1 = knbUser1;
		this.knbUser2 = knbUser2;
		this.knbQadc01 = knbQadc01;
		this.knbQadc02 = knbQadc02;
		this.oidKnbMstr = oidKnbMstr;
	}

	// Property accessors

	public KnbMstrId getId() {
		return this.id;
	}

	public void setId(KnbMstrId id) {
		this.id = id;
	}

	public Double getKnbKnbiKeyid() {
		return this.knbKnbiKeyid;
	}

	public void setKnbKnbiKeyid(Double knbKnbiKeyid) {
		this.knbKnbiKeyid = knbKnbiKeyid;
	}

	public Double getKnbKnbsKeyid() {
		return this.knbKnbsKeyid;
	}

	public void setKnbKnbsKeyid(Double knbKnbsKeyid) {
		this.knbKnbsKeyid = knbKnbsKeyid;
	}

	public Double getKnbKnbsmKeyid() {
		return this.knbKnbsmKeyid;
	}

	public void setKnbKnbsmKeyid(Double knbKnbsmKeyid) {
		this.knbKnbsmKeyid = knbKnbsmKeyid;
	}

	public String getKnbLoopType() {
		return this.knbLoopType;
	}

	public void setKnbLoopType(String knbLoopType) {
		this.knbLoopType = knbLoopType;
	}

	public Date getKnbModDate() {
		return this.knbModDate;
	}

	public void setKnbModDate(Date knbModDate) {
		this.knbModDate = knbModDate;
	}

	public String getKnbModUserid() {
		return this.knbModUserid;
	}

	public void setKnbModUserid(String knbModUserid) {
		this.knbModUserid = knbModUserid;
	}

	public String getKnbUser1() {
		return this.knbUser1;
	}

	public void setKnbUser1(String knbUser1) {
		this.knbUser1 = knbUser1;
	}

	public String getKnbUser2() {
		return this.knbUser2;
	}

	public void setKnbUser2(String knbUser2) {
		this.knbUser2 = knbUser2;
	}

	public String getKnbQadc01() {
		return this.knbQadc01;
	}

	public void setKnbQadc01(String knbQadc01) {
		this.knbQadc01 = knbQadc01;
	}

	public String getKnbQadc02() {
		return this.knbQadc02;
	}

	public void setKnbQadc02(String knbQadc02) {
		this.knbQadc02 = knbQadc02;
	}

	public Double getOidKnbMstr() {
		return this.oidKnbMstr;
	}

	public void setOidKnbMstr(Double oidKnbMstr) {
		this.oidKnbMstr = oidKnbMstr;
	}

}