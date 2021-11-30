package com.example.module25.data

import com.example.module25.R
import com.example.module25.domain.Film

class MainRepository {
    val filmsDataBase = listOf(
        Film("Мстители: Финал ",
            R.drawable.film1, "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",5.3f),
        Film("Война будущего",
            R.drawable.film2,"A family man is drafted to fight in a future war where the fate of humanity relies on his ability to confront the past.",4.4f),
        Film("Человек-паук: Возвращение домой",
            R.drawable.film3,"Peter Parker balances his life as an ordinary high school student in Queens with his superhero alter-ego Spider-Man, and finds himself on the trail of a new menace prowling the skies of New York City.",8.2f),
        Film("Белый лотос",
            R.drawable.film4,"Set in a tropical resort, it follows the exploits of various guests and employees over the span of a week.",6.9f),
        Film("Круиз по джунглям",
            R.drawable.film5,"Based on Disneyland's theme park ride where a small riverboat takes a group of travelers through a jungle filled with dangerous animals and reptiles but with a supernatural element.",7.7f),
        Film("AQUAMEN",
            R.drawable.film6,"Arthur Curry, the human-born heir to the underwater kingdom of Atlantis, goes on a quest to prevent a war between the worlds of ocean and land.",3.9f),
        Film("Лука",
            R.drawable.film7,"On the Italian Riviera, an unlikely but strong friendship grows between a human being and a sea monster disguised as a human.",5.0f)
    )

}