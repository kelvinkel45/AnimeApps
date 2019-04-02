package com.vcode.anime;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MyViewHolder> {

    RequestOptions options ;
    private Context mContext ;
    private List<Data> mData ;


    public DataAdapter(Context mContext, List dataList) {


        this.mContext = mContext;
        this.mData = dataList;
        options = new RequestOptions()
                .centerCrop()
                .placeholder(R.mipmap.anime)
                .error(R.mipmap.anime);

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.item_row,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.tvNama.setText(mData.get(position).getNama());
        holder.tvRating.setText(mData.get(position).getRating());
        holder.tvStudio.setText(mData.get(position).getStudio());
        holder.tvKategori.setText(mData.get(position).getKategori());
        Glide.with(mContext).load(mData.get(position).getImage_url()).apply(options).into(holder.tvFoto);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvNama,tvStudio, tvRating, tvKategori, tvEpisode;
        ImageView tvFoto;


        public MyViewHolder(View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvStudio = itemView.findViewById(R.id.tv_studio);
            tvRating = itemView.findViewById(R.id.tv_rating);
            tvKategori = itemView.findViewById(R.id.tv_kategori);
            tvFoto = itemView.findViewById(R.id.thumbnail);
        }
    }
}
