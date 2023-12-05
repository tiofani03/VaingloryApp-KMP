package utils.helper

import data.model.Hero
import data.model.PowerStatus
import data.model.SkillStatus
import data.model.SkinStatus

val adagio = Hero(
    id = 1,
    name = "Adagio",
    image = "https://firebasestorage.googleapis.com/v0/b/notess-c8095.appspot.com/o/heroes%2Fadagio%2Fadagio.png?alt=media&token=64c6f8c6-5fb2-4a64-8e4a-0dc22de75213",
    imageBackground = "https://firebasestorage.googleapis.com/v0/b/notess-c8095.appspot.com/o/heroes%2Fadagio%2FAdagioActive.png?alt=media&token=a1b11f28-cf1c-44ce-9484-9cb661465966",
    desc = "The master manipulator of large-scale battles, Adagio brings incredible teamfight presence with huge area-of-effect damage and team-saving abilities. He almost seems too good: He can heal. He can amplify damage. He can stun and nuke the entire enemy team ... but none of these can be achieved easily without team-wide coordination. Adagio is extremely flexible and can start as carry, jungler or captain.",
    power = listOf(
        PowerStatus("Health", 1654.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 86.0, Constants.MAX_ARMOR),
        PowerStatus("Attack", 117.9, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 32.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.PROTECTOR,
    attackType = ATTACK_TYPE.RANGED,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "Arcane Renewal (Perk)",
            skillDesc = "Whenever enemies burning with Arcane Fire take damage from any source, Adagio regenerates 35% of that damage as energy.",
            skillImage = "https://firebasestorage.googleapis.com/v0/b/notess-c8095.appspot.com/o/heroes%2Fadagio%2Fadagio_p.webp?alt=media&token=6a47631a-79f8-4a0e-893b-d7ed9c56e98f",
        ), SkillStatus(
            skillName = "Gift of Fire",
            skillDesc = "Adagio heals a target ally and splashes Arcane Fire onto nearby enemies, dealing damage every second. If Adagio targets himself, he'll also slow nearby enemies by 70% for 1.5 seconds.",
            skillImage = "https://firebasestorage.googleapis.com/v0/b/notess-c8095.appspot.com/o/heroes%2Fadagio%2Fadagio_a.webp?alt=media&token=6e02d464-b21c-411a-9734-9d31a10f05da",
        ), SkillStatus(
            skillName = "Agent of Wrath",
            skillDesc = "Temporarily empower target hero's basic attacks for either a fixed number of attacks or 6 seconds. The attacks deal increased damage to enemies afflicted by Arcane Fire, and also deal increased damage if Adagio casts this spell on himself. Resets basic attack cooldown on activation.",
            skillImage = "https://firebasestorage.googleapis.com/v0/b/notess-c8095.appspot.com/o/heroes%2Fadagio%2Fadagio_b.webp?alt=media&token=dd11a7ed-bf7d-4ccc-aa6d-d9990039e18a",
        ), SkillStatus(
            skillName = "Verse of Judgement",
            skillDesc = "Adagio channels for 2 seconds then deals heavy damage to all enemies in a wide, rune-marked ring around him. Enemies burning with Arcane Fire are also stunned. Adagio temporarily gains fortified health during channeling.",
            skillImage = "https://firebasestorage.googleapis.com/v0/b/notess-c8095.appspot.com/o/heroes%2Fadagio%2Fadagio_c.webp?alt=media&token=af763c32-6126-4b36-a308-3fc50396565c",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://firebasestorage.googleapis.com/v0/b/notess-c8095.appspot.com/o/heroes%2Fadagio%2Fadagio.png?alt=media&token=64c6f8c6-5fb2-4a64-8e4a-0dc22de75213"
        ),
        SkinStatus(
            skinName = "Parade Adagio (R)",
            skinImage = "https://firebasestorage.googleapis.com/v0/b/notess-c8095.appspot.com/o/heroes%2Fadagio%2FAdagioT1Flat.jpg?alt=media&token=d04437ed-ebad-49d7-bf72-17f43547d97e",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "Parade Adagio (E)",
            skinImage = "https://firebasestorage.googleapis.com/v0/b/notess-c8095.appspot.com/o/heroes%2Fadagio%2FAdagioT2Flat.jpg?alt=media&token=3203c57b-1d97-46f3-a292-208c39d6d350",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "Parade Adagio (L)",
            skinImage = "https://firebasestorage.googleapis.com/v0/b/notess-c8095.appspot.com/o/heroes%2Fadagio%2FAdagioT3Flat.jpg?alt=media&token=b5f4cbf3-66cf-48b3-aa5a-7cd806de353c",
            skinType = SKIN.LEGENDARY,
        ),
    )
)
