
package com.hossam.mvpimplementation.contracts

interface MainContract {

    interface MainView {
        fun onSuccess(message: String)
        fun onFailed(message: String)
    }

    interface MainPresenter {
        fun login(username: String, password: String)
    }
}