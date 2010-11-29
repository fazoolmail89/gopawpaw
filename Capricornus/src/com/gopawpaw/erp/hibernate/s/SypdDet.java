package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SypdDet entity. @author MyEclipse Persistence Tools
 */
public class SypdDet extends AbstractSypdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SypdDet() {
	}

	/** minimal constructor */
	public SypdDet(SypdDetId id, Double oidSypdDet) {
		super(id, oidSypdDet);
	}

	/** full constructor */
	public SypdDet(SypdDetId id, Integer sypdSeq, Boolean sypdReqdAdd,
			Boolean sypdReqdChgdel, String sypdModUserid, Date sypdModDate,
			String sypdUser1, String sypdUser2, String sypdChr01,
			String sypdChr02, Double sypdDec01, Double sypdDec02,
			Integer sypdInt01, Integer sypdInt02, Boolean sypdLog01,
			Boolean sypdLog02, Date sypdDte01, Date sypdDte02,
			String sypdQadc01, String sypdQadc02, String sypdQadc03,
			String sypdQadc04, Double sypdQadd01, Double sypdQadd02,
			Integer sypdQadi01, Integer sypdQadi02, Boolean sypdQadl01,
			Boolean sypdQadl02, Date sypdQadt01, Date sypdQadt02,
			Boolean sypdPrereqAdd, Double oidSypdDet) {
		super(id, sypdSeq, sypdReqdAdd, sypdReqdChgdel, sypdModUserid,
				sypdModDate, sypdUser1, sypdUser2, sypdChr01, sypdChr02,
				sypdDec01, sypdDec02, sypdInt01, sypdInt02, sypdLog01,
				sypdLog02, sypdDte01, sypdDte02, sypdQadc01, sypdQadc02,
				sypdQadc03, sypdQadc04, sypdQadd01, sypdQadd02, sypdQadi01,
				sypdQadi02, sypdQadl01, sypdQadl02, sypdQadt01, sypdQadt02,
				sypdPrereqAdd, oidSypdDet);
	}

}
