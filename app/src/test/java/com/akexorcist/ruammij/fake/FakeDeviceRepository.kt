package com.akexorcist.ruammij.fake

import com.akexorcist.ruammij.data.DeviceRepository
import com.akexorcist.ruammij.data.InstalledApp
import com.akexorcist.ruammij.data.database.SafeApp
import com.akexorcist.ruammij.ui.overview.MediaProjectionApp

class FakeDeviceRepository : DeviceRepository {
    override suspend fun getInstalledApps(forceRefresh: Boolean): List<InstalledApp> {
        return emptyList()
    }

    override suspend fun getSafeApps(forceRefresh: Boolean): List<SafeApp> {
        return emptyList()
    }

    override suspend fun markAsSafe(packageName: String) {
    }

    override suspend fun getInstalledApp(
        forceRefresh: Boolean,
        packageName: String
    ): InstalledApp? {
        return null
    }

    override suspend fun getEnabledAccessibilityApps(forceRefresh: Boolean): List<InstalledApp> {
        return emptyList()
    }

    override suspend fun getAccessibilitySupportApps(forceRefresh: Boolean): List<InstalledApp> {
        return emptyList()
    }

    override suspend fun getRunningMediaProjectionApps(forceRefresh: Boolean): List<MediaProjectionApp> {
        return emptyList()
    }

    override suspend fun isUsbDebuggingEnabled(): Boolean {
        return true
    }

    override suspend fun isWirelessDebuggingEnabled(): Boolean? {
        return true
    }

    override suspend fun isDeveloperOptionsEnabled(): Boolean {
        return true
    }
}
