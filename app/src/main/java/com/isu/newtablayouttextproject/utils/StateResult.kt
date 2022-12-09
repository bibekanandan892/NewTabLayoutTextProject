package com.isu.newtablayouttextproject.utils

sealed class StateResult<T> (val data: T?=null,val message: String?=null) {
    class Ideal<T> : StateResult<T>()
    class Success<T>(data: T): StateResult<T>(data)
    class Error<T>(message: String?=null,data: T?=null): StateResult<T>(data, message)
    class Loading<T> : StateResult<T>()
}
