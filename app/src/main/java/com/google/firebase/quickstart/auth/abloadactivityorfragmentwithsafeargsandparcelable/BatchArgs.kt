package com.google.firebase.quickstart.auth.abloadactivityorfragmentwithsafeargsandparcelable

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class BatchArgs(val id: String? = null): Parcelable {
    val isNew: Boolean
        get() = id == null
}
