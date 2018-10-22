package com.gmail.name.domain.usecases

import com.gmail.name.domain.entity.Student
import com.gmail.name.domain.repositories.StudentRepository

class GetStudentsUseCase(private val studentRepository: StudentRepository) : BaseUseCase() {

    fun get() : List<Student> {
        return studentRepository.get()
    }
}
