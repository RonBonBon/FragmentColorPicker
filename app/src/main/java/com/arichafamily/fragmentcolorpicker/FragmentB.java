package com.arichafamily.fragmentcolorpicker;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class FragmentB extends Fragment {

    EditText etResult;

    public FragmentB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        etResult = (EditText) getActivity().findViewById(R.id.etResult);
    }

    public void changeColor(int data)
    {
        etResult.setBackgroundColor(data);
        String hexString = Integer.toHexString(data);
        hexString = hexString.toUpperCase();
        hexString = hexString.substring(2, 8);
        etResult.setText("#" + hexString);
    }
}
