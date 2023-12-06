package di

import data.repo.HeroRepositoryImpl
import domain.HeroRepository
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val repositoryModule = module {
    singleOf(::HeroRepositoryImpl) { bind<HeroRepository>() }
}
