package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAscMstrId entity provides the base persistence definition of the
 * AscMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAscMstrId implements java.io.Serializable {

	// Fields

	private String ascDomain;
	private String ascAcc;
	private String ascSub;
	private String ascCc;

	// Constructors

	/** default constructor */
	public AbstractAscMstrId() {
	}

	/** minimal constructor */
	public AbstractAscMstrId(String ascDomain) {
		this.ascDomain = ascDomain;
	}

	/** full constructor */
	public AbstractAscMstrId(String ascDomain, String ascAcc, String ascSub,
			String ascCc) {
		this.ascDomain = ascDomain;
		this.ascAcc = ascAcc;
		this.ascSub = ascSub;
		this.ascCc = ascCc;
	}

	// Property accessors

	public String getAscDomain() {
		return this.ascDomain;
	}

	public void setAscDomain(String ascDomain) {
		this.ascDomain = ascDomain;
	}

	public String getAscAcc() {
		return this.ascAcc;
	}

	public void setAscAcc(String ascAcc) {
		this.ascAcc = ascAcc;
	}

	public String getAscSub() {
		return this.ascSub;
	}

	public void setAscSub(String ascSub) {
		this.ascSub = ascSub;
	}

	public String getAscCc() {
		return this.ascCc;
	}

	public void setAscCc(String ascCc) {
		this.ascCc = ascCc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAscMstrId))
			return false;
		AbstractAscMstrId castOther = (AbstractAscMstrId) other;

		return ((this.getAscDomain() == castOther.getAscDomain()) || (this
				.getAscDomain() != null
				&& castOther.getAscDomain() != null && this.getAscDomain()
				.equals(castOther.getAscDomain())))
				&& ((this.getAscAcc() == castOther.getAscAcc()) || (this
						.getAscAcc() != null
						&& castOther.getAscAcc() != null && this.getAscAcc()
						.equals(castOther.getAscAcc())))
				&& ((this.getAscSub() == castOther.getAscSub()) || (this
						.getAscSub() != null
						&& castOther.getAscSub() != null && this.getAscSub()
						.equals(castOther.getAscSub())))
				&& ((this.getAscCc() == castOther.getAscCc()) || (this
						.getAscCc() != null
						&& castOther.getAscCc() != null && this.getAscCc()
						.equals(castOther.getAscCc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAscDomain() == null ? 0 : this.getAscDomain().hashCode());
		result = 37 * result
				+ (getAscAcc() == null ? 0 : this.getAscAcc().hashCode());
		result = 37 * result
				+ (getAscSub() == null ? 0 : this.getAscSub().hashCode());
		result = 37 * result
				+ (getAscCc() == null ? 0 : this.getAscCc().hashCode());
		return result;
	}

}