package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAlmMstr entity provides the base persistence definition of the
 * AlmMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAlmMstr implements java.io.Serializable {

	// Fields

	private AlmMstrId id;
	private String almLead;
	private Double almSeq;
	private Integer almLen;
	private String almTrail;
	private String almPgm;
	private String almUserid;
	private Date almDate;
	private String almUser1;
	private String almUser2;
	private String almQadc01;
	private Double oidAlmMstr;

	// Constructors

	/** default constructor */
	public AbstractAlmMstr() {
	}

	/** minimal constructor */
	public AbstractAlmMstr(AlmMstrId id, Double oidAlmMstr) {
		this.id = id;
		this.oidAlmMstr = oidAlmMstr;
	}

	/** full constructor */
	public AbstractAlmMstr(AlmMstrId id, String almLead, Double almSeq,
			Integer almLen, String almTrail, String almPgm, String almUserid,
			Date almDate, String almUser1, String almUser2, String almQadc01,
			Double oidAlmMstr) {
		this.id = id;
		this.almLead = almLead;
		this.almSeq = almSeq;
		this.almLen = almLen;
		this.almTrail = almTrail;
		this.almPgm = almPgm;
		this.almUserid = almUserid;
		this.almDate = almDate;
		this.almUser1 = almUser1;
		this.almUser2 = almUser2;
		this.almQadc01 = almQadc01;
		this.oidAlmMstr = oidAlmMstr;
	}

	// Property accessors

	public AlmMstrId getId() {
		return this.id;
	}

	public void setId(AlmMstrId id) {
		this.id = id;
	}

	public String getAlmLead() {
		return this.almLead;
	}

	public void setAlmLead(String almLead) {
		this.almLead = almLead;
	}

	public Double getAlmSeq() {
		return this.almSeq;
	}

	public void setAlmSeq(Double almSeq) {
		this.almSeq = almSeq;
	}

	public Integer getAlmLen() {
		return this.almLen;
	}

	public void setAlmLen(Integer almLen) {
		this.almLen = almLen;
	}

	public String getAlmTrail() {
		return this.almTrail;
	}

	public void setAlmTrail(String almTrail) {
		this.almTrail = almTrail;
	}

	public String getAlmPgm() {
		return this.almPgm;
	}

	public void setAlmPgm(String almPgm) {
		this.almPgm = almPgm;
	}

	public String getAlmUserid() {
		return this.almUserid;
	}

	public void setAlmUserid(String almUserid) {
		this.almUserid = almUserid;
	}

	public Date getAlmDate() {
		return this.almDate;
	}

	public void setAlmDate(Date almDate) {
		this.almDate = almDate;
	}

	public String getAlmUser1() {
		return this.almUser1;
	}

	public void setAlmUser1(String almUser1) {
		this.almUser1 = almUser1;
	}

	public String getAlmUser2() {
		return this.almUser2;
	}

	public void setAlmUser2(String almUser2) {
		this.almUser2 = almUser2;
	}

	public String getAlmQadc01() {
		return this.almQadc01;
	}

	public void setAlmQadc01(String almQadc01) {
		this.almQadc01 = almQadc01;
	}

	public Double getOidAlmMstr() {
		return this.oidAlmMstr;
	}

	public void setOidAlmMstr(Double oidAlmMstr) {
		this.oidAlmMstr = oidAlmMstr;
	}

}