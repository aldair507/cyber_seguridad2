package com.example.basededatos.model

import android.os.Build.VERSION

class Constants {
    companion object{

        // sirve para constantres sean globales, todo lo que esta dentro de ahi se vuelve global

        const val NOM_DB="BdAdso"

        const val VERSION_BD= 5
        const val TABLA="create table ciudad(cod int,nombre text, codeDep int)"
        const val TABLA2="create table data(cod int, nombre text, apellido text, telefono int,direccion text, ciudad text)"
    }
}