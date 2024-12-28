package com.projeto_java.curso_spring.entities.enums;

import org.springframework.boot.autoconfigure.web.ServerProperties;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED9(5);

    private static final String ALERT = "ILEGAL ORDER STATUS ";
    private int code;

    private OrderStatus (int code) {
        this.code = code;
    }

    public int getCode () {
        return code ;
    }

    public static OrderStatus valueOf (int code) {
        if (code > 0 && code <= 5) {
            for (OrderStatus value : OrderStatus.values()) {
                if (value.getCode() == code) {
                    return value;
                }
            }
        }
        throw new IllegalArgumentException(ALERT);
    }
}
