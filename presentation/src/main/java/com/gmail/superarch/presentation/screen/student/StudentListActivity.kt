package com.gmail.superarch.presentation.screen.student

import android.arch.lifecycle.ViewModelProviders
import com.gmail.superarch.R
import com.gmail.superarch.databinding.ActivityStudentListBinding
import com.gmail.superarch.presentation.base.BaseMvvmActivity

class StudentListActivity : BaseMvvmActivity<
        StudentListViewModel,
        StudentRouter,
        ActivityStudentListBinding>() {

    override fun prodiveViewModel(): StudentListViewModel {
        return ViewModelProviders.of(this)
                .get(StudentListViewModel::class.java)
    }

    override fun provideRouter(): StudentRouter {
        return StudentRouter(this)
    }

    override fun provideLayoutId(): Int = R.layout.activity_student_list

    // Это просто для примера как слушать изменения в переменных
    // viewModel
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        viewModel.testText.addOnPropertyChangedCallback(object : Observable.OnPropertyChangedCallback() {
//            override fun onPropertyChanged(sender: Observable?, propertyId: Int) {
//            }
//        })
//    }

}