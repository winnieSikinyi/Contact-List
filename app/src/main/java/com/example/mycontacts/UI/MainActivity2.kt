package com.example.mycontacts.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.example.mycontacts.ContactData
import com.example.mycontacts.database.ViewModel.ContactViewModel
import com.example.mycontacts.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    val ContactViewModel: ContactViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.btnButton.setOnClickListener {
            validateAddContact()
        }
    }

    fun validateAddContact() {
        val name1 = binding.etFirstName.text.toString()
        val name2 = binding.etSecondName.text.toString()
        val phone = binding.etPhoneNumber.text.toString()
        val email = binding.etEmailAddress.text.toString()

        var error = false

        if (name1.isEmpty()) {
            binding.tilFirstName.error = "FirstName required"
            Toast.makeText(this, "Please enter phone number", Toast.LENGTH_SHORT).show();
            error = true
        }


        if (name1.isEmpty()) {
            binding.tilSecondName.error = "SecondName required"
            Toast.makeText(this, "Enter Name", Toast.LENGTH_SHORT).show()
            error = true
        }

        if (phone.isEmpty()) {
            binding.tilPhoneNumber.error = "Password required"
            Toast.makeText(this, "Please enter last name", Toast.LENGTH_SHORT).show();
            error = true
        }

        if (email.isEmpty()) {
            binding.tilEmailadress.error = "Password required"
            Toast.makeText(this, "Please enter last name", Toast.LENGTH_SHORT).show();
            error = true
        }

        if (!error) {
            val y = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        val newContactData = ContactData(0,name1,phone,email,"")
        ContactViewModel.saveContact(newContactData)
        Toast.makeText(this, "Contact added", Toast.LENGTH_SHORT).show()
        finish()
    }
}