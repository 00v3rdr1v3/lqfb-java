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
 * SuggestionSetting generated by hbm2java
 */
@Entity
@Table(name="suggestion_setting"
    ,schema="public"
)
public class SuggestionSetting  implements java.io.Serializable {


     private SuggestionSettingId id;
     private Member member;
     private String value;

    public SuggestionSetting() {
    }

    public SuggestionSetting(SuggestionSettingId id, Member member, String value) {
       this.id = id;
       this.member = member;
       this.value = value;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="memberId", column=@Column(name="member_id", nullable=false) ), 
        @AttributeOverride(name="key", column=@Column(name="key", nullable=false) ), 
        @AttributeOverride(name="suggestionId", column=@Column(name="suggestion_id", nullable=false) ) } )
    public SuggestionSettingId getId() {
        return this.id;
    }
    
    public void setId(SuggestionSettingId id) {
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


