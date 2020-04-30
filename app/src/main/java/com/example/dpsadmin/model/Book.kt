package com.example.dpsadmin.model

import java.io.Serializable

data class Book(
    var bookName:String,
    var bookPrice:Int,
    var isChecked:Boolean
): Serializable
{
    constructor() : this("",0,false)
}