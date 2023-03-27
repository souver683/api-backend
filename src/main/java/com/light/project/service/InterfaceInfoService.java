package com.light.project.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.light.apicommon.model.entity.InterfaceInfo;

/**
* @author 86550
* @description 针对表【interface_info(接口表信息)】的数据库操作Service
* @createDate 2023-03-11 10:57:35
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
