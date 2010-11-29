package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSvcCtrlId entity provides the base persistence definition of the
 * SvcCtrlId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSvcCtrlId implements java.io.Serializable {

	// Fields

	private String svcDomain;
	private String svcNode;

	// Constructors

	/** default constructor */
	public AbstractSvcCtrlId() {
	}

	/** minimal constructor */
	public AbstractSvcCtrlId(String svcDomain) {
		this.svcDomain = svcDomain;
	}

	/** full constructor */
	public AbstractSvcCtrlId(String svcDomain, String svcNode) {
		this.svcDomain = svcDomain;
		this.svcNode = svcNode;
	}

	// Property accessors

	public String getSvcDomain() {
		return this.svcDomain;
	}

	public void setSvcDomain(String svcDomain) {
		this.svcDomain = svcDomain;
	}

	public String getSvcNode() {
		return this.svcNode;
	}

	public void setSvcNode(String svcNode) {
		this.svcNode = svcNode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSvcCtrlId))
			return false;
		AbstractSvcCtrlId castOther = (AbstractSvcCtrlId) other;

		return ((this.getSvcDomain() == castOther.getSvcDomain()) || (this
				.getSvcDomain() != null
				&& castOther.getSvcDomain() != null && this.getSvcDomain()
				.equals(castOther.getSvcDomain())))
				&& ((this.getSvcNode() == castOther.getSvcNode()) || (this
						.getSvcNode() != null
						&& castOther.getSvcNode() != null && this.getSvcNode()
						.equals(castOther.getSvcNode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSvcDomain() == null ? 0 : this.getSvcDomain().hashCode());
		result = 37 * result
				+ (getSvcNode() == null ? 0 : this.getSvcNode().hashCode());
		return result;
	}

}