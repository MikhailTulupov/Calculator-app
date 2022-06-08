package mikhail.tulupov.calculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mikhail.tulupov.calculator.databinding.FragmentSimpleCalculatorBinding

/**
 * A simple [Fragment] subclass.
 */
class FragmentSimpleCalculator : Fragment() {

    private var binding: FragmentSimpleCalculatorBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSimpleCalculatorBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding?.root
    }
}