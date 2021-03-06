package org.lqfb.entities;
// Generated 07.08.2012 15:13:19 by Hibernate Tools 3.2.2.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MemberCountId generated by hbm2java
 */
@Embeddable
public class MemberCountId  implements java.io.Serializable {


     private Date calculated;
     private int totalCount;

    public MemberCountId() {
    }

    public MemberCountId(Date calculated, int totalCount) {
       this.calculated = calculated;
       this.totalCount = totalCount;
    }
   

    @Column(name="calculated", nullable=false, length=35)
    public Date getCalculated() {
        return this.calculated;
    }
    
    public void setCalculated(Date calculated) {
        this.calculated = calculated;
    }

    @Column(name="total_count", nullable=false)
    public int getTotalCount() {
        return this.totalCount;
    }
    
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MemberCountId) ) return false;
		 MemberCountId castOther = ( MemberCountId ) other; 
         
		 return ( (this.getCalculated()==castOther.getCalculated()) || ( this.getCalculated()!=null && castOther.getCalculated()!=null && this.getCalculated().equals(castOther.getCalculated()) ) )
 && (this.getTotalCount()==castOther.getTotalCount());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCalculated() == null ? 0 : this.getCalculated().hashCode() );
         result = 37 * result + this.getTotalCount();
         return result;
   }   


}


