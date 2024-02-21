package com.example.dtb;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Dao
public interface Daointerface {

    ExecutorService execute = Executors.newSingleThreadExecutor();



    
    @Insert
    void insertt (entityclass contact);

    @Delete
    void delet (entityclass contact);

    @Query("SELECT*FROM contacts_table")

    LiveData<List<entityclass>> getallcontacts();


}
