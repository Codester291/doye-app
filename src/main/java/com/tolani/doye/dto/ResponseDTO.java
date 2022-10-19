package com.tolani.doye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDTO {
    
    private String responseCode;
    private String responseMessage;
    private Object data;

    public ResponseDTO (String responseCode, String responseMessage) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.data = null;
    }
}
