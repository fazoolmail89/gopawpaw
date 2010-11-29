package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCaqMstr entity provides the base persistence definition of the
 * CaqMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCaqMstr implements java.io.Serializable {

	// Fields

	private CaqMstrId id;
	private String caqDesc;
	private String caqArea;
	private String caqNode;
	private String caqChr01;
	private String caqChr02;
	private String caqChr03;
	private Boolean caqLog01;
	private Boolean caqLog02;
	private Date caqDte01;
	private Date caqDte02;
	private Double caqDec01;
	private Double caqDec02;
	private String caqUser1;
	private String caqUser2;
	private Boolean caq3rdParty;
	private Boolean caqAreaPri;
	private Boolean caqAreaSc;
	private Boolean caqCreateBom;
	private Boolean caqCreateRte;
	private Boolean caqCreateWo;
	private String caqDefaultRte;
	private Boolean caqField;
	private Boolean caqProbPri;
	private Boolean caqDepot;
	private Double oidCaqMstr;

	// Constructors

	/** default constructor */
	public AbstractCaqMstr() {
	}

	/** minimal constructor */
	public AbstractCaqMstr(CaqMstrId id, Boolean caq3rdParty,
			Boolean caqAreaPri, Boolean caqAreaSc, Boolean caqCreateBom,
			Boolean caqCreateRte, Boolean caqCreateWo, String caqDefaultRte,
			Boolean caqField, Boolean caqProbPri, Double oidCaqMstr) {
		this.id = id;
		this.caq3rdParty = caq3rdParty;
		this.caqAreaPri = caqAreaPri;
		this.caqAreaSc = caqAreaSc;
		this.caqCreateBom = caqCreateBom;
		this.caqCreateRte = caqCreateRte;
		this.caqCreateWo = caqCreateWo;
		this.caqDefaultRte = caqDefaultRte;
		this.caqField = caqField;
		this.caqProbPri = caqProbPri;
		this.oidCaqMstr = oidCaqMstr;
	}

	/** full constructor */
	public AbstractCaqMstr(CaqMstrId id, String caqDesc, String caqArea,
			String caqNode, String caqChr01, String caqChr02, String caqChr03,
			Boolean caqLog01, Boolean caqLog02, Date caqDte01, Date caqDte02,
			Double caqDec01, Double caqDec02, String caqUser1, String caqUser2,
			Boolean caq3rdParty, Boolean caqAreaPri, Boolean caqAreaSc,
			Boolean caqCreateBom, Boolean caqCreateRte, Boolean caqCreateWo,
			String caqDefaultRte, Boolean caqField, Boolean caqProbPri,
			Boolean caqDepot, Double oidCaqMstr) {
		this.id = id;
		this.caqDesc = caqDesc;
		this.caqArea = caqArea;
		this.caqNode = caqNode;
		this.caqChr01 = caqChr01;
		this.caqChr02 = caqChr02;
		this.caqChr03 = caqChr03;
		this.caqLog01 = caqLog01;
		this.caqLog02 = caqLog02;
		this.caqDte01 = caqDte01;
		this.caqDte02 = caqDte02;
		this.caqDec01 = caqDec01;
		this.caqDec02 = caqDec02;
		this.caqUser1 = caqUser1;
		this.caqUser2 = caqUser2;
		this.caq3rdParty = caq3rdParty;
		this.caqAreaPri = caqAreaPri;
		this.caqAreaSc = caqAreaSc;
		this.caqCreateBom = caqCreateBom;
		this.caqCreateRte = caqCreateRte;
		this.caqCreateWo = caqCreateWo;
		this.caqDefaultRte = caqDefaultRte;
		this.caqField = caqField;
		this.caqProbPri = caqProbPri;
		this.caqDepot = caqDepot;
		this.oidCaqMstr = oidCaqMstr;
	}

	// Property accessors

	public CaqMstrId getId() {
		return this.id;
	}

	public void setId(CaqMstrId id) {
		this.id = id;
	}

	public String getCaqDesc() {
		return this.caqDesc;
	}

	public void setCaqDesc(String caqDesc) {
		this.caqDesc = caqDesc;
	}

	public String getCaqArea() {
		return this.caqArea;
	}

	public void setCaqArea(String caqArea) {
		this.caqArea = caqArea;
	}

	public String getCaqNode() {
		return this.caqNode;
	}

	public void setCaqNode(String caqNode) {
		this.caqNode = caqNode;
	}

	public String getCaqChr01() {
		return this.caqChr01;
	}

	public void setCaqChr01(String caqChr01) {
		this.caqChr01 = caqChr01;
	}

	public String getCaqChr02() {
		return this.caqChr02;
	}

	public void setCaqChr02(String caqChr02) {
		this.caqChr02 = caqChr02;
	}

	public String getCaqChr03() {
		return this.caqChr03;
	}

	public void setCaqChr03(String caqChr03) {
		this.caqChr03 = caqChr03;
	}

	public Boolean getCaqLog01() {
		return this.caqLog01;
	}

	public void setCaqLog01(Boolean caqLog01) {
		this.caqLog01 = caqLog01;
	}

	public Boolean getCaqLog02() {
		return this.caqLog02;
	}

	public void setCaqLog02(Boolean caqLog02) {
		this.caqLog02 = caqLog02;
	}

	public Date getCaqDte01() {
		return this.caqDte01;
	}

	public void setCaqDte01(Date caqDte01) {
		this.caqDte01 = caqDte01;
	}

	public Date getCaqDte02() {
		return this.caqDte02;
	}

	public void setCaqDte02(Date caqDte02) {
		this.caqDte02 = caqDte02;
	}

	public Double getCaqDec01() {
		return this.caqDec01;
	}

	public void setCaqDec01(Double caqDec01) {
		this.caqDec01 = caqDec01;
	}

	public Double getCaqDec02() {
		return this.caqDec02;
	}

	public void setCaqDec02(Double caqDec02) {
		this.caqDec02 = caqDec02;
	}

	public String getCaqUser1() {
		return this.caqUser1;
	}

	public void setCaqUser1(String caqUser1) {
		this.caqUser1 = caqUser1;
	}

	public String getCaqUser2() {
		return this.caqUser2;
	}

	public void setCaqUser2(String caqUser2) {
		this.caqUser2 = caqUser2;
	}

	public Boolean getCaq3rdParty() {
		return this.caq3rdParty;
	}

	public void setCaq3rdParty(Boolean caq3rdParty) {
		this.caq3rdParty = caq3rdParty;
	}

	public Boolean getCaqAreaPri() {
		return this.caqAreaPri;
	}

	public void setCaqAreaPri(Boolean caqAreaPri) {
		this.caqAreaPri = caqAreaPri;
	}

	public Boolean getCaqAreaSc() {
		return this.caqAreaSc;
	}

	public void setCaqAreaSc(Boolean caqAreaSc) {
		this.caqAreaSc = caqAreaSc;
	}

	public Boolean getCaqCreateBom() {
		return this.caqCreateBom;
	}

	public void setCaqCreateBom(Boolean caqCreateBom) {
		this.caqCreateBom = caqCreateBom;
	}

	public Boolean getCaqCreateRte() {
		return this.caqCreateRte;
	}

	public void setCaqCreateRte(Boolean caqCreateRte) {
		this.caqCreateRte = caqCreateRte;
	}

	public Boolean getCaqCreateWo() {
		return this.caqCreateWo;
	}

	public void setCaqCreateWo(Boolean caqCreateWo) {
		this.caqCreateWo = caqCreateWo;
	}

	public String getCaqDefaultRte() {
		return this.caqDefaultRte;
	}

	public void setCaqDefaultRte(String caqDefaultRte) {
		this.caqDefaultRte = caqDefaultRte;
	}

	public Boolean getCaqField() {
		return this.caqField;
	}

	public void setCaqField(Boolean caqField) {
		this.caqField = caqField;
	}

	public Boolean getCaqProbPri() {
		return this.caqProbPri;
	}

	public void setCaqProbPri(Boolean caqProbPri) {
		this.caqProbPri = caqProbPri;
	}

	public Boolean getCaqDepot() {
		return this.caqDepot;
	}

	public void setCaqDepot(Boolean caqDepot) {
		this.caqDepot = caqDepot;
	}

	public Double getOidCaqMstr() {
		return this.oidCaqMstr;
	}

	public void setOidCaqMstr(Double oidCaqMstr) {
		this.oidCaqMstr = oidCaqMstr;
	}

}