package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * AbstractMonMstr entity provides the base persistence definition of the
 * MonMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMonMstr implements java.io.Serializable {

	// Fields

	private MonMstrId id;
	private Integer monOraId1;
	private Integer monOraId2;
	private String monSelection;
	private Integer monTimeStart;
	private Integer monLoginTime;
	private Integer monIdleTime;
	private String monProgram;
	private String monUser1;
	private String monUser2;
	private String monQadc01;
	private Integer monQadi01;
	private Double monQadd01;
	private Boolean monQadl01;
	private Date monQadt01;
	private String monProgUser;
	private Date monLoginDate;
	private String monInterface;
	private Date monDateStart;
	private Double oidMonMstr;

	// Constructors

	/** default constructor */
	public AbstractMonMstr() {
	}

	/** minimal constructor */
	public AbstractMonMstr(MonMstrId id, String monProgUser,
			String monInterface, Double oidMonMstr) {
		this.id = id;
		this.monProgUser = monProgUser;
		this.monInterface = monInterface;
		this.oidMonMstr = oidMonMstr;
	}

	/** full constructor */
	public AbstractMonMstr(MonMstrId id, Integer monOraId1, Integer monOraId2,
			String monSelection, Integer monTimeStart, Integer monLoginTime,
			Integer monIdleTime, String monProgram, String monUser1,
			String monUser2, String monQadc01, Integer monQadi01,
			Double monQadd01, Boolean monQadl01, Date monQadt01,
			String monProgUser, Date monLoginDate, String monInterface,
			Date monDateStart, Double oidMonMstr) {
		this.id = id;
		this.monOraId1 = monOraId1;
		this.monOraId2 = monOraId2;
		this.monSelection = monSelection;
		this.monTimeStart = monTimeStart;
		this.monLoginTime = monLoginTime;
		this.monIdleTime = monIdleTime;
		this.monProgram = monProgram;
		this.monUser1 = monUser1;
		this.monUser2 = monUser2;
		this.monQadc01 = monQadc01;
		this.monQadi01 = monQadi01;
		this.monQadd01 = monQadd01;
		this.monQadl01 = monQadl01;
		this.monQadt01 = monQadt01;
		this.monProgUser = monProgUser;
		this.monLoginDate = monLoginDate;
		this.monInterface = monInterface;
		this.monDateStart = monDateStart;
		this.oidMonMstr = oidMonMstr;
	}

	// Property accessors

	public MonMstrId getId() {
		return this.id;
	}

	public void setId(MonMstrId id) {
		this.id = id;
	}

	public Integer getMonOraId1() {
		return this.monOraId1;
	}

	public void setMonOraId1(Integer monOraId1) {
		this.monOraId1 = monOraId1;
	}

	public Integer getMonOraId2() {
		return this.monOraId2;
	}

	public void setMonOraId2(Integer monOraId2) {
		this.monOraId2 = monOraId2;
	}

	public String getMonSelection() {
		return this.monSelection;
	}

	public void setMonSelection(String monSelection) {
		this.monSelection = monSelection;
	}

	public Integer getMonTimeStart() {
		return this.monTimeStart;
	}

	public void setMonTimeStart(Integer monTimeStart) {
		this.monTimeStart = monTimeStart;
	}

	public Integer getMonLoginTime() {
		return this.monLoginTime;
	}

	public void setMonLoginTime(Integer monLoginTime) {
		this.monLoginTime = monLoginTime;
	}

	public Integer getMonIdleTime() {
		return this.monIdleTime;
	}

	public void setMonIdleTime(Integer monIdleTime) {
		this.monIdleTime = monIdleTime;
	}

	public String getMonProgram() {
		return this.monProgram;
	}

	public void setMonProgram(String monProgram) {
		this.monProgram = monProgram;
	}

	public String getMonUser1() {
		return this.monUser1;
	}

	public void setMonUser1(String monUser1) {
		this.monUser1 = monUser1;
	}

	public String getMonUser2() {
		return this.monUser2;
	}

	public void setMonUser2(String monUser2) {
		this.monUser2 = monUser2;
	}

	public String getMonQadc01() {
		return this.monQadc01;
	}

	public void setMonQadc01(String monQadc01) {
		this.monQadc01 = monQadc01;
	}

	public Integer getMonQadi01() {
		return this.monQadi01;
	}

	public void setMonQadi01(Integer monQadi01) {
		this.monQadi01 = monQadi01;
	}

	public Double getMonQadd01() {
		return this.monQadd01;
	}

	public void setMonQadd01(Double monQadd01) {
		this.monQadd01 = monQadd01;
	}

	public Boolean getMonQadl01() {
		return this.monQadl01;
	}

	public void setMonQadl01(Boolean monQadl01) {
		this.monQadl01 = monQadl01;
	}

	public Date getMonQadt01() {
		return this.monQadt01;
	}

	public void setMonQadt01(Date monQadt01) {
		this.monQadt01 = monQadt01;
	}

	public String getMonProgUser() {
		return this.monProgUser;
	}

	public void setMonProgUser(String monProgUser) {
		this.monProgUser = monProgUser;
	}

	public Date getMonLoginDate() {
		return this.monLoginDate;
	}

	public void setMonLoginDate(Date monLoginDate) {
		this.monLoginDate = monLoginDate;
	}

	public String getMonInterface() {
		return this.monInterface;
	}

	public void setMonInterface(String monInterface) {
		this.monInterface = monInterface;
	}

	public Date getMonDateStart() {
		return this.monDateStart;
	}

	public void setMonDateStart(Date monDateStart) {
		this.monDateStart = monDateStart;
	}

	public Double getOidMonMstr() {
		return this.oidMonMstr;
	}

	public void setOidMonMstr(Double oidMonMstr) {
		this.oidMonMstr = oidMonMstr;
	}

}