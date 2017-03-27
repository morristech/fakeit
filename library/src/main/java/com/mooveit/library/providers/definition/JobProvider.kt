package com.mooveit.library.providers.definition

interface JobProvider {

    fun title(): String
    fun field(): String
    fun keySkill(): String
}