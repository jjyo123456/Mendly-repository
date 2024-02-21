package com.example.dtb;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;

import java.util.List;

public class Myviewmodel extends AndroidViewModel {
    Repository repository ;

    public Myviewmodel(@NonNull Application application, Repository repository) {
        super(application);
        this.repository = repository;
    }

    public void addcontact(entityclass contact){
        repository.addcontact(contact);
    }
    public void deletcontact(entityclass contact){
        repository.deletecontact(contact);
    }

    public LiveData<List<entityclass>> getallcontacts(){
        LiveData<List<entityclass>> al = repository.getall();
        return al;
    }
}
