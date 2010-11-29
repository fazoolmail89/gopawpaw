package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCclscdDetId entity provides the base persistence definition of the
 * CclscdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCclscdDetId implements java.io.Serializable {

	// Fields

	private String cclscdDomain;
	private String cclscdShipto;
	private String cclscdPart;
	private String cclscdCurr;
	private Date cclscdStart;

	// Constructors

	/** default constructor */
	public AbstractCclscdDetId() {
	}

	/** minimal constructor */
	public AbstractCclscdDetId(String cclscdDomain, String cclscdShipto,
			String cclscdPart, String cclscdCurr) {
		this.cclscdDomain = cclscdDomain;
		this.cclscdShipto = cclscdShipto;
		this.cclscdPart = cclscdPart;
		this.cclscdCurr = cclscdCurr;
	}

	/** full constructor */
	public AbstractCclscdDetId(String cclscdDomain, String cclscdShipto,
			String cclscdPart, String cclscdCurr, Date cclscdStart) {
		this.cclscdDomain = cclscdDomain;
		this.cclscdShipto = cclscdShipto;
		this.cclscdPart = cclscdPart;
		this.cclscdCurr = cclscdCurr;
		this.cclscdStart = cclscdStart;
	}

	// Property accessors

	public String getCclscdDomain() {
		return this.cclscdDomain;
	}

	public void setCclscdDomain(String cclscdDomain) {
		this.cclscdDomain = cclscdDomain;
	}

	public String getCclscdShipto() {
		return this.cclscdShipto;
	}

	public void setCclscdShipto(String cclscdShipto) {
		this.cclscdShipto = cclscdShipto;
	}

	public String getCclscdPart() {
		return this.cclscdPart;
	}

	public void setCclscdPart(String cclscdPart) {
		this.cclscdPart = cclscdPart;
	}

	public String getCclscdCurr() {
		return this.cclscdCurr;
	}

	public void setCclscdCurr(String cclscdCurr) {
		this.cclscdCurr = cclscdCurr;
	}

	public Date getCclscdStart() {
		return this.cclscdStart;
	}

	public void setCclscdStart(Date cclscdStart) {
		this.cclscdStart = cclscdStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCclscdDetId))
			return false;
		AbstractCclscdDetId castOther = (AbstractCclscdDetId) other;

		return ((this.getCclscdDomain() == castOther.getCclscdDomain()) || (this
				.getCclscdDomain() != null
				&& castOther.getCclscdDomain() != null && this
				.getCclscdDomain().equals(castOther.getCclscdDomain())))
				&& ((this.getCclscdShipto() == castOther.getCclscdShipto()) || (this
						.getCclscdShipto() != null
						&& castOther.getCclscdShipto() != null && this
						.getCclscdShipto().equals(castOther.getCclscdShipto())))
				&& ((this.getCclscdPart() == castOther.getCclscdPart()) || (this
						.getCclscdPart() != null
						&& castOther.getCclscdPart() != null && this
						.getCclscdPart().equals(castOther.getCclscdPart())))
				&& ((this.getCclscdCurr() == castOther.getCclscdCurr()) || (this
						.getCclscdCurr() != null
						&& castOther.getCclscdCurr() != null && this
						.getCclscdCurr().equals(castOther.getCclscdCurr())))
				&& ((this.getCclscdStart() == castOther.getCclscdStart()) || (this
						.getCclscdStart() != null
						&& castOther.getCclscdStart() != null && this
						.getCclscdStart().equals(castOther.getCclscdStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCclscdDomain() == null ? 0 : this.getCclscdDomain()
						.hashCode());
		result = 37
				* result
				+ (getCclscdShipto() == null ? 0 : this.getCclscdShipto()
						.hashCode());
		result = 37
				* result
				+ (getCclscdPart() == null ? 0 : this.getCclscdPart()
						.hashCode());
		result = 37
				* result
				+ (getCclscdCurr() == null ? 0 : this.getCclscdCurr()
						.hashCode());
		result = 37
				* result
				+ (getCclscdStart() == null ? 0 : this.getCclscdStart()
						.hashCode());
		return result;
	}

}