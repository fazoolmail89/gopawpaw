package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractApMstr entity provides the base persistence definition of the ApMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractApMstr implements java.io.Serializable {

	// Fields

	private ApMstrId id;
	private String apBatch;
	private String apVend;
	private Date apEffdate;
	private Date apDate;
	private Double apAmt;
	private String apAcct;
	private String apCc;
	private String apDiscAcct;
	private String apDiscCc;
	private Boolean apOpen;
	private String apRmk;
	private String apUser1;
	private String apUser2;
	private String apCurr;
	private Double apExRate;
	private String apBank;
	private String apSort;
	private Date apExptDate;
	private String apEntity;
	private Double apEntEx;
	private String apCkfrm;
	private String apQad01;
	private String apQad02;
	private Boolean apQad03;
	private String apDyCode;
	private String apRemit;
	private Double apExRate2;
	private String apExRatetype;
	private Double apBaseAmt;
	private Integer apExruSeq;
	private String apSub;
	private String apDiscSub;
	private String apUnappliedRef;
	private Double oidApMstr;

	// Constructors

	/** default constructor */
	public AbstractApMstr() {
	}

	/** minimal constructor */
	public AbstractApMstr(ApMstrId id, String apDyCode, String apRemit,
			Double apExRate2, String apExRatetype, Double apBaseAmt,
			Integer apExruSeq, String apUnappliedRef, Double oidApMstr) {
		this.id = id;
		this.apDyCode = apDyCode;
		this.apRemit = apRemit;
		this.apExRate2 = apExRate2;
		this.apExRatetype = apExRatetype;
		this.apBaseAmt = apBaseAmt;
		this.apExruSeq = apExruSeq;
		this.apUnappliedRef = apUnappliedRef;
		this.oidApMstr = oidApMstr;
	}

	/** full constructor */
	public AbstractApMstr(ApMstrId id, String apBatch, String apVend,
			Date apEffdate, Date apDate, Double apAmt, String apAcct,
			String apCc, String apDiscAcct, String apDiscCc, Boolean apOpen,
			String apRmk, String apUser1, String apUser2, String apCurr,
			Double apExRate, String apBank, String apSort, Date apExptDate,
			String apEntity, Double apEntEx, String apCkfrm, String apQad01,
			String apQad02, Boolean apQad03, String apDyCode, String apRemit,
			Double apExRate2, String apExRatetype, Double apBaseAmt,
			Integer apExruSeq, String apSub, String apDiscSub,
			String apUnappliedRef, Double oidApMstr) {
		this.id = id;
		this.apBatch = apBatch;
		this.apVend = apVend;
		this.apEffdate = apEffdate;
		this.apDate = apDate;
		this.apAmt = apAmt;
		this.apAcct = apAcct;
		this.apCc = apCc;
		this.apDiscAcct = apDiscAcct;
		this.apDiscCc = apDiscCc;
		this.apOpen = apOpen;
		this.apRmk = apRmk;
		this.apUser1 = apUser1;
		this.apUser2 = apUser2;
		this.apCurr = apCurr;
		this.apExRate = apExRate;
		this.apBank = apBank;
		this.apSort = apSort;
		this.apExptDate = apExptDate;
		this.apEntity = apEntity;
		this.apEntEx = apEntEx;
		this.apCkfrm = apCkfrm;
		this.apQad01 = apQad01;
		this.apQad02 = apQad02;
		this.apQad03 = apQad03;
		this.apDyCode = apDyCode;
		this.apRemit = apRemit;
		this.apExRate2 = apExRate2;
		this.apExRatetype = apExRatetype;
		this.apBaseAmt = apBaseAmt;
		this.apExruSeq = apExruSeq;
		this.apSub = apSub;
		this.apDiscSub = apDiscSub;
		this.apUnappliedRef = apUnappliedRef;
		this.oidApMstr = oidApMstr;
	}

	// Property accessors

	public ApMstrId getId() {
		return this.id;
	}

	public void setId(ApMstrId id) {
		this.id = id;
	}

	public String getApBatch() {
		return this.apBatch;
	}

	public void setApBatch(String apBatch) {
		this.apBatch = apBatch;
	}

	public String getApVend() {
		return this.apVend;
	}

	public void setApVend(String apVend) {
		this.apVend = apVend;
	}

	public Date getApEffdate() {
		return this.apEffdate;
	}

	public void setApEffdate(Date apEffdate) {
		this.apEffdate = apEffdate;
	}

	public Date getApDate() {
		return this.apDate;
	}

	public void setApDate(Date apDate) {
		this.apDate = apDate;
	}

	public Double getApAmt() {
		return this.apAmt;
	}

	public void setApAmt(Double apAmt) {
		this.apAmt = apAmt;
	}

	public String getApAcct() {
		return this.apAcct;
	}

	public void setApAcct(String apAcct) {
		this.apAcct = apAcct;
	}

	public String getApCc() {
		return this.apCc;
	}

	public void setApCc(String apCc) {
		this.apCc = apCc;
	}

	public String getApDiscAcct() {
		return this.apDiscAcct;
	}

	public void setApDiscAcct(String apDiscAcct) {
		this.apDiscAcct = apDiscAcct;
	}

	public String getApDiscCc() {
		return this.apDiscCc;
	}

	public void setApDiscCc(String apDiscCc) {
		this.apDiscCc = apDiscCc;
	}

	public Boolean getApOpen() {
		return this.apOpen;
	}

	public void setApOpen(Boolean apOpen) {
		this.apOpen = apOpen;
	}

	public String getApRmk() {
		return this.apRmk;
	}

	public void setApRmk(String apRmk) {
		this.apRmk = apRmk;
	}

	public String getApUser1() {
		return this.apUser1;
	}

	public void setApUser1(String apUser1) {
		this.apUser1 = apUser1;
	}

	public String getApUser2() {
		return this.apUser2;
	}

	public void setApUser2(String apUser2) {
		this.apUser2 = apUser2;
	}

	public String getApCurr() {
		return this.apCurr;
	}

	public void setApCurr(String apCurr) {
		this.apCurr = apCurr;
	}

	public Double getApExRate() {
		return this.apExRate;
	}

	public void setApExRate(Double apExRate) {
		this.apExRate = apExRate;
	}

	public String getApBank() {
		return this.apBank;
	}

	public void setApBank(String apBank) {
		this.apBank = apBank;
	}

	public String getApSort() {
		return this.apSort;
	}

	public void setApSort(String apSort) {
		this.apSort = apSort;
	}

	public Date getApExptDate() {
		return this.apExptDate;
	}

	public void setApExptDate(Date apExptDate) {
		this.apExptDate = apExptDate;
	}

	public String getApEntity() {
		return this.apEntity;
	}

	public void setApEntity(String apEntity) {
		this.apEntity = apEntity;
	}

	public Double getApEntEx() {
		return this.apEntEx;
	}

	public void setApEntEx(Double apEntEx) {
		this.apEntEx = apEntEx;
	}

	public String getApCkfrm() {
		return this.apCkfrm;
	}

	public void setApCkfrm(String apCkfrm) {
		this.apCkfrm = apCkfrm;
	}

	public String getApQad01() {
		return this.apQad01;
	}

	public void setApQad01(String apQad01) {
		this.apQad01 = apQad01;
	}

	public String getApQad02() {
		return this.apQad02;
	}

	public void setApQad02(String apQad02) {
		this.apQad02 = apQad02;
	}

	public Boolean getApQad03() {
		return this.apQad03;
	}

	public void setApQad03(Boolean apQad03) {
		this.apQad03 = apQad03;
	}

	public String getApDyCode() {
		return this.apDyCode;
	}

	public void setApDyCode(String apDyCode) {
		this.apDyCode = apDyCode;
	}

	public String getApRemit() {
		return this.apRemit;
	}

	public void setApRemit(String apRemit) {
		this.apRemit = apRemit;
	}

	public Double getApExRate2() {
		return this.apExRate2;
	}

	public void setApExRate2(Double apExRate2) {
		this.apExRate2 = apExRate2;
	}

	public String getApExRatetype() {
		return this.apExRatetype;
	}

	public void setApExRatetype(String apExRatetype) {
		this.apExRatetype = apExRatetype;
	}

	public Double getApBaseAmt() {
		return this.apBaseAmt;
	}

	public void setApBaseAmt(Double apBaseAmt) {
		this.apBaseAmt = apBaseAmt;
	}

	public Integer getApExruSeq() {
		return this.apExruSeq;
	}

	public void setApExruSeq(Integer apExruSeq) {
		this.apExruSeq = apExruSeq;
	}

	public String getApSub() {
		return this.apSub;
	}

	public void setApSub(String apSub) {
		this.apSub = apSub;
	}

	public String getApDiscSub() {
		return this.apDiscSub;
	}

	public void setApDiscSub(String apDiscSub) {
		this.apDiscSub = apDiscSub;
	}

	public String getApUnappliedRef() {
		return this.apUnappliedRef;
	}

	public void setApUnappliedRef(String apUnappliedRef) {
		this.apUnappliedRef = apUnappliedRef;
	}

	public Double getOidApMstr() {
		return this.oidApMstr;
	}

	public void setOidApMstr(Double oidApMstr) {
		this.oidApMstr = oidApMstr;
	}

}