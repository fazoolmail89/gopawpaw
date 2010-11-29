package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrhdDetId entity provides the base persistence definition of the
 * GrhdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrhdDetId implements java.io.Serializable {

	// Fields

	private String grhdDomain;
	private String grhdGroup;
	private String grhdType;
	private Integer grhdSeq;
	private String grhdCode;
	private Boolean grhdLink;
	private String grhdLinkType;

	// Constructors

	/** default constructor */
	public AbstractGrhdDetId() {
	}

	/** minimal constructor */
	public AbstractGrhdDetId(String grhdDomain) {
		this.grhdDomain = grhdDomain;
	}

	/** full constructor */
	public AbstractGrhdDetId(String grhdDomain, String grhdGroup,
			String grhdType, Integer grhdSeq, String grhdCode,
			Boolean grhdLink, String grhdLinkType) {
		this.grhdDomain = grhdDomain;
		this.grhdGroup = grhdGroup;
		this.grhdType = grhdType;
		this.grhdSeq = grhdSeq;
		this.grhdCode = grhdCode;
		this.grhdLink = grhdLink;
		this.grhdLinkType = grhdLinkType;
	}

	// Property accessors

	public String getGrhdDomain() {
		return this.grhdDomain;
	}

	public void setGrhdDomain(String grhdDomain) {
		this.grhdDomain = grhdDomain;
	}

	public String getGrhdGroup() {
		return this.grhdGroup;
	}

	public void setGrhdGroup(String grhdGroup) {
		this.grhdGroup = grhdGroup;
	}

	public String getGrhdType() {
		return this.grhdType;
	}

	public void setGrhdType(String grhdType) {
		this.grhdType = grhdType;
	}

	public Integer getGrhdSeq() {
		return this.grhdSeq;
	}

	public void setGrhdSeq(Integer grhdSeq) {
		this.grhdSeq = grhdSeq;
	}

	public String getGrhdCode() {
		return this.grhdCode;
	}

	public void setGrhdCode(String grhdCode) {
		this.grhdCode = grhdCode;
	}

	public Boolean getGrhdLink() {
		return this.grhdLink;
	}

	public void setGrhdLink(Boolean grhdLink) {
		this.grhdLink = grhdLink;
	}

	public String getGrhdLinkType() {
		return this.grhdLinkType;
	}

	public void setGrhdLinkType(String grhdLinkType) {
		this.grhdLinkType = grhdLinkType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGrhdDetId))
			return false;
		AbstractGrhdDetId castOther = (AbstractGrhdDetId) other;

		return ((this.getGrhdDomain() == castOther.getGrhdDomain()) || (this
				.getGrhdDomain() != null
				&& castOther.getGrhdDomain() != null && this.getGrhdDomain()
				.equals(castOther.getGrhdDomain())))
				&& ((this.getGrhdGroup() == castOther.getGrhdGroup()) || (this
						.getGrhdGroup() != null
						&& castOther.getGrhdGroup() != null && this
						.getGrhdGroup().equals(castOther.getGrhdGroup())))
				&& ((this.getGrhdType() == castOther.getGrhdType()) || (this
						.getGrhdType() != null
						&& castOther.getGrhdType() != null && this
						.getGrhdType().equals(castOther.getGrhdType())))
				&& ((this.getGrhdSeq() == castOther.getGrhdSeq()) || (this
						.getGrhdSeq() != null
						&& castOther.getGrhdSeq() != null && this.getGrhdSeq()
						.equals(castOther.getGrhdSeq())))
				&& ((this.getGrhdCode() == castOther.getGrhdCode()) || (this
						.getGrhdCode() != null
						&& castOther.getGrhdCode() != null && this
						.getGrhdCode().equals(castOther.getGrhdCode())))
				&& ((this.getGrhdLink() == castOther.getGrhdLink()) || (this
						.getGrhdLink() != null
						&& castOther.getGrhdLink() != null && this
						.getGrhdLink().equals(castOther.getGrhdLink())))
				&& ((this.getGrhdLinkType() == castOther.getGrhdLinkType()) || (this
						.getGrhdLinkType() != null
						&& castOther.getGrhdLinkType() != null && this
						.getGrhdLinkType().equals(castOther.getGrhdLinkType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGrhdDomain() == null ? 0 : this.getGrhdDomain()
						.hashCode());
		result = 37 * result
				+ (getGrhdGroup() == null ? 0 : this.getGrhdGroup().hashCode());
		result = 37 * result
				+ (getGrhdType() == null ? 0 : this.getGrhdType().hashCode());
		result = 37 * result
				+ (getGrhdSeq() == null ? 0 : this.getGrhdSeq().hashCode());
		result = 37 * result
				+ (getGrhdCode() == null ? 0 : this.getGrhdCode().hashCode());
		result = 37 * result
				+ (getGrhdLink() == null ? 0 : this.getGrhdLink().hashCode());
		result = 37
				* result
				+ (getGrhdLinkType() == null ? 0 : this.getGrhdLinkType()
						.hashCode());
		return result;
	}

}