package com.gopawpaw.erp.hibernate.v;

/**
 * AbstractVphHistId entity provides the base persistence definition of the
 * VphHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVphHistId implements java.io.Serializable {

	// Fields

	private String vphDomain;
	private String vphRef;
	private Integer vphPvoId;
	private Integer vphPvodIdLine;

	// Constructors

	/** default constructor */
	public AbstractVphHistId() {
	}

	/** minimal constructor */
	public AbstractVphHistId(String vphDomain, Integer vphPvodIdLine) {
		this.vphDomain = vphDomain;
		this.vphPvodIdLine = vphPvodIdLine;
	}

	/** full constructor */
	public AbstractVphHistId(String vphDomain, String vphRef, Integer vphPvoId,
			Integer vphPvodIdLine) {
		this.vphDomain = vphDomain;
		this.vphRef = vphRef;
		this.vphPvoId = vphPvoId;
		this.vphPvodIdLine = vphPvodIdLine;
	}

	// Property accessors

	public String getVphDomain() {
		return this.vphDomain;
	}

	public void setVphDomain(String vphDomain) {
		this.vphDomain = vphDomain;
	}

	public String getVphRef() {
		return this.vphRef;
	}

	public void setVphRef(String vphRef) {
		this.vphRef = vphRef;
	}

	public Integer getVphPvoId() {
		return this.vphPvoId;
	}

	public void setVphPvoId(Integer vphPvoId) {
		this.vphPvoId = vphPvoId;
	}

	public Integer getVphPvodIdLine() {
		return this.vphPvodIdLine;
	}

	public void setVphPvodIdLine(Integer vphPvodIdLine) {
		this.vphPvodIdLine = vphPvodIdLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractVphHistId))
			return false;
		AbstractVphHistId castOther = (AbstractVphHistId) other;

		return ((this.getVphDomain() == castOther.getVphDomain()) || (this
				.getVphDomain() != null
				&& castOther.getVphDomain() != null && this.getVphDomain()
				.equals(castOther.getVphDomain())))
				&& ((this.getVphRef() == castOther.getVphRef()) || (this
						.getVphRef() != null
						&& castOther.getVphRef() != null && this.getVphRef()
						.equals(castOther.getVphRef())))
				&& ((this.getVphPvoId() == castOther.getVphPvoId()) || (this
						.getVphPvoId() != null
						&& castOther.getVphPvoId() != null && this
						.getVphPvoId().equals(castOther.getVphPvoId())))
				&& ((this.getVphPvodIdLine() == castOther.getVphPvodIdLine()) || (this
						.getVphPvodIdLine() != null
						&& castOther.getVphPvodIdLine() != null && this
						.getVphPvodIdLine()
						.equals(castOther.getVphPvodIdLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getVphDomain() == null ? 0 : this.getVphDomain().hashCode());
		result = 37 * result
				+ (getVphRef() == null ? 0 : this.getVphRef().hashCode());
		result = 37 * result
				+ (getVphPvoId() == null ? 0 : this.getVphPvoId().hashCode());
		result = 37
				* result
				+ (getVphPvodIdLine() == null ? 0 : this.getVphPvodIdLine()
						.hashCode());
		return result;
	}

}