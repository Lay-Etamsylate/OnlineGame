package ltd.newbee.mall.common;

public enum ServiceResultEnum {
    ERROR("error"),

    SUCCESS("success"),

    DATA_NOT_EXIST("未查询到记录！"),

    SAME_CATEGORY_EXIST("已存在同级同名的分类！"),

    SAME_LOGIN_NAME_EXIST("用户名已存在！"),

    LOGIN_NAME_NULL("请输入登录名！"),

    LOGIN_PASSWORD_NULL("请输入密码！"),

    LOGIN_VERIFY_CODE_NULL("请输入验证码！"),

    LOGIN_VERIFY_CODE_ERROR("验证码错误！"),

    SAME_INDEX_CONFIG_EXIST("已存在相同的首页配置项！"),

    GOODS_CATEGORY_ERROR("分类数据异常！"),

    SAME_GOODS_EXIST("已存在相同的商品信息！"),

    GOODS_NOT_EXIST("商品不存在！"),

    GOODS_PUT_DOWN("商品已下架！"),

    SHOPPING_CART_ITEM_LIMIT_NUMBER_ERROR("超出单个商品的最大购买数量！"),

    SHOPPING_CART_ITEM_TOTAL_NUMBER_ERROR("超出购物车最大容量！"),

    LOGIN_ERROR("登录失败！"),

    LOGIN_USER_LOCKED("用户已被禁止登录！"),

    ORDER_NOT_EXIST_ERROR("订单不存在！"),

    ORDER_ITEM_NOT_EXIST_ERROR("订单项不存在！"),

    NULL_ADDRESS_ERROR("地址不能为空！"),

    ORDER_PRICE_ERROR("订单价格异常！"),

    ORDER_GENERATE_ERROR("生成订单异常！"),

    SHOPPING_ITEM_ERROR("购物车数据异常！"),

    SHOPPING_ITEM_COUNT_ERROR("库存不足！"),

    ORDER_STATUS_ERROR("订单状态异常！"),

    CLOSE_ORDER_ERROR("关闭订单失败！"),

    OPERATE_ERROR("操作失败！"),

    NO_PERMISSION_ERROR("无权限！"),

    DB_ERROR("database error");

    private String result;

    ServiceResultEnum(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}