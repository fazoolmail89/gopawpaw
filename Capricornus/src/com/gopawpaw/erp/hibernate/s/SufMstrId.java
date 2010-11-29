package com.gopawpaw.erp.hibernate.s;

/**
 * SufMstrId entity. @author MyEclipse Persistence Tools
 */
public class SufMstrId extends AbstractSufMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SufMstrId() {
	}

	/** full constructor */
	public SufMstrId(String sufDomain, Integer sufLevel, Integer sufFldSeq) {
		super(sufDomain, sufLevel, sufFldSeq);
	}

}
