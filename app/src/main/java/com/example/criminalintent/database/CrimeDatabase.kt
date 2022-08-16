package com.example.criminalintent.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.criminalintent.Crime

@Database(entities = [ Crime::class], version = 1)  // @Database сообщает Room о том, что этот класс
                                                    // представляет собой базу данных в приложении
                                                    // Первый параметр — это какие использовать классы
                                                    // при создании и управлении таблицами
                                                    // Второй параметр — версия базы данных
@TypeConverters(CrimeTypeConverters::class)         // @TypeConverters инструктирует базу данных использовать
abstract class CrimeDatabase: RoomDatabase() {      // функции в этом классе при преобразовании типов


    abstract fun crimeDao():CrimeDAO                //подключить DAO

}