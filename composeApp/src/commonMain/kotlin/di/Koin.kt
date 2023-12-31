package di

import kotlinx.coroutines.Dispatchers
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun initKoin(appDeclaration: KoinAppDeclaration = {}) = startKoin {
    appDeclaration()
    modules(
        networkModule,
        repositoryModule,
        useCaseModule,
        viewModelModule,
        dispatcherModule,
    )
}

val dispatcherModule = module {
    factory { Dispatchers.Default }
}

fun initKoin() = initKoin {}
