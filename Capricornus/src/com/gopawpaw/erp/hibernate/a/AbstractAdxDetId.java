package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAdxDetId entity provides the base persistence definition of the
 * AdxDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAdxDetId implements java.io.Serializable {

	// Fields

	private String adxDomain;
	private String adxExtAppl;
	private String adxExtRef1;
	private String adxExtRef2;

	// Constructors

	/** default constructor */
	public AbstractAdxDetId() {
	}

	/** full constructor */
	public AbstractAdxDetId(String adxDomain, String adxExtAppl,
			String adxExtRef1, String adxExtRef2) {
		this.adxDomain = adxDomain;
		this.adxExtAppl = adxExtAppl;
		this.adxExtRef1 = adxExtRef1;
		this.adxExtRef2 = adxExtRef2;
	}

	// Property accessors

	public String getAdxDomain() {
		return this.adxDomain;
	}

	public void setAdxDomain(String adxDomain) {
		this.adxDomain = adxDomain;
	}

	public String getAdxExtAppl() {
		return this.adxExtAppl;
	}

	public void setAdxExtAppl(String adxExtAppl) {
		this.adxExtAppl = adxExtAppl;
	}

	public String getAdxExtRef1() {
		return this.adxExtRef1;
	}

	public void setAdxExtRef1(String adxExtRef1) {
		this.adxExtRef1 = adxExtRef1;
	}

	public String getAdxExtRef2() {
		return this.adxExtRef2;
	}

	public void setAdxExtRef2(String adxExtRef2) {
		this.adxExtRef2 = adxExtRef2;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAdxDetId))
			return false;
		AbstractAdxDetId castOther = (AbstractAdxDetId) other;

		return ((this.getAdxDomain() == castOther.getAdxDomain()) || (this
				.getAdxDomain() != null
				&& castOther.getAdxDomain() != null && this.getAdxDomain()
				.equals(castOther.getAdxDomain())))
				&& ((this.getAdxExtAppl() == castOther.getAdxExtAppl()) || (this
						.getAdxExtAppl() != null
						&& castOther.getAdxExtAppl() != null && this
						.getAdxExtAppl().equals(castOther.getAdxExtAppl())))
				&& ((this.getAdxExtRef1() == castOther.getAdxExtRef1()) || (this
						.getAdxExtRef1() != null
						&& castOther.getAdxExtRef1() != null && this
						.getAdxExtRef1().equals(castOther.getAdxExtRef1())))
				&& ((this.getAdxExtRef2() == castOther.getAdxExtRef2()) || (this
						.getAdxExtRef2() != null
						&& castOther.getAdxExtRef2() != null && this
						.getAdxExtRef2().equals(castOther.getAdxExtRef2())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAdxDomain() == null ? 0 : this.getAdxDomain().hashCode());
		result = 37
				* result
				+ (getAdxExtAppl() == null ? 0 : this.getAdxExtAppl()
						.hashCode());
		result = 37
				* result
				+ (getAdxExtRef1() == null ? 0 : this.getAdxExtRef1()
						.hashCode());
		result = 37
				* result
				+ (getAdxExtRef2() == null ? 0 : this.getAdxExtRef2()
						.hashCode());
		return result;
	}

}