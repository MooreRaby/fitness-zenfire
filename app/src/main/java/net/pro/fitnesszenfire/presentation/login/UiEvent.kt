package net.pro.fitnesszenfire.presentation.login

sealed class UiEvent {
    data class ShowSnackbar(val message: String) : UiEvent()
}