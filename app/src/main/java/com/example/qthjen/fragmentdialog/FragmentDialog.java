package com.example.qthjen.fragmentdialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * Created by qthjen on 8/11/1
 */

public class FragmentDialog extends DialogFragment {

    PostGetData postGetData;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        postGetData = (PostGetData) getActivity();

        AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
        dialog.setTitle("Confirm");
        dialog.setMessage("Hi Q.ThjeN");
        dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                postGetData.DeleteData(true);
            }
        });

        dialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                postGetData.DeleteData(false);
            }
        });

        /** chuyển dialog.builder sang dialog thường để  return**/
        Dialog dialogNormal = dialog.create();

        return dialogNormal;
    }
}

