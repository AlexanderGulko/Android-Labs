package ua.opu.pnit.Lab_6_7.repository.db;

import androidx.room.TypeConverter;

import java.util.Date;

public class DateConverter {

    @TypeConverter
    public static Date toDateCreation(Long creation_timestamp) {
        return creation_timestamp == null ? null : new Date(creation_timestamp);
    }

    @TypeConverter
    public static Long toCreation_timestamp(Date dateCreation) {
        return dateCreation == null ? null : dateCreation.getTime();
    }
}
