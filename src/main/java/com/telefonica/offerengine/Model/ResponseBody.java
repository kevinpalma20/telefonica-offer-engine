package com.telefonica.offerengine.Model;

import java.time.*;
import java.util.*;
import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseBody {

    private String message;
    private HttpStatus status;
    private LocalDateTime timestamp = LocalDateTime.now(ZoneId.of("America/Lima"));

    public ResponseBody(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
    }

    public Map<String, Object> getResponse() {
        Map<String, Object> response = new HashMap<>();

        response.put("message", this.getMessage());
        response.put("timestamp", this.getTimestamp());

        return response;
    }
}
