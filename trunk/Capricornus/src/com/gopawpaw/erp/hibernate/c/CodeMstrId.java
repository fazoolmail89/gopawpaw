package com.gopawpaw.erp.hibernate.c;

/**
 * CodeMstrId entity. @author MyEclipse Persistence Tools
 */
public class CodeMstrId extends AbstractCodeMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CodeMstrId() {
	}

	/** minimal constructor */
	public CodeMstrId(String codeDomain) {
		super(codeDomain);
	}

	/** full constructor */
	public CodeMstrId(String codeDomain, String codeFldname, String codeValue) {
		super(codeDomain, codeFldname, codeValue);
	}

}
