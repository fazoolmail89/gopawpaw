package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFaMstr entity provides the base persistence definition of the FaMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFaMstr implements java.io.Serializable {

	// Fields

	private FaMstrId id;
	private String faEntity;
	private Boolean faPost;
	private Boolean faDep;
	private String faDesc1;
	private String faReceiver;
	private String faAuthNumber;
	private Integer faQty;
	private String faCode;
	private Date faStartdt;
	private Date faWardt;
	private Date faDispDt;
	private String faDispRsn;
	private Double faPuramt;
	private Double faReplamt;
	private Double faDispamt;
	private Double faSalvamt;
	private String faCustodian;
	private String faFaclsId;
	private String faParent;
	private String faVendsrc;
	private String faPo;
	private String faFabchId;
	private Integer faCmtindx;
	private String faInsCo;
	private Date faInsDate;
	private String faInsNbr;
	private Double faInsamt;
	private Boolean faMigrate;
	private String faModUserid;
	private Date faModDate;
	private String faUser1;
	private String faUser2;
	private String faChr01;
	private String faChr02;
	private String faChr03;
	private String faChr04;
	private Double faDec01;
	private Double faDec02;
	private Double faDec03;
	private Double faDec04;
	private Boolean faLog01;
	private Boolean faLog02;
	private Boolean faLog03;
	private Boolean faLog04;
	private Date faDte01;
	private Date faDte02;
	private Date faDte03;
	private Date faDte04;
	private Integer faInt01;
	private Integer faInt02;
	private Integer faInt03;
	private Integer faInt04;
	private String faQadc01;
	private Double faQadd01;
	private Boolean faQadl01;
	private Integer faQadi01;
	private Date faQadt01;
	private String faSplitFrom;
	private Date faSplitDate;
	private String faFalocId;
	private String faQadc02;
	private Double oidFaMstr;

	// Constructors

	/** default constructor */
	public AbstractFaMstr() {
	}

	/** minimal constructor */
	public AbstractFaMstr(FaMstrId id, String faEntity, Boolean faPost,
			Boolean faDep, String faDesc1, String faReceiver,
			String faAuthNumber, Integer faQty, String faCode, Date faStartdt,
			String faDispRsn, Double faPuramt, Double faReplamt,
			Double faDispamt, Double faSalvamt, String faCustodian,
			String faFaclsId, String faParent, String faVendsrc, String faPo,
			String faFabchId, Integer faCmtindx, String faInsCo,
			String faInsNbr, Double faInsamt, Boolean faMigrate,
			String faModUserid, Date faModDate, String faUser1, String faUser2,
			String faChr01, String faChr02, String faChr03, String faChr04,
			Double faDec01, Double faDec02, Double faDec03, Double faDec04,
			Boolean faLog01, Boolean faLog02, Boolean faLog03, Boolean faLog04,
			Integer faInt01, Integer faInt02, Integer faInt03, Integer faInt04,
			String faQadc01, Double faQadd01, Boolean faQadl01,
			Integer faQadi01, String faSplitFrom, String faFalocId,
			Double oidFaMstr) {
		this.id = id;
		this.faEntity = faEntity;
		this.faPost = faPost;
		this.faDep = faDep;
		this.faDesc1 = faDesc1;
		this.faReceiver = faReceiver;
		this.faAuthNumber = faAuthNumber;
		this.faQty = faQty;
		this.faCode = faCode;
		this.faStartdt = faStartdt;
		this.faDispRsn = faDispRsn;
		this.faPuramt = faPuramt;
		this.faReplamt = faReplamt;
		this.faDispamt = faDispamt;
		this.faSalvamt = faSalvamt;
		this.faCustodian = faCustodian;
		this.faFaclsId = faFaclsId;
		this.faParent = faParent;
		this.faVendsrc = faVendsrc;
		this.faPo = faPo;
		this.faFabchId = faFabchId;
		this.faCmtindx = faCmtindx;
		this.faInsCo = faInsCo;
		this.faInsNbr = faInsNbr;
		this.faInsamt = faInsamt;
		this.faMigrate = faMigrate;
		this.faModUserid = faModUserid;
		this.faModDate = faModDate;
		this.faUser1 = faUser1;
		this.faUser2 = faUser2;
		this.faChr01 = faChr01;
		this.faChr02 = faChr02;
		this.faChr03 = faChr03;
		this.faChr04 = faChr04;
		this.faDec01 = faDec01;
		this.faDec02 = faDec02;
		this.faDec03 = faDec03;
		this.faDec04 = faDec04;
		this.faLog01 = faLog01;
		this.faLog02 = faLog02;
		this.faLog03 = faLog03;
		this.faLog04 = faLog04;
		this.faInt01 = faInt01;
		this.faInt02 = faInt02;
		this.faInt03 = faInt03;
		this.faInt04 = faInt04;
		this.faQadc01 = faQadc01;
		this.faQadd01 = faQadd01;
		this.faQadl01 = faQadl01;
		this.faQadi01 = faQadi01;
		this.faSplitFrom = faSplitFrom;
		this.faFalocId = faFalocId;
		this.oidFaMstr = oidFaMstr;
	}

	/** full constructor */
	public AbstractFaMstr(FaMstrId id, String faEntity, Boolean faPost,
			Boolean faDep, String faDesc1, String faReceiver,
			String faAuthNumber, Integer faQty, String faCode, Date faStartdt,
			Date faWardt, Date faDispDt, String faDispRsn, Double faPuramt,
			Double faReplamt, Double faDispamt, Double faSalvamt,
			String faCustodian, String faFaclsId, String faParent,
			String faVendsrc, String faPo, String faFabchId, Integer faCmtindx,
			String faInsCo, Date faInsDate, String faInsNbr, Double faInsamt,
			Boolean faMigrate, String faModUserid, Date faModDate,
			String faUser1, String faUser2, String faChr01, String faChr02,
			String faChr03, String faChr04, Double faDec01, Double faDec02,
			Double faDec03, Double faDec04, Boolean faLog01, Boolean faLog02,
			Boolean faLog03, Boolean faLog04, Date faDte01, Date faDte02,
			Date faDte03, Date faDte04, Integer faInt01, Integer faInt02,
			Integer faInt03, Integer faInt04, String faQadc01, Double faQadd01,
			Boolean faQadl01, Integer faQadi01, Date faQadt01,
			String faSplitFrom, Date faSplitDate, String faFalocId,
			String faQadc02, Double oidFaMstr) {
		this.id = id;
		this.faEntity = faEntity;
		this.faPost = faPost;
		this.faDep = faDep;
		this.faDesc1 = faDesc1;
		this.faReceiver = faReceiver;
		this.faAuthNumber = faAuthNumber;
		this.faQty = faQty;
		this.faCode = faCode;
		this.faStartdt = faStartdt;
		this.faWardt = faWardt;
		this.faDispDt = faDispDt;
		this.faDispRsn = faDispRsn;
		this.faPuramt = faPuramt;
		this.faReplamt = faReplamt;
		this.faDispamt = faDispamt;
		this.faSalvamt = faSalvamt;
		this.faCustodian = faCustodian;
		this.faFaclsId = faFaclsId;
		this.faParent = faParent;
		this.faVendsrc = faVendsrc;
		this.faPo = faPo;
		this.faFabchId = faFabchId;
		this.faCmtindx = faCmtindx;
		this.faInsCo = faInsCo;
		this.faInsDate = faInsDate;
		this.faInsNbr = faInsNbr;
		this.faInsamt = faInsamt;
		this.faMigrate = faMigrate;
		this.faModUserid = faModUserid;
		this.faModDate = faModDate;
		this.faUser1 = faUser1;
		this.faUser2 = faUser2;
		this.faChr01 = faChr01;
		this.faChr02 = faChr02;
		this.faChr03 = faChr03;
		this.faChr04 = faChr04;
		this.faDec01 = faDec01;
		this.faDec02 = faDec02;
		this.faDec03 = faDec03;
		this.faDec04 = faDec04;
		this.faLog01 = faLog01;
		this.faLog02 = faLog02;
		this.faLog03 = faLog03;
		this.faLog04 = faLog04;
		this.faDte01 = faDte01;
		this.faDte02 = faDte02;
		this.faDte03 = faDte03;
		this.faDte04 = faDte04;
		this.faInt01 = faInt01;
		this.faInt02 = faInt02;
		this.faInt03 = faInt03;
		this.faInt04 = faInt04;
		this.faQadc01 = faQadc01;
		this.faQadd01 = faQadd01;
		this.faQadl01 = faQadl01;
		this.faQadi01 = faQadi01;
		this.faQadt01 = faQadt01;
		this.faSplitFrom = faSplitFrom;
		this.faSplitDate = faSplitDate;
		this.faFalocId = faFalocId;
		this.faQadc02 = faQadc02;
		this.oidFaMstr = oidFaMstr;
	}

	// Property accessors

	public FaMstrId getId() {
		return this.id;
	}

	public void setId(FaMstrId id) {
		this.id = id;
	}

	public String getFaEntity() {
		return this.faEntity;
	}

	public void setFaEntity(String faEntity) {
		this.faEntity = faEntity;
	}

	public Boolean getFaPost() {
		return this.faPost;
	}

	public void setFaPost(Boolean faPost) {
		this.faPost = faPost;
	}

	public Boolean getFaDep() {
		return this.faDep;
	}

	public void setFaDep(Boolean faDep) {
		this.faDep = faDep;
	}

	public String getFaDesc1() {
		return this.faDesc1;
	}

	public void setFaDesc1(String faDesc1) {
		this.faDesc1 = faDesc1;
	}

	public String getFaReceiver() {
		return this.faReceiver;
	}

	public void setFaReceiver(String faReceiver) {
		this.faReceiver = faReceiver;
	}

	public String getFaAuthNumber() {
		return this.faAuthNumber;
	}

	public void setFaAuthNumber(String faAuthNumber) {
		this.faAuthNumber = faAuthNumber;
	}

	public Integer getFaQty() {
		return this.faQty;
	}

	public void setFaQty(Integer faQty) {
		this.faQty = faQty;
	}

	public String getFaCode() {
		return this.faCode;
	}

	public void setFaCode(String faCode) {
		this.faCode = faCode;
	}

	public Date getFaStartdt() {
		return this.faStartdt;
	}

	public void setFaStartdt(Date faStartdt) {
		this.faStartdt = faStartdt;
	}

	public Date getFaWardt() {
		return this.faWardt;
	}

	public void setFaWardt(Date faWardt) {
		this.faWardt = faWardt;
	}

	public Date getFaDispDt() {
		return this.faDispDt;
	}

	public void setFaDispDt(Date faDispDt) {
		this.faDispDt = faDispDt;
	}

	public String getFaDispRsn() {
		return this.faDispRsn;
	}

	public void setFaDispRsn(String faDispRsn) {
		this.faDispRsn = faDispRsn;
	}

	public Double getFaPuramt() {
		return this.faPuramt;
	}

	public void setFaPuramt(Double faPuramt) {
		this.faPuramt = faPuramt;
	}

	public Double getFaReplamt() {
		return this.faReplamt;
	}

	public void setFaReplamt(Double faReplamt) {
		this.faReplamt = faReplamt;
	}

	public Double getFaDispamt() {
		return this.faDispamt;
	}

	public void setFaDispamt(Double faDispamt) {
		this.faDispamt = faDispamt;
	}

	public Double getFaSalvamt() {
		return this.faSalvamt;
	}

	public void setFaSalvamt(Double faSalvamt) {
		this.faSalvamt = faSalvamt;
	}

	public String getFaCustodian() {
		return this.faCustodian;
	}

	public void setFaCustodian(String faCustodian) {
		this.faCustodian = faCustodian;
	}

	public String getFaFaclsId() {
		return this.faFaclsId;
	}

	public void setFaFaclsId(String faFaclsId) {
		this.faFaclsId = faFaclsId;
	}

	public String getFaParent() {
		return this.faParent;
	}

	public void setFaParent(String faParent) {
		this.faParent = faParent;
	}

	public String getFaVendsrc() {
		return this.faVendsrc;
	}

	public void setFaVendsrc(String faVendsrc) {
		this.faVendsrc = faVendsrc;
	}

	public String getFaPo() {
		return this.faPo;
	}

	public void setFaPo(String faPo) {
		this.faPo = faPo;
	}

	public String getFaFabchId() {
		return this.faFabchId;
	}

	public void setFaFabchId(String faFabchId) {
		this.faFabchId = faFabchId;
	}

	public Integer getFaCmtindx() {
		return this.faCmtindx;
	}

	public void setFaCmtindx(Integer faCmtindx) {
		this.faCmtindx = faCmtindx;
	}

	public String getFaInsCo() {
		return this.faInsCo;
	}

	public void setFaInsCo(String faInsCo) {
		this.faInsCo = faInsCo;
	}

	public Date getFaInsDate() {
		return this.faInsDate;
	}

	public void setFaInsDate(Date faInsDate) {
		this.faInsDate = faInsDate;
	}

	public String getFaInsNbr() {
		return this.faInsNbr;
	}

	public void setFaInsNbr(String faInsNbr) {
		this.faInsNbr = faInsNbr;
	}

	public Double getFaInsamt() {
		return this.faInsamt;
	}

	public void setFaInsamt(Double faInsamt) {
		this.faInsamt = faInsamt;
	}

	public Boolean getFaMigrate() {
		return this.faMigrate;
	}

	public void setFaMigrate(Boolean faMigrate) {
		this.faMigrate = faMigrate;
	}

	public String getFaModUserid() {
		return this.faModUserid;
	}

	public void setFaModUserid(String faModUserid) {
		this.faModUserid = faModUserid;
	}

	public Date getFaModDate() {
		return this.faModDate;
	}

	public void setFaModDate(Date faModDate) {
		this.faModDate = faModDate;
	}

	public String getFaUser1() {
		return this.faUser1;
	}

	public void setFaUser1(String faUser1) {
		this.faUser1 = faUser1;
	}

	public String getFaUser2() {
		return this.faUser2;
	}

	public void setFaUser2(String faUser2) {
		this.faUser2 = faUser2;
	}

	public String getFaChr01() {
		return this.faChr01;
	}

	public void setFaChr01(String faChr01) {
		this.faChr01 = faChr01;
	}

	public String getFaChr02() {
		return this.faChr02;
	}

	public void setFaChr02(String faChr02) {
		this.faChr02 = faChr02;
	}

	public String getFaChr03() {
		return this.faChr03;
	}

	public void setFaChr03(String faChr03) {
		this.faChr03 = faChr03;
	}

	public String getFaChr04() {
		return this.faChr04;
	}

	public void setFaChr04(String faChr04) {
		this.faChr04 = faChr04;
	}

	public Double getFaDec01() {
		return this.faDec01;
	}

	public void setFaDec01(Double faDec01) {
		this.faDec01 = faDec01;
	}

	public Double getFaDec02() {
		return this.faDec02;
	}

	public void setFaDec02(Double faDec02) {
		this.faDec02 = faDec02;
	}

	public Double getFaDec03() {
		return this.faDec03;
	}

	public void setFaDec03(Double faDec03) {
		this.faDec03 = faDec03;
	}

	public Double getFaDec04() {
		return this.faDec04;
	}

	public void setFaDec04(Double faDec04) {
		this.faDec04 = faDec04;
	}

	public Boolean getFaLog01() {
		return this.faLog01;
	}

	public void setFaLog01(Boolean faLog01) {
		this.faLog01 = faLog01;
	}

	public Boolean getFaLog02() {
		return this.faLog02;
	}

	public void setFaLog02(Boolean faLog02) {
		this.faLog02 = faLog02;
	}

	public Boolean getFaLog03() {
		return this.faLog03;
	}

	public void setFaLog03(Boolean faLog03) {
		this.faLog03 = faLog03;
	}

	public Boolean getFaLog04() {
		return this.faLog04;
	}

	public void setFaLog04(Boolean faLog04) {
		this.faLog04 = faLog04;
	}

	public Date getFaDte01() {
		return this.faDte01;
	}

	public void setFaDte01(Date faDte01) {
		this.faDte01 = faDte01;
	}

	public Date getFaDte02() {
		return this.faDte02;
	}

	public void setFaDte02(Date faDte02) {
		this.faDte02 = faDte02;
	}

	public Date getFaDte03() {
		return this.faDte03;
	}

	public void setFaDte03(Date faDte03) {
		this.faDte03 = faDte03;
	}

	public Date getFaDte04() {
		return this.faDte04;
	}

	public void setFaDte04(Date faDte04) {
		this.faDte04 = faDte04;
	}

	public Integer getFaInt01() {
		return this.faInt01;
	}

	public void setFaInt01(Integer faInt01) {
		this.faInt01 = faInt01;
	}

	public Integer getFaInt02() {
		return this.faInt02;
	}

	public void setFaInt02(Integer faInt02) {
		this.faInt02 = faInt02;
	}

	public Integer getFaInt03() {
		return this.faInt03;
	}

	public void setFaInt03(Integer faInt03) {
		this.faInt03 = faInt03;
	}

	public Integer getFaInt04() {
		return this.faInt04;
	}

	public void setFaInt04(Integer faInt04) {
		this.faInt04 = faInt04;
	}

	public String getFaQadc01() {
		return this.faQadc01;
	}

	public void setFaQadc01(String faQadc01) {
		this.faQadc01 = faQadc01;
	}

	public Double getFaQadd01() {
		return this.faQadd01;
	}

	public void setFaQadd01(Double faQadd01) {
		this.faQadd01 = faQadd01;
	}

	public Boolean getFaQadl01() {
		return this.faQadl01;
	}

	public void setFaQadl01(Boolean faQadl01) {
		this.faQadl01 = faQadl01;
	}

	public Integer getFaQadi01() {
		return this.faQadi01;
	}

	public void setFaQadi01(Integer faQadi01) {
		this.faQadi01 = faQadi01;
	}

	public Date getFaQadt01() {
		return this.faQadt01;
	}

	public void setFaQadt01(Date faQadt01) {
		this.faQadt01 = faQadt01;
	}

	public String getFaSplitFrom() {
		return this.faSplitFrom;
	}

	public void setFaSplitFrom(String faSplitFrom) {
		this.faSplitFrom = faSplitFrom;
	}

	public Date getFaSplitDate() {
		return this.faSplitDate;
	}

	public void setFaSplitDate(Date faSplitDate) {
		this.faSplitDate = faSplitDate;
	}

	public String getFaFalocId() {
		return this.faFalocId;
	}

	public void setFaFalocId(String faFalocId) {
		this.faFalocId = faFalocId;
	}

	public String getFaQadc02() {
		return this.faQadc02;
	}

	public void setFaQadc02(String faQadc02) {
		this.faQadc02 = faQadc02;
	}

	public Double getOidFaMstr() {
		return this.oidFaMstr;
	}

	public void setOidFaMstr(Double oidFaMstr) {
		this.oidFaMstr = oidFaMstr;
	}

}