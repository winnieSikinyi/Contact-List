package com.example.mycontacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycontacts.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
    displayContact()
        binding.btnbutton.setOnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
    fun displayContact (){
        val contact1= ContactData(0,"Regina","070987450","regina.com","https://images.unsplash.com/photo-1532012197267-da84d127e765?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxleHBsb3JlLWZlZWR8MXx8fGVufDB8fHx8fA%3D%3D&w=1000&q=80")
        val contact2 = ContactData(0,"Winnie","0768593188","sikinyiwinnie@gmail.com","https://images.unsplash.com/photo-1541348263662-e068662d82af?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8c3BvcnRzJTIwY2FyfGVufDB8fDB8fHww&w=1000&q=80")
        val contact3=ContactData(0,"Eunice","078765340","eunice.com","https://images.unsplash.com/photo-1532012197267-da84d127e765?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxleHBsb3JlLWZlZWR8MXx8fGVufDB8fHx8fA%3D%3D&w=1000&q=80")
        val contact5=ContactData(0,"Grace","079235380","grace.com","https://images.unsplash.com/photo-1541348263662-e068662d82af?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8c3BvcnRzJTIwY2FyfGVufDB8fDB8fHww&w=1000&q=80")
        val contact8=ContactData(0,"Philiph","070987450","philip.com","https://images.unsplash.com/photo-1541348263662-e068662d82af?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8c3BvcnRzJTIwY2FyfGVufDB8fDB8fHww&w=1000&q=80")
        val contact6=ContactData(0,"Ryan","078765340","ryan.com","https://images.unsplash.com/photo-1541348263662-e068662d82af?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8c3BvcnRzJTIwY2FyfGVufDB8fDB8fHww&w=1000&q=80 ")
        val contact7=ContactData(0,"Robert","079874750","robert.com"," https://images.unsplash.com/photo-1541348263662-e068662d82af?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8c3BvcnRzJTIwY2FyfGVufDB8fDB8fHww&w=1000&q=80")

    val contactData= mutableListOf<ContactData>(contact1,contact2,contact3,contact5,contact6,contact7,contact8)
    val contactAdapter=ContactRvAdapter(contactData)
    binding.rvRecyler.layoutManager= LinearLayoutManager(this)
    binding.rvRecyler.adapter=contactAdapter

}
    }



