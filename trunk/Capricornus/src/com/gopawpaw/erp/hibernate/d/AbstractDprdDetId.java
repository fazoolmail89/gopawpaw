package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * AbstractDprdDetId entity provides the base persistence definition of the
 * DprdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDprdDetId implements java.io.Serializable {

	// Fields

	private String dprdEntity;
	private String dprdBook;
	private String dprdAsset;
	private Date dprdPdDate;
	private Integer dprdLine;
	private Boolean dprdRflag;

	// Constructors

	/** default constructor */
	public AbstractDprdDetId() {
	}

	/** full constructor */
	public AbstractDprdDetId(String dprdEntity, String dprdBook,
			String dprdAsset, Date dprdPdDate, Integer dprdLine,
			Boolean dprdRflag) {
		this.dprdEntity = dprdEntity;
		this.dprdBook = dprdBook;
		this.dprdAsset = dprdAsset;
		this.dprdPdDate = dprdPdDate;
		this.dprdLine = dprdLine;
		this.dprdRflag = dprdRflag;
	}

	// Property accessors

	public String getDprdEntity() {
		return this.dprdEntity;
	}

	public void setDprdEntity(String dprdEntity) {
		this.dprdEntity = dprdEntity;
	}

	public String getDprdBook() {
		return this.dprdBook;
	}

	public void setDprdBook(String dprdBook) {
		this.dprdBook = dprdBook;
	}

	public String getDprdAsset() {
		return this.dprdAsset;
	}

	public void setDprdAsset(String dprdAsset) {
		this.dprdAsset = dprdAsset;
	}

	public Date getDprdPdDate() {
		return this.dprdPdDate;
	}

	public void setDprdPdDate(Date dprdPdDate) {
		this.dprdPdDate = dprdPdDate;
	}

	public Integer getDprdLine() {
		return this.dprdLine;
	}

	public void setDprdLine(Integer dprdLine) {
		this.dprdLine = dprdLine;
	}

	public Boolean getDprdRflag() {
		return this.dprdRflag;
	}

	public void setDprdRflag(Boolean dprdRflag) {
		this.dprdRflag = dprdRflag;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractDprdDetId))
			return false;
		AbstractDprdDetId castOther = (AbstractDprdDetId) other;

		return ((this.getDprdEntity() == castOther.getDprdEntity()) || (this
				.getDprdEntity() != null
				&& castOther.getDprdEntity() != null && this.getDprdEntity()
				.equals(castOther.getDprdEntity())))
				&& ((this.getDprdBook() == castOther.getDprdBook()) || (this
						.getDprdBook() != null
						&& castOther.getDprdBook() != null && this
						.getDprdBook().equals(castOther.getDprdBook())))
				&& ((this.getDprdAsset() == castOther.getDprdAsset()) || (this
						.getDprdAsset() != null
						&& castOther.getDprdAsset() != null && this
						.getDprdAsset().equals(castOther.getDprdAsset())))
				&& ((this.getDprdPdDate() == castOther.getDprdPdDate()) || (this
						.getDprdPdDate() != null
						&& castOther.getDprdPdDate() != null && this
						.getDprdPdDate().equals(castOther.getDprdPdDate())))
				&& ((this.getDprdLine() == castOther.getDprdLine()) || (this
						.getDprdLine() != null
						&& castOther.getDprdLine() != null && this
						.getDprdLine().equals(castOther.getDprdLine())))
				&& ((this.getDprdRflag() == castOther.getDprdRflag()) || (this
						.getDprdRflag() != null
						&& castOther.getDprdRflag() != null && this
						.getDprdRflag().equals(castOther.getDprdRflag())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getDprdEntity() == null ? 0 : this.getDprdEntity()
						.hashCode());
		result = 37 * result
				+ (getDprdBook() == null ? 0 : this.getDprdBook().hashCode());
		result = 37 * result
				+ (getDprdAsset() == null ? 0 : this.getDprdAsset().hashCode());
		result = 37
				* result
				+ (getDprdPdDate() == null ? 0 : this.getDprdPdDate()
						.hashCode());
		result = 37 * result
				+ (getDprdLine() == null ? 0 : this.getDprdLine().hashCode());
		result = 37 * result
				+ (getDprdRflag() == null ? 0 : this.getDprdRflag().hashCode());
		return result;
	}

}