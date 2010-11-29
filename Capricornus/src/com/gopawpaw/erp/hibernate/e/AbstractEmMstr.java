package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEmMstr entity provides the base persistence definition of the EmMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEmMstr implements java.io.Serializable {

	// Fields

	private EmMstrId id;
	private String emDesc;
	private String emProgram;
	private String emSenderParm;
	private Integer emSenderSeq;
	private String emPswdParm;
	private Integer emPswdSeq;
	private String emRecipParm;
	private Integer emRecipSeq;
	private String emCcParm;
	private Integer emCcSeq;
	private String emSubjectParm;
	private Integer emSubjectSeq;
	private String emMsgParm;
	private Integer emMsgSeq;
	private String emAttachParm;
	private Integer emAttachSeq;
	private String emOtherParm;
	private Integer emOtherSeq;
	private Date emEnd;
	private String emChr01;
	private String emChr02;
	private String emChr03;
	private String emChr04;
	private String emQadc01;
	private String emQadc02;
	private String emQadc03;
	private String emQadc04;
	private Double oidEmMstr;

	// Constructors

	/** default constructor */
	public AbstractEmMstr() {
	}

	/** minimal constructor */
	public AbstractEmMstr(EmMstrId id, Double oidEmMstr) {
		this.id = id;
		this.oidEmMstr = oidEmMstr;
	}

	/** full constructor */
	public AbstractEmMstr(EmMstrId id, String emDesc, String emProgram,
			String emSenderParm, Integer emSenderSeq, String emPswdParm,
			Integer emPswdSeq, String emRecipParm, Integer emRecipSeq,
			String emCcParm, Integer emCcSeq, String emSubjectParm,
			Integer emSubjectSeq, String emMsgParm, Integer emMsgSeq,
			String emAttachParm, Integer emAttachSeq, String emOtherParm,
			Integer emOtherSeq, Date emEnd, String emChr01, String emChr02,
			String emChr03, String emChr04, String emQadc01, String emQadc02,
			String emQadc03, String emQadc04, Double oidEmMstr) {
		this.id = id;
		this.emDesc = emDesc;
		this.emProgram = emProgram;
		this.emSenderParm = emSenderParm;
		this.emSenderSeq = emSenderSeq;
		this.emPswdParm = emPswdParm;
		this.emPswdSeq = emPswdSeq;
		this.emRecipParm = emRecipParm;
		this.emRecipSeq = emRecipSeq;
		this.emCcParm = emCcParm;
		this.emCcSeq = emCcSeq;
		this.emSubjectParm = emSubjectParm;
		this.emSubjectSeq = emSubjectSeq;
		this.emMsgParm = emMsgParm;
		this.emMsgSeq = emMsgSeq;
		this.emAttachParm = emAttachParm;
		this.emAttachSeq = emAttachSeq;
		this.emOtherParm = emOtherParm;
		this.emOtherSeq = emOtherSeq;
		this.emEnd = emEnd;
		this.emChr01 = emChr01;
		this.emChr02 = emChr02;
		this.emChr03 = emChr03;
		this.emChr04 = emChr04;
		this.emQadc01 = emQadc01;
		this.emQadc02 = emQadc02;
		this.emQadc03 = emQadc03;
		this.emQadc04 = emQadc04;
		this.oidEmMstr = oidEmMstr;
	}

	// Property accessors

	public EmMstrId getId() {
		return this.id;
	}

	public void setId(EmMstrId id) {
		this.id = id;
	}

	public String getEmDesc() {
		return this.emDesc;
	}

	public void setEmDesc(String emDesc) {
		this.emDesc = emDesc;
	}

	public String getEmProgram() {
		return this.emProgram;
	}

	public void setEmProgram(String emProgram) {
		this.emProgram = emProgram;
	}

	public String getEmSenderParm() {
		return this.emSenderParm;
	}

	public void setEmSenderParm(String emSenderParm) {
		this.emSenderParm = emSenderParm;
	}

	public Integer getEmSenderSeq() {
		return this.emSenderSeq;
	}

	public void setEmSenderSeq(Integer emSenderSeq) {
		this.emSenderSeq = emSenderSeq;
	}

	public String getEmPswdParm() {
		return this.emPswdParm;
	}

	public void setEmPswdParm(String emPswdParm) {
		this.emPswdParm = emPswdParm;
	}

	public Integer getEmPswdSeq() {
		return this.emPswdSeq;
	}

	public void setEmPswdSeq(Integer emPswdSeq) {
		this.emPswdSeq = emPswdSeq;
	}

	public String getEmRecipParm() {
		return this.emRecipParm;
	}

	public void setEmRecipParm(String emRecipParm) {
		this.emRecipParm = emRecipParm;
	}

	public Integer getEmRecipSeq() {
		return this.emRecipSeq;
	}

	public void setEmRecipSeq(Integer emRecipSeq) {
		this.emRecipSeq = emRecipSeq;
	}

	public String getEmCcParm() {
		return this.emCcParm;
	}

	public void setEmCcParm(String emCcParm) {
		this.emCcParm = emCcParm;
	}

	public Integer getEmCcSeq() {
		return this.emCcSeq;
	}

	public void setEmCcSeq(Integer emCcSeq) {
		this.emCcSeq = emCcSeq;
	}

	public String getEmSubjectParm() {
		return this.emSubjectParm;
	}

	public void setEmSubjectParm(String emSubjectParm) {
		this.emSubjectParm = emSubjectParm;
	}

	public Integer getEmSubjectSeq() {
		return this.emSubjectSeq;
	}

	public void setEmSubjectSeq(Integer emSubjectSeq) {
		this.emSubjectSeq = emSubjectSeq;
	}

	public String getEmMsgParm() {
		return this.emMsgParm;
	}

	public void setEmMsgParm(String emMsgParm) {
		this.emMsgParm = emMsgParm;
	}

	public Integer getEmMsgSeq() {
		return this.emMsgSeq;
	}

	public void setEmMsgSeq(Integer emMsgSeq) {
		this.emMsgSeq = emMsgSeq;
	}

	public String getEmAttachParm() {
		return this.emAttachParm;
	}

	public void setEmAttachParm(String emAttachParm) {
		this.emAttachParm = emAttachParm;
	}

	public Integer getEmAttachSeq() {
		return this.emAttachSeq;
	}

	public void setEmAttachSeq(Integer emAttachSeq) {
		this.emAttachSeq = emAttachSeq;
	}

	public String getEmOtherParm() {
		return this.emOtherParm;
	}

	public void setEmOtherParm(String emOtherParm) {
		this.emOtherParm = emOtherParm;
	}

	public Integer getEmOtherSeq() {
		return this.emOtherSeq;
	}

	public void setEmOtherSeq(Integer emOtherSeq) {
		this.emOtherSeq = emOtherSeq;
	}

	public Date getEmEnd() {
		return this.emEnd;
	}

	public void setEmEnd(Date emEnd) {
		this.emEnd = emEnd;
	}

	public String getEmChr01() {
		return this.emChr01;
	}

	public void setEmChr01(String emChr01) {
		this.emChr01 = emChr01;
	}

	public String getEmChr02() {
		return this.emChr02;
	}

	public void setEmChr02(String emChr02) {
		this.emChr02 = emChr02;
	}

	public String getEmChr03() {
		return this.emChr03;
	}

	public void setEmChr03(String emChr03) {
		this.emChr03 = emChr03;
	}

	public String getEmChr04() {
		return this.emChr04;
	}

	public void setEmChr04(String emChr04) {
		this.emChr04 = emChr04;
	}

	public String getEmQadc01() {
		return this.emQadc01;
	}

	public void setEmQadc01(String emQadc01) {
		this.emQadc01 = emQadc01;
	}

	public String getEmQadc02() {
		return this.emQadc02;
	}

	public void setEmQadc02(String emQadc02) {
		this.emQadc02 = emQadc02;
	}

	public String getEmQadc03() {
		return this.emQadc03;
	}

	public void setEmQadc03(String emQadc03) {
		this.emQadc03 = emQadc03;
	}

	public String getEmQadc04() {
		return this.emQadc04;
	}

	public void setEmQadc04(String emQadc04) {
		this.emQadc04 = emQadc04;
	}

	public Double getOidEmMstr() {
		return this.oidEmMstr;
	}

	public void setOidEmMstr(Double oidEmMstr) {
		this.oidEmMstr = oidEmMstr;
	}

}