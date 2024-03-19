

package com.hossam.mvpimplementation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hossam.mvpimplementation.contracts.MainContract
import com.hossam.mvpimplementation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainContract.MainView {

    /*
      الاسم : سيف الدين اشرف فخري حسين محمد
      الجروب :   NoGroup
 */
    private lateinit var binding: ActivityMainBinding
    private lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initPresenter()
    }

    private fun initPresenter() {
        mainPresenter = MainPresenter(this)

        binding.btnLogin.setOnClickListener {
            mainPresenter.login(
                binding.usernameEdittext.text.toString(),
                binding.passwordEdittext.text.toString()
            )
        }

    }

    override fun onSuccess(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun onFailed(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}