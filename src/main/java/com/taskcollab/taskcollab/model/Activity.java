package com.taskcollab.taskcollab.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

@Document(collection = "activities")
@Data

public class Activity {

    @Id
    private String id;

    private String actionType;
    private UUID taskId;
    private UUID projectId;
    private UUID userId;
    private String userName;
    private Map<String, Object> details;
    private LocalDateTime timestamp = LocalDateTime.now();
}
