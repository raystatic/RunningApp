package com.running.runningapp.other

import android.graphics.Color

object Constants {

    const val  RUNNING_DATABASE_NAME = "running_db"
    const val REQUEST_CODE_PERMISSION_LOCATION = 0
    const val ACTION_START_OR_RESUME_SERVICE = "ACTION_START_OR_RESUME_SERVICE"
    const val ACTION_PAUSE_SERVICE = "ACTION_PAUSE_SERVICE"
    const val ACTION_STOP_SERVICE = "ACTION_STOP_SERVICE"

    const val ACTION_SHOW_TRACKING_FRAGMENT = "ACTION_SHOW_TRACKING_FRAGMENT"

    const val SHARED_PREFERENCES_NAME = "sharedPref"
    const val KEY_FIRST_TIME_TOGGLE = "KEY_FIRST_TIME_TOGGLE"
    const val KEY_NAME = "KEY_NAME"
    const val KEY_WEIGHT = "KEY_WEIGH"

    const val LOCATION_UPDATES_INTERVAL = 5000L
    const val FASTEST_UPDATES_INTERVAL = 2000L

    const val POLYLINE_COLOR = Color.RED
    const val POLYLINE_WIDTH = 8f
    const val MAP_ZOOM = 15f

    const val TIMER_UPDATE_DELAY = 50L

    const val NOTIFICATION_CHANNEL_ID = "tracking_channel"
    const val NOTIFICATION_CHANNEL_NAME = "Tracking"
    const val NOTIFICATION_ID = 1
}