package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractErsMstrId entity provides the base persistence definition of the
 * ErsMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractErsMstrId implements java.io.Serializable {

	// Fields

	private String ersDomain;
	private String ersVend;
	private String ersSite;
	private String ersPart;

	// Constructors

	/** default constructor */
	public AbstractErsMstrId() {
	}

	/** minimal constructor */
	public AbstractErsMstrId(String ersDomain) {
		this.ersDomain = ersDomain;
	}

	/** full constructor */
	public AbstractErsMstrId(String ersDomain, String ersVend, String ersSite,
			String ersPart) {
		this.ersDomain = ersDomain;
		this.ersVend = ersVend;
		this.ersSite = ersSite;
		this.ersPart = ersPart;
	}

	// Property accessors

	public String getErsDomain() {
		return this.ersDomain;
	}

	public void setErsDomain(String ersDomain) {
		this.ersDomain = ersDomain;
	}

	public String getErsVend() {
		return this.ersVend;
	}

	public void setErsVend(String ersVend) {
		this.ersVend = ersVend;
	}

	public String getErsSite() {
		return this.ersSite;
	}

	public void setErsSite(String ersSite) {
		this.ersSite = ersSite;
	}

	public String getErsPart() {
		return this.ersPart;
	}

	public void setErsPart(String ersPart) {
		this.ersPart = ersPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractErsMstrId))
			return false;
		AbstractErsMstrId castOther = (AbstractErsMstrId) other;

		return ((this.getErsDomain() == castOther.getErsDomain()) || (this
				.getErsDomain() != null
				&& castOther.getErsDomain() != null && this.getErsDomain()
				.equals(castOther.getErsDomain())))
				&& ((this.getErsVend() == castOther.getErsVend()) || (this
						.getErsVend() != null
						&& castOther.getErsVend() != null && this.getErsVend()
						.equals(castOther.getErsVend())))
				&& ((this.getErsSite() == castOther.getErsSite()) || (this
						.getErsSite() != null
						&& castOther.getErsSite() != null && this.getErsSite()
						.equals(castOther.getErsSite())))
				&& ((this.getErsPart() == castOther.getErsPart()) || (this
						.getErsPart() != null
						&& castOther.getErsPart() != null && this.getErsPart()
						.equals(castOther.getErsPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getErsDomain() == null ? 0 : this.getErsDomain().hashCode());
		result = 37 * result
				+ (getErsVend() == null ? 0 : this.getErsVend().hashCode());
		result = 37 * result
				+ (getErsSite() == null ? 0 : this.getErsSite().hashCode());
		result = 37 * result
				+ (getErsPart() == null ? 0 : this.getErsPart().hashCode());
		return result;
	}

}