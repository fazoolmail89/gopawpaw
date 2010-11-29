package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEsapMstrId entity provides the base persistence definition of the
 * EsapMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEsapMstrId implements java.io.Serializable {

	// Fields

	private Double oidEscatMstr;
	private Date esapBeginDate;

	// Constructors

	/** default constructor */
	public AbstractEsapMstrId() {
	}

	/** full constructor */
	public AbstractEsapMstrId(Double oidEscatMstr, Date esapBeginDate) {
		this.oidEscatMstr = oidEscatMstr;
		this.esapBeginDate = esapBeginDate;
	}

	// Property accessors

	public Double getOidEscatMstr() {
		return this.oidEscatMstr;
	}

	public void setOidEscatMstr(Double oidEscatMstr) {
		this.oidEscatMstr = oidEscatMstr;
	}

	public Date getEsapBeginDate() {
		return this.esapBeginDate;
	}

	public void setEsapBeginDate(Date esapBeginDate) {
		this.esapBeginDate = esapBeginDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEsapMstrId))
			return false;
		AbstractEsapMstrId castOther = (AbstractEsapMstrId) other;

		return ((this.getOidEscatMstr() == castOther.getOidEscatMstr()) || (this
				.getOidEscatMstr() != null
				&& castOther.getOidEscatMstr() != null && this
				.getOidEscatMstr().equals(castOther.getOidEscatMstr())))
				&& ((this.getEsapBeginDate() == castOther.getEsapBeginDate()) || (this
						.getEsapBeginDate() != null
						&& castOther.getEsapBeginDate() != null && this
						.getEsapBeginDate()
						.equals(castOther.getEsapBeginDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidEscatMstr() == null ? 0 : this.getOidEscatMstr()
						.hashCode());
		result = 37
				* result
				+ (getEsapBeginDate() == null ? 0 : this.getEsapBeginDate()
						.hashCode());
		return result;
	}

}