package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * AbstractKnpdDet entity provides the base persistence definition of the
 * KnpdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnpdDet implements java.io.Serializable {

	// Fields

	private KnpdDetId id;
	private Double knpdKnpKeyid;
	private Double knpdKnbiKeyid;
	private Double knpdEpeInterval;
	private Boolean knpdEpeiAutoCalc;
	private Double knpdMixPct;
	private Double knpdYieldPct;
	private Double knpdCycleTime;
	private Double knpdEquipTime;
	private Double knpdLeadTime;
	private Double knpdSetupTime;
	private Double knpdMoveTime;
	private Double knpdWorkContent;
	private Double knpdReqOperators;
	private Integer knpdOpStart;
	private Integer knpdOpEnd;
	private Integer knpdMfgSeq;
	private Date knpdModDate;
	private String knpdModUserid;
	private String knpdUser1;
	private String knpdUser2;
	private String knpdQadc01;
	private String knpdQadc02;
	private Double knpdMinEpeInterval;
	private Double oidKnpdDet;

	// Constructors

	/** default constructor */
	public AbstractKnpdDet() {
	}

	/** minimal constructor */
	public AbstractKnpdDet(KnpdDetId id, Double knpdKnpKeyid,
			Double knpdKnbiKeyid, Double knpdEpeInterval,
			Boolean knpdEpeiAutoCalc, Double knpdYieldPct,
			Double knpdCycleTime, Double knpdEquipTime, Double knpdLeadTime,
			Double knpdSetupTime, Double knpdMoveTime, Double knpdWorkContent,
			Double knpdReqOperators, Integer knpdOpStart, Integer knpdOpEnd,
			Integer knpdMfgSeq, Date knpdModDate, String knpdModUserid,
			String knpdUser1, String knpdUser2, String knpdQadc01,
			String knpdQadc02, Double knpdMinEpeInterval, Double oidKnpdDet) {
		this.id = id;
		this.knpdKnpKeyid = knpdKnpKeyid;
		this.knpdKnbiKeyid = knpdKnbiKeyid;
		this.knpdEpeInterval = knpdEpeInterval;
		this.knpdEpeiAutoCalc = knpdEpeiAutoCalc;
		this.knpdYieldPct = knpdYieldPct;
		this.knpdCycleTime = knpdCycleTime;
		this.knpdEquipTime = knpdEquipTime;
		this.knpdLeadTime = knpdLeadTime;
		this.knpdSetupTime = knpdSetupTime;
		this.knpdMoveTime = knpdMoveTime;
		this.knpdWorkContent = knpdWorkContent;
		this.knpdReqOperators = knpdReqOperators;
		this.knpdOpStart = knpdOpStart;
		this.knpdOpEnd = knpdOpEnd;
		this.knpdMfgSeq = knpdMfgSeq;
		this.knpdModDate = knpdModDate;
		this.knpdModUserid = knpdModUserid;
		this.knpdUser1 = knpdUser1;
		this.knpdUser2 = knpdUser2;
		this.knpdQadc01 = knpdQadc01;
		this.knpdQadc02 = knpdQadc02;
		this.knpdMinEpeInterval = knpdMinEpeInterval;
		this.oidKnpdDet = oidKnpdDet;
	}

	/** full constructor */
	public AbstractKnpdDet(KnpdDetId id, Double knpdKnpKeyid,
			Double knpdKnbiKeyid, Double knpdEpeInterval,
			Boolean knpdEpeiAutoCalc, Double knpdMixPct, Double knpdYieldPct,
			Double knpdCycleTime, Double knpdEquipTime, Double knpdLeadTime,
			Double knpdSetupTime, Double knpdMoveTime, Double knpdWorkContent,
			Double knpdReqOperators, Integer knpdOpStart, Integer knpdOpEnd,
			Integer knpdMfgSeq, Date knpdModDate, String knpdModUserid,
			String knpdUser1, String knpdUser2, String knpdQadc01,
			String knpdQadc02, Double knpdMinEpeInterval, Double oidKnpdDet) {
		this.id = id;
		this.knpdKnpKeyid = knpdKnpKeyid;
		this.knpdKnbiKeyid = knpdKnbiKeyid;
		this.knpdEpeInterval = knpdEpeInterval;
		this.knpdEpeiAutoCalc = knpdEpeiAutoCalc;
		this.knpdMixPct = knpdMixPct;
		this.knpdYieldPct = knpdYieldPct;
		this.knpdCycleTime = knpdCycleTime;
		this.knpdEquipTime = knpdEquipTime;
		this.knpdLeadTime = knpdLeadTime;
		this.knpdSetupTime = knpdSetupTime;
		this.knpdMoveTime = knpdMoveTime;
		this.knpdWorkContent = knpdWorkContent;
		this.knpdReqOperators = knpdReqOperators;
		this.knpdOpStart = knpdOpStart;
		this.knpdOpEnd = knpdOpEnd;
		this.knpdMfgSeq = knpdMfgSeq;
		this.knpdModDate = knpdModDate;
		this.knpdModUserid = knpdModUserid;
		this.knpdUser1 = knpdUser1;
		this.knpdUser2 = knpdUser2;
		this.knpdQadc01 = knpdQadc01;
		this.knpdQadc02 = knpdQadc02;
		this.knpdMinEpeInterval = knpdMinEpeInterval;
		this.oidKnpdDet = oidKnpdDet;
	}

	// Property accessors

	public KnpdDetId getId() {
		return this.id;
	}

	public void setId(KnpdDetId id) {
		this.id = id;
	}

	public Double getKnpdKnpKeyid() {
		return this.knpdKnpKeyid;
	}

	public void setKnpdKnpKeyid(Double knpdKnpKeyid) {
		this.knpdKnpKeyid = knpdKnpKeyid;
	}

	public Double getKnpdKnbiKeyid() {
		return this.knpdKnbiKeyid;
	}

	public void setKnpdKnbiKeyid(Double knpdKnbiKeyid) {
		this.knpdKnbiKeyid = knpdKnbiKeyid;
	}

	public Double getKnpdEpeInterval() {
		return this.knpdEpeInterval;
	}

	public void setKnpdEpeInterval(Double knpdEpeInterval) {
		this.knpdEpeInterval = knpdEpeInterval;
	}

	public Boolean getKnpdEpeiAutoCalc() {
		return this.knpdEpeiAutoCalc;
	}

	public void setKnpdEpeiAutoCalc(Boolean knpdEpeiAutoCalc) {
		this.knpdEpeiAutoCalc = knpdEpeiAutoCalc;
	}

	public Double getKnpdMixPct() {
		return this.knpdMixPct;
	}

	public void setKnpdMixPct(Double knpdMixPct) {
		this.knpdMixPct = knpdMixPct;
	}

	public Double getKnpdYieldPct() {
		return this.knpdYieldPct;
	}

	public void setKnpdYieldPct(Double knpdYieldPct) {
		this.knpdYieldPct = knpdYieldPct;
	}

	public Double getKnpdCycleTime() {
		return this.knpdCycleTime;
	}

	public void setKnpdCycleTime(Double knpdCycleTime) {
		this.knpdCycleTime = knpdCycleTime;
	}

	public Double getKnpdEquipTime() {
		return this.knpdEquipTime;
	}

	public void setKnpdEquipTime(Double knpdEquipTime) {
		this.knpdEquipTime = knpdEquipTime;
	}

	public Double getKnpdLeadTime() {
		return this.knpdLeadTime;
	}

	public void setKnpdLeadTime(Double knpdLeadTime) {
		this.knpdLeadTime = knpdLeadTime;
	}

	public Double getKnpdSetupTime() {
		return this.knpdSetupTime;
	}

	public void setKnpdSetupTime(Double knpdSetupTime) {
		this.knpdSetupTime = knpdSetupTime;
	}

	public Double getKnpdMoveTime() {
		return this.knpdMoveTime;
	}

	public void setKnpdMoveTime(Double knpdMoveTime) {
		this.knpdMoveTime = knpdMoveTime;
	}

	public Double getKnpdWorkContent() {
		return this.knpdWorkContent;
	}

	public void setKnpdWorkContent(Double knpdWorkContent) {
		this.knpdWorkContent = knpdWorkContent;
	}

	public Double getKnpdReqOperators() {
		return this.knpdReqOperators;
	}

	public void setKnpdReqOperators(Double knpdReqOperators) {
		this.knpdReqOperators = knpdReqOperators;
	}

	public Integer getKnpdOpStart() {
		return this.knpdOpStart;
	}

	public void setKnpdOpStart(Integer knpdOpStart) {
		this.knpdOpStart = knpdOpStart;
	}

	public Integer getKnpdOpEnd() {
		return this.knpdOpEnd;
	}

	public void setKnpdOpEnd(Integer knpdOpEnd) {
		this.knpdOpEnd = knpdOpEnd;
	}

	public Integer getKnpdMfgSeq() {
		return this.knpdMfgSeq;
	}

	public void setKnpdMfgSeq(Integer knpdMfgSeq) {
		this.knpdMfgSeq = knpdMfgSeq;
	}

	public Date getKnpdModDate() {
		return this.knpdModDate;
	}

	public void setKnpdModDate(Date knpdModDate) {
		this.knpdModDate = knpdModDate;
	}

	public String getKnpdModUserid() {
		return this.knpdModUserid;
	}

	public void setKnpdModUserid(String knpdModUserid) {
		this.knpdModUserid = knpdModUserid;
	}

	public String getKnpdUser1() {
		return this.knpdUser1;
	}

	public void setKnpdUser1(String knpdUser1) {
		this.knpdUser1 = knpdUser1;
	}

	public String getKnpdUser2() {
		return this.knpdUser2;
	}

	public void setKnpdUser2(String knpdUser2) {
		this.knpdUser2 = knpdUser2;
	}

	public String getKnpdQadc01() {
		return this.knpdQadc01;
	}

	public void setKnpdQadc01(String knpdQadc01) {
		this.knpdQadc01 = knpdQadc01;
	}

	public String getKnpdQadc02() {
		return this.knpdQadc02;
	}

	public void setKnpdQadc02(String knpdQadc02) {
		this.knpdQadc02 = knpdQadc02;
	}

	public Double getKnpdMinEpeInterval() {
		return this.knpdMinEpeInterval;
	}

	public void setKnpdMinEpeInterval(Double knpdMinEpeInterval) {
		this.knpdMinEpeInterval = knpdMinEpeInterval;
	}

	public Double getOidKnpdDet() {
		return this.oidKnpdDet;
	}

	public void setOidKnpdDet(Double oidKnpdDet) {
		this.oidKnpdDet = oidKnpdDet;
	}

}