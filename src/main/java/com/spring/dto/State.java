package com.spring.dto;

/**
 * 使用枚举表述常量数据字典
 *
 * @author Gray
 * @date 16/6/22
 */
public enum State {
    SUCCESS(0, "请求成功"),
    REQUEST_WRONG(1, "参数错误"),
    RE_SEND(2, "重复发送"),
    REQUEST_ABNORMAL(3, "请求异常"),
    ERROR(44, "Server Error");

    private int state;

    private String stateInfo;

    State(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static State stateOf(int index) {
        for (State state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }
}
