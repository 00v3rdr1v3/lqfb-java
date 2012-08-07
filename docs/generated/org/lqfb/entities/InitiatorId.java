package org.lqfb.entities;
// Generated 07.08.2012 15:13:19 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * InitiatorId generated by hbm2java
 */
@Embeddable
public class InitiatorId  implements java.io.Serializable {


     private int initiativeId;
     private int memberId;

    public InitiatorId() {
    }

    public InitiatorId(int initiativeId, int memberId) {
       this.initiativeId = initiativeId;
       this.memberId = memberId;
    }
   

    @Column(name="initiative_id", nullable=false)
    public int getInitiativeId() {
        return this.initiativeId;
    }
    
    public void setInitiativeId(int initiativeId) {
        this.initiativeId = initiativeId;
    }

    @Column(name="member_id", nullable=false)
    public int getMemberId() {
        return this.memberId;
    }
    
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof InitiatorId) ) return false;
		 InitiatorId castOther = ( InitiatorId ) other; 
         
		 return (this.getInitiativeId()==castOther.getInitiativeId())
 && (this.getMemberId()==castOther.getMemberId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getInitiativeId();
         result = 37 * result + this.getMemberId();
         return result;
   }   


}

