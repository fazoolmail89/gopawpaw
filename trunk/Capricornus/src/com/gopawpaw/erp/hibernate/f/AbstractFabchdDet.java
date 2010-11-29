package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFabchdDet entity provides the base persistence definition of the
 * FabchdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFabchdDet implements java.io.Serializable {

	// Fields

	private FabchdDetId id;
	private String fabchdDesc;
	private String fabchdFaclsId;
	private String fabchdFalocId;
	private Double fabchdPuramt;
	private Date fabchdStartdt;
	private String fabchdInsCo;
	private Date fabchdInsDate;
	private Double fabchdSalvamt;
	private String fabchdInsNbr;
	private Double fabchdInsamt;
	private Integer fabchdUplife;
	private Integer fabchdUpper;
	private String fabchdUm;
	private Integer fabchdQty;
	private String fabchdUser1;
	private String fabchdUser2;
	private String fabchdModUser;
	private Date fabchdModDate;
	private String fabchdChr01;
	private Double fabchdDec01;
	private Boolean fabchdLog01;
	private Date fabchdDte01;
	private Integer fabchdInt01;
	private String fabchdQadc01;
	private Double fabchdQadd01;
	private Boolean fabchdQadl01;
	private Integer fabchdQadi01;
	private Date fabchdQadt01;
	private Double oidFabchdDet;

	// Constructors

	/** default constructor */
	public AbstractFabchdDet() {
	}

	/** minimal constructor */
	public AbstractFabchdDet(FabchdDetId id, String fabchdDesc,
			String fabchdFaclsId, String fabchdFalocId, Double fabchdPuramt,
			Date fabchdStartdt, String fabchdInsCo, Double fabchdSalvamt,
			String fabchdInsNbr, Double fabchdInsamt, Integer fabchdUplife,
			Integer fabchdUpper, String fabchdUm, Integer fabchdQty,
			String fabchdUser1, String fabchdUser2, String fabchdModUser,
			Date fabchdModDate, String fabchdChr01, Double fabchdDec01,
			Boolean fabchdLog01, Integer fabchdInt01, String fabchdQadc01,
			Double fabchdQadd01, Boolean fabchdQadl01, Integer fabchdQadi01,
			Double oidFabchdDet) {
		this.id = id;
		this.fabchdDesc = fabchdDesc;
		this.fabchdFaclsId = fabchdFaclsId;
		this.fabchdFalocId = fabchdFalocId;
		this.fabchdPuramt = fabchdPuramt;
		this.fabchdStartdt = fabchdStartdt;
		this.fabchdInsCo = fabchdInsCo;
		this.fabchdSalvamt = fabchdSalvamt;
		this.fabchdInsNbr = fabchdInsNbr;
		this.fabchdInsamt = fabchdInsamt;
		this.fabchdUplife = fabchdUplife;
		this.fabchdUpper = fabchdUpper;
		this.fabchdUm = fabchdUm;
		this.fabchdQty = fabchdQty;
		this.fabchdUser1 = fabchdUser1;
		this.fabchdUser2 = fabchdUser2;
		this.fabchdModUser = fabchdModUser;
		this.fabchdModDate = fabchdModDate;
		this.fabchdChr01 = fabchdChr01;
		this.fabchdDec01 = fabchdDec01;
		this.fabchdLog01 = fabchdLog01;
		this.fabchdInt01 = fabchdInt01;
		this.fabchdQadc01 = fabchdQadc01;
		this.fabchdQadd01 = fabchdQadd01;
		this.fabchdQadl01 = fabchdQadl01;
		this.fabchdQadi01 = fabchdQadi01;
		this.oidFabchdDet = oidFabchdDet;
	}

	/** full constructor */
	public AbstractFabchdDet(FabchdDetId id, String fabchdDesc,
			String fabchdFaclsId, String fabchdFalocId, Double fabchdPuramt,
			Date fabchdStartdt, String fabchdInsCo, Date fabchdInsDate,
			Double fabchdSalvamt, String fabchdInsNbr, Double fabchdInsamt,
			Integer fabchdUplife, Integer fabchdUpper, String fabchdUm,
			Integer fabchdQty, String fabchdUser1, String fabchdUser2,
			String fabchdModUser, Date fabchdModDate, String fabchdChr01,
			Double fabchdDec01, Boolean fabchdLog01, Date fabchdDte01,
			Integer fabchdInt01, String fabchdQadc01, Double fabchdQadd01,
			Boolean fabchdQadl01, Integer fabchdQadi01, Date fabchdQadt01,
			Double oidFabchdDet) {
		this.id = id;
		this.fabchdDesc = fabchdDesc;
		this.fabchdFaclsId = fabchdFaclsId;
		this.fabchdFalocId = fabchdFalocId;
		this.fabchdPuramt = fabchdPuramt;
		this.fabchdStartdt = fabchdStartdt;
		this.fabchdInsCo = fabchdInsCo;
		this.fabchdInsDate = fabchdInsDate;
		this.fabchdSalvamt = fabchdSalvamt;
		this.fabchdInsNbr = fabchdInsNbr;
		this.fabchdInsamt = fabchdInsamt;
		this.fabchdUplife = fabchdUplife;
		this.fabchdUpper = fabchdUpper;
		this.fabchdUm = fabchdUm;
		this.fabchdQty = fabchdQty;
		this.fabchdUser1 = fabchdUser1;
		this.fabchdUser2 = fabchdUser2;
		this.fabchdModUser = fabchdModUser;
		this.fabchdModDate = fabchdModDate;
		this.fabchdChr01 = fabchdChr01;
		this.fabchdDec01 = fabchdDec01;
		this.fabchdLog01 = fabchdLog01;
		this.fabchdDte01 = fabchdDte01;
		this.fabchdInt01 = fabchdInt01;
		this.fabchdQadc01 = fabchdQadc01;
		this.fabchdQadd01 = fabchdQadd01;
		this.fabchdQadl01 = fabchdQadl01;
		this.fabchdQadi01 = fabchdQadi01;
		this.fabchdQadt01 = fabchdQadt01;
		this.oidFabchdDet = oidFabchdDet;
	}

	// Property accessors

	public FabchdDetId getId() {
		return this.id;
	}

	public void setId(FabchdDetId id) {
		this.id = id;
	}

	public String getFabchdDesc() {
		return this.fabchdDesc;
	}

	public void setFabchdDesc(String fabchdDesc) {
		this.fabchdDesc = fabchdDesc;
	}

	public String getFabchdFaclsId() {
		return this.fabchdFaclsId;
	}

	public void setFabchdFaclsId(String fabchdFaclsId) {
		this.fabchdFaclsId = fabchdFaclsId;
	}

	public String getFabchdFalocId() {
		return this.fabchdFalocId;
	}

	public void setFabchdFalocId(String fabchdFalocId) {
		this.fabchdFalocId = fabchdFalocId;
	}

	public Double getFabchdPuramt() {
		return this.fabchdPuramt;
	}

	public void setFabchdPuramt(Double fabchdPuramt) {
		this.fabchdPuramt = fabchdPuramt;
	}

	public Date getFabchdStartdt() {
		return this.fabchdStartdt;
	}

	public void setFabchdStartdt(Date fabchdStartdt) {
		this.fabchdStartdt = fabchdStartdt;
	}

	public String getFabchdInsCo() {
		return this.fabchdInsCo;
	}

	public void setFabchdInsCo(String fabchdInsCo) {
		this.fabchdInsCo = fabchdInsCo;
	}

	public Date getFabchdInsDate() {
		return this.fabchdInsDate;
	}

	public void setFabchdInsDate(Date fabchdInsDate) {
		this.fabchdInsDate = fabchdInsDate;
	}

	public Double getFabchdSalvamt() {
		return this.fabchdSalvamt;
	}

	public void setFabchdSalvamt(Double fabchdSalvamt) {
		this.fabchdSalvamt = fabchdSalvamt;
	}

	public String getFabchdInsNbr() {
		return this.fabchdInsNbr;
	}

	public void setFabchdInsNbr(String fabchdInsNbr) {
		this.fabchdInsNbr = fabchdInsNbr;
	}

	public Double getFabchdInsamt() {
		return this.fabchdInsamt;
	}

	public void setFabchdInsamt(Double fabchdInsamt) {
		this.fabchdInsamt = fabchdInsamt;
	}

	public Integer getFabchdUplife() {
		return this.fabchdUplife;
	}

	public void setFabchdUplife(Integer fabchdUplife) {
		this.fabchdUplife = fabchdUplife;
	}

	public Integer getFabchdUpper() {
		return this.fabchdUpper;
	}

	public void setFabchdUpper(Integer fabchdUpper) {
		this.fabchdUpper = fabchdUpper;
	}

	public String getFabchdUm() {
		return this.fabchdUm;
	}

	public void setFabchdUm(String fabchdUm) {
		this.fabchdUm = fabchdUm;
	}

	public Integer getFabchdQty() {
		return this.fabchdQty;
	}

	public void setFabchdQty(Integer fabchdQty) {
		this.fabchdQty = fabchdQty;
	}

	public String getFabchdUser1() {
		return this.fabchdUser1;
	}

	public void setFabchdUser1(String fabchdUser1) {
		this.fabchdUser1 = fabchdUser1;
	}

	public String getFabchdUser2() {
		return this.fabchdUser2;
	}

	public void setFabchdUser2(String fabchdUser2) {
		this.fabchdUser2 = fabchdUser2;
	}

	public String getFabchdModUser() {
		return this.fabchdModUser;
	}

	public void setFabchdModUser(String fabchdModUser) {
		this.fabchdModUser = fabchdModUser;
	}

	public Date getFabchdModDate() {
		return this.fabchdModDate;
	}

	public void setFabchdModDate(Date fabchdModDate) {
		this.fabchdModDate = fabchdModDate;
	}

	public String getFabchdChr01() {
		return this.fabchdChr01;
	}

	public void setFabchdChr01(String fabchdChr01) {
		this.fabchdChr01 = fabchdChr01;
	}

	public Double getFabchdDec01() {
		return this.fabchdDec01;
	}

	public void setFabchdDec01(Double fabchdDec01) {
		this.fabchdDec01 = fabchdDec01;
	}

	public Boolean getFabchdLog01() {
		return this.fabchdLog01;
	}

	public void setFabchdLog01(Boolean fabchdLog01) {
		this.fabchdLog01 = fabchdLog01;
	}

	public Date getFabchdDte01() {
		return this.fabchdDte01;
	}

	public void setFabchdDte01(Date fabchdDte01) {
		this.fabchdDte01 = fabchdDte01;
	}

	public Integer getFabchdInt01() {
		return this.fabchdInt01;
	}

	public void setFabchdInt01(Integer fabchdInt01) {
		this.fabchdInt01 = fabchdInt01;
	}

	public String getFabchdQadc01() {
		return this.fabchdQadc01;
	}

	public void setFabchdQadc01(String fabchdQadc01) {
		this.fabchdQadc01 = fabchdQadc01;
	}

	public Double getFabchdQadd01() {
		return this.fabchdQadd01;
	}

	public void setFabchdQadd01(Double fabchdQadd01) {
		this.fabchdQadd01 = fabchdQadd01;
	}

	public Boolean getFabchdQadl01() {
		return this.fabchdQadl01;
	}

	public void setFabchdQadl01(Boolean fabchdQadl01) {
		this.fabchdQadl01 = fabchdQadl01;
	}

	public Integer getFabchdQadi01() {
		return this.fabchdQadi01;
	}

	public void setFabchdQadi01(Integer fabchdQadi01) {
		this.fabchdQadi01 = fabchdQadi01;
	}

	public Date getFabchdQadt01() {
		return this.fabchdQadt01;
	}

	public void setFabchdQadt01(Date fabchdQadt01) {
		this.fabchdQadt01 = fabchdQadt01;
	}

	public Double getOidFabchdDet() {
		return this.oidFabchdDet;
	}

	public void setOidFabchdDet(Double oidFabchdDet) {
		this.oidFabchdDet = oidFabchdDet;
	}

}