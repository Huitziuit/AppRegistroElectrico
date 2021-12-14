package com.example.appregistroelectrico

class Electrodomesticos {

    var total:Int=0;
    val list = mutableListOf<Electrodomestico>()

    fun add(electrodomestico: Electrodomestico){
        list.add(electrodomestico)
        total++
    }

    fun getElect(index: Int):Electrodomestico{
        return list[index]
    }

    fun delete(index: Int){
        if(index<=total) {
            list.removeAt(index - 1)
            total--
        }
    }

    fun update(index: Int, electrodomestico:Electrodomestico){
        if(index<=total){
            list[index-1]=electrodomestico
        }
    }
}