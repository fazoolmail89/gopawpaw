package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * AbstractKnbcdDet entity provides the base persistence definition of the
 * KnbcdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnbcdDet implements java.io.Serializable {

	// Fields

	private KnbcdDetId id;
	private String knbcdPart;
	private Boolean knbcdClosed;
	private Date knbcdDueDate;
	private Integer knbcdDueTime;
	private Date knbcdDeliveryDate;
	private Integer knbcdDeliveryTime;
	private Boolean knbcdProcessEdi;
	private Date knbcdShipDate;
	private Integer knbcdShipTime;
	private Date knbcdFillDate;
	private Integer knbcdFillTime;
	private Integer knbcdKbtrTransNbr;
	private String knbcdSourceType;
	private String knbcdRef1;
	private String knbcdRef2;
	private String knbcdRef3;
	private String knbcdRef4;
	private String knbcdRef5;
	private String knbcdPoNbr;
	private Integer knbcdPodLine;
	private String knbcdPodBlanket;
	private Integer knbcdPodBlnktLn;
	private Integer knbcdMfdSeq;
	private String knbcdSourceFax;
	private String knbcdSourceFax2;
	private String knbcdSourceEmail;
	private String knbcdModUserid;
	private Date knbcdModDate;
	private String knbcdUser1;
	private String knbcdUser2;
	private String knbcdQadc01;
	private String knbcdQadc02;
	private String knbcdQadc03;
	private String knbcdQadc04;
	private Boolean knbcdQadl01;
	private Boolean knbcdQadl02;
	private Double oidKnbcdDet;

	// Constructors

	/** default constructor */
	public AbstractKnbcdDet() {
	}

	/** minimal constructor */
	public AbstractKnbcdDet(KnbcdDetId id, String knbcdPart,
			Boolean knbcdClosed, Integer knbcdDueTime,
			Integer knbcdDeliveryTime, Boolean knbcdProcessEdi,
			Integer knbcdShipTime, Integer knbcdFillTime,
			Integer knbcdKbtrTransNbr, String knbcdSourceType,
			String knbcdRef1, String knbcdRef2, String knbcdRef3,
			String knbcdRef4, String knbcdRef5, String knbcdPoNbr,
			Integer knbcdPodLine, String knbcdPodBlanket,
			Integer knbcdPodBlnktLn, Integer knbcdMfdSeq,
			String knbcdSourceFax, String knbcdSourceFax2,
			String knbcdSourceEmail, String knbcdModUserid, Date knbcdModDate,
			String knbcdUser1, String knbcdUser2, String knbcdQadc01,
			String knbcdQadc02, String knbcdQadc03, String knbcdQadc04,
			Boolean knbcdQadl01, Boolean knbcdQadl02, Double oidKnbcdDet) {
		this.id = id;
		this.knbcdPart = knbcdPart;
		this.knbcdClosed = knbcdClosed;
		this.knbcdDueTime = knbcdDueTime;
		this.knbcdDeliveryTime = knbcdDeliveryTime;
		this.knbcdProcessEdi = knbcdProcessEdi;
		this.knbcdShipTime = knbcdShipTime;
		this.knbcdFillTime = knbcdFillTime;
		this.knbcdKbtrTransNbr = knbcdKbtrTransNbr;
		this.knbcdSourceType = knbcdSourceType;
		this.knbcdRef1 = knbcdRef1;
		this.knbcdRef2 = knbcdRef2;
		this.knbcdRef3 = knbcdRef3;
		this.knbcdRef4 = knbcdRef4;
		this.knbcdRef5 = knbcdRef5;
		this.knbcdPoNbr = knbcdPoNbr;
		this.knbcdPodLine = knbcdPodLine;
		this.knbcdPodBlanket = knbcdPodBlanket;
		this.knbcdPodBlnktLn = knbcdPodBlnktLn;
		this.knbcdMfdSeq = knbcdMfdSeq;
		this.knbcdSourceFax = knbcdSourceFax;
		this.knbcdSourceFax2 = knbcdSourceFax2;
		this.knbcdSourceEmail = knbcdSourceEmail;
		this.knbcdModUserid = knbcdModUserid;
		this.knbcdModDate = knbcdModDate;
		this.knbcdUser1 = knbcdUser1;
		this.knbcdUser2 = knbcdUser2;
		this.knbcdQadc01 = knbcdQadc01;
		this.knbcdQadc02 = knbcdQadc02;
		this.knbcdQadc03 = knbcdQadc03;
		this.knbcdQadc04 = knbcdQadc04;
		this.knbcdQadl01 = knbcdQadl01;
		this.knbcdQadl02 = knbcdQadl02;
		this.oidKnbcdDet = oidKnbcdDet;
	}

	/** full constructor */
	public AbstractKnbcdDet(KnbcdDetId id, String knbcdPart,
			Boolean knbcdClosed, Date knbcdDueDate, Integer knbcdDueTime,
			Date knbcdDeliveryDate, Integer knbcdDeliveryTime,
			Boolean knbcdProcessEdi, Date knbcdShipDate, Integer knbcdShipTime,
			Date knbcdFillDate, Integer knbcdFillTime,
			Integer knbcdKbtrTransNbr, String knbcdSourceType,
			String knbcdRef1, String knbcdRef2, String knbcdRef3,
			String knbcdRef4, String knbcdRef5, String knbcdPoNbr,
			Integer knbcdPodLine, String knbcdPodBlanket,
			Integer knbcdPodBlnktLn, Integer knbcdMfdSeq,
			String knbcdSourceFax, String knbcdSourceFax2,
			String knbcdSourceEmail, String knbcdModUserid, Date knbcdModDate,
			String knbcdUser1, String knbcdUser2, String knbcdQadc01,
			String knbcdQadc02, String knbcdQadc03, String knbcdQadc04,
			Boolean knbcdQadl01, Boolean knbcdQadl02, Double oidKnbcdDet) {
		this.id = id;
		this.knbcdPart = knbcdPart;
		this.knbcdClosed = knbcdClosed;
		this.knbcdDueDate = knbcdDueDate;
		this.knbcdDueTime = knbcdDueTime;
		this.knbcdDeliveryDate = knbcdDeliveryDate;
		this.knbcdDeliveryTime = knbcdDeliveryTime;
		this.knbcdProcessEdi = knbcdProcessEdi;
		this.knbcdShipDate = knbcdShipDate;
		this.knbcdShipTime = knbcdShipTime;
		this.knbcdFillDate = knbcdFillDate;
		this.knbcdFillTime = knbcdFillTime;
		this.knbcdKbtrTransNbr = knbcdKbtrTransNbr;
		this.knbcdSourceType = knbcdSourceType;
		this.knbcdRef1 = knbcdRef1;
		this.knbcdRef2 = knbcdRef2;
		this.knbcdRef3 = knbcdRef3;
		this.knbcdRef4 = knbcdRef4;
		this.knbcdRef5 = knbcdRef5;
		this.knbcdPoNbr = knbcdPoNbr;
		this.knbcdPodLine = knbcdPodLine;
		this.knbcdPodBlanket = knbcdPodBlanket;
		this.knbcdPodBlnktLn = knbcdPodBlnktLn;
		this.knbcdMfdSeq = knbcdMfdSeq;
		this.knbcdSourceFax = knbcdSourceFax;
		this.knbcdSourceFax2 = knbcdSourceFax2;
		this.knbcdSourceEmail = knbcdSourceEmail;
		this.knbcdModUserid = knbcdModUserid;
		this.knbcdModDate = knbcdModDate;
		this.knbcdUser1 = knbcdUser1;
		this.knbcdUser2 = knbcdUser2;
		this.knbcdQadc01 = knbcdQadc01;
		this.knbcdQadc02 = knbcdQadc02;
		this.knbcdQadc03 = knbcdQadc03;
		this.knbcdQadc04 = knbcdQadc04;
		this.knbcdQadl01 = knbcdQadl01;
		this.knbcdQadl02 = knbcdQadl02;
		this.oidKnbcdDet = oidKnbcdDet;
	}

	// Property accessors

	public KnbcdDetId getId() {
		return this.id;
	}

	public void setId(KnbcdDetId id) {
		this.id = id;
	}

	public String getKnbcdPart() {
		return this.knbcdPart;
	}

	public void setKnbcdPart(String knbcdPart) {
		this.knbcdPart = knbcdPart;
	}

	public Boolean getKnbcdClosed() {
		return this.knbcdClosed;
	}

	public void setKnbcdClosed(Boolean knbcdClosed) {
		this.knbcdClosed = knbcdClosed;
	}

	public Date getKnbcdDueDate() {
		return this.knbcdDueDate;
	}

	public void setKnbcdDueDate(Date knbcdDueDate) {
		this.knbcdDueDate = knbcdDueDate;
	}

	public Integer getKnbcdDueTime() {
		return this.knbcdDueTime;
	}

	public void setKnbcdDueTime(Integer knbcdDueTime) {
		this.knbcdDueTime = knbcdDueTime;
	}

	public Date getKnbcdDeliveryDate() {
		return this.knbcdDeliveryDate;
	}

	public void setKnbcdDeliveryDate(Date knbcdDeliveryDate) {
		this.knbcdDeliveryDate = knbcdDeliveryDate;
	}

	public Integer getKnbcdDeliveryTime() {
		return this.knbcdDeliveryTime;
	}

	public void setKnbcdDeliveryTime(Integer knbcdDeliveryTime) {
		this.knbcdDeliveryTime = knbcdDeliveryTime;
	}

	public Boolean getKnbcdProcessEdi() {
		return this.knbcdProcessEdi;
	}

	public void setKnbcdProcessEdi(Boolean knbcdProcessEdi) {
		this.knbcdProcessEdi = knbcdProcessEdi;
	}

	public Date getKnbcdShipDate() {
		return this.knbcdShipDate;
	}

	public void setKnbcdShipDate(Date knbcdShipDate) {
		this.knbcdShipDate = knbcdShipDate;
	}

	public Integer getKnbcdShipTime() {
		return this.knbcdShipTime;
	}

	public void setKnbcdShipTime(Integer knbcdShipTime) {
		this.knbcdShipTime = knbcdShipTime;
	}

	public Date getKnbcdFillDate() {
		return this.knbcdFillDate;
	}

	public void setKnbcdFillDate(Date knbcdFillDate) {
		this.knbcdFillDate = knbcdFillDate;
	}

	public Integer getKnbcdFillTime() {
		return this.knbcdFillTime;
	}

	public void setKnbcdFillTime(Integer knbcdFillTime) {
		this.knbcdFillTime = knbcdFillTime;
	}

	public Integer getKnbcdKbtrTransNbr() {
		return this.knbcdKbtrTransNbr;
	}

	public void setKnbcdKbtrTransNbr(Integer knbcdKbtrTransNbr) {
		this.knbcdKbtrTransNbr = knbcdKbtrTransNbr;
	}

	public String getKnbcdSourceType() {
		return this.knbcdSourceType;
	}

	public void setKnbcdSourceType(String knbcdSourceType) {
		this.knbcdSourceType = knbcdSourceType;
	}

	public String getKnbcdRef1() {
		return this.knbcdRef1;
	}

	public void setKnbcdRef1(String knbcdRef1) {
		this.knbcdRef1 = knbcdRef1;
	}

	public String getKnbcdRef2() {
		return this.knbcdRef2;
	}

	public void setKnbcdRef2(String knbcdRef2) {
		this.knbcdRef2 = knbcdRef2;
	}

	public String getKnbcdRef3() {
		return this.knbcdRef3;
	}

	public void setKnbcdRef3(String knbcdRef3) {
		this.knbcdRef3 = knbcdRef3;
	}

	public String getKnbcdRef4() {
		return this.knbcdRef4;
	}

	public void setKnbcdRef4(String knbcdRef4) {
		this.knbcdRef4 = knbcdRef4;
	}

	public String getKnbcdRef5() {
		return this.knbcdRef5;
	}

	public void setKnbcdRef5(String knbcdRef5) {
		this.knbcdRef5 = knbcdRef5;
	}

	public String getKnbcdPoNbr() {
		return this.knbcdPoNbr;
	}

	public void setKnbcdPoNbr(String knbcdPoNbr) {
		this.knbcdPoNbr = knbcdPoNbr;
	}

	public Integer getKnbcdPodLine() {
		return this.knbcdPodLine;
	}

	public void setKnbcdPodLine(Integer knbcdPodLine) {
		this.knbcdPodLine = knbcdPodLine;
	}

	public String getKnbcdPodBlanket() {
		return this.knbcdPodBlanket;
	}

	public void setKnbcdPodBlanket(String knbcdPodBlanket) {
		this.knbcdPodBlanket = knbcdPodBlanket;
	}

	public Integer getKnbcdPodBlnktLn() {
		return this.knbcdPodBlnktLn;
	}

	public void setKnbcdPodBlnktLn(Integer knbcdPodBlnktLn) {
		this.knbcdPodBlnktLn = knbcdPodBlnktLn;
	}

	public Integer getKnbcdMfdSeq() {
		return this.knbcdMfdSeq;
	}

	public void setKnbcdMfdSeq(Integer knbcdMfdSeq) {
		this.knbcdMfdSeq = knbcdMfdSeq;
	}

	public String getKnbcdSourceFax() {
		return this.knbcdSourceFax;
	}

	public void setKnbcdSourceFax(String knbcdSourceFax) {
		this.knbcdSourceFax = knbcdSourceFax;
	}

	public String getKnbcdSourceFax2() {
		return this.knbcdSourceFax2;
	}

	public void setKnbcdSourceFax2(String knbcdSourceFax2) {
		this.knbcdSourceFax2 = knbcdSourceFax2;
	}

	public String getKnbcdSourceEmail() {
		return this.knbcdSourceEmail;
	}

	public void setKnbcdSourceEmail(String knbcdSourceEmail) {
		this.knbcdSourceEmail = knbcdSourceEmail;
	}

	public String getKnbcdModUserid() {
		return this.knbcdModUserid;
	}

	public void setKnbcdModUserid(String knbcdModUserid) {
		this.knbcdModUserid = knbcdModUserid;
	}

	public Date getKnbcdModDate() {
		return this.knbcdModDate;
	}

	public void setKnbcdModDate(Date knbcdModDate) {
		this.knbcdModDate = knbcdModDate;
	}

	public String getKnbcdUser1() {
		return this.knbcdUser1;
	}

	public void setKnbcdUser1(String knbcdUser1) {
		this.knbcdUser1 = knbcdUser1;
	}

	public String getKnbcdUser2() {
		return this.knbcdUser2;
	}

	public void setKnbcdUser2(String knbcdUser2) {
		this.knbcdUser2 = knbcdUser2;
	}

	public String getKnbcdQadc01() {
		return this.knbcdQadc01;
	}

	public void setKnbcdQadc01(String knbcdQadc01) {
		this.knbcdQadc01 = knbcdQadc01;
	}

	public String getKnbcdQadc02() {
		return this.knbcdQadc02;
	}

	public void setKnbcdQadc02(String knbcdQadc02) {
		this.knbcdQadc02 = knbcdQadc02;
	}

	public String getKnbcdQadc03() {
		return this.knbcdQadc03;
	}

	public void setKnbcdQadc03(String knbcdQadc03) {
		this.knbcdQadc03 = knbcdQadc03;
	}

	public String getKnbcdQadc04() {
		return this.knbcdQadc04;
	}

	public void setKnbcdQadc04(String knbcdQadc04) {
		this.knbcdQadc04 = knbcdQadc04;
	}

	public Boolean getKnbcdQadl01() {
		return this.knbcdQadl01;
	}

	public void setKnbcdQadl01(Boolean knbcdQadl01) {
		this.knbcdQadl01 = knbcdQadl01;
	}

	public Boolean getKnbcdQadl02() {
		return this.knbcdQadl02;
	}

	public void setKnbcdQadl02(Boolean knbcdQadl02) {
		this.knbcdQadl02 = knbcdQadl02;
	}

	public Double getOidKnbcdDet() {
		return this.oidKnbcdDet;
	}

	public void setOidKnbcdDet(Double oidKnbcdDet) {
		this.oidKnbcdDet = oidKnbcdDet;
	}

}