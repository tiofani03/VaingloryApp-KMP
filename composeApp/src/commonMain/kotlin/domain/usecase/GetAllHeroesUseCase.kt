package domain.usecase

import domain.HeroRepository

class GetAllHeroesUseCase(private val heroRepository: HeroRepository) {
    operator fun invoke() = heroRepository.getAllHeroes()
}
