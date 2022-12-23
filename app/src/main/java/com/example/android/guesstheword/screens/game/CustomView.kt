package com.example.android.guesstheword.screens.game

import android.content.Context
import android.graphics.Paint
import android.graphics.Point
import android.graphics.PointF
import android.graphics.Typeface
import java.time.format.DecimalStyle
import java.util.jar.Attributes


class DiaView @JvmOverloads constructor(
    context: Context,
    attributes: Attributes,
    defStyle: Int = 0
) {
    private var ridius = 0.0f
    private var fanSpeed = FanSpeed.OFF
    //position variable whihc will be used to draw lable and indicator circle
    private val pointPosition : PointF = PointF(0.0f,0.0f)

    private  val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        textAlign = Paint.Align.CENTER
        textSize = 55.0f
        typeface = Typeface.create("",Typeface.BOLD)
    }
}

private  enum class FanSpeed(val label :Int){
    OFF(0),
    LOW(1),
    MEDIEM(2),
    HIGH(3)
}
private const val radius_offset_label = 30
private const val radius_offset_indecator = -35
