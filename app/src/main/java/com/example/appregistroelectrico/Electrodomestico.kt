package com.example.appregistroelectrico

data class Electrodomestico (var nombre:String, val potencia: Int, val horas: Int, val conectado:String){
    fun getData():String{
        var info=""

        info+="Dispositivo: $nombre \n"
        info+="Potencia : $potencia W\n"
        info+="Horas de uso al dia: $horas \n"
        info+="Permanece conectado: $conectado \n"
        var gasto:Float=(potencia.toFloat()/1000)*30
        if(conectado=="true"){
            gasto += ((10 * gasto) / 100)
        }
        val gastoRound:Double = String.format("%.3f", gasto).toDouble()
        info+="Gasto al mes: $gastoRound Kwh\n\n\n"

        return info
    }
}