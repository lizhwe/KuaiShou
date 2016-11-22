package com.lzw.kuaishou.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.Toast;

import com.lzw.kuaishou.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class QuickFragment extends Fragment {

    RadioButton rb_receive, rb_send;


    public QuickFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quick, container, false);
        rb_receive = (RadioButton) view.findViewById(R.id.quick_receive_rb);
        rb_send = (RadioButton) view.findViewById(R.id.quick_send_rb);
        rb_receive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "代收快递", Toast.LENGTH_SHORT).show();
            }
        });
        rb_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "送货上门", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}













