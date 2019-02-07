package com.ricknout.rugbyranker.matches.work

import android.content.Context
import androidx.work.WorkerParameters
import com.ricknout.rugbyranker.matches.vo.MatchStatus
import com.ricknout.rugbyranker.core.vo.Sport
import com.ricknout.rugbyranker.matches.repository.MatchesRepository
import javax.inject.Inject

class MensCompleteWorldRugbyMatchesWorker @Inject constructor(
    context: Context,
    workerParams: WorkerParameters,
    matchesRepository: MatchesRepository
) : WorldRugbyMatchesWorker(context, workerParams, Sport.MENS, MatchStatus.COMPLETE, matchesRepository) {

    companion object {
        const val UNIQUE_WORK_NAME = "world_rugby_matches_worker_mens_complete"
    }
}
