package org.lqfb.entities;
// Generated 07.08.2012 15:13:19 by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * UnitMemberCount generated by hbm2java
 */
@Entity
@Table(name="unit_member_count"
    ,schema="public"
)
public class UnitMemberCount  implements java.io.Serializable {


     private UnitMemberCountId id;

    public UnitMemberCount() {
    }

    public UnitMemberCount(UnitMemberCountId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="unitId", column=@Column(name="unit_id") ), 
        @AttributeOverride(name="memberCount", column=@Column(name="member_count") ) } )
    public UnitMemberCountId getId() {
        return this.id;
    }
    
    public void setId(UnitMemberCountId id) {
        this.id = id;
    }




}

