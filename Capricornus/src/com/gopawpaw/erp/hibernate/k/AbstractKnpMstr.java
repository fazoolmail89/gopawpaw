package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * AbstractKnpMstr entity provides the base persistence definition of the
 * KnpMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnpMstr implements java.io.Serializable {

	// Fields

	private KnpMstrId id;
	private String knpDesc;
	private Double knpKeyid;
	private Double knpTimeAvail;
	private Double knpPctUptime;
	private String knpProcessFunction;
	private String knpProductionLine;
	private String knpLoc;
	private String knpPlannerId;
	private String knpLevelMixSeq;
	private String knpTaktTimeCalc;
	private Integer knpEpeiDisp;
	private Double knpChgOverAvail;
	private Double knpCoPerInterval;
	private Double knpCycleTime;
	private Double knpMoveTime;
	private Double knpEpeInterval;
	private Double knpTaktTime;
	private Double knpPitchInterval;
	private Double knpPitchQuantity;
	private String knpPitchUm;
	private Date knpModDate;
	private String knpModUserid;
	private String knpUser1;
	private String knpUser2;
	private String knpQadc01;
	private String knpQadc02;
	private Double knpMinEpeInterval;
	private Double knpResources;
	private Double knpLoadLimit;
	private Integer knpLeadTimeMethod;
	private Integer knpCmtindx;
	private Double oidKnpMstr;

	// Constructors

	/** default constructor */
	public AbstractKnpMstr() {
	}

	/** minimal constructor */
	public AbstractKnpMstr(KnpMstrId id, Double knpKeyid, Double knpTimeAvail,
			String knpProcessFunction, String knpProductionLine, String knpLoc,
			String knpPlannerId, String knpLevelMixSeq, String knpTaktTimeCalc,
			Integer knpEpeiDisp, Double knpChgOverAvail,
			Double knpCoPerInterval, Double knpCycleTime, Double knpMoveTime,
			Double knpEpeInterval, Double knpTaktTime, Double knpPitchInterval,
			Double knpPitchQuantity, String knpPitchUm, Date knpModDate,
			String knpModUserid, String knpUser1, String knpUser2,
			String knpQadc01, String knpQadc02, Double knpMinEpeInterval,
			Double knpResources, Double knpLoadLimit,
			Integer knpLeadTimeMethod, Integer knpCmtindx, Double oidKnpMstr) {
		this.id = id;
		this.knpKeyid = knpKeyid;
		this.knpTimeAvail = knpTimeAvail;
		this.knpProcessFunction = knpProcessFunction;
		this.knpProductionLine = knpProductionLine;
		this.knpLoc = knpLoc;
		this.knpPlannerId = knpPlannerId;
		this.knpLevelMixSeq = knpLevelMixSeq;
		this.knpTaktTimeCalc = knpTaktTimeCalc;
		this.knpEpeiDisp = knpEpeiDisp;
		this.knpChgOverAvail = knpChgOverAvail;
		this.knpCoPerInterval = knpCoPerInterval;
		this.knpCycleTime = knpCycleTime;
		this.knpMoveTime = knpMoveTime;
		this.knpEpeInterval = knpEpeInterval;
		this.knpTaktTime = knpTaktTime;
		this.knpPitchInterval = knpPitchInterval;
		this.knpPitchQuantity = knpPitchQuantity;
		this.knpPitchUm = knpPitchUm;
		this.knpModDate = knpModDate;
		this.knpModUserid = knpModUserid;
		this.knpUser1 = knpUser1;
		this.knpUser2 = knpUser2;
		this.knpQadc01 = knpQadc01;
		this.knpQadc02 = knpQadc02;
		this.knpMinEpeInterval = knpMinEpeInterval;
		this.knpResources = knpResources;
		this.knpLoadLimit = knpLoadLimit;
		this.knpLeadTimeMethod = knpLeadTimeMethod;
		this.knpCmtindx = knpCmtindx;
		this.oidKnpMstr = oidKnpMstr;
	}

	/** full constructor */
	public AbstractKnpMstr(KnpMstrId id, String knpDesc, Double knpKeyid,
			Double knpTimeAvail, Double knpPctUptime,
			String knpProcessFunction, String knpProductionLine, String knpLoc,
			String knpPlannerId, String knpLevelMixSeq, String knpTaktTimeCalc,
			Integer knpEpeiDisp, Double knpChgOverAvail,
			Double knpCoPerInterval, Double knpCycleTime, Double knpMoveTime,
			Double knpEpeInterval, Double knpTaktTime, Double knpPitchInterval,
			Double knpPitchQuantity, String knpPitchUm, Date knpModDate,
			String knpModUserid, String knpUser1, String knpUser2,
			String knpQadc01, String knpQadc02, Double knpMinEpeInterval,
			Double knpResources, Double knpLoadLimit,
			Integer knpLeadTimeMethod, Integer knpCmtindx, Double oidKnpMstr) {
		this.id = id;
		this.knpDesc = knpDesc;
		this.knpKeyid = knpKeyid;
		this.knpTimeAvail = knpTimeAvail;
		this.knpPctUptime = knpPctUptime;
		this.knpProcessFunction = knpProcessFunction;
		this.knpProductionLine = knpProductionLine;
		this.knpLoc = knpLoc;
		this.knpPlannerId = knpPlannerId;
		this.knpLevelMixSeq = knpLevelMixSeq;
		this.knpTaktTimeCalc = knpTaktTimeCalc;
		this.knpEpeiDisp = knpEpeiDisp;
		this.knpChgOverAvail = knpChgOverAvail;
		this.knpCoPerInterval = knpCoPerInterval;
		this.knpCycleTime = knpCycleTime;
		this.knpMoveTime = knpMoveTime;
		this.knpEpeInterval = knpEpeInterval;
		this.knpTaktTime = knpTaktTime;
		this.knpPitchInterval = knpPitchInterval;
		this.knpPitchQuantity = knpPitchQuantity;
		this.knpPitchUm = knpPitchUm;
		this.knpModDate = knpModDate;
		this.knpModUserid = knpModUserid;
		this.knpUser1 = knpUser1;
		this.knpUser2 = knpUser2;
		this.knpQadc01 = knpQadc01;
		this.knpQadc02 = knpQadc02;
		this.knpMinEpeInterval = knpMinEpeInterval;
		this.knpResources = knpResources;
		this.knpLoadLimit = knpLoadLimit;
		this.knpLeadTimeMethod = knpLeadTimeMethod;
		this.knpCmtindx = knpCmtindx;
		this.oidKnpMstr = oidKnpMstr;
	}

	// Property accessors

	public KnpMstrId getId() {
		return this.id;
	}

	public void setId(KnpMstrId id) {
		this.id = id;
	}

	public String getKnpDesc() {
		return this.knpDesc;
	}

	public void setKnpDesc(String knpDesc) {
		this.knpDesc = knpDesc;
	}

	public Double getKnpKeyid() {
		return this.knpKeyid;
	}

	public void setKnpKeyid(Double knpKeyid) {
		this.knpKeyid = knpKeyid;
	}

	public Double getKnpTimeAvail() {
		return this.knpTimeAvail;
	}

	public void setKnpTimeAvail(Double knpTimeAvail) {
		this.knpTimeAvail = knpTimeAvail;
	}

	public Double getKnpPctUptime() {
		return this.knpPctUptime;
	}

	public void setKnpPctUptime(Double knpPctUptime) {
		this.knpPctUptime = knpPctUptime;
	}

	public String getKnpProcessFunction() {
		return this.knpProcessFunction;
	}

	public void setKnpProcessFunction(String knpProcessFunction) {
		this.knpProcessFunction = knpProcessFunction;
	}

	public String getKnpProductionLine() {
		return this.knpProductionLine;
	}

	public void setKnpProductionLine(String knpProductionLine) {
		this.knpProductionLine = knpProductionLine;
	}

	public String getKnpLoc() {
		return this.knpLoc;
	}

	public void setKnpLoc(String knpLoc) {
		this.knpLoc = knpLoc;
	}

	public String getKnpPlannerId() {
		return this.knpPlannerId;
	}

	public void setKnpPlannerId(String knpPlannerId) {
		this.knpPlannerId = knpPlannerId;
	}

	public String getKnpLevelMixSeq() {
		return this.knpLevelMixSeq;
	}

	public void setKnpLevelMixSeq(String knpLevelMixSeq) {
		this.knpLevelMixSeq = knpLevelMixSeq;
	}

	public String getKnpTaktTimeCalc() {
		return this.knpTaktTimeCalc;
	}

	public void setKnpTaktTimeCalc(String knpTaktTimeCalc) {
		this.knpTaktTimeCalc = knpTaktTimeCalc;
	}

	public Integer getKnpEpeiDisp() {
		return this.knpEpeiDisp;
	}

	public void setKnpEpeiDisp(Integer knpEpeiDisp) {
		this.knpEpeiDisp = knpEpeiDisp;
	}

	public Double getKnpChgOverAvail() {
		return this.knpChgOverAvail;
	}

	public void setKnpChgOverAvail(Double knpChgOverAvail) {
		this.knpChgOverAvail = knpChgOverAvail;
	}

	public Double getKnpCoPerInterval() {
		return this.knpCoPerInterval;
	}

	public void setKnpCoPerInterval(Double knpCoPerInterval) {
		this.knpCoPerInterval = knpCoPerInterval;
	}

	public Double getKnpCycleTime() {
		return this.knpCycleTime;
	}

	public void setKnpCycleTime(Double knpCycleTime) {
		this.knpCycleTime = knpCycleTime;
	}

	public Double getKnpMoveTime() {
		return this.knpMoveTime;
	}

	public void setKnpMoveTime(Double knpMoveTime) {
		this.knpMoveTime = knpMoveTime;
	}

	public Double getKnpEpeInterval() {
		return this.knpEpeInterval;
	}

	public void setKnpEpeInterval(Double knpEpeInterval) {
		this.knpEpeInterval = knpEpeInterval;
	}

	public Double getKnpTaktTime() {
		return this.knpTaktTime;
	}

	public void setKnpTaktTime(Double knpTaktTime) {
		this.knpTaktTime = knpTaktTime;
	}

	public Double getKnpPitchInterval() {
		return this.knpPitchInterval;
	}

	public void setKnpPitchInterval(Double knpPitchInterval) {
		this.knpPitchInterval = knpPitchInterval;
	}

	public Double getKnpPitchQuantity() {
		return this.knpPitchQuantity;
	}

	public void setKnpPitchQuantity(Double knpPitchQuantity) {
		this.knpPitchQuantity = knpPitchQuantity;
	}

	public String getKnpPitchUm() {
		return this.knpPitchUm;
	}

	public void setKnpPitchUm(String knpPitchUm) {
		this.knpPitchUm = knpPitchUm;
	}

	public Date getKnpModDate() {
		return this.knpModDate;
	}

	public void setKnpModDate(Date knpModDate) {
		this.knpModDate = knpModDate;
	}

	public String getKnpModUserid() {
		return this.knpModUserid;
	}

	public void setKnpModUserid(String knpModUserid) {
		this.knpModUserid = knpModUserid;
	}

	public String getKnpUser1() {
		return this.knpUser1;
	}

	public void setKnpUser1(String knpUser1) {
		this.knpUser1 = knpUser1;
	}

	public String getKnpUser2() {
		return this.knpUser2;
	}

	public void setKnpUser2(String knpUser2) {
		this.knpUser2 = knpUser2;
	}

	public String getKnpQadc01() {
		return this.knpQadc01;
	}

	public void setKnpQadc01(String knpQadc01) {
		this.knpQadc01 = knpQadc01;
	}

	public String getKnpQadc02() {
		return this.knpQadc02;
	}

	public void setKnpQadc02(String knpQadc02) {
		this.knpQadc02 = knpQadc02;
	}

	public Double getKnpMinEpeInterval() {
		return this.knpMinEpeInterval;
	}

	public void setKnpMinEpeInterval(Double knpMinEpeInterval) {
		this.knpMinEpeInterval = knpMinEpeInterval;
	}

	public Double getKnpResources() {
		return this.knpResources;
	}

	public void setKnpResources(Double knpResources) {
		this.knpResources = knpResources;
	}

	public Double getKnpLoadLimit() {
		return this.knpLoadLimit;
	}

	public void setKnpLoadLimit(Double knpLoadLimit) {
		this.knpLoadLimit = knpLoadLimit;
	}

	public Integer getKnpLeadTimeMethod() {
		return this.knpLeadTimeMethod;
	}

	public void setKnpLeadTimeMethod(Integer knpLeadTimeMethod) {
		this.knpLeadTimeMethod = knpLeadTimeMethod;
	}

	public Integer getKnpCmtindx() {
		return this.knpCmtindx;
	}

	public void setKnpCmtindx(Integer knpCmtindx) {
		this.knpCmtindx = knpCmtindx;
	}

	public Double getOidKnpMstr() {
		return this.oidKnpMstr;
	}

	public void setOidKnpMstr(Double oidKnpMstr) {
		this.oidKnpMstr = oidKnpMstr;
	}

}