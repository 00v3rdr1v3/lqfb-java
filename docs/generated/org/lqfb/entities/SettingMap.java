package org.lqfb.entities;
// Generated 07.08.2012 15:13:19 by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * SettingMap generated by hbm2java
 */
@Entity
@Table(name="setting_map"
    ,schema="public"
)
public class SettingMap  implements java.io.Serializable {


     private SettingMapId id;
     private Member member;
     private String value;

    public SettingMap() {
    }

    public SettingMap(SettingMapId id, Member member, String value) {
       this.id = id;
       this.member = member;
       this.value = value;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="memberId", column=@Column(name="member_id", nullable=false) ), 
        @AttributeOverride(name="key", column=@Column(name="key", nullable=false) ), 
        @AttributeOverride(name="subkey", column=@Column(name="subkey", nullable=false) ) } )
    public SettingMapId getId() {
        return this.id;
    }
    
    public void setId(SettingMapId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="member_id", nullable=false, insertable=false, updatable=false)
    public Member getMember() {
        return this.member;
    }
    
    public void setMember(Member member) {
        this.member = member;
    }
    
    @Column(name="value", nullable=false)
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }




}


