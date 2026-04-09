package com.example.notification_service.dtos.requests;

import com.example.notification_service.data.models.Type;

public class NotificationRequest {
    private String userId;
    private String recipient;
    private String subject;
    private String body;
    private Type type;
    private String channel;
}
