package com.gopawpaw.erp.hibernate.k;

/**
 * AbstractKbmdMstrId entity provides the base persistence definition of the
 * KbmdMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKbmdMstrId implements java.io.Serializable {

	// Fields

	private String kbmdDomain;
	private String kbmdConsSource;
	private String kbmdPattern;
	private String kbmdPart;
	private String kbmdConsRef;
	private String kbmdSuppSource;
	private String kbmdSuppRef;
	private String kbmdLine;

	// Constructors

	/** default constructor */
	public AbstractKbmdMstrId() {
	}

	/** full constructor */
	public AbstractKbmdMstrId(String kbmdDomain, String kbmdConsSource,
			String kbmdPattern, String kbmdPart, String kbmdConsRef,
			String kbmdSuppSource, String kbmdSuppRef, String kbmdLine) {
		this.kbmdDomain = kbmdDomain;
		this.kbmdConsSource = kbmdConsSource;
		this.kbmdPattern = kbmdPattern;
		this.kbmdPart = kbmdPart;
		this.kbmdConsRef = kbmdConsRef;
		this.kbmdSuppSource = kbmdSuppSource;
		this.kbmdSuppRef = kbmdSuppRef;
		this.kbmdLine = kbmdLine;
	}

	// Property accessors

	public String getKbmdDomain() {
		return this.kbmdDomain;
	}

	public void setKbmdDomain(String kbmdDomain) {
		this.kbmdDomain = kbmdDomain;
	}

	public String getKbmdConsSource() {
		return this.kbmdConsSource;
	}

	public void setKbmdConsSource(String kbmdConsSource) {
		this.kbmdConsSource = kbmdConsSource;
	}

	public String getKbmdPattern() {
		return this.kbmdPattern;
	}

	public void setKbmdPattern(String kbmdPattern) {
		this.kbmdPattern = kbmdPattern;
	}

	public String getKbmdPart() {
		return this.kbmdPart;
	}

	public void setKbmdPart(String kbmdPart) {
		this.kbmdPart = kbmdPart;
	}

	public String getKbmdConsRef() {
		return this.kbmdConsRef;
	}

	public void setKbmdConsRef(String kbmdConsRef) {
		this.kbmdConsRef = kbmdConsRef;
	}

	public String getKbmdSuppSource() {
		return this.kbmdSuppSource;
	}

	public void setKbmdSuppSource(String kbmdSuppSource) {
		this.kbmdSuppSource = kbmdSuppSource;
	}

	public String getKbmdSuppRef() {
		return this.kbmdSuppRef;
	}

	public void setKbmdSuppRef(String kbmdSuppRef) {
		this.kbmdSuppRef = kbmdSuppRef;
	}

	public String getKbmdLine() {
		return this.kbmdLine;
	}

	public void setKbmdLine(String kbmdLine) {
		this.kbmdLine = kbmdLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractKbmdMstrId))
			return false;
		AbstractKbmdMstrId castOther = (AbstractKbmdMstrId) other;

		return ((this.getKbmdDomain() == castOther.getKbmdDomain()) || (this
				.getKbmdDomain() != null
				&& castOther.getKbmdDomain() != null && this.getKbmdDomain()
				.equals(castOther.getKbmdDomain())))
				&& ((this.getKbmdConsSource() == castOther.getKbmdConsSource()) || (this
						.getKbmdConsSource() != null
						&& castOther.getKbmdConsSource() != null && this
						.getKbmdConsSource().equals(
								castOther.getKbmdConsSource())))
				&& ((this.getKbmdPattern() == castOther.getKbmdPattern()) || (this
						.getKbmdPattern() != null
						&& castOther.getKbmdPattern() != null && this
						.getKbmdPattern().equals(castOther.getKbmdPattern())))
				&& ((this.getKbmdPart() == castOther.getKbmdPart()) || (this
						.getKbmdPart() != null
						&& castOther.getKbmdPart() != null && this
						.getKbmdPart().equals(castOther.getKbmdPart())))
				&& ((this.getKbmdConsRef() == castOther.getKbmdConsRef()) || (this
						.getKbmdConsRef() != null
						&& castOther.getKbmdConsRef() != null && this
						.getKbmdConsRef().equals(castOther.getKbmdConsRef())))
				&& ((this.getKbmdSuppSource() == castOther.getKbmdSuppSource()) || (this
						.getKbmdSuppSource() != null
						&& castOther.getKbmdSuppSource() != null && this
						.getKbmdSuppSource().equals(
								castOther.getKbmdSuppSource())))
				&& ((this.getKbmdSuppRef() == castOther.getKbmdSuppRef()) || (this
						.getKbmdSuppRef() != null
						&& castOther.getKbmdSuppRef() != null && this
						.getKbmdSuppRef().equals(castOther.getKbmdSuppRef())))
				&& ((this.getKbmdLine() == castOther.getKbmdLine()) || (this
						.getKbmdLine() != null
						&& castOther.getKbmdLine() != null && this
						.getKbmdLine().equals(castOther.getKbmdLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getKbmdDomain() == null ? 0 : this.getKbmdDomain()
						.hashCode());
		result = 37
				* result
				+ (getKbmdConsSource() == null ? 0 : this.getKbmdConsSource()
						.hashCode());
		result = 37
				* result
				+ (getKbmdPattern() == null ? 0 : this.getKbmdPattern()
						.hashCode());
		result = 37 * result
				+ (getKbmdPart() == null ? 0 : this.getKbmdPart().hashCode());
		result = 37
				* result
				+ (getKbmdConsRef() == null ? 0 : this.getKbmdConsRef()
						.hashCode());
		result = 37
				* result
				+ (getKbmdSuppSource() == null ? 0 : this.getKbmdSuppSource()
						.hashCode());
		result = 37
				* result
				+ (getKbmdSuppRef() == null ? 0 : this.getKbmdSuppRef()
						.hashCode());
		result = 37 * result
				+ (getKbmdLine() == null ? 0 : this.getKbmdLine().hashCode());
		return result;
	}

}