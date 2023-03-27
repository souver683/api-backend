package com.light.apicommon.service;




import com.light.apicommon.model.entity.User;



/**
 * 用户服务
 *
 * @author yupi
 */
public interface InnerUserService {

    /**
     * 获取接口信息
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);


}
