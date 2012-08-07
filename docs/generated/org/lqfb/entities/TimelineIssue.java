package org.lqfb.entities;
// Generated 07.08.2012 15:13:19 by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TimelineIssue generated by hbm2java
 */
@Entity
@Table(name="timeline_issue"
    ,schema="public"
)
public class TimelineIssue  implements java.io.Serializable {


     private TimelineIssueId id;

    public TimelineIssue() {
    }

    public TimelineIssue(TimelineIssueId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="occurrence", column=@Column(name="occurrence", length=35) ), 
        @AttributeOverride(name="event", column=@Column(name="event") ), 
        @AttributeOverride(name="issueId", column=@Column(name="issue_id") ) } )
    public TimelineIssueId getId() {
        return this.id;
    }
    
    public void setId(TimelineIssueId id) {
        this.id = id;
    }




}


