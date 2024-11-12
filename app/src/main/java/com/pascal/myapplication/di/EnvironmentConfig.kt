package com.pascal.myapplication.di

import com.pascal.myapplication.BuildConfig


object EnvironmentConfig {
    const val BASE_DOMAIN = BuildConfig.BASE_URL
    const val BASE_URL = "https://$BASE_DOMAIN/"
    val allowedSSlFingerprints = emptyList<String>()
}