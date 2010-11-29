package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEsigMstrId entity provides the base persistence definition of the
 * EsigMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEsigMstrId implements java.io.Serializable {

	// Fields

	private Double oidEsigMstr;
	private Date esigDate;
	private Integer esigTime;
	private String esigTimezone;
	private String esigUserid;
	private String esigUserName;
	private String esigRsnCode;
	private String esigComment;
	private Date esigModDate;
	private String esigModUserid;
	private String esigUser1;
	private String esigUser2;
	private String esigQadc01;
	private String esigQadc02;
	private Boolean esigArchived;
	private String esigExec;

	// Constructors

	/** default constructor */
	public AbstractEsigMstrId() {
	}

	/** minimal constructor */
	public AbstractEsigMstrId(Double oidEsigMstr, Date esigDate,
			Integer esigTime, String esigTimezone, String esigUserid,
			String esigUserName, String esigRsnCode, String esigComment,
			Date esigModDate, String esigModUserid, String esigUser1,
			String esigUser2, String esigQadc01, String esigQadc02,
			String esigExec) {
		this.oidEsigMstr = oidEsigMstr;
		this.esigDate = esigDate;
		this.esigTime = esigTime;
		this.esigTimezone = esigTimezone;
		this.esigUserid = esigUserid;
		this.esigUserName = esigUserName;
		this.esigRsnCode = esigRsnCode;
		this.esigComment = esigComment;
		this.esigModDate = esigModDate;
		this.esigModUserid = esigModUserid;
		this.esigUser1 = esigUser1;
		this.esigUser2 = esigUser2;
		this.esigQadc01 = esigQadc01;
		this.esigQadc02 = esigQadc02;
		this.esigExec = esigExec;
	}

	/** full constructor */
	public AbstractEsigMstrId(Double oidEsigMstr, Date esigDate,
			Integer esigTime, String esigTimezone, String esigUserid,
			String esigUserName, String esigRsnCode, String esigComment,
			Date esigModDate, String esigModUserid, String esigUser1,
			String esigUser2, String esigQadc01, String esigQadc02,
			Boolean esigArchived, String esigExec) {
		this.oidEsigMstr = oidEsigMstr;
		this.esigDate = esigDate;
		this.esigTime = esigTime;
		this.esigTimezone = esigTimezone;
		this.esigUserid = esigUserid;
		this.esigUserName = esigUserName;
		this.esigRsnCode = esigRsnCode;
		this.esigComment = esigComment;
		this.esigModDate = esigModDate;
		this.esigModUserid = esigModUserid;
		this.esigUser1 = esigUser1;
		this.esigUser2 = esigUser2;
		this.esigQadc01 = esigQadc01;
		this.esigQadc02 = esigQadc02;
		this.esigArchived = esigArchived;
		this.esigExec = esigExec;
	}

	// Property accessors

	public Double getOidEsigMstr() {
		return this.oidEsigMstr;
	}

	public void setOidEsigMstr(Double oidEsigMstr) {
		this.oidEsigMstr = oidEsigMstr;
	}

	public Date getEsigDate() {
		return this.esigDate;
	}

	public void setEsigDate(Date esigDate) {
		this.esigDate = esigDate;
	}

	public Integer getEsigTime() {
		return this.esigTime;
	}

	public void setEsigTime(Integer esigTime) {
		this.esigTime = esigTime;
	}

	public String getEsigTimezone() {
		return this.esigTimezone;
	}

	public void setEsigTimezone(String esigTimezone) {
		this.esigTimezone = esigTimezone;
	}

	public String getEsigUserid() {
		return this.esigUserid;
	}

	public void setEsigUserid(String esigUserid) {
		this.esigUserid = esigUserid;
	}

	public String getEsigUserName() {
		return this.esigUserName;
	}

	public void setEsigUserName(String esigUserName) {
		this.esigUserName = esigUserName;
	}

	public String getEsigRsnCode() {
		return this.esigRsnCode;
	}

	public void setEsigRsnCode(String esigRsnCode) {
		this.esigRsnCode = esigRsnCode;
	}

	public String getEsigComment() {
		return this.esigComment;
	}

	public void setEsigComment(String esigComment) {
		this.esigComment = esigComment;
	}

	public Date getEsigModDate() {
		return this.esigModDate;
	}

	public void setEsigModDate(Date esigModDate) {
		this.esigModDate = esigModDate;
	}

	public String getEsigModUserid() {
		return this.esigModUserid;
	}

	public void setEsigModUserid(String esigModUserid) {
		this.esigModUserid = esigModUserid;
	}

	public String getEsigUser1() {
		return this.esigUser1;
	}

	public void setEsigUser1(String esigUser1) {
		this.esigUser1 = esigUser1;
	}

	public String getEsigUser2() {
		return this.esigUser2;
	}

	public void setEsigUser2(String esigUser2) {
		this.esigUser2 = esigUser2;
	}

	public String getEsigQadc01() {
		return this.esigQadc01;
	}

	public void setEsigQadc01(String esigQadc01) {
		this.esigQadc01 = esigQadc01;
	}

	public String getEsigQadc02() {
		return this.esigQadc02;
	}

	public void setEsigQadc02(String esigQadc02) {
		this.esigQadc02 = esigQadc02;
	}

	public Boolean getEsigArchived() {
		return this.esigArchived;
	}

	public void setEsigArchived(Boolean esigArchived) {
		this.esigArchived = esigArchived;
	}

	public String getEsigExec() {
		return this.esigExec;
	}

	public void setEsigExec(String esigExec) {
		this.esigExec = esigExec;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEsigMstrId))
			return false;
		AbstractEsigMstrId castOther = (AbstractEsigMstrId) other;

		return ((this.getOidEsigMstr() == castOther.getOidEsigMstr()) || (this
				.getOidEsigMstr() != null
				&& castOther.getOidEsigMstr() != null && this.getOidEsigMstr()
				.equals(castOther.getOidEsigMstr())))
				&& ((this.getEsigDate() == castOther.getEsigDate()) || (this
						.getEsigDate() != null
						&& castOther.getEsigDate() != null && this
						.getEsigDate().equals(castOther.getEsigDate())))
				&& ((this.getEsigTime() == castOther.getEsigTime()) || (this
						.getEsigTime() != null
						&& castOther.getEsigTime() != null && this
						.getEsigTime().equals(castOther.getEsigTime())))
				&& ((this.getEsigTimezone() == castOther.getEsigTimezone()) || (this
						.getEsigTimezone() != null
						&& castOther.getEsigTimezone() != null && this
						.getEsigTimezone().equals(castOther.getEsigTimezone())))
				&& ((this.getEsigUserid() == castOther.getEsigUserid()) || (this
						.getEsigUserid() != null
						&& castOther.getEsigUserid() != null && this
						.getEsigUserid().equals(castOther.getEsigUserid())))
				&& ((this.getEsigUserName() == castOther.getEsigUserName()) || (this
						.getEsigUserName() != null
						&& castOther.getEsigUserName() != null && this
						.getEsigUserName().equals(castOther.getEsigUserName())))
				&& ((this.getEsigRsnCode() == castOther.getEsigRsnCode()) || (this
						.getEsigRsnCode() != null
						&& castOther.getEsigRsnCode() != null && this
						.getEsigRsnCode().equals(castOther.getEsigRsnCode())))
				&& ((this.getEsigComment() == castOther.getEsigComment()) || (this
						.getEsigComment() != null
						&& castOther.getEsigComment() != null && this
						.getEsigComment().equals(castOther.getEsigComment())))
				&& ((this.getEsigModDate() == castOther.getEsigModDate()) || (this
						.getEsigModDate() != null
						&& castOther.getEsigModDate() != null && this
						.getEsigModDate().equals(castOther.getEsigModDate())))
				&& ((this.getEsigModUserid() == castOther.getEsigModUserid()) || (this
						.getEsigModUserid() != null
						&& castOther.getEsigModUserid() != null && this
						.getEsigModUserid()
						.equals(castOther.getEsigModUserid())))
				&& ((this.getEsigUser1() == castOther.getEsigUser1()) || (this
						.getEsigUser1() != null
						&& castOther.getEsigUser1() != null && this
						.getEsigUser1().equals(castOther.getEsigUser1())))
				&& ((this.getEsigUser2() == castOther.getEsigUser2()) || (this
						.getEsigUser2() != null
						&& castOther.getEsigUser2() != null && this
						.getEsigUser2().equals(castOther.getEsigUser2())))
				&& ((this.getEsigQadc01() == castOther.getEsigQadc01()) || (this
						.getEsigQadc01() != null
						&& castOther.getEsigQadc01() != null && this
						.getEsigQadc01().equals(castOther.getEsigQadc01())))
				&& ((this.getEsigQadc02() == castOther.getEsigQadc02()) || (this
						.getEsigQadc02() != null
						&& castOther.getEsigQadc02() != null && this
						.getEsigQadc02().equals(castOther.getEsigQadc02())))
				&& ((this.getEsigArchived() == castOther.getEsigArchived()) || (this
						.getEsigArchived() != null
						&& castOther.getEsigArchived() != null && this
						.getEsigArchived().equals(castOther.getEsigArchived())))
				&& ((this.getEsigExec() == castOther.getEsigExec()) || (this
						.getEsigExec() != null
						&& castOther.getEsigExec() != null && this
						.getEsigExec().equals(castOther.getEsigExec())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidEsigMstr() == null ? 0 : this.getOidEsigMstr()
						.hashCode());
		result = 37 * result
				+ (getEsigDate() == null ? 0 : this.getEsigDate().hashCode());
		result = 37 * result
				+ (getEsigTime() == null ? 0 : this.getEsigTime().hashCode());
		result = 37
				* result
				+ (getEsigTimezone() == null ? 0 : this.getEsigTimezone()
						.hashCode());
		result = 37
				* result
				+ (getEsigUserid() == null ? 0 : this.getEsigUserid()
						.hashCode());
		result = 37
				* result
				+ (getEsigUserName() == null ? 0 : this.getEsigUserName()
						.hashCode());
		result = 37
				* result
				+ (getEsigRsnCode() == null ? 0 : this.getEsigRsnCode()
						.hashCode());
		result = 37
				* result
				+ (getEsigComment() == null ? 0 : this.getEsigComment()
						.hashCode());
		result = 37
				* result
				+ (getEsigModDate() == null ? 0 : this.getEsigModDate()
						.hashCode());
		result = 37
				* result
				+ (getEsigModUserid() == null ? 0 : this.getEsigModUserid()
						.hashCode());
		result = 37 * result
				+ (getEsigUser1() == null ? 0 : this.getEsigUser1().hashCode());
		result = 37 * result
				+ (getEsigUser2() == null ? 0 : this.getEsigUser2().hashCode());
		result = 37
				* result
				+ (getEsigQadc01() == null ? 0 : this.getEsigQadc01()
						.hashCode());
		result = 37
				* result
				+ (getEsigQadc02() == null ? 0 : this.getEsigQadc02()
						.hashCode());
		result = 37
				* result
				+ (getEsigArchived() == null ? 0 : this.getEsigArchived()
						.hashCode());
		result = 37 * result
				+ (getEsigExec() == null ? 0 : this.getEsigExec().hashCode());
		return result;
	}

}