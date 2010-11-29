package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPgmDetId entity provides the base persistence definition of the
 * PgmDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPgmDetId implements java.io.Serializable {

	// Fields

	private String pgmDomain;
	private String pgmRef;
	private String pgmEq;
	private String pgmType;
	private Integer pgmSeq;

	// Constructors

	/** default constructor */
	public AbstractPgmDetId() {
	}

	/** minimal constructor */
	public AbstractPgmDetId(String pgmDomain) {
		this.pgmDomain = pgmDomain;
	}

	/** full constructor */
	public AbstractPgmDetId(String pgmDomain, String pgmRef, String pgmEq,
			String pgmType, Integer pgmSeq) {
		this.pgmDomain = pgmDomain;
		this.pgmRef = pgmRef;
		this.pgmEq = pgmEq;
		this.pgmType = pgmType;
		this.pgmSeq = pgmSeq;
	}

	// Property accessors

	public String getPgmDomain() {
		return this.pgmDomain;
	}

	public void setPgmDomain(String pgmDomain) {
		this.pgmDomain = pgmDomain;
	}

	public String getPgmRef() {
		return this.pgmRef;
	}

	public void setPgmRef(String pgmRef) {
		this.pgmRef = pgmRef;
	}

	public String getPgmEq() {
		return this.pgmEq;
	}

	public void setPgmEq(String pgmEq) {
		this.pgmEq = pgmEq;
	}

	public String getPgmType() {
		return this.pgmType;
	}

	public void setPgmType(String pgmType) {
		this.pgmType = pgmType;
	}

	public Integer getPgmSeq() {
		return this.pgmSeq;
	}

	public void setPgmSeq(Integer pgmSeq) {
		this.pgmSeq = pgmSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPgmDetId))
			return false;
		AbstractPgmDetId castOther = (AbstractPgmDetId) other;

		return ((this.getPgmDomain() == castOther.getPgmDomain()) || (this
				.getPgmDomain() != null
				&& castOther.getPgmDomain() != null && this.getPgmDomain()
				.equals(castOther.getPgmDomain())))
				&& ((this.getPgmRef() == castOther.getPgmRef()) || (this
						.getPgmRef() != null
						&& castOther.getPgmRef() != null && this.getPgmRef()
						.equals(castOther.getPgmRef())))
				&& ((this.getPgmEq() == castOther.getPgmEq()) || (this
						.getPgmEq() != null
						&& castOther.getPgmEq() != null && this.getPgmEq()
						.equals(castOther.getPgmEq())))
				&& ((this.getPgmType() == castOther.getPgmType()) || (this
						.getPgmType() != null
						&& castOther.getPgmType() != null && this.getPgmType()
						.equals(castOther.getPgmType())))
				&& ((this.getPgmSeq() == castOther.getPgmSeq()) || (this
						.getPgmSeq() != null
						&& castOther.getPgmSeq() != null && this.getPgmSeq()
						.equals(castOther.getPgmSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPgmDomain() == null ? 0 : this.getPgmDomain().hashCode());
		result = 37 * result
				+ (getPgmRef() == null ? 0 : this.getPgmRef().hashCode());
		result = 37 * result
				+ (getPgmEq() == null ? 0 : this.getPgmEq().hashCode());
		result = 37 * result
				+ (getPgmType() == null ? 0 : this.getPgmType().hashCode());
		result = 37 * result
				+ (getPgmSeq() == null ? 0 : this.getPgmSeq().hashCode());
		return result;
	}

}