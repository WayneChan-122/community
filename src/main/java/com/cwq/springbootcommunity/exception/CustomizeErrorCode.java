package com.cwq.springbootcommunity.exception;

/**
 * @author cwq
 * @date 2019/11/7 - 9:53
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001,"问题不存在"),
    TARGET_PARAM_NOT_FOUND(2002,"未选中任何问题或评论进行回复"),
    NO_LOGIN(2003,"当前操作需要登录，请登录后重试"),
    SYS_ERROR(2004,"服务器异常"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或不存在"),
    COMMENT_NOT_FOUND(2006,"回复的评论不存在"),
    CONTENT_IS_EMPTY(2007,"回复的评论不能为空"),
    READ_NOTIFICATION_FAIL(2008,"读取别人信息"),
    NOTIFICATION_NOT_FOUND(2009,"消息不见了"),
    ;

    private Integer code;
    private String message;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }
}
