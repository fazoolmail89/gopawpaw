package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRcsxRef entity provides the base persistence definition of the
 * RcsxRef entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRcsxRef implements java.io.Serializable {

	// Fields

	private RcsxRefId id;
	private Boolean rcsxPicked;
	private Boolean rcsxShipped;
	private String rcsxRlseId;
	private String rcsxCustJob;
	private String rcsxCustSeq;
	private String rcsxPart;
	private Date rcsxDate;
	private String rcsxTime;
	private String rcsxCustRef;
	private String rcsxDock;
	private String rcsxLineFeed;
	private String rcsxModUserid;
	private Date rcsxModDate;
	private String rcsxModPgm;
	private String rcsxUser1;
	private String rcsxUser2;
	private String rcsxQadc01;
	private String rcsxQadc02;
	private Double rcsxQadd01;
	private Double rcsxQadd02;
	private Integer rcsxQadi01;
	private Integer rcsxQadi02;
	private Boolean rcsxQadl01;
	private Boolean rcsxQadl02;
	private Date rcsxQadt01;
	private Date rcsxQadt02;
	private Double oidRcsxRef;

	// Constructors

	/** default constructor */
	public AbstractRcsxRef() {
	}

	/** minimal constructor */
	public AbstractRcsxRef(RcsxRefId id, Double oidRcsxRef) {
		this.id = id;
		this.oidRcsxRef = oidRcsxRef;
	}

	/** full constructor */
	public AbstractRcsxRef(RcsxRefId id, Boolean rcsxPicked,
			Boolean rcsxShipped, String rcsxRlseId, String rcsxCustJob,
			String rcsxCustSeq, String rcsxPart, Date rcsxDate,
			String rcsxTime, String rcsxCustRef, String rcsxDock,
			String rcsxLineFeed, String rcsxModUserid, Date rcsxModDate,
			String rcsxModPgm, String rcsxUser1, String rcsxUser2,
			String rcsxQadc01, String rcsxQadc02, Double rcsxQadd01,
			Double rcsxQadd02, Integer rcsxQadi01, Integer rcsxQadi02,
			Boolean rcsxQadl01, Boolean rcsxQadl02, Date rcsxQadt01,
			Date rcsxQadt02, Double oidRcsxRef) {
		this.id = id;
		this.rcsxPicked = rcsxPicked;
		this.rcsxShipped = rcsxShipped;
		this.rcsxRlseId = rcsxRlseId;
		this.rcsxCustJob = rcsxCustJob;
		this.rcsxCustSeq = rcsxCustSeq;
		this.rcsxPart = rcsxPart;
		this.rcsxDate = rcsxDate;
		this.rcsxTime = rcsxTime;
		this.rcsxCustRef = rcsxCustRef;
		this.rcsxDock = rcsxDock;
		this.rcsxLineFeed = rcsxLineFeed;
		this.rcsxModUserid = rcsxModUserid;
		this.rcsxModDate = rcsxModDate;
		this.rcsxModPgm = rcsxModPgm;
		this.rcsxUser1 = rcsxUser1;
		this.rcsxUser2 = rcsxUser2;
		this.rcsxQadc01 = rcsxQadc01;
		this.rcsxQadc02 = rcsxQadc02;
		this.rcsxQadd01 = rcsxQadd01;
		this.rcsxQadd02 = rcsxQadd02;
		this.rcsxQadi01 = rcsxQadi01;
		this.rcsxQadi02 = rcsxQadi02;
		this.rcsxQadl01 = rcsxQadl01;
		this.rcsxQadl02 = rcsxQadl02;
		this.rcsxQadt01 = rcsxQadt01;
		this.rcsxQadt02 = rcsxQadt02;
		this.oidRcsxRef = oidRcsxRef;
	}

	// Property accessors

	public RcsxRefId getId() {
		return this.id;
	}

	public void setId(RcsxRefId id) {
		this.id = id;
	}

	public Boolean getRcsxPicked() {
		return this.rcsxPicked;
	}

	public void setRcsxPicked(Boolean rcsxPicked) {
		this.rcsxPicked = rcsxPicked;
	}

	public Boolean getRcsxShipped() {
		return this.rcsxShipped;
	}

	public void setRcsxShipped(Boolean rcsxShipped) {
		this.rcsxShipped = rcsxShipped;
	}

	public String getRcsxRlseId() {
		return this.rcsxRlseId;
	}

	public void setRcsxRlseId(String rcsxRlseId) {
		this.rcsxRlseId = rcsxRlseId;
	}

	public String getRcsxCustJob() {
		return this.rcsxCustJob;
	}

	public void setRcsxCustJob(String rcsxCustJob) {
		this.rcsxCustJob = rcsxCustJob;
	}

	public String getRcsxCustSeq() {
		return this.rcsxCustSeq;
	}

	public void setRcsxCustSeq(String rcsxCustSeq) {
		this.rcsxCustSeq = rcsxCustSeq;
	}

	public String getRcsxPart() {
		return this.rcsxPart;
	}

	public void setRcsxPart(String rcsxPart) {
		this.rcsxPart = rcsxPart;
	}

	public Date getRcsxDate() {
		return this.rcsxDate;
	}

	public void setRcsxDate(Date rcsxDate) {
		this.rcsxDate = rcsxDate;
	}

	public String getRcsxTime() {
		return this.rcsxTime;
	}

	public void setRcsxTime(String rcsxTime) {
		this.rcsxTime = rcsxTime;
	}

	public String getRcsxCustRef() {
		return this.rcsxCustRef;
	}

	public void setRcsxCustRef(String rcsxCustRef) {
		this.rcsxCustRef = rcsxCustRef;
	}

	public String getRcsxDock() {
		return this.rcsxDock;
	}

	public void setRcsxDock(String rcsxDock) {
		this.rcsxDock = rcsxDock;
	}

	public String getRcsxLineFeed() {
		return this.rcsxLineFeed;
	}

	public void setRcsxLineFeed(String rcsxLineFeed) {
		this.rcsxLineFeed = rcsxLineFeed;
	}

	public String getRcsxModUserid() {
		return this.rcsxModUserid;
	}

	public void setRcsxModUserid(String rcsxModUserid) {
		this.rcsxModUserid = rcsxModUserid;
	}

	public Date getRcsxModDate() {
		return this.rcsxModDate;
	}

	public void setRcsxModDate(Date rcsxModDate) {
		this.rcsxModDate = rcsxModDate;
	}

	public String getRcsxModPgm() {
		return this.rcsxModPgm;
	}

	public void setRcsxModPgm(String rcsxModPgm) {
		this.rcsxModPgm = rcsxModPgm;
	}

	public String getRcsxUser1() {
		return this.rcsxUser1;
	}

	public void setRcsxUser1(String rcsxUser1) {
		this.rcsxUser1 = rcsxUser1;
	}

	public String getRcsxUser2() {
		return this.rcsxUser2;
	}

	public void setRcsxUser2(String rcsxUser2) {
		this.rcsxUser2 = rcsxUser2;
	}

	public String getRcsxQadc01() {
		return this.rcsxQadc01;
	}

	public void setRcsxQadc01(String rcsxQadc01) {
		this.rcsxQadc01 = rcsxQadc01;
	}

	public String getRcsxQadc02() {
		return this.rcsxQadc02;
	}

	public void setRcsxQadc02(String rcsxQadc02) {
		this.rcsxQadc02 = rcsxQadc02;
	}

	public Double getRcsxQadd01() {
		return this.rcsxQadd01;
	}

	public void setRcsxQadd01(Double rcsxQadd01) {
		this.rcsxQadd01 = rcsxQadd01;
	}

	public Double getRcsxQadd02() {
		return this.rcsxQadd02;
	}

	public void setRcsxQadd02(Double rcsxQadd02) {
		this.rcsxQadd02 = rcsxQadd02;
	}

	public Integer getRcsxQadi01() {
		return this.rcsxQadi01;
	}

	public void setRcsxQadi01(Integer rcsxQadi01) {
		this.rcsxQadi01 = rcsxQadi01;
	}

	public Integer getRcsxQadi02() {
		return this.rcsxQadi02;
	}

	public void setRcsxQadi02(Integer rcsxQadi02) {
		this.rcsxQadi02 = rcsxQadi02;
	}

	public Boolean getRcsxQadl01() {
		return this.rcsxQadl01;
	}

	public void setRcsxQadl01(Boolean rcsxQadl01) {
		this.rcsxQadl01 = rcsxQadl01;
	}

	public Boolean getRcsxQadl02() {
		return this.rcsxQadl02;
	}

	public void setRcsxQadl02(Boolean rcsxQadl02) {
		this.rcsxQadl02 = rcsxQadl02;
	}

	public Date getRcsxQadt01() {
		return this.rcsxQadt01;
	}

	public void setRcsxQadt01(Date rcsxQadt01) {
		this.rcsxQadt01 = rcsxQadt01;
	}

	public Date getRcsxQadt02() {
		return this.rcsxQadt02;
	}

	public void setRcsxQadt02(Date rcsxQadt02) {
		this.rcsxQadt02 = rcsxQadt02;
	}

	public Double getOidRcsxRef() {
		return this.oidRcsxRef;
	}

	public void setOidRcsxRef(Double oidRcsxRef) {
		this.oidRcsxRef = oidRcsxRef;
	}

}