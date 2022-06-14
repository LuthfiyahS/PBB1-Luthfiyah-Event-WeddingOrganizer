package com.uts201904024.uts201904024

object HeroesData {
    private val heroNames = arrayOf("Artotel Suites",
        "Rosepetal Backdrop",
        "Mini Celebration 5",
        "Holy Matrimony Package",
        "Galea Belangi Full Package",
        "Skenoo Hall Emporium",
        "Buffet Wedding Package",
        "Gold Intimate Wedding Package",
        "White Pearl Decoration",
        "Golden Ballroom Package",
        "Ruby Package",
        "Jade Package by The Sultan Hotel",
        "Kudus Hall Package",
        "Tulip Wedding Package",
        "Studio Wedding Package",
        "Royal Santrian Luxury Beach Villa",
        "Small Stage Wedding",
        "Novotel Catalina Flora",
        "Blessing Ceremony Package",
        "Peony Wedding Package"
    )

    private val heroPrice = arrayOf("IDR 155,000,000",
        "IDR 7,000,000",
        "IDR 12,000,000",
        "IDR 17,000,000",
        "IDR 250,000,000",
        "IDR 295,000,000",
        "IDR 160,000,000",
        "IDR 168,000,000",
        "IDR 90,000,000",
        "IDR 615,600,000",
        "IDR 380,000,000",
        "IDR 280,000,000",
        "IDR 207,000,000",
        "IDR 392,500,000",
        "IDR 75,000,000",
        "IDR 139,800,375",
        "IDR 65,000,000",
        "IDR 17,000,000",
        "IDR 22,000,000",
        "IDR 495,000,000",


    )

    private val heroDetails = arrayOf(" Wedding package di hotel ballroom dengan kapasitas 100pax",
        "Wedding package backcropnya saja 3 meter",
        "Full Wedding Stage Decoration 5 meter",
        "Wedding package di ballroom dengan kapasitas 20pax",
        "Wedding package di Villa / Resort dengan kapasitas 500pax.",
        "Wedding package di hotel ballroom dengan kapasitas 200pax",
        "Wedding package di function hall dengan kapasitas 200pax",
        "Wedding package di hotel ballroom dengan kapasitas 150pax",
        "Wedding Decoration dengan stage 12m  with set gazebo, and 1 pc hand bouquet",
        "Wedding package di hotel ballroom dengan kapasitas 800pax.",
        "Wedding package di function hall dengan kapasitas 600pax.",
        "Wedding package di hotel ballroom dengan kapasitas 400pax.",
        "Wedding package di aula dengan kapasitas 300pax.",
        "Wedding package di hotel ballroom dengan kapasitas 150pax.",
        "Wedding package di hotel ballroom dengan kapasitas 50pax.",
        "Wedding package di Villa / Resort dengan kapasitas 50pax.",
        "Dekorasi panggung pelaminan lapis karpet abu-abu (lebar 6-12meter), artificial flower",
        "Wedding package di hotel ballroom dengan kapasitas 50pax",
        "Wedding package di function hall dengan kapasitas 20pax",
        "Wedding package di function hall dengan kapasitas 1000pax"
         )

    private val heroesImages = intArrayOf(R.drawable.a,
        R.drawable.b,
        R.drawable.p,
        R.drawable.c,
        R.drawable.d,
        R.drawable.e,
        R.drawable.f,
        R.drawable.g,
        R.drawable.h,
        R.drawable.i,
        R.drawable.j,
        R.drawable.k,
        R.drawable.l,
        R.drawable.m,
        R.drawable.n,
        R.drawable.o,
        R.drawable.q,
        R.drawable.r,
        R.drawable.s,
        R.drawable.t
    )

    val listData:ArrayList<Hero>
        get() {
            val list = arrayListOf<Hero>()
            for (position in heroNames.indices){
                val hero = Hero()
                hero.name = heroNames[position]
                hero.price = heroPrice[position]
                hero.detail = heroDetails[position]
                hero.photo = heroesImages[position]
                list.add((hero))
            }
            return list
        }
}
