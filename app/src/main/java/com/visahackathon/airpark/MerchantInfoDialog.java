package com.visahackathon.airpark;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class MerchantInfoDialog extends AppCompatDialogFragment {
    private ParkingPlace parkingPlace;

    public MerchantInfoDialog() {
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Get the layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.parking_info_dialog, null);
        TextView merchantName = view.findViewById(R.id.tvMerchantName);
        TextView merchantAddress = view.findViewById(R.id.tvMerchantAddress);
        TextView waitTime = view.findViewById(R.id.tvWaitTime);
        merchantName.setText(parkingPlace.getmName());
        merchantAddress.setText(parkingPlace.getmLocation());
        waitTime.setText(String.valueOf(parkingPlace.getWaitTimeSeconds()));

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(view)
                // Add action buttons
                .setPositiveButton("Take me there", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Log.d("MerchantInfoDialog", "Routing via Google Maps.");
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MerchantInfoDialog.this.dismiss();
                    }
                });
        return builder.create();
    }

    public ParkingPlace getParkingPlace() {
        return parkingPlace;
    }

    public void setParkingPlace(ParkingPlace parkingPlace) {
        this.parkingPlace = parkingPlace;
    }
}
