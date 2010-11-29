package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * AbstractLndDetId entity provides the base persistence definition of the
 * LndDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLndDetId implements java.io.Serializable {

	// Fields

	private String lndDomain;
	private String lndLine;
	private String lndSite;
	private String lndPart;
	private Date lndStart;

	// Constructors

	/** default constructor */
	public AbstractLndDetId() {
	}

	/** minimal constructor */
	public AbstractLndDetId(String lndDomain) {
		this.lndDomain = lndDomain;
	}

	/** full constructor */
	public AbstractLndDetId(String lndDomain, String lndLine, String lndSite,
			String lndPart, Date lndStart) {
		this.lndDomain = lndDomain;
		this.lndLine = lndLine;
		this.lndSite = lndSite;
		this.lndPart = lndPart;
		this.lndStart = lndStart;
	}

	// Property accessors

	public String getLndDomain() {
		return this.lndDomain;
	}

	public void setLndDomain(String lndDomain) {
		this.lndDomain = lndDomain;
	}

	public String getLndLine() {
		return this.lndLine;
	}

	public void setLndLine(String lndLine) {
		this.lndLine = lndLine;
	}

	public String getLndSite() {
		return this.lndSite;
	}

	public void setLndSite(String lndSite) {
		this.lndSite = lndSite;
	}

	public String getLndPart() {
		return this.lndPart;
	}

	public void setLndPart(String lndPart) {
		this.lndPart = lndPart;
	}

	public Date getLndStart() {
		return this.lndStart;
	}

	public void setLndStart(Date lndStart) {
		this.lndStart = lndStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractLndDetId))
			return false;
		AbstractLndDetId castOther = (AbstractLndDetId) other;

		return ((this.getLndDomain() == castOther.getLndDomain()) || (this
				.getLndDomain() != null
				&& castOther.getLndDomain() != null && this.getLndDomain()
				.equals(castOther.getLndDomain())))
				&& ((this.getLndLine() == castOther.getLndLine()) || (this
						.getLndLine() != null
						&& castOther.getLndLine() != null && this.getLndLine()
						.equals(castOther.getLndLine())))
				&& ((this.getLndSite() == castOther.getLndSite()) || (this
						.getLndSite() != null
						&& castOther.getLndSite() != null && this.getLndSite()
						.equals(castOther.getLndSite())))
				&& ((this.getLndPart() == castOther.getLndPart()) || (this
						.getLndPart() != null
						&& castOther.getLndPart() != null && this.getLndPart()
						.equals(castOther.getLndPart())))
				&& ((this.getLndStart() == castOther.getLndStart()) || (this
						.getLndStart() != null
						&& castOther.getLndStart() != null && this
						.getLndStart().equals(castOther.getLndStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getLndDomain() == null ? 0 : this.getLndDomain().hashCode());
		result = 37 * result
				+ (getLndLine() == null ? 0 : this.getLndLine().hashCode());
		result = 37 * result
				+ (getLndSite() == null ? 0 : this.getLndSite().hashCode());
		result = 37 * result
				+ (getLndPart() == null ? 0 : this.getLndPart().hashCode());
		result = 37 * result
				+ (getLndStart() == null ? 0 : this.getLndStart().hashCode());
		return result;
	}

}