package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractScaMstr entity provides the base persistence definition of the
 * ScaMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractScaMstr implements java.io.Serializable {

	// Fields

	private ScaMstrId id;
	private Double scaAmount;
	private String scaAmtType;
	private String scaCycle;
	private String scaPctType;
	private Integer scaPriority;
	private String scaDesc;
	private Date scaStart;
	private Date scaExpire;
	private String scaProdline;
	private String scaUser1;
	private String scaUser2;
	private String scaModUserid;
	private Date scaModDate;
	private String scaChr01;
	private String scaChr02;
	private Date scaDte01;
	private Date scaDte02;
	private String scaChr03;
	private Double scaDec01;
	private String scaQadc01;
	private String scaQadc02;
	private String scaQadc03;
	private Date scaQadt01;
	private Date scaQadt02;
	private Double scaQade01;
	private Double oidScaMstr;

	// Constructors

	/** default constructor */
	public AbstractScaMstr() {
	}

	/** minimal constructor */
	public AbstractScaMstr(ScaMstrId id, Double oidScaMstr) {
		this.id = id;
		this.oidScaMstr = oidScaMstr;
	}

	/** full constructor */
	public AbstractScaMstr(ScaMstrId id, Double scaAmount, String scaAmtType,
			String scaCycle, String scaPctType, Integer scaPriority,
			String scaDesc, Date scaStart, Date scaExpire, String scaProdline,
			String scaUser1, String scaUser2, String scaModUserid,
			Date scaModDate, String scaChr01, String scaChr02, Date scaDte01,
			Date scaDte02, String scaChr03, Double scaDec01, String scaQadc01,
			String scaQadc02, String scaQadc03, Date scaQadt01, Date scaQadt02,
			Double scaQade01, Double oidScaMstr) {
		this.id = id;
		this.scaAmount = scaAmount;
		this.scaAmtType = scaAmtType;
		this.scaCycle = scaCycle;
		this.scaPctType = scaPctType;
		this.scaPriority = scaPriority;
		this.scaDesc = scaDesc;
		this.scaStart = scaStart;
		this.scaExpire = scaExpire;
		this.scaProdline = scaProdline;
		this.scaUser1 = scaUser1;
		this.scaUser2 = scaUser2;
		this.scaModUserid = scaModUserid;
		this.scaModDate = scaModDate;
		this.scaChr01 = scaChr01;
		this.scaChr02 = scaChr02;
		this.scaDte01 = scaDte01;
		this.scaDte02 = scaDte02;
		this.scaChr03 = scaChr03;
		this.scaDec01 = scaDec01;
		this.scaQadc01 = scaQadc01;
		this.scaQadc02 = scaQadc02;
		this.scaQadc03 = scaQadc03;
		this.scaQadt01 = scaQadt01;
		this.scaQadt02 = scaQadt02;
		this.scaQade01 = scaQade01;
		this.oidScaMstr = oidScaMstr;
	}

	// Property accessors

	public ScaMstrId getId() {
		return this.id;
	}

	public void setId(ScaMstrId id) {
		this.id = id;
	}

	public Double getScaAmount() {
		return this.scaAmount;
	}

	public void setScaAmount(Double scaAmount) {
		this.scaAmount = scaAmount;
	}

	public String getScaAmtType() {
		return this.scaAmtType;
	}

	public void setScaAmtType(String scaAmtType) {
		this.scaAmtType = scaAmtType;
	}

	public String getScaCycle() {
		return this.scaCycle;
	}

	public void setScaCycle(String scaCycle) {
		this.scaCycle = scaCycle;
	}

	public String getScaPctType() {
		return this.scaPctType;
	}

	public void setScaPctType(String scaPctType) {
		this.scaPctType = scaPctType;
	}

	public Integer getScaPriority() {
		return this.scaPriority;
	}

	public void setScaPriority(Integer scaPriority) {
		this.scaPriority = scaPriority;
	}

	public String getScaDesc() {
		return this.scaDesc;
	}

	public void setScaDesc(String scaDesc) {
		this.scaDesc = scaDesc;
	}

	public Date getScaStart() {
		return this.scaStart;
	}

	public void setScaStart(Date scaStart) {
		this.scaStart = scaStart;
	}

	public Date getScaExpire() {
		return this.scaExpire;
	}

	public void setScaExpire(Date scaExpire) {
		this.scaExpire = scaExpire;
	}

	public String getScaProdline() {
		return this.scaProdline;
	}

	public void setScaProdline(String scaProdline) {
		this.scaProdline = scaProdline;
	}

	public String getScaUser1() {
		return this.scaUser1;
	}

	public void setScaUser1(String scaUser1) {
		this.scaUser1 = scaUser1;
	}

	public String getScaUser2() {
		return this.scaUser2;
	}

	public void setScaUser2(String scaUser2) {
		this.scaUser2 = scaUser2;
	}

	public String getScaModUserid() {
		return this.scaModUserid;
	}

	public void setScaModUserid(String scaModUserid) {
		this.scaModUserid = scaModUserid;
	}

	public Date getScaModDate() {
		return this.scaModDate;
	}

	public void setScaModDate(Date scaModDate) {
		this.scaModDate = scaModDate;
	}

	public String getScaChr01() {
		return this.scaChr01;
	}

	public void setScaChr01(String scaChr01) {
		this.scaChr01 = scaChr01;
	}

	public String getScaChr02() {
		return this.scaChr02;
	}

	public void setScaChr02(String scaChr02) {
		this.scaChr02 = scaChr02;
	}

	public Date getScaDte01() {
		return this.scaDte01;
	}

	public void setScaDte01(Date scaDte01) {
		this.scaDte01 = scaDte01;
	}

	public Date getScaDte02() {
		return this.scaDte02;
	}

	public void setScaDte02(Date scaDte02) {
		this.scaDte02 = scaDte02;
	}

	public String getScaChr03() {
		return this.scaChr03;
	}

	public void setScaChr03(String scaChr03) {
		this.scaChr03 = scaChr03;
	}

	public Double getScaDec01() {
		return this.scaDec01;
	}

	public void setScaDec01(Double scaDec01) {
		this.scaDec01 = scaDec01;
	}

	public String getScaQadc01() {
		return this.scaQadc01;
	}

	public void setScaQadc01(String scaQadc01) {
		this.scaQadc01 = scaQadc01;
	}

	public String getScaQadc02() {
		return this.scaQadc02;
	}

	public void setScaQadc02(String scaQadc02) {
		this.scaQadc02 = scaQadc02;
	}

	public String getScaQadc03() {
		return this.scaQadc03;
	}

	public void setScaQadc03(String scaQadc03) {
		this.scaQadc03 = scaQadc03;
	}

	public Date getScaQadt01() {
		return this.scaQadt01;
	}

	public void setScaQadt01(Date scaQadt01) {
		this.scaQadt01 = scaQadt01;
	}

	public Date getScaQadt02() {
		return this.scaQadt02;
	}

	public void setScaQadt02(Date scaQadt02) {
		this.scaQadt02 = scaQadt02;
	}

	public Double getScaQade01() {
		return this.scaQade01;
	}

	public void setScaQade01(Double scaQade01) {
		this.scaQade01 = scaQade01;
	}

	public Double getOidScaMstr() {
		return this.oidScaMstr;
	}

	public void setOidScaMstr(Double oidScaMstr) {
		this.oidScaMstr = oidScaMstr;
	}

}