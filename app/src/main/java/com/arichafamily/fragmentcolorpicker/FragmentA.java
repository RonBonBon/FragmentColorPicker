package com.arichafamily.fragmentcolorpicker;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.SeekBar;

public class FragmentA extends Fragment implements SeekBar.OnSeekBarChangeListener {

    SeekBar sbRed;
    SeekBar sbGreen;
    SeekBar sbBlue;
    EditText etRed;
    EditText etGreen;
    EditText etBlue;
    EditText etResult;
    Communicator comm;

    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        comm = (Communicator) getActivity();

        etRed = (EditText) getActivity().findViewById(R.id.etRed);
        etBlue = (EditText) getActivity().findViewById(R.id.etBlue);
        etGreen = (EditText) getActivity().findViewById(R.id.etGreen);

        etResult = (EditText) getActivity().findViewById(R.id.etResult);

        sbRed = (SeekBar) getActivity().findViewById(R.id.sbRed);
        sbGreen = (SeekBar) getActivity().findViewById(R.id.sbGreen);
        sbBlue = (SeekBar) getActivity().findViewById(R.id.sbBlue);

        sbRed.setOnSeekBarChangeListener(this);
        sbGreen.setOnSeekBarChangeListener(this);
        sbBlue.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        if (seekBar == sbRed){
            etRed.setText(String.valueOf(progress));
        }
        else if (seekBar == sbGreen){
            etGreen.setText(String.valueOf(progress));
        }
        else if (seekBar == sbBlue){
            etBlue.setText(String.valueOf(progress));
        }

        int red = sbRed.getProgress();
        int green = sbGreen.getProgress();
        int blue = sbBlue.getProgress();

        int rgb = Color.rgb(red, green, blue);

        comm.respond(rgb);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
