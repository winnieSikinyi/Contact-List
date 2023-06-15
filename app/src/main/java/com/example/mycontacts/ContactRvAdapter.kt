package com.example.mycontacts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mycontacts.databinding.ContactlListItemBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactRvAdapter(var contactList: List<ContactData>) : RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding=
            ContactlListItemBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ContactViewHolder(binding)
    }
    override fun getItemCount(): Int {
        return contactList.size
    }
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
    val currentContact=contactList.get(position)
       val binding = holder.binding
//       binding.ivavater.tag =contact.Image
       binding.tvName.text = currentContact.Name
        binding.tvEmail.text =currentContact.EmailAddress
        binding.tvPhonnumber.text =currentContact.PhoneNumber
         Picasso
            .get()
            .load(currentContact.Image)
            .resize(80, 80)
            .centerCrop()
            .transform(CropCircleTransformation())
//             .placeholder(R.drawable.Image)

            .into(binding.ivavater)


    }
}
//class ContactViewHolder(var binding: ContactlListItemBinding) :
//    RecyclerView.ViewHolder(binding.root) {
//
//}
class ContactViewHolder(var binding: ContactlListItemBinding) :RecyclerView.ViewHolder(binding.root)


