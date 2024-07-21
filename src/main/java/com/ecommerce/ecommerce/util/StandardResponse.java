package com.ecommerce.ecommerce.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * StandardResponse
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StandardResponse {

    private int status;
    private Object data;
    private String message;
    private boolean success;
}