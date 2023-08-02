package com.example.mycontacts.database.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mycontacts.ContactData
import com.example.mycontacts.Repository.ContactsRepository
import kotlinx.coroutines.launch

class ContactViewModel:ViewModel() {
    val ContactRepository= ContactsRepository()
    fun saveContact(contact: ContactData){
        viewModelScope.launch {
            ContactRepository.saveContact(contact)
        }
    }
}