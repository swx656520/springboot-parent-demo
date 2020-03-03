package com.albert.gmall.bean;

import java.io.Serializable;

/**
 * @author Song n
 * @create 2020-03-03 10:22
 */
public class UserAddress implements Serializable {
    private static final long serialVersionUID = -1L;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private Integer id;

        private String address;

        private String userId;

        private String consignee;

        private String phoneNum;

        private String isDefault;

        public UserAddress() {
            super();
        }

        public UserAddress(Integer id, String address, String userId, String consignee, String phoneNum, String isDefault) {
            this.id = id;
            this.address = address;
            this.userId = userId;
            this.consignee = consignee;
            this.phoneNum = phoneNum;
            this.isDefault = isDefault;
        }



        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getConsignee() {
            return consignee;
        }

        public void setConsignee(String consignee) {
            this.consignee = consignee;
        }

        public String getPhoneNum() {
            return phoneNum;
        }

        public void setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
        }

        public String getIsDefault() {
            return isDefault;
        }

        public void setIsDefault(String isDefault) {
            this.isDefault = isDefault;
        }

}
