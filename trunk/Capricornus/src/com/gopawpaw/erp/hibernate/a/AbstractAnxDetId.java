package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAnxDetId entity provides the base persistence definition of the
 * AnxDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAnxDetId implements java.io.Serializable {

	// Fields

	private String anxDomain;
	private String anxType;
	private String anxCode;
	private String anxNode;

	// Constructors

	/** default constructor */
	public AbstractAnxDetId() {
	}

	/** minimal constructor */
	public AbstractAnxDetId(String anxDomain, String anxType, String anxCode) {
		this.anxDomain = anxDomain;
		this.anxType = anxType;
		this.anxCode = anxCode;
	}

	/** full constructor */
	public AbstractAnxDetId(String anxDomain, String anxType, String anxCode,
			String anxNode) {
		this.anxDomain = anxDomain;
		this.anxType = anxType;
		this.anxCode = anxCode;
		this.anxNode = anxNode;
	}

	// Property accessors

	public String getAnxDomain() {
		return this.anxDomain;
	}

	public void setAnxDomain(String anxDomain) {
		this.anxDomain = anxDomain;
	}

	public String getAnxType() {
		return this.anxType;
	}

	public void setAnxType(String anxType) {
		this.anxType = anxType;
	}

	public String getAnxCode() {
		return this.anxCode;
	}

	public void setAnxCode(String anxCode) {
		this.anxCode = anxCode;
	}

	public String getAnxNode() {
		return this.anxNode;
	}

	public void setAnxNode(String anxNode) {
		this.anxNode = anxNode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAnxDetId))
			return false;
		AbstractAnxDetId castOther = (AbstractAnxDetId) other;

		return ((this.getAnxDomain() == castOther.getAnxDomain()) || (this
				.getAnxDomain() != null
				&& castOther.getAnxDomain() != null && this.getAnxDomain()
				.equals(castOther.getAnxDomain())))
				&& ((this.getAnxType() == castOther.getAnxType()) || (this
						.getAnxType() != null
						&& castOther.getAnxType() != null && this.getAnxType()
						.equals(castOther.getAnxType())))
				&& ((this.getAnxCode() == castOther.getAnxCode()) || (this
						.getAnxCode() != null
						&& castOther.getAnxCode() != null && this.getAnxCode()
						.equals(castOther.getAnxCode())))
				&& ((this.getAnxNode() == castOther.getAnxNode()) || (this
						.getAnxNode() != null
						&& castOther.getAnxNode() != null && this.getAnxNode()
						.equals(castOther.getAnxNode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAnxDomain() == null ? 0 : this.getAnxDomain().hashCode());
		result = 37 * result
				+ (getAnxType() == null ? 0 : this.getAnxType().hashCode());
		result = 37 * result
				+ (getAnxCode() == null ? 0 : this.getAnxCode().hashCode());
		result = 37 * result
				+ (getAnxNode() == null ? 0 : this.getAnxNode().hashCode());
		return result;
	}

}