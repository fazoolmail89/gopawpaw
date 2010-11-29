package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * AbstractBcdDetId entity provides the base persistence definition of the
 * BcdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBcdDetId implements java.io.Serializable {

	// Fields

	private String bcdDomain;
	private String bcdBatch;
	private Date bcdDateSub;
	private String bcdTimeSub;
	private String bcdUserid;

	// Constructors

	/** default constructor */
	public AbstractBcdDetId() {
	}

	/** minimal constructor */
	public AbstractBcdDetId(String bcdDomain) {
		this.bcdDomain = bcdDomain;
	}

	/** full constructor */
	public AbstractBcdDetId(String bcdDomain, String bcdBatch, Date bcdDateSub,
			String bcdTimeSub, String bcdUserid) {
		this.bcdDomain = bcdDomain;
		this.bcdBatch = bcdBatch;
		this.bcdDateSub = bcdDateSub;
		this.bcdTimeSub = bcdTimeSub;
		this.bcdUserid = bcdUserid;
	}

	// Property accessors

	public String getBcdDomain() {
		return this.bcdDomain;
	}

	public void setBcdDomain(String bcdDomain) {
		this.bcdDomain = bcdDomain;
	}

	public String getBcdBatch() {
		return this.bcdBatch;
	}

	public void setBcdBatch(String bcdBatch) {
		this.bcdBatch = bcdBatch;
	}

	public Date getBcdDateSub() {
		return this.bcdDateSub;
	}

	public void setBcdDateSub(Date bcdDateSub) {
		this.bcdDateSub = bcdDateSub;
	}

	public String getBcdTimeSub() {
		return this.bcdTimeSub;
	}

	public void setBcdTimeSub(String bcdTimeSub) {
		this.bcdTimeSub = bcdTimeSub;
	}

	public String getBcdUserid() {
		return this.bcdUserid;
	}

	public void setBcdUserid(String bcdUserid) {
		this.bcdUserid = bcdUserid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractBcdDetId))
			return false;
		AbstractBcdDetId castOther = (AbstractBcdDetId) other;

		return ((this.getBcdDomain() == castOther.getBcdDomain()) || (this
				.getBcdDomain() != null
				&& castOther.getBcdDomain() != null && this.getBcdDomain()
				.equals(castOther.getBcdDomain())))
				&& ((this.getBcdBatch() == castOther.getBcdBatch()) || (this
						.getBcdBatch() != null
						&& castOther.getBcdBatch() != null && this
						.getBcdBatch().equals(castOther.getBcdBatch())))
				&& ((this.getBcdDateSub() == castOther.getBcdDateSub()) || (this
						.getBcdDateSub() != null
						&& castOther.getBcdDateSub() != null && this
						.getBcdDateSub().equals(castOther.getBcdDateSub())))
				&& ((this.getBcdTimeSub() == castOther.getBcdTimeSub()) || (this
						.getBcdTimeSub() != null
						&& castOther.getBcdTimeSub() != null && this
						.getBcdTimeSub().equals(castOther.getBcdTimeSub())))
				&& ((this.getBcdUserid() == castOther.getBcdUserid()) || (this
						.getBcdUserid() != null
						&& castOther.getBcdUserid() != null && this
						.getBcdUserid().equals(castOther.getBcdUserid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getBcdDomain() == null ? 0 : this.getBcdDomain().hashCode());
		result = 37 * result
				+ (getBcdBatch() == null ? 0 : this.getBcdBatch().hashCode());
		result = 37
				* result
				+ (getBcdDateSub() == null ? 0 : this.getBcdDateSub()
						.hashCode());
		result = 37
				* result
				+ (getBcdTimeSub() == null ? 0 : this.getBcdTimeSub()
						.hashCode());
		result = 37 * result
				+ (getBcdUserid() == null ? 0 : this.getBcdUserid().hashCode());
		return result;
	}

}