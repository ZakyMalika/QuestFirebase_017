package com.example.nosql.repositori

import com.example.nosql.modeldata.Siswa

interface RepositorySiswa{
    suspend fun getDataSiswa(): List<Siswa>
    suspend fun postDataSiswa(siswa: Siswa)

}
//class Fire