create table if not exists api.user_interface_info
(
    id             bigint  not null  auto_increment
        comment '主键' primary key,
    userId         bigint                       not null comment '调用者id',
    interfaceInfoId bigint                     null comment '接口id',
    totalNum       int                        default 0 not null comment '总调用次数',
    leftNum        int                        default 0 not null comment '剩余调用次数',
    status         int      default 0                 not null comment '0-正常 1-关闭',
    createTime     datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    updateTime     datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    isDelete       tinyint  default 0                 not null comment '是否删除(0-未删, 1-已删)'
)
    comment '接口表信息';
