package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCodeMstr entity provides the base persistence definition of the
 * CodeMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCodeMstr implements java.io.Serializable {

	// Fields

	private CodeMstrId id;
	private String codeCmmt;
	private String codeUser1;
	private String codeUser2;
	private String codeDesc;
	private String codeQadc01;
	private Double oidCodeMstr;

	// Constructors

	/** default constructor */
	public AbstractCodeMstr() {
	}

	/** minimal constructor */
	public AbstractCodeMstr(CodeMstrId id, Double oidCodeMstr) {
		this.id = id;
		this.oidCodeMstr = oidCodeMstr;
	}

	/** full constructor */
	public AbstractCodeMstr(CodeMstrId id, String codeCmmt, String codeUser1,
			String codeUser2, String codeDesc, String codeQadc01,
			Double oidCodeMstr) {
		this.id = id;
		this.codeCmmt = codeCmmt;
		this.codeUser1 = codeUser1;
		this.codeUser2 = codeUser2;
		this.codeDesc = codeDesc;
		this.codeQadc01 = codeQadc01;
		this.oidCodeMstr = oidCodeMstr;
	}

	// Property accessors

	public CodeMstrId getId() {
		return this.id;
	}

	public void setId(CodeMstrId id) {
		this.id = id;
	}

	public String getCodeCmmt() {
		return this.codeCmmt;
	}

	public void setCodeCmmt(String codeCmmt) {
		this.codeCmmt = codeCmmt;
	}

	public String getCodeUser1() {
		return this.codeUser1;
	}

	public void setCodeUser1(String codeUser1) {
		this.codeUser1 = codeUser1;
	}

	public String getCodeUser2() {
		return this.codeUser2;
	}

	public void setCodeUser2(String codeUser2) {
		this.codeUser2 = codeUser2;
	}

	public String getCodeDesc() {
		return this.codeDesc;
	}

	public void setCodeDesc(String codeDesc) {
		this.codeDesc = codeDesc;
	}

	public String getCodeQadc01() {
		return this.codeQadc01;
	}

	public void setCodeQadc01(String codeQadc01) {
		this.codeQadc01 = codeQadc01;
	}

	public Double getOidCodeMstr() {
		return this.oidCodeMstr;
	}

	public void setOidCodeMstr(Double oidCodeMstr) {
		this.oidCodeMstr = oidCodeMstr;
	}

}