package com.pascal.myapplication.di

import com.pascal.myapplication.domain.usecase.HomeUC
import com.pascal.myapplication.domain.usecase.LocalUC
import org.koin.dsl.module

val domainModule = module {
    factory { HomeUC(get()) }
    factory { LocalUC(get()) }
}
