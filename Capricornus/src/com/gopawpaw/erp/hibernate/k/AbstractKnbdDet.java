package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * AbstractKnbdDet entity provides the base persistence definition of the
 * KnbdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnbdDet implements java.io.Serializable {

	// Fields

	private KnbdDetId id;
	private Double knbdKeyid;
	private Double knbdKnblKeyid;
	private Boolean knbdActive;
	private Double knbdKanbanQuantity;
	private String knbdStatus;
	private String knbdSourceType;
	private String knbdRef1;
	private String knbdRef2;
	private String knbdRef3;
	private String knbdRef4;
	private String knbdRef5;
	private Date knbdAuthorizeDate;
	private Double knbdAuthorizeTime;
	private Date knbdPrintDate;
	private Double knbdPrintTime;
	private String knbdRouting;
	private String knbdBomCode;
	private Boolean knbdPrintDispatch;
	private String knbdPouSite;
	private String knbdPouRef;
	private String knbdActiveCode;
	private Integer knbdCyclesAllowed;
	private Integer knbdCyclesUsed;
	private Date knbdActiveStartDate;
	private Date knbdActiveEndDate;
	private String knbdNextProcessId;
	private Date knbdModDate;
	private String knbdModUserid;
	private String knbdUser1;
	private String knbdUser2;
	private String knbdQadc01;
	private String knbdQadc02;
	private Double oidKnbdDet;

	// Constructors

	/** default constructor */
	public AbstractKnbdDet() {
	}

	/** minimal constructor */
	public AbstractKnbdDet(KnbdDetId id, Double knbdKeyid,
			Double knbdKnblKeyid, Boolean knbdActive,
			Double knbdKanbanQuantity, String knbdStatus,
			String knbdSourceType, String knbdRef1, String knbdRef2,
			String knbdRef3, String knbdRef4, String knbdRef5,
			Double knbdAuthorizeTime, Double knbdPrintTime, String knbdRouting,
			String knbdBomCode, Boolean knbdPrintDispatch, String knbdPouSite,
			String knbdPouRef, String knbdActiveCode,
			Integer knbdCyclesAllowed, Integer knbdCyclesUsed,
			String knbdNextProcessId, Date knbdModDate, String knbdModUserid,
			String knbdUser1, String knbdUser2, String knbdQadc01,
			String knbdQadc02, Double oidKnbdDet) {
		this.id = id;
		this.knbdKeyid = knbdKeyid;
		this.knbdKnblKeyid = knbdKnblKeyid;
		this.knbdActive = knbdActive;
		this.knbdKanbanQuantity = knbdKanbanQuantity;
		this.knbdStatus = knbdStatus;
		this.knbdSourceType = knbdSourceType;
		this.knbdRef1 = knbdRef1;
		this.knbdRef2 = knbdRef2;
		this.knbdRef3 = knbdRef3;
		this.knbdRef4 = knbdRef4;
		this.knbdRef5 = knbdRef5;
		this.knbdAuthorizeTime = knbdAuthorizeTime;
		this.knbdPrintTime = knbdPrintTime;
		this.knbdRouting = knbdRouting;
		this.knbdBomCode = knbdBomCode;
		this.knbdPrintDispatch = knbdPrintDispatch;
		this.knbdPouSite = knbdPouSite;
		this.knbdPouRef = knbdPouRef;
		this.knbdActiveCode = knbdActiveCode;
		this.knbdCyclesAllowed = knbdCyclesAllowed;
		this.knbdCyclesUsed = knbdCyclesUsed;
		this.knbdNextProcessId = knbdNextProcessId;
		this.knbdModDate = knbdModDate;
		this.knbdModUserid = knbdModUserid;
		this.knbdUser1 = knbdUser1;
		this.knbdUser2 = knbdUser2;
		this.knbdQadc01 = knbdQadc01;
		this.knbdQadc02 = knbdQadc02;
		this.oidKnbdDet = oidKnbdDet;
	}

	/** full constructor */
	public AbstractKnbdDet(KnbdDetId id, Double knbdKeyid,
			Double knbdKnblKeyid, Boolean knbdActive,
			Double knbdKanbanQuantity, String knbdStatus,
			String knbdSourceType, String knbdRef1, String knbdRef2,
			String knbdRef3, String knbdRef4, String knbdRef5,
			Date knbdAuthorizeDate, Double knbdAuthorizeTime,
			Date knbdPrintDate, Double knbdPrintTime, String knbdRouting,
			String knbdBomCode, Boolean knbdPrintDispatch, String knbdPouSite,
			String knbdPouRef, String knbdActiveCode,
			Integer knbdCyclesAllowed, Integer knbdCyclesUsed,
			Date knbdActiveStartDate, Date knbdActiveEndDate,
			String knbdNextProcessId, Date knbdModDate, String knbdModUserid,
			String knbdUser1, String knbdUser2, String knbdQadc01,
			String knbdQadc02, Double oidKnbdDet) {
		this.id = id;
		this.knbdKeyid = knbdKeyid;
		this.knbdKnblKeyid = knbdKnblKeyid;
		this.knbdActive = knbdActive;
		this.knbdKanbanQuantity = knbdKanbanQuantity;
		this.knbdStatus = knbdStatus;
		this.knbdSourceType = knbdSourceType;
		this.knbdRef1 = knbdRef1;
		this.knbdRef2 = knbdRef2;
		this.knbdRef3 = knbdRef3;
		this.knbdRef4 = knbdRef4;
		this.knbdRef5 = knbdRef5;
		this.knbdAuthorizeDate = knbdAuthorizeDate;
		this.knbdAuthorizeTime = knbdAuthorizeTime;
		this.knbdPrintDate = knbdPrintDate;
		this.knbdPrintTime = knbdPrintTime;
		this.knbdRouting = knbdRouting;
		this.knbdBomCode = knbdBomCode;
		this.knbdPrintDispatch = knbdPrintDispatch;
		this.knbdPouSite = knbdPouSite;
		this.knbdPouRef = knbdPouRef;
		this.knbdActiveCode = knbdActiveCode;
		this.knbdCyclesAllowed = knbdCyclesAllowed;
		this.knbdCyclesUsed = knbdCyclesUsed;
		this.knbdActiveStartDate = knbdActiveStartDate;
		this.knbdActiveEndDate = knbdActiveEndDate;
		this.knbdNextProcessId = knbdNextProcessId;
		this.knbdModDate = knbdModDate;
		this.knbdModUserid = knbdModUserid;
		this.knbdUser1 = knbdUser1;
		this.knbdUser2 = knbdUser2;
		this.knbdQadc01 = knbdQadc01;
		this.knbdQadc02 = knbdQadc02;
		this.oidKnbdDet = oidKnbdDet;
	}

	// Property accessors

	public KnbdDetId getId() {
		return this.id;
	}

	public void setId(KnbdDetId id) {
		this.id = id;
	}

	public Double getKnbdKeyid() {
		return this.knbdKeyid;
	}

	public void setKnbdKeyid(Double knbdKeyid) {
		this.knbdKeyid = knbdKeyid;
	}

	public Double getKnbdKnblKeyid() {
		return this.knbdKnblKeyid;
	}

	public void setKnbdKnblKeyid(Double knbdKnblKeyid) {
		this.knbdKnblKeyid = knbdKnblKeyid;
	}

	public Boolean getKnbdActive() {
		return this.knbdActive;
	}

	public void setKnbdActive(Boolean knbdActive) {
		this.knbdActive = knbdActive;
	}

	public Double getKnbdKanbanQuantity() {
		return this.knbdKanbanQuantity;
	}

	public void setKnbdKanbanQuantity(Double knbdKanbanQuantity) {
		this.knbdKanbanQuantity = knbdKanbanQuantity;
	}

	public String getKnbdStatus() {
		return this.knbdStatus;
	}

	public void setKnbdStatus(String knbdStatus) {
		this.knbdStatus = knbdStatus;
	}

	public String getKnbdSourceType() {
		return this.knbdSourceType;
	}

	public void setKnbdSourceType(String knbdSourceType) {
		this.knbdSourceType = knbdSourceType;
	}

	public String getKnbdRef1() {
		return this.knbdRef1;
	}

	public void setKnbdRef1(String knbdRef1) {
		this.knbdRef1 = knbdRef1;
	}

	public String getKnbdRef2() {
		return this.knbdRef2;
	}

	public void setKnbdRef2(String knbdRef2) {
		this.knbdRef2 = knbdRef2;
	}

	public String getKnbdRef3() {
		return this.knbdRef3;
	}

	public void setKnbdRef3(String knbdRef3) {
		this.knbdRef3 = knbdRef3;
	}

	public String getKnbdRef4() {
		return this.knbdRef4;
	}

	public void setKnbdRef4(String knbdRef4) {
		this.knbdRef4 = knbdRef4;
	}

	public String getKnbdRef5() {
		return this.knbdRef5;
	}

	public void setKnbdRef5(String knbdRef5) {
		this.knbdRef5 = knbdRef5;
	}

	public Date getKnbdAuthorizeDate() {
		return this.knbdAuthorizeDate;
	}

	public void setKnbdAuthorizeDate(Date knbdAuthorizeDate) {
		this.knbdAuthorizeDate = knbdAuthorizeDate;
	}

	public Double getKnbdAuthorizeTime() {
		return this.knbdAuthorizeTime;
	}

	public void setKnbdAuthorizeTime(Double knbdAuthorizeTime) {
		this.knbdAuthorizeTime = knbdAuthorizeTime;
	}

	public Date getKnbdPrintDate() {
		return this.knbdPrintDate;
	}

	public void setKnbdPrintDate(Date knbdPrintDate) {
		this.knbdPrintDate = knbdPrintDate;
	}

	public Double getKnbdPrintTime() {
		return this.knbdPrintTime;
	}

	public void setKnbdPrintTime(Double knbdPrintTime) {
		this.knbdPrintTime = knbdPrintTime;
	}

	public String getKnbdRouting() {
		return this.knbdRouting;
	}

	public void setKnbdRouting(String knbdRouting) {
		this.knbdRouting = knbdRouting;
	}

	public String getKnbdBomCode() {
		return this.knbdBomCode;
	}

	public void setKnbdBomCode(String knbdBomCode) {
		this.knbdBomCode = knbdBomCode;
	}

	public Boolean getKnbdPrintDispatch() {
		return this.knbdPrintDispatch;
	}

	public void setKnbdPrintDispatch(Boolean knbdPrintDispatch) {
		this.knbdPrintDispatch = knbdPrintDispatch;
	}

	public String getKnbdPouSite() {
		return this.knbdPouSite;
	}

	public void setKnbdPouSite(String knbdPouSite) {
		this.knbdPouSite = knbdPouSite;
	}

	public String getKnbdPouRef() {
		return this.knbdPouRef;
	}

	public void setKnbdPouRef(String knbdPouRef) {
		this.knbdPouRef = knbdPouRef;
	}

	public String getKnbdActiveCode() {
		return this.knbdActiveCode;
	}

	public void setKnbdActiveCode(String knbdActiveCode) {
		this.knbdActiveCode = knbdActiveCode;
	}

	public Integer getKnbdCyclesAllowed() {
		return this.knbdCyclesAllowed;
	}

	public void setKnbdCyclesAllowed(Integer knbdCyclesAllowed) {
		this.knbdCyclesAllowed = knbdCyclesAllowed;
	}

	public Integer getKnbdCyclesUsed() {
		return this.knbdCyclesUsed;
	}

	public void setKnbdCyclesUsed(Integer knbdCyclesUsed) {
		this.knbdCyclesUsed = knbdCyclesUsed;
	}

	public Date getKnbdActiveStartDate() {
		return this.knbdActiveStartDate;
	}

	public void setKnbdActiveStartDate(Date knbdActiveStartDate) {
		this.knbdActiveStartDate = knbdActiveStartDate;
	}

	public Date getKnbdActiveEndDate() {
		return this.knbdActiveEndDate;
	}

	public void setKnbdActiveEndDate(Date knbdActiveEndDate) {
		this.knbdActiveEndDate = knbdActiveEndDate;
	}

	public String getKnbdNextProcessId() {
		return this.knbdNextProcessId;
	}

	public void setKnbdNextProcessId(String knbdNextProcessId) {
		this.knbdNextProcessId = knbdNextProcessId;
	}

	public Date getKnbdModDate() {
		return this.knbdModDate;
	}

	public void setKnbdModDate(Date knbdModDate) {
		this.knbdModDate = knbdModDate;
	}

	public String getKnbdModUserid() {
		return this.knbdModUserid;
	}

	public void setKnbdModUserid(String knbdModUserid) {
		this.knbdModUserid = knbdModUserid;
	}

	public String getKnbdUser1() {
		return this.knbdUser1;
	}

	public void setKnbdUser1(String knbdUser1) {
		this.knbdUser1 = knbdUser1;
	}

	public String getKnbdUser2() {
		return this.knbdUser2;
	}

	public void setKnbdUser2(String knbdUser2) {
		this.knbdUser2 = knbdUser2;
	}

	public String getKnbdQadc01() {
		return this.knbdQadc01;
	}

	public void setKnbdQadc01(String knbdQadc01) {
		this.knbdQadc01 = knbdQadc01;
	}

	public String getKnbdQadc02() {
		return this.knbdQadc02;
	}

	public void setKnbdQadc02(String knbdQadc02) {
		this.knbdQadc02 = knbdQadc02;
	}

	public Double getOidKnbdDet() {
		return this.oidKnbdDet;
	}

	public void setOidKnbdDet(Double oidKnbdDet) {
		this.oidKnbdDet = oidKnbdDet;
	}

}