package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAudDet entity provides the base persistence definition of the AudDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAudDet implements java.io.Serializable {

	// Fields

	private AudDetId id;
	private String audDataset;
	private String audUserid;
	private Date audDate;
	private String audKey1;
	private String audKey2;
	private String audKey3;
	private String audKey4;
	private String audKey5;
	private String audKey6;
	private String audKey7;
	private String audOldData;
	private String audTime;
	private String audUser1;
	private String audUser2;
	private String audField;
	private String audNewData;
	private String audQadc01;
	private Double oidAudDet;

	// Constructors

	/** default constructor */
	public AbstractAudDet() {
	}

	/** minimal constructor */
	public AbstractAudDet(AudDetId id, Date audDate, Double oidAudDet) {
		this.id = id;
		this.audDate = audDate;
		this.oidAudDet = oidAudDet;
	}

	/** full constructor */
	public AbstractAudDet(AudDetId id, String audDataset, String audUserid,
			Date audDate, String audKey1, String audKey2, String audKey3,
			String audKey4, String audKey5, String audKey6, String audKey7,
			String audOldData, String audTime, String audUser1,
			String audUser2, String audField, String audNewData,
			String audQadc01, Double oidAudDet) {
		this.id = id;
		this.audDataset = audDataset;
		this.audUserid = audUserid;
		this.audDate = audDate;
		this.audKey1 = audKey1;
		this.audKey2 = audKey2;
		this.audKey3 = audKey3;
		this.audKey4 = audKey4;
		this.audKey5 = audKey5;
		this.audKey6 = audKey6;
		this.audKey7 = audKey7;
		this.audOldData = audOldData;
		this.audTime = audTime;
		this.audUser1 = audUser1;
		this.audUser2 = audUser2;
		this.audField = audField;
		this.audNewData = audNewData;
		this.audQadc01 = audQadc01;
		this.oidAudDet = oidAudDet;
	}

	// Property accessors

	public AudDetId getId() {
		return this.id;
	}

	public void setId(AudDetId id) {
		this.id = id;
	}

	public String getAudDataset() {
		return this.audDataset;
	}

	public void setAudDataset(String audDataset) {
		this.audDataset = audDataset;
	}

	public String getAudUserid() {
		return this.audUserid;
	}

	public void setAudUserid(String audUserid) {
		this.audUserid = audUserid;
	}

	public Date getAudDate() {
		return this.audDate;
	}

	public void setAudDate(Date audDate) {
		this.audDate = audDate;
	}

	public String getAudKey1() {
		return this.audKey1;
	}

	public void setAudKey1(String audKey1) {
		this.audKey1 = audKey1;
	}

	public String getAudKey2() {
		return this.audKey2;
	}

	public void setAudKey2(String audKey2) {
		this.audKey2 = audKey2;
	}

	public String getAudKey3() {
		return this.audKey3;
	}

	public void setAudKey3(String audKey3) {
		this.audKey3 = audKey3;
	}

	public String getAudKey4() {
		return this.audKey4;
	}

	public void setAudKey4(String audKey4) {
		this.audKey4 = audKey4;
	}

	public String getAudKey5() {
		return this.audKey5;
	}

	public void setAudKey5(String audKey5) {
		this.audKey5 = audKey5;
	}

	public String getAudKey6() {
		return this.audKey6;
	}

	public void setAudKey6(String audKey6) {
		this.audKey6 = audKey6;
	}

	public String getAudKey7() {
		return this.audKey7;
	}

	public void setAudKey7(String audKey7) {
		this.audKey7 = audKey7;
	}

	public String getAudOldData() {
		return this.audOldData;
	}

	public void setAudOldData(String audOldData) {
		this.audOldData = audOldData;
	}

	public String getAudTime() {
		return this.audTime;
	}

	public void setAudTime(String audTime) {
		this.audTime = audTime;
	}

	public String getAudUser1() {
		return this.audUser1;
	}

	public void setAudUser1(String audUser1) {
		this.audUser1 = audUser1;
	}

	public String getAudUser2() {
		return this.audUser2;
	}

	public void setAudUser2(String audUser2) {
		this.audUser2 = audUser2;
	}

	public String getAudField() {
		return this.audField;
	}

	public void setAudField(String audField) {
		this.audField = audField;
	}

	public String getAudNewData() {
		return this.audNewData;
	}

	public void setAudNewData(String audNewData) {
		this.audNewData = audNewData;
	}

	public String getAudQadc01() {
		return this.audQadc01;
	}

	public void setAudQadc01(String audQadc01) {
		this.audQadc01 = audQadc01;
	}

	public Double getOidAudDet() {
		return this.oidAudDet;
	}

	public void setOidAudDet(Double oidAudDet) {
		this.oidAudDet = oidAudDet;
	}

}