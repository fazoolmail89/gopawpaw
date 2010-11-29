package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrx3WkflId entity provides the base persistence definition of the
 * Grx3WkflId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrx3WkflId implements java.io.Serializable {

	// Fields

	private Integer grx3RunId;
	private Integer grx3Row;
	private Integer grx3Col;
	private Integer grx3Line;
	private Integer grx3Priority;
	private Integer grx3Explode;
	private String grx3Element1;
	private String grx3Element2;
	private String grx3Element3;
	private String grx3Element4;
	private String grx3Element5;
	private String grx3User1;
	private String grx3User2;
	private String grx3Qadc01;
	private String grx3Domain;
	private Double oidGrx3Wkfl;

	// Constructors

	/** default constructor */
	public AbstractGrx3WkflId() {
	}

	/** minimal constructor */
	public AbstractGrx3WkflId(String grx3Domain, Double oidGrx3Wkfl) {
		this.grx3Domain = grx3Domain;
		this.oidGrx3Wkfl = oidGrx3Wkfl;
	}

	/** full constructor */
	public AbstractGrx3WkflId(Integer grx3RunId, Integer grx3Row,
			Integer grx3Col, Integer grx3Line, Integer grx3Priority,
			Integer grx3Explode, String grx3Element1, String grx3Element2,
			String grx3Element3, String grx3Element4, String grx3Element5,
			String grx3User1, String grx3User2, String grx3Qadc01,
			String grx3Domain, Double oidGrx3Wkfl) {
		this.grx3RunId = grx3RunId;
		this.grx3Row = grx3Row;
		this.grx3Col = grx3Col;
		this.grx3Line = grx3Line;
		this.grx3Priority = grx3Priority;
		this.grx3Explode = grx3Explode;
		this.grx3Element1 = grx3Element1;
		this.grx3Element2 = grx3Element2;
		this.grx3Element3 = grx3Element3;
		this.grx3Element4 = grx3Element4;
		this.grx3Element5 = grx3Element5;
		this.grx3User1 = grx3User1;
		this.grx3User2 = grx3User2;
		this.grx3Qadc01 = grx3Qadc01;
		this.grx3Domain = grx3Domain;
		this.oidGrx3Wkfl = oidGrx3Wkfl;
	}

	// Property accessors

	public Integer getGrx3RunId() {
		return this.grx3RunId;
	}

	public void setGrx3RunId(Integer grx3RunId) {
		this.grx3RunId = grx3RunId;
	}

	public Integer getGrx3Row() {
		return this.grx3Row;
	}

	public void setGrx3Row(Integer grx3Row) {
		this.grx3Row = grx3Row;
	}

	public Integer getGrx3Col() {
		return this.grx3Col;
	}

	public void setGrx3Col(Integer grx3Col) {
		this.grx3Col = grx3Col;
	}

	public Integer getGrx3Line() {
		return this.grx3Line;
	}

	public void setGrx3Line(Integer grx3Line) {
		this.grx3Line = grx3Line;
	}

	public Integer getGrx3Priority() {
		return this.grx3Priority;
	}

	public void setGrx3Priority(Integer grx3Priority) {
		this.grx3Priority = grx3Priority;
	}

	public Integer getGrx3Explode() {
		return this.grx3Explode;
	}

	public void setGrx3Explode(Integer grx3Explode) {
		this.grx3Explode = grx3Explode;
	}

	public String getGrx3Element1() {
		return this.grx3Element1;
	}

	public void setGrx3Element1(String grx3Element1) {
		this.grx3Element1 = grx3Element1;
	}

	public String getGrx3Element2() {
		return this.grx3Element2;
	}

	public void setGrx3Element2(String grx3Element2) {
		this.grx3Element2 = grx3Element2;
	}

	public String getGrx3Element3() {
		return this.grx3Element3;
	}

	public void setGrx3Element3(String grx3Element3) {
		this.grx3Element3 = grx3Element3;
	}

	public String getGrx3Element4() {
		return this.grx3Element4;
	}

	public void setGrx3Element4(String grx3Element4) {
		this.grx3Element4 = grx3Element4;
	}

	public String getGrx3Element5() {
		return this.grx3Element5;
	}

	public void setGrx3Element5(String grx3Element5) {
		this.grx3Element5 = grx3Element5;
	}

	public String getGrx3User1() {
		return this.grx3User1;
	}

	public void setGrx3User1(String grx3User1) {
		this.grx3User1 = grx3User1;
	}

	public String getGrx3User2() {
		return this.grx3User2;
	}

	public void setGrx3User2(String grx3User2) {
		this.grx3User2 = grx3User2;
	}

	public String getGrx3Qadc01() {
		return this.grx3Qadc01;
	}

	public void setGrx3Qadc01(String grx3Qadc01) {
		this.grx3Qadc01 = grx3Qadc01;
	}

	public String getGrx3Domain() {
		return this.grx3Domain;
	}

	public void setGrx3Domain(String grx3Domain) {
		this.grx3Domain = grx3Domain;
	}

	public Double getOidGrx3Wkfl() {
		return this.oidGrx3Wkfl;
	}

	public void setOidGrx3Wkfl(Double oidGrx3Wkfl) {
		this.oidGrx3Wkfl = oidGrx3Wkfl;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGrx3WkflId))
			return false;
		AbstractGrx3WkflId castOther = (AbstractGrx3WkflId) other;

		return ((this.getGrx3RunId() == castOther.getGrx3RunId()) || (this
				.getGrx3RunId() != null
				&& castOther.getGrx3RunId() != null && this.getGrx3RunId()
				.equals(castOther.getGrx3RunId())))
				&& ((this.getGrx3Row() == castOther.getGrx3Row()) || (this
						.getGrx3Row() != null
						&& castOther.getGrx3Row() != null && this.getGrx3Row()
						.equals(castOther.getGrx3Row())))
				&& ((this.getGrx3Col() == castOther.getGrx3Col()) || (this
						.getGrx3Col() != null
						&& castOther.getGrx3Col() != null && this.getGrx3Col()
						.equals(castOther.getGrx3Col())))
				&& ((this.getGrx3Line() == castOther.getGrx3Line()) || (this
						.getGrx3Line() != null
						&& castOther.getGrx3Line() != null && this
						.getGrx3Line().equals(castOther.getGrx3Line())))
				&& ((this.getGrx3Priority() == castOther.getGrx3Priority()) || (this
						.getGrx3Priority() != null
						&& castOther.getGrx3Priority() != null && this
						.getGrx3Priority().equals(castOther.getGrx3Priority())))
				&& ((this.getGrx3Explode() == castOther.getGrx3Explode()) || (this
						.getGrx3Explode() != null
						&& castOther.getGrx3Explode() != null && this
						.getGrx3Explode().equals(castOther.getGrx3Explode())))
				&& ((this.getGrx3Element1() == castOther.getGrx3Element1()) || (this
						.getGrx3Element1() != null
						&& castOther.getGrx3Element1() != null && this
						.getGrx3Element1().equals(castOther.getGrx3Element1())))
				&& ((this.getGrx3Element2() == castOther.getGrx3Element2()) || (this
						.getGrx3Element2() != null
						&& castOther.getGrx3Element2() != null && this
						.getGrx3Element2().equals(castOther.getGrx3Element2())))
				&& ((this.getGrx3Element3() == castOther.getGrx3Element3()) || (this
						.getGrx3Element3() != null
						&& castOther.getGrx3Element3() != null && this
						.getGrx3Element3().equals(castOther.getGrx3Element3())))
				&& ((this.getGrx3Element4() == castOther.getGrx3Element4()) || (this
						.getGrx3Element4() != null
						&& castOther.getGrx3Element4() != null && this
						.getGrx3Element4().equals(castOther.getGrx3Element4())))
				&& ((this.getGrx3Element5() == castOther.getGrx3Element5()) || (this
						.getGrx3Element5() != null
						&& castOther.getGrx3Element5() != null && this
						.getGrx3Element5().equals(castOther.getGrx3Element5())))
				&& ((this.getGrx3User1() == castOther.getGrx3User1()) || (this
						.getGrx3User1() != null
						&& castOther.getGrx3User1() != null && this
						.getGrx3User1().equals(castOther.getGrx3User1())))
				&& ((this.getGrx3User2() == castOther.getGrx3User2()) || (this
						.getGrx3User2() != null
						&& castOther.getGrx3User2() != null && this
						.getGrx3User2().equals(castOther.getGrx3User2())))
				&& ((this.getGrx3Qadc01() == castOther.getGrx3Qadc01()) || (this
						.getGrx3Qadc01() != null
						&& castOther.getGrx3Qadc01() != null && this
						.getGrx3Qadc01().equals(castOther.getGrx3Qadc01())))
				&& ((this.getGrx3Domain() == castOther.getGrx3Domain()) || (this
						.getGrx3Domain() != null
						&& castOther.getGrx3Domain() != null && this
						.getGrx3Domain().equals(castOther.getGrx3Domain())))
				&& ((this.getOidGrx3Wkfl() == castOther.getOidGrx3Wkfl()) || (this
						.getOidGrx3Wkfl() != null
						&& castOther.getOidGrx3Wkfl() != null && this
						.getOidGrx3Wkfl().equals(castOther.getOidGrx3Wkfl())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getGrx3RunId() == null ? 0 : this.getGrx3RunId().hashCode());
		result = 37 * result
				+ (getGrx3Row() == null ? 0 : this.getGrx3Row().hashCode());
		result = 37 * result
				+ (getGrx3Col() == null ? 0 : this.getGrx3Col().hashCode());
		result = 37 * result
				+ (getGrx3Line() == null ? 0 : this.getGrx3Line().hashCode());
		result = 37
				* result
				+ (getGrx3Priority() == null ? 0 : this.getGrx3Priority()
						.hashCode());
		result = 37
				* result
				+ (getGrx3Explode() == null ? 0 : this.getGrx3Explode()
						.hashCode());
		result = 37
				* result
				+ (getGrx3Element1() == null ? 0 : this.getGrx3Element1()
						.hashCode());
		result = 37
				* result
				+ (getGrx3Element2() == null ? 0 : this.getGrx3Element2()
						.hashCode());
		result = 37
				* result
				+ (getGrx3Element3() == null ? 0 : this.getGrx3Element3()
						.hashCode());
		result = 37
				* result
				+ (getGrx3Element4() == null ? 0 : this.getGrx3Element4()
						.hashCode());
		result = 37
				* result
				+ (getGrx3Element5() == null ? 0 : this.getGrx3Element5()
						.hashCode());
		result = 37 * result
				+ (getGrx3User1() == null ? 0 : this.getGrx3User1().hashCode());
		result = 37 * result
				+ (getGrx3User2() == null ? 0 : this.getGrx3User2().hashCode());
		result = 37
				* result
				+ (getGrx3Qadc01() == null ? 0 : this.getGrx3Qadc01()
						.hashCode());
		result = 37
				* result
				+ (getGrx3Domain() == null ? 0 : this.getGrx3Domain()
						.hashCode());
		result = 37
				* result
				+ (getOidGrx3Wkfl() == null ? 0 : this.getOidGrx3Wkfl()
						.hashCode());
		return result;
	}

}