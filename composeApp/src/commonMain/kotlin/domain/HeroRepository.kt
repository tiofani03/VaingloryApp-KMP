package domain

import androidx.paging.PagingData
import data.model.Hero
import kotlinx.coroutines.flow.Flow

interface HeroRepository {
    fun getAllHeroes(): Flow<PagingData<Hero>>

    fun getDetailHeroes(heroId: Int): Flow<Hero?>

    fun getAllHeroesList(): Flow<List<Hero>>
}
