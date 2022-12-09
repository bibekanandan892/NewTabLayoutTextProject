package com.isu.newtablayouttextproject.utils

import androidx.lifecycle.ViewModel
object IrctcSdkConstants : ViewModel() {

    const val BOOKING_STATUS = "BOOKING_STATUS"
    const val PASSENGER_LIST = "PASSENGER_LIST"
    const val PNR = "PNR"
    const val BASE_URL = "https://irctceticketing-twdwtabx5q-el.a.run.app/irctc/"
    const val ELASTIC_SEARCH_URL =
        "https://b61295e3bdc84097ac04e0456792cac1.us-central1.gcp.cloud.es.io:9243/"
    const val AUTHORIZATION = "Basic ZWxhc3RpYzpUQWhJamJ4U2RzRzRRRDY3WWVmZTZQdzg="
    const val IRCTC_LOG = "IRCTC_LOG"
//    var trainList: List<TrainBtwnStns>? = null
    const val SourceStation = "SourceStation"
    const val DestinationStation = "DestinationStation"
    const val BookTicket = "Book Ticket"
    const val CheckPNRStatus = "Check PNR Status"
    const val CheckNow = "Check Now"
    const val SearchTrain = "Search Train"
    const val BookTrainTickets = "Book Train Tickets"
    const val CheckPNR = "Check PNR"
    const val trainNameFromPnr = "trainNameFromPnr"
    const val txtPNR = "txtPNR"
    const val dateOfJourneyPnr = "dateOfJourney"
    const val arrivalTimeDestinationPnr = "arrivalTimeDestination"
    const val journeyClassPnr = "journeyClass"
    const val quotaPnr = "quotaPnr"
    const val chartStatusPnr = "chartStatus"
    const val TRIGGER_AUTO_COMPLETE = 100
    const val Station = "Station"
    const val CancelTicket="Cancel Ticket"
    const val FetchDetails ="Fetch Details"
    const val ResendTicket ="Resend Ticket"
    var JDate = ""
    var jQuotaList = listOf<String>()
    var SourceStationCode: String = "SBP"
    var DestinationStationCode: String = "BBS"
    var SourceStationName: String = "SAMBALPUR"
    var DestinationStationName: String = "BHUBANESWAR"
    const val AUTO_COMPLETE_DELAY: Long = 1000
    var parentAdapterPosition: Int = -1
    const val TRAIN_NUMBER = " TRAIN_NUMBER"
    const val TRAIN_NAME = "TRAIN_NAME"
    const val TRAIN_QUOTA = "TRAIN_QUOTA"
    const val BOOKING_DATE = "BOOKING_DATE"
    const val DEPARTURE_TIME = "DEPARTURE_TIME"
    const val DEPARTURE_DATE = "DEPARTURE_DATE"
    const val DEPARTURE_STATION = "DEPARTURE_STATION"
    const val AVAILABILITY_STATUS = "AVAILABILITY_STATUS"
    const val DESTINATION_TIME = "DESTINATION_TIME"
    const val DESTINATION_STATION = "DESTINATION_STATION"
    const val DESTINATION_DATE = "DESTINATION_DATE"
    const val REMAINING_TIME = "REMAINING_TIME"
    const val FROM_STN_CODE = "FROM_STN_CODE"
    const val TO_STN_CODE = "TO_STN_CODE"
    const val J_DATE = "J_DATE"
    const val J_QUOTA = "J_QUOTA"
    const val J_CLASS = "J_CLASS"
    const val INSURANCE_OPTED = "INSURANCE_OPTED"
    const val MOBILE_NUMBER = "MOBILE_NUMBER"
    const val EMAIL = "EMAIL"
    const val LIST_OF_BERTH_TYPE = "LISTOFBERTHTYPE"
    const val TRIP_DURATION = "TRIP_DURATION"
    const val BOOKING_CLASS = "BOOKING_CLASS"
    const val BOOKING_ID = "BOOKING_ID"

    var dataToServices: String? = null

    var userName = "AndroidTest2"

    const val PAYMENT_BASE_URL = "https://apidev.iserveu.online/"
    const val PAYMENT_BASE_URL_PROD = "https://indusindtest.iserveu.online/"
    const val token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBbmRyb2lkdGVzdDIiLCJhdWRpZW5jZSI6Im1vYmlsZSIsImNyZWF0ZWQiOjE2Njk4ODk5MzE3NTgsImV4cCI6MTY2OTg5MzUzMX0.SPa5y6sV598tae6AVuY-ypmtlCQUMeKGCguHQH5H0z7V84F660BOFkJxQQHawM-yehzwPn7Wby6oIHVhgDOagw"
    const val client_id = "k68CwEGSUZF5IrtAwKTYkPNf6CmtANo1tqNMpouZD1DBEGV0"
    const val client_secret = "dW7waLMDh3aIoBi1UJBmSwAySzTiawk7W6q2AAJjbzuQuyuTno2ASuCXzhlAGQ7o"
    var amount = "1"
//    var bookingApiResponse: BookingApiResponse? = null
//
//    var passengerListItem: MutableList<PassengerListItem> =
//        mutableListOf()
//
//    var passengerList : List<com.isu.irctc.ticketbooking.model.pnrnumber.res.PassengerListItem>? = null
//    var passengerListBookingDetails : List<PsgnDtl>? = null

    var clientId:String = ""
    var clientSecret:String= ""
    var agentUN:String = ""
    var apiUserName:String = ""
    var skipReceipt:Boolean = false
    var dateForAvailable : String = ""
    var selectedMonth : String = ""
    var selectedDate : String = ""

    const val PREFS_TOKEN_FILE= "PREFS_TOKEN_FILE"
    const val IRCTC_ID = "IRCTC_ID"
    var dayName : String = ""
    var dateAndTime : String = ""



}