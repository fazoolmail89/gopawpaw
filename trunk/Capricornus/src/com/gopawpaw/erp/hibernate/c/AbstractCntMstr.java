package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCntMstr entity provides the base persistence definition of the
 * CntMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCntMstr implements java.io.Serializable {

	// Fields

	private CntMstrId id;
	private Integer cntOraId1;
	private Integer cntOraId2;
	private Integer cntTime;
	private String cntUser1;
	private String cntUser2;
	private String cntQadc01;
	private Integer cntQadi01;
	private Double cntQadd01;
	private Boolean cntQadl01;
	private Date cntQadt01;
	private Date cntDate;
	private Double oidCntMstr;

	// Constructors

	/** default constructor */
	public AbstractCntMstr() {
	}

	/** minimal constructor */
	public AbstractCntMstr(CntMstrId id, Double oidCntMstr) {
		this.id = id;
		this.oidCntMstr = oidCntMstr;
	}

	/** full constructor */
	public AbstractCntMstr(CntMstrId id, Integer cntOraId1, Integer cntOraId2,
			Integer cntTime, String cntUser1, String cntUser2,
			String cntQadc01, Integer cntQadi01, Double cntQadd01,
			Boolean cntQadl01, Date cntQadt01, Date cntDate, Double oidCntMstr) {
		this.id = id;
		this.cntOraId1 = cntOraId1;
		this.cntOraId2 = cntOraId2;
		this.cntTime = cntTime;
		this.cntUser1 = cntUser1;
		this.cntUser2 = cntUser2;
		this.cntQadc01 = cntQadc01;
		this.cntQadi01 = cntQadi01;
		this.cntQadd01 = cntQadd01;
		this.cntQadl01 = cntQadl01;
		this.cntQadt01 = cntQadt01;
		this.cntDate = cntDate;
		this.oidCntMstr = oidCntMstr;
	}

	// Property accessors

	public CntMstrId getId() {
		return this.id;
	}

	public void setId(CntMstrId id) {
		this.id = id;
	}

	public Integer getCntOraId1() {
		return this.cntOraId1;
	}

	public void setCntOraId1(Integer cntOraId1) {
		this.cntOraId1 = cntOraId1;
	}

	public Integer getCntOraId2() {
		return this.cntOraId2;
	}

	public void setCntOraId2(Integer cntOraId2) {
		this.cntOraId2 = cntOraId2;
	}

	public Integer getCntTime() {
		return this.cntTime;
	}

	public void setCntTime(Integer cntTime) {
		this.cntTime = cntTime;
	}

	public String getCntUser1() {
		return this.cntUser1;
	}

	public void setCntUser1(String cntUser1) {
		this.cntUser1 = cntUser1;
	}

	public String getCntUser2() {
		return this.cntUser2;
	}

	public void setCntUser2(String cntUser2) {
		this.cntUser2 = cntUser2;
	}

	public String getCntQadc01() {
		return this.cntQadc01;
	}

	public void setCntQadc01(String cntQadc01) {
		this.cntQadc01 = cntQadc01;
	}

	public Integer getCntQadi01() {
		return this.cntQadi01;
	}

	public void setCntQadi01(Integer cntQadi01) {
		this.cntQadi01 = cntQadi01;
	}

	public Double getCntQadd01() {
		return this.cntQadd01;
	}

	public void setCntQadd01(Double cntQadd01) {
		this.cntQadd01 = cntQadd01;
	}

	public Boolean getCntQadl01() {
		return this.cntQadl01;
	}

	public void setCntQadl01(Boolean cntQadl01) {
		this.cntQadl01 = cntQadl01;
	}

	public Date getCntQadt01() {
		return this.cntQadt01;
	}

	public void setCntQadt01(Date cntQadt01) {
		this.cntQadt01 = cntQadt01;
	}

	public Date getCntDate() {
		return this.cntDate;
	}

	public void setCntDate(Date cntDate) {
		this.cntDate = cntDate;
	}

	public Double getOidCntMstr() {
		return this.oidCntMstr;
	}

	public void setOidCntMstr(Double oidCntMstr) {
		this.oidCntMstr = oidCntMstr;
	}

}