package data.model

import kotlinx.serialization.Serializable


@Serializable
data class Hero(
    val id: Int,
    val name: String,
    val image: String,
    val imageBackground: String,
    val desc: String,
    val power: List<PowerStatus>,
    val role: String,
    val attackType: String,
    val position: String,
    val skills: List<SkillStatus>,
    val skins: List<SkinStatus>,
)

@Serializable
data class PowerStatus(
    val name: String,
    val currentValue: Double,
    val maxValue: Double,
)

@Serializable
data class SkillStatus(
    val skillName: String,
    val skillDesc: String,
    val skillImage: String,
)

@Serializable
data class SkinStatus(
    val skinName: String,
    val skinImage: String,
    val skinType: String = "Default",
)
