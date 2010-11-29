package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAterrMstrId entity provides the base persistence definition of the
 * AterrMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAterrMstrId implements java.io.Serializable {

	// Fields

	private Double aterrEventId;
	private String aterrStatus;
	private String aterrTableName;
	private Double oidErecord;
	private Double oidAtapMstr;
	private Date aterrDate;
	private Integer aterrTime;
	private String aterrTimezone;
	private String aterrEventType;
	private String aterrSource;
	private String aterrUserid;
	private String aterrUserName;
	private String aterrPgmiExec;
	private String aterrErrorCode;
	private Integer aterrRecordOrder;
	private Double aterrQadd01;
	private String aterrQadc01;
	private String aterrQadc02;
	private String aterrRawImage;
	private String aterrExcludeFields;

	// Constructors

	/** default constructor */
	public AbstractAterrMstrId() {
	}

	/** minimal constructor */
	public AbstractAterrMstrId(Double aterrEventId, String aterrStatus,
			String aterrTableName, Double oidErecord, Double oidAtapMstr,
			Date aterrDate, Integer aterrTime, String aterrTimezone,
			String aterrEventType, String aterrSource, String aterrUserid,
			String aterrUserName, String aterrPgmiExec, String aterrErrorCode,
			Integer aterrRecordOrder, Double aterrQadd01, String aterrQadc01,
			String aterrQadc02, String aterrExcludeFields) {
		this.aterrEventId = aterrEventId;
		this.aterrStatus = aterrStatus;
		this.aterrTableName = aterrTableName;
		this.oidErecord = oidErecord;
		this.oidAtapMstr = oidAtapMstr;
		this.aterrDate = aterrDate;
		this.aterrTime = aterrTime;
		this.aterrTimezone = aterrTimezone;
		this.aterrEventType = aterrEventType;
		this.aterrSource = aterrSource;
		this.aterrUserid = aterrUserid;
		this.aterrUserName = aterrUserName;
		this.aterrPgmiExec = aterrPgmiExec;
		this.aterrErrorCode = aterrErrorCode;
		this.aterrRecordOrder = aterrRecordOrder;
		this.aterrQadd01 = aterrQadd01;
		this.aterrQadc01 = aterrQadc01;
		this.aterrQadc02 = aterrQadc02;
		this.aterrExcludeFields = aterrExcludeFields;
	}

	/** full constructor */
	public AbstractAterrMstrId(Double aterrEventId, String aterrStatus,
			String aterrTableName, Double oidErecord, Double oidAtapMstr,
			Date aterrDate, Integer aterrTime, String aterrTimezone,
			String aterrEventType, String aterrSource, String aterrUserid,
			String aterrUserName, String aterrPgmiExec, String aterrErrorCode,
			Integer aterrRecordOrder, Double aterrQadd01, String aterrQadc01,
			String aterrQadc02, String aterrRawImage, String aterrExcludeFields) {
		this.aterrEventId = aterrEventId;
		this.aterrStatus = aterrStatus;
		this.aterrTableName = aterrTableName;
		this.oidErecord = oidErecord;
		this.oidAtapMstr = oidAtapMstr;
		this.aterrDate = aterrDate;
		this.aterrTime = aterrTime;
		this.aterrTimezone = aterrTimezone;
		this.aterrEventType = aterrEventType;
		this.aterrSource = aterrSource;
		this.aterrUserid = aterrUserid;
		this.aterrUserName = aterrUserName;
		this.aterrPgmiExec = aterrPgmiExec;
		this.aterrErrorCode = aterrErrorCode;
		this.aterrRecordOrder = aterrRecordOrder;
		this.aterrQadd01 = aterrQadd01;
		this.aterrQadc01 = aterrQadc01;
		this.aterrQadc02 = aterrQadc02;
		this.aterrRawImage = aterrRawImage;
		this.aterrExcludeFields = aterrExcludeFields;
	}

	// Property accessors

	public Double getAterrEventId() {
		return this.aterrEventId;
	}

	public void setAterrEventId(Double aterrEventId) {
		this.aterrEventId = aterrEventId;
	}

	public String getAterrStatus() {
		return this.aterrStatus;
	}

	public void setAterrStatus(String aterrStatus) {
		this.aterrStatus = aterrStatus;
	}

	public String getAterrTableName() {
		return this.aterrTableName;
	}

	public void setAterrTableName(String aterrTableName) {
		this.aterrTableName = aterrTableName;
	}

	public Double getOidErecord() {
		return this.oidErecord;
	}

	public void setOidErecord(Double oidErecord) {
		this.oidErecord = oidErecord;
	}

	public Double getOidAtapMstr() {
		return this.oidAtapMstr;
	}

	public void setOidAtapMstr(Double oidAtapMstr) {
		this.oidAtapMstr = oidAtapMstr;
	}

	public Date getAterrDate() {
		return this.aterrDate;
	}

	public void setAterrDate(Date aterrDate) {
		this.aterrDate = aterrDate;
	}

	public Integer getAterrTime() {
		return this.aterrTime;
	}

	public void setAterrTime(Integer aterrTime) {
		this.aterrTime = aterrTime;
	}

	public String getAterrTimezone() {
		return this.aterrTimezone;
	}

	public void setAterrTimezone(String aterrTimezone) {
		this.aterrTimezone = aterrTimezone;
	}

	public String getAterrEventType() {
		return this.aterrEventType;
	}

	public void setAterrEventType(String aterrEventType) {
		this.aterrEventType = aterrEventType;
	}

	public String getAterrSource() {
		return this.aterrSource;
	}

	public void setAterrSource(String aterrSource) {
		this.aterrSource = aterrSource;
	}

	public String getAterrUserid() {
		return this.aterrUserid;
	}

	public void setAterrUserid(String aterrUserid) {
		this.aterrUserid = aterrUserid;
	}

	public String getAterrUserName() {
		return this.aterrUserName;
	}

	public void setAterrUserName(String aterrUserName) {
		this.aterrUserName = aterrUserName;
	}

	public String getAterrPgmiExec() {
		return this.aterrPgmiExec;
	}

	public void setAterrPgmiExec(String aterrPgmiExec) {
		this.aterrPgmiExec = aterrPgmiExec;
	}

	public String getAterrErrorCode() {
		return this.aterrErrorCode;
	}

	public void setAterrErrorCode(String aterrErrorCode) {
		this.aterrErrorCode = aterrErrorCode;
	}

	public Integer getAterrRecordOrder() {
		return this.aterrRecordOrder;
	}

	public void setAterrRecordOrder(Integer aterrRecordOrder) {
		this.aterrRecordOrder = aterrRecordOrder;
	}

	public Double getAterrQadd01() {
		return this.aterrQadd01;
	}

	public void setAterrQadd01(Double aterrQadd01) {
		this.aterrQadd01 = aterrQadd01;
	}

	public String getAterrQadc01() {
		return this.aterrQadc01;
	}

	public void setAterrQadc01(String aterrQadc01) {
		this.aterrQadc01 = aterrQadc01;
	}

	public String getAterrQadc02() {
		return this.aterrQadc02;
	}

	public void setAterrQadc02(String aterrQadc02) {
		this.aterrQadc02 = aterrQadc02;
	}

	public String getAterrRawImage() {
		return this.aterrRawImage;
	}

	public void setAterrRawImage(String aterrRawImage) {
		this.aterrRawImage = aterrRawImage;
	}

	public String getAterrExcludeFields() {
		return this.aterrExcludeFields;
	}

	public void setAterrExcludeFields(String aterrExcludeFields) {
		this.aterrExcludeFields = aterrExcludeFields;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAterrMstrId))
			return false;
		AbstractAterrMstrId castOther = (AbstractAterrMstrId) other;

		return ((this.getAterrEventId() == castOther.getAterrEventId()) || (this
				.getAterrEventId() != null
				&& castOther.getAterrEventId() != null && this
				.getAterrEventId().equals(castOther.getAterrEventId())))
				&& ((this.getAterrStatus() == castOther.getAterrStatus()) || (this
						.getAterrStatus() != null
						&& castOther.getAterrStatus() != null && this
						.getAterrStatus().equals(castOther.getAterrStatus())))
				&& ((this.getAterrTableName() == castOther.getAterrTableName()) || (this
						.getAterrTableName() != null
						&& castOther.getAterrTableName() != null && this
						.getAterrTableName().equals(
								castOther.getAterrTableName())))
				&& ((this.getOidErecord() == castOther.getOidErecord()) || (this
						.getOidErecord() != null
						&& castOther.getOidErecord() != null && this
						.getOidErecord().equals(castOther.getOidErecord())))
				&& ((this.getOidAtapMstr() == castOther.getOidAtapMstr()) || (this
						.getOidAtapMstr() != null
						&& castOther.getOidAtapMstr() != null && this
						.getOidAtapMstr().equals(castOther.getOidAtapMstr())))
				&& ((this.getAterrDate() == castOther.getAterrDate()) || (this
						.getAterrDate() != null
						&& castOther.getAterrDate() != null && this
						.getAterrDate().equals(castOther.getAterrDate())))
				&& ((this.getAterrTime() == castOther.getAterrTime()) || (this
						.getAterrTime() != null
						&& castOther.getAterrTime() != null && this
						.getAterrTime().equals(castOther.getAterrTime())))
				&& ((this.getAterrTimezone() == castOther.getAterrTimezone()) || (this
						.getAterrTimezone() != null
						&& castOther.getAterrTimezone() != null && this
						.getAterrTimezone()
						.equals(castOther.getAterrTimezone())))
				&& ((this.getAterrEventType() == castOther.getAterrEventType()) || (this
						.getAterrEventType() != null
						&& castOther.getAterrEventType() != null && this
						.getAterrEventType().equals(
								castOther.getAterrEventType())))
				&& ((this.getAterrSource() == castOther.getAterrSource()) || (this
						.getAterrSource() != null
						&& castOther.getAterrSource() != null && this
						.getAterrSource().equals(castOther.getAterrSource())))
				&& ((this.getAterrUserid() == castOther.getAterrUserid()) || (this
						.getAterrUserid() != null
						&& castOther.getAterrUserid() != null && this
						.getAterrUserid().equals(castOther.getAterrUserid())))
				&& ((this.getAterrUserName() == castOther.getAterrUserName()) || (this
						.getAterrUserName() != null
						&& castOther.getAterrUserName() != null && this
						.getAterrUserName()
						.equals(castOther.getAterrUserName())))
				&& ((this.getAterrPgmiExec() == castOther.getAterrPgmiExec()) || (this
						.getAterrPgmiExec() != null
						&& castOther.getAterrPgmiExec() != null && this
						.getAterrPgmiExec()
						.equals(castOther.getAterrPgmiExec())))
				&& ((this.getAterrErrorCode() == castOther.getAterrErrorCode()) || (this
						.getAterrErrorCode() != null
						&& castOther.getAterrErrorCode() != null && this
						.getAterrErrorCode().equals(
								castOther.getAterrErrorCode())))
				&& ((this.getAterrRecordOrder() == castOther
						.getAterrRecordOrder()) || (this.getAterrRecordOrder() != null
						&& castOther.getAterrRecordOrder() != null && this
						.getAterrRecordOrder().equals(
								castOther.getAterrRecordOrder())))
				&& ((this.getAterrQadd01() == castOther.getAterrQadd01()) || (this
						.getAterrQadd01() != null
						&& castOther.getAterrQadd01() != null && this
						.getAterrQadd01().equals(castOther.getAterrQadd01())))
				&& ((this.getAterrQadc01() == castOther.getAterrQadc01()) || (this
						.getAterrQadc01() != null
						&& castOther.getAterrQadc01() != null && this
						.getAterrQadc01().equals(castOther.getAterrQadc01())))
				&& ((this.getAterrQadc02() == castOther.getAterrQadc02()) || (this
						.getAterrQadc02() != null
						&& castOther.getAterrQadc02() != null && this
						.getAterrQadc02().equals(castOther.getAterrQadc02())))
				&& ((this.getAterrRawImage() == castOther.getAterrRawImage()) || (this
						.getAterrRawImage() != null
						&& castOther.getAterrRawImage() != null && this
						.getAterrRawImage()
						.equals(castOther.getAterrRawImage())))
				&& ((this.getAterrExcludeFields() == castOther
						.getAterrExcludeFields()) || (this
						.getAterrExcludeFields() != null
						&& castOther.getAterrExcludeFields() != null && this
						.getAterrExcludeFields().equals(
								castOther.getAterrExcludeFields())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getAterrEventId() == null ? 0 : this.getAterrEventId()
						.hashCode());
		result = 37
				* result
				+ (getAterrStatus() == null ? 0 : this.getAterrStatus()
						.hashCode());
		result = 37
				* result
				+ (getAterrTableName() == null ? 0 : this.getAterrTableName()
						.hashCode());
		result = 37
				* result
				+ (getOidErecord() == null ? 0 : this.getOidErecord()
						.hashCode());
		result = 37
				* result
				+ (getOidAtapMstr() == null ? 0 : this.getOidAtapMstr()
						.hashCode());
		result = 37 * result
				+ (getAterrDate() == null ? 0 : this.getAterrDate().hashCode());
		result = 37 * result
				+ (getAterrTime() == null ? 0 : this.getAterrTime().hashCode());
		result = 37
				* result
				+ (getAterrTimezone() == null ? 0 : this.getAterrTimezone()
						.hashCode());
		result = 37
				* result
				+ (getAterrEventType() == null ? 0 : this.getAterrEventType()
						.hashCode());
		result = 37
				* result
				+ (getAterrSource() == null ? 0 : this.getAterrSource()
						.hashCode());
		result = 37
				* result
				+ (getAterrUserid() == null ? 0 : this.getAterrUserid()
						.hashCode());
		result = 37
				* result
				+ (getAterrUserName() == null ? 0 : this.getAterrUserName()
						.hashCode());
		result = 37
				* result
				+ (getAterrPgmiExec() == null ? 0 : this.getAterrPgmiExec()
						.hashCode());
		result = 37
				* result
				+ (getAterrErrorCode() == null ? 0 : this.getAterrErrorCode()
						.hashCode());
		result = 37
				* result
				+ (getAterrRecordOrder() == null ? 0 : this
						.getAterrRecordOrder().hashCode());
		result = 37
				* result
				+ (getAterrQadd01() == null ? 0 : this.getAterrQadd01()
						.hashCode());
		result = 37
				* result
				+ (getAterrQadc01() == null ? 0 : this.getAterrQadc01()
						.hashCode());
		result = 37
				* result
				+ (getAterrQadc02() == null ? 0 : this.getAterrQadc02()
						.hashCode());
		result = 37
				* result
				+ (getAterrRawImage() == null ? 0 : this.getAterrRawImage()
						.hashCode());
		result = 37
				* result
				+ (getAterrExcludeFields() == null ? 0 : this
						.getAterrExcludeFields().hashCode());
		return result;
	}

}