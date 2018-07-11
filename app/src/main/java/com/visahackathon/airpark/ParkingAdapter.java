package com.visahackathon.airpark;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;


public class ParkingAdapter extends RecyclerView.Adapter<ParkingAdapter.ProductViewHolder> {


    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<Parking> parkingList;

    //getting the context and product list with constructor
    public ParkingAdapter(Context mCtx, List<Parking> parkingList) {
        this.mCtx = mCtx;
        this.parkingList = parkingList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_cards, null);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mCtx, ReserveActivity.class);
                mCtx.startActivity(intent);
            }
        });
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        //getting the parking of the specified position
        Parking parking = parkingList.get(position);

        //binding the data with the viewholder views
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(parking.getImage()));

        holder.textViewTitle.setText(parking.getMerchantTitle());
        holder.textViewAddress.setText(parking.getMerchantAddress());
        holder.textViewDistance.setText(parking.getMerchantDistance());
        holder.textViewWaitTime.setText(String.valueOf(parking.getWaitTime()));
        holder.textViewPrice.setText(String.valueOf(parking.getPrice()));
    }


    @Override
    public int getItemCount() {
        return parkingList.size();
    }


    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewAddress, textViewDistance, textViewWaitTime, textViewPrice;
        ImageView imageView;

        public ProductViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.thumbnail);

            textViewTitle = itemView.findViewById(R.id.title);
            textViewAddress = itemView.findViewById(R.id.address);
            textViewDistance = itemView.findViewById(R.id.distance);
            textViewWaitTime = itemView.findViewById(R.id.waittime);
            textViewPrice = itemView.findViewById(R.id.price);
        }
    }
}
