package com.example.module25.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.module25.App
import com.example.module25.domain.Film
import com.example.module25.domain.Interactor

class HomeFragmentViewModel : ViewModel() {
    val filmsListLiveData:  MutableLiveData<List<Film>> = MutableLiveData()
    //Инициализируем интерактор
    private var interactor: Interactor = App.instance.interactor

    init {
        val films = interactor.getFilmsDB()
        filmsListLiveData.postValue(films)
    }
}