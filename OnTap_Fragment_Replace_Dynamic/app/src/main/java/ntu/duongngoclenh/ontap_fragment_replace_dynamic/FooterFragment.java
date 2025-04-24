package ntu.duongngoclenh.ontap_fragment_replace_dynamic;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FooterFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_footer, container, false);
        FragmentManager fragmentManager = getParentFragmentManager();
        Button nut1 = v.findViewById(R.id.button1);
        Button nut2 = v.findViewById(R.id.button2);
        nut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer_Content, new Blank1()).commit();
            }
        });
        return v;
    }
}