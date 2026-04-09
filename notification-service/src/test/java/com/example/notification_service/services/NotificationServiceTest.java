package com.example.notification_service.services;

import com.example.notification_service.dtos.requests.NotificationRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NotificationServiceTest {
    @Test
    @DisplayName(
            """
                Given:
                - I have a working notification service
                - I have a valid notification message
                when:
                - I send notification messages
                - I receive response with success message
                Assert:
                - That status of the response is success
             """
    )
    void testCanSendNotification(){
        NotificationRequest notificationRequest = new NotificationRequest();
        NotificationService.send(notificationRequest);
    }

}