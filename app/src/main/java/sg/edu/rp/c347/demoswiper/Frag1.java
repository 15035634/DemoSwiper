package sg.edu.rp.c347.demoswiper;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag1 extends Fragment {


    public Frag1() {
        // Required empty public constructor
    }


    TextView tvFrag1;
    Button change;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_frag1, container, false);

        tvFrag1 = (TextView) view.findViewById(R.id.tvFrag1);


        return view;
    }
}




