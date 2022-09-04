package com.example.hitungbmi.dataClass

import android.os.Parcel
import android.os.Parcelable

data class PersonPar(val umurPerson: String?, val tinggiPerson: String?, val beratPerson: String?): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(umurPerson)
        parcel.writeString(tinggiPerson)
        parcel.writeString(beratPerson)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PersonPar> {
        override fun createFromParcel(parcel: Parcel): PersonPar {
            return PersonPar(parcel)
        }

        override fun newArray(size: Int): Array<PersonPar?> {
            return arrayOfNulls(size)
        }
    }
}