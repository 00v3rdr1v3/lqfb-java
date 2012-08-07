package org.lqfb.entities;
// Generated 07.08.2012 15:13:19 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * InitiativeSettingId generated by hbm2java
 */
@Embeddable
public class InitiativeSettingId  implements java.io.Serializable {


     private int memberId;
     private String key;
     private int initiativeId;

    public InitiativeSettingId() {
    }

    public InitiativeSettingId(int memberId, String key, int initiativeId) {
       this.memberId = memberId;
       this.key = key;
       this.initiativeId = initiativeId;
    }
   

    @Column(name="member_id", nullable=false)
    public int getMemberId() {
        return this.memberId;
    }
    
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Column(name="key", nullable=false)
    public String getKey() {
        return this.key;
    }
    
    public void setKey(String key) {
        this.key = key;
    }

    @Column(name="initiative_id", nullable=false)
    public int getInitiativeId() {
        return this.initiativeId;
    }
    
    public void setInitiativeId(int initiativeId) {
        this.initiativeId = initiativeId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof InitiativeSettingId) ) return false;
		 InitiativeSettingId castOther = ( InitiativeSettingId ) other; 
         
		 return (this.getMemberId()==castOther.getMemberId())
 && ( (this.getKey()==castOther.getKey()) || ( this.getKey()!=null && castOther.getKey()!=null && this.getKey().equals(castOther.getKey()) ) )
 && (this.getInitiativeId()==castOther.getInitiativeId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getMemberId();
         result = 37 * result + ( getKey() == null ? 0 : this.getKey().hashCode() );
         result = 37 * result + this.getInitiativeId();
         return result;
   }   


}


