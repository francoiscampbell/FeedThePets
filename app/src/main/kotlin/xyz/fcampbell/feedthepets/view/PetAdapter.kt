package xyz.fcampbell.feedthepets.view

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.pet.view.*
import xyz.fcampbell.feedthepets.R
import xyz.fcampbell.feedthepets.view.model.Pet

/**
 * Created by francois on 2016-10-05.
 */
class PetAdapter(private val pets: List<Pet>) : RecyclerView.Adapter<PetAdapter.PetViewHolder>() {
    override fun getItemCount(): Int = pets.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetViewHolder {
        return PetViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.pet, parent, false))
    }

    override fun onBindViewHolder(holder: PetViewHolder, position: Int) = holder.bindPet(pets[position])

    class PetViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindPet(pet: Pet) {
            itemView.apply {
                name.text = pet.name
                //TODO use picasso to load picture
            }
        }
    }
}