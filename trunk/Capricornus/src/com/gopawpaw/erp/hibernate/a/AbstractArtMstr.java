package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractArtMstr entity provides the base persistence definition of the
 * ArtMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractArtMstr implements java.io.Serializable {

	// Fields

	private ArtMstrId id;
	private String artDesc;
	private Integer artMfgMsgCode;
	private Date artModDate;
	private String artModUserid;
	private String artSevLvl;
	private String artUser1;
	private String artUser2;
	private Double artDec01;
	private Double artDec02;
	private Integer artInt01;
	private Integer artInt02;
	private Boolean artLog01;
	private Boolean artLog02;
	private Date artDte01;
	private Date artDte02;
	private String artQadc01;
	private String artQadc02;
	private String artQadc03;
	private String artQadc04;
	private Double artQadd01;
	private Double artQadd02;
	private Integer artQadi01;
	private Integer artQadi02;
	private Boolean artQadl01;
	private Boolean artQadl02;
	private Date artQadt01;
	private Date artQadt02;
	private Double oidArtMstr;

	// Constructors

	/** default constructor */
	public AbstractArtMstr() {
	}

	/** minimal constructor */
	public AbstractArtMstr(ArtMstrId id, Double oidArtMstr) {
		this.id = id;
		this.oidArtMstr = oidArtMstr;
	}

	/** full constructor */
	public AbstractArtMstr(ArtMstrId id, String artDesc, Integer artMfgMsgCode,
			Date artModDate, String artModUserid, String artSevLvl,
			String artUser1, String artUser2, Double artDec01, Double artDec02,
			Integer artInt01, Integer artInt02, Boolean artLog01,
			Boolean artLog02, Date artDte01, Date artDte02, String artQadc01,
			String artQadc02, String artQadc03, String artQadc04,
			Double artQadd01, Double artQadd02, Integer artQadi01,
			Integer artQadi02, Boolean artQadl01, Boolean artQadl02,
			Date artQadt01, Date artQadt02, Double oidArtMstr) {
		this.id = id;
		this.artDesc = artDesc;
		this.artMfgMsgCode = artMfgMsgCode;
		this.artModDate = artModDate;
		this.artModUserid = artModUserid;
		this.artSevLvl = artSevLvl;
		this.artUser1 = artUser1;
		this.artUser2 = artUser2;
		this.artDec01 = artDec01;
		this.artDec02 = artDec02;
		this.artInt01 = artInt01;
		this.artInt02 = artInt02;
		this.artLog01 = artLog01;
		this.artLog02 = artLog02;
		this.artDte01 = artDte01;
		this.artDte02 = artDte02;
		this.artQadc01 = artQadc01;
		this.artQadc02 = artQadc02;
		this.artQadc03 = artQadc03;
		this.artQadc04 = artQadc04;
		this.artQadd01 = artQadd01;
		this.artQadd02 = artQadd02;
		this.artQadi01 = artQadi01;
		this.artQadi02 = artQadi02;
		this.artQadl01 = artQadl01;
		this.artQadl02 = artQadl02;
		this.artQadt01 = artQadt01;
		this.artQadt02 = artQadt02;
		this.oidArtMstr = oidArtMstr;
	}

	// Property accessors

	public ArtMstrId getId() {
		return this.id;
	}

	public void setId(ArtMstrId id) {
		this.id = id;
	}

	public String getArtDesc() {
		return this.artDesc;
	}

	public void setArtDesc(String artDesc) {
		this.artDesc = artDesc;
	}

	public Integer getArtMfgMsgCode() {
		return this.artMfgMsgCode;
	}

	public void setArtMfgMsgCode(Integer artMfgMsgCode) {
		this.artMfgMsgCode = artMfgMsgCode;
	}

	public Date getArtModDate() {
		return this.artModDate;
	}

	public void setArtModDate(Date artModDate) {
		this.artModDate = artModDate;
	}

	public String getArtModUserid() {
		return this.artModUserid;
	}

	public void setArtModUserid(String artModUserid) {
		this.artModUserid = artModUserid;
	}

	public String getArtSevLvl() {
		return this.artSevLvl;
	}

	public void setArtSevLvl(String artSevLvl) {
		this.artSevLvl = artSevLvl;
	}

	public String getArtUser1() {
		return this.artUser1;
	}

	public void setArtUser1(String artUser1) {
		this.artUser1 = artUser1;
	}

	public String getArtUser2() {
		return this.artUser2;
	}

	public void setArtUser2(String artUser2) {
		this.artUser2 = artUser2;
	}

	public Double getArtDec01() {
		return this.artDec01;
	}

	public void setArtDec01(Double artDec01) {
		this.artDec01 = artDec01;
	}

	public Double getArtDec02() {
		return this.artDec02;
	}

	public void setArtDec02(Double artDec02) {
		this.artDec02 = artDec02;
	}

	public Integer getArtInt01() {
		return this.artInt01;
	}

	public void setArtInt01(Integer artInt01) {
		this.artInt01 = artInt01;
	}

	public Integer getArtInt02() {
		return this.artInt02;
	}

	public void setArtInt02(Integer artInt02) {
		this.artInt02 = artInt02;
	}

	public Boolean getArtLog01() {
		return this.artLog01;
	}

	public void setArtLog01(Boolean artLog01) {
		this.artLog01 = artLog01;
	}

	public Boolean getArtLog02() {
		return this.artLog02;
	}

	public void setArtLog02(Boolean artLog02) {
		this.artLog02 = artLog02;
	}

	public Date getArtDte01() {
		return this.artDte01;
	}

	public void setArtDte01(Date artDte01) {
		this.artDte01 = artDte01;
	}

	public Date getArtDte02() {
		return this.artDte02;
	}

	public void setArtDte02(Date artDte02) {
		this.artDte02 = artDte02;
	}

	public String getArtQadc01() {
		return this.artQadc01;
	}

	public void setArtQadc01(String artQadc01) {
		this.artQadc01 = artQadc01;
	}

	public String getArtQadc02() {
		return this.artQadc02;
	}

	public void setArtQadc02(String artQadc02) {
		this.artQadc02 = artQadc02;
	}

	public String getArtQadc03() {
		return this.artQadc03;
	}

	public void setArtQadc03(String artQadc03) {
		this.artQadc03 = artQadc03;
	}

	public String getArtQadc04() {
		return this.artQadc04;
	}

	public void setArtQadc04(String artQadc04) {
		this.artQadc04 = artQadc04;
	}

	public Double getArtQadd01() {
		return this.artQadd01;
	}

	public void setArtQadd01(Double artQadd01) {
		this.artQadd01 = artQadd01;
	}

	public Double getArtQadd02() {
		return this.artQadd02;
	}

	public void setArtQadd02(Double artQadd02) {
		this.artQadd02 = artQadd02;
	}

	public Integer getArtQadi01() {
		return this.artQadi01;
	}

	public void setArtQadi01(Integer artQadi01) {
		this.artQadi01 = artQadi01;
	}

	public Integer getArtQadi02() {
		return this.artQadi02;
	}

	public void setArtQadi02(Integer artQadi02) {
		this.artQadi02 = artQadi02;
	}

	public Boolean getArtQadl01() {
		return this.artQadl01;
	}

	public void setArtQadl01(Boolean artQadl01) {
		this.artQadl01 = artQadl01;
	}

	public Boolean getArtQadl02() {
		return this.artQadl02;
	}

	public void setArtQadl02(Boolean artQadl02) {
		this.artQadl02 = artQadl02;
	}

	public Date getArtQadt01() {
		return this.artQadt01;
	}

	public void setArtQadt01(Date artQadt01) {
		this.artQadt01 = artQadt01;
	}

	public Date getArtQadt02() {
		return this.artQadt02;
	}

	public void setArtQadt02(Date artQadt02) {
		this.artQadt02 = artQadt02;
	}

	public Double getOidArtMstr() {
		return this.oidArtMstr;
	}

	public void setOidArtMstr(Double oidArtMstr) {
		this.oidArtMstr = oidArtMstr;
	}

}