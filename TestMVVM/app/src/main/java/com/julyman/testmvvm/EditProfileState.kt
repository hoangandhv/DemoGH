package com.julyman.testmvvm

data class EditProfileState (
    var isProgressIndicatorShown: Boolean = false,
    var isCityDialogShown: Boolean = false,
    var isGenderDialogShown: Boolean = false
)