package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSeqMstr entity provides the base persistence definition of the
 * SeqMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSeqMstr implements java.io.Serializable {

	// Fields

	private SeqMstrId id;
	private Double seqQtyReq;
	private Date seqStart;
	private Date seqRelease;
	private Double seqPriority;
	private Boolean seqMode;
	private Double seqModeQty;
	private Boolean seqType;
	private Integer seqShift1;
	private Double seqShift2;
	private Double seqShift3;
	private Double seqShift4;
	private String seqUser1;
	private String seqUser2;
	private String seqChr01;
	private String seqChr02;
	private String seqChr03;
	private String seqChr04;
	private String seqChr05;
	private Double seqDec01;
	private Double seqDec02;
	private Double seqDec03;
	private Boolean seqLog01;
	private Double oidSeqMstr;

	// Constructors

	/** default constructor */
	public AbstractSeqMstr() {
	}

	/** minimal constructor */
	public AbstractSeqMstr(SeqMstrId id, Double oidSeqMstr) {
		this.id = id;
		this.oidSeqMstr = oidSeqMstr;
	}

	/** full constructor */
	public AbstractSeqMstr(SeqMstrId id, Double seqQtyReq, Date seqStart,
			Date seqRelease, Double seqPriority, Boolean seqMode,
			Double seqModeQty, Boolean seqType, Integer seqShift1,
			Double seqShift2, Double seqShift3, Double seqShift4,
			String seqUser1, String seqUser2, String seqChr01, String seqChr02,
			String seqChr03, String seqChr04, String seqChr05, Double seqDec01,
			Double seqDec02, Double seqDec03, Boolean seqLog01,
			Double oidSeqMstr) {
		this.id = id;
		this.seqQtyReq = seqQtyReq;
		this.seqStart = seqStart;
		this.seqRelease = seqRelease;
		this.seqPriority = seqPriority;
		this.seqMode = seqMode;
		this.seqModeQty = seqModeQty;
		this.seqType = seqType;
		this.seqShift1 = seqShift1;
		this.seqShift2 = seqShift2;
		this.seqShift3 = seqShift3;
		this.seqShift4 = seqShift4;
		this.seqUser1 = seqUser1;
		this.seqUser2 = seqUser2;
		this.seqChr01 = seqChr01;
		this.seqChr02 = seqChr02;
		this.seqChr03 = seqChr03;
		this.seqChr04 = seqChr04;
		this.seqChr05 = seqChr05;
		this.seqDec01 = seqDec01;
		this.seqDec02 = seqDec02;
		this.seqDec03 = seqDec03;
		this.seqLog01 = seqLog01;
		this.oidSeqMstr = oidSeqMstr;
	}

	// Property accessors

	public SeqMstrId getId() {
		return this.id;
	}

	public void setId(SeqMstrId id) {
		this.id = id;
	}

	public Double getSeqQtyReq() {
		return this.seqQtyReq;
	}

	public void setSeqQtyReq(Double seqQtyReq) {
		this.seqQtyReq = seqQtyReq;
	}

	public Date getSeqStart() {
		return this.seqStart;
	}

	public void setSeqStart(Date seqStart) {
		this.seqStart = seqStart;
	}

	public Date getSeqRelease() {
		return this.seqRelease;
	}

	public void setSeqRelease(Date seqRelease) {
		this.seqRelease = seqRelease;
	}

	public Double getSeqPriority() {
		return this.seqPriority;
	}

	public void setSeqPriority(Double seqPriority) {
		this.seqPriority = seqPriority;
	}

	public Boolean getSeqMode() {
		return this.seqMode;
	}

	public void setSeqMode(Boolean seqMode) {
		this.seqMode = seqMode;
	}

	public Double getSeqModeQty() {
		return this.seqModeQty;
	}

	public void setSeqModeQty(Double seqModeQty) {
		this.seqModeQty = seqModeQty;
	}

	public Boolean getSeqType() {
		return this.seqType;
	}

	public void setSeqType(Boolean seqType) {
		this.seqType = seqType;
	}

	public Integer getSeqShift1() {
		return this.seqShift1;
	}

	public void setSeqShift1(Integer seqShift1) {
		this.seqShift1 = seqShift1;
	}

	public Double getSeqShift2() {
		return this.seqShift2;
	}

	public void setSeqShift2(Double seqShift2) {
		this.seqShift2 = seqShift2;
	}

	public Double getSeqShift3() {
		return this.seqShift3;
	}

	public void setSeqShift3(Double seqShift3) {
		this.seqShift3 = seqShift3;
	}

	public Double getSeqShift4() {
		return this.seqShift4;
	}

	public void setSeqShift4(Double seqShift4) {
		this.seqShift4 = seqShift4;
	}

	public String getSeqUser1() {
		return this.seqUser1;
	}

	public void setSeqUser1(String seqUser1) {
		this.seqUser1 = seqUser1;
	}

	public String getSeqUser2() {
		return this.seqUser2;
	}

	public void setSeqUser2(String seqUser2) {
		this.seqUser2 = seqUser2;
	}

	public String getSeqChr01() {
		return this.seqChr01;
	}

	public void setSeqChr01(String seqChr01) {
		this.seqChr01 = seqChr01;
	}

	public String getSeqChr02() {
		return this.seqChr02;
	}

	public void setSeqChr02(String seqChr02) {
		this.seqChr02 = seqChr02;
	}

	public String getSeqChr03() {
		return this.seqChr03;
	}

	public void setSeqChr03(String seqChr03) {
		this.seqChr03 = seqChr03;
	}

	public String getSeqChr04() {
		return this.seqChr04;
	}

	public void setSeqChr04(String seqChr04) {
		this.seqChr04 = seqChr04;
	}

	public String getSeqChr05() {
		return this.seqChr05;
	}

	public void setSeqChr05(String seqChr05) {
		this.seqChr05 = seqChr05;
	}

	public Double getSeqDec01() {
		return this.seqDec01;
	}

	public void setSeqDec01(Double seqDec01) {
		this.seqDec01 = seqDec01;
	}

	public Double getSeqDec02() {
		return this.seqDec02;
	}

	public void setSeqDec02(Double seqDec02) {
		this.seqDec02 = seqDec02;
	}

	public Double getSeqDec03() {
		return this.seqDec03;
	}

	public void setSeqDec03(Double seqDec03) {
		this.seqDec03 = seqDec03;
	}

	public Boolean getSeqLog01() {
		return this.seqLog01;
	}

	public void setSeqLog01(Boolean seqLog01) {
		this.seqLog01 = seqLog01;
	}

	public Double getOidSeqMstr() {
		return this.oidSeqMstr;
	}

	public void setOidSeqMstr(Double oidSeqMstr) {
		this.oidSeqMstr = oidSeqMstr;
	}

}