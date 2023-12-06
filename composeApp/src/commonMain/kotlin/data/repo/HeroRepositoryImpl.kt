package data.repo

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import data.model.Hero
import data.paging.ResultPagingSource
import data.remote.HeroService.getAllHeroes
import domain.HeroRepository
import io.ktor.client.HttpClient
import kotlinx.coroutines.flow.Flow
import utils.map

class HeroRepositoryImpl(
    private val heroService: HttpClient,
) : HeroRepository {
    override fun getAllHeroes(): Flow<PagingData<Hero>> {
        return Pager(
            config = PagingConfig(
                pageSize = 10,
                initialLoadSize = 10,
                enablePlaceholders = false,
            ),
            pagingSourceFactory = {
                ResultPagingSource { page, _ ->
                    heroService.getAllHeroes(page).map {
                        it.data.orEmpty()
                    }
                }
            }

        ).flow
    }
}
