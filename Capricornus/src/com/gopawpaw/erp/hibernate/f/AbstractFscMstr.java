package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFscMstr entity provides the base persistence definition of the
 * FscMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFscMstr implements java.io.Serializable {

	// Fields

	private FscMstrId id;
	private Boolean fscConParts;
	private Boolean fscCustomer;
	private Boolean fscCusNonProd;
	private String fscDesc;
	private Boolean fscExgParts;
	private Boolean fscExpense;
	private Integer fscFisColumn;
	private String fscFisSort;
	private Boolean fscLabor;
	private Boolean fscNonProd;
	private Boolean fscOther;
	private Boolean fscParts;
	private Boolean fscSick;
	private Boolean fscTraining;
	private Boolean fscTravelExp;
	private Boolean fscTravelLabor;
	private Boolean fscVacation;
	private String fscChr01;
	private String fscChr02;
	private String fscChr03;
	private String fscChr04;
	private Double fscDec01;
	private Double fscDec02;
	private Double fscDec03;
	private Date fscDte01;
	private Date fscDte02;
	private Date fscDte03;
	private Boolean fscLog01;
	private Boolean fscLog02;
	private Boolean fscLog03;
	private String fscQadc01;
	private String fscQadc02;
	private String fscQadc03;
	private String fscQadc04;
	private Date fscQadd01;
	private Date fscQadd02;
	private Date fscQadd03;
	private Double fscQadde01;
	private Double fscQadde02;
	private Double fscQadde03;
	private Boolean fscQadl01;
	private Boolean fscQadl02;
	private Boolean fscQadl03;
	private String fscUser1;
	private String fscUser2;
	private Double fscLbrRate;
	private Double fscBdnPct;
	private Double fscBdnRate;
	private String fscTaxc;
	private Boolean fscTaxable;
	private Double oidFscMstr;

	// Constructors

	/** default constructor */
	public AbstractFscMstr() {
	}

	/** minimal constructor */
	public AbstractFscMstr(FscMstrId id, Double oidFscMstr) {
		this.id = id;
		this.oidFscMstr = oidFscMstr;
	}

	/** full constructor */
	public AbstractFscMstr(FscMstrId id, Boolean fscConParts,
			Boolean fscCustomer, Boolean fscCusNonProd, String fscDesc,
			Boolean fscExgParts, Boolean fscExpense, Integer fscFisColumn,
			String fscFisSort, Boolean fscLabor, Boolean fscNonProd,
			Boolean fscOther, Boolean fscParts, Boolean fscSick,
			Boolean fscTraining, Boolean fscTravelExp, Boolean fscTravelLabor,
			Boolean fscVacation, String fscChr01, String fscChr02,
			String fscChr03, String fscChr04, Double fscDec01, Double fscDec02,
			Double fscDec03, Date fscDte01, Date fscDte02, Date fscDte03,
			Boolean fscLog01, Boolean fscLog02, Boolean fscLog03,
			String fscQadc01, String fscQadc02, String fscQadc03,
			String fscQadc04, Date fscQadd01, Date fscQadd02, Date fscQadd03,
			Double fscQadde01, Double fscQadde02, Double fscQadde03,
			Boolean fscQadl01, Boolean fscQadl02, Boolean fscQadl03,
			String fscUser1, String fscUser2, Double fscLbrRate,
			Double fscBdnPct, Double fscBdnRate, String fscTaxc,
			Boolean fscTaxable, Double oidFscMstr) {
		this.id = id;
		this.fscConParts = fscConParts;
		this.fscCustomer = fscCustomer;
		this.fscCusNonProd = fscCusNonProd;
		this.fscDesc = fscDesc;
		this.fscExgParts = fscExgParts;
		this.fscExpense = fscExpense;
		this.fscFisColumn = fscFisColumn;
		this.fscFisSort = fscFisSort;
		this.fscLabor = fscLabor;
		this.fscNonProd = fscNonProd;
		this.fscOther = fscOther;
		this.fscParts = fscParts;
		this.fscSick = fscSick;
		this.fscTraining = fscTraining;
		this.fscTravelExp = fscTravelExp;
		this.fscTravelLabor = fscTravelLabor;
		this.fscVacation = fscVacation;
		this.fscChr01 = fscChr01;
		this.fscChr02 = fscChr02;
		this.fscChr03 = fscChr03;
		this.fscChr04 = fscChr04;
		this.fscDec01 = fscDec01;
		this.fscDec02 = fscDec02;
		this.fscDec03 = fscDec03;
		this.fscDte01 = fscDte01;
		this.fscDte02 = fscDte02;
		this.fscDte03 = fscDte03;
		this.fscLog01 = fscLog01;
		this.fscLog02 = fscLog02;
		this.fscLog03 = fscLog03;
		this.fscQadc01 = fscQadc01;
		this.fscQadc02 = fscQadc02;
		this.fscQadc03 = fscQadc03;
		this.fscQadc04 = fscQadc04;
		this.fscQadd01 = fscQadd01;
		this.fscQadd02 = fscQadd02;
		this.fscQadd03 = fscQadd03;
		this.fscQadde01 = fscQadde01;
		this.fscQadde02 = fscQadde02;
		this.fscQadde03 = fscQadde03;
		this.fscQadl01 = fscQadl01;
		this.fscQadl02 = fscQadl02;
		this.fscQadl03 = fscQadl03;
		this.fscUser1 = fscUser1;
		this.fscUser2 = fscUser2;
		this.fscLbrRate = fscLbrRate;
		this.fscBdnPct = fscBdnPct;
		this.fscBdnRate = fscBdnRate;
		this.fscTaxc = fscTaxc;
		this.fscTaxable = fscTaxable;
		this.oidFscMstr = oidFscMstr;
	}

	// Property accessors

	public FscMstrId getId() {
		return this.id;
	}

	public void setId(FscMstrId id) {
		this.id = id;
	}

	public Boolean getFscConParts() {
		return this.fscConParts;
	}

	public void setFscConParts(Boolean fscConParts) {
		this.fscConParts = fscConParts;
	}

	public Boolean getFscCustomer() {
		return this.fscCustomer;
	}

	public void setFscCustomer(Boolean fscCustomer) {
		this.fscCustomer = fscCustomer;
	}

	public Boolean getFscCusNonProd() {
		return this.fscCusNonProd;
	}

	public void setFscCusNonProd(Boolean fscCusNonProd) {
		this.fscCusNonProd = fscCusNonProd;
	}

	public String getFscDesc() {
		return this.fscDesc;
	}

	public void setFscDesc(String fscDesc) {
		this.fscDesc = fscDesc;
	}

	public Boolean getFscExgParts() {
		return this.fscExgParts;
	}

	public void setFscExgParts(Boolean fscExgParts) {
		this.fscExgParts = fscExgParts;
	}

	public Boolean getFscExpense() {
		return this.fscExpense;
	}

	public void setFscExpense(Boolean fscExpense) {
		this.fscExpense = fscExpense;
	}

	public Integer getFscFisColumn() {
		return this.fscFisColumn;
	}

	public void setFscFisColumn(Integer fscFisColumn) {
		this.fscFisColumn = fscFisColumn;
	}

	public String getFscFisSort() {
		return this.fscFisSort;
	}

	public void setFscFisSort(String fscFisSort) {
		this.fscFisSort = fscFisSort;
	}

	public Boolean getFscLabor() {
		return this.fscLabor;
	}

	public void setFscLabor(Boolean fscLabor) {
		this.fscLabor = fscLabor;
	}

	public Boolean getFscNonProd() {
		return this.fscNonProd;
	}

	public void setFscNonProd(Boolean fscNonProd) {
		this.fscNonProd = fscNonProd;
	}

	public Boolean getFscOther() {
		return this.fscOther;
	}

	public void setFscOther(Boolean fscOther) {
		this.fscOther = fscOther;
	}

	public Boolean getFscParts() {
		return this.fscParts;
	}

	public void setFscParts(Boolean fscParts) {
		this.fscParts = fscParts;
	}

	public Boolean getFscSick() {
		return this.fscSick;
	}

	public void setFscSick(Boolean fscSick) {
		this.fscSick = fscSick;
	}

	public Boolean getFscTraining() {
		return this.fscTraining;
	}

	public void setFscTraining(Boolean fscTraining) {
		this.fscTraining = fscTraining;
	}

	public Boolean getFscTravelExp() {
		return this.fscTravelExp;
	}

	public void setFscTravelExp(Boolean fscTravelExp) {
		this.fscTravelExp = fscTravelExp;
	}

	public Boolean getFscTravelLabor() {
		return this.fscTravelLabor;
	}

	public void setFscTravelLabor(Boolean fscTravelLabor) {
		this.fscTravelLabor = fscTravelLabor;
	}

	public Boolean getFscVacation() {
		return this.fscVacation;
	}

	public void setFscVacation(Boolean fscVacation) {
		this.fscVacation = fscVacation;
	}

	public String getFscChr01() {
		return this.fscChr01;
	}

	public void setFscChr01(String fscChr01) {
		this.fscChr01 = fscChr01;
	}

	public String getFscChr02() {
		return this.fscChr02;
	}

	public void setFscChr02(String fscChr02) {
		this.fscChr02 = fscChr02;
	}

	public String getFscChr03() {
		return this.fscChr03;
	}

	public void setFscChr03(String fscChr03) {
		this.fscChr03 = fscChr03;
	}

	public String getFscChr04() {
		return this.fscChr04;
	}

	public void setFscChr04(String fscChr04) {
		this.fscChr04 = fscChr04;
	}

	public Double getFscDec01() {
		return this.fscDec01;
	}

	public void setFscDec01(Double fscDec01) {
		this.fscDec01 = fscDec01;
	}

	public Double getFscDec02() {
		return this.fscDec02;
	}

	public void setFscDec02(Double fscDec02) {
		this.fscDec02 = fscDec02;
	}

	public Double getFscDec03() {
		return this.fscDec03;
	}

	public void setFscDec03(Double fscDec03) {
		this.fscDec03 = fscDec03;
	}

	public Date getFscDte01() {
		return this.fscDte01;
	}

	public void setFscDte01(Date fscDte01) {
		this.fscDte01 = fscDte01;
	}

	public Date getFscDte02() {
		return this.fscDte02;
	}

	public void setFscDte02(Date fscDte02) {
		this.fscDte02 = fscDte02;
	}

	public Date getFscDte03() {
		return this.fscDte03;
	}

	public void setFscDte03(Date fscDte03) {
		this.fscDte03 = fscDte03;
	}

	public Boolean getFscLog01() {
		return this.fscLog01;
	}

	public void setFscLog01(Boolean fscLog01) {
		this.fscLog01 = fscLog01;
	}

	public Boolean getFscLog02() {
		return this.fscLog02;
	}

	public void setFscLog02(Boolean fscLog02) {
		this.fscLog02 = fscLog02;
	}

	public Boolean getFscLog03() {
		return this.fscLog03;
	}

	public void setFscLog03(Boolean fscLog03) {
		this.fscLog03 = fscLog03;
	}

	public String getFscQadc01() {
		return this.fscQadc01;
	}

	public void setFscQadc01(String fscQadc01) {
		this.fscQadc01 = fscQadc01;
	}

	public String getFscQadc02() {
		return this.fscQadc02;
	}

	public void setFscQadc02(String fscQadc02) {
		this.fscQadc02 = fscQadc02;
	}

	public String getFscQadc03() {
		return this.fscQadc03;
	}

	public void setFscQadc03(String fscQadc03) {
		this.fscQadc03 = fscQadc03;
	}

	public String getFscQadc04() {
		return this.fscQadc04;
	}

	public void setFscQadc04(String fscQadc04) {
		this.fscQadc04 = fscQadc04;
	}

	public Date getFscQadd01() {
		return this.fscQadd01;
	}

	public void setFscQadd01(Date fscQadd01) {
		this.fscQadd01 = fscQadd01;
	}

	public Date getFscQadd02() {
		return this.fscQadd02;
	}

	public void setFscQadd02(Date fscQadd02) {
		this.fscQadd02 = fscQadd02;
	}

	public Date getFscQadd03() {
		return this.fscQadd03;
	}

	public void setFscQadd03(Date fscQadd03) {
		this.fscQadd03 = fscQadd03;
	}

	public Double getFscQadde01() {
		return this.fscQadde01;
	}

	public void setFscQadde01(Double fscQadde01) {
		this.fscQadde01 = fscQadde01;
	}

	public Double getFscQadde02() {
		return this.fscQadde02;
	}

	public void setFscQadde02(Double fscQadde02) {
		this.fscQadde02 = fscQadde02;
	}

	public Double getFscQadde03() {
		return this.fscQadde03;
	}

	public void setFscQadde03(Double fscQadde03) {
		this.fscQadde03 = fscQadde03;
	}

	public Boolean getFscQadl01() {
		return this.fscQadl01;
	}

	public void setFscQadl01(Boolean fscQadl01) {
		this.fscQadl01 = fscQadl01;
	}

	public Boolean getFscQadl02() {
		return this.fscQadl02;
	}

	public void setFscQadl02(Boolean fscQadl02) {
		this.fscQadl02 = fscQadl02;
	}

	public Boolean getFscQadl03() {
		return this.fscQadl03;
	}

	public void setFscQadl03(Boolean fscQadl03) {
		this.fscQadl03 = fscQadl03;
	}

	public String getFscUser1() {
		return this.fscUser1;
	}

	public void setFscUser1(String fscUser1) {
		this.fscUser1 = fscUser1;
	}

	public String getFscUser2() {
		return this.fscUser2;
	}

	public void setFscUser2(String fscUser2) {
		this.fscUser2 = fscUser2;
	}

	public Double getFscLbrRate() {
		return this.fscLbrRate;
	}

	public void setFscLbrRate(Double fscLbrRate) {
		this.fscLbrRate = fscLbrRate;
	}

	public Double getFscBdnPct() {
		return this.fscBdnPct;
	}

	public void setFscBdnPct(Double fscBdnPct) {
		this.fscBdnPct = fscBdnPct;
	}

	public Double getFscBdnRate() {
		return this.fscBdnRate;
	}

	public void setFscBdnRate(Double fscBdnRate) {
		this.fscBdnRate = fscBdnRate;
	}

	public String getFscTaxc() {
		return this.fscTaxc;
	}

	public void setFscTaxc(String fscTaxc) {
		this.fscTaxc = fscTaxc;
	}

	public Boolean getFscTaxable() {
		return this.fscTaxable;
	}

	public void setFscTaxable(Boolean fscTaxable) {
		this.fscTaxable = fscTaxable;
	}

	public Double getOidFscMstr() {
		return this.oidFscMstr;
	}

	public void setOidFscMstr(Double oidFscMstr) {
		this.oidFscMstr = oidFscMstr;
	}

}