package rs.raf.vezbe11.presentation.view.states

import rs.raf.vezbe11.data.models.MealCategoryResponse
import rs.raf.vezbe11.data.models.MealResponse

sealed class MealState{
    object Loading: MealState()
    object DataFetched: MealState()
    data class Success(val meals: List<MealResponse>): MealState()
    data class Error(val message: String): MealState()
}
