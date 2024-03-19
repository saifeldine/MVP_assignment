

package com.hossam.mvpimplementation.ui

import com.hossam.mvpimplementation.contracts.MainContract
import com.hossam.mvpimplementation.database.Database

class MainPresenter(private val mainView: MainContract.MainView) : MainContract.MainPresenter {

    override fun login(username: String, password: String) {
            if (username==Database.getCurrentUser().username && password==Database.getCurrentUser().password){
                mainView.onSuccess("Login is Success")
            }else mainView.onFailed("Login is Failed")
    }
}