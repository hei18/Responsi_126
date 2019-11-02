package com.evilcorp.resposnsi126

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var full_name :String? = ""
        var User :String? = ""
        var Pass :String? = ""

        if (intent.extras != null){
            val bundle = intent.extras
            full_name = bundle?.getString("full_name")
            User = bundle?.getString("User")
            Pass = bundle?.getString("Pass")
        }
        toInfo.setOnClickListener(){
            val intent = Intent(this,AccountActivity::class.java)
            intent.putExtra("full_name",full_name)
            intent.putExtra("User",User)
            intent.putExtra("Pass",Pass)
            startActivity(intent)
        }

        var listview = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Facebook", "Facebook desc", R.drawable.fb))
        list.add(Model("Twitter", "Twitter desc", R.drawable.twitter))
        list.add(Model("Instagram", "Instagram desc", R.drawable.ig))
        list.add(Model("Tinder", "Tinder desc", R.drawable.tinder))
        list.add(Model("WeChatt", "WeChatt desc", R.drawable.wc))
        list.add(Model("Line", "Line desc", R.drawable.line))
        list.add(Model("WhatsApp", "WhatsApp desc", R.drawable.wa))
        list.add(Model("Youtube", "Youtube desc", R.drawable.yt))
        list.add(Model("Spotify", "Spotify desc", R.drawable.spotify))
        list.add(Model("iTunes", "iTunes desc", R.drawable.itunes))

        listview.adapter = MyAdapter(this, R.layout.activity_detail, list)

        listview.setOnItemClickListener { parent: AdapterView<*>, view: View, position:Int, id:Long ->
            if (position == 0){
                Toast.makeText(this,"You Click On Facebook", Toast.LENGTH_SHORT).show()
            }
            if (position == 1){
                Toast.makeText(this,"You Click On Twitter", Toast.LENGTH_SHORT).show()
            }
            if (position == 2){
                Toast.makeText(this,"You Click On Instagram", Toast.LENGTH_SHORT).show()
            }
            if (position == 3){
                Toast.makeText(this,"You Click On Tinder", Toast.LENGTH_SHORT).show()
            }
            if (position == 4){
                Toast.makeText(this,"You Click On WeChatt", Toast.LENGTH_SHORT).show()
            }
            if (position == 5){
                Toast.makeText(this,"You Click On Line", Toast.LENGTH_SHORT).show()
            }
            if (position == 6){
                Toast.makeText(this,"You Click On WhatsApp", Toast.LENGTH_SHORT).show()
            }
            if (position == 7){
                Toast.makeText(this,"You Click On Youtube", Toast.LENGTH_SHORT).show()
            }
            if (position == 8){
                Toast.makeText(this,"You Click On Spotify", Toast.LENGTH_SHORT).show()
            }
            if (position == 9){
                Toast.makeText(this,"You Click On iTunes", Toast.LENGTH_SHORT).show()
            }

        }

    }
}
