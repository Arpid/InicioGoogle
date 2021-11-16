package encinas.manuel.iniciogoogle

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_principal.*


class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val bundle = intent.extras

        if (bundle != null){
            val name = bundle.getString("name")
            val email = bundle.getString("email")
            tv_nombre.setText(name)
            tv_email.setText(email)
        }
        val btn_cerrar: Button = findViewById(R.id.btn_cerrar)

        btn_cerrar.setOnClickListener{
            finish()
        }

    }

    override fun onBackPressed() {

    }

}