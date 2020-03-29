package com.xuejing.uniplugin_alipay

class AppId private constructor() {

    companion object {
        private var appIdHandle: AppId? = null
        fun factory(): AppId {
            if (appIdHandle == null) {
                appIdHandle = AppId()
            }
            return appIdHandle!!
        }
    }
}