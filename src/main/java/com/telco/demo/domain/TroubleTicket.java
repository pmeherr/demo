package com.telco.demo.domain;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class TroubleTicket {
	
	List<AttachmentRefOrValue> attachment;
	ChannelRef channel;
	LocalDateTime creationDate;
	String description;
	LocalDateTime expectedResolutionDate;
	String externalId;
	String href;
	String id;
	LocalDateTime lastUpdate;
	String name;
	List<Note> note;
	String priority;
	List<RelatedEntity> relatedEntity;
	List<RelatedParty> relatedParty;
	LocalDateTime requestedResolutionDate;
	LocalDateTime resolutionDate;
	String severity;
	TroubleTicketStatusType status;
	List<StatusChange> statusChange;
	LocalDateTime statusChangeDate;
	String statusChangeReason;
	String ticketType;
	List<TroubleTicketRelationship> troubleTicketRelationship;

}
