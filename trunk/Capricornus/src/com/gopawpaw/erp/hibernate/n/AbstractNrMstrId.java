package com.gopawpaw.erp.hibernate.n;



/**
 * AbstractNrMstrId entity provides the base persistence definition of the NrMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractNrMstrId  implements java.io.Serializable {


    // Fields    

     private String nrDomain;
     private String nrSeqid;


    // Constructors

    /** default constructor */
    public AbstractNrMstrId() {
    }

	/** minimal constructor */
    public AbstractNrMstrId(String nrDomain) {
        this.nrDomain = nrDomain;
    }
    
    /** full constructor */
    public AbstractNrMstrId(String nrDomain, String nrSeqid) {
        this.nrDomain = nrDomain;
        this.nrSeqid = nrSeqid;
    }

   
    // Property accessors

    public String getNrDomain() {
        return this.nrDomain;
    }
    
    public void setNrDomain(String nrDomain) {
        this.nrDomain = nrDomain;
    }

    public String getNrSeqid() {
        return this.nrSeqid;
    }
    
    public void setNrSeqid(String nrSeqid) {
        this.nrSeqid = nrSeqid;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractNrMstrId) ) return false;
		 AbstractNrMstrId castOther = ( AbstractNrMstrId ) other; 
         
		 return ( (this.getNrDomain()==castOther.getNrDomain()) || ( this.getNrDomain()!=null && castOther.getNrDomain()!=null && this.getNrDomain().equals(castOther.getNrDomain()) ) )
 && ( (this.getNrSeqid()==castOther.getNrSeqid()) || ( this.getNrSeqid()!=null && castOther.getNrSeqid()!=null && this.getNrSeqid().equals(castOther.getNrSeqid()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNrDomain() == null ? 0 : this.getNrDomain().hashCode() );
         result = 37 * result + ( getNrSeqid() == null ? 0 : this.getNrSeqid().hashCode() );
         return result;
   }   





}