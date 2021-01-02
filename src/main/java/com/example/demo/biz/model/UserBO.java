package com.example.demo.biz.model;

/**
 * @author yuehfeng
 * @version : UserBO.java, v 0.1 2021年01月02日 12:36 下午 yuehfeng Exp $
 */
public class UserBO {

    private Integer id;

    private Boolean flag;

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id value to be assigned to property id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>flag</tt>.
     *
     * @return property value of flag
     */
    public Boolean getFlag() {
        return flag;
    }

    /**
     * Setter method for property <tt>flag</tt>.
     *
     * @param flag value to be assigned to property flag
     */
    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
}