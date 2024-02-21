package com.example.dtb;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import org.w3c.dom.Entity;

@Database(entities = {entityclass.class},version =5)
public abstract class database1 extends RoomDatabase{

    //this is the contactdatabase
    public abstract Daointerface getDaointerface();

    public static database1 dbInstance;

    public static database1 getDbInstance;

    public static synchronized database1 getdatabaseinstance(Context context){

        if(dbInstance==null) {

            dbInstance = Room.databaseBuilder(
                    context.getApplicationContext(),
                    database1.class,
                    "contacts_db").fallbackToDestructiveMigration().build();
        }
        return dbInstance;

        }

    }

