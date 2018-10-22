package com.gmail.name.domain.usecases

import com.gmail.name.domain.entity.Student
import com.gmail.name.domain.repositories.StudentRepository

class UpdateStudentUseCase(private val studentRepository: StudentRepository) : BaseUseCase() {

    fun update(student: Student) : Boolean {
        return studentRepository.update(student)
    }
}