package fr.openium.mastertp1_2.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import fr.openium.mastertp1_2.R

class FragmentAdd : Fragment() {
    private var editTextTitre: EditText? = null
    private var editTextDescription: EditText? = null
    private var buttonAdd: Button? = null
    private var id: Int? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonAdd = view.findViewById<Button>(R.id.fragment_add_Button_add)
        editTextTitre = view.findViewById<EditText>(R.id.fragment_add_EditText_Titre)
        editTextDescription = view.findViewById<EditText>(R.id.fragment_add_EditText_description)

        arguments?.let {
            if (it.get(KEY_ID)!=null) {
                id = it.getInt(KEY_ID)
            }
            editTextTitre?.setText(it.getString(KEY_TITLE))
            editTextDescription?.setText(it.getString(KEY_DESCRIPTION))
        }


        buttonAdd?.setOnClickListener {
            val bundle = Bundle()
            id?.let {
                bundle.putInt(KEY_ID,it)
            }
            bundle.putString(KEY_TITLE,editTextTitre?.text.toString())
            bundle.putString(KEY_DESCRIPTION,editTextDescription?.text.toString())

            setFragmentResult(KEY_REQUEST,bundle)
            findNavController().popBackStack()
        }
    }



    companion object {
        val KEY_REQUEST: String = "todorequest"
        val KEY_ID: String = "todoid"
        val KEY_TITLE: String = "todotitle"
        val KEY_DESCRIPTION: String = "tododescription"
    }
}