package com.gopawpaw.erp.hibernate.h;

import java.util.Date;

/**
 * AbstractHwmDet entity provides the base persistence definition of the HwmDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHwmDet implements java.io.Serializable {

	// Fields

	private HwmDetId id;
	private Integer hwmTime;
	private String hwmUserid;
	private String hwmSid;
	private String hwmLicType;
	private Integer hwmCnt;
	private Integer hwmLicCnt;
	private String hwmQadc01;
	private String hwmQadc02;
	private Double hwmQadd01;
	private Date hwmQadt01;
	private Double oidHwmDet;

	// Constructors

	/** default constructor */
	public AbstractHwmDet() {
	}

	/** minimal constructor */
	public AbstractHwmDet(HwmDetId id, Integer hwmTime, String hwmUserid,
			String hwmSid, String hwmLicType, Integer hwmCnt,
			Integer hwmLicCnt, String hwmQadc01, String hwmQadc02,
			Double hwmQadd01, Double oidHwmDet) {
		this.id = id;
		this.hwmTime = hwmTime;
		this.hwmUserid = hwmUserid;
		this.hwmSid = hwmSid;
		this.hwmLicType = hwmLicType;
		this.hwmCnt = hwmCnt;
		this.hwmLicCnt = hwmLicCnt;
		this.hwmQadc01 = hwmQadc01;
		this.hwmQadc02 = hwmQadc02;
		this.hwmQadd01 = hwmQadd01;
		this.oidHwmDet = oidHwmDet;
	}

	/** full constructor */
	public AbstractHwmDet(HwmDetId id, Integer hwmTime, String hwmUserid,
			String hwmSid, String hwmLicType, Integer hwmCnt,
			Integer hwmLicCnt, String hwmQadc01, String hwmQadc02,
			Double hwmQadd01, Date hwmQadt01, Double oidHwmDet) {
		this.id = id;
		this.hwmTime = hwmTime;
		this.hwmUserid = hwmUserid;
		this.hwmSid = hwmSid;
		this.hwmLicType = hwmLicType;
		this.hwmCnt = hwmCnt;
		this.hwmLicCnt = hwmLicCnt;
		this.hwmQadc01 = hwmQadc01;
		this.hwmQadc02 = hwmQadc02;
		this.hwmQadd01 = hwmQadd01;
		this.hwmQadt01 = hwmQadt01;
		this.oidHwmDet = oidHwmDet;
	}

	// Property accessors

	public HwmDetId getId() {
		return this.id;
	}

	public void setId(HwmDetId id) {
		this.id = id;
	}

	public Integer getHwmTime() {
		return this.hwmTime;
	}

	public void setHwmTime(Integer hwmTime) {
		this.hwmTime = hwmTime;
	}

	public String getHwmUserid() {
		return this.hwmUserid;
	}

	public void setHwmUserid(String hwmUserid) {
		this.hwmUserid = hwmUserid;
	}

	public String getHwmSid() {
		return this.hwmSid;
	}

	public void setHwmSid(String hwmSid) {
		this.hwmSid = hwmSid;
	}

	public String getHwmLicType() {
		return this.hwmLicType;
	}

	public void setHwmLicType(String hwmLicType) {
		this.hwmLicType = hwmLicType;
	}

	public Integer getHwmCnt() {
		return this.hwmCnt;
	}

	public void setHwmCnt(Integer hwmCnt) {
		this.hwmCnt = hwmCnt;
	}

	public Integer getHwmLicCnt() {
		return this.hwmLicCnt;
	}

	public void setHwmLicCnt(Integer hwmLicCnt) {
		this.hwmLicCnt = hwmLicCnt;
	}

	public String getHwmQadc01() {
		return this.hwmQadc01;
	}

	public void setHwmQadc01(String hwmQadc01) {
		this.hwmQadc01 = hwmQadc01;
	}

	public String getHwmQadc02() {
		return this.hwmQadc02;
	}

	public void setHwmQadc02(String hwmQadc02) {
		this.hwmQadc02 = hwmQadc02;
	}

	public Double getHwmQadd01() {
		return this.hwmQadd01;
	}

	public void setHwmQadd01(Double hwmQadd01) {
		this.hwmQadd01 = hwmQadd01;
	}

	public Date getHwmQadt01() {
		return this.hwmQadt01;
	}

	public void setHwmQadt01(Date hwmQadt01) {
		this.hwmQadt01 = hwmQadt01;
	}

	public Double getOidHwmDet() {
		return this.oidHwmDet;
	}

	public void setOidHwmDet(Double oidHwmDet) {
		this.oidHwmDet = oidHwmDet;
	}

}