package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * AbstractKnbsDetId entity provides the base persistence definition of the
 * KnbsDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnbsDetId implements java.io.Serializable {

	// Fields

	private Double knbsKeyid;
	private String knbsSourceType;
	private String knbsRef1;
	private String knbsRef2;
	private String knbsRef3;
	private String knbsRef4;
	private String knbsRef5;
	private Date knbsModDate;
	private String knbsModUserid;
	private String knbsUser1;
	private String knbsUser2;
	private String knbsQadc01;
	private String knbsQadc02;
	private String knbsDomain;
	private Double oidKnbsDet;

	// Constructors

	/** default constructor */
	public AbstractKnbsDetId() {
	}

	/** full constructor */
	public AbstractKnbsDetId(Double knbsKeyid, String knbsSourceType,
			String knbsRef1, String knbsRef2, String knbsRef3, String knbsRef4,
			String knbsRef5, Date knbsModDate, String knbsModUserid,
			String knbsUser1, String knbsUser2, String knbsQadc01,
			String knbsQadc02, String knbsDomain, Double oidKnbsDet) {
		this.knbsKeyid = knbsKeyid;
		this.knbsSourceType = knbsSourceType;
		this.knbsRef1 = knbsRef1;
		this.knbsRef2 = knbsRef2;
		this.knbsRef3 = knbsRef3;
		this.knbsRef4 = knbsRef4;
		this.knbsRef5 = knbsRef5;
		this.knbsModDate = knbsModDate;
		this.knbsModUserid = knbsModUserid;
		this.knbsUser1 = knbsUser1;
		this.knbsUser2 = knbsUser2;
		this.knbsQadc01 = knbsQadc01;
		this.knbsQadc02 = knbsQadc02;
		this.knbsDomain = knbsDomain;
		this.oidKnbsDet = oidKnbsDet;
	}

	// Property accessors

	public Double getKnbsKeyid() {
		return this.knbsKeyid;
	}

	public void setKnbsKeyid(Double knbsKeyid) {
		this.knbsKeyid = knbsKeyid;
	}

	public String getKnbsSourceType() {
		return this.knbsSourceType;
	}

	public void setKnbsSourceType(String knbsSourceType) {
		this.knbsSourceType = knbsSourceType;
	}

	public String getKnbsRef1() {
		return this.knbsRef1;
	}

	public void setKnbsRef1(String knbsRef1) {
		this.knbsRef1 = knbsRef1;
	}

	public String getKnbsRef2() {
		return this.knbsRef2;
	}

	public void setKnbsRef2(String knbsRef2) {
		this.knbsRef2 = knbsRef2;
	}

	public String getKnbsRef3() {
		return this.knbsRef3;
	}

	public void setKnbsRef3(String knbsRef3) {
		this.knbsRef3 = knbsRef3;
	}

	public String getKnbsRef4() {
		return this.knbsRef4;
	}

	public void setKnbsRef4(String knbsRef4) {
		this.knbsRef4 = knbsRef4;
	}

	public String getKnbsRef5() {
		return this.knbsRef5;
	}

	public void setKnbsRef5(String knbsRef5) {
		this.knbsRef5 = knbsRef5;
	}

	public Date getKnbsModDate() {
		return this.knbsModDate;
	}

	public void setKnbsModDate(Date knbsModDate) {
		this.knbsModDate = knbsModDate;
	}

	public String getKnbsModUserid() {
		return this.knbsModUserid;
	}

	public void setKnbsModUserid(String knbsModUserid) {
		this.knbsModUserid = knbsModUserid;
	}

	public String getKnbsUser1() {
		return this.knbsUser1;
	}

	public void setKnbsUser1(String knbsUser1) {
		this.knbsUser1 = knbsUser1;
	}

	public String getKnbsUser2() {
		return this.knbsUser2;
	}

	public void setKnbsUser2(String knbsUser2) {
		this.knbsUser2 = knbsUser2;
	}

	public String getKnbsQadc01() {
		return this.knbsQadc01;
	}

	public void setKnbsQadc01(String knbsQadc01) {
		this.knbsQadc01 = knbsQadc01;
	}

	public String getKnbsQadc02() {
		return this.knbsQadc02;
	}

	public void setKnbsQadc02(String knbsQadc02) {
		this.knbsQadc02 = knbsQadc02;
	}

	public String getKnbsDomain() {
		return this.knbsDomain;
	}

	public void setKnbsDomain(String knbsDomain) {
		this.knbsDomain = knbsDomain;
	}

	public Double getOidKnbsDet() {
		return this.oidKnbsDet;
	}

	public void setOidKnbsDet(Double oidKnbsDet) {
		this.oidKnbsDet = oidKnbsDet;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractKnbsDetId))
			return false;
		AbstractKnbsDetId castOther = (AbstractKnbsDetId) other;

		return ((this.getKnbsKeyid() == castOther.getKnbsKeyid()) || (this
				.getKnbsKeyid() != null
				&& castOther.getKnbsKeyid() != null && this.getKnbsKeyid()
				.equals(castOther.getKnbsKeyid())))
				&& ((this.getKnbsSourceType() == castOther.getKnbsSourceType()) || (this
						.getKnbsSourceType() != null
						&& castOther.getKnbsSourceType() != null && this
						.getKnbsSourceType().equals(
								castOther.getKnbsSourceType())))
				&& ((this.getKnbsRef1() == castOther.getKnbsRef1()) || (this
						.getKnbsRef1() != null
						&& castOther.getKnbsRef1() != null && this
						.getKnbsRef1().equals(castOther.getKnbsRef1())))
				&& ((this.getKnbsRef2() == castOther.getKnbsRef2()) || (this
						.getKnbsRef2() != null
						&& castOther.getKnbsRef2() != null && this
						.getKnbsRef2().equals(castOther.getKnbsRef2())))
				&& ((this.getKnbsRef3() == castOther.getKnbsRef3()) || (this
						.getKnbsRef3() != null
						&& castOther.getKnbsRef3() != null && this
						.getKnbsRef3().equals(castOther.getKnbsRef3())))
				&& ((this.getKnbsRef4() == castOther.getKnbsRef4()) || (this
						.getKnbsRef4() != null
						&& castOther.getKnbsRef4() != null && this
						.getKnbsRef4().equals(castOther.getKnbsRef4())))
				&& ((this.getKnbsRef5() == castOther.getKnbsRef5()) || (this
						.getKnbsRef5() != null
						&& castOther.getKnbsRef5() != null && this
						.getKnbsRef5().equals(castOther.getKnbsRef5())))
				&& ((this.getKnbsModDate() == castOther.getKnbsModDate()) || (this
						.getKnbsModDate() != null
						&& castOther.getKnbsModDate() != null && this
						.getKnbsModDate().equals(castOther.getKnbsModDate())))
				&& ((this.getKnbsModUserid() == castOther.getKnbsModUserid()) || (this
						.getKnbsModUserid() != null
						&& castOther.getKnbsModUserid() != null && this
						.getKnbsModUserid()
						.equals(castOther.getKnbsModUserid())))
				&& ((this.getKnbsUser1() == castOther.getKnbsUser1()) || (this
						.getKnbsUser1() != null
						&& castOther.getKnbsUser1() != null && this
						.getKnbsUser1().equals(castOther.getKnbsUser1())))
				&& ((this.getKnbsUser2() == castOther.getKnbsUser2()) || (this
						.getKnbsUser2() != null
						&& castOther.getKnbsUser2() != null && this
						.getKnbsUser2().equals(castOther.getKnbsUser2())))
				&& ((this.getKnbsQadc01() == castOther.getKnbsQadc01()) || (this
						.getKnbsQadc01() != null
						&& castOther.getKnbsQadc01() != null && this
						.getKnbsQadc01().equals(castOther.getKnbsQadc01())))
				&& ((this.getKnbsQadc02() == castOther.getKnbsQadc02()) || (this
						.getKnbsQadc02() != null
						&& castOther.getKnbsQadc02() != null && this
						.getKnbsQadc02().equals(castOther.getKnbsQadc02())))
				&& ((this.getKnbsDomain() == castOther.getKnbsDomain()) || (this
						.getKnbsDomain() != null
						&& castOther.getKnbsDomain() != null && this
						.getKnbsDomain().equals(castOther.getKnbsDomain())))
				&& ((this.getOidKnbsDet() == castOther.getOidKnbsDet()) || (this
						.getOidKnbsDet() != null
						&& castOther.getOidKnbsDet() != null && this
						.getOidKnbsDet().equals(castOther.getOidKnbsDet())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getKnbsKeyid() == null ? 0 : this.getKnbsKeyid().hashCode());
		result = 37
				* result
				+ (getKnbsSourceType() == null ? 0 : this.getKnbsSourceType()
						.hashCode());
		result = 37 * result
				+ (getKnbsRef1() == null ? 0 : this.getKnbsRef1().hashCode());
		result = 37 * result
				+ (getKnbsRef2() == null ? 0 : this.getKnbsRef2().hashCode());
		result = 37 * result
				+ (getKnbsRef3() == null ? 0 : this.getKnbsRef3().hashCode());
		result = 37 * result
				+ (getKnbsRef4() == null ? 0 : this.getKnbsRef4().hashCode());
		result = 37 * result
				+ (getKnbsRef5() == null ? 0 : this.getKnbsRef5().hashCode());
		result = 37
				* result
				+ (getKnbsModDate() == null ? 0 : this.getKnbsModDate()
						.hashCode());
		result = 37
				* result
				+ (getKnbsModUserid() == null ? 0 : this.getKnbsModUserid()
						.hashCode());
		result = 37 * result
				+ (getKnbsUser1() == null ? 0 : this.getKnbsUser1().hashCode());
		result = 37 * result
				+ (getKnbsUser2() == null ? 0 : this.getKnbsUser2().hashCode());
		result = 37
				* result
				+ (getKnbsQadc01() == null ? 0 : this.getKnbsQadc01()
						.hashCode());
		result = 37
				* result
				+ (getKnbsQadc02() == null ? 0 : this.getKnbsQadc02()
						.hashCode());
		result = 37
				* result
				+ (getKnbsDomain() == null ? 0 : this.getKnbsDomain()
						.hashCode());
		result = 37
				* result
				+ (getOidKnbsDet() == null ? 0 : this.getOidKnbsDet()
						.hashCode());
		return result;
	}

}