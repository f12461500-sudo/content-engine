package com.ygy.contentengine.core.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer code;
    private String message;
    private T data;

    public Result() {
    }

    public Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> Result<T> success() {
        return new Result<T>(200, "Success", null);
    }

    public static <T> Result<T> success(T data) {
        return new Result<T>(200, "Success", data);
    }

    public static <T> Result<T> success(String message, T data) {
        return new Result<T>(200, message, data);
    }

    public static <T> Result<T> error(String message) {
        return new Result<T>(500, message, null);
    }

    public static <T> Result<T> error(Integer code, String message) {
        return new Result<T>(code, message, null);
    }
    public static <T> Result<T> unauthorized(String message) {
        return new Result<T>(401, message, null);
    }
}
