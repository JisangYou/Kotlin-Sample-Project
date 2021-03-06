package com.example.rxkotlin


import com.example.rxkotlin.CoroutineCalculator.CoroutineCalculator
import com.example.rxkotlin.ReactiveCalculator.ReactiveCalculator
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Test
import kotlin.system.measureTimeMillis

class Coroutine {
    @Test
    fun test1() {
        runBlocking { // 4
            val exeTime = longRunningTsk() // 5
            println("Execution Time is $exeTime")
        }
    }

    private suspend fun longRunningTsk(): Long { // 1
        return measureTimeMillis { // 2
            println("Please wait")
            delay(2000L) // 3
            println("Delay Over")
        }
    }

    @Test
    fun test2() {
        CoroutineCalculator(2,3)
    }
}