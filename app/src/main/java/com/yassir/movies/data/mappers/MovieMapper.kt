package com.yassir.movies.data.mappers


import com.yassir.movies.data.local.entity.MovieEntity
import com.yassir.movies.data.remote.dto.MovieResponse
import com.yassir.movies.data.remote.dto.Movie
import com.yassir.movies.domain.models.movieModel.MovieModel
import javax.inject.Inject


class MovieMapper @Inject
constructor(): EntityMapper<MovieEntity, MovieModel> {

    override fun mapFromEntity(entity: MovieEntity): MovieModel {
        return MovieModel(
           id = entity.id,
         description = entity.description,
         title = entity.title,
         date = entity.date,
         image = entity.image,
        )
    }

    override fun mapToEntity(model: MovieModel): MovieEntity {
        return MovieEntity(
            id = model.id,
            description = model.description,
            title = model.title,
            date = model.date,
            image = model.image,
        )
    }

    fun fromEntityList(initial: MutableList<MovieEntity>): MutableList<MovieModel>{
        return initial.map { mapFromEntity(it) }.toMutableList()
    }

    fun toEntityList(initial: MutableList<MovieModel>): MutableList<MovieEntity>{
        return initial.map { mapToEntity(it) }.toMutableList()
    }




     fun mapFromDto(response: Movie): MovieModel {
        return MovieModel(
            id = response.id,
            description = response.overview,
            title = response.title,
            date = response.release,
            image = response.poster,
        )
    }

     fun mapToDto(model: MovieModel): Movie {
        return Movie(
            id = model.id,
            overview = model.description,
            title = model.title,
            release = model.date,
            poster = model.image,
        )
    }

    fun fromDtoList(initial: MovieResponse): MutableList<MovieModel>{
        return initial.movies.map { mapFromDto(it) }.toMutableList()
    }

    fun toDtoList(initial: MutableList<MovieModel>): MutableList<Movie>{
        return initial.map { mapToDto(it) }.toMutableList()
    }



}