package ui.home

import androidx.paging.cachedIn
import com.rickclephas.kmm.viewmodel.KMMViewModel
import com.rickclephas.kmm.viewmodel.coroutineScope
import domain.HeroRepository
import domain.usecase.GetAllHeroesUseCase

class HomeViewModel(
    getAllHeroesUseCase: GetAllHeroesUseCase,
    private val heroRepository: HeroRepository,
) : KMMViewModel() {
    val allHeroes = getAllHeroesUseCase().cachedIn(viewModelScope.coroutineScope)

    fun getDetailHeroes(heroId: Int) = heroRepository.getDetailHeroes(heroId)

    fun getAllHeroesSimple() = heroRepository.getAllHeroesList()
}
