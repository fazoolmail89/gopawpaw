package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * AbstractKnbfdDet entity provides the base persistence definition of the
 * KnbfdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnbfdDet implements java.io.Serializable {

	// Fields

	private KnbfdDetId id;
	private Double knbfdKnbKeyid;
	private Integer knbfdSeq;
	private Double knbfdKnpKeyid;
	private Date knbfdModDate;
	private String knbfdModUserid;
	private String knbfdUser1;
	private String knbfdUser2;
	private String knbfdQadc01;
	private String knbfdQadc02;
	private Double knbfdKnbsKeyid;
	private Double oidKnbfdDet;

	// Constructors

	/** default constructor */
	public AbstractKnbfdDet() {
	}

	/** full constructor */
	public AbstractKnbfdDet(KnbfdDetId id, Double knbfdKnbKeyid,
			Integer knbfdSeq, Double knbfdKnpKeyid, Date knbfdModDate,
			String knbfdModUserid, String knbfdUser1, String knbfdUser2,
			String knbfdQadc01, String knbfdQadc02, Double knbfdKnbsKeyid,
			Double oidKnbfdDet) {
		this.id = id;
		this.knbfdKnbKeyid = knbfdKnbKeyid;
		this.knbfdSeq = knbfdSeq;
		this.knbfdKnpKeyid = knbfdKnpKeyid;
		this.knbfdModDate = knbfdModDate;
		this.knbfdModUserid = knbfdModUserid;
		this.knbfdUser1 = knbfdUser1;
		this.knbfdUser2 = knbfdUser2;
		this.knbfdQadc01 = knbfdQadc01;
		this.knbfdQadc02 = knbfdQadc02;
		this.knbfdKnbsKeyid = knbfdKnbsKeyid;
		this.oidKnbfdDet = oidKnbfdDet;
	}

	// Property accessors

	public KnbfdDetId getId() {
		return this.id;
	}

	public void setId(KnbfdDetId id) {
		this.id = id;
	}

	public Double getKnbfdKnbKeyid() {
		return this.knbfdKnbKeyid;
	}

	public void setKnbfdKnbKeyid(Double knbfdKnbKeyid) {
		this.knbfdKnbKeyid = knbfdKnbKeyid;
	}

	public Integer getKnbfdSeq() {
		return this.knbfdSeq;
	}

	public void setKnbfdSeq(Integer knbfdSeq) {
		this.knbfdSeq = knbfdSeq;
	}

	public Double getKnbfdKnpKeyid() {
		return this.knbfdKnpKeyid;
	}

	public void setKnbfdKnpKeyid(Double knbfdKnpKeyid) {
		this.knbfdKnpKeyid = knbfdKnpKeyid;
	}

	public Date getKnbfdModDate() {
		return this.knbfdModDate;
	}

	public void setKnbfdModDate(Date knbfdModDate) {
		this.knbfdModDate = knbfdModDate;
	}

	public String getKnbfdModUserid() {
		return this.knbfdModUserid;
	}

	public void setKnbfdModUserid(String knbfdModUserid) {
		this.knbfdModUserid = knbfdModUserid;
	}

	public String getKnbfdUser1() {
		return this.knbfdUser1;
	}

	public void setKnbfdUser1(String knbfdUser1) {
		this.knbfdUser1 = knbfdUser1;
	}

	public String getKnbfdUser2() {
		return this.knbfdUser2;
	}

	public void setKnbfdUser2(String knbfdUser2) {
		this.knbfdUser2 = knbfdUser2;
	}

	public String getKnbfdQadc01() {
		return this.knbfdQadc01;
	}

	public void setKnbfdQadc01(String knbfdQadc01) {
		this.knbfdQadc01 = knbfdQadc01;
	}

	public String getKnbfdQadc02() {
		return this.knbfdQadc02;
	}

	public void setKnbfdQadc02(String knbfdQadc02) {
		this.knbfdQadc02 = knbfdQadc02;
	}

	public Double getKnbfdKnbsKeyid() {
		return this.knbfdKnbsKeyid;
	}

	public void setKnbfdKnbsKeyid(Double knbfdKnbsKeyid) {
		this.knbfdKnbsKeyid = knbfdKnbsKeyid;
	}

	public Double getOidKnbfdDet() {
		return this.oidKnbfdDet;
	}

	public void setOidKnbfdDet(Double oidKnbfdDet) {
		this.oidKnbfdDet = oidKnbfdDet;
	}

}