package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPexMstrId entity provides the base persistence definition of the
 * PexMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPexMstrId implements java.io.Serializable {

	// Fields

	private String pexProduct;
	private Date pexInstDate;
	private Integer pexInstTime;
	private String pexControl1;
	private String pexControl2;
	private String pexControl3;
	private String pexControl4;
	private String pexControl5;
	private String pexControl6;

	// Constructors

	/** default constructor */
	public AbstractPexMstrId() {
	}

	/** minimal constructor */
	public AbstractPexMstrId(String pexProduct, Integer pexInstTime,
			String pexControl1, String pexControl2, String pexControl3,
			String pexControl4, String pexControl5, String pexControl6) {
		this.pexProduct = pexProduct;
		this.pexInstTime = pexInstTime;
		this.pexControl1 = pexControl1;
		this.pexControl2 = pexControl2;
		this.pexControl3 = pexControl3;
		this.pexControl4 = pexControl4;
		this.pexControl5 = pexControl5;
		this.pexControl6 = pexControl6;
	}

	/** full constructor */
	public AbstractPexMstrId(String pexProduct, Date pexInstDate,
			Integer pexInstTime, String pexControl1, String pexControl2,
			String pexControl3, String pexControl4, String pexControl5,
			String pexControl6) {
		this.pexProduct = pexProduct;
		this.pexInstDate = pexInstDate;
		this.pexInstTime = pexInstTime;
		this.pexControl1 = pexControl1;
		this.pexControl2 = pexControl2;
		this.pexControl3 = pexControl3;
		this.pexControl4 = pexControl4;
		this.pexControl5 = pexControl5;
		this.pexControl6 = pexControl6;
	}

	// Property accessors

	public String getPexProduct() {
		return this.pexProduct;
	}

	public void setPexProduct(String pexProduct) {
		this.pexProduct = pexProduct;
	}

	public Date getPexInstDate() {
		return this.pexInstDate;
	}

	public void setPexInstDate(Date pexInstDate) {
		this.pexInstDate = pexInstDate;
	}

	public Integer getPexInstTime() {
		return this.pexInstTime;
	}

	public void setPexInstTime(Integer pexInstTime) {
		this.pexInstTime = pexInstTime;
	}

	public String getPexControl1() {
		return this.pexControl1;
	}

	public void setPexControl1(String pexControl1) {
		this.pexControl1 = pexControl1;
	}

	public String getPexControl2() {
		return this.pexControl2;
	}

	public void setPexControl2(String pexControl2) {
		this.pexControl2 = pexControl2;
	}

	public String getPexControl3() {
		return this.pexControl3;
	}

	public void setPexControl3(String pexControl3) {
		this.pexControl3 = pexControl3;
	}

	public String getPexControl4() {
		return this.pexControl4;
	}

	public void setPexControl4(String pexControl4) {
		this.pexControl4 = pexControl4;
	}

	public String getPexControl5() {
		return this.pexControl5;
	}

	public void setPexControl5(String pexControl5) {
		this.pexControl5 = pexControl5;
	}

	public String getPexControl6() {
		return this.pexControl6;
	}

	public void setPexControl6(String pexControl6) {
		this.pexControl6 = pexControl6;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPexMstrId))
			return false;
		AbstractPexMstrId castOther = (AbstractPexMstrId) other;

		return ((this.getPexProduct() == castOther.getPexProduct()) || (this
				.getPexProduct() != null
				&& castOther.getPexProduct() != null && this.getPexProduct()
				.equals(castOther.getPexProduct())))
				&& ((this.getPexInstDate() == castOther.getPexInstDate()) || (this
						.getPexInstDate() != null
						&& castOther.getPexInstDate() != null && this
						.getPexInstDate().equals(castOther.getPexInstDate())))
				&& ((this.getPexInstTime() == castOther.getPexInstTime()) || (this
						.getPexInstTime() != null
						&& castOther.getPexInstTime() != null && this
						.getPexInstTime().equals(castOther.getPexInstTime())))
				&& ((this.getPexControl1() == castOther.getPexControl1()) || (this
						.getPexControl1() != null
						&& castOther.getPexControl1() != null && this
						.getPexControl1().equals(castOther.getPexControl1())))
				&& ((this.getPexControl2() == castOther.getPexControl2()) || (this
						.getPexControl2() != null
						&& castOther.getPexControl2() != null && this
						.getPexControl2().equals(castOther.getPexControl2())))
				&& ((this.getPexControl3() == castOther.getPexControl3()) || (this
						.getPexControl3() != null
						&& castOther.getPexControl3() != null && this
						.getPexControl3().equals(castOther.getPexControl3())))
				&& ((this.getPexControl4() == castOther.getPexControl4()) || (this
						.getPexControl4() != null
						&& castOther.getPexControl4() != null && this
						.getPexControl4().equals(castOther.getPexControl4())))
				&& ((this.getPexControl5() == castOther.getPexControl5()) || (this
						.getPexControl5() != null
						&& castOther.getPexControl5() != null && this
						.getPexControl5().equals(castOther.getPexControl5())))
				&& ((this.getPexControl6() == castOther.getPexControl6()) || (this
						.getPexControl6() != null
						&& castOther.getPexControl6() != null && this
						.getPexControl6().equals(castOther.getPexControl6())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPexProduct() == null ? 0 : this.getPexProduct()
						.hashCode());
		result = 37
				* result
				+ (getPexInstDate() == null ? 0 : this.getPexInstDate()
						.hashCode());
		result = 37
				* result
				+ (getPexInstTime() == null ? 0 : this.getPexInstTime()
						.hashCode());
		result = 37
				* result
				+ (getPexControl1() == null ? 0 : this.getPexControl1()
						.hashCode());
		result = 37
				* result
				+ (getPexControl2() == null ? 0 : this.getPexControl2()
						.hashCode());
		result = 37
				* result
				+ (getPexControl3() == null ? 0 : this.getPexControl3()
						.hashCode());
		result = 37
				* result
				+ (getPexControl4() == null ? 0 : this.getPexControl4()
						.hashCode());
		result = 37
				* result
				+ (getPexControl5() == null ? 0 : this.getPexControl5()
						.hashCode());
		result = 37
				* result
				+ (getPexControl6() == null ? 0 : this.getPexControl6()
						.hashCode());
		return result;
	}

}