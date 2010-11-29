package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFlsdDet entity provides the base persistence definition of the
 * FlsdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFlsdDet implements java.io.Serializable {

	// Fields

	private FlsdDetId id;
	private Integer flsdDueTime;
	private String flsdPart;
	private String flsdFlowWoNbr;
	private String flsdFlowWoLot;
	private String flsdWoNbr;
	private String flsdWoLot;
	private String flsdSoNbr;
	private Integer flsdSodLine;
	private String flsdNote;
	private Boolean flsdPostedToRep;
	private Boolean flsdClosed;
	private Double flsdQtyOrd;
	private Double flsdQtyComp;
	private Integer flsdCmtindx;
	private String flsdModUserid;
	private Date flsdModDate;
	private String flsdUser1;
	private String flsdUser2;
	private String flsdUserc03;
	private Double flsdUserd01;
	private Integer flsdUseri01;
	private Boolean flsdUserl01;
	private Date flsdUsert01;
	private String flsdQadc01;
	private String flsdQadc02;
	private String flsdQadc03;
	private String flsdQadc04;
	private String flsdQadc05;
	private String flsdQadc06;
	private Double flsdQadd01;
	private Double flsdQadd02;
	private Integer flsdQadi01;
	private Integer flsdQadi02;
	private Boolean flsdQadl01;
	private Boolean flsdQadl02;
	private Date flsdQadt01;
	private Date flsdQadt02;
	private Integer flsdShift;
	private Double flsdKnpdKeyid;
	private Double oidFlsdDet;

	// Constructors

	/** default constructor */
	public AbstractFlsdDet() {
	}

	/** minimal constructor */
	public AbstractFlsdDet(FlsdDetId id, Integer flsdDueTime, String flsdPart,
			String flsdFlowWoNbr, String flsdFlowWoLot, String flsdWoNbr,
			String flsdWoLot, String flsdSoNbr, Integer flsdSodLine,
			String flsdNote, Boolean flsdPostedToRep, Boolean flsdClosed,
			Double flsdQtyOrd, Double flsdQtyComp, Integer flsdCmtindx,
			String flsdModUserid, Date flsdModDate, String flsdUser1,
			String flsdUser2, String flsdUserc03, Double flsdUserd01,
			Integer flsdUseri01, Boolean flsdUserl01, String flsdQadc01,
			String flsdQadc02, String flsdQadc03, String flsdQadc04,
			String flsdQadc05, String flsdQadc06, Double flsdQadd01,
			Double flsdQadd02, Integer flsdQadi01, Integer flsdQadi02,
			Boolean flsdQadl01, Boolean flsdQadl02, Integer flsdShift,
			Double flsdKnpdKeyid, Double oidFlsdDet) {
		this.id = id;
		this.flsdDueTime = flsdDueTime;
		this.flsdPart = flsdPart;
		this.flsdFlowWoNbr = flsdFlowWoNbr;
		this.flsdFlowWoLot = flsdFlowWoLot;
		this.flsdWoNbr = flsdWoNbr;
		this.flsdWoLot = flsdWoLot;
		this.flsdSoNbr = flsdSoNbr;
		this.flsdSodLine = flsdSodLine;
		this.flsdNote = flsdNote;
		this.flsdPostedToRep = flsdPostedToRep;
		this.flsdClosed = flsdClosed;
		this.flsdQtyOrd = flsdQtyOrd;
		this.flsdQtyComp = flsdQtyComp;
		this.flsdCmtindx = flsdCmtindx;
		this.flsdModUserid = flsdModUserid;
		this.flsdModDate = flsdModDate;
		this.flsdUser1 = flsdUser1;
		this.flsdUser2 = flsdUser2;
		this.flsdUserc03 = flsdUserc03;
		this.flsdUserd01 = flsdUserd01;
		this.flsdUseri01 = flsdUseri01;
		this.flsdUserl01 = flsdUserl01;
		this.flsdQadc01 = flsdQadc01;
		this.flsdQadc02 = flsdQadc02;
		this.flsdQadc03 = flsdQadc03;
		this.flsdQadc04 = flsdQadc04;
		this.flsdQadc05 = flsdQadc05;
		this.flsdQadc06 = flsdQadc06;
		this.flsdQadd01 = flsdQadd01;
		this.flsdQadd02 = flsdQadd02;
		this.flsdQadi01 = flsdQadi01;
		this.flsdQadi02 = flsdQadi02;
		this.flsdQadl01 = flsdQadl01;
		this.flsdQadl02 = flsdQadl02;
		this.flsdShift = flsdShift;
		this.flsdKnpdKeyid = flsdKnpdKeyid;
		this.oidFlsdDet = oidFlsdDet;
	}

	/** full constructor */
	public AbstractFlsdDet(FlsdDetId id, Integer flsdDueTime, String flsdPart,
			String flsdFlowWoNbr, String flsdFlowWoLot, String flsdWoNbr,
			String flsdWoLot, String flsdSoNbr, Integer flsdSodLine,
			String flsdNote, Boolean flsdPostedToRep, Boolean flsdClosed,
			Double flsdQtyOrd, Double flsdQtyComp, Integer flsdCmtindx,
			String flsdModUserid, Date flsdModDate, String flsdUser1,
			String flsdUser2, String flsdUserc03, Double flsdUserd01,
			Integer flsdUseri01, Boolean flsdUserl01, Date flsdUsert01,
			String flsdQadc01, String flsdQadc02, String flsdQadc03,
			String flsdQadc04, String flsdQadc05, String flsdQadc06,
			Double flsdQadd01, Double flsdQadd02, Integer flsdQadi01,
			Integer flsdQadi02, Boolean flsdQadl01, Boolean flsdQadl02,
			Date flsdQadt01, Date flsdQadt02, Integer flsdShift,
			Double flsdKnpdKeyid, Double oidFlsdDet) {
		this.id = id;
		this.flsdDueTime = flsdDueTime;
		this.flsdPart = flsdPart;
		this.flsdFlowWoNbr = flsdFlowWoNbr;
		this.flsdFlowWoLot = flsdFlowWoLot;
		this.flsdWoNbr = flsdWoNbr;
		this.flsdWoLot = flsdWoLot;
		this.flsdSoNbr = flsdSoNbr;
		this.flsdSodLine = flsdSodLine;
		this.flsdNote = flsdNote;
		this.flsdPostedToRep = flsdPostedToRep;
		this.flsdClosed = flsdClosed;
		this.flsdQtyOrd = flsdQtyOrd;
		this.flsdQtyComp = flsdQtyComp;
		this.flsdCmtindx = flsdCmtindx;
		this.flsdModUserid = flsdModUserid;
		this.flsdModDate = flsdModDate;
		this.flsdUser1 = flsdUser1;
		this.flsdUser2 = flsdUser2;
		this.flsdUserc03 = flsdUserc03;
		this.flsdUserd01 = flsdUserd01;
		this.flsdUseri01 = flsdUseri01;
		this.flsdUserl01 = flsdUserl01;
		this.flsdUsert01 = flsdUsert01;
		this.flsdQadc01 = flsdQadc01;
		this.flsdQadc02 = flsdQadc02;
		this.flsdQadc03 = flsdQadc03;
		this.flsdQadc04 = flsdQadc04;
		this.flsdQadc05 = flsdQadc05;
		this.flsdQadc06 = flsdQadc06;
		this.flsdQadd01 = flsdQadd01;
		this.flsdQadd02 = flsdQadd02;
		this.flsdQadi01 = flsdQadi01;
		this.flsdQadi02 = flsdQadi02;
		this.flsdQadl01 = flsdQadl01;
		this.flsdQadl02 = flsdQadl02;
		this.flsdQadt01 = flsdQadt01;
		this.flsdQadt02 = flsdQadt02;
		this.flsdShift = flsdShift;
		this.flsdKnpdKeyid = flsdKnpdKeyid;
		this.oidFlsdDet = oidFlsdDet;
	}

	// Property accessors

	public FlsdDetId getId() {
		return this.id;
	}

	public void setId(FlsdDetId id) {
		this.id = id;
	}

	public Integer getFlsdDueTime() {
		return this.flsdDueTime;
	}

	public void setFlsdDueTime(Integer flsdDueTime) {
		this.flsdDueTime = flsdDueTime;
	}

	public String getFlsdPart() {
		return this.flsdPart;
	}

	public void setFlsdPart(String flsdPart) {
		this.flsdPart = flsdPart;
	}

	public String getFlsdFlowWoNbr() {
		return this.flsdFlowWoNbr;
	}

	public void setFlsdFlowWoNbr(String flsdFlowWoNbr) {
		this.flsdFlowWoNbr = flsdFlowWoNbr;
	}

	public String getFlsdFlowWoLot() {
		return this.flsdFlowWoLot;
	}

	public void setFlsdFlowWoLot(String flsdFlowWoLot) {
		this.flsdFlowWoLot = flsdFlowWoLot;
	}

	public String getFlsdWoNbr() {
		return this.flsdWoNbr;
	}

	public void setFlsdWoNbr(String flsdWoNbr) {
		this.flsdWoNbr = flsdWoNbr;
	}

	public String getFlsdWoLot() {
		return this.flsdWoLot;
	}

	public void setFlsdWoLot(String flsdWoLot) {
		this.flsdWoLot = flsdWoLot;
	}

	public String getFlsdSoNbr() {
		return this.flsdSoNbr;
	}

	public void setFlsdSoNbr(String flsdSoNbr) {
		this.flsdSoNbr = flsdSoNbr;
	}

	public Integer getFlsdSodLine() {
		return this.flsdSodLine;
	}

	public void setFlsdSodLine(Integer flsdSodLine) {
		this.flsdSodLine = flsdSodLine;
	}

	public String getFlsdNote() {
		return this.flsdNote;
	}

	public void setFlsdNote(String flsdNote) {
		this.flsdNote = flsdNote;
	}

	public Boolean getFlsdPostedToRep() {
		return this.flsdPostedToRep;
	}

	public void setFlsdPostedToRep(Boolean flsdPostedToRep) {
		this.flsdPostedToRep = flsdPostedToRep;
	}

	public Boolean getFlsdClosed() {
		return this.flsdClosed;
	}

	public void setFlsdClosed(Boolean flsdClosed) {
		this.flsdClosed = flsdClosed;
	}

	public Double getFlsdQtyOrd() {
		return this.flsdQtyOrd;
	}

	public void setFlsdQtyOrd(Double flsdQtyOrd) {
		this.flsdQtyOrd = flsdQtyOrd;
	}

	public Double getFlsdQtyComp() {
		return this.flsdQtyComp;
	}

	public void setFlsdQtyComp(Double flsdQtyComp) {
		this.flsdQtyComp = flsdQtyComp;
	}

	public Integer getFlsdCmtindx() {
		return this.flsdCmtindx;
	}

	public void setFlsdCmtindx(Integer flsdCmtindx) {
		this.flsdCmtindx = flsdCmtindx;
	}

	public String getFlsdModUserid() {
		return this.flsdModUserid;
	}

	public void setFlsdModUserid(String flsdModUserid) {
		this.flsdModUserid = flsdModUserid;
	}

	public Date getFlsdModDate() {
		return this.flsdModDate;
	}

	public void setFlsdModDate(Date flsdModDate) {
		this.flsdModDate = flsdModDate;
	}

	public String getFlsdUser1() {
		return this.flsdUser1;
	}

	public void setFlsdUser1(String flsdUser1) {
		this.flsdUser1 = flsdUser1;
	}

	public String getFlsdUser2() {
		return this.flsdUser2;
	}

	public void setFlsdUser2(String flsdUser2) {
		this.flsdUser2 = flsdUser2;
	}

	public String getFlsdUserc03() {
		return this.flsdUserc03;
	}

	public void setFlsdUserc03(String flsdUserc03) {
		this.flsdUserc03 = flsdUserc03;
	}

	public Double getFlsdUserd01() {
		return this.flsdUserd01;
	}

	public void setFlsdUserd01(Double flsdUserd01) {
		this.flsdUserd01 = flsdUserd01;
	}

	public Integer getFlsdUseri01() {
		return this.flsdUseri01;
	}

	public void setFlsdUseri01(Integer flsdUseri01) {
		this.flsdUseri01 = flsdUseri01;
	}

	public Boolean getFlsdUserl01() {
		return this.flsdUserl01;
	}

	public void setFlsdUserl01(Boolean flsdUserl01) {
		this.flsdUserl01 = flsdUserl01;
	}

	public Date getFlsdUsert01() {
		return this.flsdUsert01;
	}

	public void setFlsdUsert01(Date flsdUsert01) {
		this.flsdUsert01 = flsdUsert01;
	}

	public String getFlsdQadc01() {
		return this.flsdQadc01;
	}

	public void setFlsdQadc01(String flsdQadc01) {
		this.flsdQadc01 = flsdQadc01;
	}

	public String getFlsdQadc02() {
		return this.flsdQadc02;
	}

	public void setFlsdQadc02(String flsdQadc02) {
		this.flsdQadc02 = flsdQadc02;
	}

	public String getFlsdQadc03() {
		return this.flsdQadc03;
	}

	public void setFlsdQadc03(String flsdQadc03) {
		this.flsdQadc03 = flsdQadc03;
	}

	public String getFlsdQadc04() {
		return this.flsdQadc04;
	}

	public void setFlsdQadc04(String flsdQadc04) {
		this.flsdQadc04 = flsdQadc04;
	}

	public String getFlsdQadc05() {
		return this.flsdQadc05;
	}

	public void setFlsdQadc05(String flsdQadc05) {
		this.flsdQadc05 = flsdQadc05;
	}

	public String getFlsdQadc06() {
		return this.flsdQadc06;
	}

	public void setFlsdQadc06(String flsdQadc06) {
		this.flsdQadc06 = flsdQadc06;
	}

	public Double getFlsdQadd01() {
		return this.flsdQadd01;
	}

	public void setFlsdQadd01(Double flsdQadd01) {
		this.flsdQadd01 = flsdQadd01;
	}

	public Double getFlsdQadd02() {
		return this.flsdQadd02;
	}

	public void setFlsdQadd02(Double flsdQadd02) {
		this.flsdQadd02 = flsdQadd02;
	}

	public Integer getFlsdQadi01() {
		return this.flsdQadi01;
	}

	public void setFlsdQadi01(Integer flsdQadi01) {
		this.flsdQadi01 = flsdQadi01;
	}

	public Integer getFlsdQadi02() {
		return this.flsdQadi02;
	}

	public void setFlsdQadi02(Integer flsdQadi02) {
		this.flsdQadi02 = flsdQadi02;
	}

	public Boolean getFlsdQadl01() {
		return this.flsdQadl01;
	}

	public void setFlsdQadl01(Boolean flsdQadl01) {
		this.flsdQadl01 = flsdQadl01;
	}

	public Boolean getFlsdQadl02() {
		return this.flsdQadl02;
	}

	public void setFlsdQadl02(Boolean flsdQadl02) {
		this.flsdQadl02 = flsdQadl02;
	}

	public Date getFlsdQadt01() {
		return this.flsdQadt01;
	}

	public void setFlsdQadt01(Date flsdQadt01) {
		this.flsdQadt01 = flsdQadt01;
	}

	public Date getFlsdQadt02() {
		return this.flsdQadt02;
	}

	public void setFlsdQadt02(Date flsdQadt02) {
		this.flsdQadt02 = flsdQadt02;
	}

	public Integer getFlsdShift() {
		return this.flsdShift;
	}

	public void setFlsdShift(Integer flsdShift) {
		this.flsdShift = flsdShift;
	}

	public Double getFlsdKnpdKeyid() {
		return this.flsdKnpdKeyid;
	}

	public void setFlsdKnpdKeyid(Double flsdKnpdKeyid) {
		this.flsdKnpdKeyid = flsdKnpdKeyid;
	}

	public Double getOidFlsdDet() {
		return this.oidFlsdDet;
	}

	public void setOidFlsdDet(Double oidFlsdDet) {
		this.oidFlsdDet = oidFlsdDet;
	}

}