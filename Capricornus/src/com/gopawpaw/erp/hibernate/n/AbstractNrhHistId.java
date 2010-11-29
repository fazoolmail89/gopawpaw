package com.gopawpaw.erp.hibernate.n;



/**
 * AbstractNrhHistId entity provides the base persistence definition of the NrhHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractNrhHistId  implements java.io.Serializable {


    // Fields    

     private String nrhDomain;
     private String nrhSeqid;
     private String nrhNumber;
     private String nrhAction;
     private Integer nrhLine;


    // Constructors

    /** default constructor */
    public AbstractNrhHistId() {
    }

	/** minimal constructor */
    public AbstractNrhHistId(String nrhDomain) {
        this.nrhDomain = nrhDomain;
    }
    
    /** full constructor */
    public AbstractNrhHistId(String nrhDomain, String nrhSeqid, String nrhNumber, String nrhAction, Integer nrhLine) {
        this.nrhDomain = nrhDomain;
        this.nrhSeqid = nrhSeqid;
        this.nrhNumber = nrhNumber;
        this.nrhAction = nrhAction;
        this.nrhLine = nrhLine;
    }

   
    // Property accessors

    public String getNrhDomain() {
        return this.nrhDomain;
    }
    
    public void setNrhDomain(String nrhDomain) {
        this.nrhDomain = nrhDomain;
    }

    public String getNrhSeqid() {
        return this.nrhSeqid;
    }
    
    public void setNrhSeqid(String nrhSeqid) {
        this.nrhSeqid = nrhSeqid;
    }

    public String getNrhNumber() {
        return this.nrhNumber;
    }
    
    public void setNrhNumber(String nrhNumber) {
        this.nrhNumber = nrhNumber;
    }

    public String getNrhAction() {
        return this.nrhAction;
    }
    
    public void setNrhAction(String nrhAction) {
        this.nrhAction = nrhAction;
    }

    public Integer getNrhLine() {
        return this.nrhLine;
    }
    
    public void setNrhLine(Integer nrhLine) {
        this.nrhLine = nrhLine;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractNrhHistId) ) return false;
		 AbstractNrhHistId castOther = ( AbstractNrhHistId ) other; 
         
		 return ( (this.getNrhDomain()==castOther.getNrhDomain()) || ( this.getNrhDomain()!=null && castOther.getNrhDomain()!=null && this.getNrhDomain().equals(castOther.getNrhDomain()) ) )
 && ( (this.getNrhSeqid()==castOther.getNrhSeqid()) || ( this.getNrhSeqid()!=null && castOther.getNrhSeqid()!=null && this.getNrhSeqid().equals(castOther.getNrhSeqid()) ) )
 && ( (this.getNrhNumber()==castOther.getNrhNumber()) || ( this.getNrhNumber()!=null && castOther.getNrhNumber()!=null && this.getNrhNumber().equals(castOther.getNrhNumber()) ) )
 && ( (this.getNrhAction()==castOther.getNrhAction()) || ( this.getNrhAction()!=null && castOther.getNrhAction()!=null && this.getNrhAction().equals(castOther.getNrhAction()) ) )
 && ( (this.getNrhLine()==castOther.getNrhLine()) || ( this.getNrhLine()!=null && castOther.getNrhLine()!=null && this.getNrhLine().equals(castOther.getNrhLine()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNrhDomain() == null ? 0 : this.getNrhDomain().hashCode() );
         result = 37 * result + ( getNrhSeqid() == null ? 0 : this.getNrhSeqid().hashCode() );
         result = 37 * result + ( getNrhNumber() == null ? 0 : this.getNrhNumber().hashCode() );
         result = 37 * result + ( getNrhAction() == null ? 0 : this.getNrhAction().hashCode() );
         result = 37 * result + ( getNrhLine() == null ? 0 : this.getNrhLine().hashCode() );
         return result;
   }   





}