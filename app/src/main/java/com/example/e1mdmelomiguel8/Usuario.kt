package com.example.e1mdmelomiguel8

open class Usuario( usu:String,  pass:String){

    var usu: String = ""
        set(value) {
            field = if (value.isEmpty()) "empty" else value
        }
        get() {
            return field
        }

    var pass: String = ""
        set(value) {
            field = if (value.isEmpty()) "empty" else value
        }
        get() {
            return field
        }


    init {
        this.usu= usu
        this.pass = pass

    }

}