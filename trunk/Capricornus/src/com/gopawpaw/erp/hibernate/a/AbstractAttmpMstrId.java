package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAttmpMstrId entity provides the base persistence definition of the
 * AttmpMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAttmpMstrId implements java.io.Serializable {

	// Fields

	private Double attmpEventId;
	private String attmpTableName;
	private Double oidErecord;
	private Double oidAtapMstr;
	private Date attmpDate;
	private Integer attmpTime;
	private String attmpTimezone;
	private String attmpEventType;
	private String attmpSource;
	private String attmpUserid;
	private String attmpUserName;
	private String attmpPgmiExec;
	private String attmpQadc03;
	private Integer attmpRecordOrder;
	private Double attmpQadd01;
	private String attmpQadc01;
	private String attmpQadc02;
	private String attmpRawImage;
	private String attmpExcludeFields;

	// Constructors

	/** default constructor */
	public AbstractAttmpMstrId() {
	}

	/** minimal constructor */
	public AbstractAttmpMstrId(Double attmpEventId, String attmpTableName,
			Double oidErecord, Double oidAtapMstr, Date attmpDate,
			Integer attmpTime, String attmpTimezone, String attmpEventType,
			String attmpSource, String attmpUserid, String attmpUserName,
			String attmpPgmiExec, String attmpQadc03, Integer attmpRecordOrder,
			Double attmpQadd01, String attmpQadc01, String attmpQadc02,
			String attmpExcludeFields) {
		this.attmpEventId = attmpEventId;
		this.attmpTableName = attmpTableName;
		this.oidErecord = oidErecord;
		this.oidAtapMstr = oidAtapMstr;
		this.attmpDate = attmpDate;
		this.attmpTime = attmpTime;
		this.attmpTimezone = attmpTimezone;
		this.attmpEventType = attmpEventType;
		this.attmpSource = attmpSource;
		this.attmpUserid = attmpUserid;
		this.attmpUserName = attmpUserName;
		this.attmpPgmiExec = attmpPgmiExec;
		this.attmpQadc03 = attmpQadc03;
		this.attmpRecordOrder = attmpRecordOrder;
		this.attmpQadd01 = attmpQadd01;
		this.attmpQadc01 = attmpQadc01;
		this.attmpQadc02 = attmpQadc02;
		this.attmpExcludeFields = attmpExcludeFields;
	}

	/** full constructor */
	public AbstractAttmpMstrId(Double attmpEventId, String attmpTableName,
			Double oidErecord, Double oidAtapMstr, Date attmpDate,
			Integer attmpTime, String attmpTimezone, String attmpEventType,
			String attmpSource, String attmpUserid, String attmpUserName,
			String attmpPgmiExec, String attmpQadc03, Integer attmpRecordOrder,
			Double attmpQadd01, String attmpQadc01, String attmpQadc02,
			String attmpRawImage, String attmpExcludeFields) {
		this.attmpEventId = attmpEventId;
		this.attmpTableName = attmpTableName;
		this.oidErecord = oidErecord;
		this.oidAtapMstr = oidAtapMstr;
		this.attmpDate = attmpDate;
		this.attmpTime = attmpTime;
		this.attmpTimezone = attmpTimezone;
		this.attmpEventType = attmpEventType;
		this.attmpSource = attmpSource;
		this.attmpUserid = attmpUserid;
		this.attmpUserName = attmpUserName;
		this.attmpPgmiExec = attmpPgmiExec;
		this.attmpQadc03 = attmpQadc03;
		this.attmpRecordOrder = attmpRecordOrder;
		this.attmpQadd01 = attmpQadd01;
		this.attmpQadc01 = attmpQadc01;
		this.attmpQadc02 = attmpQadc02;
		this.attmpRawImage = attmpRawImage;
		this.attmpExcludeFields = attmpExcludeFields;
	}

	// Property accessors

	public Double getAttmpEventId() {
		return this.attmpEventId;
	}

	public void setAttmpEventId(Double attmpEventId) {
		this.attmpEventId = attmpEventId;
	}

	public String getAttmpTableName() {
		return this.attmpTableName;
	}

	public void setAttmpTableName(String attmpTableName) {
		this.attmpTableName = attmpTableName;
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

	public Date getAttmpDate() {
		return this.attmpDate;
	}

	public void setAttmpDate(Date attmpDate) {
		this.attmpDate = attmpDate;
	}

	public Integer getAttmpTime() {
		return this.attmpTime;
	}

	public void setAttmpTime(Integer attmpTime) {
		this.attmpTime = attmpTime;
	}

	public String getAttmpTimezone() {
		return this.attmpTimezone;
	}

	public void setAttmpTimezone(String attmpTimezone) {
		this.attmpTimezone = attmpTimezone;
	}

	public String getAttmpEventType() {
		return this.attmpEventType;
	}

	public void setAttmpEventType(String attmpEventType) {
		this.attmpEventType = attmpEventType;
	}

	public String getAttmpSource() {
		return this.attmpSource;
	}

	public void setAttmpSource(String attmpSource) {
		this.attmpSource = attmpSource;
	}

	public String getAttmpUserid() {
		return this.attmpUserid;
	}

	public void setAttmpUserid(String attmpUserid) {
		this.attmpUserid = attmpUserid;
	}

	public String getAttmpUserName() {
		return this.attmpUserName;
	}

	public void setAttmpUserName(String attmpUserName) {
		this.attmpUserName = attmpUserName;
	}

	public String getAttmpPgmiExec() {
		return this.attmpPgmiExec;
	}

	public void setAttmpPgmiExec(String attmpPgmiExec) {
		this.attmpPgmiExec = attmpPgmiExec;
	}

	public String getAttmpQadc03() {
		return this.attmpQadc03;
	}

	public void setAttmpQadc03(String attmpQadc03) {
		this.attmpQadc03 = attmpQadc03;
	}

	public Integer getAttmpRecordOrder() {
		return this.attmpRecordOrder;
	}

	public void setAttmpRecordOrder(Integer attmpRecordOrder) {
		this.attmpRecordOrder = attmpRecordOrder;
	}

	public Double getAttmpQadd01() {
		return this.attmpQadd01;
	}

	public void setAttmpQadd01(Double attmpQadd01) {
		this.attmpQadd01 = attmpQadd01;
	}

	public String getAttmpQadc01() {
		return this.attmpQadc01;
	}

	public void setAttmpQadc01(String attmpQadc01) {
		this.attmpQadc01 = attmpQadc01;
	}

	public String getAttmpQadc02() {
		return this.attmpQadc02;
	}

	public void setAttmpQadc02(String attmpQadc02) {
		this.attmpQadc02 = attmpQadc02;
	}

	public String getAttmpRawImage() {
		return this.attmpRawImage;
	}

	public void setAttmpRawImage(String attmpRawImage) {
		this.attmpRawImage = attmpRawImage;
	}

	public String getAttmpExcludeFields() {
		return this.attmpExcludeFields;
	}

	public void setAttmpExcludeFields(String attmpExcludeFields) {
		this.attmpExcludeFields = attmpExcludeFields;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAttmpMstrId))
			return false;
		AbstractAttmpMstrId castOther = (AbstractAttmpMstrId) other;

		return ((this.getAttmpEventId() == castOther.getAttmpEventId()) || (this
				.getAttmpEventId() != null
				&& castOther.getAttmpEventId() != null && this
				.getAttmpEventId().equals(castOther.getAttmpEventId())))
				&& ((this.getAttmpTableName() == castOther.getAttmpTableName()) || (this
						.getAttmpTableName() != null
						&& castOther.getAttmpTableName() != null && this
						.getAttmpTableName().equals(
								castOther.getAttmpTableName())))
				&& ((this.getOidErecord() == castOther.getOidErecord()) || (this
						.getOidErecord() != null
						&& castOther.getOidErecord() != null && this
						.getOidErecord().equals(castOther.getOidErecord())))
				&& ((this.getOidAtapMstr() == castOther.getOidAtapMstr()) || (this
						.getOidAtapMstr() != null
						&& castOther.getOidAtapMstr() != null && this
						.getOidAtapMstr().equals(castOther.getOidAtapMstr())))
				&& ((this.getAttmpDate() == castOther.getAttmpDate()) || (this
						.getAttmpDate() != null
						&& castOther.getAttmpDate() != null && this
						.getAttmpDate().equals(castOther.getAttmpDate())))
				&& ((this.getAttmpTime() == castOther.getAttmpTime()) || (this
						.getAttmpTime() != null
						&& castOther.getAttmpTime() != null && this
						.getAttmpTime().equals(castOther.getAttmpTime())))
				&& ((this.getAttmpTimezone() == castOther.getAttmpTimezone()) || (this
						.getAttmpTimezone() != null
						&& castOther.getAttmpTimezone() != null && this
						.getAttmpTimezone()
						.equals(castOther.getAttmpTimezone())))
				&& ((this.getAttmpEventType() == castOther.getAttmpEventType()) || (this
						.getAttmpEventType() != null
						&& castOther.getAttmpEventType() != null && this
						.getAttmpEventType().equals(
								castOther.getAttmpEventType())))
				&& ((this.getAttmpSource() == castOther.getAttmpSource()) || (this
						.getAttmpSource() != null
						&& castOther.getAttmpSource() != null && this
						.getAttmpSource().equals(castOther.getAttmpSource())))
				&& ((this.getAttmpUserid() == castOther.getAttmpUserid()) || (this
						.getAttmpUserid() != null
						&& castOther.getAttmpUserid() != null && this
						.getAttmpUserid().equals(castOther.getAttmpUserid())))
				&& ((this.getAttmpUserName() == castOther.getAttmpUserName()) || (this
						.getAttmpUserName() != null
						&& castOther.getAttmpUserName() != null && this
						.getAttmpUserName()
						.equals(castOther.getAttmpUserName())))
				&& ((this.getAttmpPgmiExec() == castOther.getAttmpPgmiExec()) || (this
						.getAttmpPgmiExec() != null
						&& castOther.getAttmpPgmiExec() != null && this
						.getAttmpPgmiExec()
						.equals(castOther.getAttmpPgmiExec())))
				&& ((this.getAttmpQadc03() == castOther.getAttmpQadc03()) || (this
						.getAttmpQadc03() != null
						&& castOther.getAttmpQadc03() != null && this
						.getAttmpQadc03().equals(castOther.getAttmpQadc03())))
				&& ((this.getAttmpRecordOrder() == castOther
						.getAttmpRecordOrder()) || (this.getAttmpRecordOrder() != null
						&& castOther.getAttmpRecordOrder() != null && this
						.getAttmpRecordOrder().equals(
								castOther.getAttmpRecordOrder())))
				&& ((this.getAttmpQadd01() == castOther.getAttmpQadd01()) || (this
						.getAttmpQadd01() != null
						&& castOther.getAttmpQadd01() != null && this
						.getAttmpQadd01().equals(castOther.getAttmpQadd01())))
				&& ((this.getAttmpQadc01() == castOther.getAttmpQadc01()) || (this
						.getAttmpQadc01() != null
						&& castOther.getAttmpQadc01() != null && this
						.getAttmpQadc01().equals(castOther.getAttmpQadc01())))
				&& ((this.getAttmpQadc02() == castOther.getAttmpQadc02()) || (this
						.getAttmpQadc02() != null
						&& castOther.getAttmpQadc02() != null && this
						.getAttmpQadc02().equals(castOther.getAttmpQadc02())))
				&& ((this.getAttmpRawImage() == castOther.getAttmpRawImage()) || (this
						.getAttmpRawImage() != null
						&& castOther.getAttmpRawImage() != null && this
						.getAttmpRawImage()
						.equals(castOther.getAttmpRawImage())))
				&& ((this.getAttmpExcludeFields() == castOther
						.getAttmpExcludeFields()) || (this
						.getAttmpExcludeFields() != null
						&& castOther.getAttmpExcludeFields() != null && this
						.getAttmpExcludeFields().equals(
								castOther.getAttmpExcludeFields())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getAttmpEventId() == null ? 0 : this.getAttmpEventId()
						.hashCode());
		result = 37
				* result
				+ (getAttmpTableName() == null ? 0 : this.getAttmpTableName()
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
				+ (getAttmpDate() == null ? 0 : this.getAttmpDate().hashCode());
		result = 37 * result
				+ (getAttmpTime() == null ? 0 : this.getAttmpTime().hashCode());
		result = 37
				* result
				+ (getAttmpTimezone() == null ? 0 : this.getAttmpTimezone()
						.hashCode());
		result = 37
				* result
				+ (getAttmpEventType() == null ? 0 : this.getAttmpEventType()
						.hashCode());
		result = 37
				* result
				+ (getAttmpSource() == null ? 0 : this.getAttmpSource()
						.hashCode());
		result = 37
				* result
				+ (getAttmpUserid() == null ? 0 : this.getAttmpUserid()
						.hashCode());
		result = 37
				* result
				+ (getAttmpUserName() == null ? 0 : this.getAttmpUserName()
						.hashCode());
		result = 37
				* result
				+ (getAttmpPgmiExec() == null ? 0 : this.getAttmpPgmiExec()
						.hashCode());
		result = 37
				* result
				+ (getAttmpQadc03() == null ? 0 : this.getAttmpQadc03()
						.hashCode());
		result = 37
				* result
				+ (getAttmpRecordOrder() == null ? 0 : this
						.getAttmpRecordOrder().hashCode());
		result = 37
				* result
				+ (getAttmpQadd01() == null ? 0 : this.getAttmpQadd01()
						.hashCode());
		result = 37
				* result
				+ (getAttmpQadc01() == null ? 0 : this.getAttmpQadc01()
						.hashCode());
		result = 37
				* result
				+ (getAttmpQadc02() == null ? 0 : this.getAttmpQadc02()
						.hashCode());
		result = 37
				* result
				+ (getAttmpRawImage() == null ? 0 : this.getAttmpRawImage()
						.hashCode());
		result = 37
				* result
				+ (getAttmpExcludeFields() == null ? 0 : this
						.getAttmpExcludeFields().hashCode());
		return result;
	}

}