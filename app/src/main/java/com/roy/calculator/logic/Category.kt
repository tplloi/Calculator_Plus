package com.roy.calculator.logic

import androidx.annotation.DrawableRes
import com.roy.calculator.R

sealed class Category(val factor: Double, val name: String, @DrawableRes val res: Int? = null) {
    object ACCELERATION : Category(
        factor = 1.0E0,
        name = "Acceleration",
        res = R.drawable.icon_acceleration
    )

    object ANGLE : Category(
        factor = 1.0,
        name = "Angle",
        res = R.drawable.ic_baseline_architecture_24
    )

    object AREA : Category(factor = 1.0, name = "Area", res = R.drawable.ic_outline_area_chart_24)
    object CSS : Category(factor = 1.0, name = "CSS Units", res = R.drawable.ic_baseline_css_24)
    object CURRENT : Category(factor = 1.0, name = "Current", res = R.drawable.ic_drawable_current)
    object DATA : Category(factor = 1.0, name = "Data", res = R.drawable.ic_baseline_data_object_24)
    object ELECTRIC : Category(
        factor = 1.6022E-19,
        name = "Electric charge",
        res = R.drawable.ic_drawable_electric
    )

    object ENERGY : Category(
        factor = 1.0E0,
        name = "Energy",
        res = R.drawable.ic_baseline_electric_bolt_24
    )

    object FORCE : Category(factor = 1.0, name = "Force")

    object RATE : Category(factor = 1.0, name = "Rate app")
    object MORE : Category(factor = 1.0, name = "More app")
    object SHARE : Category(factor = 1.0, name = "Share app")
    object POLICY : Category(factor = 1.0, name = "Policy")
    object GITHUB : Category(factor = 1.0, name = "Github")
    object LENGTH : Category(factor = 1.0, name = "Length", res = R.drawable.icon_length)
    object LUMINANCE : Category(factor = 1.0, name = "Luminance")
    object LUMINOUS_FLUX : Category(factor = 1.0, name = "Luminous flux")
    object MASS : Category(factor = 1.0E-6, name = "Mass", res = R.drawable.icon_weight)
    object PRESSURE : Category(
        factor = 1.0E0,
        name = "Pressure",
        res = R.drawable.ic_baseline_compress_24
    )

    object SPEED : Category(factor = 1.0E0, name = "Speed", res = R.drawable.ic_baseline_speed_24)
    object TEMPERATURE_GRADIENT : Category(
        factor = 1.0,
        name = "Temperature gradient",
        res = R.drawable.icon_temperature
    )

    object TIME : Category(factor = 1.0, name = "Time", res = R.drawable.ic_drawable_time)
    object TORQUE : Category(factor = 1.0, name = "Torque")
    object VOLUME : Category(factor = 1.0E0, name = "Volume", res = R.drawable.icon_weight)
    object VOLTAGE : Category(
        factor = 1.0E0,
        name = "Voltage",
        res = R.drawable.ic_baseline_electrical_services_24
    )

    object WORK : Category(
        factor = 1.0E0,
        name = "Work",
        res = R.drawable.ic_baseline_work_outline_24
    )

    object BLOOD_GLUCOSE : Category(
        factor = 1.0,
        name = "Blood glucose",
        res = R.drawable.ic_baseline_bloodtype_24
    )

    object StandardCALCULATOR :
        Category(
            factor = 0.0,
            name = "Standard Calculator",
            res = R.drawable.ic_outline_calculate_24
        )

    object ScientificCALCULATOR :
        Category(
            factor = 0.0,
            name = "Scientific Calculator",
            res = R.drawable.ic_baseline_functions_24
        )

    object ProgrammerCALCULATOR :
        Category(factor = 0.0, name = "Programmer Calculator", res = R.drawable.ic_baseline_code_24)

    companion object {
        fun values(): Array<Category> {
            return arrayOf(
                LENGTH,
                ANGLE,
                AREA,
                CSS,
                CURRENT,
                ENERGY,
                DATA,
                ELECTRIC,
                MASS,
                PRESSURE,
                SPEED,
                TEMPERATURE_GRADIENT,
                TIME,
                VOLUME,
                VOLTAGE,
                WORK,
                BLOOD_GLUCOSE,
                ACCELERATION,
                TORQUE,
                LUMINOUS_FLUX,
                LUMINANCE,
                FORCE,
                RATE,
                MORE,
                SHARE,
                GITHUB,
                POLICY,
            )
        }

        fun calculators() = listOf(
            StandardCALCULATOR,
            ScientificCALCULATOR,
            ProgrammerCALCULATOR
        )
    }
}
