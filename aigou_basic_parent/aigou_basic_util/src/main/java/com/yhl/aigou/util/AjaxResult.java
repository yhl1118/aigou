package com.yhl.aigou.util;

public class AjaxResult {
    private Boolean success=true;
    private  String msg="操作成功";
    //返回的携带的数据
    private Object data;
    //设置成功返回的AJAX
    public static AjaxResult me(){
        return new AjaxResult();
    }
    //设置不成功的时候的测试(使用链式变成)
    public static AjaxResult error(){
        AjaxResult ajaxResult = me().setSuccess(false).setData("数据测试").setMsg("操作失败");
        return ajaxResult;
    }


    public Object getData() {
        return data;
    }

    public AjaxResult setData(Object data) {
        this.data = data;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Boolean getSuccess() {

        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return  this;
    }
}
