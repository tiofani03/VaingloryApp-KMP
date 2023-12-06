package data.remote

import data.model.ApiResponse
import data.model.Hero
import io.ktor.client.HttpClient
import io.ktor.client.request.url
import io.ktor.http.HttpMethod
import utils.fetch

object HeroService {
    suspend fun HttpClient.getAllHeroes(
        page: Int = 1,
        limit: Int = 5,
        query: String? = null,
    ) = fetch<ApiResponse<List<Hero>>> {
        url("/vainglory/heroes?page=$page&limit=$limit")
        method = HttpMethod.Get
    }

    suspend fun HttpClient.getDetailHeroes(
        heroId: Int,
    ) = fetch<ApiResponse<Hero>> {
        url("/vainglory/heroes/$heroId")
        method = HttpMethod.Get
    }
}

