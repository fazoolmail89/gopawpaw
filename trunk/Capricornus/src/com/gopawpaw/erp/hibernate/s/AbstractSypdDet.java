package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSypdDet entity provides the base persistence definition of the
 * SypdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSypdDet implements java.io.Serializable {

	// Fields

	private SypdDetId id;
	private Integer sypdSeq;
	private Boolean sypdReqdAdd;
	private Boolean sypdReqdChgdel;
	private String sypdModUserid;
	private Date sypdModDate;
	private String sypdUser1;
	private String sypdUser2;
	private String sypdChr01;
	private String sypdChr02;
	private Double sypdDec01;
	private Double sypdDec02;
	private Integer sypdInt01;
	private Integer sypdInt02;
	private Boolean sypdLog01;
	private Boolean sypdLog02;
	private Date sypdDte01;
	private Date sypdDte02;
	private String sypdQadc01;
	private String sypdQadc02;
	private String sypdQadc03;
	private String sypdQadc04;
	private Double sypdQadd01;
	private Double sypdQadd02;
	private Integer sypdQadi01;
	private Integer sypdQadi02;
	private Boolean sypdQadl01;
	private Boolean sypdQadl02;
	private Date sypdQadt01;
	private Date sypdQadt02;
	private Boolean sypdPrereqAdd;
	private Double oidSypdDet;

	// Constructors

	/** default constructor */
	public AbstractSypdDet() {
	}

	/** minimal constructor */
	public AbstractSypdDet(SypdDetId id, Double oidSypdDet) {
		this.id = id;
		this.oidSypdDet = oidSypdDet;
	}

	/** full constructor */
	public AbstractSypdDet(SypdDetId id, Integer sypdSeq, Boolean sypdReqdAdd,
			Boolean sypdReqdChgdel, String sypdModUserid, Date sypdModDate,
			String sypdUser1, String sypdUser2, String sypdChr01,
			String sypdChr02, Double sypdDec01, Double sypdDec02,
			Integer sypdInt01, Integer sypdInt02, Boolean sypdLog01,
			Boolean sypdLog02, Date sypdDte01, Date sypdDte02,
			String sypdQadc01, String sypdQadc02, String sypdQadc03,
			String sypdQadc04, Double sypdQadd01, Double sypdQadd02,
			Integer sypdQadi01, Integer sypdQadi02, Boolean sypdQadl01,
			Boolean sypdQadl02, Date sypdQadt01, Date sypdQadt02,
			Boolean sypdPrereqAdd, Double oidSypdDet) {
		this.id = id;
		this.sypdSeq = sypdSeq;
		this.sypdReqdAdd = sypdReqdAdd;
		this.sypdReqdChgdel = sypdReqdChgdel;
		this.sypdModUserid = sypdModUserid;
		this.sypdModDate = sypdModDate;
		this.sypdUser1 = sypdUser1;
		this.sypdUser2 = sypdUser2;
		this.sypdChr01 = sypdChr01;
		this.sypdChr02 = sypdChr02;
		this.sypdDec01 = sypdDec01;
		this.sypdDec02 = sypdDec02;
		this.sypdInt01 = sypdInt01;
		this.sypdInt02 = sypdInt02;
		this.sypdLog01 = sypdLog01;
		this.sypdLog02 = sypdLog02;
		this.sypdDte01 = sypdDte01;
		this.sypdDte02 = sypdDte02;
		this.sypdQadc01 = sypdQadc01;
		this.sypdQadc02 = sypdQadc02;
		this.sypdQadc03 = sypdQadc03;
		this.sypdQadc04 = sypdQadc04;
		this.sypdQadd01 = sypdQadd01;
		this.sypdQadd02 = sypdQadd02;
		this.sypdQadi01 = sypdQadi01;
		this.sypdQadi02 = sypdQadi02;
		this.sypdQadl01 = sypdQadl01;
		this.sypdQadl02 = sypdQadl02;
		this.sypdQadt01 = sypdQadt01;
		this.sypdQadt02 = sypdQadt02;
		this.sypdPrereqAdd = sypdPrereqAdd;
		this.oidSypdDet = oidSypdDet;
	}

	// Property accessors

	public SypdDetId getId() {
		return this.id;
	}

	public void setId(SypdDetId id) {
		this.id = id;
	}

	public Integer getSypdSeq() {
		return this.sypdSeq;
	}

	public void setSypdSeq(Integer sypdSeq) {
		this.sypdSeq = sypdSeq;
	}

	public Boolean getSypdReqdAdd() {
		return this.sypdReqdAdd;
	}

	public void setSypdReqdAdd(Boolean sypdReqdAdd) {
		this.sypdReqdAdd = sypdReqdAdd;
	}

	public Boolean getSypdReqdChgdel() {
		return this.sypdReqdChgdel;
	}

	public void setSypdReqdChgdel(Boolean sypdReqdChgdel) {
		this.sypdReqdChgdel = sypdReqdChgdel;
	}

	public String getSypdModUserid() {
		return this.sypdModUserid;
	}

	public void setSypdModUserid(String sypdModUserid) {
		this.sypdModUserid = sypdModUserid;
	}

	public Date getSypdModDate() {
		return this.sypdModDate;
	}

	public void setSypdModDate(Date sypdModDate) {
		this.sypdModDate = sypdModDate;
	}

	public String getSypdUser1() {
		return this.sypdUser1;
	}

	public void setSypdUser1(String sypdUser1) {
		this.sypdUser1 = sypdUser1;
	}

	public String getSypdUser2() {
		return this.sypdUser2;
	}

	public void setSypdUser2(String sypdUser2) {
		this.sypdUser2 = sypdUser2;
	}

	public String getSypdChr01() {
		return this.sypdChr01;
	}

	public void setSypdChr01(String sypdChr01) {
		this.sypdChr01 = sypdChr01;
	}

	public String getSypdChr02() {
		return this.sypdChr02;
	}

	public void setSypdChr02(String sypdChr02) {
		this.sypdChr02 = sypdChr02;
	}

	public Double getSypdDec01() {
		return this.sypdDec01;
	}

	public void setSypdDec01(Double sypdDec01) {
		this.sypdDec01 = sypdDec01;
	}

	public Double getSypdDec02() {
		return this.sypdDec02;
	}

	public void setSypdDec02(Double sypdDec02) {
		this.sypdDec02 = sypdDec02;
	}

	public Integer getSypdInt01() {
		return this.sypdInt01;
	}

	public void setSypdInt01(Integer sypdInt01) {
		this.sypdInt01 = sypdInt01;
	}

	public Integer getSypdInt02() {
		return this.sypdInt02;
	}

	public void setSypdInt02(Integer sypdInt02) {
		this.sypdInt02 = sypdInt02;
	}

	public Boolean getSypdLog01() {
		return this.sypdLog01;
	}

	public void setSypdLog01(Boolean sypdLog01) {
		this.sypdLog01 = sypdLog01;
	}

	public Boolean getSypdLog02() {
		return this.sypdLog02;
	}

	public void setSypdLog02(Boolean sypdLog02) {
		this.sypdLog02 = sypdLog02;
	}

	public Date getSypdDte01() {
		return this.sypdDte01;
	}

	public void setSypdDte01(Date sypdDte01) {
		this.sypdDte01 = sypdDte01;
	}

	public Date getSypdDte02() {
		return this.sypdDte02;
	}

	public void setSypdDte02(Date sypdDte02) {
		this.sypdDte02 = sypdDte02;
	}

	public String getSypdQadc01() {
		return this.sypdQadc01;
	}

	public void setSypdQadc01(String sypdQadc01) {
		this.sypdQadc01 = sypdQadc01;
	}

	public String getSypdQadc02() {
		return this.sypdQadc02;
	}

	public void setSypdQadc02(String sypdQadc02) {
		this.sypdQadc02 = sypdQadc02;
	}

	public String getSypdQadc03() {
		return this.sypdQadc03;
	}

	public void setSypdQadc03(String sypdQadc03) {
		this.sypdQadc03 = sypdQadc03;
	}

	public String getSypdQadc04() {
		return this.sypdQadc04;
	}

	public void setSypdQadc04(String sypdQadc04) {
		this.sypdQadc04 = sypdQadc04;
	}

	public Double getSypdQadd01() {
		return this.sypdQadd01;
	}

	public void setSypdQadd01(Double sypdQadd01) {
		this.sypdQadd01 = sypdQadd01;
	}

	public Double getSypdQadd02() {
		return this.sypdQadd02;
	}

	public void setSypdQadd02(Double sypdQadd02) {
		this.sypdQadd02 = sypdQadd02;
	}

	public Integer getSypdQadi01() {
		return this.sypdQadi01;
	}

	public void setSypdQadi01(Integer sypdQadi01) {
		this.sypdQadi01 = sypdQadi01;
	}

	public Integer getSypdQadi02() {
		return this.sypdQadi02;
	}

	public void setSypdQadi02(Integer sypdQadi02) {
		this.sypdQadi02 = sypdQadi02;
	}

	public Boolean getSypdQadl01() {
		return this.sypdQadl01;
	}

	public void setSypdQadl01(Boolean sypdQadl01) {
		this.sypdQadl01 = sypdQadl01;
	}

	public Boolean getSypdQadl02() {
		return this.sypdQadl02;
	}

	public void setSypdQadl02(Boolean sypdQadl02) {
		this.sypdQadl02 = sypdQadl02;
	}

	public Date getSypdQadt01() {
		return this.sypdQadt01;
	}

	public void setSypdQadt01(Date sypdQadt01) {
		this.sypdQadt01 = sypdQadt01;
	}

	public Date getSypdQadt02() {
		return this.sypdQadt02;
	}

	public void setSypdQadt02(Date sypdQadt02) {
		this.sypdQadt02 = sypdQadt02;
	}

	public Boolean getSypdPrereqAdd() {
		return this.sypdPrereqAdd;
	}

	public void setSypdPrereqAdd(Boolean sypdPrereqAdd) {
		this.sypdPrereqAdd = sypdPrereqAdd;
	}

	public Double getOidSypdDet() {
		return this.oidSypdDet;
	}

	public void setOidSypdDet(Double oidSypdDet) {
		this.oidSypdDet = oidSypdDet;
	}

}