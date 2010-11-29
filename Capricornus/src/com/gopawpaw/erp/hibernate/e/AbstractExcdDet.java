package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractExcdDet entity provides the base persistence definition of the
 * ExcdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractExcdDet implements java.io.Serializable {

	// Fields

	private ExcdDetId id;
	private String excdXcc;
	private String excdXacType;
	private Double excdRate;
	private String excdUser1;
	private String excdUser2;
	private Double excdEnRate;
	private String excdQadc01;
	private Double excdExRate2;
	private String excdExRatetype;
	private Integer excdExruSeq;
	private Double oidExcdDet;

	// Constructors

	/** default constructor */
	public AbstractExcdDet() {
	}

	/** minimal constructor */
	public AbstractExcdDet(ExcdDetId id, Double excdExRate2,
			String excdExRatetype, Integer excdExruSeq, Double oidExcdDet) {
		this.id = id;
		this.excdExRate2 = excdExRate2;
		this.excdExRatetype = excdExRatetype;
		this.excdExruSeq = excdExruSeq;
		this.oidExcdDet = oidExcdDet;
	}

	/** full constructor */
	public AbstractExcdDet(ExcdDetId id, String excdXcc, String excdXacType,
			Double excdRate, String excdUser1, String excdUser2,
			Double excdEnRate, String excdQadc01, Double excdExRate2,
			String excdExRatetype, Integer excdExruSeq, Double oidExcdDet) {
		this.id = id;
		this.excdXcc = excdXcc;
		this.excdXacType = excdXacType;
		this.excdRate = excdRate;
		this.excdUser1 = excdUser1;
		this.excdUser2 = excdUser2;
		this.excdEnRate = excdEnRate;
		this.excdQadc01 = excdQadc01;
		this.excdExRate2 = excdExRate2;
		this.excdExRatetype = excdExRatetype;
		this.excdExruSeq = excdExruSeq;
		this.oidExcdDet = oidExcdDet;
	}

	// Property accessors

	public ExcdDetId getId() {
		return this.id;
	}

	public void setId(ExcdDetId id) {
		this.id = id;
	}

	public String getExcdXcc() {
		return this.excdXcc;
	}

	public void setExcdXcc(String excdXcc) {
		this.excdXcc = excdXcc;
	}

	public String getExcdXacType() {
		return this.excdXacType;
	}

	public void setExcdXacType(String excdXacType) {
		this.excdXacType = excdXacType;
	}

	public Double getExcdRate() {
		return this.excdRate;
	}

	public void setExcdRate(Double excdRate) {
		this.excdRate = excdRate;
	}

	public String getExcdUser1() {
		return this.excdUser1;
	}

	public void setExcdUser1(String excdUser1) {
		this.excdUser1 = excdUser1;
	}

	public String getExcdUser2() {
		return this.excdUser2;
	}

	public void setExcdUser2(String excdUser2) {
		this.excdUser2 = excdUser2;
	}

	public Double getExcdEnRate() {
		return this.excdEnRate;
	}

	public void setExcdEnRate(Double excdEnRate) {
		this.excdEnRate = excdEnRate;
	}

	public String getExcdQadc01() {
		return this.excdQadc01;
	}

	public void setExcdQadc01(String excdQadc01) {
		this.excdQadc01 = excdQadc01;
	}

	public Double getExcdExRate2() {
		return this.excdExRate2;
	}

	public void setExcdExRate2(Double excdExRate2) {
		this.excdExRate2 = excdExRate2;
	}

	public String getExcdExRatetype() {
		return this.excdExRatetype;
	}

	public void setExcdExRatetype(String excdExRatetype) {
		this.excdExRatetype = excdExRatetype;
	}

	public Integer getExcdExruSeq() {
		return this.excdExruSeq;
	}

	public void setExcdExruSeq(Integer excdExruSeq) {
		this.excdExruSeq = excdExruSeq;
	}

	public Double getOidExcdDet() {
		return this.oidExcdDet;
	}

	public void setOidExcdDet(Double oidExcdDet) {
		this.oidExcdDet = oidExcdDet;
	}

}