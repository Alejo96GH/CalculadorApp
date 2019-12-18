package com.example.calculadorapp

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_calculadora.*


class CambioActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        var conteo :String = ""
        var conteoaux :String = ""
        var acumulador : Float  = 0.0F
        var aux1 : Float  = 0.0F
        var aux2 : String  = ""
        var bandera = 0

        bt_limpiar.setOnClickListener{
            conteo = ""
            conteoaux = ""
            acumulador = 0.0F
            aux2 = ""
            aux1 = 0.0F
            bandera = 0
            tv_resultadoc.text = conteo
        }


        bt_mas.setOnClickListener {
            if (bandera==1){
                Toast.makeText( this, "Debe oprimir un numero", Toast.LENGTH_SHORT).show()
            }
            else {
                conteo += " " + "+" + " "
                tv_resultadoc.text = conteo
                aux1 = conteoaux.toFloat()

                when (aux2) {
                    "" -> {
                        acumulador = aux1
                    }
                    "suma" -> {
                        acumulador += aux1
                    }
                    "resta" -> {
                        acumulador -= aux1
                    }
                    "mul" -> {
                        acumulador *= aux1
                    }
                    "div" -> {
                        acumulador /= aux1
                    }
                }

                conteoaux = ""
                aux2 = "suma"
                bandera = 1
            }
        }

        bt_menos.setOnClickListener {
            if (bandera==1){
                Toast.makeText( this, "Debe oprimir un numero", Toast.LENGTH_SHORT).show()
            }
            else {
                conteo += " " + "-" + " "
                tv_resultadoc.text = conteo
                aux1 = conteoaux.toFloat()

                when (aux2) {
                    "" -> {
                        acumulador = aux1
                    }
                    "suma" -> {
                        acumulador += aux1
                    }
                    "resta" -> {
                        acumulador -= aux1
                    }
                    "mul" -> {
                        acumulador *= aux1
                    }
                    "div" -> {
                        acumulador /= aux1
                    }
                }

                conteoaux = ""
                aux2 = "resta"
                bandera = 1
            }

        }
        bt_mul.setOnClickListener {
            if (bandera==1){
                Toast.makeText( this, "Debe oprimir un numero", Toast.LENGTH_SHORT).show()
            }
            else {
                conteo += " " + "*" + " "
                tv_resultadoc.text = conteo
                aux1 = conteoaux.toFloat()

                when (aux2) {
                    "" -> {
                        acumulador = aux1
                    }
                    "suma" -> {
                        acumulador += aux1
                    }
                    "resta" -> {
                        acumulador -= aux1
                    }
                    "mul" -> {
                        acumulador *= aux1
                    }
                    "div" -> {
                        acumulador /= aux1
                    }
                }

                conteoaux = ""
                aux2 = "mul"
                bandera = 1
            }

        }
        bt_div.setOnClickListener {
            if (bandera==1){
                Toast.makeText( this, "Debe oprimir un numero", Toast.LENGTH_SHORT).show()
            }
            else {
                conteo += " " + "/" + " "
                tv_resultadoc.text = conteo
                aux1 = conteoaux.toFloat()

                when (aux2) {
                    "" -> {
                        acumulador = aux1
                    }
                    "suma" -> {
                        acumulador += aux1
                    }
                    "resta" -> {
                        acumulador -= aux1
                    }
                    "mul" -> {
                        acumulador *= aux1
                    }
                    "div" -> {
                        acumulador /= aux1
                    }
                }

                conteoaux = ""
                aux2 = "div"
                bandera = 1
            }

        }


        bt_igual.setOnClickListener {
            if (bandera==1){
                Toast.makeText( this, "Debe oprimir un numero", Toast.LENGTH_SHORT).show()
            }
            else {

                aux1 = conteoaux.toFloat()

                when (aux2) {
                    "" -> {
                        acumulador = aux1
                    }
                    "suma" -> {
                        acumulador += aux1
                    }
                    "resta" -> {
                        acumulador -= aux1
                    }
                    "mul" -> {
                        acumulador *= aux1
                    }
                    "div" -> {
                        acumulador /= aux1
                    }
                }

                conteoaux = acumulador.toString()
                conteo = acumulador.toString()
                aux2 = ""
                tv_resultadoc.text = acumulador.toString()
                acumulador = 0.0F
                bandera = 0
            }
        }




        bt_punto.setOnClickListener {
            conteo += "."
            conteoaux += "."
            tv_resultadoc.text = conteo
            bandera = 0
        }

        bt_cero.setOnClickListener {
            conteo += "0"
            conteoaux += "0"
            tv_resultadoc.text = conteo
            bandera = 0
        }
        bt_uno.setOnClickListener {
            conteo += "1"
            conteoaux += "1"
            tv_resultadoc.text = conteo
            bandera = 0
        }
        bt_dos.setOnClickListener {
            conteo += "2"
            conteoaux += "2"
            tv_resultadoc.text = conteo
            bandera = 0
        }
        bt_tres.setOnClickListener {
            conteo += "3"
            conteoaux += "3"
            tv_resultadoc.text = conteo
            bandera = 0
        }
        bt_cuatro.setOnClickListener {
            conteo += "4"
            conteoaux += "4"
            tv_resultadoc.text = conteo
            bandera = 0
        }
        bt_cinco.setOnClickListener {
            conteo += "5"
            conteoaux += "5"
            tv_resultadoc.text = conteo
            bandera = 0
        }
        bt_seis.setOnClickListener {
            conteo += "6"
            conteoaux += "6"
            tv_resultadoc.text = conteo
            bandera = 0
        }
        bt_siete.setOnClickListener {
            conteo += "7"
            conteoaux += "7"
            tv_resultadoc.text = conteo
            bandera = 0
        }
        bt_ocho.setOnClickListener {
            conteo += "8"
            conteoaux += "8"
            tv_resultadoc.text = conteo
            bandera = 0
        }
        bt_nueve.setOnClickListener {
            conteo += "9"
            conteoaux += "9"
            tv_resultadoc.text = conteo
            bandera = 0
        }

    }
}