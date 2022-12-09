package com.isu.newtablayouttextproject.utils

import java.text.SimpleDateFormat

object Helper {

    var monthName = arrayOf("January", "February", "March", "April", "May", "June", "July",
        "August", "September", "October", "November",
        "December")
    private val quotaCodeToFullName = mapOf(
        "GN" to "General",
        "TQ" to "Tatkal",
        "PT" to "Premium Tatkal",
        "LD" to "Ladies",
        "SS" to "Lower Berth",
        "HP" to "Physically Handicapped",
        "HO" to "High official",
        "PH" to "Parliament House",
        "DF" to "Defence",
        "FT" to "Foreign Tourist",
        "DP" to "Duty Pass",
        "YU" to "Yuva"
    )
    private val fareClassCodeToFullForm = mapOf(
        "1A" to "AC 1 Tier (1A)",
        "2A" to "AC 2 Tier (2A)",
        "3A" to "AC 3 Tier (3A)",
        "3E" to "AC 3 Tier (3E)",
        "EC" to "Executive Chair (EC)",
        "2S" to "Sitting (2S)",
        "FC" to "First Class (FC)",
        "CC" to "AC Chair (CC)",
        "SL" to "Sleeper (SL)",
        "GN" to "Unreserved (GN)",


        )
    private val fareFullFormToClassCode = mapOf(
        "AC 1 Tier (1A)" to "1A",
        "AC 2 Tier (2A)" to "2A",
        "AC 3 Tier (3A)" to "3A",
        "AC 3 Tier (3E)" to "3E",
        "Executive Chair (EC)" to "EC",
        "Sitting (2S)" to "2S",
        "First Class (FC)" to "FC",
        "AC Chair (CC)" to "CC",
        "Sleeper (SL)" to "SL",
        "Unreserved (GN)" to "GN",
    )
    private val quotaFullNameToCode = mapOf(
        "General" to "GN",
        "Tatkal" to "TQ",
        "Premium Tatkal" to "PT",
        "Ladies" to "LD",
        "Lower Berth" to "SS",
        "Physically Handicapped" to "HP",
        "High official" to "HO",
        "Parliament House" to "PH",
        "Defence" to "DF",
        "Foreign Tourist" to "FT",
        "Duty Pass" to "DP",
        "Yuva" to "YU"
    )
    /*"Lower Berth", "LB"))
"Middle Berth", "MB"))
"Upper Berth", "UB"))
"Side Lower Berth", "SL"))
"Side Upper Berth", "SU"))
"Window Side", "WS"))
"Cabin", "CB"))
"Coupe", "CP"))
"Side Middle", "SM"))*/

    private val berthToCode = mapOf(
        "Lower Berth" to "LB",
        "Middle Berth" to "MB",
        "Upper Berth" to "UB",
        "Side Lower Berth" to "SL",
        "Side Upper Berth" to "SU",
        "Window Side" to "WS",
        "Cabin" to "CB",
        "Coupe" to "CP",
        "Side Middle" to "SM",
    )

    private val codeToBerth = mapOf(
        "LB" to "Lower Berth",
        "MB" to "Middle Berth",
        "UB" to "Upper Berth",
        "SL" to "Side Lower Berth",
        "SU" to "Side Upper Berth",
        "WS" to "Window Side",
        "CB" to "Cabin",
        "CP" to "Coupe",
        "SM" to "Side Middle",
    )

    fun dateFormatter(date: String): String {
        val day = date.subSequence(0, 2)
        val month = date.subSequence(3, 5)
        val year = date.subSequence(6, 10)
        return "$year$month$day"
    }

    fun estimatedHoursFormatter(hours: String): String {
        val hour = hours.subSequence(0, 2).toString()
        val minute = hours.subSequence(3, 5).toString()
        return "${hour}hrs ${minute}mins"
    }

    fun trainNameFormatter(trainName: String): String {
        val firstChar = trainName.subSequence(0, 1).toString().uppercase()
        val restChar = trainName.subSequence(1, trainName.length).toString().lowercase()
        return "${firstChar}${restChar}"
    }

    fun quotaCodeListToFullFormList(quotaList: List<String>): List<String> {
        val fullForm: MutableList<String> = mutableListOf()
        quotaList.forEach {
            quotaCodeToFullName[it]?.let { it1 -> fullForm.add(it1) }
        }
        fullForm.sort()
        return fullForm
    }

    fun getQuotaCode(quotaName: String): String {
        if (quotaFullNameToCode[quotaName] == null) {
            return ""
        }
        return quotaFullNameToCode[quotaName]!!
    }

//    fun getListForNotSelectedRecyclerView(seatTypeList: List<String>): List<RefreshListModel> {
//        val newList: MutableList<RefreshListModel> = mutableListOf()
//        seatTypeList.forEach {
//            val newModifyItem =
//                RefreshListModel(seatType = it, seatPrice = "", seatStatus = "", false)
//            newList.add(newModifyItem)
//        }
//        return newList
//    }

    fun getFullSeatTypeName(seatCode: String): String {
        if (fareClassCodeToFullForm[seatCode] == null) {
            return ""
        }
        return fareClassCodeToFullForm[seatCode]!!
    }

    fun getSeatTypeCode(seatTypeName: String): String {
        if (fareFullFormToClassCode[seatTypeName] == null) {
            return ""
        }
        return fareFullFormToClassCode[seatTypeName]!!
    }

    fun getCodeFromBerth(berth: String): String {
        if (berthToCode[berth] == null) {
            return ""
        }
        return berthToCode[berth]!!
    }

    fun getBerthFromCode(berthCode: String): String {
        if (codeToBerth[berthCode] == null) {
            return ""
        }
        return codeToBerth[berthCode]!!
    }


    fun getListForBerthFromCode(berthList: List<String>): List<String> {
        val newList: MutableList<String> = mutableListOf()
        berthList.forEach {
            val newModifyItem = getBerthFromCode(it)
            newList.add(newModifyItem)
        }
        return newList
    }
//    fun getListOfSeatOfFlag(listOfSeat : List<String>) : List<FlagSeatList> {
//        val newList :  MutableList<FlagSeatList> = mutableListOf()
//        listOfSeat.forEach {
//            val flagSeatList = FlagSeatList(seatType = it, selected = false)
//            newList.add(flagSeatList)
//        }
//        return newList
//    }

//    fun getListOfStationBtnEnq(listOfSeat : List<BoardingStation>) : List<String> {
//        val newList :  MutableList<String> = mutableListOf()
//        listOfSeat.forEach {
//            newList.add(it.stnNameCode)
//        }
//        return newList
//    }
    fun checkFlag(flag : String): Boolean {
        return flag == "Y"
    }

    fun daysNameOfWeek(inputDate: String): String? {
        val inFormat = SimpleDateFormat("dd-MM-yyyy")
        val date = inFormat.parse(inputDate)
        val outFormat = SimpleDateFormat("EEEE")
        return date?.let { outFormat.format(it) }
    }
    fun getMonthName(monthNo : Int):String?{
        return monthName[monthNo-1]
    }

    fun addDestinationStation(oldList : List<String>, station : String): List<String>{
        val newList = mutableListOf <String>()
        oldList.forEach {
            newList.add(it)
        }
        newList.add(station)
        return newList
    }
}