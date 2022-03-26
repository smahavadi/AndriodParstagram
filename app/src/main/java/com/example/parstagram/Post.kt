package com.example.parstagram

import com.parse.ParseClassName
import com.parse.ParseFile
import com.parse.ParseObject
import com.parse.ParseUser

// Description: String
// Image: File
// User: User
@ParseClassName("Post")
class Post: ParseObject () {

    // getter for description
    fun getDescription(): String? {
        return getString(KEY_DESCRIPTION)
    }

    // setter for description
    fun setDescription(description: String) {
        put(KEY_DESCRIPTION, description)
    }

    // getter for image
    fun getImage(): ParseFile? {
        return getParseFile(KEY_IMAGE)
    }

    // setter for image
    fun setImage(parsefile: ParseFile) {
        put(KEY_IMAGE, parsefile)
    }

    // getter for user
    fun getUser(): ParseUser? {
        return getParseUser(KEY_USER)
    }

    // setter for user
    fun setUser(user: ParseUser) {
        put(KEY_USER, user)
    }

    companion object {
        const val KEY_DESCRIPTION = "description"
        const val KEY_IMAGE = "image"
        const val KEY_USER = "user"
    }

}