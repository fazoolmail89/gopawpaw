package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRpsMstrId entity provides the base persistence definition of the
 * RpsMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRpsMstrId implements java.io.Serializable {

	// Fields

	private String rpsDomain;
	private String rpsPart;
	private String rpsSite;
	private String rpsLine;
	private Date rpsDueDate;

	// Constructors

	/** default constructor */
	public AbstractRpsMstrId() {
	}

	/** minimal constructor */
	public AbstractRpsMstrId(String rpsDomain) {
		this.rpsDomain = rpsDomain;
	}

	/** full constructor */
	public AbstractRpsMstrId(String rpsDomain, String rpsPart, String rpsSite,
			String rpsLine, Date rpsDueDate) {
		this.rpsDomain = rpsDomain;
		this.rpsPart = rpsPart;
		this.rpsSite = rpsSite;
		this.rpsLine = rpsLine;
		this.rpsDueDate = rpsDueDate;
	}

	// Property accessors

	public String getRpsDomain() {
		return this.rpsDomain;
	}

	public void setRpsDomain(String rpsDomain) {
		this.rpsDomain = rpsDomain;
	}

	public String getRpsPart() {
		return this.rpsPart;
	}

	public void setRpsPart(String rpsPart) {
		this.rpsPart = rpsPart;
	}

	public String getRpsSite() {
		return this.rpsSite;
	}

	public void setRpsSite(String rpsSite) {
		this.rpsSite = rpsSite;
	}

	public String getRpsLine() {
		return this.rpsLine;
	}

	public void setRpsLine(String rpsLine) {
		this.rpsLine = rpsLine;
	}

	public Date getRpsDueDate() {
		return this.rpsDueDate;
	}

	public void setRpsDueDate(Date rpsDueDate) {
		this.rpsDueDate = rpsDueDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRpsMstrId))
			return false;
		AbstractRpsMstrId castOther = (AbstractRpsMstrId) other;

		return ((this.getRpsDomain() == castOther.getRpsDomain()) || (this
				.getRpsDomain() != null
				&& castOther.getRpsDomain() != null && this.getRpsDomain()
				.equals(castOther.getRpsDomain())))
				&& ((this.getRpsPart() == castOther.getRpsPart()) || (this
						.getRpsPart() != null
						&& castOther.getRpsPart() != null && this.getRpsPart()
						.equals(castOther.getRpsPart())))
				&& ((this.getRpsSite() == castOther.getRpsSite()) || (this
						.getRpsSite() != null
						&& castOther.getRpsSite() != null && this.getRpsSite()
						.equals(castOther.getRpsSite())))
				&& ((this.getRpsLine() == castOther.getRpsLine()) || (this
						.getRpsLine() != null
						&& castOther.getRpsLine() != null && this.getRpsLine()
						.equals(castOther.getRpsLine())))
				&& ((this.getRpsDueDate() == castOther.getRpsDueDate()) || (this
						.getRpsDueDate() != null
						&& castOther.getRpsDueDate() != null && this
						.getRpsDueDate().equals(castOther.getRpsDueDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRpsDomain() == null ? 0 : this.getRpsDomain().hashCode());
		result = 37 * result
				+ (getRpsPart() == null ? 0 : this.getRpsPart().hashCode());
		result = 37 * result
				+ (getRpsSite() == null ? 0 : this.getRpsSite().hashCode());
		result = 37 * result
				+ (getRpsLine() == null ? 0 : this.getRpsLine().hashCode());
		result = 37
				* result
				+ (getRpsDueDate() == null ? 0 : this.getRpsDueDate()
						.hashCode());
		return result;
	}

}