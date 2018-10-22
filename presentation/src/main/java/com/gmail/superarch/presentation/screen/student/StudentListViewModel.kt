package com.gmail.superarch.presentation.screen.student

import android.databinding.ObservableField
import android.util.Log
import com.gmail.superarch.fuctories.UseCaseProvider
import com.gmail.superarch.presentation.base.BaseViewModel

class StudentListViewModel() : BaseViewModel<StudentRouter>() {

    private val getStudentUseCase = UseCaseProvider.provideGetStudentUseCase()
    private val searchStudentsUseCase = UseCaseProvider.provideSearchStudentUseCase()

    val studentSize = ObservableField<String>("No data")

    init {
        Log.e("AAA", "init()")

        val listStudents = getStudentUseCase.get()
        studentSize.set("sudentList.size() = ${listStudents.size}")
    }

    override fun onCleared() {
        Log.e("AAA", "onCleared()")
    }
}