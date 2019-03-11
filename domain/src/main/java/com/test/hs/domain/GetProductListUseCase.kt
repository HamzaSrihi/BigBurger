package com.test.hs.domain

import com.test.hs.data.Repository.ProductRepository
import io.reactivex.Scheduler
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by hamza on 08/03/2019.
 */
class GetProductListUseCase  @Inject constructor(private val productsRepository: ProductRepository,
                                                 subscribeScheduler: Scheduler,
                                                 postExecutionScheduler: Scheduler) : UseCase<List<Product>, Unit>(subscribeScheduler, postExecutionScheduler) {

    override fun buildUseCaseSingle(params: Unit?): Single<List<Product>> = productsRepository.products()
            .map {
                it.map { Product(it.id, it.title, it.description, it.thumbnail, it.price) }
            }
}