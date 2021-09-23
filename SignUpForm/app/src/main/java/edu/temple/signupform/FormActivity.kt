package edu.temple.signupform

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class FormActivity : AppCompatActivity() {

    // Private var variables for TextView and EditText design components.
    private var nameEdit: EditText? = null
    private var emailEdit: EditText? = null
    private var passwordEdit: EditText? = null
    private var confirmPassEdit: EditText? = null
    private var nameTextError: TextView? = null
    private var emailTextError: TextView? = null
    private var passwordTextError: TextView? = null
    private var confirmPassTextError: TextView? = null
    private var name: String? = null
    private var email: String? = null
    private var password: String? = null
    // empty string var variable to check password confirmation
    private var confirmPassword = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        takeIn()
    }// end override fun onCreate()

    // Function to initialize private variables with their design components
    private fun takeIn() {
        nameEdit = findViewById(R.id.editTextName)
        emailEdit = findViewById(R.id.editTextEmail)
        confirmPassEdit = findViewById(R.id.editTextConfirmPassword)
        passwordEdit = findViewById(R.id.editTextPassword)
        nameTextError = findViewById(R.id.txtErrorName)
        emailTextError = findViewById(R.id.txtErrorEmail)
        passwordTextError = findViewById(R.id.txtErrorPassword)
        confirmPassTextError = findViewById(R.id.txtErrorConfirmPassword)
    }// end private fun init()

    // save function for save button.
    fun save(view: View?) {

        // private variables signed as non null (with !! sign), and convert to their text input toString.
        // (I did not know that but code suggestion help me to do like that)
        name = nameEdit!!.text.toString()
        email = emailEdit!!.text.toString()
        password = passwordEdit!!.text.toString()
        confirmPassword = confirmPassEdit!!.text.toString()

        // if design components strings are empty -> visible to their error
        // else visible to their text error
        if (name == "") {
            nameTextError!!.visibility = View.VISIBLE
        }// end if
        else nameTextError!!.visibility =View.GONE

        if (email == "") {
            emailTextError!!.visibility = View.VISIBLE
        }// end if
        else emailTextError!!.visibility =View.GONE

        if (password == "") {
            passwordTextError!!.visibility =View.VISIBLE
        }// end if

        else passwordTextError!!.visibility =View.GONE

        if (confirmPassword == "") {
            confirmPassTextError!!.setText(R.string.cnf_pass)
            confirmPassTextError!!.visibility = View.VISIBLE
        }// end if

        else {
            confirmPassTextError!!.setText(R.string.password_does_not_match)
            confirmPassTextError!!.visibility = View.GONE
        }// end else

        if (confirmPassword != password) {
            confirmPassTextError!!.visibility =
                View.VISIBLE
        } // end if

        else confirmPassTextError!!.visibility =View.GONE

        // if all design components are filled up correctly toast the text message
        if (name != "" && email != "" && password != "" && confirmPassword == password) {
            Toast.makeText(this, "Welcome, $name, to the SignUpForm App", Toast.LENGTH_LONG).show()
        }// end if

    }// end fun save()

}// end class FormActivity : AppCompatActivity()