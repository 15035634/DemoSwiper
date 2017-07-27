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
public class Frag2 extends Fragment {


    public Frag2() {
        // Required empty public constructor
    }
    TextView tvFrag2;
    Button change;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_frag2, container, false);

        tvFrag2 = (TextView) view.findViewById(R.id.tvFrag2);

        return view;
    }

}
