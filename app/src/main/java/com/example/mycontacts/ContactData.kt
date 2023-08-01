package com.example.mycontacts

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName= "Contacts")
data class ContactData (
    @PrimaryKey(autoGenerate= true)var contactId:Int,
    var Name:String,
    var PhoneNumber:String,
    var EmailAddress:String,
    var Image:String,


)
