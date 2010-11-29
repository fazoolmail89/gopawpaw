package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSypdDetId entity provides the base persistence definition of the
 * SypdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSypdDetId implements java.io.Serializable {

	// Fields

	private String sypdProflId;
	private String sypdFldname;

	// Constructors

	/** default constructor */
	public AbstractSypdDetId() {
	}

	/** full constructor */
	public AbstractSypdDetId(String sypdProflId, String sypdFldname) {
		this.sypdProflId = sypdProflId;
		this.sypdFldname = sypdFldname;
	}

	// Property accessors

	public String getSypdProflId() {
		return this.sypdProflId;
	}

	public void setSypdProflId(String sypdProflId) {
		this.sypdProflId = sypdProflId;
	}

	public String getSypdFldname() {
		return this.sypdFldname;
	}

	public void setSypdFldname(String sypdFldname) {
		this.sypdFldname = sypdFldname;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSypdDetId))
			return false;
		AbstractSypdDetId castOther = (AbstractSypdDetId) other;

		return ((this.getSypdProflId() == castOther.getSypdProflId()) || (this
				.getSypdProflId() != null
				&& castOther.getSypdProflId() != null && this.getSypdProflId()
				.equals(castOther.getSypdProflId())))
				&& ((this.getSypdFldname() == castOther.getSypdFldname()) || (this
						.getSypdFldname() != null
						&& castOther.getSypdFldname() != null && this
						.getSypdFldname().equals(castOther.getSypdFldname())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSypdProflId() == null ? 0 : this.getSypdProflId()
						.hashCode());
		result = 37
				* result
				+ (getSypdFldname() == null ? 0 : this.getSypdFldname()
						.hashCode());
		return result;
	}

}