package com.gmail.name.domain.usecases

import com.gmail.name.domain.repositories.StudentRepository

class DeleteStudentUseCase(private val studentRepository: StudentRepository) : BaseUseCase() {

    fun delete(studentId: String) : Boolean {
        return studentRepository.delete(studentId)
    }
}