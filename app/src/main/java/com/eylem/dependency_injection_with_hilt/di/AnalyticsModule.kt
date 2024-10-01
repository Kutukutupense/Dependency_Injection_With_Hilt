package com.eylem.dependency_injection_with_hilt.di

import com.eylem.dependency_injection_with_hilt.analytics.AnalyticsService
import com.eylem.dependency_injection_with_hilt.analytics.AnalyticsServiceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class AnalyticsModule {
    @Binds
  abstract fun  bindAnalyticsService(analyticsServiceImpl: AnalyticsServiceImpl):AnalyticsService
}