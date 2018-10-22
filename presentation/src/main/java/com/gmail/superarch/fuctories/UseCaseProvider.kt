package com.gmail.superarch.fuctories

import com.gmail.name.data.repositories.StudentRepositoryImpl
import com.gmail.name.domain.usecases.GetStudentsUseCase
import com.gmail.name.domain.usecases.SearchStudentsUseCase

object UseCaseProvider {

    fun provideGetStudentUseCase() : GetStudentsUseCase {

        //Берем репозиторий из data слоя (репозиторий имплементирует интерфейс который
        // находится в domain слое)
        val repository = StudentRepositoryImpl()

        // создаем useCase и передаем в коструктор созданный репозиторий(который
        // находится в data слое, но domain не знает что репозиторий из data слоя)
        val useCase = GetStudentsUseCase(repository)

        return useCase
    }

    fun provideSearchStudentUseCase() : SearchStudentsUseCase {

        return SearchStudentsUseCase(StudentRepositoryImpl())
    }
}