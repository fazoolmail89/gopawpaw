package com.gopawpaw.erp.hibernate.u;

/**
 * AbstractUsrcCtrl entity provides the base persistence definition of the
 * UsrcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUsrcCtrl implements java.io.Serializable {

	// Fields

	private Integer usrcIndex1;
	private String usrcSecOpt;
	private String usrcSessId;
	private Integer usrcTimeoutMin;
	private Integer usrcExpireDays;
	private String usrcQad01;
	private String usrcQad02;
	private String usrcUser1;
	private String usrcUser2;
	private Integer usrcRightHdrDisp;
	private Integer usrcMaxAccessFails;
	private Integer usrcWarningDays;
	private Integer usrcMinLength;
	private Integer usrcMinNumeric;
	private Integer usrcReuseDays;
	private Integer usrcReuseChanges;
	private String usrcLogonHistLevel;
	private Integer usrcMinNonNumeric;
	private String usrcActiveRsnType;
	private String usrcDeactivationRsn;
	private String usrcPasswordCreate;
	private Double oidUsrgMstrAdmin;
	private String usrcEmSystemId;
	private Double oidUsrcCtrl;

	// Constructors

	/** default constructor */
	public AbstractUsrcCtrl() {
	}

	/** minimal constructor */
	public AbstractUsrcCtrl(Integer usrcRightHdrDisp,
			Integer usrcMaxAccessFails, Integer usrcWarningDays,
			Integer usrcMinLength, Integer usrcMinNumeric,
			Integer usrcReuseDays, Integer usrcReuseChanges,
			String usrcLogonHistLevel, Integer usrcMinNonNumeric,
			String usrcActiveRsnType, String usrcDeactivationRsn,
			String usrcPasswordCreate, Double oidUsrgMstrAdmin,
			String usrcEmSystemId, Double oidUsrcCtrl) {
		this.usrcRightHdrDisp = usrcRightHdrDisp;
		this.usrcMaxAccessFails = usrcMaxAccessFails;
		this.usrcWarningDays = usrcWarningDays;
		this.usrcMinLength = usrcMinLength;
		this.usrcMinNumeric = usrcMinNumeric;
		this.usrcReuseDays = usrcReuseDays;
		this.usrcReuseChanges = usrcReuseChanges;
		this.usrcLogonHistLevel = usrcLogonHistLevel;
		this.usrcMinNonNumeric = usrcMinNonNumeric;
		this.usrcActiveRsnType = usrcActiveRsnType;
		this.usrcDeactivationRsn = usrcDeactivationRsn;
		this.usrcPasswordCreate = usrcPasswordCreate;
		this.oidUsrgMstrAdmin = oidUsrgMstrAdmin;
		this.usrcEmSystemId = usrcEmSystemId;
		this.oidUsrcCtrl = oidUsrcCtrl;
	}

	/** full constructor */
	public AbstractUsrcCtrl(String usrcSecOpt, String usrcSessId,
			Integer usrcTimeoutMin, Integer usrcExpireDays, String usrcQad01,
			String usrcQad02, String usrcUser1, String usrcUser2,
			Integer usrcRightHdrDisp, Integer usrcMaxAccessFails,
			Integer usrcWarningDays, Integer usrcMinLength,
			Integer usrcMinNumeric, Integer usrcReuseDays,
			Integer usrcReuseChanges, String usrcLogonHistLevel,
			Integer usrcMinNonNumeric, String usrcActiveRsnType,
			String usrcDeactivationRsn, String usrcPasswordCreate,
			Double oidUsrgMstrAdmin, String usrcEmSystemId, Double oidUsrcCtrl) {
		this.usrcSecOpt = usrcSecOpt;
		this.usrcSessId = usrcSessId;
		this.usrcTimeoutMin = usrcTimeoutMin;
		this.usrcExpireDays = usrcExpireDays;
		this.usrcQad01 = usrcQad01;
		this.usrcQad02 = usrcQad02;
		this.usrcUser1 = usrcUser1;
		this.usrcUser2 = usrcUser2;
		this.usrcRightHdrDisp = usrcRightHdrDisp;
		this.usrcMaxAccessFails = usrcMaxAccessFails;
		this.usrcWarningDays = usrcWarningDays;
		this.usrcMinLength = usrcMinLength;
		this.usrcMinNumeric = usrcMinNumeric;
		this.usrcReuseDays = usrcReuseDays;
		this.usrcReuseChanges = usrcReuseChanges;
		this.usrcLogonHistLevel = usrcLogonHistLevel;
		this.usrcMinNonNumeric = usrcMinNonNumeric;
		this.usrcActiveRsnType = usrcActiveRsnType;
		this.usrcDeactivationRsn = usrcDeactivationRsn;
		this.usrcPasswordCreate = usrcPasswordCreate;
		this.oidUsrgMstrAdmin = oidUsrgMstrAdmin;
		this.usrcEmSystemId = usrcEmSystemId;
		this.oidUsrcCtrl = oidUsrcCtrl;
	}

	// Property accessors

	public Integer getUsrcIndex1() {
		return this.usrcIndex1;
	}

	public void setUsrcIndex1(Integer usrcIndex1) {
		this.usrcIndex1 = usrcIndex1;
	}

	public String getUsrcSecOpt() {
		return this.usrcSecOpt;
	}

	public void setUsrcSecOpt(String usrcSecOpt) {
		this.usrcSecOpt = usrcSecOpt;
	}

	public String getUsrcSessId() {
		return this.usrcSessId;
	}

	public void setUsrcSessId(String usrcSessId) {
		this.usrcSessId = usrcSessId;
	}

	public Integer getUsrcTimeoutMin() {
		return this.usrcTimeoutMin;
	}

	public void setUsrcTimeoutMin(Integer usrcTimeoutMin) {
		this.usrcTimeoutMin = usrcTimeoutMin;
	}

	public Integer getUsrcExpireDays() {
		return this.usrcExpireDays;
	}

	public void setUsrcExpireDays(Integer usrcExpireDays) {
		this.usrcExpireDays = usrcExpireDays;
	}

	public String getUsrcQad01() {
		return this.usrcQad01;
	}

	public void setUsrcQad01(String usrcQad01) {
		this.usrcQad01 = usrcQad01;
	}

	public String getUsrcQad02() {
		return this.usrcQad02;
	}

	public void setUsrcQad02(String usrcQad02) {
		this.usrcQad02 = usrcQad02;
	}

	public String getUsrcUser1() {
		return this.usrcUser1;
	}

	public void setUsrcUser1(String usrcUser1) {
		this.usrcUser1 = usrcUser1;
	}

	public String getUsrcUser2() {
		return this.usrcUser2;
	}

	public void setUsrcUser2(String usrcUser2) {
		this.usrcUser2 = usrcUser2;
	}

	public Integer getUsrcRightHdrDisp() {
		return this.usrcRightHdrDisp;
	}

	public void setUsrcRightHdrDisp(Integer usrcRightHdrDisp) {
		this.usrcRightHdrDisp = usrcRightHdrDisp;
	}

	public Integer getUsrcMaxAccessFails() {
		return this.usrcMaxAccessFails;
	}

	public void setUsrcMaxAccessFails(Integer usrcMaxAccessFails) {
		this.usrcMaxAccessFails = usrcMaxAccessFails;
	}

	public Integer getUsrcWarningDays() {
		return this.usrcWarningDays;
	}

	public void setUsrcWarningDays(Integer usrcWarningDays) {
		this.usrcWarningDays = usrcWarningDays;
	}

	public Integer getUsrcMinLength() {
		return this.usrcMinLength;
	}

	public void setUsrcMinLength(Integer usrcMinLength) {
		this.usrcMinLength = usrcMinLength;
	}

	public Integer getUsrcMinNumeric() {
		return this.usrcMinNumeric;
	}

	public void setUsrcMinNumeric(Integer usrcMinNumeric) {
		this.usrcMinNumeric = usrcMinNumeric;
	}

	public Integer getUsrcReuseDays() {
		return this.usrcReuseDays;
	}

	public void setUsrcReuseDays(Integer usrcReuseDays) {
		this.usrcReuseDays = usrcReuseDays;
	}

	public Integer getUsrcReuseChanges() {
		return this.usrcReuseChanges;
	}

	public void setUsrcReuseChanges(Integer usrcReuseChanges) {
		this.usrcReuseChanges = usrcReuseChanges;
	}

	public String getUsrcLogonHistLevel() {
		return this.usrcLogonHistLevel;
	}

	public void setUsrcLogonHistLevel(String usrcLogonHistLevel) {
		this.usrcLogonHistLevel = usrcLogonHistLevel;
	}

	public Integer getUsrcMinNonNumeric() {
		return this.usrcMinNonNumeric;
	}

	public void setUsrcMinNonNumeric(Integer usrcMinNonNumeric) {
		this.usrcMinNonNumeric = usrcMinNonNumeric;
	}

	public String getUsrcActiveRsnType() {
		return this.usrcActiveRsnType;
	}

	public void setUsrcActiveRsnType(String usrcActiveRsnType) {
		this.usrcActiveRsnType = usrcActiveRsnType;
	}

	public String getUsrcDeactivationRsn() {
		return this.usrcDeactivationRsn;
	}

	public void setUsrcDeactivationRsn(String usrcDeactivationRsn) {
		this.usrcDeactivationRsn = usrcDeactivationRsn;
	}

	public String getUsrcPasswordCreate() {
		return this.usrcPasswordCreate;
	}

	public void setUsrcPasswordCreate(String usrcPasswordCreate) {
		this.usrcPasswordCreate = usrcPasswordCreate;
	}

	public Double getOidUsrgMstrAdmin() {
		return this.oidUsrgMstrAdmin;
	}

	public void setOidUsrgMstrAdmin(Double oidUsrgMstrAdmin) {
		this.oidUsrgMstrAdmin = oidUsrgMstrAdmin;
	}

	public String getUsrcEmSystemId() {
		return this.usrcEmSystemId;
	}

	public void setUsrcEmSystemId(String usrcEmSystemId) {
		this.usrcEmSystemId = usrcEmSystemId;
	}

	public Double getOidUsrcCtrl() {
		return this.oidUsrcCtrl;
	}

	public void setOidUsrcCtrl(Double oidUsrcCtrl) {
		this.oidUsrcCtrl = oidUsrcCtrl;
	}

}