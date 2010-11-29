package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEmgMsg entity provides the base persistence definition of the EmgMsg
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEmgMsg implements java.io.Serializable {

	// Fields

	private EmgMsgId id;
	private String emgAppId;
	private Boolean emgEmailSent;
	private Date emgModDate;
	private String emgModUserid;
	private String emgReturnTxt;
	private String emgSevLvl;
	private String emgUser1;
	private String emgUser2;
	private Double emgDec01;
	private Double emgDec02;
	private Integer emgInt01;
	private Integer emgInt02;
	private Boolean emgLog01;
	private Boolean emgLog02;
	private Date emgDte01;
	private Date emgDte02;
	private String emgQadc01;
	private String emgQadc02;
	private String emgQadc03;
	private String emgQadc04;
	private Double emgQadd01;
	private Double emgQadd02;
	private Integer emgQadi01;
	private Integer emgQadi02;
	private Boolean emgQadl01;
	private Boolean emgQadl02;
	private Date emgQadt01;
	private Date emgQadt02;
	private Double oidEmgMsg;

	// Constructors

	/** default constructor */
	public AbstractEmgMsg() {
	}

	/** minimal constructor */
	public AbstractEmgMsg(EmgMsgId id, Double oidEmgMsg) {
		this.id = id;
		this.oidEmgMsg = oidEmgMsg;
	}

	/** full constructor */
	public AbstractEmgMsg(EmgMsgId id, String emgAppId, Boolean emgEmailSent,
			Date emgModDate, String emgModUserid, String emgReturnTxt,
			String emgSevLvl, String emgUser1, String emgUser2,
			Double emgDec01, Double emgDec02, Integer emgInt01,
			Integer emgInt02, Boolean emgLog01, Boolean emgLog02,
			Date emgDte01, Date emgDte02, String emgQadc01, String emgQadc02,
			String emgQadc03, String emgQadc04, Double emgQadd01,
			Double emgQadd02, Integer emgQadi01, Integer emgQadi02,
			Boolean emgQadl01, Boolean emgQadl02, Date emgQadt01,
			Date emgQadt02, Double oidEmgMsg) {
		this.id = id;
		this.emgAppId = emgAppId;
		this.emgEmailSent = emgEmailSent;
		this.emgModDate = emgModDate;
		this.emgModUserid = emgModUserid;
		this.emgReturnTxt = emgReturnTxt;
		this.emgSevLvl = emgSevLvl;
		this.emgUser1 = emgUser1;
		this.emgUser2 = emgUser2;
		this.emgDec01 = emgDec01;
		this.emgDec02 = emgDec02;
		this.emgInt01 = emgInt01;
		this.emgInt02 = emgInt02;
		this.emgLog01 = emgLog01;
		this.emgLog02 = emgLog02;
		this.emgDte01 = emgDte01;
		this.emgDte02 = emgDte02;
		this.emgQadc01 = emgQadc01;
		this.emgQadc02 = emgQadc02;
		this.emgQadc03 = emgQadc03;
		this.emgQadc04 = emgQadc04;
		this.emgQadd01 = emgQadd01;
		this.emgQadd02 = emgQadd02;
		this.emgQadi01 = emgQadi01;
		this.emgQadi02 = emgQadi02;
		this.emgQadl01 = emgQadl01;
		this.emgQadl02 = emgQadl02;
		this.emgQadt01 = emgQadt01;
		this.emgQadt02 = emgQadt02;
		this.oidEmgMsg = oidEmgMsg;
	}

	// Property accessors

	public EmgMsgId getId() {
		return this.id;
	}

	public void setId(EmgMsgId id) {
		this.id = id;
	}

	public String getEmgAppId() {
		return this.emgAppId;
	}

	public void setEmgAppId(String emgAppId) {
		this.emgAppId = emgAppId;
	}

	public Boolean getEmgEmailSent() {
		return this.emgEmailSent;
	}

	public void setEmgEmailSent(Boolean emgEmailSent) {
		this.emgEmailSent = emgEmailSent;
	}

	public Date getEmgModDate() {
		return this.emgModDate;
	}

	public void setEmgModDate(Date emgModDate) {
		this.emgModDate = emgModDate;
	}

	public String getEmgModUserid() {
		return this.emgModUserid;
	}

	public void setEmgModUserid(String emgModUserid) {
		this.emgModUserid = emgModUserid;
	}

	public String getEmgReturnTxt() {
		return this.emgReturnTxt;
	}

	public void setEmgReturnTxt(String emgReturnTxt) {
		this.emgReturnTxt = emgReturnTxt;
	}

	public String getEmgSevLvl() {
		return this.emgSevLvl;
	}

	public void setEmgSevLvl(String emgSevLvl) {
		this.emgSevLvl = emgSevLvl;
	}

	public String getEmgUser1() {
		return this.emgUser1;
	}

	public void setEmgUser1(String emgUser1) {
		this.emgUser1 = emgUser1;
	}

	public String getEmgUser2() {
		return this.emgUser2;
	}

	public void setEmgUser2(String emgUser2) {
		this.emgUser2 = emgUser2;
	}

	public Double getEmgDec01() {
		return this.emgDec01;
	}

	public void setEmgDec01(Double emgDec01) {
		this.emgDec01 = emgDec01;
	}

	public Double getEmgDec02() {
		return this.emgDec02;
	}

	public void setEmgDec02(Double emgDec02) {
		this.emgDec02 = emgDec02;
	}

	public Integer getEmgInt01() {
		return this.emgInt01;
	}

	public void setEmgInt01(Integer emgInt01) {
		this.emgInt01 = emgInt01;
	}

	public Integer getEmgInt02() {
		return this.emgInt02;
	}

	public void setEmgInt02(Integer emgInt02) {
		this.emgInt02 = emgInt02;
	}

	public Boolean getEmgLog01() {
		return this.emgLog01;
	}

	public void setEmgLog01(Boolean emgLog01) {
		this.emgLog01 = emgLog01;
	}

	public Boolean getEmgLog02() {
		return this.emgLog02;
	}

	public void setEmgLog02(Boolean emgLog02) {
		this.emgLog02 = emgLog02;
	}

	public Date getEmgDte01() {
		return this.emgDte01;
	}

	public void setEmgDte01(Date emgDte01) {
		this.emgDte01 = emgDte01;
	}

	public Date getEmgDte02() {
		return this.emgDte02;
	}

	public void setEmgDte02(Date emgDte02) {
		this.emgDte02 = emgDte02;
	}

	public String getEmgQadc01() {
		return this.emgQadc01;
	}

	public void setEmgQadc01(String emgQadc01) {
		this.emgQadc01 = emgQadc01;
	}

	public String getEmgQadc02() {
		return this.emgQadc02;
	}

	public void setEmgQadc02(String emgQadc02) {
		this.emgQadc02 = emgQadc02;
	}

	public String getEmgQadc03() {
		return this.emgQadc03;
	}

	public void setEmgQadc03(String emgQadc03) {
		this.emgQadc03 = emgQadc03;
	}

	public String getEmgQadc04() {
		return this.emgQadc04;
	}

	public void setEmgQadc04(String emgQadc04) {
		this.emgQadc04 = emgQadc04;
	}

	public Double getEmgQadd01() {
		return this.emgQadd01;
	}

	public void setEmgQadd01(Double emgQadd01) {
		this.emgQadd01 = emgQadd01;
	}

	public Double getEmgQadd02() {
		return this.emgQadd02;
	}

	public void setEmgQadd02(Double emgQadd02) {
		this.emgQadd02 = emgQadd02;
	}

	public Integer getEmgQadi01() {
		return this.emgQadi01;
	}

	public void setEmgQadi01(Integer emgQadi01) {
		this.emgQadi01 = emgQadi01;
	}

	public Integer getEmgQadi02() {
		return this.emgQadi02;
	}

	public void setEmgQadi02(Integer emgQadi02) {
		this.emgQadi02 = emgQadi02;
	}

	public Boolean getEmgQadl01() {
		return this.emgQadl01;
	}

	public void setEmgQadl01(Boolean emgQadl01) {
		this.emgQadl01 = emgQadl01;
	}

	public Boolean getEmgQadl02() {
		return this.emgQadl02;
	}

	public void setEmgQadl02(Boolean emgQadl02) {
		this.emgQadl02 = emgQadl02;
	}

	public Date getEmgQadt01() {
		return this.emgQadt01;
	}

	public void setEmgQadt01(Date emgQadt01) {
		this.emgQadt01 = emgQadt01;
	}

	public Date getEmgQadt02() {
		return this.emgQadt02;
	}

	public void setEmgQadt02(Date emgQadt02) {
		this.emgQadt02 = emgQadt02;
	}

	public Double getOidEmgMsg() {
		return this.oidEmgMsg;
	}

	public void setOidEmgMsg(Double oidEmgMsg) {
		this.oidEmgMsg = oidEmgMsg;
	}

}