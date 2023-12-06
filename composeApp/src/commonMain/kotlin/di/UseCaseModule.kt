package di

import domain.usecase.GetAllHeroesUseCase
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val useCaseModule = module {
    singleOf(::GetAllHeroesUseCase)
}
