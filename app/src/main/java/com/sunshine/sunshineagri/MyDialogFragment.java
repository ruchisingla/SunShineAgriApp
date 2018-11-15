package com.sunshine.sunshineagri;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {


    public MyDialogFragment() {
        // Required empty public constructor
    }


//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.fragment_dialog, container, false);
//
//        return view;
//    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Choose");
        builder.setMessage("Do you want to exit?");
        builder.setPositiveButton("OK",this);
        builder.setNegativeButton("Cancel",this);
        AlertDialog dialog=builder.create();
        dialog.setCanceledOnTouchOutside(false);
        return dialog;
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        switch(i)
        {
            case Dialog.BUTTON_POSITIVE :
                break;
            case Dialog.BUTTON_NEGATIVE:
                break;
        }

    }
}
