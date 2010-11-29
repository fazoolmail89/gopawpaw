package com.gopawpaw.erp.hibernate.t;

/**
 * TagMstrId entity. @author MyEclipse Persistence Tools
 */
public class TagMstrId extends AbstractTagMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TagMstrId() {
	}

	/** minimal constructor */
	public TagMstrId(String tagDomain) {
		super(tagDomain);
	}

	/** full constructor */
	public TagMstrId(String tagDomain, Integer tagNbr) {
		super(tagDomain, tagNbr);
	}

}
