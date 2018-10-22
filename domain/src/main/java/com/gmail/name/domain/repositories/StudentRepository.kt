package com.gmail.name.domain.repositories

import com.gmail.name.domain.entity.Student
import com.gmail.name.domain.entity.StudentSearch

interface StudentRepository : BaseRepository {

    fun get() : List<Student>

    fun search(search: StudentSearch) : List<Student>

    fun update(student: Student) : Boolean

    fun delete(studentId: String) : Boolean
}