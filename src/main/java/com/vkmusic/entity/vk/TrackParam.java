package com.vkmusic.entity.vk;

import java.io.Serializable;

/**
 * Created by Vadym_Vlasenko on 5/9/2016.
 */
public class TrackParam implements Serializable {

    private int count;
    private int offset;
    private int needUser;

    public TrackParam(int count, int offset, int needUser) {
        this.count = count;
        this.offset = offset;
        this.needUser = needUser;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getNeedUser() {
        return needUser;
    }

    public void setNeedUser(int needUser) {
        this.needUser = needUser;
    }
}
