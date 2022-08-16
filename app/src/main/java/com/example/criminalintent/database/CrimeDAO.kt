package com.example.criminalintent.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.example.criminalintent.Crime
import java.util.*

@Dao                            // @Dao сообщает Room, что это одиниз ваших объектов доступа к данным.
interface CrimeDAO {            // Room будет  генерировать реализации функций, которые вы добавляете к этому интерфейсу.
    @Query("SELECT * FROM crime")
    fun getCrimes(): LiveData<List<Crime>>

    @Query("SELECT * FROM crime WHERE id=(:id)")
    fun getCrime(id:UUID): LiveData<Crime?>
}