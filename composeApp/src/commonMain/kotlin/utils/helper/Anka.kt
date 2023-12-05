package utils.helper

import utils.helper.ATTACK_TYPE.MELEE
import data.model.Hero
import data.model.PowerStatus
import data.model.SkillStatus
import data.model.SkinStatus

val anka = Hero(
    id = 3,
    name = "Anka",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/anka.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2018/07/AnkaActive.png",
    desc = "An elusive and bursty assassin who strikes with a flurry of blades",
    power = listOf(
        PowerStatus("Health", 2301.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 64.0, Constants.MAX_ARMOR),
        PowerStatus("Attack", 159.0, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 36.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.ASSASSIN,
    attackType = MELEE,
    position = POSITION.LANE,
    skills = listOf(
        SkillStatus(
            skillName = "Gythian Promise (Perk)",
            skillDesc = "After a short cooldown, Anka’s next basic attack on an enemy hero becomes Execute Strike, dealing bonus crystal damage equal to a percentage of the target’s missing health. Additionally, Anka fully refreshes Execute Strike and Shimmer Blade upon getting a hero kill or assist.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2018/07/Blade_sized_icons_Perk.jpg",
        ), SkillStatus(
            skillName = "Shimmer Blade",
            skillDesc = "Anka throws a dagger in the target direction, dealing damage to the first enemy hit. When the dagger hits an enemy, Anka can reactivate the ability within a short duration to blink next to the victim.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2018/07/Blade_sized_icons_A1.png",
        ), SkillStatus(
            skillName = "Dance Of Blades",
            skillDesc = "Anka throws five knives in a cone, dealing damage to all enemies the knives pass through. Each additional knife after the first deals damage equal to [ExtraHitModifier] of the initial damage.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2018/07/Blade_sized_icons_B.jpg",
        ), SkillStatus(
            skillName = "Mirage",
            skillDesc = "Anka dashes in the target direction as she splits off three clones, becoming invulnerable during the dash and dealing damage to enemies she and the clones dash through. Her clones dash back to her momentarily afterwards, dealing damage to all enemies in their way.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2018/07/Blade_sized_icons_C.jpg",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://cn.vainglorygame.com/wp-content/uploads/2018/07/1000x500_Anka.jpg"
        ),
        SkinStatus(
            skinName = "Feathered Anka (E)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2019/02/Anka_Feathered_Splash-1000x563.png",
            skinType = SKIN.EPIC,
        ),
    )
)
