package com.mycompany.capp.domain;

/**
 *
 * @author aman
 */
public class Contact {
    private Integer contactid,userid;   //PK,FK
    private String name,phone,email,address,remark;

    public Contact() {
    }

    
    public Integer getContactid() {
        return contactid;
    }

    public void setContactid(Integer contactid) {
        this.contactid = contactid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
}
