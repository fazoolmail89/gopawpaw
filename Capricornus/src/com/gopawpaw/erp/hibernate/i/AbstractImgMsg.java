package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractImgMsg entity provides the base persistence definition of the ImgMsg
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractImgMsg implements java.io.Serializable {

	// Fields

	private ImgMsgId id;
	private String imgAppId;
	private Boolean imgEmailSent;
	private Date imgModDate;
	private String imgModUserid;
	private String imgReturnTxt;
	private String imgSevLvl;
	private String imgUser1;
	private String imgUser2;
	private Double imgDec01;
	private Double imgDec02;
	private Integer imgInt01;
	private Integer imgInt02;
	private Boolean imgLog01;
	private Boolean imgLog02;
	private Date imgDte01;
	private Date imgDte02;
	private String imgQadc01;
	private String imgQadc02;
	private String imgQadc03;
	private String imgQadc04;
	private Double imgQadd01;
	private Double imgQadd02;
	private Integer imgQadi01;
	private Integer imgQadi02;
	private Boolean imgQadl01;
	private Boolean imgQadl02;
	private Date imgQadt01;
	private Date imgQadt02;
	private Double oidImgMsg;

	// Constructors

	/** default constructor */
	public AbstractImgMsg() {
	}

	/** minimal constructor */
	public AbstractImgMsg(ImgMsgId id, Double oidImgMsg) {
		this.id = id;
		this.oidImgMsg = oidImgMsg;
	}

	/** full constructor */
	public AbstractImgMsg(ImgMsgId id, String imgAppId, Boolean imgEmailSent,
			Date imgModDate, String imgModUserid, String imgReturnTxt,
			String imgSevLvl, String imgUser1, String imgUser2,
			Double imgDec01, Double imgDec02, Integer imgInt01,
			Integer imgInt02, Boolean imgLog01, Boolean imgLog02,
			Date imgDte01, Date imgDte02, String imgQadc01, String imgQadc02,
			String imgQadc03, String imgQadc04, Double imgQadd01,
			Double imgQadd02, Integer imgQadi01, Integer imgQadi02,
			Boolean imgQadl01, Boolean imgQadl02, Date imgQadt01,
			Date imgQadt02, Double oidImgMsg) {
		this.id = id;
		this.imgAppId = imgAppId;
		this.imgEmailSent = imgEmailSent;
		this.imgModDate = imgModDate;
		this.imgModUserid = imgModUserid;
		this.imgReturnTxt = imgReturnTxt;
		this.imgSevLvl = imgSevLvl;
		this.imgUser1 = imgUser1;
		this.imgUser2 = imgUser2;
		this.imgDec01 = imgDec01;
		this.imgDec02 = imgDec02;
		this.imgInt01 = imgInt01;
		this.imgInt02 = imgInt02;
		this.imgLog01 = imgLog01;
		this.imgLog02 = imgLog02;
		this.imgDte01 = imgDte01;
		this.imgDte02 = imgDte02;
		this.imgQadc01 = imgQadc01;
		this.imgQadc02 = imgQadc02;
		this.imgQadc03 = imgQadc03;
		this.imgQadc04 = imgQadc04;
		this.imgQadd01 = imgQadd01;
		this.imgQadd02 = imgQadd02;
		this.imgQadi01 = imgQadi01;
		this.imgQadi02 = imgQadi02;
		this.imgQadl01 = imgQadl01;
		this.imgQadl02 = imgQadl02;
		this.imgQadt01 = imgQadt01;
		this.imgQadt02 = imgQadt02;
		this.oidImgMsg = oidImgMsg;
	}

	// Property accessors

	public ImgMsgId getId() {
		return this.id;
	}

	public void setId(ImgMsgId id) {
		this.id = id;
	}

	public String getImgAppId() {
		return this.imgAppId;
	}

	public void setImgAppId(String imgAppId) {
		this.imgAppId = imgAppId;
	}

	public Boolean getImgEmailSent() {
		return this.imgEmailSent;
	}

	public void setImgEmailSent(Boolean imgEmailSent) {
		this.imgEmailSent = imgEmailSent;
	}

	public Date getImgModDate() {
		return this.imgModDate;
	}

	public void setImgModDate(Date imgModDate) {
		this.imgModDate = imgModDate;
	}

	public String getImgModUserid() {
		return this.imgModUserid;
	}

	public void setImgModUserid(String imgModUserid) {
		this.imgModUserid = imgModUserid;
	}

	public String getImgReturnTxt() {
		return this.imgReturnTxt;
	}

	public void setImgReturnTxt(String imgReturnTxt) {
		this.imgReturnTxt = imgReturnTxt;
	}

	public String getImgSevLvl() {
		return this.imgSevLvl;
	}

	public void setImgSevLvl(String imgSevLvl) {
		this.imgSevLvl = imgSevLvl;
	}

	public String getImgUser1() {
		return this.imgUser1;
	}

	public void setImgUser1(String imgUser1) {
		this.imgUser1 = imgUser1;
	}

	public String getImgUser2() {
		return this.imgUser2;
	}

	public void setImgUser2(String imgUser2) {
		this.imgUser2 = imgUser2;
	}

	public Double getImgDec01() {
		return this.imgDec01;
	}

	public void setImgDec01(Double imgDec01) {
		this.imgDec01 = imgDec01;
	}

	public Double getImgDec02() {
		return this.imgDec02;
	}

	public void setImgDec02(Double imgDec02) {
		this.imgDec02 = imgDec02;
	}

	public Integer getImgInt01() {
		return this.imgInt01;
	}

	public void setImgInt01(Integer imgInt01) {
		this.imgInt01 = imgInt01;
	}

	public Integer getImgInt02() {
		return this.imgInt02;
	}

	public void setImgInt02(Integer imgInt02) {
		this.imgInt02 = imgInt02;
	}

	public Boolean getImgLog01() {
		return this.imgLog01;
	}

	public void setImgLog01(Boolean imgLog01) {
		this.imgLog01 = imgLog01;
	}

	public Boolean getImgLog02() {
		return this.imgLog02;
	}

	public void setImgLog02(Boolean imgLog02) {
		this.imgLog02 = imgLog02;
	}

	public Date getImgDte01() {
		return this.imgDte01;
	}

	public void setImgDte01(Date imgDte01) {
		this.imgDte01 = imgDte01;
	}

	public Date getImgDte02() {
		return this.imgDte02;
	}

	public void setImgDte02(Date imgDte02) {
		this.imgDte02 = imgDte02;
	}

	public String getImgQadc01() {
		return this.imgQadc01;
	}

	public void setImgQadc01(String imgQadc01) {
		this.imgQadc01 = imgQadc01;
	}

	public String getImgQadc02() {
		return this.imgQadc02;
	}

	public void setImgQadc02(String imgQadc02) {
		this.imgQadc02 = imgQadc02;
	}

	public String getImgQadc03() {
		return this.imgQadc03;
	}

	public void setImgQadc03(String imgQadc03) {
		this.imgQadc03 = imgQadc03;
	}

	public String getImgQadc04() {
		return this.imgQadc04;
	}

	public void setImgQadc04(String imgQadc04) {
		this.imgQadc04 = imgQadc04;
	}

	public Double getImgQadd01() {
		return this.imgQadd01;
	}

	public void setImgQadd01(Double imgQadd01) {
		this.imgQadd01 = imgQadd01;
	}

	public Double getImgQadd02() {
		return this.imgQadd02;
	}

	public void setImgQadd02(Double imgQadd02) {
		this.imgQadd02 = imgQadd02;
	}

	public Integer getImgQadi01() {
		return this.imgQadi01;
	}

	public void setImgQadi01(Integer imgQadi01) {
		this.imgQadi01 = imgQadi01;
	}

	public Integer getImgQadi02() {
		return this.imgQadi02;
	}

	public void setImgQadi02(Integer imgQadi02) {
		this.imgQadi02 = imgQadi02;
	}

	public Boolean getImgQadl01() {
		return this.imgQadl01;
	}

	public void setImgQadl01(Boolean imgQadl01) {
		this.imgQadl01 = imgQadl01;
	}

	public Boolean getImgQadl02() {
		return this.imgQadl02;
	}

	public void setImgQadl02(Boolean imgQadl02) {
		this.imgQadl02 = imgQadl02;
	}

	public Date getImgQadt01() {
		return this.imgQadt01;
	}

	public void setImgQadt01(Date imgQadt01) {
		this.imgQadt01 = imgQadt01;
	}

	public Date getImgQadt02() {
		return this.imgQadt02;
	}

	public void setImgQadt02(Date imgQadt02) {
		this.imgQadt02 = imgQadt02;
	}

	public Double getOidImgMsg() {
		return this.oidImgMsg;
	}

	public void setOidImgMsg(Double oidImgMsg) {
		this.oidImgMsg = oidImgMsg;
	}

}