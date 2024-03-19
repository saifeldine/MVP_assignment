

package com.hossam.mvpimplementation.database

import com.hossam.mvpimplementation.data.User

object Database {

    fun getCurrentUser(): User {
        return User("saif","14789")
    }
}