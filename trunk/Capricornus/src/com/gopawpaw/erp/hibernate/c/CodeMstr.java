package com.gopawpaw.erp.hibernate.c;

/**
 * CodeMstr entity. @author MyEclipse Persistence Tools
 */
public class CodeMstr extends AbstractCodeMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CodeMstr() {
	}

	/** minimal constructor */
	public CodeMstr(CodeMstrId id, Double oidCodeMstr) {
		super(id, oidCodeMstr);
	}

	/** full constructor */
	public CodeMstr(CodeMstrId id, String codeCmmt, String codeUser1,
			String codeUser2, String codeDesc, String codeQadc01,
			Double oidCodeMstr) {
		super(id, codeCmmt, codeUser1, codeUser2, codeDesc, codeQadc01,
				oidCodeMstr);
	}

}
