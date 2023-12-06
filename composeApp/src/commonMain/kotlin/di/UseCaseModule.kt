package di

import domain.usecase.GetAllHeroesUseCase
import domain.usecase.GetDetailHeroUseCase
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val useCaseModule = module {
    singleOf(::GetAllHeroesUseCase)
    singleOf(::GetDetailHeroUseCase)
}
