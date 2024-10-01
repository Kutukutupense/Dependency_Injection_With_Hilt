package com.eylem.dependency_injection_with_hilt.analytics

import android.util.Log
import javax.inject.Inject

class AnalyticsServiceImpl @Inject constructor():AnalyticsService {
    override fun analyticsMethods() {
        Log.i("AnalyticsServiceImpl","AnalyticsServiceImpl Running...")
    }
}