package com.gmail.name.data.repositories

import com.gmail.name.domain.entity.Student
import com.gmail.name.domain.entity.StudentSearch
import com.gmail.name.domain.repositories.StudentRepository

class StudentRepositoryImpl : StudentRepository {

    override fun get(): List<Student> {

        return listOf<Student>(
                Student("0", "Sergey", 25),
                Student("1", "Mihail", 35),
                Student("2", "Kate", 21),
                Student("3", "Vasy", 27),
                Student("4", "Andrey", 15),
                Student("5", "Ivan", 20))
    }

    override fun search(search: StudentSearch): List<Student> {

        return listOf<Student>(
                Student("0", "Sergey", 25),
                Student("1", "Mihail", 35))
    }

    override fun update(student: Student): Boolean {
        return true
    }

    override fun delete(studentId: String): Boolean {
        return true
    }
}