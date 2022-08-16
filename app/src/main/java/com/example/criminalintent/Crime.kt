package com.example.criminalintent

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date
import java.util.UUID

// Каждое свойство, определенное в классе,
//превратится в столбец в таблице, при этом имя свойства станет
//именем столбца.
@Entity
data class Crime(@PrimaryKey val id : UUID = UUID.randomUUID(),
                 var title : String = "",
                 var date: Date = Date(),
                 var isSolved : Boolean = false)