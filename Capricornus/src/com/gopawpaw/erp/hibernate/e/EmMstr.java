package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EmMstr entity. @author MyEclipse Persistence Tools
 */
public class EmMstr extends AbstractEmMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EmMstr() {
	}

	/** minimal constructor */
	public EmMstr(EmMstrId id, Double oidEmMstr) {
		super(id, oidEmMstr);
	}

	/** full constructor */
	public EmMstr(EmMstrId id, String emDesc, String emProgram,
			String emSenderParm, Integer emSenderSeq, String emPswdParm,
			Integer emPswdSeq, String emRecipParm, Integer emRecipSeq,
			String emCcParm, Integer emCcSeq, String emSubjectParm,
			Integer emSubjectSeq, String emMsgParm, Integer emMsgSeq,
			String emAttachParm, Integer emAttachSeq, String emOtherParm,
			Integer emOtherSeq, Date emEnd, String emChr01, String emChr02,
			String emChr03, String emChr04, String emQadc01, String emQadc02,
			String emQadc03, String emQadc04, Double oidEmMstr) {
		super(id, emDesc, emProgram, emSenderParm, emSenderSeq, emPswdParm,
				emPswdSeq, emRecipParm, emRecipSeq, emCcParm, emCcSeq,
				emSubjectParm, emSubjectSeq, emMsgParm, emMsgSeq, emAttachParm,
				emAttachSeq, emOtherParm, emOtherSeq, emEnd, emChr01, emChr02,
				emChr03, emChr04, emQadc01, emQadc02, emQadc03, emQadc04,
				oidEmMstr);
	}

}
