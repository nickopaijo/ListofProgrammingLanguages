package com.example.aplikasisederhana;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListLanguageAdapter extends RecyclerView.Adapter<ListLanguageAdapter.ListViewHolder> {
    private ArrayList<Language> listLanguage;
    private OnItemClickCallBack onItemClickCallBack;

    void setOnItemClickCallBack(OnItemClickCallBack onItemClickCallBack){
        this.onItemClickCallBack = onItemClickCallBack;
    }

    public ListLanguageAdapter(ArrayList<Language> list){ this.listLanguage=list; }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row, viewGroup, false);
        return new ListViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Language language = listLanguage.get(position);

        Glide.with(holder.itemView.getContext())
                .load(language.getImg())
                .apply(new RequestOptions()
                        .override(55,55)).into(holder.imgPhoto);

        holder.tvName.setText(language.getName());
        holder.tvDetail.setText(language.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onItemClickCallBack.onItemClicked(listLanguage.get(holder.getAdapterPosition()));
            }
        });
    }


    @Override
    public int getItemCount() {
        return listLanguage.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName,tvDetail;

        ListViewHolder(View itemView){
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.item_name);
            tvDetail = itemView.findViewById(R.id.item_detail);
        }
    }

    public interface OnItemClickCallBack{
        void onItemClicked(Language data);
    }
}
