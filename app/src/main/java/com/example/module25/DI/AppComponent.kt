package com.example.module25.DI

import com.example.module25.DI.modules.DatabaseModule
import com.example.module25.DI.modules.DomainModule
import com.example.module25.DI.modules.RemoteModule
import com.example.module25.viewmodel.HomeFragmentViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    //Внедряем все модули, нужные для этого компонента
    modules = [
        RemoteModule::class,
        DatabaseModule::class,
        DomainModule::class
    ]
)
interface AppComponent {
    //метод для того, чтобы появилась внедрять зависимости в HomeFragmentViewModel
    fun inject(homeFragmentViewModel: HomeFragmentViewModel)
}