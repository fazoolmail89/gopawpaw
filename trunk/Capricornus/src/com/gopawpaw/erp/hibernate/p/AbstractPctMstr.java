package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPctMstr entity provides the base persistence definition of the
 * PctMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPctMstr implements java.io.Serializable {

	// Fields

	private PctMstrId id;
	private String pctDesc;
	private String pctApproval;
	private String pctDistr;
	private String pctPrefix;
	private Integer pctDcWarn;
	private String pctUser1;
	private String pctUser2;
	private Boolean pctQad01;
	private Date pctQad02;
	private String pctQad03;
	private String pctQad04;
	private String pctQad05;
	private Date pctModDate;
	private String pctUserid;
	private String pctSecureText;
	private String pctSecureItem;
	private String pctSecureStct;
	private String pctSecureRouting;
	private String pctSecureAdmn;
	private Boolean pctSeqrevOff;
	private String pctDocType;
	private Double oidPctMstr;

	// Constructors

	/** default constructor */
	public AbstractPctMstr() {
	}

	/** minimal constructor */
	public AbstractPctMstr(PctMstrId id, String pctDesc, String pctApproval,
			String pctDistr, String pctPrefix, Integer pctDcWarn,
			String pctUser1, String pctUser2, Boolean pctQad01,
			String pctQad03, String pctQad04, String pctQad05,
			String pctUserid, String pctSecureText, String pctSecureItem,
			String pctSecureStct, String pctSecureRouting,
			String pctSecureAdmn, Boolean pctSeqrevOff, String pctDocType,
			Double oidPctMstr) {
		this.id = id;
		this.pctDesc = pctDesc;
		this.pctApproval = pctApproval;
		this.pctDistr = pctDistr;
		this.pctPrefix = pctPrefix;
		this.pctDcWarn = pctDcWarn;
		this.pctUser1 = pctUser1;
		this.pctUser2 = pctUser2;
		this.pctQad01 = pctQad01;
		this.pctQad03 = pctQad03;
		this.pctQad04 = pctQad04;
		this.pctQad05 = pctQad05;
		this.pctUserid = pctUserid;
		this.pctSecureText = pctSecureText;
		this.pctSecureItem = pctSecureItem;
		this.pctSecureStct = pctSecureStct;
		this.pctSecureRouting = pctSecureRouting;
		this.pctSecureAdmn = pctSecureAdmn;
		this.pctSeqrevOff = pctSeqrevOff;
		this.pctDocType = pctDocType;
		this.oidPctMstr = oidPctMstr;
	}

	/** full constructor */
	public AbstractPctMstr(PctMstrId id, String pctDesc, String pctApproval,
			String pctDistr, String pctPrefix, Integer pctDcWarn,
			String pctUser1, String pctUser2, Boolean pctQad01, Date pctQad02,
			String pctQad03, String pctQad04, String pctQad05, Date pctModDate,
			String pctUserid, String pctSecureText, String pctSecureItem,
			String pctSecureStct, String pctSecureRouting,
			String pctSecureAdmn, Boolean pctSeqrevOff, String pctDocType,
			Double oidPctMstr) {
		this.id = id;
		this.pctDesc = pctDesc;
		this.pctApproval = pctApproval;
		this.pctDistr = pctDistr;
		this.pctPrefix = pctPrefix;
		this.pctDcWarn = pctDcWarn;
		this.pctUser1 = pctUser1;
		this.pctUser2 = pctUser2;
		this.pctQad01 = pctQad01;
		this.pctQad02 = pctQad02;
		this.pctQad03 = pctQad03;
		this.pctQad04 = pctQad04;
		this.pctQad05 = pctQad05;
		this.pctModDate = pctModDate;
		this.pctUserid = pctUserid;
		this.pctSecureText = pctSecureText;
		this.pctSecureItem = pctSecureItem;
		this.pctSecureStct = pctSecureStct;
		this.pctSecureRouting = pctSecureRouting;
		this.pctSecureAdmn = pctSecureAdmn;
		this.pctSeqrevOff = pctSeqrevOff;
		this.pctDocType = pctDocType;
		this.oidPctMstr = oidPctMstr;
	}

	// Property accessors

	public PctMstrId getId() {
		return this.id;
	}

	public void setId(PctMstrId id) {
		this.id = id;
	}

	public String getPctDesc() {
		return this.pctDesc;
	}

	public void setPctDesc(String pctDesc) {
		this.pctDesc = pctDesc;
	}

	public String getPctApproval() {
		return this.pctApproval;
	}

	public void setPctApproval(String pctApproval) {
		this.pctApproval = pctApproval;
	}

	public String getPctDistr() {
		return this.pctDistr;
	}

	public void setPctDistr(String pctDistr) {
		this.pctDistr = pctDistr;
	}

	public String getPctPrefix() {
		return this.pctPrefix;
	}

	public void setPctPrefix(String pctPrefix) {
		this.pctPrefix = pctPrefix;
	}

	public Integer getPctDcWarn() {
		return this.pctDcWarn;
	}

	public void setPctDcWarn(Integer pctDcWarn) {
		this.pctDcWarn = pctDcWarn;
	}

	public String getPctUser1() {
		return this.pctUser1;
	}

	public void setPctUser1(String pctUser1) {
		this.pctUser1 = pctUser1;
	}

	public String getPctUser2() {
		return this.pctUser2;
	}

	public void setPctUser2(String pctUser2) {
		this.pctUser2 = pctUser2;
	}

	public Boolean getPctQad01() {
		return this.pctQad01;
	}

	public void setPctQad01(Boolean pctQad01) {
		this.pctQad01 = pctQad01;
	}

	public Date getPctQad02() {
		return this.pctQad02;
	}

	public void setPctQad02(Date pctQad02) {
		this.pctQad02 = pctQad02;
	}

	public String getPctQad03() {
		return this.pctQad03;
	}

	public void setPctQad03(String pctQad03) {
		this.pctQad03 = pctQad03;
	}

	public String getPctQad04() {
		return this.pctQad04;
	}

	public void setPctQad04(String pctQad04) {
		this.pctQad04 = pctQad04;
	}

	public String getPctQad05() {
		return this.pctQad05;
	}

	public void setPctQad05(String pctQad05) {
		this.pctQad05 = pctQad05;
	}

	public Date getPctModDate() {
		return this.pctModDate;
	}

	public void setPctModDate(Date pctModDate) {
		this.pctModDate = pctModDate;
	}

	public String getPctUserid() {
		return this.pctUserid;
	}

	public void setPctUserid(String pctUserid) {
		this.pctUserid = pctUserid;
	}

	public String getPctSecureText() {
		return this.pctSecureText;
	}

	public void setPctSecureText(String pctSecureText) {
		this.pctSecureText = pctSecureText;
	}

	public String getPctSecureItem() {
		return this.pctSecureItem;
	}

	public void setPctSecureItem(String pctSecureItem) {
		this.pctSecureItem = pctSecureItem;
	}

	public String getPctSecureStct() {
		return this.pctSecureStct;
	}

	public void setPctSecureStct(String pctSecureStct) {
		this.pctSecureStct = pctSecureStct;
	}

	public String getPctSecureRouting() {
		return this.pctSecureRouting;
	}

	public void setPctSecureRouting(String pctSecureRouting) {
		this.pctSecureRouting = pctSecureRouting;
	}

	public String getPctSecureAdmn() {
		return this.pctSecureAdmn;
	}

	public void setPctSecureAdmn(String pctSecureAdmn) {
		this.pctSecureAdmn = pctSecureAdmn;
	}

	public Boolean getPctSeqrevOff() {
		return this.pctSeqrevOff;
	}

	public void setPctSeqrevOff(Boolean pctSeqrevOff) {
		this.pctSeqrevOff = pctSeqrevOff;
	}

	public String getPctDocType() {
		return this.pctDocType;
	}

	public void setPctDocType(String pctDocType) {
		this.pctDocType = pctDocType;
	}

	public Double getOidPctMstr() {
		return this.oidPctMstr;
	}

	public void setOidPctMstr(Double oidPctMstr) {
		this.oidPctMstr = oidPctMstr;
	}

}