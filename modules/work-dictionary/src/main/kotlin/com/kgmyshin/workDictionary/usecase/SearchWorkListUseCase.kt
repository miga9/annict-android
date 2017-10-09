package com.kgmyshin.workDictionary.usecase

import com.kgmyshin.workDictionary.domain.work.Work
import io.reactivex.Single

internal interface SearchWorkListUseCase {

    fun execute(keyword: String): Single<List<Work>>

}