package com.dream7788.cloud.common.response;

import java.io.Serializable;

/**
 * response
 */
public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = 4532078993076126237L;
    /**
     * 成功标识（true：成功，false：失败）
     */
    private Boolean success;

    /**
     * 编码
     */
    private String code;

    /**
     * 消息内容
     */
    private String msg;

    /**
     * 备注
     */
    private String remark;

    /**
     * 数据
     */
    private T data;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
