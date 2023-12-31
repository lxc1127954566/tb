package com.tb.common.enu;
/**
 * 仓库枚举
 * */
public enum WarehouseEnum {

    DEFECTIVE_WAREHOUSE("D95EC223-8351-4A5E-8B87-191DE99AC2E8","defectiveWarehouse","stock:Defective"),
    YiBin_ON_WAY_WAREHOUSE("B8893653-B483-478A-DED4-1A784FA139C9","yiBinOnWayWarehouse","stock:YiBinOnWay"),
    RETURN_PADDING_WAREHOUSE("B88F6D82-D08E-4256-C044-19323FBB8930","returnPaddingWarehouse","stock:returnPaddingWarehouse");

    private String id;
    private String name;
    private String redisCode;

    WarehouseEnum(String id, String name, String redisCode) {
        this.id = id;
        this.name = name;
        this.redisCode = redisCode;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRedisCode() {
        return redisCode;
    }
}