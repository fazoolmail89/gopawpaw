package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFisMstr entity provides the base persistence definition of the
 * FisMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFisMstr implements java.io.Serializable {

	// Fields

	private FisMstrId id;
	private Integer fisColumn;
	private String fisDesc;
	private Boolean fisDetail;
	private String fisLabel;
	private Integer fisOrder;
	private Boolean fisTotal;
	private Boolean fisIncludeFix;
	private String fisModUserid;
	private Date fisModDate;
	private String fisUser1;
	private String fisUser2;
	private String fisChr01;
	private String fisChr02;
	private Date fisDte01;
	private Double fisDec01;
	private Integer fisInt01;
	private Boolean fisLog01;
	private String fisQadc01;
	private String fisQadc02;
	private Date fisQadt01;
	private Double fisQade01;
	private Integer fisQadi01;
	private Boolean fisQadl01;
	private Double oidFisMstr;

	// Constructors

	/** default constructor */
	public AbstractFisMstr() {
	}

	/** minimal constructor */
	public AbstractFisMstr(FisMstrId id, Double oidFisMstr) {
		this.id = id;
		this.oidFisMstr = oidFisMstr;
	}

	/** full constructor */
	public AbstractFisMstr(FisMstrId id, Integer fisColumn, String fisDesc,
			Boolean fisDetail, String fisLabel, Integer fisOrder,
			Boolean fisTotal, Boolean fisIncludeFix, String fisModUserid,
			Date fisModDate, String fisUser1, String fisUser2, String fisChr01,
			String fisChr02, Date fisDte01, Double fisDec01, Integer fisInt01,
			Boolean fisLog01, String fisQadc01, String fisQadc02,
			Date fisQadt01, Double fisQade01, Integer fisQadi01,
			Boolean fisQadl01, Double oidFisMstr) {
		this.id = id;
		this.fisColumn = fisColumn;
		this.fisDesc = fisDesc;
		this.fisDetail = fisDetail;
		this.fisLabel = fisLabel;
		this.fisOrder = fisOrder;
		this.fisTotal = fisTotal;
		this.fisIncludeFix = fisIncludeFix;
		this.fisModUserid = fisModUserid;
		this.fisModDate = fisModDate;
		this.fisUser1 = fisUser1;
		this.fisUser2 = fisUser2;
		this.fisChr01 = fisChr01;
		this.fisChr02 = fisChr02;
		this.fisDte01 = fisDte01;
		this.fisDec01 = fisDec01;
		this.fisInt01 = fisInt01;
		this.fisLog01 = fisLog01;
		this.fisQadc01 = fisQadc01;
		this.fisQadc02 = fisQadc02;
		this.fisQadt01 = fisQadt01;
		this.fisQade01 = fisQade01;
		this.fisQadi01 = fisQadi01;
		this.fisQadl01 = fisQadl01;
		this.oidFisMstr = oidFisMstr;
	}

	// Property accessors

	public FisMstrId getId() {
		return this.id;
	}

	public void setId(FisMstrId id) {
		this.id = id;
	}

	public Integer getFisColumn() {
		return this.fisColumn;
	}

	public void setFisColumn(Integer fisColumn) {
		this.fisColumn = fisColumn;
	}

	public String getFisDesc() {
		return this.fisDesc;
	}

	public void setFisDesc(String fisDesc) {
		this.fisDesc = fisDesc;
	}

	public Boolean getFisDetail() {
		return this.fisDetail;
	}

	public void setFisDetail(Boolean fisDetail) {
		this.fisDetail = fisDetail;
	}

	public String getFisLabel() {
		return this.fisLabel;
	}

	public void setFisLabel(String fisLabel) {
		this.fisLabel = fisLabel;
	}

	public Integer getFisOrder() {
		return this.fisOrder;
	}

	public void setFisOrder(Integer fisOrder) {
		this.fisOrder = fisOrder;
	}

	public Boolean getFisTotal() {
		return this.fisTotal;
	}

	public void setFisTotal(Boolean fisTotal) {
		this.fisTotal = fisTotal;
	}

	public Boolean getFisIncludeFix() {
		return this.fisIncludeFix;
	}

	public void setFisIncludeFix(Boolean fisIncludeFix) {
		this.fisIncludeFix = fisIncludeFix;
	}

	public String getFisModUserid() {
		return this.fisModUserid;
	}

	public void setFisModUserid(String fisModUserid) {
		this.fisModUserid = fisModUserid;
	}

	public Date getFisModDate() {
		return this.fisModDate;
	}

	public void setFisModDate(Date fisModDate) {
		this.fisModDate = fisModDate;
	}

	public String getFisUser1() {
		return this.fisUser1;
	}

	public void setFisUser1(String fisUser1) {
		this.fisUser1 = fisUser1;
	}

	public String getFisUser2() {
		return this.fisUser2;
	}

	public void setFisUser2(String fisUser2) {
		this.fisUser2 = fisUser2;
	}

	public String getFisChr01() {
		return this.fisChr01;
	}

	public void setFisChr01(String fisChr01) {
		this.fisChr01 = fisChr01;
	}

	public String getFisChr02() {
		return this.fisChr02;
	}

	public void setFisChr02(String fisChr02) {
		this.fisChr02 = fisChr02;
	}

	public Date getFisDte01() {
		return this.fisDte01;
	}

	public void setFisDte01(Date fisDte01) {
		this.fisDte01 = fisDte01;
	}

	public Double getFisDec01() {
		return this.fisDec01;
	}

	public void setFisDec01(Double fisDec01) {
		this.fisDec01 = fisDec01;
	}

	public Integer getFisInt01() {
		return this.fisInt01;
	}

	public void setFisInt01(Integer fisInt01) {
		this.fisInt01 = fisInt01;
	}

	public Boolean getFisLog01() {
		return this.fisLog01;
	}

	public void setFisLog01(Boolean fisLog01) {
		this.fisLog01 = fisLog01;
	}

	public String getFisQadc01() {
		return this.fisQadc01;
	}

	public void setFisQadc01(String fisQadc01) {
		this.fisQadc01 = fisQadc01;
	}

	public String getFisQadc02() {
		return this.fisQadc02;
	}

	public void setFisQadc02(String fisQadc02) {
		this.fisQadc02 = fisQadc02;
	}

	public Date getFisQadt01() {
		return this.fisQadt01;
	}

	public void setFisQadt01(Date fisQadt01) {
		this.fisQadt01 = fisQadt01;
	}

	public Double getFisQade01() {
		return this.fisQade01;
	}

	public void setFisQade01(Double fisQade01) {
		this.fisQade01 = fisQade01;
	}

	public Integer getFisQadi01() {
		return this.fisQadi01;
	}

	public void setFisQadi01(Integer fisQadi01) {
		this.fisQadi01 = fisQadi01;
	}

	public Boolean getFisQadl01() {
		return this.fisQadl01;
	}

	public void setFisQadl01(Boolean fisQadl01) {
		this.fisQadl01 = fisQadl01;
	}

	public Double getOidFisMstr() {
		return this.oidFisMstr;
	}

	public void setOidFisMstr(Double oidFisMstr) {
		this.oidFisMstr = oidFisMstr;
	}

}