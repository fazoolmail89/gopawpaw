package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRmcCtrlId entity provides the base persistence definition of the
 * RmcCtrlId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRmcCtrlId implements java.io.Serializable {

	// Fields

	private String rmcDomain;
	private String rmcNode;

	// Constructors

	/** default constructor */
	public AbstractRmcCtrlId() {
	}

	/** minimal constructor */
	public AbstractRmcCtrlId(String rmcDomain) {
		this.rmcDomain = rmcDomain;
	}

	/** full constructor */
	public AbstractRmcCtrlId(String rmcDomain, String rmcNode) {
		this.rmcDomain = rmcDomain;
		this.rmcNode = rmcNode;
	}

	// Property accessors

	public String getRmcDomain() {
		return this.rmcDomain;
	}

	public void setRmcDomain(String rmcDomain) {
		this.rmcDomain = rmcDomain;
	}

	public String getRmcNode() {
		return this.rmcNode;
	}

	public void setRmcNode(String rmcNode) {
		this.rmcNode = rmcNode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRmcCtrlId))
			return false;
		AbstractRmcCtrlId castOther = (AbstractRmcCtrlId) other;

		return ((this.getRmcDomain() == castOther.getRmcDomain()) || (this
				.getRmcDomain() != null
				&& castOther.getRmcDomain() != null && this.getRmcDomain()
				.equals(castOther.getRmcDomain())))
				&& ((this.getRmcNode() == castOther.getRmcNode()) || (this
						.getRmcNode() != null
						&& castOther.getRmcNode() != null && this.getRmcNode()
						.equals(castOther.getRmcNode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRmcDomain() == null ? 0 : this.getRmcDomain().hashCode());
		result = 37 * result
				+ (getRmcNode() == null ? 0 : this.getRmcNode().hashCode());
		return result;
	}

}