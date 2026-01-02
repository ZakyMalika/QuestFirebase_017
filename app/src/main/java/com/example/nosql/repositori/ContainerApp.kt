package com.example.nosql.repositori

import android.app.Application

interface ContainerApp{
    val repositorySiswa: RepositorySiswa

}

class DefaultAppContainer: ContainerApp{
    override val repositorySiswa: RepositorySiswa by lazy {
        FirebaseRepositorySiswa()
    }
}

class AplikasiDataSiswa: Application(){
    lateinit var container: ContainerApp
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}

