package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSabDetId entity provides the base persistence definition of the
 * SabDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSabDetId implements java.io.Serializable {

	// Fields

	private String sabDomain;
	private String sabNbr;
	private String sabPrefix;
	private Integer sabLine;
	private Date sabBilledDate;
	private String sabBilledTime;

	// Constructors

	/** default constructor */
	public AbstractSabDetId() {
	}

	/** full constructor */
	public AbstractSabDetId(String sabDomain, String sabNbr, String sabPrefix,
			Integer sabLine, Date sabBilledDate, String sabBilledTime) {
		this.sabDomain = sabDomain;
		this.sabNbr = sabNbr;
		this.sabPrefix = sabPrefix;
		this.sabLine = sabLine;
		this.sabBilledDate = sabBilledDate;
		this.sabBilledTime = sabBilledTime;
	}

	// Property accessors

	public String getSabDomain() {
		return this.sabDomain;
	}

	public void setSabDomain(String sabDomain) {
		this.sabDomain = sabDomain;
	}

	public String getSabNbr() {
		return this.sabNbr;
	}

	public void setSabNbr(String sabNbr) {
		this.sabNbr = sabNbr;
	}

	public String getSabPrefix() {
		return this.sabPrefix;
	}

	public void setSabPrefix(String sabPrefix) {
		this.sabPrefix = sabPrefix;
	}

	public Integer getSabLine() {
		return this.sabLine;
	}

	public void setSabLine(Integer sabLine) {
		this.sabLine = sabLine;
	}

	public Date getSabBilledDate() {
		return this.sabBilledDate;
	}

	public void setSabBilledDate(Date sabBilledDate) {
		this.sabBilledDate = sabBilledDate;
	}

	public String getSabBilledTime() {
		return this.sabBilledTime;
	}

	public void setSabBilledTime(String sabBilledTime) {
		this.sabBilledTime = sabBilledTime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSabDetId))
			return false;
		AbstractSabDetId castOther = (AbstractSabDetId) other;

		return ((this.getSabDomain() == castOther.getSabDomain()) || (this
				.getSabDomain() != null
				&& castOther.getSabDomain() != null && this.getSabDomain()
				.equals(castOther.getSabDomain())))
				&& ((this.getSabNbr() == castOther.getSabNbr()) || (this
						.getSabNbr() != null
						&& castOther.getSabNbr() != null && this.getSabNbr()
						.equals(castOther.getSabNbr())))
				&& ((this.getSabPrefix() == castOther.getSabPrefix()) || (this
						.getSabPrefix() != null
						&& castOther.getSabPrefix() != null && this
						.getSabPrefix().equals(castOther.getSabPrefix())))
				&& ((this.getSabLine() == castOther.getSabLine()) || (this
						.getSabLine() != null
						&& castOther.getSabLine() != null && this.getSabLine()
						.equals(castOther.getSabLine())))
				&& ((this.getSabBilledDate() == castOther.getSabBilledDate()) || (this
						.getSabBilledDate() != null
						&& castOther.getSabBilledDate() != null && this
						.getSabBilledDate()
						.equals(castOther.getSabBilledDate())))
				&& ((this.getSabBilledTime() == castOther.getSabBilledTime()) || (this
						.getSabBilledTime() != null
						&& castOther.getSabBilledTime() != null && this
						.getSabBilledTime()
						.equals(castOther.getSabBilledTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSabDomain() == null ? 0 : this.getSabDomain().hashCode());
		result = 37 * result
				+ (getSabNbr() == null ? 0 : this.getSabNbr().hashCode());
		result = 37 * result
				+ (getSabPrefix() == null ? 0 : this.getSabPrefix().hashCode());
		result = 37 * result
				+ (getSabLine() == null ? 0 : this.getSabLine().hashCode());
		result = 37
				* result
				+ (getSabBilledDate() == null ? 0 : this.getSabBilledDate()
						.hashCode());
		result = 37
				* result
				+ (getSabBilledTime() == null ? 0 : this.getSabBilledTime()
						.hashCode());
		return result;
	}

}