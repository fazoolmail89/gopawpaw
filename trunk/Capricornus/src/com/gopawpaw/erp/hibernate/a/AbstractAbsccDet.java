package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAbsccDet entity provides the base persistence definition of the
 * AbsccDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAbsccDet implements java.io.Serializable {

	// Fields

	private AbsccDetId id;
	private String absccOrder;
	private Integer absccOrdLine;
	private String absccContainer;
	private Double absccQty;
	private Double absccContPrice;
	private String absccInvNbr;
	private String absccChargeType;
	private String absccRef;
	private String absccShipto;
	private Date absccShpDate;
	private Boolean absccConfirmed;
	private Boolean absccInvPost;
	private String absccFrClass;
	private Double absccShipWt;
	private String absccShipWtUm;
	private String absccSlsAcct;
	private String absccSlsCc;
	private String absccTaxc;
	private Boolean absccTaxable;
	private String absccSlsSub;
	private String absccProject;
	private String absccModUserid;
	private Date absccModDate;
	private String absccUserc01;
	private String absccUserc02;
	private String absccQadc01;
	private String absccQadc02;
	private Double oidAbsccDet;

	// Constructors

	/** default constructor */
	public AbstractAbsccDet() {
	}

	/** minimal constructor */
	public AbstractAbsccDet(AbsccDetId id, String absccOrder,
			Integer absccOrdLine, String absccContainer, Double absccQty,
			Double absccContPrice, String absccInvNbr, String absccChargeType,
			String absccRef, String absccShipto, Date absccShpDate,
			Boolean absccConfirmed, Boolean absccInvPost, String absccFrClass,
			Double absccShipWt, String absccShipWtUm, String absccSlsAcct,
			String absccSlsCc, String absccTaxc, Boolean absccTaxable,
			String absccSlsSub, String absccProject, String absccModUserid,
			String absccUserc01, String absccUserc02, String absccQadc01,
			String absccQadc02, Double oidAbsccDet) {
		this.id = id;
		this.absccOrder = absccOrder;
		this.absccOrdLine = absccOrdLine;
		this.absccContainer = absccContainer;
		this.absccQty = absccQty;
		this.absccContPrice = absccContPrice;
		this.absccInvNbr = absccInvNbr;
		this.absccChargeType = absccChargeType;
		this.absccRef = absccRef;
		this.absccShipto = absccShipto;
		this.absccShpDate = absccShpDate;
		this.absccConfirmed = absccConfirmed;
		this.absccInvPost = absccInvPost;
		this.absccFrClass = absccFrClass;
		this.absccShipWt = absccShipWt;
		this.absccShipWtUm = absccShipWtUm;
		this.absccSlsAcct = absccSlsAcct;
		this.absccSlsCc = absccSlsCc;
		this.absccTaxc = absccTaxc;
		this.absccTaxable = absccTaxable;
		this.absccSlsSub = absccSlsSub;
		this.absccProject = absccProject;
		this.absccModUserid = absccModUserid;
		this.absccUserc01 = absccUserc01;
		this.absccUserc02 = absccUserc02;
		this.absccQadc01 = absccQadc01;
		this.absccQadc02 = absccQadc02;
		this.oidAbsccDet = oidAbsccDet;
	}

	/** full constructor */
	public AbstractAbsccDet(AbsccDetId id, String absccOrder,
			Integer absccOrdLine, String absccContainer, Double absccQty,
			Double absccContPrice, String absccInvNbr, String absccChargeType,
			String absccRef, String absccShipto, Date absccShpDate,
			Boolean absccConfirmed, Boolean absccInvPost, String absccFrClass,
			Double absccShipWt, String absccShipWtUm, String absccSlsAcct,
			String absccSlsCc, String absccTaxc, Boolean absccTaxable,
			String absccSlsSub, String absccProject, String absccModUserid,
			Date absccModDate, String absccUserc01, String absccUserc02,
			String absccQadc01, String absccQadc02, Double oidAbsccDet) {
		this.id = id;
		this.absccOrder = absccOrder;
		this.absccOrdLine = absccOrdLine;
		this.absccContainer = absccContainer;
		this.absccQty = absccQty;
		this.absccContPrice = absccContPrice;
		this.absccInvNbr = absccInvNbr;
		this.absccChargeType = absccChargeType;
		this.absccRef = absccRef;
		this.absccShipto = absccShipto;
		this.absccShpDate = absccShpDate;
		this.absccConfirmed = absccConfirmed;
		this.absccInvPost = absccInvPost;
		this.absccFrClass = absccFrClass;
		this.absccShipWt = absccShipWt;
		this.absccShipWtUm = absccShipWtUm;
		this.absccSlsAcct = absccSlsAcct;
		this.absccSlsCc = absccSlsCc;
		this.absccTaxc = absccTaxc;
		this.absccTaxable = absccTaxable;
		this.absccSlsSub = absccSlsSub;
		this.absccProject = absccProject;
		this.absccModUserid = absccModUserid;
		this.absccModDate = absccModDate;
		this.absccUserc01 = absccUserc01;
		this.absccUserc02 = absccUserc02;
		this.absccQadc01 = absccQadc01;
		this.absccQadc02 = absccQadc02;
		this.oidAbsccDet = oidAbsccDet;
	}

	// Property accessors

	public AbsccDetId getId() {
		return this.id;
	}

	public void setId(AbsccDetId id) {
		this.id = id;
	}

	public String getAbsccOrder() {
		return this.absccOrder;
	}

	public void setAbsccOrder(String absccOrder) {
		this.absccOrder = absccOrder;
	}

	public Integer getAbsccOrdLine() {
		return this.absccOrdLine;
	}

	public void setAbsccOrdLine(Integer absccOrdLine) {
		this.absccOrdLine = absccOrdLine;
	}

	public String getAbsccContainer() {
		return this.absccContainer;
	}

	public void setAbsccContainer(String absccContainer) {
		this.absccContainer = absccContainer;
	}

	public Double getAbsccQty() {
		return this.absccQty;
	}

	public void setAbsccQty(Double absccQty) {
		this.absccQty = absccQty;
	}

	public Double getAbsccContPrice() {
		return this.absccContPrice;
	}

	public void setAbsccContPrice(Double absccContPrice) {
		this.absccContPrice = absccContPrice;
	}

	public String getAbsccInvNbr() {
		return this.absccInvNbr;
	}

	public void setAbsccInvNbr(String absccInvNbr) {
		this.absccInvNbr = absccInvNbr;
	}

	public String getAbsccChargeType() {
		return this.absccChargeType;
	}

	public void setAbsccChargeType(String absccChargeType) {
		this.absccChargeType = absccChargeType;
	}

	public String getAbsccRef() {
		return this.absccRef;
	}

	public void setAbsccRef(String absccRef) {
		this.absccRef = absccRef;
	}

	public String getAbsccShipto() {
		return this.absccShipto;
	}

	public void setAbsccShipto(String absccShipto) {
		this.absccShipto = absccShipto;
	}

	public Date getAbsccShpDate() {
		return this.absccShpDate;
	}

	public void setAbsccShpDate(Date absccShpDate) {
		this.absccShpDate = absccShpDate;
	}

	public Boolean getAbsccConfirmed() {
		return this.absccConfirmed;
	}

	public void setAbsccConfirmed(Boolean absccConfirmed) {
		this.absccConfirmed = absccConfirmed;
	}

	public Boolean getAbsccInvPost() {
		return this.absccInvPost;
	}

	public void setAbsccInvPost(Boolean absccInvPost) {
		this.absccInvPost = absccInvPost;
	}

	public String getAbsccFrClass() {
		return this.absccFrClass;
	}

	public void setAbsccFrClass(String absccFrClass) {
		this.absccFrClass = absccFrClass;
	}

	public Double getAbsccShipWt() {
		return this.absccShipWt;
	}

	public void setAbsccShipWt(Double absccShipWt) {
		this.absccShipWt = absccShipWt;
	}

	public String getAbsccShipWtUm() {
		return this.absccShipWtUm;
	}

	public void setAbsccShipWtUm(String absccShipWtUm) {
		this.absccShipWtUm = absccShipWtUm;
	}

	public String getAbsccSlsAcct() {
		return this.absccSlsAcct;
	}

	public void setAbsccSlsAcct(String absccSlsAcct) {
		this.absccSlsAcct = absccSlsAcct;
	}

	public String getAbsccSlsCc() {
		return this.absccSlsCc;
	}

	public void setAbsccSlsCc(String absccSlsCc) {
		this.absccSlsCc = absccSlsCc;
	}

	public String getAbsccTaxc() {
		return this.absccTaxc;
	}

	public void setAbsccTaxc(String absccTaxc) {
		this.absccTaxc = absccTaxc;
	}

	public Boolean getAbsccTaxable() {
		return this.absccTaxable;
	}

	public void setAbsccTaxable(Boolean absccTaxable) {
		this.absccTaxable = absccTaxable;
	}

	public String getAbsccSlsSub() {
		return this.absccSlsSub;
	}

	public void setAbsccSlsSub(String absccSlsSub) {
		this.absccSlsSub = absccSlsSub;
	}

	public String getAbsccProject() {
		return this.absccProject;
	}

	public void setAbsccProject(String absccProject) {
		this.absccProject = absccProject;
	}

	public String getAbsccModUserid() {
		return this.absccModUserid;
	}

	public void setAbsccModUserid(String absccModUserid) {
		this.absccModUserid = absccModUserid;
	}

	public Date getAbsccModDate() {
		return this.absccModDate;
	}

	public void setAbsccModDate(Date absccModDate) {
		this.absccModDate = absccModDate;
	}

	public String getAbsccUserc01() {
		return this.absccUserc01;
	}

	public void setAbsccUserc01(String absccUserc01) {
		this.absccUserc01 = absccUserc01;
	}

	public String getAbsccUserc02() {
		return this.absccUserc02;
	}

	public void setAbsccUserc02(String absccUserc02) {
		this.absccUserc02 = absccUserc02;
	}

	public String getAbsccQadc01() {
		return this.absccQadc01;
	}

	public void setAbsccQadc01(String absccQadc01) {
		this.absccQadc01 = absccQadc01;
	}

	public String getAbsccQadc02() {
		return this.absccQadc02;
	}

	public void setAbsccQadc02(String absccQadc02) {
		this.absccQadc02 = absccQadc02;
	}

	public Double getOidAbsccDet() {
		return this.oidAbsccDet;
	}

	public void setOidAbsccDet(Double oidAbsccDet) {
		this.oidAbsccDet = oidAbsccDet;
	}

}