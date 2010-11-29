package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractIvsCtrl entity provides the base persistence definition of the
 * IvsCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIvsCtrl implements java.io.Serializable {

	// Fields

	private String ivsDomain;
	private Integer ivsIndex1;
	private Boolean ivsCmmts;
	private String ivsSoPre;
	private Integer ivsSoNbr;
	private String ivsArAcct;
	private String ivsArSub;
	private String ivsArCc;
	private String ivsPrepAcct;
	private String ivsPrepSub;
	private String ivsPrepCc;
	private String ivsPtaxAcct;
	private String ivsPtaxSub;
	private String ivsPtaxCc;
	private String ivsInvType;
	private Date ivsModDate;
	private String ivsModUserid;
	private String ivsUser1;
	private String ivsUser2;
	private String ivsQadc01;
	private Double ivsQadd01;
	private Integer ivsQadi01;
	private Boolean ivsQadl01;
	private Date ivsQadt01;
	private Double oidIvsCtrl;

	// Constructors

	/** default constructor */
	public AbstractIvsCtrl() {
	}

	/** minimal constructor */
	public AbstractIvsCtrl(Integer ivsIndex1, Boolean ivsCmmts,
			String ivsSoPre, Integer ivsSoNbr, String ivsArAcct,
			String ivsArSub, String ivsArCc, String ivsPrepAcct,
			String ivsPrepSub, String ivsPrepCc, String ivsPtaxAcct,
			String ivsPtaxSub, String ivsPtaxCc, String ivsInvType,
			Date ivsModDate, String ivsModUserid, Double oidIvsCtrl) {
		this.ivsIndex1 = ivsIndex1;
		this.ivsCmmts = ivsCmmts;
		this.ivsSoPre = ivsSoPre;
		this.ivsSoNbr = ivsSoNbr;
		this.ivsArAcct = ivsArAcct;
		this.ivsArSub = ivsArSub;
		this.ivsArCc = ivsArCc;
		this.ivsPrepAcct = ivsPrepAcct;
		this.ivsPrepSub = ivsPrepSub;
		this.ivsPrepCc = ivsPrepCc;
		this.ivsPtaxAcct = ivsPtaxAcct;
		this.ivsPtaxSub = ivsPtaxSub;
		this.ivsPtaxCc = ivsPtaxCc;
		this.ivsInvType = ivsInvType;
		this.ivsModDate = ivsModDate;
		this.ivsModUserid = ivsModUserid;
		this.oidIvsCtrl = oidIvsCtrl;
	}

	/** full constructor */
	public AbstractIvsCtrl(Integer ivsIndex1, Boolean ivsCmmts,
			String ivsSoPre, Integer ivsSoNbr, String ivsArAcct,
			String ivsArSub, String ivsArCc, String ivsPrepAcct,
			String ivsPrepSub, String ivsPrepCc, String ivsPtaxAcct,
			String ivsPtaxSub, String ivsPtaxCc, String ivsInvType,
			Date ivsModDate, String ivsModUserid, String ivsUser1,
			String ivsUser2, String ivsQadc01, Double ivsQadd01,
			Integer ivsQadi01, Boolean ivsQadl01, Date ivsQadt01,
			Double oidIvsCtrl) {
		this.ivsIndex1 = ivsIndex1;
		this.ivsCmmts = ivsCmmts;
		this.ivsSoPre = ivsSoPre;
		this.ivsSoNbr = ivsSoNbr;
		this.ivsArAcct = ivsArAcct;
		this.ivsArSub = ivsArSub;
		this.ivsArCc = ivsArCc;
		this.ivsPrepAcct = ivsPrepAcct;
		this.ivsPrepSub = ivsPrepSub;
		this.ivsPrepCc = ivsPrepCc;
		this.ivsPtaxAcct = ivsPtaxAcct;
		this.ivsPtaxSub = ivsPtaxSub;
		this.ivsPtaxCc = ivsPtaxCc;
		this.ivsInvType = ivsInvType;
		this.ivsModDate = ivsModDate;
		this.ivsModUserid = ivsModUserid;
		this.ivsUser1 = ivsUser1;
		this.ivsUser2 = ivsUser2;
		this.ivsQadc01 = ivsQadc01;
		this.ivsQadd01 = ivsQadd01;
		this.ivsQadi01 = ivsQadi01;
		this.ivsQadl01 = ivsQadl01;
		this.ivsQadt01 = ivsQadt01;
		this.oidIvsCtrl = oidIvsCtrl;
	}

	// Property accessors

	public String getIvsDomain() {
		return this.ivsDomain;
	}

	public void setIvsDomain(String ivsDomain) {
		this.ivsDomain = ivsDomain;
	}

	public Integer getIvsIndex1() {
		return this.ivsIndex1;
	}

	public void setIvsIndex1(Integer ivsIndex1) {
		this.ivsIndex1 = ivsIndex1;
	}

	public Boolean getIvsCmmts() {
		return this.ivsCmmts;
	}

	public void setIvsCmmts(Boolean ivsCmmts) {
		this.ivsCmmts = ivsCmmts;
	}

	public String getIvsSoPre() {
		return this.ivsSoPre;
	}

	public void setIvsSoPre(String ivsSoPre) {
		this.ivsSoPre = ivsSoPre;
	}

	public Integer getIvsSoNbr() {
		return this.ivsSoNbr;
	}

	public void setIvsSoNbr(Integer ivsSoNbr) {
		this.ivsSoNbr = ivsSoNbr;
	}

	public String getIvsArAcct() {
		return this.ivsArAcct;
	}

	public void setIvsArAcct(String ivsArAcct) {
		this.ivsArAcct = ivsArAcct;
	}

	public String getIvsArSub() {
		return this.ivsArSub;
	}

	public void setIvsArSub(String ivsArSub) {
		this.ivsArSub = ivsArSub;
	}

	public String getIvsArCc() {
		return this.ivsArCc;
	}

	public void setIvsArCc(String ivsArCc) {
		this.ivsArCc = ivsArCc;
	}

	public String getIvsPrepAcct() {
		return this.ivsPrepAcct;
	}

	public void setIvsPrepAcct(String ivsPrepAcct) {
		this.ivsPrepAcct = ivsPrepAcct;
	}

	public String getIvsPrepSub() {
		return this.ivsPrepSub;
	}

	public void setIvsPrepSub(String ivsPrepSub) {
		this.ivsPrepSub = ivsPrepSub;
	}

	public String getIvsPrepCc() {
		return this.ivsPrepCc;
	}

	public void setIvsPrepCc(String ivsPrepCc) {
		this.ivsPrepCc = ivsPrepCc;
	}

	public String getIvsPtaxAcct() {
		return this.ivsPtaxAcct;
	}

	public void setIvsPtaxAcct(String ivsPtaxAcct) {
		this.ivsPtaxAcct = ivsPtaxAcct;
	}

	public String getIvsPtaxSub() {
		return this.ivsPtaxSub;
	}

	public void setIvsPtaxSub(String ivsPtaxSub) {
		this.ivsPtaxSub = ivsPtaxSub;
	}

	public String getIvsPtaxCc() {
		return this.ivsPtaxCc;
	}

	public void setIvsPtaxCc(String ivsPtaxCc) {
		this.ivsPtaxCc = ivsPtaxCc;
	}

	public String getIvsInvType() {
		return this.ivsInvType;
	}

	public void setIvsInvType(String ivsInvType) {
		this.ivsInvType = ivsInvType;
	}

	public Date getIvsModDate() {
		return this.ivsModDate;
	}

	public void setIvsModDate(Date ivsModDate) {
		this.ivsModDate = ivsModDate;
	}

	public String getIvsModUserid() {
		return this.ivsModUserid;
	}

	public void setIvsModUserid(String ivsModUserid) {
		this.ivsModUserid = ivsModUserid;
	}

	public String getIvsUser1() {
		return this.ivsUser1;
	}

	public void setIvsUser1(String ivsUser1) {
		this.ivsUser1 = ivsUser1;
	}

	public String getIvsUser2() {
		return this.ivsUser2;
	}

	public void setIvsUser2(String ivsUser2) {
		this.ivsUser2 = ivsUser2;
	}

	public String getIvsQadc01() {
		return this.ivsQadc01;
	}

	public void setIvsQadc01(String ivsQadc01) {
		this.ivsQadc01 = ivsQadc01;
	}

	public Double getIvsQadd01() {
		return this.ivsQadd01;
	}

	public void setIvsQadd01(Double ivsQadd01) {
		this.ivsQadd01 = ivsQadd01;
	}

	public Integer getIvsQadi01() {
		return this.ivsQadi01;
	}

	public void setIvsQadi01(Integer ivsQadi01) {
		this.ivsQadi01 = ivsQadi01;
	}

	public Boolean getIvsQadl01() {
		return this.ivsQadl01;
	}

	public void setIvsQadl01(Boolean ivsQadl01) {
		this.ivsQadl01 = ivsQadl01;
	}

	public Date getIvsQadt01() {
		return this.ivsQadt01;
	}

	public void setIvsQadt01(Date ivsQadt01) {
		this.ivsQadt01 = ivsQadt01;
	}

	public Double getOidIvsCtrl() {
		return this.oidIvsCtrl;
	}

	public void setOidIvsCtrl(Double oidIvsCtrl) {
		this.oidIvsCtrl = oidIvsCtrl;
	}

}