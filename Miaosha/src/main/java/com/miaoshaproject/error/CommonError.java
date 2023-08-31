package com.miaoshaproject.error;

/**
 * Created by Weijie Zhou on 2018/11/13.
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);


}
