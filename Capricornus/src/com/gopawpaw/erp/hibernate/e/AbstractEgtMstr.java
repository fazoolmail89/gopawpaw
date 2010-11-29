package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEgtMstr entity provides the base persistence definition of the
 * EgtMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEgtMstr implements java.io.Serializable {

	// Fields

	private EgtMstrId id;
	private String egtEngCode;
	private String egtCaNbr;
	private Date egtCreateDate;
	private String egtCurrent;
	private String egtUser1;
	private String egtUser2;
	private Boolean egtClose;
	private String egtStartTime;
	private String egtEndTime;
	private Double egtHours;
	private Boolean egtMulti;
	private Integer egtPriority;
	private Boolean egtReschedule;
	private Date egtSchedDate;
	private String egtEshSchedule;
	private String egtChr01;
	private String egtChr02;
	private String egtChr03;
	private String egtChr04;
	private Double egtDec01;
	private Double egtDec02;
	private Double egtDec03;
	private Date egtDte01;
	private Date egtDte02;
	private Date egtDte03;
	private Boolean egtLog01;
	private Boolean egtLog02;
	private Boolean egtLog03;
	private String egtQadc01;
	private String egtQadc02;
	private String egtQadc03;
	private String egtQadc04;
	private Date egtQadd01;
	private Date egtQadd02;
	private Date egtQadd03;
	private Double egtQadde01;
	private Double egtQadde02;
	private Double egtQadde03;
	private Boolean egtQadl01;
	private Boolean egtQadl02;
	private Boolean egtQadl03;
	private String egtItmPrefix;
	private String egtItmType;
	private Integer egtItmItmLine;
	private Integer egtItmLine;
	private Double oidEgtMstr;

	// Constructors

	/** default constructor */
	public AbstractEgtMstr() {
	}

	/** minimal constructor */
	public AbstractEgtMstr(EgtMstrId id, Boolean egtClose, String egtStartTime,
			String egtEndTime, Double egtHours, Boolean egtMulti,
			Boolean egtReschedule, Date egtSchedDate, Double oidEgtMstr) {
		this.id = id;
		this.egtClose = egtClose;
		this.egtStartTime = egtStartTime;
		this.egtEndTime = egtEndTime;
		this.egtHours = egtHours;
		this.egtMulti = egtMulti;
		this.egtReschedule = egtReschedule;
		this.egtSchedDate = egtSchedDate;
		this.oidEgtMstr = oidEgtMstr;
	}

	/** full constructor */
	public AbstractEgtMstr(EgtMstrId id, String egtEngCode, String egtCaNbr,
			Date egtCreateDate, String egtCurrent, String egtUser1,
			String egtUser2, Boolean egtClose, String egtStartTime,
			String egtEndTime, Double egtHours, Boolean egtMulti,
			Integer egtPriority, Boolean egtReschedule, Date egtSchedDate,
			String egtEshSchedule, String egtChr01, String egtChr02,
			String egtChr03, String egtChr04, Double egtDec01, Double egtDec02,
			Double egtDec03, Date egtDte01, Date egtDte02, Date egtDte03,
			Boolean egtLog01, Boolean egtLog02, Boolean egtLog03,
			String egtQadc01, String egtQadc02, String egtQadc03,
			String egtQadc04, Date egtQadd01, Date egtQadd02, Date egtQadd03,
			Double egtQadde01, Double egtQadde02, Double egtQadde03,
			Boolean egtQadl01, Boolean egtQadl02, Boolean egtQadl03,
			String egtItmPrefix, String egtItmType, Integer egtItmItmLine,
			Integer egtItmLine, Double oidEgtMstr) {
		this.id = id;
		this.egtEngCode = egtEngCode;
		this.egtCaNbr = egtCaNbr;
		this.egtCreateDate = egtCreateDate;
		this.egtCurrent = egtCurrent;
		this.egtUser1 = egtUser1;
		this.egtUser2 = egtUser2;
		this.egtClose = egtClose;
		this.egtStartTime = egtStartTime;
		this.egtEndTime = egtEndTime;
		this.egtHours = egtHours;
		this.egtMulti = egtMulti;
		this.egtPriority = egtPriority;
		this.egtReschedule = egtReschedule;
		this.egtSchedDate = egtSchedDate;
		this.egtEshSchedule = egtEshSchedule;
		this.egtChr01 = egtChr01;
		this.egtChr02 = egtChr02;
		this.egtChr03 = egtChr03;
		this.egtChr04 = egtChr04;
		this.egtDec01 = egtDec01;
		this.egtDec02 = egtDec02;
		this.egtDec03 = egtDec03;
		this.egtDte01 = egtDte01;
		this.egtDte02 = egtDte02;
		this.egtDte03 = egtDte03;
		this.egtLog01 = egtLog01;
		this.egtLog02 = egtLog02;
		this.egtLog03 = egtLog03;
		this.egtQadc01 = egtQadc01;
		this.egtQadc02 = egtQadc02;
		this.egtQadc03 = egtQadc03;
		this.egtQadc04 = egtQadc04;
		this.egtQadd01 = egtQadd01;
		this.egtQadd02 = egtQadd02;
		this.egtQadd03 = egtQadd03;
		this.egtQadde01 = egtQadde01;
		this.egtQadde02 = egtQadde02;
		this.egtQadde03 = egtQadde03;
		this.egtQadl01 = egtQadl01;
		this.egtQadl02 = egtQadl02;
		this.egtQadl03 = egtQadl03;
		this.egtItmPrefix = egtItmPrefix;
		this.egtItmType = egtItmType;
		this.egtItmItmLine = egtItmItmLine;
		this.egtItmLine = egtItmLine;
		this.oidEgtMstr = oidEgtMstr;
	}

	// Property accessors

	public EgtMstrId getId() {
		return this.id;
	}

	public void setId(EgtMstrId id) {
		this.id = id;
	}

	public String getEgtEngCode() {
		return this.egtEngCode;
	}

	public void setEgtEngCode(String egtEngCode) {
		this.egtEngCode = egtEngCode;
	}

	public String getEgtCaNbr() {
		return this.egtCaNbr;
	}

	public void setEgtCaNbr(String egtCaNbr) {
		this.egtCaNbr = egtCaNbr;
	}

	public Date getEgtCreateDate() {
		return this.egtCreateDate;
	}

	public void setEgtCreateDate(Date egtCreateDate) {
		this.egtCreateDate = egtCreateDate;
	}

	public String getEgtCurrent() {
		return this.egtCurrent;
	}

	public void setEgtCurrent(String egtCurrent) {
		this.egtCurrent = egtCurrent;
	}

	public String getEgtUser1() {
		return this.egtUser1;
	}

	public void setEgtUser1(String egtUser1) {
		this.egtUser1 = egtUser1;
	}

	public String getEgtUser2() {
		return this.egtUser2;
	}

	public void setEgtUser2(String egtUser2) {
		this.egtUser2 = egtUser2;
	}

	public Boolean getEgtClose() {
		return this.egtClose;
	}

	public void setEgtClose(Boolean egtClose) {
		this.egtClose = egtClose;
	}

	public String getEgtStartTime() {
		return this.egtStartTime;
	}

	public void setEgtStartTime(String egtStartTime) {
		this.egtStartTime = egtStartTime;
	}

	public String getEgtEndTime() {
		return this.egtEndTime;
	}

	public void setEgtEndTime(String egtEndTime) {
		this.egtEndTime = egtEndTime;
	}

	public Double getEgtHours() {
		return this.egtHours;
	}

	public void setEgtHours(Double egtHours) {
		this.egtHours = egtHours;
	}

	public Boolean getEgtMulti() {
		return this.egtMulti;
	}

	public void setEgtMulti(Boolean egtMulti) {
		this.egtMulti = egtMulti;
	}

	public Integer getEgtPriority() {
		return this.egtPriority;
	}

	public void setEgtPriority(Integer egtPriority) {
		this.egtPriority = egtPriority;
	}

	public Boolean getEgtReschedule() {
		return this.egtReschedule;
	}

	public void setEgtReschedule(Boolean egtReschedule) {
		this.egtReschedule = egtReschedule;
	}

	public Date getEgtSchedDate() {
		return this.egtSchedDate;
	}

	public void setEgtSchedDate(Date egtSchedDate) {
		this.egtSchedDate = egtSchedDate;
	}

	public String getEgtEshSchedule() {
		return this.egtEshSchedule;
	}

	public void setEgtEshSchedule(String egtEshSchedule) {
		this.egtEshSchedule = egtEshSchedule;
	}

	public String getEgtChr01() {
		return this.egtChr01;
	}

	public void setEgtChr01(String egtChr01) {
		this.egtChr01 = egtChr01;
	}

	public String getEgtChr02() {
		return this.egtChr02;
	}

	public void setEgtChr02(String egtChr02) {
		this.egtChr02 = egtChr02;
	}

	public String getEgtChr03() {
		return this.egtChr03;
	}

	public void setEgtChr03(String egtChr03) {
		this.egtChr03 = egtChr03;
	}

	public String getEgtChr04() {
		return this.egtChr04;
	}

	public void setEgtChr04(String egtChr04) {
		this.egtChr04 = egtChr04;
	}

	public Double getEgtDec01() {
		return this.egtDec01;
	}

	public void setEgtDec01(Double egtDec01) {
		this.egtDec01 = egtDec01;
	}

	public Double getEgtDec02() {
		return this.egtDec02;
	}

	public void setEgtDec02(Double egtDec02) {
		this.egtDec02 = egtDec02;
	}

	public Double getEgtDec03() {
		return this.egtDec03;
	}

	public void setEgtDec03(Double egtDec03) {
		this.egtDec03 = egtDec03;
	}

	public Date getEgtDte01() {
		return this.egtDte01;
	}

	public void setEgtDte01(Date egtDte01) {
		this.egtDte01 = egtDte01;
	}

	public Date getEgtDte02() {
		return this.egtDte02;
	}

	public void setEgtDte02(Date egtDte02) {
		this.egtDte02 = egtDte02;
	}

	public Date getEgtDte03() {
		return this.egtDte03;
	}

	public void setEgtDte03(Date egtDte03) {
		this.egtDte03 = egtDte03;
	}

	public Boolean getEgtLog01() {
		return this.egtLog01;
	}

	public void setEgtLog01(Boolean egtLog01) {
		this.egtLog01 = egtLog01;
	}

	public Boolean getEgtLog02() {
		return this.egtLog02;
	}

	public void setEgtLog02(Boolean egtLog02) {
		this.egtLog02 = egtLog02;
	}

	public Boolean getEgtLog03() {
		return this.egtLog03;
	}

	public void setEgtLog03(Boolean egtLog03) {
		this.egtLog03 = egtLog03;
	}

	public String getEgtQadc01() {
		return this.egtQadc01;
	}

	public void setEgtQadc01(String egtQadc01) {
		this.egtQadc01 = egtQadc01;
	}

	public String getEgtQadc02() {
		return this.egtQadc02;
	}

	public void setEgtQadc02(String egtQadc02) {
		this.egtQadc02 = egtQadc02;
	}

	public String getEgtQadc03() {
		return this.egtQadc03;
	}

	public void setEgtQadc03(String egtQadc03) {
		this.egtQadc03 = egtQadc03;
	}

	public String getEgtQadc04() {
		return this.egtQadc04;
	}

	public void setEgtQadc04(String egtQadc04) {
		this.egtQadc04 = egtQadc04;
	}

	public Date getEgtQadd01() {
		return this.egtQadd01;
	}

	public void setEgtQadd01(Date egtQadd01) {
		this.egtQadd01 = egtQadd01;
	}

	public Date getEgtQadd02() {
		return this.egtQadd02;
	}

	public void setEgtQadd02(Date egtQadd02) {
		this.egtQadd02 = egtQadd02;
	}

	public Date getEgtQadd03() {
		return this.egtQadd03;
	}

	public void setEgtQadd03(Date egtQadd03) {
		this.egtQadd03 = egtQadd03;
	}

	public Double getEgtQadde01() {
		return this.egtQadde01;
	}

	public void setEgtQadde01(Double egtQadde01) {
		this.egtQadde01 = egtQadde01;
	}

	public Double getEgtQadde02() {
		return this.egtQadde02;
	}

	public void setEgtQadde02(Double egtQadde02) {
		this.egtQadde02 = egtQadde02;
	}

	public Double getEgtQadde03() {
		return this.egtQadde03;
	}

	public void setEgtQadde03(Double egtQadde03) {
		this.egtQadde03 = egtQadde03;
	}

	public Boolean getEgtQadl01() {
		return this.egtQadl01;
	}

	public void setEgtQadl01(Boolean egtQadl01) {
		this.egtQadl01 = egtQadl01;
	}

	public Boolean getEgtQadl02() {
		return this.egtQadl02;
	}

	public void setEgtQadl02(Boolean egtQadl02) {
		this.egtQadl02 = egtQadl02;
	}

	public Boolean getEgtQadl03() {
		return this.egtQadl03;
	}

	public void setEgtQadl03(Boolean egtQadl03) {
		this.egtQadl03 = egtQadl03;
	}

	public String getEgtItmPrefix() {
		return this.egtItmPrefix;
	}

	public void setEgtItmPrefix(String egtItmPrefix) {
		this.egtItmPrefix = egtItmPrefix;
	}

	public String getEgtItmType() {
		return this.egtItmType;
	}

	public void setEgtItmType(String egtItmType) {
		this.egtItmType = egtItmType;
	}

	public Integer getEgtItmItmLine() {
		return this.egtItmItmLine;
	}

	public void setEgtItmItmLine(Integer egtItmItmLine) {
		this.egtItmItmLine = egtItmItmLine;
	}

	public Integer getEgtItmLine() {
		return this.egtItmLine;
	}

	public void setEgtItmLine(Integer egtItmLine) {
		this.egtItmLine = egtItmLine;
	}

	public Double getOidEgtMstr() {
		return this.oidEgtMstr;
	}

	public void setOidEgtMstr(Double oidEgtMstr) {
		this.oidEgtMstr = oidEgtMstr;
	}

}