package utils.helper

import data.model.Hero
import data.model.PowerStatus
import data.model.SkillStatus
import data.model.SkinStatus

val alpha = Hero(
    id = 2,
    name = "Alpha",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/alpha.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/AlphaActive.png",
    desc = "Alpha hunts and terminates her targets with ruthless precision. No longer bound to the rules of mortality, she engages in battle without fear or caution. Alpha performs well in the jungle and can take down her targets built either weapon or crystal.",
    power = listOf(
        PowerStatus("Health", 1925.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 86.0, Constants.MAX_ARMOR),
        PowerStatus("Attack", 138.0, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 34.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.WARRIOR,
    attackType = ATTACK_TYPE.MELEE,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "Infinite Reboot (Perk)",
            skillDesc = "Instead of dying, Alpha initiates a reboot sequence upon receiving lethal damage, gaining 200-1750 reserve health (based on level). For the next several seconds, enemies can continue to attack her and deal damage. If her reserve is not destroyed during this time, she will reboot to ample health at the same location.\n" +
                    "\n" +
                    "The cooldown for this ability is displayed in place of Alpha's energy bar. Once this bar is full, Infinite Reboot is available. This bar will slide back to zero during the reboot process, indicating the remaining time left before she is restored to health.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/04/Alpha-Icon_Perk.jpg",
        ), SkillStatus(
            skillName = "Prime Directive",
            skillDesc = "Alpha scans for enemies along a path. If she scans an enemy, that enemy is slowed and Alpha instantly dashes behind them, dealing damage to the target and all enemies within 4.5 meters (65% damage to minions). This also removes the negative effects of Core Overload (without removing the positive effects), dealing increased damage based on the number of stacks removed.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/04/Alpha-Icon_A.jpg",
        ), SkillStatus(
            skillName = "Core Charge",
            skillDesc = "Alpha lunges forward, landing a basic attack on her target and fracturing the ground for additional crystal damage in a small area. Each time she uses this ability, she spends 10% of her current health and gains Core Overload for 5.5 seconds, stacking up to 3 times.\n" +
                    "\n" +
                    "Basic attacks reduces the cooldown of Core Charge by 1 second.\n" +
                    "\n" +
                    "Core Overload: Alpha loses 1% of her current health every second, but also increases the damage of subsequent Core Charges and causes her basic attacks to heal her. Basic attacks refresh the duration.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/04/Alpha-Icon_B.jpg",
        ), SkillStatus(
            skillName = "Termination Protocol",
            skillDesc = "On activation, Alpha begins a self destruct sequence. At the start of this she gains a burst of move speed as well as 400-1000 barrier (based on her level). Immediately afterward, she rapidly loses move speed as her Halcyon core approaches critical mass.\n" +
                    "\n" +
                    "After 3 seconds, or immediately upon her barrier being breached, Alpha explodes. This explosion deals heavy crystal damage to all enemies within 4.5 meters and is lethal to herself.\n" +
                    "\n" +
                    "This ability can only be activated while Infinite Reboot is available. Upgrading this ability reduces the cooldown of Infinite Reboot.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/04/Alpha-Icon_C.jpg",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://i.ytimg.com/vi/bZOG2BzWE2o/maxresdefault.jpg"
        ),
        SkinStatus(
            skinName = "'Broken Doll' Alpha (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2016/04/alpha_horrorT1-web.png",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "'Broken Doll' Alpha (E)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2016/04/Alpha_horrorT2-web.png",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "'Broken Doll' Alpha (L)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2016/04/Alpha_horrorT3-web.png",
            skinType = SKIN.LEGENDARY,
        ),
    )
)
