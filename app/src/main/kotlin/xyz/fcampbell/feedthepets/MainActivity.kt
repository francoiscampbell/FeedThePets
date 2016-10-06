package xyz.fcampbell.feedthepets

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import xyz.fcampbell.feedthepets.di.main_activity.DaggerMainActivityComponent
import xyz.fcampbell.feedthepets.view.model.Pet

class MainActivity : AppCompatActivity() {
    private val component = DaggerMainActivityComponent.builder()
            .appComponent(PetApp.COMPONENT)
            .build()

    private val petAdapter = component.petAdapter()
    private val testPets = mutableListOf(
            Pet(name = "Juno"),
            Pet(name = "Jewel"),
            Pet(name = "Pepper"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        petAdapter.pets = testPets
        petList.adapter = petAdapter
        petList.layoutManager = component.linearLayoutManager()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId

        //noinspection SimplifiableIfStatement
        when (id) {
            R.id.action_settings -> return true
            R.id.action_add_pet -> {
                addPet()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }

    }

    fun addPet() {
        val insertPosition = testPets.size
        testPets += Pet(name = "Pet")
        petAdapter.notifyItemInserted(insertPosition)
        petList.smoothScrollToPosition(insertPosition)
    }
}
