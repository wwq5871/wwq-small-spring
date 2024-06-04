package cn.bugstack.springframework.beans.factory;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/04/18:39
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
