package com.wuhulala.api.dto.req;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @since  v1.0<br>
 * @author wuhulala<br>
 * @date 2018/7/16<br>
 * @link https://github.com/wuhulala/rpc3-spring-cloud<br>
 * @description 请求头<br>
 */
public class ReqHeader implements Serializable {

    /** 用户id */
    private String userId;

    private Long reqId;

    private Date startTime;

    private final Map<String, String> attachments = new HashMap<String, String>();

    public String getAttachment(String key) {
        return attachments.get(key);
    }


    public ReqHeader setAttachment(String key, String value) {
        if (value == null) {
            attachments.remove(key);
        } else {
            attachments.put(key, value);
        }
        return this;
    }


    public ReqHeader removeAttachment(String key) {
        attachments.remove(key);
        return this;
    }

    public Map<String, String> getAttachments() {
        return attachments;
    }

    public ReqHeader setAttachments(Map<String, String> attachment) {
        this.attachments.clear();
        if (attachment != null && attachment.size() > 0) {
            this.attachments.putAll(attachment);
        }
        return this;
    }

    public void clearAttachments() {
        this.attachments.clear();
    }

}
