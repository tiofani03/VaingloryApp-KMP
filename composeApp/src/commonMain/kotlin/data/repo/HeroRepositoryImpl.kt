package data.repo

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import data.model.Hero
import data.paging.ResultPagingSource
import data.remote.HeroService.getAllHeroes
import data.remote.HeroService.getDetailHeroes
import domain.HeroRepository
import io.ktor.client.HttpClient
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import utils.map

class HeroRepositoryImpl(
    private val heroService: HttpClient,
) : HeroRepository {
    override fun getAllHeroes(): Flow<PagingData<Hero>> {
        return Pager(
            config = PagingConfig(
                pageSize = 5,
                initialLoadSize = 5,
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

    override fun getDetailHeroes(heroId: Int): Flow<Hero?> = flow {
        val res = heroService.getDetailHeroes(heroId)
        res.map {
            emit(it.data)
        }
    }

    override fun getAllHeroesList(): Flow<List<Hero>> = flow {
        val res = heroService.getAllHeroes(1, 15, "")
        res.map {
            emit(it.data ?: listOf())
        }
    }
}
