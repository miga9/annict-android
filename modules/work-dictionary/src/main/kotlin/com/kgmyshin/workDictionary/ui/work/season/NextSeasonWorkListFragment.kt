package com.kgmyshin.workDictionary.ui.work.popular

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kgmyshin.workDictionary.ui.work.ScreenTransition
import com.kgmyshin.workDictionary.ui.work.WorkListContract
import com.kgmyshin.workDictionary.ui.work.WorkListFragment
import com.kgmyshin.workDictionary.ui.work.WorkViewModel
import com.kgmyshin.workDictionary.ui.work.season.NextSeasonWorkListContract
import javax.inject.Inject

class NextSeasonWorkListFragment : WorkListFragment(), WorkListContract.View {

    companion object {
        fun newInstance() = NextSeasonWorkListFragment()
    }

    @Inject
    internal lateinit var presenter: NextSeasonWorkListContract.Presenter

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        // TODO: inject実装
        //        ContainerApplicationHelper.get(activity).getComponent(WorkDictionaryComponent::class).inject(this)
        val screenTransition = (context as? ScreenTransition) ?: throw ClassCastException("must cast ScreenTransition")
        presenter.setUp(
                this,
                screenTransition
        )
        presenter.onAttach()
    }

    override fun onCreateView(inflater: LayoutInflater?,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        presenter.onCreateView()
        return super.onCreateView(
                inflater,
                container,
                savedInstanceState
        )
    }

    override fun onDetach() {
        presenter.onDetach()
        super.onDetach()
    }

    override fun onClickWork(workViewModel: WorkViewModel) {
        presenter.onClickWork(workViewModel)
    }


}