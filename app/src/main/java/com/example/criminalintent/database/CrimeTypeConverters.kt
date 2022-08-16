package com.example.criminalintent.database

import androidx.room.TypeConverter
import java.util.*

//Чтобы научить Room преобразовывать типы данных,
//необходимо указать преобразовательтипов. Преобразователь
//типа сообщает Room, как преобразовать специальный тип в
//формат для хранения в базе данных
class CrimeTypeConverters {

    @TypeConverter
    fun fromDate(date: Date?): Long?{
        return date?.time
    }

    @TypeConverter
    fun toDate(millisSinceEpoch : Long?): Date?{
        return millisSinceEpoch?.let{
            Date(it)
        }
    }

    @TypeConverter
    fun toUUID(uuid: String?): UUID? {
        return UUID.fromString(uuid)
    }

    @TypeConverter
    fun fromUUID(uuid: UUID?) : String?{
        return uuid?.toString()
    }

}