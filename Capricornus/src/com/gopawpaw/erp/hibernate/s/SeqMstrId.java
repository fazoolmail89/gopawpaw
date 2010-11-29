package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SeqMstrId entity. @author MyEclipse Persistence Tools
 */
public class SeqMstrId extends AbstractSeqMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SeqMstrId() {
	}

	/** minimal constructor */
	public SeqMstrId(String seqDomain) {
		super(seqDomain);
	}

	/** full constructor */
	public SeqMstrId(String seqDomain, String seqSite, String seqLine,
			String seqPart, Date seqDueDate) {
		super(seqDomain, seqSite, seqLine, seqPart, seqDueDate);
	}

}
