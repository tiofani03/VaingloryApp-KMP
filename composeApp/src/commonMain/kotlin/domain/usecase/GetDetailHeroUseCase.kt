package domain.usecase

import domain.HeroRepository

class GetDetailHeroUseCase(private val heroRepository: HeroRepository) {
    operator fun invoke(heroId: Int) = heroRepository.getDetailHeroes(heroId)
}
