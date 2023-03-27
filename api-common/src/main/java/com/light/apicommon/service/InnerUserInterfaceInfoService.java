package com.light.apicommon.service;


import com.light.apicommon.model.entity.UserInterfaceInfo;

/**
* @author 86550
* @description 针对表【user_interface_info(接口表信息)】的数据库操作Service
* @createDate 2023-03-14 19:32:51
*/
public interface InnerUserInterfaceInfoService {
    /**
     * 统计接口调用次数
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId,long userId);





}
