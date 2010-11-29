package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFshMstrId entity provides the base persistence definition of the
 * FshMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFshMstrId implements java.io.Serializable {

	// Fields

	private String fshDomain;
	private String fshCode;
	private String fshCodeField;
	private Date fshDate;

	// Constructors

	/** default constructor */
	public AbstractFshMstrId() {
	}

	/** minimal constructor */
	public AbstractFshMstrId(String fshDomain) {
		this.fshDomain = fshDomain;
	}

	/** full constructor */
	public AbstractFshMstrId(String fshDomain, String fshCode,
			String fshCodeField, Date fshDate) {
		this.fshDomain = fshDomain;
		this.fshCode = fshCode;
		this.fshCodeField = fshCodeField;
		this.fshDate = fshDate;
	}

	// Property accessors

	public String getFshDomain() {
		return this.fshDomain;
	}

	public void setFshDomain(String fshDomain) {
		this.fshDomain = fshDomain;
	}

	public String getFshCode() {
		return this.fshCode;
	}

	public void setFshCode(String fshCode) {
		this.fshCode = fshCode;
	}

	public String getFshCodeField() {
		return this.fshCodeField;
	}

	public void setFshCodeField(String fshCodeField) {
		this.fshCodeField = fshCodeField;
	}

	public Date getFshDate() {
		return this.fshDate;
	}

	public void setFshDate(Date fshDate) {
		this.fshDate = fshDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFshMstrId))
			return false;
		AbstractFshMstrId castOther = (AbstractFshMstrId) other;

		return ((this.getFshDomain() == castOther.getFshDomain()) || (this
				.getFshDomain() != null
				&& castOther.getFshDomain() != null && this.getFshDomain()
				.equals(castOther.getFshDomain())))
				&& ((this.getFshCode() == castOther.getFshCode()) || (this
						.getFshCode() != null
						&& castOther.getFshCode() != null && this.getFshCode()
						.equals(castOther.getFshCode())))
				&& ((this.getFshCodeField() == castOther.getFshCodeField()) || (this
						.getFshCodeField() != null
						&& castOther.getFshCodeField() != null && this
						.getFshCodeField().equals(castOther.getFshCodeField())))
				&& ((this.getFshDate() == castOther.getFshDate()) || (this
						.getFshDate() != null
						&& castOther.getFshDate() != null && this.getFshDate()
						.equals(castOther.getFshDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFshDomain() == null ? 0 : this.getFshDomain().hashCode());
		result = 37 * result
				+ (getFshCode() == null ? 0 : this.getFshCode().hashCode());
		result = 37
				* result
				+ (getFshCodeField() == null ? 0 : this.getFshCodeField()
						.hashCode());
		result = 37 * result
				+ (getFshDate() == null ? 0 : this.getFshDate().hashCode());
		return result;
	}

}