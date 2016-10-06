package xyz.fcampbell.feedthepets.view

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.pet.view.*
import xyz.fcampbell.feedthepets.R
import xyz.fcampbell.feedthepets.di.main_activity.MainActivityScope
import xyz.fcampbell.feedthepets.view.model.Pet
import javax.inject.Inject

/**
 * Created by francois on 2016-10-05.
 */
@MainActivityScope
class PetAdapter @Inject constructor() : RecyclerView.Adapter<PetAdapter.PetViewHolder>() {
    lateinit var pets: List<Pet>

    override fun getItemCount(): Int = pets.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetViewHolder {
        return PetViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.pet, parent, false))
    }

    override fun onBindViewHolder(holder: PetViewHolder, position: Int) = holder.bindPet(pets[position])

    class PetViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindPet(pet: Pet) {
            itemView.name.text = pet.name

            if (!pet.picture.isNullOrBlank()) {
                Picasso.with(itemView.context)
                        .load(pet.picture)
                        .into(itemView.picture)
            }
        }
    }
}