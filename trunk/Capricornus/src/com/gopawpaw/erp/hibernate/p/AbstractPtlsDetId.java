package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPtlsDetId entity provides the base persistence definition of the
 * PtlsDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPtlsDetId implements java.io.Serializable {

	// Fields

	private String ptlsDomain;
	private String ptlsPart;
	private String ptlsLotser;
	private String ptlsRef;

	// Constructors

	/** default constructor */
	public AbstractPtlsDetId() {
	}

	/** minimal constructor */
	public AbstractPtlsDetId(String ptlsDomain) {
		this.ptlsDomain = ptlsDomain;
	}

	/** full constructor */
	public AbstractPtlsDetId(String ptlsDomain, String ptlsPart,
			String ptlsLotser, String ptlsRef) {
		this.ptlsDomain = ptlsDomain;
		this.ptlsPart = ptlsPart;
		this.ptlsLotser = ptlsLotser;
		this.ptlsRef = ptlsRef;
	}

	// Property accessors

	public String getPtlsDomain() {
		return this.ptlsDomain;
	}

	public void setPtlsDomain(String ptlsDomain) {
		this.ptlsDomain = ptlsDomain;
	}

	public String getPtlsPart() {
		return this.ptlsPart;
	}

	public void setPtlsPart(String ptlsPart) {
		this.ptlsPart = ptlsPart;
	}

	public String getPtlsLotser() {
		return this.ptlsLotser;
	}

	public void setPtlsLotser(String ptlsLotser) {
		this.ptlsLotser = ptlsLotser;
	}

	public String getPtlsRef() {
		return this.ptlsRef;
	}

	public void setPtlsRef(String ptlsRef) {
		this.ptlsRef = ptlsRef;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPtlsDetId))
			return false;
		AbstractPtlsDetId castOther = (AbstractPtlsDetId) other;

		return ((this.getPtlsDomain() == castOther.getPtlsDomain()) || (this
				.getPtlsDomain() != null
				&& castOther.getPtlsDomain() != null && this.getPtlsDomain()
				.equals(castOther.getPtlsDomain())))
				&& ((this.getPtlsPart() == castOther.getPtlsPart()) || (this
						.getPtlsPart() != null
						&& castOther.getPtlsPart() != null && this
						.getPtlsPart().equals(castOther.getPtlsPart())))
				&& ((this.getPtlsLotser() == castOther.getPtlsLotser()) || (this
						.getPtlsLotser() != null
						&& castOther.getPtlsLotser() != null && this
						.getPtlsLotser().equals(castOther.getPtlsLotser())))
				&& ((this.getPtlsRef() == castOther.getPtlsRef()) || (this
						.getPtlsRef() != null
						&& castOther.getPtlsRef() != null && this.getPtlsRef()
						.equals(castOther.getPtlsRef())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPtlsDomain() == null ? 0 : this.getPtlsDomain()
						.hashCode());
		result = 37 * result
				+ (getPtlsPart() == null ? 0 : this.getPtlsPart().hashCode());
		result = 37
				* result
				+ (getPtlsLotser() == null ? 0 : this.getPtlsLotser()
						.hashCode());
		result = 37 * result
				+ (getPtlsRef() == null ? 0 : this.getPtlsRef().hashCode());
		return result;
	}

}