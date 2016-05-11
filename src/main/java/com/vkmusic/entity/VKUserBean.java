package com.vkmusic.entity;

import com.google.common.base.Objects;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

/**
 * Created by Vadym_Vlasenko on 9/17/2015.
 */
@Document
public class VKUserBean {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private int sex;
    private String nickName;
    private String screenName;
    private DateTime birthDay;
    private int city;
    private int country;
    private int timezone;
    private String photoUrl;
    @Transient
    private ResponseVK responseVK;
    private Set<Role> roles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public DateTime getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(DateTime birthDay) {
        this.birthDay = birthDay;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public ResponseVK getResponseVK() {
        return responseVK;
    }

    public void setResponseVK(ResponseVK responseVK) {
        this.responseVK = responseVK;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VKUserBean that = (VKUserBean) o;
        return Objects.equal(id, that.id) &&
                Objects.equal(firstName, that.firstName) &&
                Objects.equal(lastName, that.lastName) &&
                Objects.equal(nickName, that.nickName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, firstName, lastName, nickName);
    }

    @Override
    public String toString() {
        return "VKUserBean{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                ", nickName='" + nickName + '\'' +
                ", screenName='" + screenName + '\'' +
                ", birthDay=" + birthDay +
                ", city=" + city +
                ", country=" + country +
                ", timezone=" + timezone +
                ", photoUrl='" + photoUrl + '\'' +
                '}';
    }

}
