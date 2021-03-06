package org.lqfb.entities;
// Generated 07.08.2012 15:13:19 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AreaMemberCountId generated by hbm2java
 */
@Embeddable
public class AreaMemberCountId  implements java.io.Serializable {


     private Integer areaId;
     private Long directMemberCount;
     private Long memberWeight;

    public AreaMemberCountId() {
    }

    public AreaMemberCountId(Integer areaId, Long directMemberCount, Long memberWeight) {
       this.areaId = areaId;
       this.directMemberCount = directMemberCount;
       this.memberWeight = memberWeight;
    }
   

    @Column(name="area_id")
    public Integer getAreaId() {
        return this.areaId;
    }
    
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    @Column(name="direct_member_count")
    public Long getDirectMemberCount() {
        return this.directMemberCount;
    }
    
    public void setDirectMemberCount(Long directMemberCount) {
        this.directMemberCount = directMemberCount;
    }

    @Column(name="member_weight")
    public Long getMemberWeight() {
        return this.memberWeight;
    }
    
    public void setMemberWeight(Long memberWeight) {
        this.memberWeight = memberWeight;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AreaMemberCountId) ) return false;
		 AreaMemberCountId castOther = ( AreaMemberCountId ) other; 
         
		 return ( (this.getAreaId()==castOther.getAreaId()) || ( this.getAreaId()!=null && castOther.getAreaId()!=null && this.getAreaId().equals(castOther.getAreaId()) ) )
 && ( (this.getDirectMemberCount()==castOther.getDirectMemberCount()) || ( this.getDirectMemberCount()!=null && castOther.getDirectMemberCount()!=null && this.getDirectMemberCount().equals(castOther.getDirectMemberCount()) ) )
 && ( (this.getMemberWeight()==castOther.getMemberWeight()) || ( this.getMemberWeight()!=null && castOther.getMemberWeight()!=null && this.getMemberWeight().equals(castOther.getMemberWeight()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getAreaId() == null ? 0 : this.getAreaId().hashCode() );
         result = 37 * result + ( getDirectMemberCount() == null ? 0 : this.getDirectMemberCount().hashCode() );
         result = 37 * result + ( getMemberWeight() == null ? 0 : this.getMemberWeight().hashCode() );
         return result;
   }   


}


