package com.light.apicommon.service;


import com.light.apicommon.model.entity.InterfaceInfo;

/**
* @author 86550
* @description 针对表【interface_info(接口表信息)】的数据库操作Service
* @createDate 2023-03-11 10:57:35
*/
public interface InnerInterfaceInfoService{
    /**
     * 查询数据库模拟接口是否存在
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path,String method);
}
