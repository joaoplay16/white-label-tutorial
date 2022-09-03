package br.com.douglasmotta.whitelabeltutorial.config

import javax.inject.Inject

class ConfigImpl @Inject constructor(): Config {

    override val addButtonVisibility: Int = View.VISIBLE
}