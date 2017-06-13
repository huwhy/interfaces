package cn.huwhy.interfaces;

import java.io.Serializable;

public class Json<T> implements Serializable {

    public static <T> Json<T> SUCCESS() {
        return new Json<>(200L);
    }

    public static <T> Json<T> ERROR() {
        return new Json<>(500L);
    }

    /**
     * 编码
     */
    private Long   code;
    /**
     * 消息
     */
    private String message;
    /**
     * 数据
     */
    private T      data;

    public Json() {
    }

    public Json(Long code) {
        this.code = code;
    }

    public Json(Long code, String message) {
        this.code = code;
        this.message = message;
    }

    public Long getCode() {
        return code;
    }

    public Json setCode(Long code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Json setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public Json setData(T data) {
        this.data = data;
        return this;
    }

    public boolean isOk() {
        return 200L == this.code;
    }

}
