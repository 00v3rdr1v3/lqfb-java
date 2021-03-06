package org.lqfb.entities;
// Generated 07.08.2012 15:13:19 by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * SelectedEventSeenByMember generated by hbm2java
 */
@Entity
@Table(name="selected_event_seen_by_member"
    ,schema="public"
)
public class SelectedEventSeenByMember  implements java.io.Serializable {


     private SelectedEventSeenByMemberId id;

    public SelectedEventSeenByMember() {
    }

    public SelectedEventSeenByMember(SelectedEventSeenByMemberId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="seenByMemberId", column=@Column(name="seen_by_member_id") ), 
        @AttributeOverride(name="notifyLevel", column=@Column(name="notify_level") ), 
        @AttributeOverride(name="id", column=@Column(name="id") ), 
        @AttributeOverride(name="occurrence", column=@Column(name="occurrence", length=35) ), 
        @AttributeOverride(name="event", column=@Column(name="event") ), 
        @AttributeOverride(name="memberId", column=@Column(name="member_id") ), 
        @AttributeOverride(name="issueId", column=@Column(name="issue_id") ), 
        @AttributeOverride(name="state", column=@Column(name="state") ), 
        @AttributeOverride(name="initiativeId", column=@Column(name="initiative_id") ), 
        @AttributeOverride(name="draftId", column=@Column(name="draft_id") ), 
        @AttributeOverride(name="suggestionId", column=@Column(name="suggestion_id") ) } )
    public SelectedEventSeenByMemberId getId() {
        return this.id;
    }
    
    public void setId(SelectedEventSeenByMemberId id) {
        this.id = id;
    }




}


