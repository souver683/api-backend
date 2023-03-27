package com.light.project.service.impl.inner;

import com.light.apicommon.model.entity.UserInterfaceInfo;
import com.light.apicommon.service.InnerUserInterfaceInfoService;
import com.light.project.service.UserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author light
 * @version 1.0
 * @project api-backend
 * @description
 * @data 2023/3/26 15 : 43 : 37
 */
@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {
    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;
    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        return  userInterfaceInfoService.invokeCount(interfaceInfoId,userId);

    }
}
