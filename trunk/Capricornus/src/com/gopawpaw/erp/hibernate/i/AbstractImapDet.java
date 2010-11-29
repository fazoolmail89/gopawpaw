package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractImapDet entity provides the base persistence definition of the
 * ImapDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractImapDet implements java.io.Serializable {

	// Fields

	private ImapDetId id;
	private Boolean imapLineCont;
	private String imapData;
	private Date imapModDate;
	private String imapModUserid;
	private String imapUser1;
	private String imapUser2;
	private Double imapDec01;
	private Double imapDec02;
	private Integer imapInt01;
	private Integer imapInt02;
	private Boolean imapLog01;
	private Boolean imapLog02;
	private Date imapDte01;
	private Date imapDte02;
	private String imapQadc01;
	private String imapQadc02;
	private String imapQadc03;
	private String imapQadc04;
	private Double imapQadd01;
	private Double imapQadd02;
	private Integer imapQadi01;
	private Integer imapQadi02;
	private Boolean imapQadl01;
	private Boolean imapQadl02;
	private Date imapQadt01;
	private Date imapQadt02;
	private Double oidImapDet;

	// Constructors

	/** default constructor */
	public AbstractImapDet() {
	}

	/** minimal constructor */
	public AbstractImapDet(ImapDetId id, Double oidImapDet) {
		this.id = id;
		this.oidImapDet = oidImapDet;
	}

	/** full constructor */
	public AbstractImapDet(ImapDetId id, Boolean imapLineCont, String imapData,
			Date imapModDate, String imapModUserid, String imapUser1,
			String imapUser2, Double imapDec01, Double imapDec02,
			Integer imapInt01, Integer imapInt02, Boolean imapLog01,
			Boolean imapLog02, Date imapDte01, Date imapDte02,
			String imapQadc01, String imapQadc02, String imapQadc03,
			String imapQadc04, Double imapQadd01, Double imapQadd02,
			Integer imapQadi01, Integer imapQadi02, Boolean imapQadl01,
			Boolean imapQadl02, Date imapQadt01, Date imapQadt02,
			Double oidImapDet) {
		this.id = id;
		this.imapLineCont = imapLineCont;
		this.imapData = imapData;
		this.imapModDate = imapModDate;
		this.imapModUserid = imapModUserid;
		this.imapUser1 = imapUser1;
		this.imapUser2 = imapUser2;
		this.imapDec01 = imapDec01;
		this.imapDec02 = imapDec02;
		this.imapInt01 = imapInt01;
		this.imapInt02 = imapInt02;
		this.imapLog01 = imapLog01;
		this.imapLog02 = imapLog02;
		this.imapDte01 = imapDte01;
		this.imapDte02 = imapDte02;
		this.imapQadc01 = imapQadc01;
		this.imapQadc02 = imapQadc02;
		this.imapQadc03 = imapQadc03;
		this.imapQadc04 = imapQadc04;
		this.imapQadd01 = imapQadd01;
		this.imapQadd02 = imapQadd02;
		this.imapQadi01 = imapQadi01;
		this.imapQadi02 = imapQadi02;
		this.imapQadl01 = imapQadl01;
		this.imapQadl02 = imapQadl02;
		this.imapQadt01 = imapQadt01;
		this.imapQadt02 = imapQadt02;
		this.oidImapDet = oidImapDet;
	}

	// Property accessors

	public ImapDetId getId() {
		return this.id;
	}

	public void setId(ImapDetId id) {
		this.id = id;
	}

	public Boolean getImapLineCont() {
		return this.imapLineCont;
	}

	public void setImapLineCont(Boolean imapLineCont) {
		this.imapLineCont = imapLineCont;
	}

	public String getImapData() {
		return this.imapData;
	}

	public void setImapData(String imapData) {
		this.imapData = imapData;
	}

	public Date getImapModDate() {
		return this.imapModDate;
	}

	public void setImapModDate(Date imapModDate) {
		this.imapModDate = imapModDate;
	}

	public String getImapModUserid() {
		return this.imapModUserid;
	}

	public void setImapModUserid(String imapModUserid) {
		this.imapModUserid = imapModUserid;
	}

	public String getImapUser1() {
		return this.imapUser1;
	}

	public void setImapUser1(String imapUser1) {
		this.imapUser1 = imapUser1;
	}

	public String getImapUser2() {
		return this.imapUser2;
	}

	public void setImapUser2(String imapUser2) {
		this.imapUser2 = imapUser2;
	}

	public Double getImapDec01() {
		return this.imapDec01;
	}

	public void setImapDec01(Double imapDec01) {
		this.imapDec01 = imapDec01;
	}

	public Double getImapDec02() {
		return this.imapDec02;
	}

	public void setImapDec02(Double imapDec02) {
		this.imapDec02 = imapDec02;
	}

	public Integer getImapInt01() {
		return this.imapInt01;
	}

	public void setImapInt01(Integer imapInt01) {
		this.imapInt01 = imapInt01;
	}

	public Integer getImapInt02() {
		return this.imapInt02;
	}

	public void setImapInt02(Integer imapInt02) {
		this.imapInt02 = imapInt02;
	}

	public Boolean getImapLog01() {
		return this.imapLog01;
	}

	public void setImapLog01(Boolean imapLog01) {
		this.imapLog01 = imapLog01;
	}

	public Boolean getImapLog02() {
		return this.imapLog02;
	}

	public void setImapLog02(Boolean imapLog02) {
		this.imapLog02 = imapLog02;
	}

	public Date getImapDte01() {
		return this.imapDte01;
	}

	public void setImapDte01(Date imapDte01) {
		this.imapDte01 = imapDte01;
	}

	public Date getImapDte02() {
		return this.imapDte02;
	}

	public void setImapDte02(Date imapDte02) {
		this.imapDte02 = imapDte02;
	}

	public String getImapQadc01() {
		return this.imapQadc01;
	}

	public void setImapQadc01(String imapQadc01) {
		this.imapQadc01 = imapQadc01;
	}

	public String getImapQadc02() {
		return this.imapQadc02;
	}

	public void setImapQadc02(String imapQadc02) {
		this.imapQadc02 = imapQadc02;
	}

	public String getImapQadc03() {
		return this.imapQadc03;
	}

	public void setImapQadc03(String imapQadc03) {
		this.imapQadc03 = imapQadc03;
	}

	public String getImapQadc04() {
		return this.imapQadc04;
	}

	public void setImapQadc04(String imapQadc04) {
		this.imapQadc04 = imapQadc04;
	}

	public Double getImapQadd01() {
		return this.imapQadd01;
	}

	public void setImapQadd01(Double imapQadd01) {
		this.imapQadd01 = imapQadd01;
	}

	public Double getImapQadd02() {
		return this.imapQadd02;
	}

	public void setImapQadd02(Double imapQadd02) {
		this.imapQadd02 = imapQadd02;
	}

	public Integer getImapQadi01() {
		return this.imapQadi01;
	}

	public void setImapQadi01(Integer imapQadi01) {
		this.imapQadi01 = imapQadi01;
	}

	public Integer getImapQadi02() {
		return this.imapQadi02;
	}

	public void setImapQadi02(Integer imapQadi02) {
		this.imapQadi02 = imapQadi02;
	}

	public Boolean getImapQadl01() {
		return this.imapQadl01;
	}

	public void setImapQadl01(Boolean imapQadl01) {
		this.imapQadl01 = imapQadl01;
	}

	public Boolean getImapQadl02() {
		return this.imapQadl02;
	}

	public void setImapQadl02(Boolean imapQadl02) {
		this.imapQadl02 = imapQadl02;
	}

	public Date getImapQadt01() {
		return this.imapQadt01;
	}

	public void setImapQadt01(Date imapQadt01) {
		this.imapQadt01 = imapQadt01;
	}

	public Date getImapQadt02() {
		return this.imapQadt02;
	}

	public void setImapQadt02(Date imapQadt02) {
		this.imapQadt02 = imapQadt02;
	}

	public Double getOidImapDet() {
		return this.oidImapDet;
	}

	public void setOidImapDet(Double oidImapDet) {
		this.oidImapDet = oidImapDet;
	}

}