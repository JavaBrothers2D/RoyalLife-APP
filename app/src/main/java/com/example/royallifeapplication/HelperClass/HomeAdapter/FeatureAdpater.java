package com.example.royallifeapplication.HelperClass.HomeAdapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.royallifeapplication.ZahRah;
import com.example.royallifeapplication.badhabbit;
import com.example.royallifeapplication.cgv;
import com.example.royallifeapplication.changvang;
import com.example.royallifeapplication.dirty;
import com.example.royallifeapplication.gogi;
import com.example.royallifeapplication.heli;
import com.example.royallifeapplication.kichi;
import com.example.royallifeapplication.skybar;
import com.example.royallifeapplication.wine;
import com.example.royallifeapplication.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class FeatureAdpater extends RecyclerView.Adapter<FeatureAdpater.FeaturedViewHolder> {

    public ArrayList<FeaturedHelpersClass>featuredLocations;

    public FeatureAdpater(ArrayList<FeaturedHelpersClass> featuredLocations) {
        this.featuredLocations = featuredLocations;
    }


    @NotNull
    @Override
    public FeaturedViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.featured_card_design,parent,false);
        FeaturedViewHolder featuredViewHolder = new FeaturedViewHolder(view);
        return featuredViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull FeaturedViewHolder holder, int position) {

        FeaturedHelpersClass featuredHelpersClass = featuredLocations.get(position);

        holder.image.setImageResource(featuredHelpersClass.getImage());
        holder.title.setText(featuredHelpersClass.getTitle());
        holder.desc.setText(featuredHelpersClass.getDescription());

    }

    @Override
    public int getItemCount() {
        return featuredLocations.size();
    }


    public static class FeaturedViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView title, desc;

        public FeaturedViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            //
            image = itemView.findViewById(R.id.image_cgv);
            title = itemView.findViewById(R.id.txt_cgv);
            desc = itemView.findViewById(R.id.txt_gioithieucgv);
            itemView.bringToFront();
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int itemPosition = getAdapterPosition();
                    //FeaturedHelpersClass i =
                    //FeaturedHelpersClass item = f
                    //FeaturedHelpersClass item = featuredLocations.get(itemPosition);
                    final Intent intent;
                    switch (getAdapterPosition()){
                        case 0:
                            Toast.makeText(v.getContext(),"The Item Clicked is: "+getAdapterPosition(),Toast.LENGTH_SHORT).show();
                            intent =  new Intent(v.getContext(), cgv.class);
                            v.getContext().startActivity(intent);
                            break;
                        case 1:
                            Toast.makeText(v.getContext(),"The Item Clicked is: "+getAdapterPosition(),Toast.LENGTH_SHORT).show();
                            intent =  new Intent(v.getContext(), heli.class);
                            v.getContext().startActivity(intent);
                            break;
                        case 2:
                            Toast.makeText(v.getContext(),"The Item Clicked is: "+getAdapterPosition(),Toast.LENGTH_SHORT).show();
                            intent =  new Intent(v.getContext(), badhabbit.class);
                            v.getContext().startActivity(intent);
                            break;
                        case 3:
                            Toast.makeText(v.getContext(),"The Item Clicked is: "+getAdapterPosition(),Toast.LENGTH_SHORT).show();
                            intent =  new Intent(v.getContext(), changvang.class);
                            v.getContext().startActivity(intent);
                            break;
                        case 4:
                            Toast.makeText(v.getContext(),"The Item Clicked is: "+getAdapterPosition(),Toast.LENGTH_SHORT).show();
                            intent =  new Intent(v.getContext(), dirty.class);
                            v.getContext().startActivity(intent);
                            break;
                        case 5:
                            Toast.makeText(v.getContext(),"The Item Clicked is: "+getAdapterPosition(),Toast.LENGTH_SHORT).show();
                            intent =  new Intent(v.getContext(), gogi.class);
                            v.getContext().startActivity(intent);
                            break;
                        case 6:
                            Toast.makeText(v.getContext(),"The Item Clicked is: "+getAdapterPosition(),Toast.LENGTH_SHORT).show();
                            intent =  new Intent(v.getContext(), kichi.class);
                            v.getContext().startActivity(intent);
                            break;
                        case 7:
                            Toast.makeText(v.getContext(),"The Item Clicked is: "+getAdapterPosition(),Toast.LENGTH_SHORT).show();
                            intent =  new Intent(v.getContext(), skybar.class);
                            v.getContext().startActivity(intent);
                            break;
                        case 8:
                            Toast.makeText(v.getContext(),"The Item Clicked is: "+getAdapterPosition(),Toast.LENGTH_SHORT).show();
                            intent =  new Intent(v.getContext(), wine.class);
                            v.getContext().startActivity(intent);
                            break;
                        case 9:
                            Toast.makeText(v.getContext(),"The Item Clicked is: "+getAdapterPosition(),Toast.LENGTH_SHORT).show();
                            intent =  new Intent(v.getContext(), ZahRah.class);
                            v.getContext().startActivity(intent);
                            break;
                        default:
                            Toast.makeText(v.getContext(),"The Item Clicked is: "+getAdapterPosition(),Toast.LENGTH_SHORT).show();
                            //intent =  new Intent(v.getContext(), CGVmore.class);
                            //v.getContext().startActivity(intent);
                            break;
                    }
                    // v.getContext().startActivity(intent);

                }
            });

        }
    }


}