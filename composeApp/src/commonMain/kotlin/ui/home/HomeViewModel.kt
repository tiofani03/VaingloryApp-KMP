package ui.home

import com.rickclephas.kmm.viewmodel.KMMViewModel
import domain.usecase.GetAllHeroesUseCase

class HomeViewModel(
    getAllHeroesUseCase: GetAllHeroesUseCase
) : KMMViewModel() {
    val allHeroes = getAllHeroesUseCase()
}
