package com.pascal.myapplication.di

import com.pascal.myapplication.ui.screen.home.HomeViewModel
import com.pascal.myapplication.ui.screen.live.LiveViewModel
import com.pascal.myapplication.ui.screen.profile.ProfileViewModel
import com.pascal.myapplication.ui.screen.teams.TeamViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { TeamViewModel(get()) }
    viewModel { LiveViewModel(get()) }
    viewModel { ProfileViewModel(get()) }
}

