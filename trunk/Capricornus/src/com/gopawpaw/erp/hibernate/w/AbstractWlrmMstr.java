package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * AbstractWlrmMstr entity provides the base persistence definition of the
 * WlrmMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWlrmMstr implements java.io.Serializable {

	// Fields

	private WlrmMstrId id;
	private Boolean wlrmTrcParent;
	private Double wlrmMaxlotsize;
	private String wlrmNrmId;
	private Boolean wlrmWipSplitOk;
	private Boolean wlrmWipCmbOk;
	private Boolean wlrmOverissue;
	private Integer wlrmLtStartop;
	private Integer wlrmSerStartop;
	private Date wlrmEnd;
	private Date wlrmModDate;
	private String wlrmModUserid;
	private String wlrmQadc01;
	private String wlrmQadc02;
	private String wlrmQadc03;
	private String wlrmQadc04;
	private Double wlrmQadd01;
	private Double wlrmQadd02;
	private Integer wlrmQadi01;
	private Integer wlrmQadi02;
	private Boolean wlrmQadl01;
	private Boolean wlrmQadl02;
	private Date wlrmQadt01;
	private Date wlrmQadt02;
	private String wlrmChr01;
	private String wlrmChr02;
	private String wlrmChr03;
	private String wlrmChr04;
	private Double wlrmDec01;
	private Double wlrmDec02;
	private Integer wlrmInt01;
	private Integer wlrmInt02;
	private Boolean wlrmLog01;
	private Boolean wlrmLog02;
	private Date wlrmDte01;
	private Date wlrmDte02;
	private String wlrmUser1;
	private String wlrmUser2;
	private Double oidWlrmMstr;

	// Constructors

	/** default constructor */
	public AbstractWlrmMstr() {
	}

	/** minimal constructor */
	public AbstractWlrmMstr(WlrmMstrId id, Double oidWlrmMstr) {
		this.id = id;
		this.oidWlrmMstr = oidWlrmMstr;
	}

	/** full constructor */
	public AbstractWlrmMstr(WlrmMstrId id, Boolean wlrmTrcParent,
			Double wlrmMaxlotsize, String wlrmNrmId, Boolean wlrmWipSplitOk,
			Boolean wlrmWipCmbOk, Boolean wlrmOverissue, Integer wlrmLtStartop,
			Integer wlrmSerStartop, Date wlrmEnd, Date wlrmModDate,
			String wlrmModUserid, String wlrmQadc01, String wlrmQadc02,
			String wlrmQadc03, String wlrmQadc04, Double wlrmQadd01,
			Double wlrmQadd02, Integer wlrmQadi01, Integer wlrmQadi02,
			Boolean wlrmQadl01, Boolean wlrmQadl02, Date wlrmQadt01,
			Date wlrmQadt02, String wlrmChr01, String wlrmChr02,
			String wlrmChr03, String wlrmChr04, Double wlrmDec01,
			Double wlrmDec02, Integer wlrmInt01, Integer wlrmInt02,
			Boolean wlrmLog01, Boolean wlrmLog02, Date wlrmDte01,
			Date wlrmDte02, String wlrmUser1, String wlrmUser2,
			Double oidWlrmMstr) {
		this.id = id;
		this.wlrmTrcParent = wlrmTrcParent;
		this.wlrmMaxlotsize = wlrmMaxlotsize;
		this.wlrmNrmId = wlrmNrmId;
		this.wlrmWipSplitOk = wlrmWipSplitOk;
		this.wlrmWipCmbOk = wlrmWipCmbOk;
		this.wlrmOverissue = wlrmOverissue;
		this.wlrmLtStartop = wlrmLtStartop;
		this.wlrmSerStartop = wlrmSerStartop;
		this.wlrmEnd = wlrmEnd;
		this.wlrmModDate = wlrmModDate;
		this.wlrmModUserid = wlrmModUserid;
		this.wlrmQadc01 = wlrmQadc01;
		this.wlrmQadc02 = wlrmQadc02;
		this.wlrmQadc03 = wlrmQadc03;
		this.wlrmQadc04 = wlrmQadc04;
		this.wlrmQadd01 = wlrmQadd01;
		this.wlrmQadd02 = wlrmQadd02;
		this.wlrmQadi01 = wlrmQadi01;
		this.wlrmQadi02 = wlrmQadi02;
		this.wlrmQadl01 = wlrmQadl01;
		this.wlrmQadl02 = wlrmQadl02;
		this.wlrmQadt01 = wlrmQadt01;
		this.wlrmQadt02 = wlrmQadt02;
		this.wlrmChr01 = wlrmChr01;
		this.wlrmChr02 = wlrmChr02;
		this.wlrmChr03 = wlrmChr03;
		this.wlrmChr04 = wlrmChr04;
		this.wlrmDec01 = wlrmDec01;
		this.wlrmDec02 = wlrmDec02;
		this.wlrmInt01 = wlrmInt01;
		this.wlrmInt02 = wlrmInt02;
		this.wlrmLog01 = wlrmLog01;
		this.wlrmLog02 = wlrmLog02;
		this.wlrmDte01 = wlrmDte01;
		this.wlrmDte02 = wlrmDte02;
		this.wlrmUser1 = wlrmUser1;
		this.wlrmUser2 = wlrmUser2;
		this.oidWlrmMstr = oidWlrmMstr;
	}

	// Property accessors

	public WlrmMstrId getId() {
		return this.id;
	}

	public void setId(WlrmMstrId id) {
		this.id = id;
	}

	public Boolean getWlrmTrcParent() {
		return this.wlrmTrcParent;
	}

	public void setWlrmTrcParent(Boolean wlrmTrcParent) {
		this.wlrmTrcParent = wlrmTrcParent;
	}

	public Double getWlrmMaxlotsize() {
		return this.wlrmMaxlotsize;
	}

	public void setWlrmMaxlotsize(Double wlrmMaxlotsize) {
		this.wlrmMaxlotsize = wlrmMaxlotsize;
	}

	public String getWlrmNrmId() {
		return this.wlrmNrmId;
	}

	public void setWlrmNrmId(String wlrmNrmId) {
		this.wlrmNrmId = wlrmNrmId;
	}

	public Boolean getWlrmWipSplitOk() {
		return this.wlrmWipSplitOk;
	}

	public void setWlrmWipSplitOk(Boolean wlrmWipSplitOk) {
		this.wlrmWipSplitOk = wlrmWipSplitOk;
	}

	public Boolean getWlrmWipCmbOk() {
		return this.wlrmWipCmbOk;
	}

	public void setWlrmWipCmbOk(Boolean wlrmWipCmbOk) {
		this.wlrmWipCmbOk = wlrmWipCmbOk;
	}

	public Boolean getWlrmOverissue() {
		return this.wlrmOverissue;
	}

	public void setWlrmOverissue(Boolean wlrmOverissue) {
		this.wlrmOverissue = wlrmOverissue;
	}

	public Integer getWlrmLtStartop() {
		return this.wlrmLtStartop;
	}

	public void setWlrmLtStartop(Integer wlrmLtStartop) {
		this.wlrmLtStartop = wlrmLtStartop;
	}

	public Integer getWlrmSerStartop() {
		return this.wlrmSerStartop;
	}

	public void setWlrmSerStartop(Integer wlrmSerStartop) {
		this.wlrmSerStartop = wlrmSerStartop;
	}

	public Date getWlrmEnd() {
		return this.wlrmEnd;
	}

	public void setWlrmEnd(Date wlrmEnd) {
		this.wlrmEnd = wlrmEnd;
	}

	public Date getWlrmModDate() {
		return this.wlrmModDate;
	}

	public void setWlrmModDate(Date wlrmModDate) {
		this.wlrmModDate = wlrmModDate;
	}

	public String getWlrmModUserid() {
		return this.wlrmModUserid;
	}

	public void setWlrmModUserid(String wlrmModUserid) {
		this.wlrmModUserid = wlrmModUserid;
	}

	public String getWlrmQadc01() {
		return this.wlrmQadc01;
	}

	public void setWlrmQadc01(String wlrmQadc01) {
		this.wlrmQadc01 = wlrmQadc01;
	}

	public String getWlrmQadc02() {
		return this.wlrmQadc02;
	}

	public void setWlrmQadc02(String wlrmQadc02) {
		this.wlrmQadc02 = wlrmQadc02;
	}

	public String getWlrmQadc03() {
		return this.wlrmQadc03;
	}

	public void setWlrmQadc03(String wlrmQadc03) {
		this.wlrmQadc03 = wlrmQadc03;
	}

	public String getWlrmQadc04() {
		return this.wlrmQadc04;
	}

	public void setWlrmQadc04(String wlrmQadc04) {
		this.wlrmQadc04 = wlrmQadc04;
	}

	public Double getWlrmQadd01() {
		return this.wlrmQadd01;
	}

	public void setWlrmQadd01(Double wlrmQadd01) {
		this.wlrmQadd01 = wlrmQadd01;
	}

	public Double getWlrmQadd02() {
		return this.wlrmQadd02;
	}

	public void setWlrmQadd02(Double wlrmQadd02) {
		this.wlrmQadd02 = wlrmQadd02;
	}

	public Integer getWlrmQadi01() {
		return this.wlrmQadi01;
	}

	public void setWlrmQadi01(Integer wlrmQadi01) {
		this.wlrmQadi01 = wlrmQadi01;
	}

	public Integer getWlrmQadi02() {
		return this.wlrmQadi02;
	}

	public void setWlrmQadi02(Integer wlrmQadi02) {
		this.wlrmQadi02 = wlrmQadi02;
	}

	public Boolean getWlrmQadl01() {
		return this.wlrmQadl01;
	}

	public void setWlrmQadl01(Boolean wlrmQadl01) {
		this.wlrmQadl01 = wlrmQadl01;
	}

	public Boolean getWlrmQadl02() {
		return this.wlrmQadl02;
	}

	public void setWlrmQadl02(Boolean wlrmQadl02) {
		this.wlrmQadl02 = wlrmQadl02;
	}

	public Date getWlrmQadt01() {
		return this.wlrmQadt01;
	}

	public void setWlrmQadt01(Date wlrmQadt01) {
		this.wlrmQadt01 = wlrmQadt01;
	}

	public Date getWlrmQadt02() {
		return this.wlrmQadt02;
	}

	public void setWlrmQadt02(Date wlrmQadt02) {
		this.wlrmQadt02 = wlrmQadt02;
	}

	public String getWlrmChr01() {
		return this.wlrmChr01;
	}

	public void setWlrmChr01(String wlrmChr01) {
		this.wlrmChr01 = wlrmChr01;
	}

	public String getWlrmChr02() {
		return this.wlrmChr02;
	}

	public void setWlrmChr02(String wlrmChr02) {
		this.wlrmChr02 = wlrmChr02;
	}

	public String getWlrmChr03() {
		return this.wlrmChr03;
	}

	public void setWlrmChr03(String wlrmChr03) {
		this.wlrmChr03 = wlrmChr03;
	}

	public String getWlrmChr04() {
		return this.wlrmChr04;
	}

	public void setWlrmChr04(String wlrmChr04) {
		this.wlrmChr04 = wlrmChr04;
	}

	public Double getWlrmDec01() {
		return this.wlrmDec01;
	}

	public void setWlrmDec01(Double wlrmDec01) {
		this.wlrmDec01 = wlrmDec01;
	}

	public Double getWlrmDec02() {
		return this.wlrmDec02;
	}

	public void setWlrmDec02(Double wlrmDec02) {
		this.wlrmDec02 = wlrmDec02;
	}

	public Integer getWlrmInt01() {
		return this.wlrmInt01;
	}

	public void setWlrmInt01(Integer wlrmInt01) {
		this.wlrmInt01 = wlrmInt01;
	}

	public Integer getWlrmInt02() {
		return this.wlrmInt02;
	}

	public void setWlrmInt02(Integer wlrmInt02) {
		this.wlrmInt02 = wlrmInt02;
	}

	public Boolean getWlrmLog01() {
		return this.wlrmLog01;
	}

	public void setWlrmLog01(Boolean wlrmLog01) {
		this.wlrmLog01 = wlrmLog01;
	}

	public Boolean getWlrmLog02() {
		return this.wlrmLog02;
	}

	public void setWlrmLog02(Boolean wlrmLog02) {
		this.wlrmLog02 = wlrmLog02;
	}

	public Date getWlrmDte01() {
		return this.wlrmDte01;
	}

	public void setWlrmDte01(Date wlrmDte01) {
		this.wlrmDte01 = wlrmDte01;
	}

	public Date getWlrmDte02() {
		return this.wlrmDte02;
	}

	public void setWlrmDte02(Date wlrmDte02) {
		this.wlrmDte02 = wlrmDte02;
	}

	public String getWlrmUser1() {
		return this.wlrmUser1;
	}

	public void setWlrmUser1(String wlrmUser1) {
		this.wlrmUser1 = wlrmUser1;
	}

	public String getWlrmUser2() {
		return this.wlrmUser2;
	}

	public void setWlrmUser2(String wlrmUser2) {
		this.wlrmUser2 = wlrmUser2;
	}

	public Double getOidWlrmMstr() {
		return this.oidWlrmMstr;
	}

	public void setOidWlrmMstr(Double oidWlrmMstr) {
		this.oidWlrmMstr = oidWlrmMstr;
	}

}