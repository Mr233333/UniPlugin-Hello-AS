package com.xuejing.uniplugin_alipay

import androidx.annotation.UiThread
import com.taobao.weex.annotation.JSMethod
import com.taobao.weex.common.WXModule

class AliPayRegister : WXModule() {

    @JSMethod(UiThread = false)
    fun registerAliAppID(appId: String) {

    }

    @JSMethod(UiThread = true)
    fun requestUserInfo() {

    }
}