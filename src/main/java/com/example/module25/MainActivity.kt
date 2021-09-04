package com.example.module25

import FilmListRecyclerAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import android.content.res.Resources
import android.graphics.Rect
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initNavigation()
        //Запускаем фрагмент при старте
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_placeholder, HomeFragment())
            .addToBackStack(null)
            .commit()

    }

    override fun onBackPressed() {
        super.onBackPressed()
        if (supportFragmentManager.getBackStackEntryCount() == 0) {
            AlertDialog.Builder(this)
                .setTitle("Вы хотите выйти?")
                .setIcon(R.drawable.ic_share)
                .setPositiveButton("Да") { _, _ ->
                    finish()
                }
                .setNegativeButton("Нет") { _, _ ->

                }
                .show()
        }
    }

    fun launchDetailsFragment(film: Film) {
        //Создаем "посылку"
        val bundle = Bundle()
        //Кладем наш фильм в "посылку"
        bundle.putParcelable("film", film)
        //Кладем фрагмент с деталями в перменную
        val fragment = DetailsFragment()
        //Прикрепляем нашу "посылку" к фрагменту
        fragment.arguments = bundle

        //Запускаем фрагмент
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_placeholder, fragment)
            .addToBackStack(null)
            .commit()
    }

    fun initNavigation() {
        topAppBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.settings -> {
                    Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

        bottom_navigation.setOnNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.favorites -> {
                    Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.watch_later -> {
                    Toast.makeText(this, "Посмотреть похже", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.selections -> {
                    Toast.makeText(this, "Подборки", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }
}
