package hu.myfridzs.myfridzs.rest

import hu.myfridzs.myfridzs.model.Food
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class FridgeApiImpl : FridgeApi
{
    override fun getFoods() = ResponseEntity.ok(listOf(Food(1, "sajt"), Food(2, "kenyér")))
}