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

import com.example.royallifeapplication.CGVmore;
import com.example.royallifeapplication.CGVmore6;
import com.example.royallifeapplication.CGVmore7;
import com.example.royallifeapplication.CGVmore8;
import com.example.royallifeapplication.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class FeatureAdpater extends RecyclerView.Adapter<FeatureAdpater.FeaturedViewHolder> {

    ArrayList<FeaturedHelpersClass>featuredLocations;

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
                    //FeaturedHelpersClass item = f
                    //FeaturedHelpersClass item = featuredLocations.get(itemPosition);
                    final Intent intent;
                    switch (getAdapterPosition()){
                        case 0:
                            Toast.makeText(v.getContext(),"The Item Clicked is: "+getAdapterPosition(),Toast.LENGTH_SHORT).show();
                            intent =  new Intent(v.getContext(), CGVmore.class);
                            v.getContext().startActivity(intent);
                            break;
                        case 1:
                            Toast.makeText(v.getContext(),"The Item Clicked is: "+getAdapterPosition(),Toast.LENGTH_SHORT).show();
                            intent =  new Intent(v.getContext(), CGVmore.class);
                            v.getContext().startActivity(intent);
                            break;
                        case 2:
                            intent =  new Intent(v.getContext(), CGVmore.class);
                            v.getContext().startActivity(intent);
                            break;
                        case 3:
                            intent =  new Intent(v.getContext(), CGVmore.class);
                            v.getContext().startActivity(intent);
                            break;
                        case 4:
                            intent =  new Intent(v.getContext(), CGVmore.class);
                            v.getContext().startActivity(intent);
                            break;
                        case 5:
                            intent =  new Intent(v.getContext(), CGVmore6.class);
                            v.getContext().startActivity(intent);
                            break;
                        case 6:
                            intent =  new Intent(v.getContext(), CGVmore7.class);
                            v.getContext().startActivity(intent);
                            break;
                        case 7:
                            intent =  new Intent(v.getContext(), CGVmore8.class);
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