package fr.openium.mastertp1_2.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import fr.openium.mastertp1_2.R

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentLogin.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentLogin : Fragment() {


    private var email: String = "coucou"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var editTextEmail = view.findViewById<EditText>(R.id.fragment_main_EditText_email)
        var editTextPassword = view.findViewById<EditText>(R.id.fragment_main_EditText_password)
        var button = view.findViewById<Button>(R.id.fragment_main_Button_login)
        button.setOnClickListener {
            if (editTextEmail.text.isBlank() || editTextPassword.text.isBlank()){
                Toast.makeText(activity, "Veuillez renseigner  un email et un password",Toast.LENGTH_LONG).show()
            }else {
                Toast.makeText(activity, "Connecté", Toast.LENGTH_LONG).show()
                val navController = findNavController()
                navController.navigate(R.id.action_fragmentMain_to_listFragment)
            }
        }
    }

    override fun onResume() {
        super.onResume()
    }

}