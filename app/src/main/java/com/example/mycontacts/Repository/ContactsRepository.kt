package com.example.mycontacts.Repository

import android.provider.ContactsContract.Contacts
import com.example.mycontacts.ContactData
import com.example.mycontacts.ContactsApp
import com.example.mycontacts.database.ContactsDb
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactsRepository {
    val  database = ContactsDb.getDatabase(ContactsApp.appContext)

    suspend fun saveContact(contact: ContactData){
        withContext(Dispatchers.IO){
        database.contactDao().insertContact(contact)
        }
    }

}