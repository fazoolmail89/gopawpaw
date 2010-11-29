package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAcdfMstr entity provides the base persistence definition of the
 * AcdfMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAcdfMstr implements java.io.Serializable {

	// Fields

	private AcdfMstrId id;
	private String acdfAcct;
	private String acdfSub;
	private String acdfCc;
	private String acdfModUserid;
	private Date acdfModDate;
	private String acdfUserc01;
	private String acdfUserc02;
	private Double acdfUserd01;
	private Integer acdfUseri01;
	private Boolean acdfUserl01;
	private Date acdfUsert01;
	private String acdfQadc01;
	private Double acdfQadd01;
	private Integer acdfQadi01;
	private Boolean acdfQadl01;
	private Date acdfQadt01;
	private Double oidAcdfMstr;

	// Constructors

	/** default constructor */
	public AbstractAcdfMstr() {
	}

	/** minimal constructor */
	public AbstractAcdfMstr(AcdfMstrId id, String acdfAcct, String acdfSub,
			String acdfCc, String acdfModUserid, Date acdfModDate,
			String acdfUserc01, String acdfUserc02, Double acdfUserd01,
			Integer acdfUseri01, Boolean acdfUserl01, String acdfQadc01,
			Double acdfQadd01, Integer acdfQadi01, Boolean acdfQadl01,
			Double oidAcdfMstr) {
		this.id = id;
		this.acdfAcct = acdfAcct;
		this.acdfSub = acdfSub;
		this.acdfCc = acdfCc;
		this.acdfModUserid = acdfModUserid;
		this.acdfModDate = acdfModDate;
		this.acdfUserc01 = acdfUserc01;
		this.acdfUserc02 = acdfUserc02;
		this.acdfUserd01 = acdfUserd01;
		this.acdfUseri01 = acdfUseri01;
		this.acdfUserl01 = acdfUserl01;
		this.acdfQadc01 = acdfQadc01;
		this.acdfQadd01 = acdfQadd01;
		this.acdfQadi01 = acdfQadi01;
		this.acdfQadl01 = acdfQadl01;
		this.oidAcdfMstr = oidAcdfMstr;
	}

	/** full constructor */
	public AbstractAcdfMstr(AcdfMstrId id, String acdfAcct, String acdfSub,
			String acdfCc, String acdfModUserid, Date acdfModDate,
			String acdfUserc01, String acdfUserc02, Double acdfUserd01,
			Integer acdfUseri01, Boolean acdfUserl01, Date acdfUsert01,
			String acdfQadc01, Double acdfQadd01, Integer acdfQadi01,
			Boolean acdfQadl01, Date acdfQadt01, Double oidAcdfMstr) {
		this.id = id;
		this.acdfAcct = acdfAcct;
		this.acdfSub = acdfSub;
		this.acdfCc = acdfCc;
		this.acdfModUserid = acdfModUserid;
		this.acdfModDate = acdfModDate;
		this.acdfUserc01 = acdfUserc01;
		this.acdfUserc02 = acdfUserc02;
		this.acdfUserd01 = acdfUserd01;
		this.acdfUseri01 = acdfUseri01;
		this.acdfUserl01 = acdfUserl01;
		this.acdfUsert01 = acdfUsert01;
		this.acdfQadc01 = acdfQadc01;
		this.acdfQadd01 = acdfQadd01;
		this.acdfQadi01 = acdfQadi01;
		this.acdfQadl01 = acdfQadl01;
		this.acdfQadt01 = acdfQadt01;
		this.oidAcdfMstr = oidAcdfMstr;
	}

	// Property accessors

	public AcdfMstrId getId() {
		return this.id;
	}

	public void setId(AcdfMstrId id) {
		this.id = id;
	}

	public String getAcdfAcct() {
		return this.acdfAcct;
	}

	public void setAcdfAcct(String acdfAcct) {
		this.acdfAcct = acdfAcct;
	}

	public String getAcdfSub() {
		return this.acdfSub;
	}

	public void setAcdfSub(String acdfSub) {
		this.acdfSub = acdfSub;
	}

	public String getAcdfCc() {
		return this.acdfCc;
	}

	public void setAcdfCc(String acdfCc) {
		this.acdfCc = acdfCc;
	}

	public String getAcdfModUserid() {
		return this.acdfModUserid;
	}

	public void setAcdfModUserid(String acdfModUserid) {
		this.acdfModUserid = acdfModUserid;
	}

	public Date getAcdfModDate() {
		return this.acdfModDate;
	}

	public void setAcdfModDate(Date acdfModDate) {
		this.acdfModDate = acdfModDate;
	}

	public String getAcdfUserc01() {
		return this.acdfUserc01;
	}

	public void setAcdfUserc01(String acdfUserc01) {
		this.acdfUserc01 = acdfUserc01;
	}

	public String getAcdfUserc02() {
		return this.acdfUserc02;
	}

	public void setAcdfUserc02(String acdfUserc02) {
		this.acdfUserc02 = acdfUserc02;
	}

	public Double getAcdfUserd01() {
		return this.acdfUserd01;
	}

	public void setAcdfUserd01(Double acdfUserd01) {
		this.acdfUserd01 = acdfUserd01;
	}

	public Integer getAcdfUseri01() {
		return this.acdfUseri01;
	}

	public void setAcdfUseri01(Integer acdfUseri01) {
		this.acdfUseri01 = acdfUseri01;
	}

	public Boolean getAcdfUserl01() {
		return this.acdfUserl01;
	}

	public void setAcdfUserl01(Boolean acdfUserl01) {
		this.acdfUserl01 = acdfUserl01;
	}

	public Date getAcdfUsert01() {
		return this.acdfUsert01;
	}

	public void setAcdfUsert01(Date acdfUsert01) {
		this.acdfUsert01 = acdfUsert01;
	}

	public String getAcdfQadc01() {
		return this.acdfQadc01;
	}

	public void setAcdfQadc01(String acdfQadc01) {
		this.acdfQadc01 = acdfQadc01;
	}

	public Double getAcdfQadd01() {
		return this.acdfQadd01;
	}

	public void setAcdfQadd01(Double acdfQadd01) {
		this.acdfQadd01 = acdfQadd01;
	}

	public Integer getAcdfQadi01() {
		return this.acdfQadi01;
	}

	public void setAcdfQadi01(Integer acdfQadi01) {
		this.acdfQadi01 = acdfQadi01;
	}

	public Boolean getAcdfQadl01() {
		return this.acdfQadl01;
	}

	public void setAcdfQadl01(Boolean acdfQadl01) {
		this.acdfQadl01 = acdfQadl01;
	}

	public Date getAcdfQadt01() {
		return this.acdfQadt01;
	}

	public void setAcdfQadt01(Date acdfQadt01) {
		this.acdfQadt01 = acdfQadt01;
	}

	public Double getOidAcdfMstr() {
		return this.oidAcdfMstr;
	}

	public void setOidAcdfMstr(Double oidAcdfMstr) {
		this.oidAcdfMstr = oidAcdfMstr;
	}

}