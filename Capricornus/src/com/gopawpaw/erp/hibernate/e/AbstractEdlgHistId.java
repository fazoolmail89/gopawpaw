package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEdlgHistId entity provides the base persistence definition of the
 * EdlgHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEdlgHistId implements java.io.Serializable {

	// Fields

	private Integer edlgDocId;
	private Integer edlgDocSufx;
	private String edlgAppId;
	private String edlgDomain;

	// Constructors

	/** default constructor */
	public AbstractEdlgHistId() {
	}

	/** minimal constructor */
	public AbstractEdlgHistId(String edlgDomain) {
		this.edlgDomain = edlgDomain;
	}

	/** full constructor */
	public AbstractEdlgHistId(Integer edlgDocId, Integer edlgDocSufx,
			String edlgAppId, String edlgDomain) {
		this.edlgDocId = edlgDocId;
		this.edlgDocSufx = edlgDocSufx;
		this.edlgAppId = edlgAppId;
		this.edlgDomain = edlgDomain;
	}

	// Property accessors

	public Integer getEdlgDocId() {
		return this.edlgDocId;
	}

	public void setEdlgDocId(Integer edlgDocId) {
		this.edlgDocId = edlgDocId;
	}

	public Integer getEdlgDocSufx() {
		return this.edlgDocSufx;
	}

	public void setEdlgDocSufx(Integer edlgDocSufx) {
		this.edlgDocSufx = edlgDocSufx;
	}

	public String getEdlgAppId() {
		return this.edlgAppId;
	}

	public void setEdlgAppId(String edlgAppId) {
		this.edlgAppId = edlgAppId;
	}

	public String getEdlgDomain() {
		return this.edlgDomain;
	}

	public void setEdlgDomain(String edlgDomain) {
		this.edlgDomain = edlgDomain;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEdlgHistId))
			return false;
		AbstractEdlgHistId castOther = (AbstractEdlgHistId) other;

		return ((this.getEdlgDocId() == castOther.getEdlgDocId()) || (this
				.getEdlgDocId() != null
				&& castOther.getEdlgDocId() != null && this.getEdlgDocId()
				.equals(castOther.getEdlgDocId())))
				&& ((this.getEdlgDocSufx() == castOther.getEdlgDocSufx()) || (this
						.getEdlgDocSufx() != null
						&& castOther.getEdlgDocSufx() != null && this
						.getEdlgDocSufx().equals(castOther.getEdlgDocSufx())))
				&& ((this.getEdlgAppId() == castOther.getEdlgAppId()) || (this
						.getEdlgAppId() != null
						&& castOther.getEdlgAppId() != null && this
						.getEdlgAppId().equals(castOther.getEdlgAppId())))
				&& ((this.getEdlgDomain() == castOther.getEdlgDomain()) || (this
						.getEdlgDomain() != null
						&& castOther.getEdlgDomain() != null && this
						.getEdlgDomain().equals(castOther.getEdlgDomain())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEdlgDocId() == null ? 0 : this.getEdlgDocId().hashCode());
		result = 37
				* result
				+ (getEdlgDocSufx() == null ? 0 : this.getEdlgDocSufx()
						.hashCode());
		result = 37 * result
				+ (getEdlgAppId() == null ? 0 : this.getEdlgAppId().hashCode());
		result = 37
				* result
				+ (getEdlgDomain() == null ? 0 : this.getEdlgDomain()
						.hashCode());
		return result;
	}

}