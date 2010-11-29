package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSbicCtl entity provides the base persistence definition of the
 * SbicCtl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSbicCtl implements java.io.Serializable {

	// Fields

	private String sbicDomain;
	private Boolean sbicActive;
	private String sbicPrefix;
	private Integer sbicIndex1;
	private Integer sbicNextSb;
	private String sbicUser1;
	private String sbicUser2;
	private String sbicUser3;
	private String sbicUser4;
	private String sbicQadc01;
	private String sbicQadc02;
	private String sbicQadc03;
	private String sbicQadc04;
	private Integer sbicQadi01;
	private Integer sbicQadi02;
	private Integer sbicQadi03;
	private Integer sbicQadi04;
	private Double sbicQadd01;
	private Double sbicQadd02;
	private Double sbicQadd03;
	private Double sbicQadd04;
	private Boolean sbicQadl01;
	private Boolean sbicQadl02;
	private Boolean sbicQadl03;
	private Boolean sbicQadl04;
	private Date sbicQadt01;
	private Date sbicQadt02;
	private Date sbicQadt03;
	private Date sbicQadt04;
	private Double oidSbicCtl;

	// Constructors

	/** default constructor */
	public AbstractSbicCtl() {
	}

	/** minimal constructor */
	public AbstractSbicCtl(Double oidSbicCtl) {
		this.oidSbicCtl = oidSbicCtl;
	}

	/** full constructor */
	public AbstractSbicCtl(Boolean sbicActive, String sbicPrefix,
			Integer sbicIndex1, Integer sbicNextSb, String sbicUser1,
			String sbicUser2, String sbicUser3, String sbicUser4,
			String sbicQadc01, String sbicQadc02, String sbicQadc03,
			String sbicQadc04, Integer sbicQadi01, Integer sbicQadi02,
			Integer sbicQadi03, Integer sbicQadi04, Double sbicQadd01,
			Double sbicQadd02, Double sbicQadd03, Double sbicQadd04,
			Boolean sbicQadl01, Boolean sbicQadl02, Boolean sbicQadl03,
			Boolean sbicQadl04, Date sbicQadt01, Date sbicQadt02,
			Date sbicQadt03, Date sbicQadt04, Double oidSbicCtl) {
		this.sbicActive = sbicActive;
		this.sbicPrefix = sbicPrefix;
		this.sbicIndex1 = sbicIndex1;
		this.sbicNextSb = sbicNextSb;
		this.sbicUser1 = sbicUser1;
		this.sbicUser2 = sbicUser2;
		this.sbicUser3 = sbicUser3;
		this.sbicUser4 = sbicUser4;
		this.sbicQadc01 = sbicQadc01;
		this.sbicQadc02 = sbicQadc02;
		this.sbicQadc03 = sbicQadc03;
		this.sbicQadc04 = sbicQadc04;
		this.sbicQadi01 = sbicQadi01;
		this.sbicQadi02 = sbicQadi02;
		this.sbicQadi03 = sbicQadi03;
		this.sbicQadi04 = sbicQadi04;
		this.sbicQadd01 = sbicQadd01;
		this.sbicQadd02 = sbicQadd02;
		this.sbicQadd03 = sbicQadd03;
		this.sbicQadd04 = sbicQadd04;
		this.sbicQadl01 = sbicQadl01;
		this.sbicQadl02 = sbicQadl02;
		this.sbicQadl03 = sbicQadl03;
		this.sbicQadl04 = sbicQadl04;
		this.sbicQadt01 = sbicQadt01;
		this.sbicQadt02 = sbicQadt02;
		this.sbicQadt03 = sbicQadt03;
		this.sbicQadt04 = sbicQadt04;
		this.oidSbicCtl = oidSbicCtl;
	}

	// Property accessors

	public String getSbicDomain() {
		return this.sbicDomain;
	}

	public void setSbicDomain(String sbicDomain) {
		this.sbicDomain = sbicDomain;
	}

	public Boolean getSbicActive() {
		return this.sbicActive;
	}

	public void setSbicActive(Boolean sbicActive) {
		this.sbicActive = sbicActive;
	}

	public String getSbicPrefix() {
		return this.sbicPrefix;
	}

	public void setSbicPrefix(String sbicPrefix) {
		this.sbicPrefix = sbicPrefix;
	}

	public Integer getSbicIndex1() {
		return this.sbicIndex1;
	}

	public void setSbicIndex1(Integer sbicIndex1) {
		this.sbicIndex1 = sbicIndex1;
	}

	public Integer getSbicNextSb() {
		return this.sbicNextSb;
	}

	public void setSbicNextSb(Integer sbicNextSb) {
		this.sbicNextSb = sbicNextSb;
	}

	public String getSbicUser1() {
		return this.sbicUser1;
	}

	public void setSbicUser1(String sbicUser1) {
		this.sbicUser1 = sbicUser1;
	}

	public String getSbicUser2() {
		return this.sbicUser2;
	}

	public void setSbicUser2(String sbicUser2) {
		this.sbicUser2 = sbicUser2;
	}

	public String getSbicUser3() {
		return this.sbicUser3;
	}

	public void setSbicUser3(String sbicUser3) {
		this.sbicUser3 = sbicUser3;
	}

	public String getSbicUser4() {
		return this.sbicUser4;
	}

	public void setSbicUser4(String sbicUser4) {
		this.sbicUser4 = sbicUser4;
	}

	public String getSbicQadc01() {
		return this.sbicQadc01;
	}

	public void setSbicQadc01(String sbicQadc01) {
		this.sbicQadc01 = sbicQadc01;
	}

	public String getSbicQadc02() {
		return this.sbicQadc02;
	}

	public void setSbicQadc02(String sbicQadc02) {
		this.sbicQadc02 = sbicQadc02;
	}

	public String getSbicQadc03() {
		return this.sbicQadc03;
	}

	public void setSbicQadc03(String sbicQadc03) {
		this.sbicQadc03 = sbicQadc03;
	}

	public String getSbicQadc04() {
		return this.sbicQadc04;
	}

	public void setSbicQadc04(String sbicQadc04) {
		this.sbicQadc04 = sbicQadc04;
	}

	public Integer getSbicQadi01() {
		return this.sbicQadi01;
	}

	public void setSbicQadi01(Integer sbicQadi01) {
		this.sbicQadi01 = sbicQadi01;
	}

	public Integer getSbicQadi02() {
		return this.sbicQadi02;
	}

	public void setSbicQadi02(Integer sbicQadi02) {
		this.sbicQadi02 = sbicQadi02;
	}

	public Integer getSbicQadi03() {
		return this.sbicQadi03;
	}

	public void setSbicQadi03(Integer sbicQadi03) {
		this.sbicQadi03 = sbicQadi03;
	}

	public Integer getSbicQadi04() {
		return this.sbicQadi04;
	}

	public void setSbicQadi04(Integer sbicQadi04) {
		this.sbicQadi04 = sbicQadi04;
	}

	public Double getSbicQadd01() {
		return this.sbicQadd01;
	}

	public void setSbicQadd01(Double sbicQadd01) {
		this.sbicQadd01 = sbicQadd01;
	}

	public Double getSbicQadd02() {
		return this.sbicQadd02;
	}

	public void setSbicQadd02(Double sbicQadd02) {
		this.sbicQadd02 = sbicQadd02;
	}

	public Double getSbicQadd03() {
		return this.sbicQadd03;
	}

	public void setSbicQadd03(Double sbicQadd03) {
		this.sbicQadd03 = sbicQadd03;
	}

	public Double getSbicQadd04() {
		return this.sbicQadd04;
	}

	public void setSbicQadd04(Double sbicQadd04) {
		this.sbicQadd04 = sbicQadd04;
	}

	public Boolean getSbicQadl01() {
		return this.sbicQadl01;
	}

	public void setSbicQadl01(Boolean sbicQadl01) {
		this.sbicQadl01 = sbicQadl01;
	}

	public Boolean getSbicQadl02() {
		return this.sbicQadl02;
	}

	public void setSbicQadl02(Boolean sbicQadl02) {
		this.sbicQadl02 = sbicQadl02;
	}

	public Boolean getSbicQadl03() {
		return this.sbicQadl03;
	}

	public void setSbicQadl03(Boolean sbicQadl03) {
		this.sbicQadl03 = sbicQadl03;
	}

	public Boolean getSbicQadl04() {
		return this.sbicQadl04;
	}

	public void setSbicQadl04(Boolean sbicQadl04) {
		this.sbicQadl04 = sbicQadl04;
	}

	public Date getSbicQadt01() {
		return this.sbicQadt01;
	}

	public void setSbicQadt01(Date sbicQadt01) {
		this.sbicQadt01 = sbicQadt01;
	}

	public Date getSbicQadt02() {
		return this.sbicQadt02;
	}

	public void setSbicQadt02(Date sbicQadt02) {
		this.sbicQadt02 = sbicQadt02;
	}

	public Date getSbicQadt03() {
		return this.sbicQadt03;
	}

	public void setSbicQadt03(Date sbicQadt03) {
		this.sbicQadt03 = sbicQadt03;
	}

	public Date getSbicQadt04() {
		return this.sbicQadt04;
	}

	public void setSbicQadt04(Date sbicQadt04) {
		this.sbicQadt04 = sbicQadt04;
	}

	public Double getOidSbicCtl() {
		return this.oidSbicCtl;
	}

	public void setOidSbicCtl(Double oidSbicCtl) {
		this.oidSbicCtl = oidSbicCtl;
	}

}