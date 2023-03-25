package com.light.project.service;

import com.light.project.model.entity.InterfaceInfo;
import com.light.project.model.entity.UserInterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 86550
* @description 针对表【user_interface_info(接口表信息)】的数据库操作Service
* @createDate 2023-03-14 19:32:51
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);
    boolean
    invoke(long interfaceInfoId,long userId);
}
