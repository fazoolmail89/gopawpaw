package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractApmCtrl entity provides the base persistence definition of the
 * ApmCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractApmCtrl implements java.io.Serializable {

	// Fields

	private String apmDomain;
	private Integer apmQadi03;
	private String apmDiv;
	private Boolean apmMultiDiv;
	private Boolean apmPrig1;
	private Boolean apmPrig2;
	private Boolean apmPlpri;
	private String apmPlpriSseq;
	private String apmPlpriDseq;
	private Boolean apmManual;
	private Boolean apmLineRel;
	private String apmUser1;
	private String apmUser2;
	private String apmQadc01;
	private String apmQadc02;
	private String apmQadc03;
	private Double apmQadd01;
	private Double apmQadd02;
	private Integer apmQadi01;
	private Integer apmQadi02;
	private Boolean apmQadl01;
	private Boolean apmQadl02;
	private Boolean apmQadl03;
	private Date apmQadt01;
	private Date apmQadt02;
	private Double oidApmCtrl;

	// Constructors

	/** default constructor */
	public AbstractApmCtrl() {
	}

	/** minimal constructor */
	public AbstractApmCtrl(Double oidApmCtrl) {
		this.oidApmCtrl = oidApmCtrl;
	}

	/** full constructor */
	public AbstractApmCtrl(Integer apmQadi03, String apmDiv,
			Boolean apmMultiDiv, Boolean apmPrig1, Boolean apmPrig2,
			Boolean apmPlpri, String apmPlpriSseq, String apmPlpriDseq,
			Boolean apmManual, Boolean apmLineRel, String apmUser1,
			String apmUser2, String apmQadc01, String apmQadc02,
			String apmQadc03, Double apmQadd01, Double apmQadd02,
			Integer apmQadi01, Integer apmQadi02, Boolean apmQadl01,
			Boolean apmQadl02, Boolean apmQadl03, Date apmQadt01,
			Date apmQadt02, Double oidApmCtrl) {
		this.apmQadi03 = apmQadi03;
		this.apmDiv = apmDiv;
		this.apmMultiDiv = apmMultiDiv;
		this.apmPrig1 = apmPrig1;
		this.apmPrig2 = apmPrig2;
		this.apmPlpri = apmPlpri;
		this.apmPlpriSseq = apmPlpriSseq;
		this.apmPlpriDseq = apmPlpriDseq;
		this.apmManual = apmManual;
		this.apmLineRel = apmLineRel;
		this.apmUser1 = apmUser1;
		this.apmUser2 = apmUser2;
		this.apmQadc01 = apmQadc01;
		this.apmQadc02 = apmQadc02;
		this.apmQadc03 = apmQadc03;
		this.apmQadd01 = apmQadd01;
		this.apmQadd02 = apmQadd02;
		this.apmQadi01 = apmQadi01;
		this.apmQadi02 = apmQadi02;
		this.apmQadl01 = apmQadl01;
		this.apmQadl02 = apmQadl02;
		this.apmQadl03 = apmQadl03;
		this.apmQadt01 = apmQadt01;
		this.apmQadt02 = apmQadt02;
		this.oidApmCtrl = oidApmCtrl;
	}

	// Property accessors

	public String getApmDomain() {
		return this.apmDomain;
	}

	public void setApmDomain(String apmDomain) {
		this.apmDomain = apmDomain;
	}

	public Integer getApmQadi03() {
		return this.apmQadi03;
	}

	public void setApmQadi03(Integer apmQadi03) {
		this.apmQadi03 = apmQadi03;
	}

	public String getApmDiv() {
		return this.apmDiv;
	}

	public void setApmDiv(String apmDiv) {
		this.apmDiv = apmDiv;
	}

	public Boolean getApmMultiDiv() {
		return this.apmMultiDiv;
	}

	public void setApmMultiDiv(Boolean apmMultiDiv) {
		this.apmMultiDiv = apmMultiDiv;
	}

	public Boolean getApmPrig1() {
		return this.apmPrig1;
	}

	public void setApmPrig1(Boolean apmPrig1) {
		this.apmPrig1 = apmPrig1;
	}

	public Boolean getApmPrig2() {
		return this.apmPrig2;
	}

	public void setApmPrig2(Boolean apmPrig2) {
		this.apmPrig2 = apmPrig2;
	}

	public Boolean getApmPlpri() {
		return this.apmPlpri;
	}

	public void setApmPlpri(Boolean apmPlpri) {
		this.apmPlpri = apmPlpri;
	}

	public String getApmPlpriSseq() {
		return this.apmPlpriSseq;
	}

	public void setApmPlpriSseq(String apmPlpriSseq) {
		this.apmPlpriSseq = apmPlpriSseq;
	}

	public String getApmPlpriDseq() {
		return this.apmPlpriDseq;
	}

	public void setApmPlpriDseq(String apmPlpriDseq) {
		this.apmPlpriDseq = apmPlpriDseq;
	}

	public Boolean getApmManual() {
		return this.apmManual;
	}

	public void setApmManual(Boolean apmManual) {
		this.apmManual = apmManual;
	}

	public Boolean getApmLineRel() {
		return this.apmLineRel;
	}

	public void setApmLineRel(Boolean apmLineRel) {
		this.apmLineRel = apmLineRel;
	}

	public String getApmUser1() {
		return this.apmUser1;
	}

	public void setApmUser1(String apmUser1) {
		this.apmUser1 = apmUser1;
	}

	public String getApmUser2() {
		return this.apmUser2;
	}

	public void setApmUser2(String apmUser2) {
		this.apmUser2 = apmUser2;
	}

	public String getApmQadc01() {
		return this.apmQadc01;
	}

	public void setApmQadc01(String apmQadc01) {
		this.apmQadc01 = apmQadc01;
	}

	public String getApmQadc02() {
		return this.apmQadc02;
	}

	public void setApmQadc02(String apmQadc02) {
		this.apmQadc02 = apmQadc02;
	}

	public String getApmQadc03() {
		return this.apmQadc03;
	}

	public void setApmQadc03(String apmQadc03) {
		this.apmQadc03 = apmQadc03;
	}

	public Double getApmQadd01() {
		return this.apmQadd01;
	}

	public void setApmQadd01(Double apmQadd01) {
		this.apmQadd01 = apmQadd01;
	}

	public Double getApmQadd02() {
		return this.apmQadd02;
	}

	public void setApmQadd02(Double apmQadd02) {
		this.apmQadd02 = apmQadd02;
	}

	public Integer getApmQadi01() {
		return this.apmQadi01;
	}

	public void setApmQadi01(Integer apmQadi01) {
		this.apmQadi01 = apmQadi01;
	}

	public Integer getApmQadi02() {
		return this.apmQadi02;
	}

	public void setApmQadi02(Integer apmQadi02) {
		this.apmQadi02 = apmQadi02;
	}

	public Boolean getApmQadl01() {
		return this.apmQadl01;
	}

	public void setApmQadl01(Boolean apmQadl01) {
		this.apmQadl01 = apmQadl01;
	}

	public Boolean getApmQadl02() {
		return this.apmQadl02;
	}

	public void setApmQadl02(Boolean apmQadl02) {
		this.apmQadl02 = apmQadl02;
	}

	public Boolean getApmQadl03() {
		return this.apmQadl03;
	}

	public void setApmQadl03(Boolean apmQadl03) {
		this.apmQadl03 = apmQadl03;
	}

	public Date getApmQadt01() {
		return this.apmQadt01;
	}

	public void setApmQadt01(Date apmQadt01) {
		this.apmQadt01 = apmQadt01;
	}

	public Date getApmQadt02() {
		return this.apmQadt02;
	}

	public void setApmQadt02(Date apmQadt02) {
		this.apmQadt02 = apmQadt02;
	}

	public Double getOidApmCtrl() {
		return this.oidApmCtrl;
	}

	public void setOidApmCtrl(Double oidApmCtrl) {
		this.oidApmCtrl = oidApmCtrl;
	}

}