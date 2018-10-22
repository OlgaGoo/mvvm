package com.gmail.name.domain.usecases

import com.gmail.name.domain.entity.Student
import com.gmail.name.domain.entity.StudentSearch
import com.gmail.name.domain.repositories.StudentRepository

class SearchStudentsUseCase(private val studentRepository: StudentRepository) : BaseUseCase() {

    fun search(searchStudent: StudentSearch) : List<Student> {
        return studentRepository.search(searchStudent)
    }
}