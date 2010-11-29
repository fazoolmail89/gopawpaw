package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIfsMstrId entity provides the base persistence definition of the
 * IfsMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIfsMstrId implements java.io.Serializable {

	// Fields

	private Integer ifsSessId;
	private String ifsAppId;
	private String ifsDomain;

	// Constructors

	/** default constructor */
	public AbstractIfsMstrId() {
	}

	/** minimal constructor */
	public AbstractIfsMstrId(String ifsDomain) {
		this.ifsDomain = ifsDomain;
	}

	/** full constructor */
	public AbstractIfsMstrId(Integer ifsSessId, String ifsAppId,
			String ifsDomain) {
		this.ifsSessId = ifsSessId;
		this.ifsAppId = ifsAppId;
		this.ifsDomain = ifsDomain;
	}

	// Property accessors

	public Integer getIfsSessId() {
		return this.ifsSessId;
	}

	public void setIfsSessId(Integer ifsSessId) {
		this.ifsSessId = ifsSessId;
	}

	public String getIfsAppId() {
		return this.ifsAppId;
	}

	public void setIfsAppId(String ifsAppId) {
		this.ifsAppId = ifsAppId;
	}

	public String getIfsDomain() {
		return this.ifsDomain;
	}

	public void setIfsDomain(String ifsDomain) {
		this.ifsDomain = ifsDomain;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIfsMstrId))
			return false;
		AbstractIfsMstrId castOther = (AbstractIfsMstrId) other;

		return ((this.getIfsSessId() == castOther.getIfsSessId()) || (this
				.getIfsSessId() != null
				&& castOther.getIfsSessId() != null && this.getIfsSessId()
				.equals(castOther.getIfsSessId())))
				&& ((this.getIfsAppId() == castOther.getIfsAppId()) || (this
						.getIfsAppId() != null
						&& castOther.getIfsAppId() != null && this
						.getIfsAppId().equals(castOther.getIfsAppId())))
				&& ((this.getIfsDomain() == castOther.getIfsDomain()) || (this
						.getIfsDomain() != null
						&& castOther.getIfsDomain() != null && this
						.getIfsDomain().equals(castOther.getIfsDomain())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIfsSessId() == null ? 0 : this.getIfsSessId().hashCode());
		result = 37 * result
				+ (getIfsAppId() == null ? 0 : this.getIfsAppId().hashCode());
		result = 37 * result
				+ (getIfsDomain() == null ? 0 : this.getIfsDomain().hashCode());
		return result;
	}

}