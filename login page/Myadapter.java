package com.example.dtb;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dtb.databinding.CustomLayoutBinding;

import java.util.ArrayList;

public class Myadapter extends RecyclerView.Adapter<Myadapter.contactviewholder>  {

    ArrayList<entityclass> contacts;

    public Myadapter(ArrayList<entityclass> contacts) {
    }

    @NonNull
    @Override
    public contactviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        CustomLayoutBinding contactlistbinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.custom_layout,
                parent,
                false
        );


        return new contactviewholder(contactlistbinding);
    }

    @Override
    public void onBindViewHolder(@NonNull contactviewholder holder, int position) {

        entityclass currcontact = contacts.get(position);
        holder.contactlistitembinding.setContact(currcontact);

    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    class contactviewholder extends RecyclerView.ViewHolder {


        public CustomLayoutBinding contactlistitembinding;


        public contactviewholder(@NonNull CustomLayoutBinding contactlistitembinding) {
            super(contactlistitembinding.getRoot());
            this.contactlistitembinding = contactlistitembinding;
        }
    }
}
