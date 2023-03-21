package com.example.ussd

object MyData {
    val listTarif = ArrayList<MyTemplate>()
    val listDaqiqa = ArrayList<MyTemplate>()
    val listXizmat = ArrayList<MyTemplate>()
    val listInternet = ArrayList<MyTemplate>()
    val listSms = ArrayList<MyTemplate>()

    fun addTemplate(){
        listDaqiqa.add(MyTemplate("50 daqiqa","*111*1*1*5","500 so'm","Bir oyga beriladi"))
        listDaqiqa.add(MyTemplate("60 daqiqa","*111*1*1*6","1500 so'm","Bir oyga beriladi"))
        listDaqiqa.add(MyTemplate("70 daqiqa","*111*1*1*7","2000 so'm","Bir oyga beriladi"))
        listDaqiqa.add(MyTemplate("80 daqiqa","*111*1*1*8","2500 so'm","Bir oyga beriladi"))
        listDaqiqa.add(MyTemplate("90 daqiqa","*111*1*1*9","3000 so'm","Bir oyga beriladi"))

        listTarif.add(MyTemplate("Zo'r 7","*1*2*7#","20000 so'm","Bir oyga beriladi"))
        listTarif.add(MyTemplate("Zo'r 8","*1*2*8#","25000 so'm","Bir oyga beriladi"))
        listTarif.add(MyTemplate("Zo'r 9","*1*2*9#","30000 so'm","Bir oyga beriladi"))
        listTarif.add(MyTemplate("Zo'r 10","*1*2*10#","350000 so'm","Bir oyga beriladi"))
        listTarif.add(MyTemplate("Zo'r 11","*1*2*11#","40000 so'm","Bir oyga beriladi"))

        listXizmat.add(MyTemplate("Mening raqamlarim","*100#","bepul","ixtiyoriy"))
        listXizmat.add(MyTemplate("Mening daqiqalarim","*101#","bepul","Bir oyga beriladi"))
        listXizmat.add(MyTemplate("Mening megabaytlarim","*102#","bepul","Bir oyga beriladi"))
        listXizmat.add(MyTemplate("Mening gigabaytlarim","*103#","bepul","Bir oyga beriladi"))
        listXizmat.add(MyTemplate("Mening do'stlarim","*104#","bepul","Bir oyga beriladi"))

        listInternet.add(MyTemplate("paket 500 mb","*111*5*5#","5000 so'm","Majburiy"))
        listInternet.add(MyTemplate("paket 1000 mb","*111*5*6#","10000 so'm","Bir oyga beriladi"))
        listInternet.add(MyTemplate("paket 1500 mb","*111*5*7#","15000 so'm","Bir oyga beriladi"))
        listInternet.add(MyTemplate("paket 2000 mb","*111*5*8#","2000 so'm","Bir oyga beriladi"))
        listInternet.add(MyTemplate("paket 2500 mb","*111*5*9#","25000 so'm","Bir oyga beriladi"))

        listSms.add(MyTemplate("SMS cheksiz","*7#","bepul","majbursiz"))
        listSms.add(MyTemplate("SMS 100 ta","*8#","10000","Bir oyga beriladi"))
        listSms.add(MyTemplate("SMS 200 ta","*9#","20000","Bir oyga beriladi"))
        listSms.add(MyTemplate("SMS 400 ta","*11#","30000","Bir oyga beriladi"))
        listSms.add(MyTemplate("SMS 300 ta","*10#","40000","Bir oyga beriladi"))
        listSms.add(MyTemplate("SMS 500 ta","*12#","50000","Bir oyga beriladi"))
    }
}