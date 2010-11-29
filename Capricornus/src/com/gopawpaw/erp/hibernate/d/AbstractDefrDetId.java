package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDefrDetId entity provides the base persistence definition of the
 * DefrDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDefrDetId implements java.io.Serializable {

	// Fields

	private String defrDomain;
	private String defrNbr;
	private String defrPrefix;
	private Integer defrLine;
	private String defrInvNbr;

	// Constructors

	/** default constructor */
	public AbstractDefrDetId() {
	}

	/** full constructor */
	public AbstractDefrDetId(String defrDomain, String defrNbr,
			String defrPrefix, Integer defrLine, String defrInvNbr) {
		this.defrDomain = defrDomain;
		this.defrNbr = defrNbr;
		this.defrPrefix = defrPrefix;
		this.defrLine = defrLine;
		this.defrInvNbr = defrInvNbr;
	}

	// Property accessors

	public String getDefrDomain() {
		return this.defrDomain;
	}

	public void setDefrDomain(String defrDomain) {
		this.defrDomain = defrDomain;
	}

	public String getDefrNbr() {
		return this.defrNbr;
	}

	public void setDefrNbr(String defrNbr) {
		this.defrNbr = defrNbr;
	}

	public String getDefrPrefix() {
		return this.defrPrefix;
	}

	public void setDefrPrefix(String defrPrefix) {
		this.defrPrefix = defrPrefix;
	}

	public Integer getDefrLine() {
		return this.defrLine;
	}

	public void setDefrLine(Integer defrLine) {
		this.defrLine = defrLine;
	}

	public String getDefrInvNbr() {
		return this.defrInvNbr;
	}

	public void setDefrInvNbr(String defrInvNbr) {
		this.defrInvNbr = defrInvNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractDefrDetId))
			return false;
		AbstractDefrDetId castOther = (AbstractDefrDetId) other;

		return ((this.getDefrDomain() == castOther.getDefrDomain()) || (this
				.getDefrDomain() != null
				&& castOther.getDefrDomain() != null && this.getDefrDomain()
				.equals(castOther.getDefrDomain())))
				&& ((this.getDefrNbr() == castOther.getDefrNbr()) || (this
						.getDefrNbr() != null
						&& castOther.getDefrNbr() != null && this.getDefrNbr()
						.equals(castOther.getDefrNbr())))
				&& ((this.getDefrPrefix() == castOther.getDefrPrefix()) || (this
						.getDefrPrefix() != null
						&& castOther.getDefrPrefix() != null && this
						.getDefrPrefix().equals(castOther.getDefrPrefix())))
				&& ((this.getDefrLine() == castOther.getDefrLine()) || (this
						.getDefrLine() != null
						&& castOther.getDefrLine() != null && this
						.getDefrLine().equals(castOther.getDefrLine())))
				&& ((this.getDefrInvNbr() == castOther.getDefrInvNbr()) || (this
						.getDefrInvNbr() != null
						&& castOther.getDefrInvNbr() != null && this
						.getDefrInvNbr().equals(castOther.getDefrInvNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getDefrDomain() == null ? 0 : this.getDefrDomain()
						.hashCode());
		result = 37 * result
				+ (getDefrNbr() == null ? 0 : this.getDefrNbr().hashCode());
		result = 37
				* result
				+ (getDefrPrefix() == null ? 0 : this.getDefrPrefix()
						.hashCode());
		result = 37 * result
				+ (getDefrLine() == null ? 0 : this.getDefrLine().hashCode());
		result = 37
				* result
				+ (getDefrInvNbr() == null ? 0 : this.getDefrInvNbr()
						.hashCode());
		return result;
	}

}