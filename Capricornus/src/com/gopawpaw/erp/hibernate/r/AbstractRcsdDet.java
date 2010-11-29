package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRcsdDet entity provides the base persistence definition of the
 * RcsdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRcsdDet implements java.io.Serializable {

	// Fields

	private RcsdDetId id;
	private String rcsdCustPart;
	private Double rcsdDiscrQty;
	private Double rcsdCumQty;
	private String rcsdOrder;
	private Integer rcsdLine;
	private String rcsdStatus;
	private Date rcsdCustBuildDate;
	private String rcsdDerivedRlseId;
	private String rcsdCustPo;
	private Boolean rcsdPicked;
	private Boolean rcsdXReferenced;
	private Boolean rcsdDeleted;
	private String rcsdModUserid;
	private Date rcsdModDate;
	private String rcsdModPgm;
	private String rcsdUser1;
	private String rcsdUser2;
	private String rcsdQadc01;
	private String rcsdQadc02;
	private Double rcsdQadd01;
	private Double rcsdQadd02;
	private Integer rcsdQadi01;
	private Integer rcsdQadi02;
	private Boolean rcsdQadl01;
	private Boolean rcsdQadl02;
	private Date rcsdQadt01;
	private Date rcsdQadt02;
	private String rcsdModelyr;
	private String rcsdCustref;
	private Double oidRcsdDet;

	// Constructors

	/** default constructor */
	public AbstractRcsdDet() {
	}

	/** minimal constructor */
	public AbstractRcsdDet(RcsdDetId id, String rcsdModelyr,
			String rcsdCustref, Double oidRcsdDet) {
		this.id = id;
		this.rcsdModelyr = rcsdModelyr;
		this.rcsdCustref = rcsdCustref;
		this.oidRcsdDet = oidRcsdDet;
	}

	/** full constructor */
	public AbstractRcsdDet(RcsdDetId id, String rcsdCustPart,
			Double rcsdDiscrQty, Double rcsdCumQty, String rcsdOrder,
			Integer rcsdLine, String rcsdStatus, Date rcsdCustBuildDate,
			String rcsdDerivedRlseId, String rcsdCustPo, Boolean rcsdPicked,
			Boolean rcsdXReferenced, Boolean rcsdDeleted, String rcsdModUserid,
			Date rcsdModDate, String rcsdModPgm, String rcsdUser1,
			String rcsdUser2, String rcsdQadc01, String rcsdQadc02,
			Double rcsdQadd01, Double rcsdQadd02, Integer rcsdQadi01,
			Integer rcsdQadi02, Boolean rcsdQadl01, Boolean rcsdQadl02,
			Date rcsdQadt01, Date rcsdQadt02, String rcsdModelyr,
			String rcsdCustref, Double oidRcsdDet) {
		this.id = id;
		this.rcsdCustPart = rcsdCustPart;
		this.rcsdDiscrQty = rcsdDiscrQty;
		this.rcsdCumQty = rcsdCumQty;
		this.rcsdOrder = rcsdOrder;
		this.rcsdLine = rcsdLine;
		this.rcsdStatus = rcsdStatus;
		this.rcsdCustBuildDate = rcsdCustBuildDate;
		this.rcsdDerivedRlseId = rcsdDerivedRlseId;
		this.rcsdCustPo = rcsdCustPo;
		this.rcsdPicked = rcsdPicked;
		this.rcsdXReferenced = rcsdXReferenced;
		this.rcsdDeleted = rcsdDeleted;
		this.rcsdModUserid = rcsdModUserid;
		this.rcsdModDate = rcsdModDate;
		this.rcsdModPgm = rcsdModPgm;
		this.rcsdUser1 = rcsdUser1;
		this.rcsdUser2 = rcsdUser2;
		this.rcsdQadc01 = rcsdQadc01;
		this.rcsdQadc02 = rcsdQadc02;
		this.rcsdQadd01 = rcsdQadd01;
		this.rcsdQadd02 = rcsdQadd02;
		this.rcsdQadi01 = rcsdQadi01;
		this.rcsdQadi02 = rcsdQadi02;
		this.rcsdQadl01 = rcsdQadl01;
		this.rcsdQadl02 = rcsdQadl02;
		this.rcsdQadt01 = rcsdQadt01;
		this.rcsdQadt02 = rcsdQadt02;
		this.rcsdModelyr = rcsdModelyr;
		this.rcsdCustref = rcsdCustref;
		this.oidRcsdDet = oidRcsdDet;
	}

	// Property accessors

	public RcsdDetId getId() {
		return this.id;
	}

	public void setId(RcsdDetId id) {
		this.id = id;
	}

	public String getRcsdCustPart() {
		return this.rcsdCustPart;
	}

	public void setRcsdCustPart(String rcsdCustPart) {
		this.rcsdCustPart = rcsdCustPart;
	}

	public Double getRcsdDiscrQty() {
		return this.rcsdDiscrQty;
	}

	public void setRcsdDiscrQty(Double rcsdDiscrQty) {
		this.rcsdDiscrQty = rcsdDiscrQty;
	}

	public Double getRcsdCumQty() {
		return this.rcsdCumQty;
	}

	public void setRcsdCumQty(Double rcsdCumQty) {
		this.rcsdCumQty = rcsdCumQty;
	}

	public String getRcsdOrder() {
		return this.rcsdOrder;
	}

	public void setRcsdOrder(String rcsdOrder) {
		this.rcsdOrder = rcsdOrder;
	}

	public Integer getRcsdLine() {
		return this.rcsdLine;
	}

	public void setRcsdLine(Integer rcsdLine) {
		this.rcsdLine = rcsdLine;
	}

	public String getRcsdStatus() {
		return this.rcsdStatus;
	}

	public void setRcsdStatus(String rcsdStatus) {
		this.rcsdStatus = rcsdStatus;
	}

	public Date getRcsdCustBuildDate() {
		return this.rcsdCustBuildDate;
	}

	public void setRcsdCustBuildDate(Date rcsdCustBuildDate) {
		this.rcsdCustBuildDate = rcsdCustBuildDate;
	}

	public String getRcsdDerivedRlseId() {
		return this.rcsdDerivedRlseId;
	}

	public void setRcsdDerivedRlseId(String rcsdDerivedRlseId) {
		this.rcsdDerivedRlseId = rcsdDerivedRlseId;
	}

	public String getRcsdCustPo() {
		return this.rcsdCustPo;
	}

	public void setRcsdCustPo(String rcsdCustPo) {
		this.rcsdCustPo = rcsdCustPo;
	}

	public Boolean getRcsdPicked() {
		return this.rcsdPicked;
	}

	public void setRcsdPicked(Boolean rcsdPicked) {
		this.rcsdPicked = rcsdPicked;
	}

	public Boolean getRcsdXReferenced() {
		return this.rcsdXReferenced;
	}

	public void setRcsdXReferenced(Boolean rcsdXReferenced) {
		this.rcsdXReferenced = rcsdXReferenced;
	}

	public Boolean getRcsdDeleted() {
		return this.rcsdDeleted;
	}

	public void setRcsdDeleted(Boolean rcsdDeleted) {
		this.rcsdDeleted = rcsdDeleted;
	}

	public String getRcsdModUserid() {
		return this.rcsdModUserid;
	}

	public void setRcsdModUserid(String rcsdModUserid) {
		this.rcsdModUserid = rcsdModUserid;
	}

	public Date getRcsdModDate() {
		return this.rcsdModDate;
	}

	public void setRcsdModDate(Date rcsdModDate) {
		this.rcsdModDate = rcsdModDate;
	}

	public String getRcsdModPgm() {
		return this.rcsdModPgm;
	}

	public void setRcsdModPgm(String rcsdModPgm) {
		this.rcsdModPgm = rcsdModPgm;
	}

	public String getRcsdUser1() {
		return this.rcsdUser1;
	}

	public void setRcsdUser1(String rcsdUser1) {
		this.rcsdUser1 = rcsdUser1;
	}

	public String getRcsdUser2() {
		return this.rcsdUser2;
	}

	public void setRcsdUser2(String rcsdUser2) {
		this.rcsdUser2 = rcsdUser2;
	}

	public String getRcsdQadc01() {
		return this.rcsdQadc01;
	}

	public void setRcsdQadc01(String rcsdQadc01) {
		this.rcsdQadc01 = rcsdQadc01;
	}

	public String getRcsdQadc02() {
		return this.rcsdQadc02;
	}

	public void setRcsdQadc02(String rcsdQadc02) {
		this.rcsdQadc02 = rcsdQadc02;
	}

	public Double getRcsdQadd01() {
		return this.rcsdQadd01;
	}

	public void setRcsdQadd01(Double rcsdQadd01) {
		this.rcsdQadd01 = rcsdQadd01;
	}

	public Double getRcsdQadd02() {
		return this.rcsdQadd02;
	}

	public void setRcsdQadd02(Double rcsdQadd02) {
		this.rcsdQadd02 = rcsdQadd02;
	}

	public Integer getRcsdQadi01() {
		return this.rcsdQadi01;
	}

	public void setRcsdQadi01(Integer rcsdQadi01) {
		this.rcsdQadi01 = rcsdQadi01;
	}

	public Integer getRcsdQadi02() {
		return this.rcsdQadi02;
	}

	public void setRcsdQadi02(Integer rcsdQadi02) {
		this.rcsdQadi02 = rcsdQadi02;
	}

	public Boolean getRcsdQadl01() {
		return this.rcsdQadl01;
	}

	public void setRcsdQadl01(Boolean rcsdQadl01) {
		this.rcsdQadl01 = rcsdQadl01;
	}

	public Boolean getRcsdQadl02() {
		return this.rcsdQadl02;
	}

	public void setRcsdQadl02(Boolean rcsdQadl02) {
		this.rcsdQadl02 = rcsdQadl02;
	}

	public Date getRcsdQadt01() {
		return this.rcsdQadt01;
	}

	public void setRcsdQadt01(Date rcsdQadt01) {
		this.rcsdQadt01 = rcsdQadt01;
	}

	public Date getRcsdQadt02() {
		return this.rcsdQadt02;
	}

	public void setRcsdQadt02(Date rcsdQadt02) {
		this.rcsdQadt02 = rcsdQadt02;
	}

	public String getRcsdModelyr() {
		return this.rcsdModelyr;
	}

	public void setRcsdModelyr(String rcsdModelyr) {
		this.rcsdModelyr = rcsdModelyr;
	}

	public String getRcsdCustref() {
		return this.rcsdCustref;
	}

	public void setRcsdCustref(String rcsdCustref) {
		this.rcsdCustref = rcsdCustref;
	}

	public Double getOidRcsdDet() {
		return this.oidRcsdDet;
	}

	public void setOidRcsdDet(Double oidRcsdDet) {
		this.oidRcsdDet = oidRcsdDet;
	}

}