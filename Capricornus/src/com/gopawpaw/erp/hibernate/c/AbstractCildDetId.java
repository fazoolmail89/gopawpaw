package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCildDetId entity provides the base persistence definition of the
 * CildDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCildDetId implements java.io.Serializable {

	// Fields

	private String cildDomain;
	private String cildCorInv;
	private String cildCorSoNbr;
	private Integer cildCorLine;
	private String cildLineType;

	// Constructors

	/** default constructor */
	public AbstractCildDetId() {
	}

	/** full constructor */
	public AbstractCildDetId(String cildDomain, String cildCorInv,
			String cildCorSoNbr, Integer cildCorLine, String cildLineType) {
		this.cildDomain = cildDomain;
		this.cildCorInv = cildCorInv;
		this.cildCorSoNbr = cildCorSoNbr;
		this.cildCorLine = cildCorLine;
		this.cildLineType = cildLineType;
	}

	// Property accessors

	public String getCildDomain() {
		return this.cildDomain;
	}

	public void setCildDomain(String cildDomain) {
		this.cildDomain = cildDomain;
	}

	public String getCildCorInv() {
		return this.cildCorInv;
	}

	public void setCildCorInv(String cildCorInv) {
		this.cildCorInv = cildCorInv;
	}

	public String getCildCorSoNbr() {
		return this.cildCorSoNbr;
	}

	public void setCildCorSoNbr(String cildCorSoNbr) {
		this.cildCorSoNbr = cildCorSoNbr;
	}

	public Integer getCildCorLine() {
		return this.cildCorLine;
	}

	public void setCildCorLine(Integer cildCorLine) {
		this.cildCorLine = cildCorLine;
	}

	public String getCildLineType() {
		return this.cildLineType;
	}

	public void setCildLineType(String cildLineType) {
		this.cildLineType = cildLineType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCildDetId))
			return false;
		AbstractCildDetId castOther = (AbstractCildDetId) other;

		return ((this.getCildDomain() == castOther.getCildDomain()) || (this
				.getCildDomain() != null
				&& castOther.getCildDomain() != null && this.getCildDomain()
				.equals(castOther.getCildDomain())))
				&& ((this.getCildCorInv() == castOther.getCildCorInv()) || (this
						.getCildCorInv() != null
						&& castOther.getCildCorInv() != null && this
						.getCildCorInv().equals(castOther.getCildCorInv())))
				&& ((this.getCildCorSoNbr() == castOther.getCildCorSoNbr()) || (this
						.getCildCorSoNbr() != null
						&& castOther.getCildCorSoNbr() != null && this
						.getCildCorSoNbr().equals(castOther.getCildCorSoNbr())))
				&& ((this.getCildCorLine() == castOther.getCildCorLine()) || (this
						.getCildCorLine() != null
						&& castOther.getCildCorLine() != null && this
						.getCildCorLine().equals(castOther.getCildCorLine())))
				&& ((this.getCildLineType() == castOther.getCildLineType()) || (this
						.getCildLineType() != null
						&& castOther.getCildLineType() != null && this
						.getCildLineType().equals(castOther.getCildLineType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCildDomain() == null ? 0 : this.getCildDomain()
						.hashCode());
		result = 37
				* result
				+ (getCildCorInv() == null ? 0 : this.getCildCorInv()
						.hashCode());
		result = 37
				* result
				+ (getCildCorSoNbr() == null ? 0 : this.getCildCorSoNbr()
						.hashCode());
		result = 37
				* result
				+ (getCildCorLine() == null ? 0 : this.getCildCorLine()
						.hashCode());
		result = 37
				* result
				+ (getCildLineType() == null ? 0 : this.getCildLineType()
						.hashCode());
		return result;
	}

}