package priv.lyh.arena.entity;


import org.springframework.stereotype.Component;

import java.util.Map;


@Component
public class ReturnInfo<T> {

    private int code;
    private String msg;
    private T obj;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "ReturnInfo{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", obj=" + obj +
                '}';
    }
}
